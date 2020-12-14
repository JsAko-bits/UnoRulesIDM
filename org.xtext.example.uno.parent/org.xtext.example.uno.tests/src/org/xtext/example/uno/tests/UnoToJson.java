package org.xtext.example.uno.tests;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;

import org.xtext.example.uno.myDsl.Model;
import org.xtext.example.uno.myDsl.Regle;
import org.xtext.example.uno.myDsl.Rule;

import org.json.*;

public class UnoToJson {

	
private Model model;
	
	public UnoToJson(Model model) {
		this.model = model;
	}
	
	
	private String penalite(String joueurs) {
		
		String pInversion = "Changer de sens";
		if (joueurs == "Deux") pInversion = "Rejouer";
		
		return pInversion;
	}
	
	public void transform() throws JSONException, IOException {
		JSONObject obj = new JSONObject();
		Rule r = model.getRules().get(0);
		String objectif = r.getObjectif().getName();
		String nbreJoueurs = r.getJoueur().toString();
		Collection<Regle> regles = r.getRegle();
		
		obj.put("Objectif", objectif);
		obj.put("Deroulement", new JSONArray(regles));
		obj.put("Joueurs", nbreJoueurs);
		obj.put("Penalite", new JSONObject().put("Panlite Inversion", penalite(nbreJoueurs)));
		
		String JSON_OUTPUT = "rules.json";
		FileWriter f = new FileWriter(JSON_OUTPUT);
		obj.write(f);
		f.flush();
		f.close();
		
	}
	
}
