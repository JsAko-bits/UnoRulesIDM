package org.xtext.example.uno.tests;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.uno.myDsl.Model;
import org.xtext.example.uno.myDsl.Regle;
import org.xtext.example.uno.myDsl.Rule;

public class UnoGenerator {

	private Model model;
	
	public UnoGenerator(Model model) {
		this.model = model;
	}
	
	private String regles(Collection<Regle> r) {
		
		String reg = "";
		
		for(Regle regle: r) {
			reg+= regle.getName()+", ";
		}
		
		return reg;
	}
	
	private String manche(String objectif) {
		String une = "Une manche";
		String plus = "Plusieurs manche jusqu'� ce qu'il reste un joueur en "
				+ "�liminant les joueurs ayant comptabilis� 500 points";
		
		if (objectif == "Classique") return une;
		else return plus;
	}
	
	private String penalite(String joueurs) {
		
		String pInversion = "Changer de sens";
		if (joueurs == "Deux") pInversion = "Rejouer";
		
		return pInversion;
	}
	
	public String generate() {
		Rule r = model.getRules().get(0);
		String objectif = r.getObjectif().getName();
		String nbreJoueurs = r.getJoueur().toString();
		Collection<Regle> regles = r.getRegle();
		
		String unoRegle = " Uno est un jeu de cartes contenant 108 cartes dont des \n"
				+ "cartes sp�ciales comme +2, +4, Inversion,... \n"
				+ "Selon vos choix, l'objectif de cette partie est de : "+objectif+". \n"+
				"Il y aura "+manche(objectif)+". \n"+
				"Cette partie se d�roulera � "+ nbreJoueurs+". \n"+
				"Etant donn� que vous jouez � "+ nbreJoueurs+", la cons�quence de la carte"
						+ "Inversion sera : "+ penalite(nbreJoueurs)+". \n"+
				"Les possibilit�s de jeu durant la partie seront : \n"+ regles(regles)+"\n "
						+ " BONNE PARTIE !!!!!!!!!";
		
		return unoRegle;
	}
}
