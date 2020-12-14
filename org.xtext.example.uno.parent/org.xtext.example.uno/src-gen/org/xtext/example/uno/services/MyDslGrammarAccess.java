/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.uno.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.uno.MyDsl.Model");
		private final Assignment cRulesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cRulesRuleParserRuleCall_0 = (RuleCall)cRulesAssignment.eContents().get(0);
		
		//Model:
		//	rules+=Rule*;
		@Override public ParserRule getRule() { return rule; }
		
		//rules+=Rule*
		public Assignment getRulesAssignment() { return cRulesAssignment; }
		
		//Rule
		public RuleCall getRulesRuleParserRuleCall_0() { return cRulesRuleParserRuleCall_0; }
	}
	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.uno.MyDsl.Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjectifKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cObjectifAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cObjectifObjectifEnumRuleCall_1_0 = (RuleCall)cObjectifAssignment_1.eContents().get(0);
		private final Assignment cJoueurAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cJoueurJoueurEnumRuleCall_2_0 = (RuleCall)cJoueurAssignment_2.eContents().get(0);
		private final Keyword cJoueursKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRGlementKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cRegleAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cRegleRegleEnumRuleCall_5_0 = (RuleCall)cRegleAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Rule:
		//	'Objectif: ' objectif=Objectif
		//	joueur=Joueur 'joueurs'
		//	'R�glement {'
		//	regle+=Regle+
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Objectif: ' objectif=Objectif joueur=Joueur 'joueurs' 'R�glement {' regle+=Regle+ '}'
		public Group getGroup() { return cGroup; }
		
		//'Objectif: '
		public Keyword getObjectifKeyword_0() { return cObjectifKeyword_0; }
		
		//objectif=Objectif
		public Assignment getObjectifAssignment_1() { return cObjectifAssignment_1; }
		
		//Objectif
		public RuleCall getObjectifObjectifEnumRuleCall_1_0() { return cObjectifObjectifEnumRuleCall_1_0; }
		
		//joueur=Joueur
		public Assignment getJoueurAssignment_2() { return cJoueurAssignment_2; }
		
		//Joueur
		public RuleCall getJoueurJoueurEnumRuleCall_2_0() { return cJoueurJoueurEnumRuleCall_2_0; }
		
		//'joueurs'
		public Keyword getJoueursKeyword_3() { return cJoueursKeyword_3; }
		
		//'R�glement {'
		public Keyword getRGlementKeyword_4() { return cRGlementKeyword_4; }
		
		//regle+=Regle+
		public Assignment getRegleAssignment_5() { return cRegleAssignment_5; }
		
		//Regle
		public RuleCall getRegleRegleEnumRuleCall_5_0() { return cRegleRegleEnumRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	
	public class ObjectifElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.uno.MyDsl.Objectif");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cUnoChallengeEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cUnoChallengeUnoChallengeKeyword_0_0 = (Keyword)cUnoChallengeEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cClassiqueEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cClassiqueClassiqueKeyword_1_0 = (Keyword)cClassiqueEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Objectif:
		//	UnoChallenge='Uno Challenge' | Classique;
		public EnumRule getRule() { return rule; }
		
		//UnoChallenge='Uno Challenge' | Classique
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//UnoChallenge='Uno Challenge'
		public EnumLiteralDeclaration getUnoChallengeEnumLiteralDeclaration_0() { return cUnoChallengeEnumLiteralDeclaration_0; }
		
		//'Uno Challenge'
		public Keyword getUnoChallengeUnoChallengeKeyword_0_0() { return cUnoChallengeUnoChallengeKeyword_0_0; }
		
		//Classique
		public EnumLiteralDeclaration getClassiqueEnumLiteralDeclaration_1() { return cClassiqueEnumLiteralDeclaration_1; }
		
		//'Classique'
		public Keyword getClassiqueClassiqueKeyword_1_0() { return cClassiqueClassiqueKeyword_1_0; }
	}
	public class RegleElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.uno.MyDsl.Regle");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cBasiqueEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cBasiqueJouerUneCarteMMeCouleurOuMMeNombreKeyword_0_0 = (Keyword)cBasiqueEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cCarteIdentiqueEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cCarteIdentiquePossibilitDeJouer2CartesIdentiquesSimultanMentKeyword_1_0 = (Keyword)cCarteIdentiqueEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSuiteEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSuitePossibilitDeJouerImmDiatementUneCarteDeMMeCouleurKeyword_2_0 = (Keyword)cSuiteEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cCumulEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cCumulPossibilitDeCumulerLaCarte2Keyword_3_0 = (Keyword)cCumulEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum Regle:
		//	Basique='Jouer une carte m�me couleur ou m�me nombre' |
		//	CarteIdentique='Possibilit� de jouer 2 cartes identiques simultan�ment' |
		//	Suite='Possibilit� de jouer imm�diatement une carte de m�me couleur' |
		//	Cumul='Possibilit� de cumuler la carte +2';
		public EnumRule getRule() { return rule; }
		
		//Basique='Jouer une carte m�me couleur ou m�me nombre' |
		//CarteIdentique='Possibilit� de jouer 2 cartes identiques simultan�ment' |
		//Suite='Possibilit� de jouer imm�diatement une carte de m�me couleur' | Cumul='Possibilit� de cumuler la carte +2'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Basique='Jouer une carte m�me couleur ou m�me nombre'
		public EnumLiteralDeclaration getBasiqueEnumLiteralDeclaration_0() { return cBasiqueEnumLiteralDeclaration_0; }
		
		//'Jouer une carte m�me couleur ou m�me nombre'
		public Keyword getBasiqueJouerUneCarteMMeCouleurOuMMeNombreKeyword_0_0() { return cBasiqueJouerUneCarteMMeCouleurOuMMeNombreKeyword_0_0; }
		
		//CarteIdentique='Possibilit� de jouer 2 cartes identiques simultan�ment'
		public EnumLiteralDeclaration getCarteIdentiqueEnumLiteralDeclaration_1() { return cCarteIdentiqueEnumLiteralDeclaration_1; }
		
		//'Possibilit� de jouer 2 cartes identiques simultan�ment'
		public Keyword getCarteIdentiquePossibilitDeJouer2CartesIdentiquesSimultanMentKeyword_1_0() { return cCarteIdentiquePossibilitDeJouer2CartesIdentiquesSimultanMentKeyword_1_0; }
		
		//Suite='Possibilit� de jouer imm�diatement une carte de m�me couleur'
		public EnumLiteralDeclaration getSuiteEnumLiteralDeclaration_2() { return cSuiteEnumLiteralDeclaration_2; }
		
		//'Possibilit� de jouer imm�diatement une carte de m�me couleur'
		public Keyword getSuitePossibilitDeJouerImmDiatementUneCarteDeMMeCouleurKeyword_2_0() { return cSuitePossibilitDeJouerImmDiatementUneCarteDeMMeCouleurKeyword_2_0; }
		
		//Cumul='Possibilit� de cumuler la carte +2'
		public EnumLiteralDeclaration getCumulEnumLiteralDeclaration_3() { return cCumulEnumLiteralDeclaration_3; }
		
		//'Possibilit� de cumuler la carte +2'
		public Keyword getCumulPossibilitDeCumulerLaCarte2Keyword_3_0() { return cCumulPossibilitDeCumulerLaCarte2Keyword_3_0; }
	}
	public class JoueurElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.uno.MyDsl.Joueur");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDeuxEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDeux2Keyword_0_0 = (Keyword)cDeuxEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cPlusDeuxEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cPlusDeuxPlusDeDeuxKeyword_1_0 = (Keyword)cPlusDeuxEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Joueur:
		//	Deux='2' | PlusDeux='Plus de deux';
		public EnumRule getRule() { return rule; }
		
		//Deux='2' | PlusDeux='Plus de deux'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Deux='2'
		public EnumLiteralDeclaration getDeuxEnumLiteralDeclaration_0() { return cDeuxEnumLiteralDeclaration_0; }
		
		//'2'
		public Keyword getDeux2Keyword_0_0() { return cDeux2Keyword_0_0; }
		
		//PlusDeux='Plus de deux'
		public EnumLiteralDeclaration getPlusDeuxEnumLiteralDeclaration_1() { return cPlusDeuxEnumLiteralDeclaration_1; }
		
		//'Plus de deux'
		public Keyword getPlusDeuxPlusDeDeuxKeyword_1_0() { return cPlusDeuxPlusDeDeuxKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final RuleElements pRule;
	private final ObjectifElements eObjectif;
	private final RegleElements eRegle;
	private final JoueurElements eJoueur;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pRule = new RuleElements();
		this.eObjectif = new ObjectifElements();
		this.eRegle = new RegleElements();
		this.eJoueur = new JoueurElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.uno.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	rules+=Rule*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Rule:
	//	'Objectif: ' objectif=Objectif
	//	joueur=Joueur 'joueurs'
	//	'R�glement {'
	//	regle+=Regle+
	//	'}';
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}
	
	//enum Objectif:
	//	UnoChallenge='Uno Challenge' | Classique;
	public ObjectifElements getObjectifAccess() {
		return eObjectif;
	}
	
	public EnumRule getObjectifRule() {
		return getObjectifAccess().getRule();
	}
	
	//enum Regle:
	//	Basique='Jouer une carte m�me couleur ou m�me nombre' |
	//	CarteIdentique='Possibilit� de jouer 2 cartes identiques simultan�ment' |
	//	Suite='Possibilit� de jouer imm�diatement une carte de m�me couleur' |
	//	Cumul='Possibilit� de cumuler la carte +2';
	public RegleElements getRegleAccess() {
		return eRegle;
	}
	
	public EnumRule getRegleRule() {
		return getRegleAccess().getRule();
	}
	
	//enum Joueur:
	//	Deux='2' | PlusDeux='Plus de deux';
	public JoueurElements getJoueurAccess() {
		return eJoueur;
	}
	
	public EnumRule getJoueurRule() {
		return getJoueurAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
