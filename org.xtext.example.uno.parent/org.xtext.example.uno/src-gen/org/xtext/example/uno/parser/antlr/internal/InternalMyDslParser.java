package org.xtext.example.uno.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.uno.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Objectif: '", "'joueurs'", "'R\\u00E8glement {'", "'}'", "'Uno Challenge'", "'Classique'", "'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre'", "'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment'", "'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur'", "'Possibilit\\u00E9 de cumuler la carte +2'", "'2'", "'Plus de deux'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_rules_0_0= ruleRule ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( (lv_rules_0_0= ruleRule ) )* )
            // InternalMyDsl.g:79:2: ( (lv_rules_0_0= ruleRule ) )*
            {
            // InternalMyDsl.g:79:2: ( (lv_rules_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:3: (lv_rules_0_0= ruleRule )
            	    {
            	    // InternalMyDsl.g:80:3: (lv_rules_0_0= ruleRule )
            	    // InternalMyDsl.g:81:4: lv_rules_0_0= ruleRule
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_rules_0_0=ruleRule();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"rules",
            	    					lv_rules_0_0,
            	    					"org.xtext.example.uno.MyDsl.Rule");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:101:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalMyDsl.g:101:45: (iv_ruleRule= ruleRule EOF )
            // InternalMyDsl.g:102:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:108:1: ruleRule returns [EObject current=null] : (otherlv_0= 'Objectif: ' ( (lv_objectif_1_0= ruleObjectif ) ) ( (lv_joueur_2_0= ruleJoueur ) ) otherlv_3= 'joueurs' otherlv_4= 'R\\u00E8glement {' ( (lv_regle_5_0= ruleRegle ) )+ otherlv_6= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_objectif_1_0 = null;

        Enumerator lv_joueur_2_0 = null;

        Enumerator lv_regle_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:114:2: ( (otherlv_0= 'Objectif: ' ( (lv_objectif_1_0= ruleObjectif ) ) ( (lv_joueur_2_0= ruleJoueur ) ) otherlv_3= 'joueurs' otherlv_4= 'R\\u00E8glement {' ( (lv_regle_5_0= ruleRegle ) )+ otherlv_6= '}' ) )
            // InternalMyDsl.g:115:2: (otherlv_0= 'Objectif: ' ( (lv_objectif_1_0= ruleObjectif ) ) ( (lv_joueur_2_0= ruleJoueur ) ) otherlv_3= 'joueurs' otherlv_4= 'R\\u00E8glement {' ( (lv_regle_5_0= ruleRegle ) )+ otherlv_6= '}' )
            {
            // InternalMyDsl.g:115:2: (otherlv_0= 'Objectif: ' ( (lv_objectif_1_0= ruleObjectif ) ) ( (lv_joueur_2_0= ruleJoueur ) ) otherlv_3= 'joueurs' otherlv_4= 'R\\u00E8glement {' ( (lv_regle_5_0= ruleRegle ) )+ otherlv_6= '}' )
            // InternalMyDsl.g:116:3: otherlv_0= 'Objectif: ' ( (lv_objectif_1_0= ruleObjectif ) ) ( (lv_joueur_2_0= ruleJoueur ) ) otherlv_3= 'joueurs' otherlv_4= 'R\\u00E8glement {' ( (lv_regle_5_0= ruleRegle ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getObjectifKeyword_0());
            		
            // InternalMyDsl.g:120:3: ( (lv_objectif_1_0= ruleObjectif ) )
            // InternalMyDsl.g:121:4: (lv_objectif_1_0= ruleObjectif )
            {
            // InternalMyDsl.g:121:4: (lv_objectif_1_0= ruleObjectif )
            // InternalMyDsl.g:122:5: lv_objectif_1_0= ruleObjectif
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getObjectifObjectifEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_objectif_1_0=ruleObjectif();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"objectif",
            						lv_objectif_1_0,
            						"org.xtext.example.uno.MyDsl.Objectif");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:139:3: ( (lv_joueur_2_0= ruleJoueur ) )
            // InternalMyDsl.g:140:4: (lv_joueur_2_0= ruleJoueur )
            {
            // InternalMyDsl.g:140:4: (lv_joueur_2_0= ruleJoueur )
            // InternalMyDsl.g:141:5: lv_joueur_2_0= ruleJoueur
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getJoueurJoueurEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_joueur_2_0=ruleJoueur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"joueur",
            						lv_joueur_2_0,
            						"org.xtext.example.uno.MyDsl.Joueur");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getJoueursKeyword_3());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRGlementKeyword_4());
            		
            // InternalMyDsl.g:166:3: ( (lv_regle_5_0= ruleRegle ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=20)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:167:4: (lv_regle_5_0= ruleRegle )
            	    {
            	    // InternalMyDsl.g:167:4: (lv_regle_5_0= ruleRegle )
            	    // InternalMyDsl.g:168:5: lv_regle_5_0= ruleRegle
            	    {

            	    					newCompositeNode(grammarAccess.getRuleAccess().getRegleRegleEnumRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_regle_5_0=ruleRegle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleRule());
            	    					}
            	    					add(
            	    						current,
            	    						"regle",
            	    						lv_regle_5_0,
            	    						"org.xtext.example.uno.MyDsl.Regle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "ruleObjectif"
    // InternalMyDsl.g:193:1: ruleObjectif returns [Enumerator current=null] : ( (enumLiteral_0= 'Uno Challenge' ) | (enumLiteral_1= 'Classique' ) ) ;
    public final Enumerator ruleObjectif() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:199:2: ( ( (enumLiteral_0= 'Uno Challenge' ) | (enumLiteral_1= 'Classique' ) ) )
            // InternalMyDsl.g:200:2: ( (enumLiteral_0= 'Uno Challenge' ) | (enumLiteral_1= 'Classique' ) )
            {
            // InternalMyDsl.g:200:2: ( (enumLiteral_0= 'Uno Challenge' ) | (enumLiteral_1= 'Classique' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:201:3: (enumLiteral_0= 'Uno Challenge' )
                    {
                    // InternalMyDsl.g:201:3: (enumLiteral_0= 'Uno Challenge' )
                    // InternalMyDsl.g:202:4: enumLiteral_0= 'Uno Challenge'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getObjectifAccess().getUnoChallengeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getObjectifAccess().getUnoChallengeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:209:3: (enumLiteral_1= 'Classique' )
                    {
                    // InternalMyDsl.g:209:3: (enumLiteral_1= 'Classique' )
                    // InternalMyDsl.g:210:4: enumLiteral_1= 'Classique'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getObjectifAccess().getClassiqueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getObjectifAccess().getClassiqueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObjectif"


    // $ANTLR start "ruleRegle"
    // InternalMyDsl.g:220:1: ruleRegle returns [Enumerator current=null] : ( (enumLiteral_0= 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' ) | (enumLiteral_1= 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' ) | (enumLiteral_2= 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' ) | (enumLiteral_3= 'Possibilit\\u00E9 de cumuler la carte +2' ) ) ;
    public final Enumerator ruleRegle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:226:2: ( ( (enumLiteral_0= 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' ) | (enumLiteral_1= 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' ) | (enumLiteral_2= 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' ) | (enumLiteral_3= 'Possibilit\\u00E9 de cumuler la carte +2' ) ) )
            // InternalMyDsl.g:227:2: ( (enumLiteral_0= 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' ) | (enumLiteral_1= 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' ) | (enumLiteral_2= 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' ) | (enumLiteral_3= 'Possibilit\\u00E9 de cumuler la carte +2' ) )
            {
            // InternalMyDsl.g:227:2: ( (enumLiteral_0= 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' ) | (enumLiteral_1= 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' ) | (enumLiteral_2= 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' ) | (enumLiteral_3= 'Possibilit\\u00E9 de cumuler la carte +2' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:228:3: (enumLiteral_0= 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' )
                    {
                    // InternalMyDsl.g:228:3: (enumLiteral_0= 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' )
                    // InternalMyDsl.g:229:4: enumLiteral_0= 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getRegleAccess().getBasiqueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRegleAccess().getBasiqueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:236:3: (enumLiteral_1= 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' )
                    {
                    // InternalMyDsl.g:236:3: (enumLiteral_1= 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' )
                    // InternalMyDsl.g:237:4: enumLiteral_1= 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment'
                    {
                    enumLiteral_1=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getRegleAccess().getCarteIdentiqueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRegleAccess().getCarteIdentiqueEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:244:3: (enumLiteral_2= 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' )
                    {
                    // InternalMyDsl.g:244:3: (enumLiteral_2= 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' )
                    // InternalMyDsl.g:245:4: enumLiteral_2= 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getRegleAccess().getSuiteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRegleAccess().getSuiteEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:252:3: (enumLiteral_3= 'Possibilit\\u00E9 de cumuler la carte +2' )
                    {
                    // InternalMyDsl.g:252:3: (enumLiteral_3= 'Possibilit\\u00E9 de cumuler la carte +2' )
                    // InternalMyDsl.g:253:4: enumLiteral_3= 'Possibilit\\u00E9 de cumuler la carte +2'
                    {
                    enumLiteral_3=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getRegleAccess().getCumulEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRegleAccess().getCumulEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegle"


    // $ANTLR start "ruleJoueur"
    // InternalMyDsl.g:263:1: ruleJoueur returns [Enumerator current=null] : ( (enumLiteral_0= '2' ) | (enumLiteral_1= 'Plus de deux' ) ) ;
    public final Enumerator ruleJoueur() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:269:2: ( ( (enumLiteral_0= '2' ) | (enumLiteral_1= 'Plus de deux' ) ) )
            // InternalMyDsl.g:270:2: ( (enumLiteral_0= '2' ) | (enumLiteral_1= 'Plus de deux' ) )
            {
            // InternalMyDsl.g:270:2: ( (enumLiteral_0= '2' ) | (enumLiteral_1= 'Plus de deux' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:271:3: (enumLiteral_0= '2' )
                    {
                    // InternalMyDsl.g:271:3: (enumLiteral_0= '2' )
                    // InternalMyDsl.g:272:4: enumLiteral_0= '2'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getJoueurAccess().getDeuxEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJoueurAccess().getDeuxEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:279:3: (enumLiteral_1= 'Plus de deux' )
                    {
                    // InternalMyDsl.g:279:3: (enumLiteral_1= 'Plus de deux' )
                    // InternalMyDsl.g:280:4: enumLiteral_1= 'Plus de deux'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getJoueurAccess().getPlusDeuxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJoueurAccess().getPlusDeuxEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoueur"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001E4000L});

}