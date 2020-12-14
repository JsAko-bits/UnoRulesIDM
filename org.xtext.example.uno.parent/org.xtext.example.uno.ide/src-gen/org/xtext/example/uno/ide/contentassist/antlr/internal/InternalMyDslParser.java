package org.xtext.example.uno.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.uno.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Uno Challenge'", "'Classique'", "'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre'", "'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment'", "'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur'", "'Possibilit\\u00E9 de cumuler la carte +2'", "'2'", "'Plus de deux'", "'Objectif: '", "'joueurs'", "'R\\u00E8glement {'", "'}'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__RulesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__RulesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__RulesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__RulesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__RulesAssignment )*
            {
             before(grammarAccess.getModelAccess().getRulesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__RulesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__RulesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__RulesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRulesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // InternalMyDsl.g:78:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleRule EOF )
            // InternalMyDsl.g:80:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalMyDsl.g:87:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Rule__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Rule__Group__0 )
            // InternalMyDsl.g:94:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "ruleObjectif"
    // InternalMyDsl.g:103:1: ruleObjectif : ( ( rule__Objectif__Alternatives ) ) ;
    public final void ruleObjectif() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:107:1: ( ( ( rule__Objectif__Alternatives ) ) )
            // InternalMyDsl.g:108:2: ( ( rule__Objectif__Alternatives ) )
            {
            // InternalMyDsl.g:108:2: ( ( rule__Objectif__Alternatives ) )
            // InternalMyDsl.g:109:3: ( rule__Objectif__Alternatives )
            {
             before(grammarAccess.getObjectifAccess().getAlternatives()); 
            // InternalMyDsl.g:110:3: ( rule__Objectif__Alternatives )
            // InternalMyDsl.g:110:4: rule__Objectif__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Objectif__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getObjectifAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectif"


    // $ANTLR start "ruleRegle"
    // InternalMyDsl.g:119:1: ruleRegle : ( ( rule__Regle__Alternatives ) ) ;
    public final void ruleRegle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:123:1: ( ( ( rule__Regle__Alternatives ) ) )
            // InternalMyDsl.g:124:2: ( ( rule__Regle__Alternatives ) )
            {
            // InternalMyDsl.g:124:2: ( ( rule__Regle__Alternatives ) )
            // InternalMyDsl.g:125:3: ( rule__Regle__Alternatives )
            {
             before(grammarAccess.getRegleAccess().getAlternatives()); 
            // InternalMyDsl.g:126:3: ( rule__Regle__Alternatives )
            // InternalMyDsl.g:126:4: rule__Regle__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Regle__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRegleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegle"


    // $ANTLR start "ruleJoueur"
    // InternalMyDsl.g:135:1: ruleJoueur : ( ( rule__Joueur__Alternatives ) ) ;
    public final void ruleJoueur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:139:1: ( ( ( rule__Joueur__Alternatives ) ) )
            // InternalMyDsl.g:140:2: ( ( rule__Joueur__Alternatives ) )
            {
            // InternalMyDsl.g:140:2: ( ( rule__Joueur__Alternatives ) )
            // InternalMyDsl.g:141:3: ( rule__Joueur__Alternatives )
            {
             before(grammarAccess.getJoueurAccess().getAlternatives()); 
            // InternalMyDsl.g:142:3: ( rule__Joueur__Alternatives )
            // InternalMyDsl.g:142:4: rule__Joueur__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Joueur__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJoueurAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoueur"


    // $ANTLR start "rule__Objectif__Alternatives"
    // InternalMyDsl.g:150:1: rule__Objectif__Alternatives : ( ( ( 'Uno Challenge' ) ) | ( ( 'Classique' ) ) );
    public final void rule__Objectif__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:154:1: ( ( ( 'Uno Challenge' ) ) | ( ( 'Classique' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:155:2: ( ( 'Uno Challenge' ) )
                    {
                    // InternalMyDsl.g:155:2: ( ( 'Uno Challenge' ) )
                    // InternalMyDsl.g:156:3: ( 'Uno Challenge' )
                    {
                     before(grammarAccess.getObjectifAccess().getUnoChallengeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:157:3: ( 'Uno Challenge' )
                    // InternalMyDsl.g:157:4: 'Uno Challenge'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getObjectifAccess().getUnoChallengeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:161:2: ( ( 'Classique' ) )
                    {
                    // InternalMyDsl.g:161:2: ( ( 'Classique' ) )
                    // InternalMyDsl.g:162:3: ( 'Classique' )
                    {
                     before(grammarAccess.getObjectifAccess().getClassiqueEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:163:3: ( 'Classique' )
                    // InternalMyDsl.g:163:4: 'Classique'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getObjectifAccess().getClassiqueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Objectif__Alternatives"


    // $ANTLR start "rule__Regle__Alternatives"
    // InternalMyDsl.g:171:1: rule__Regle__Alternatives : ( ( ( 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' ) ) | ( ( 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' ) ) | ( ( 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' ) ) | ( ( 'Possibilit\\u00E9 de cumuler la carte +2' ) ) );
    public final void rule__Regle__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:175:1: ( ( ( 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' ) ) | ( ( 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' ) ) | ( ( 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' ) ) | ( ( 'Possibilit\\u00E9 de cumuler la carte +2' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:176:2: ( ( 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' ) )
                    {
                    // InternalMyDsl.g:176:2: ( ( 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' ) )
                    // InternalMyDsl.g:177:3: ( 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' )
                    {
                     before(grammarAccess.getRegleAccess().getBasiqueEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:178:3: ( 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre' )
                    // InternalMyDsl.g:178:4: 'Jouer une carte m\\u00EAme couleur ou m\\u00EAme nombre'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegleAccess().getBasiqueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:182:2: ( ( 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' ) )
                    {
                    // InternalMyDsl.g:182:2: ( ( 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' ) )
                    // InternalMyDsl.g:183:3: ( 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' )
                    {
                     before(grammarAccess.getRegleAccess().getCarteIdentiqueEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:184:3: ( 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment' )
                    // InternalMyDsl.g:184:4: 'Possibilit\\u00E9 de jouer 2 cartes identiques simultan\\u00E9ment'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegleAccess().getCarteIdentiqueEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:188:2: ( ( 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' ) )
                    {
                    // InternalMyDsl.g:188:2: ( ( 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' ) )
                    // InternalMyDsl.g:189:3: ( 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' )
                    {
                     before(grammarAccess.getRegleAccess().getSuiteEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:190:3: ( 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur' )
                    // InternalMyDsl.g:190:4: 'Possibilit\\u00E9 de jouer imm\\u00E9diatement une carte de m\\u00EAme couleur'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegleAccess().getSuiteEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:194:2: ( ( 'Possibilit\\u00E9 de cumuler la carte +2' ) )
                    {
                    // InternalMyDsl.g:194:2: ( ( 'Possibilit\\u00E9 de cumuler la carte +2' ) )
                    // InternalMyDsl.g:195:3: ( 'Possibilit\\u00E9 de cumuler la carte +2' )
                    {
                     before(grammarAccess.getRegleAccess().getCumulEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:196:3: ( 'Possibilit\\u00E9 de cumuler la carte +2' )
                    // InternalMyDsl.g:196:4: 'Possibilit\\u00E9 de cumuler la carte +2'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getRegleAccess().getCumulEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Regle__Alternatives"


    // $ANTLR start "rule__Joueur__Alternatives"
    // InternalMyDsl.g:204:1: rule__Joueur__Alternatives : ( ( ( '2' ) ) | ( ( 'Plus de deux' ) ) );
    public final void rule__Joueur__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:208:1: ( ( ( '2' ) ) | ( ( 'Plus de deux' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:209:2: ( ( '2' ) )
                    {
                    // InternalMyDsl.g:209:2: ( ( '2' ) )
                    // InternalMyDsl.g:210:3: ( '2' )
                    {
                     before(grammarAccess.getJoueurAccess().getDeuxEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:211:3: ( '2' )
                    // InternalMyDsl.g:211:4: '2'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoueurAccess().getDeuxEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:215:2: ( ( 'Plus de deux' ) )
                    {
                    // InternalMyDsl.g:215:2: ( ( 'Plus de deux' ) )
                    // InternalMyDsl.g:216:3: ( 'Plus de deux' )
                    {
                     before(grammarAccess.getJoueurAccess().getPlusDeuxEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:217:3: ( 'Plus de deux' )
                    // InternalMyDsl.g:217:4: 'Plus de deux'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoueurAccess().getPlusDeuxEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Joueur__Alternatives"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalMyDsl.g:225:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:229:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalMyDsl.g:230:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalMyDsl.g:237:1: rule__Rule__Group__0__Impl : ( 'Objectif: ' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:1: ( ( 'Objectif: ' ) )
            // InternalMyDsl.g:242:1: ( 'Objectif: ' )
            {
            // InternalMyDsl.g:242:1: ( 'Objectif: ' )
            // InternalMyDsl.g:243:2: 'Objectif: '
            {
             before(grammarAccess.getRuleAccess().getObjectifKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getObjectifKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalMyDsl.g:252:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalMyDsl.g:257:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalMyDsl.g:264:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ObjectifAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:268:1: ( ( ( rule__Rule__ObjectifAssignment_1 ) ) )
            // InternalMyDsl.g:269:1: ( ( rule__Rule__ObjectifAssignment_1 ) )
            {
            // InternalMyDsl.g:269:1: ( ( rule__Rule__ObjectifAssignment_1 ) )
            // InternalMyDsl.g:270:2: ( rule__Rule__ObjectifAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getObjectifAssignment_1()); 
            // InternalMyDsl.g:271:2: ( rule__Rule__ObjectifAssignment_1 )
            // InternalMyDsl.g:271:3: rule__Rule__ObjectifAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ObjectifAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getObjectifAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalMyDsl.g:279:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalMyDsl.g:284:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalMyDsl.g:291:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__JoueurAssignment_2 ) ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:295:1: ( ( ( rule__Rule__JoueurAssignment_2 ) ) )
            // InternalMyDsl.g:296:1: ( ( rule__Rule__JoueurAssignment_2 ) )
            {
            // InternalMyDsl.g:296:1: ( ( rule__Rule__JoueurAssignment_2 ) )
            // InternalMyDsl.g:297:2: ( rule__Rule__JoueurAssignment_2 )
            {
             before(grammarAccess.getRuleAccess().getJoueurAssignment_2()); 
            // InternalMyDsl.g:298:2: ( rule__Rule__JoueurAssignment_2 )
            // InternalMyDsl.g:298:3: rule__Rule__JoueurAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rule__JoueurAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getJoueurAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalMyDsl.g:306:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalMyDsl.g:311:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalMyDsl.g:318:1: rule__Rule__Group__3__Impl : ( 'joueurs' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:322:1: ( ( 'joueurs' ) )
            // InternalMyDsl.g:323:1: ( 'joueurs' )
            {
            // InternalMyDsl.g:323:1: ( 'joueurs' )
            // InternalMyDsl.g:324:2: 'joueurs'
            {
             before(grammarAccess.getRuleAccess().getJoueursKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getJoueursKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalMyDsl.g:333:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalMyDsl.g:338:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalMyDsl.g:345:1: rule__Rule__Group__4__Impl : ( 'R\\u00E8glement {' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( 'R\\u00E8glement {' ) )
            // InternalMyDsl.g:350:1: ( 'R\\u00E8glement {' )
            {
            // InternalMyDsl.g:350:1: ( 'R\\u00E8glement {' )
            // InternalMyDsl.g:351:2: 'R\\u00E8glement {'
            {
             before(grammarAccess.getRuleAccess().getRGlementKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRGlementKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalMyDsl.g:360:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalMyDsl.g:365:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalMyDsl.g:372:1: rule__Rule__Group__5__Impl : ( ( ( rule__Rule__RegleAssignment_5 ) ) ( ( rule__Rule__RegleAssignment_5 )* ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:376:1: ( ( ( ( rule__Rule__RegleAssignment_5 ) ) ( ( rule__Rule__RegleAssignment_5 )* ) ) )
            // InternalMyDsl.g:377:1: ( ( ( rule__Rule__RegleAssignment_5 ) ) ( ( rule__Rule__RegleAssignment_5 )* ) )
            {
            // InternalMyDsl.g:377:1: ( ( ( rule__Rule__RegleAssignment_5 ) ) ( ( rule__Rule__RegleAssignment_5 )* ) )
            // InternalMyDsl.g:378:2: ( ( rule__Rule__RegleAssignment_5 ) ) ( ( rule__Rule__RegleAssignment_5 )* )
            {
            // InternalMyDsl.g:378:2: ( ( rule__Rule__RegleAssignment_5 ) )
            // InternalMyDsl.g:379:3: ( rule__Rule__RegleAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getRegleAssignment_5()); 
            // InternalMyDsl.g:380:3: ( rule__Rule__RegleAssignment_5 )
            // InternalMyDsl.g:380:4: rule__Rule__RegleAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__Rule__RegleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getRegleAssignment_5()); 

            }

            // InternalMyDsl.g:383:2: ( ( rule__Rule__RegleAssignment_5 )* )
            // InternalMyDsl.g:384:3: ( rule__Rule__RegleAssignment_5 )*
            {
             before(grammarAccess.getRuleAccess().getRegleAssignment_5()); 
            // InternalMyDsl.g:385:3: ( rule__Rule__RegleAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=16)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:385:4: rule__Rule__RegleAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Rule__RegleAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getRegleAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalMyDsl.g:394:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:398:1: ( rule__Rule__Group__6__Impl )
            // InternalMyDsl.g:399:2: rule__Rule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalMyDsl.g:405:1: rule__Rule__Group__6__Impl : ( '}' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:409:1: ( ( '}' ) )
            // InternalMyDsl.g:410:1: ( '}' )
            {
            // InternalMyDsl.g:410:1: ( '}' )
            // InternalMyDsl.g:411:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Model__RulesAssignment"
    // InternalMyDsl.g:421:1: rule__Model__RulesAssignment : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:425:1: ( ( ruleRule ) )
            // InternalMyDsl.g:426:2: ( ruleRule )
            {
            // InternalMyDsl.g:426:2: ( ruleRule )
            // InternalMyDsl.g:427:3: ruleRule
            {
             before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RulesAssignment"


    // $ANTLR start "rule__Rule__ObjectifAssignment_1"
    // InternalMyDsl.g:436:1: rule__Rule__ObjectifAssignment_1 : ( ruleObjectif ) ;
    public final void rule__Rule__ObjectifAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:440:1: ( ( ruleObjectif ) )
            // InternalMyDsl.g:441:2: ( ruleObjectif )
            {
            // InternalMyDsl.g:441:2: ( ruleObjectif )
            // InternalMyDsl.g:442:3: ruleObjectif
            {
             before(grammarAccess.getRuleAccess().getObjectifObjectifEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObjectif();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getObjectifObjectifEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ObjectifAssignment_1"


    // $ANTLR start "rule__Rule__JoueurAssignment_2"
    // InternalMyDsl.g:451:1: rule__Rule__JoueurAssignment_2 : ( ruleJoueur ) ;
    public final void rule__Rule__JoueurAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:455:1: ( ( ruleJoueur ) )
            // InternalMyDsl.g:456:2: ( ruleJoueur )
            {
            // InternalMyDsl.g:456:2: ( ruleJoueur )
            // InternalMyDsl.g:457:3: ruleJoueur
            {
             before(grammarAccess.getRuleAccess().getJoueurJoueurEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJoueur();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getJoueurJoueurEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__JoueurAssignment_2"


    // $ANTLR start "rule__Rule__RegleAssignment_5"
    // InternalMyDsl.g:466:1: rule__Rule__RegleAssignment_5 : ( ruleRegle ) ;
    public final void rule__Rule__RegleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:470:1: ( ( ruleRegle ) )
            // InternalMyDsl.g:471:2: ( ruleRegle )
            {
            // InternalMyDsl.g:471:2: ( ruleRegle )
            // InternalMyDsl.g:472:3: ruleRegle
            {
             before(grammarAccess.getRuleAccess().getRegleRegleEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRegle();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getRegleRegleEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__RegleAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000001E002L});

}