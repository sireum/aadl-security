package org.sireum.aadl.osate.securitymodel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/** Copyright (c) 2020, Hariharan Thiagarajan, Kansas State University
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
@SuppressWarnings("all")
public class InternalSecMFParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DeClassification", "Classification", "Classifier", "Reference", "Subclause", "Constant", "Applies", "Binding", "Compute", "Extends", "Library", "Package", "Domain", "Public", "Annex", "Delta", "False", "Modes", "Types", "True", "Type", "AsteriskAsteriskRightCurlyBracket", "PlusSignEqualsSignGreaterThanSign", "Any", "End", "LeftCurlyBracketAsteriskAsterisk", "HyphenMinusGreaterThanSign", "FullStopFullStop", "ColonColon", "EqualsSignGreaterThanSign", "In", "To", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "FullStop", "Colon", "Semicolon", "LeftSquareBracket", "RightSquareBracket", "LeftCurlyBracket", "RightCurlyBracket", "RULE_SL_COMMENT", "RULE_INTEGER_LIT", "RULE_DIGIT", "RULE_EXPONENT", "RULE_INT_EXPONENT", "RULE_REAL_LIT", "RULE_EXTENDED_DIGIT", "RULE_BASED_INTEGER", "RULE_STRING", "RULE_ID", "RULE_WS"
    };
    public static final int Types=22;
    public static final int EqualsSignGreaterThanSign=33;
    public static final int DeClassification=4;
    public static final int True=23;
    public static final int False=20;
    public static final int LeftCurlyBracketAsteriskAsterisk=29;
    public static final int RULE_INT_EXPONENT=53;
    public static final int PlusSignEqualsSignGreaterThanSign=26;
    public static final int LeftParenthesis=36;
    public static final int FullStopFullStop=31;
    public static final int Classification=5;
    public static final int To=35;
    public static final int Applies=10;
    public static final int Extends=13;
    public static final int RULE_BASED_INTEGER=56;
    public static final int RightSquareBracket=46;
    public static final int Binding=11;
    public static final int RULE_ID=58;
    public static final int RightParenthesis=37;
    public static final int RULE_DIGIT=51;
    public static final int Public=17;
    public static final int AsteriskAsteriskRightCurlyBracket=25;
    public static final int ColonColon=32;
    public static final int PlusSign=39;
    public static final int End=28;
    public static final int LeftSquareBracket=45;
    public static final int Library=14;
    public static final int Package=15;
    public static final int Domain=16;
    public static final int RULE_INTEGER_LIT=50;
    public static final int Subclause=8;
    public static final int In=34;
    public static final int Constant=9;
    public static final int RULE_REAL_LIT=54;
    public static final int RULE_STRING=57;
    public static final int Classifier=6;
    public static final int Any=27;
    public static final int RULE_SL_COMMENT=49;
    public static final int Comma=40;
    public static final int HyphenMinus=41;
    public static final int Colon=43;
    public static final int RightCurlyBracket=48;
    public static final int EOF=-1;
    public static final int Asterisk=38;
    public static final int Modes=21;
    public static final int FullStop=42;
    public static final int RULE_WS=59;
    public static final int Reference=7;
    public static final int LeftCurlyBracket=47;
    public static final int Semicolon=44;
    public static final int Type=24;
    public static final int RULE_EXPONENT=52;
    public static final int Annex=18;
    public static final int Delta=19;
    public static final int Compute=12;
    public static final int RULE_EXTENDED_DIGIT=55;
    public static final int HyphenMinusGreaterThanSign=30;

    // delegates
    // delegators


        public InternalSecMFParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSecMFParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSecMFParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSecMFParser.g"; }




    	private SecMFGrammarAccess grammarAccess;
    	 	
    	public InternalSecMFParser(TokenStream input, SecMFGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "SecMFRoot";	
    	} 
    	   	   	
    	@Override
    	protected SecMFGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleSecMFRoot"
    // InternalSecMFParser.g:82:1: entryRuleSecMFRoot returns [EObject current=null] : iv_ruleSecMFRoot= ruleSecMFRoot EOF ;
    public final EObject entryRuleSecMFRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecMFRoot = null;


        try {
            // InternalSecMFParser.g:83:2: (iv_ruleSecMFRoot= ruleSecMFRoot EOF )
            // InternalSecMFParser.g:84:2: iv_ruleSecMFRoot= ruleSecMFRoot EOF
            {
             newCompositeNode(grammarAccess.getSecMFRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecMFRoot=ruleSecMFRoot();

            state._fsp--;

             current =iv_ruleSecMFRoot; 
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
    // $ANTLR end "entryRuleSecMFRoot"


    // $ANTLR start "ruleSecMFRoot"
    // InternalSecMFParser.g:91:1: ruleSecMFRoot returns [EObject current=null] : ( () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* ) ) ;
    public final EObject ruleSecMFRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_library_1_0 = null;

        EObject lv_subclauses_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:94:28: ( ( () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* ) ) )
            // InternalSecMFParser.g:95:1: ( () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* ) )
            {
            // InternalSecMFParser.g:95:1: ( () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* ) )
            // InternalSecMFParser.g:95:2: () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* )
            {
            // InternalSecMFParser.g:95:2: ()
            // InternalSecMFParser.g:96:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSecMFRootAccess().getSecMFRootAction_0(),
                        current);
                

            }

            // InternalSecMFParser.g:101:2: ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=Library && LA2_0<=Package)) ) {
                alt2=1;
            }
            else if ( (LA2_0==EOF||LA2_0==Subclause) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSecMFParser.g:101:3: ( (lv_library_1_0= ruleSMFLibrary ) )
                    {
                    // InternalSecMFParser.g:101:3: ( (lv_library_1_0= ruleSMFLibrary ) )
                    // InternalSecMFParser.g:102:1: (lv_library_1_0= ruleSMFLibrary )
                    {
                    // InternalSecMFParser.g:102:1: (lv_library_1_0= ruleSMFLibrary )
                    // InternalSecMFParser.g:103:3: lv_library_1_0= ruleSMFLibrary
                    {
                     
                    	        newCompositeNode(grammarAccess.getSecMFRootAccess().getLibrarySMFLibraryParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_library_1_0=ruleSMFLibrary();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSecMFRootRule());
                    	        }
                           		set(
                           			current, 
                           			"library",
                            		lv_library_1_0, 
                            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFLibrary");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:120:6: ( (lv_subclauses_2_0= ruleSMFSubclause ) )*
                    {
                    // InternalSecMFParser.g:120:6: ( (lv_subclauses_2_0= ruleSMFSubclause ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Subclause) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSecMFParser.g:121:1: (lv_subclauses_2_0= ruleSMFSubclause )
                    	    {
                    	    // InternalSecMFParser.g:121:1: (lv_subclauses_2_0= ruleSMFSubclause )
                    	    // InternalSecMFParser.g:122:3: lv_subclauses_2_0= ruleSMFSubclause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSecMFRootAccess().getSubclausesSMFSubclauseParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_3);
                    	    lv_subclauses_2_0=ruleSMFSubclause();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSecMFRootRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"subclauses",
                    	            		lv_subclauses_2_0, 
                    	            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFSubclause");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleSecMFRoot"


    // $ANTLR start "entryRuleSecModelLibrary"
    // InternalSecMFParser.g:152:1: entryRuleSecModelLibrary returns [EObject current=null] : iv_ruleSecModelLibrary= ruleSecModelLibrary EOF ;
    public final EObject entryRuleSecModelLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecModelLibrary = null;


        try {
            // InternalSecMFParser.g:153:2: (iv_ruleSecModelLibrary= ruleSecModelLibrary EOF )
            // InternalSecMFParser.g:154:2: iv_ruleSecModelLibrary= ruleSecModelLibrary EOF
            {
             newCompositeNode(grammarAccess.getSecModelLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecModelLibrary=ruleSecModelLibrary();

            state._fsp--;

             current =iv_ruleSecModelLibrary; 
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
    // $ANTLR end "entryRuleSecModelLibrary"


    // $ANTLR start "ruleSecModelLibrary"
    // InternalSecMFParser.g:161:1: ruleSecModelLibrary returns [EObject current=null] : ( () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )? ) ;
    public final EObject ruleSecModelLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_types_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:164:28: ( ( () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )? ) )
            // InternalSecMFParser.g:165:1: ( () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )? )
            {
            // InternalSecMFParser.g:165:1: ( () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )? )
            // InternalSecMFParser.g:165:2: () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )?
            {
            // InternalSecMFParser.g:165:2: ()
            // InternalSecMFParser.g:166:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSecModelLibraryAccess().getSecModelLibraryAction_0(),
                        current);
                

            }

            // InternalSecMFParser.g:171:2: ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Domain) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecMFParser.g:172:5: ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon
                    {
                     
                            newCompositeNode(grammarAccess.getSecModelLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_4);
                    ruleDomainTypesKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    // InternalSecMFParser.g:179:1: ( (lv_types_2_0= ruleSMFTypeDef ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSecMFParser.g:180:1: (lv_types_2_0= ruleSMFTypeDef )
                    	    {
                    	    // InternalSecMFParser.g:180:1: (lv_types_2_0= ruleSMFTypeDef )
                    	    // InternalSecMFParser.g:181:3: lv_types_2_0= ruleSMFTypeDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSecModelLibraryAccess().getTypesSMFTypeDefParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_4);
                    	    lv_types_2_0=ruleSMFTypeDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSecModelLibraryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_2_0, 
                    	            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFTypeDef");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                     
                            newCompositeNode(grammarAccess.getSecModelLibraryAccess().getEndTypesKeywordsParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_5);
                    ruleEndTypesKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

                        	newLeafNode(otherlv_4, grammarAccess.getSecModelLibraryAccess().getSemicolonKeyword_1_3());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleSecModelLibrary"


    // $ANTLR start "entryRuleSMFLibrary"
    // InternalSecMFParser.g:218:1: entryRuleSMFLibrary returns [EObject current=null] : iv_ruleSMFLibrary= ruleSMFLibrary EOF ;
    public final EObject entryRuleSMFLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFLibrary = null;


        try {
            // InternalSecMFParser.g:219:2: (iv_ruleSMFLibrary= ruleSMFLibrary EOF )
            // InternalSecMFParser.g:220:2: iv_ruleSMFLibrary= ruleSMFLibrary EOF
            {
             newCompositeNode(grammarAccess.getSMFLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMFLibrary=ruleSMFLibrary();

            state._fsp--;

             current =iv_ruleSMFLibrary; 
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
    // $ANTLR end "entryRuleSMFLibrary"


    // $ANTLR start "ruleSMFLibrary"
    // InternalSecMFParser.g:227:1: ruleSMFLibrary returns [EObject current=null] : ( ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) ) | (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon ) ) ;
    public final EObject ruleSMFLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_ID_11=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_types_4_0 = null;

        AntlrDatatypeRuleToken lv_name_8_0 = null;

        EObject lv_type_14_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:230:28: ( ( ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) ) | (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon ) ) )
            // InternalSecMFParser.g:231:1: ( ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) ) | (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon ) )
            {
            // InternalSecMFParser.g:231:1: ( ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) ) | (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Library) ) {
                alt9=1;
            }
            else if ( (LA9_0==Package) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalSecMFParser.g:231:2: ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) )
                    {
                    // InternalSecMFParser.g:231:2: ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) )
                    // InternalSecMFParser.g:231:3: () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? )
                    {
                    // InternalSecMFParser.g:231:3: ()
                    // InternalSecMFParser.g:232:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getSMFLibraryAccess().getSecModelLibraryAction_0_0(),
                                current);
                        

                    }

                    // InternalSecMFParser.g:237:2: (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? )
                    // InternalSecMFParser.g:238:2: otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )?
                    {
                    otherlv_1=(Token)match(input,Library,FOLLOW_6); 

                        	newLeafNode(otherlv_1, grammarAccess.getSMFLibraryAccess().getLibraryKeyword_0_1_0());
                        
                    // InternalSecMFParser.g:242:1: ( (lv_name_2_0= ruleQEMREF ) )
                    // InternalSecMFParser.g:243:1: (lv_name_2_0= ruleQEMREF )
                    {
                    // InternalSecMFParser.g:243:1: (lv_name_2_0= ruleQEMREF )
                    // InternalSecMFParser.g:244:3: lv_name_2_0= ruleQEMREF
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_0_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_7);
                    lv_name_2_0=ruleQEMREF();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMFLibraryRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"org.sireum.aadl.osate.securitymodel.SecMF.QEMREF");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSecMFParser.g:260:2: ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Domain) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSecMFParser.g:261:5: ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon
                            {
                             
                                    newCompositeNode(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_0_1_2_0()); 
                                
                            pushFollow(FOLLOW_4);
                            ruleDomainTypesKeywords();

                            state._fsp--;


                                    afterParserOrEnumRuleCall();
                                
                            // InternalSecMFParser.g:268:1: ( (lv_types_4_0= ruleSMFTypeDef ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_ID) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalSecMFParser.g:269:1: (lv_types_4_0= ruleSMFTypeDef )
                            	    {
                            	    // InternalSecMFParser.g:269:1: (lv_types_4_0= ruleSMFTypeDef )
                            	    // InternalSecMFParser.g:270:3: lv_types_4_0= ruleSMFTypeDef
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSMFLibraryAccess().getTypesSMFTypeDefParserRuleCall_0_1_2_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_4);
                            	    lv_types_4_0=ruleSMFTypeDef();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSMFLibraryRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"types",
                            	            		lv_types_4_0, 
                            	            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFTypeDef");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);

                             
                                    newCompositeNode(grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_0_1_2_2()); 
                                
                            pushFollow(FOLLOW_5);
                            ruleEndTypesKeywords();

                            state._fsp--;


                                    afterParserOrEnumRuleCall();
                                
                            otherlv_6=(Token)match(input,Semicolon,FOLLOW_2); 

                                	newLeafNode(otherlv_6, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_0_1_2_3());
                                

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:300:6: (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon )
                    {
                    // InternalSecMFParser.g:300:6: (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon )
                    // InternalSecMFParser.g:301:2: otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon
                    {
                    otherlv_7=(Token)match(input,Package,FOLLOW_6); 

                        	newLeafNode(otherlv_7, grammarAccess.getSMFLibraryAccess().getPackageKeyword_1_0());
                        
                    // InternalSecMFParser.g:305:1: ( (lv_name_8_0= ruleQEMREF ) )
                    // InternalSecMFParser.g:306:1: (lv_name_8_0= ruleQEMREF )
                    {
                    // InternalSecMFParser.g:306:1: (lv_name_8_0= ruleQEMREF )
                    // InternalSecMFParser.g:307:3: lv_name_8_0= ruleQEMREF
                    {
                     
                    	        newCompositeNode(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_8);
                    lv_name_8_0=ruleQEMREF();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSMFLibraryRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_8_0, 
                            		"org.sireum.aadl.osate.securitymodel.SecMF.QEMREF");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,Public,FOLLOW_9); 

                        	newLeafNode(otherlv_9, grammarAccess.getSMFLibraryAccess().getPublicKeyword_1_2());
                        
                    otherlv_10=(Token)match(input,Annex,FOLLOW_6); 

                        	newLeafNode(otherlv_10, grammarAccess.getSMFLibraryAccess().getAnnexKeyword_1_3());
                        
                    this_ID_11=(Token)match(input,RULE_ID,FOLLOW_10); 
                     
                        newLeafNode(this_ID_11, grammarAccess.getSMFLibraryAccess().getIDTerminalRuleCall_1_4()); 
                        
                    otherlv_12=(Token)match(input,LeftCurlyBracketAsteriskAsterisk,FOLLOW_11); 

                        	newLeafNode(otherlv_12, grammarAccess.getSMFLibraryAccess().getLeftCurlyBracketAsteriskAsteriskKeyword_1_5());
                        
                    // InternalSecMFParser.g:342:1: ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Domain) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSecMFParser.g:343:5: ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon
                            {
                             
                                    newCompositeNode(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_6_0()); 
                                
                            pushFollow(FOLLOW_4);
                            ruleDomainTypesKeywords();

                            state._fsp--;


                                    afterParserOrEnumRuleCall();
                                
                            // InternalSecMFParser.g:350:1: ( (lv_type_14_0= ruleSMFTypeDef ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==RULE_ID) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalSecMFParser.g:351:1: (lv_type_14_0= ruleSMFTypeDef )
                            	    {
                            	    // InternalSecMFParser.g:351:1: (lv_type_14_0= ruleSMFTypeDef )
                            	    // InternalSecMFParser.g:352:3: lv_type_14_0= ruleSMFTypeDef
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSMFLibraryAccess().getTypeSMFTypeDefParserRuleCall_1_6_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_4);
                            	    lv_type_14_0=ruleSMFTypeDef();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSMFLibraryRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"type",
                            	            		lv_type_14_0, 
                            	            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFTypeDef");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);

                             
                                    newCompositeNode(grammarAccess.getSMFLibraryAccess().getEndTypesKeywordsParserRuleCall_1_6_2()); 
                                
                            pushFollow(FOLLOW_5);
                            ruleEndTypesKeywords();

                            state._fsp--;


                                    afterParserOrEnumRuleCall();
                                
                            otherlv_16=(Token)match(input,Semicolon,FOLLOW_12); 

                                	newLeafNode(otherlv_16, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_6_3());
                                

                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,AsteriskAsteriskRightCurlyBracket,FOLLOW_5); 

                        	newLeafNode(otherlv_17, grammarAccess.getSMFLibraryAccess().getAsteriskAsteriskRightCurlyBracketKeyword_1_7());
                        
                    otherlv_18=(Token)match(input,Semicolon,FOLLOW_13); 

                        	newLeafNode(otherlv_18, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_8());
                        
                    otherlv_19=(Token)match(input,End,FOLLOW_6); 

                        	newLeafNode(otherlv_19, grammarAccess.getSMFLibraryAccess().getEndKeyword_1_9());
                        
                     
                            newCompositeNode(grammarAccess.getSMFLibraryAccess().getQEMREFParserRuleCall_1_10()); 
                        
                    pushFollow(FOLLOW_5);
                    ruleQEMREF();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    otherlv_21=(Token)match(input,Semicolon,FOLLOW_2); 

                        	newLeafNode(otherlv_21, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_11());
                        

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
    // $ANTLR end "ruleSMFLibrary"


    // $ANTLR start "entryRuleSMFSubclause"
    // InternalSecMFParser.g:421:1: entryRuleSMFSubclause returns [EObject current=null] : iv_ruleSMFSubclause= ruleSMFSubclause EOF ;
    public final EObject entryRuleSMFSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFSubclause = null;


        try {
            // InternalSecMFParser.g:422:2: (iv_ruleSMFSubclause= ruleSMFSubclause EOF )
            // InternalSecMFParser.g:423:2: iv_ruleSMFSubclause= ruleSMFSubclause EOF
            {
             newCompositeNode(grammarAccess.getSMFSubclauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMFSubclause=ruleSMFSubclause();

            state._fsp--;

             current =iv_ruleSMFSubclause; 
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
    // $ANTLR end "entryRuleSMFSubclause"


    // $ANTLR start "ruleSMFSubclause"
    // InternalSecMFParser.g:430:1: ruleSMFSubclause returns [EObject current=null] : ( () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )? ) ;
    public final EObject ruleSMFSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_classification_4_0 = null;

        EObject lv_declassification_6_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:433:28: ( ( () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )? ) )
            // InternalSecMFParser.g:434:1: ( () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )? )
            {
            // InternalSecMFParser.g:434:1: ( () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )? )
            // InternalSecMFParser.g:434:2: () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )?
            {
            // InternalSecMFParser.g:434:2: ()
            // InternalSecMFParser.g:435:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMFSubclauseAccess().getSecModelSubclauseAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,Subclause,FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getSMFSubclauseAccess().getSubclauseKeyword_1());
                
            // InternalSecMFParser.g:445:1: ( (lv_name_2_0= ruleQCREF ) )
            // InternalSecMFParser.g:446:1: (lv_name_2_0= ruleQCREF )
            {
            // InternalSecMFParser.g:446:1: (lv_name_2_0= ruleQCREF )
            // InternalSecMFParser.g:447:3: lv_name_2_0= ruleQCREF
            {
             
            	        newCompositeNode(grammarAccess.getSMFSubclauseAccess().getNameQCREFParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleQCREF();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSMFSubclauseRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.QCREF");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:463:2: ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Classification) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecMFParser.g:464:5: ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+
                    {
                     
                            newCompositeNode(grammarAccess.getSMFSubclauseAccess().getClassificationKeywordsParserRuleCall_3_0()); 
                        
                    pushFollow(FOLLOW_6);
                    ruleClassificationKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    // InternalSecMFParser.g:471:1: ( (lv_classification_4_0= ruleSMFClassification ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalSecMFParser.g:472:1: (lv_classification_4_0= ruleSMFClassification )
                    	    {
                    	    // InternalSecMFParser.g:472:1: (lv_classification_4_0= ruleSMFClassification )
                    	    // InternalSecMFParser.g:473:3: lv_classification_4_0= ruleSMFClassification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSMFSubclauseAccess().getClassificationSMFClassificationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_15);
                    	    lv_classification_4_0=ruleSMFClassification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSMFSubclauseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"classification",
                    	            		lv_classification_4_0, 
                    	            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFClassification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }

            // InternalSecMFParser.g:489:5: ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DeClassification) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecMFParser.g:490:5: ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+
                    {
                     
                            newCompositeNode(grammarAccess.getSMFSubclauseAccess().getDeclassificationKeywordsParserRuleCall_4_0()); 
                        
                    pushFollow(FOLLOW_6);
                    ruleDeclassificationKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    // InternalSecMFParser.g:497:1: ( (lv_declassification_6_0= ruleSMFDeclassification ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSecMFParser.g:498:1: (lv_declassification_6_0= ruleSMFDeclassification )
                    	    {
                    	    // InternalSecMFParser.g:498:1: (lv_declassification_6_0= ruleSMFDeclassification )
                    	    // InternalSecMFParser.g:499:3: lv_declassification_6_0= ruleSMFDeclassification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSMFSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_16);
                    	    lv_declassification_6_0=ruleSMFDeclassification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSMFSubclauseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declassification",
                    	            		lv_declassification_6_0, 
                    	            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFDeclassification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleSMFSubclause"


    // $ANTLR start "entryRuleSecModelSubclause"
    // InternalSecMFParser.g:523:1: entryRuleSecModelSubclause returns [EObject current=null] : iv_ruleSecModelSubclause= ruleSecModelSubclause EOF ;
    public final EObject entryRuleSecModelSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecModelSubclause = null;


        try {
            // InternalSecMFParser.g:524:2: (iv_ruleSecModelSubclause= ruleSecModelSubclause EOF )
            // InternalSecMFParser.g:525:2: iv_ruleSecModelSubclause= ruleSecModelSubclause EOF
            {
             newCompositeNode(grammarAccess.getSecModelSubclauseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecModelSubclause=ruleSecModelSubclause();

            state._fsp--;

             current =iv_ruleSecModelSubclause; 
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
    // $ANTLR end "entryRuleSecModelSubclause"


    // $ANTLR start "ruleSecModelSubclause"
    // InternalSecMFParser.g:532:1: ruleSecModelSubclause returns [EObject current=null] : ( () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )? ) ;
    public final EObject ruleSecModelSubclause() throws RecognitionException {
        EObject current = null;

        EObject lv_classification_2_0 = null;

        EObject lv_declassification_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:535:28: ( ( () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )? ) )
            // InternalSecMFParser.g:536:1: ( () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )? )
            {
            // InternalSecMFParser.g:536:1: ( () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )? )
            // InternalSecMFParser.g:536:2: () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )?
            {
            // InternalSecMFParser.g:536:2: ()
            // InternalSecMFParser.g:537:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSecModelSubclauseAccess().getSecModelSubclauseAction_0(),
                        current);
                

            }

            // InternalSecMFParser.g:542:2: ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Classification) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecMFParser.g:543:5: ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+
                    {
                     
                            newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getClassificationKeywordsParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_6);
                    ruleClassificationKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    // InternalSecMFParser.g:550:1: ( (lv_classification_2_0= ruleSMFClassification ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_ID) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSecMFParser.g:551:1: (lv_classification_2_0= ruleSMFClassification )
                    	    {
                    	    // InternalSecMFParser.g:551:1: (lv_classification_2_0= ruleSMFClassification )
                    	    // InternalSecMFParser.g:552:3: lv_classification_2_0= ruleSMFClassification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getClassificationSMFClassificationParserRuleCall_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_15);
                    	    lv_classification_2_0=ruleSMFClassification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSecModelSubclauseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"classification",
                    	            		lv_classification_2_0, 
                    	            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFClassification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }

            // InternalSecMFParser.g:568:5: ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DeClassification) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecMFParser.g:569:5: ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+
                    {
                     
                            newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getDeclassificationKeywordsParserRuleCall_2_0()); 
                        
                    pushFollow(FOLLOW_6);
                    ruleDeclassificationKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    // InternalSecMFParser.g:576:1: ( (lv_declassification_4_0= ruleSMFDeclassification ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==RULE_ID) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSecMFParser.g:577:1: (lv_declassification_4_0= ruleSMFDeclassification )
                    	    {
                    	    // InternalSecMFParser.g:577:1: (lv_declassification_4_0= ruleSMFDeclassification )
                    	    // InternalSecMFParser.g:578:3: lv_declassification_4_0= ruleSMFDeclassification
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_16);
                    	    lv_declassification_4_0=ruleSMFDeclassification();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSecModelSubclauseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"declassification",
                    	            		lv_declassification_4_0, 
                    	            		"org.sireum.aadl.osate.securitymodel.SecMF.SMFDeclassification");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }


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
    // $ANTLR end "ruleSecModelSubclause"


    // $ANTLR start "entryRuleSMFClassification"
    // InternalSecMFParser.g:602:1: entryRuleSMFClassification returns [EObject current=null] : iv_ruleSMFClassification= ruleSMFClassification EOF ;
    public final EObject entryRuleSMFClassification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFClassification = null;


        try {
            // InternalSecMFParser.g:603:2: (iv_ruleSMFClassification= ruleSMFClassification EOF )
            // InternalSecMFParser.g:604:2: iv_ruleSMFClassification= ruleSMFClassification EOF
            {
             newCompositeNode(grammarAccess.getSMFClassificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMFClassification=ruleSMFClassification();

            state._fsp--;

             current =iv_ruleSMFClassification; 
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
    // $ANTLR end "entryRuleSMFClassification"


    // $ANTLR start "ruleSMFClassification"
    // InternalSecMFParser.g:611:1: ruleSMFClassification returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleSMFClassification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:614:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon ) )
            // InternalSecMFParser.g:615:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon )
            {
            // InternalSecMFParser.g:615:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon )
            // InternalSecMFParser.g:615:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon
            {
            // InternalSecMFParser.g:615:2: ()
            // InternalSecMFParser.g:616:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMFClassificationAccess().getSMFClassificationAction_0(),
                        current);
                

            }

            // InternalSecMFParser.g:621:2: ( (otherlv_1= RULE_ID ) )
            // InternalSecMFParser.g:622:1: (otherlv_1= RULE_ID )
            {
            // InternalSecMFParser.g:622:1: (otherlv_1= RULE_ID )
            // InternalSecMFParser.g:623:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSMFClassificationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            		newLeafNode(otherlv_1, grammarAccess.getSMFClassificationAccess().getFeatureNamedElementCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_6); 

                	newLeafNode(otherlv_2, grammarAccess.getSMFClassificationAccess().getColonKeyword_2());
                
            // InternalSecMFParser.g:639:1: ( (otherlv_3= RULE_ID ) )
            // InternalSecMFParser.g:640:1: (otherlv_3= RULE_ID )
            {
            // InternalSecMFParser.g:640:1: (otherlv_3= RULE_ID )
            // InternalSecMFParser.g:641:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSMFClassificationRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_5); 

            		newLeafNode(otherlv_3, grammarAccess.getSMFClassificationAccess().getTypeRefSMFTypeRefCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_4, grammarAccess.getSMFClassificationAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleSMFClassification"


    // $ANTLR start "entryRuleSMFTypeRef"
    // InternalSecMFParser.g:665:1: entryRuleSMFTypeRef returns [EObject current=null] : iv_ruleSMFTypeRef= ruleSMFTypeRef EOF ;
    public final EObject entryRuleSMFTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFTypeRef = null;


        try {
            // InternalSecMFParser.g:666:2: (iv_ruleSMFTypeRef= ruleSMFTypeRef EOF )
            // InternalSecMFParser.g:667:2: iv_ruleSMFTypeRef= ruleSMFTypeRef EOF
            {
             newCompositeNode(grammarAccess.getSMFTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMFTypeRef=ruleSMFTypeRef();

            state._fsp--;

             current =iv_ruleSMFTypeRef; 
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
    // $ANTLR end "entryRuleSMFTypeRef"


    // $ANTLR start "ruleSMFTypeRef"
    // InternalSecMFParser.g:674:1: ruleSMFTypeRef returns [EObject current=null] : this_SMFTypeDef_0= ruleSMFTypeDef ;
    public final EObject ruleSMFTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_SMFTypeDef_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:677:28: (this_SMFTypeDef_0= ruleSMFTypeDef )
            // InternalSecMFParser.g:679:5: this_SMFTypeDef_0= ruleSMFTypeDef
            {
             
                    newCompositeNode(grammarAccess.getSMFTypeRefAccess().getSMFTypeDefParserRuleCall()); 
                
            pushFollow(FOLLOW_2);
            this_SMFTypeDef_0=ruleSMFTypeDef();

            state._fsp--;


                    current = this_SMFTypeDef_0;
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleSMFTypeRef"


    // $ANTLR start "entryRuleSMFDeclassification"
    // InternalSecMFParser.g:695:1: entryRuleSMFDeclassification returns [EObject current=null] : iv_ruleSMFDeclassification= ruleSMFDeclassification EOF ;
    public final EObject entryRuleSMFDeclassification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFDeclassification = null;


        try {
            // InternalSecMFParser.g:696:2: (iv_ruleSMFDeclassification= ruleSMFDeclassification EOF )
            // InternalSecMFParser.g:697:2: iv_ruleSMFDeclassification= ruleSMFDeclassification EOF
            {
             newCompositeNode(grammarAccess.getSMFDeclassificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMFDeclassification=ruleSMFDeclassification();

            state._fsp--;

             current =iv_ruleSMFDeclassification; 
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
    // $ANTLR end "entryRuleSMFDeclassification"


    // $ANTLR start "ruleSMFDeclassification"
    // InternalSecMFParser.g:704:1: ruleSMFDeclassification returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon ) ;
    public final EObject ruleSMFDeclassification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_any_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:707:28: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon ) )
            // InternalSecMFParser.g:708:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon )
            {
            // InternalSecMFParser.g:708:1: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon )
            // InternalSecMFParser.g:708:2: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon
            {
            // InternalSecMFParser.g:708:2: ()
            // InternalSecMFParser.g:709:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSMFDeclassificationAccess().getSMFDeclassificationAction_0(),
                        current);
                

            }

            // InternalSecMFParser.g:714:2: ( (otherlv_1= RULE_ID ) )
            // InternalSecMFParser.g:715:1: (otherlv_1= RULE_ID )
            {
            // InternalSecMFParser.g:715:1: (otherlv_1= RULE_ID )
            // InternalSecMFParser.g:716:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSMFDeclassificationRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            		newLeafNode(otherlv_1, grammarAccess.getSMFDeclassificationAccess().getFlowNamedElementCrossReference_1_0()); 
            	

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_18); 

                	newLeafNode(otherlv_2, grammarAccess.getSMFDeclassificationAccess().getColonKeyword_2());
                
            // InternalSecMFParser.g:732:1: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==Any) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalSecMFParser.g:732:2: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSecMFParser.g:732:2: ( (otherlv_3= RULE_ID ) )
                    // InternalSecMFParser.g:733:1: (otherlv_3= RULE_ID )
                    {
                    // InternalSecMFParser.g:733:1: (otherlv_3= RULE_ID )
                    // InternalSecMFParser.g:734:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSMFDeclassificationRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_19); 

                    		newLeafNode(otherlv_3, grammarAccess.getSMFDeclassificationAccess().getSrcNameSMFTypeRefCrossReference_3_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:746:6: ( (lv_any_4_0= Any ) )
                    {
                    // InternalSecMFParser.g:746:6: ( (lv_any_4_0= Any ) )
                    // InternalSecMFParser.g:747:1: (lv_any_4_0= Any )
                    {
                    // InternalSecMFParser.g:747:1: (lv_any_4_0= Any )
                    // InternalSecMFParser.g:748:3: lv_any_4_0= Any
                    {
                    lv_any_4_0=(Token)match(input,Any,FOLLOW_19); 

                            newLeafNode(lv_any_4_0, grammarAccess.getSMFDeclassificationAccess().getAnyAnyKeyword_3_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSMFDeclassificationRule());
                    	        }
                           		setWithLastConsumed(current, "any", true, "any");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,HyphenMinusGreaterThanSign,FOLLOW_6); 

                	newLeafNode(otherlv_5, grammarAccess.getSMFDeclassificationAccess().getHyphenMinusGreaterThanSignKeyword_4());
                
            // InternalSecMFParser.g:767:1: ( (otherlv_6= RULE_ID ) )
            // InternalSecMFParser.g:768:1: (otherlv_6= RULE_ID )
            {
            // InternalSecMFParser.g:768:1: (otherlv_6= RULE_ID )
            // InternalSecMFParser.g:769:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSMFDeclassificationRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); 

            		newLeafNode(otherlv_6, grammarAccess.getSMFDeclassificationAccess().getSnkNameSMFTypeRefCrossReference_5_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getSMFDeclassificationAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleSMFDeclassification"


    // $ANTLR start "entryRuleSMFTypeDef"
    // InternalSecMFParser.g:793:1: entryRuleSMFTypeDef returns [EObject current=null] : iv_ruleSMFTypeDef= ruleSMFTypeDef EOF ;
    public final EObject entryRuleSMFTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFTypeDef = null;


        try {
            // InternalSecMFParser.g:794:2: (iv_ruleSMFTypeDef= ruleSMFTypeDef EOF )
            // InternalSecMFParser.g:795:2: iv_ruleSMFTypeDef= ruleSMFTypeDef EOF
            {
             newCompositeNode(grammarAccess.getSMFTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSMFTypeDef=ruleSMFTypeDef();

            state._fsp--;

             current =iv_ruleSMFTypeDef; 
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
    // $ANTLR end "entryRuleSMFTypeDef"


    // $ANTLR start "ruleSMFTypeDef"
    // InternalSecMFParser.g:802:1: ruleSMFTypeDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= Semicolon ) ;
    public final EObject ruleSMFTypeDef() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:805:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= Semicolon ) )
            // InternalSecMFParser.g:806:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= Semicolon )
            {
            // InternalSecMFParser.g:806:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= Semicolon )
            // InternalSecMFParser.g:806:2: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) ) ) ) otherlv_7= Semicolon
            {
            // InternalSecMFParser.g:806:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalSecMFParser.g:807:1: (lv_name_0_0= RULE_ID )
            {
            // InternalSecMFParser.g:807:1: (lv_name_0_0= RULE_ID )
            // InternalSecMFParser.g:808:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSMFTypeDefAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSMFTypeDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.ID");
            	    

            }


            }

            // InternalSecMFParser.g:824:2: ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Colon) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==Type) ) {
                    int LA19_2 = input.LA(3);

                    if ( (LA19_2==Extends) ) {
                        alt19=2;
                    }
                    else if ( (LA19_2==Semicolon) ) {
                        alt19=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSecMFParser.g:824:3: (otherlv_1= Colon otherlv_2= Type )
                    {
                    // InternalSecMFParser.g:824:3: (otherlv_1= Colon otherlv_2= Type )
                    // InternalSecMFParser.g:825:2: otherlv_1= Colon otherlv_2= Type
                    {
                    otherlv_1=(Token)match(input,Colon,FOLLOW_20); 

                        	newLeafNode(otherlv_1, grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_0_0());
                        
                    otherlv_2=(Token)match(input,Type,FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:835:6: (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) ) )
                    {
                    // InternalSecMFParser.g:835:6: (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) ) )
                    // InternalSecMFParser.g:836:2: otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,Colon,FOLLOW_20); 

                        	newLeafNode(otherlv_3, grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_1_0());
                        
                    otherlv_4=(Token)match(input,Type,FOLLOW_21); 

                        	newLeafNode(otherlv_4, grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_1_1());
                        
                    otherlv_5=(Token)match(input,Extends,FOLLOW_6); 

                        	newLeafNode(otherlv_5, grammarAccess.getSMFTypeDefAccess().getExtendsKeyword_1_1_2());
                        
                    // InternalSecMFParser.g:850:1: ( (otherlv_6= RULE_ID ) )
                    // InternalSecMFParser.g:851:1: (otherlv_6= RULE_ID )
                    {
                    // InternalSecMFParser.g:851:1: (otherlv_6= RULE_ID )
                    // InternalSecMFParser.g:852:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSMFTypeDefRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); 

                    		newLeafNode(otherlv_6, grammarAccess.getSMFTypeDefAccess().getTypeSMFTypeRefCrossReference_1_1_3_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getSMFTypeDefAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleSMFTypeDef"


    // $ANTLR start "entryRuleClassificationKeywords"
    // InternalSecMFParser.g:876:1: entryRuleClassificationKeywords returns [String current=null] : iv_ruleClassificationKeywords= ruleClassificationKeywords EOF ;
    public final String entryRuleClassificationKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationKeywords = null;


        try {
            // InternalSecMFParser.g:877:1: (iv_ruleClassificationKeywords= ruleClassificationKeywords EOF )
            // InternalSecMFParser.g:878:2: iv_ruleClassificationKeywords= ruleClassificationKeywords EOF
            {
             newCompositeNode(grammarAccess.getClassificationKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassificationKeywords=ruleClassificationKeywords();

            state._fsp--;

             current =iv_ruleClassificationKeywords.getText(); 
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
    // $ANTLR end "entryRuleClassificationKeywords"


    // $ANTLR start "ruleClassificationKeywords"
    // InternalSecMFParser.g:885:1: ruleClassificationKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Classification ;
    public final AntlrDatatypeRuleToken ruleClassificationKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:889:6: (kw= Classification )
            // InternalSecMFParser.g:891:2: kw= Classification
            {
            kw=(Token)match(input,Classification,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getClassificationKeywordsAccess().getClassificationKeyword()); 
                

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
    // $ANTLR end "ruleClassificationKeywords"


    // $ANTLR start "entryRuleDeclassificationKeywords"
    // InternalSecMFParser.g:904:1: entryRuleDeclassificationKeywords returns [String current=null] : iv_ruleDeclassificationKeywords= ruleDeclassificationKeywords EOF ;
    public final String entryRuleDeclassificationKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclassificationKeywords = null;


        try {
            // InternalSecMFParser.g:905:1: (iv_ruleDeclassificationKeywords= ruleDeclassificationKeywords EOF )
            // InternalSecMFParser.g:906:2: iv_ruleDeclassificationKeywords= ruleDeclassificationKeywords EOF
            {
             newCompositeNode(grammarAccess.getDeclassificationKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclassificationKeywords=ruleDeclassificationKeywords();

            state._fsp--;

             current =iv_ruleDeclassificationKeywords.getText(); 
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
    // $ANTLR end "entryRuleDeclassificationKeywords"


    // $ANTLR start "ruleDeclassificationKeywords"
    // InternalSecMFParser.g:913:1: ruleDeclassificationKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= DeClassification ;
    public final AntlrDatatypeRuleToken ruleDeclassificationKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:917:6: (kw= DeClassification )
            // InternalSecMFParser.g:919:2: kw= DeClassification
            {
            kw=(Token)match(input,DeClassification,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDeclassificationKeywordsAccess().getDeClassificationKeyword()); 
                

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
    // $ANTLR end "ruleDeclassificationKeywords"


    // $ANTLR start "entryRuleDomainTypesKeywords"
    // InternalSecMFParser.g:932:1: entryRuleDomainTypesKeywords returns [String current=null] : iv_ruleDomainTypesKeywords= ruleDomainTypesKeywords EOF ;
    public final String entryRuleDomainTypesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomainTypesKeywords = null;


        try {
            // InternalSecMFParser.g:933:1: (iv_ruleDomainTypesKeywords= ruleDomainTypesKeywords EOF )
            // InternalSecMFParser.g:934:2: iv_ruleDomainTypesKeywords= ruleDomainTypesKeywords EOF
            {
             newCompositeNode(grammarAccess.getDomainTypesKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainTypesKeywords=ruleDomainTypesKeywords();

            state._fsp--;

             current =iv_ruleDomainTypesKeywords.getText(); 
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
    // $ANTLR end "entryRuleDomainTypesKeywords"


    // $ANTLR start "ruleDomainTypesKeywords"
    // InternalSecMFParser.g:941:1: ruleDomainTypesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Domain kw= Types ) ;
    public final AntlrDatatypeRuleToken ruleDomainTypesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:945:6: ( (kw= Domain kw= Types ) )
            // InternalSecMFParser.g:946:1: (kw= Domain kw= Types )
            {
            // InternalSecMFParser.g:946:1: (kw= Domain kw= Types )
            // InternalSecMFParser.g:947:2: kw= Domain kw= Types
            {
            kw=(Token)match(input,Domain,FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDomainTypesKeywordsAccess().getDomainKeyword_0()); 
                
            kw=(Token)match(input,Types,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDomainTypesKeywordsAccess().getTypesKeyword_1()); 
                

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
    // $ANTLR end "ruleDomainTypesKeywords"


    // $ANTLR start "entryRuleEndTypesKeywords"
    // InternalSecMFParser.g:966:1: entryRuleEndTypesKeywords returns [String current=null] : iv_ruleEndTypesKeywords= ruleEndTypesKeywords EOF ;
    public final String entryRuleEndTypesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndTypesKeywords = null;


        try {
            // InternalSecMFParser.g:967:1: (iv_ruleEndTypesKeywords= ruleEndTypesKeywords EOF )
            // InternalSecMFParser.g:968:2: iv_ruleEndTypesKeywords= ruleEndTypesKeywords EOF
            {
             newCompositeNode(grammarAccess.getEndTypesKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEndTypesKeywords=ruleEndTypesKeywords();

            state._fsp--;

             current =iv_ruleEndTypesKeywords.getText(); 
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
    // $ANTLR end "entryRuleEndTypesKeywords"


    // $ANTLR start "ruleEndTypesKeywords"
    // InternalSecMFParser.g:975:1: ruleEndTypesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= End kw= Types ) ;
    public final AntlrDatatypeRuleToken ruleEndTypesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:979:6: ( (kw= End kw= Types ) )
            // InternalSecMFParser.g:980:1: (kw= End kw= Types )
            {
            // InternalSecMFParser.g:980:1: (kw= End kw= Types )
            // InternalSecMFParser.g:981:2: kw= End kw= Types
            {
            kw=(Token)match(input,End,FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEndTypesKeywordsAccess().getEndKeyword_0()); 
                
            kw=(Token)match(input,Types,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEndTypesKeywordsAccess().getTypesKeyword_1()); 
                

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
    // $ANTLR end "ruleEndTypesKeywords"


    // $ANTLR start "entryRuleQEMREF"
    // InternalSecMFParser.g:1002:1: entryRuleQEMREF returns [String current=null] : iv_ruleQEMREF= ruleQEMREF EOF ;
    public final String entryRuleQEMREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQEMREF = null;


        try {
            // InternalSecMFParser.g:1003:1: (iv_ruleQEMREF= ruleQEMREF EOF )
            // InternalSecMFParser.g:1004:2: iv_ruleQEMREF= ruleQEMREF EOF
            {
             newCompositeNode(grammarAccess.getQEMREFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQEMREF=ruleQEMREF();

            state._fsp--;

             current =iv_ruleQEMREF.getText(); 
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
    // $ANTLR end "entryRuleQEMREF"


    // $ANTLR start "ruleQEMREF"
    // InternalSecMFParser.g:1011:1: ruleQEMREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQEMREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1015:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) )
            // InternalSecMFParser.g:1016:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            {
            // InternalSecMFParser.g:1016:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            // InternalSecMFParser.g:1016:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSecMFParser.g:1023:1: (kw= ColonColon this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ColonColon) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSecMFParser.g:1024:2: kw= ColonColon this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,ColonColon,FOLLOW_6); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQEMREFAccess().getColonColonKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_23); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


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
    // $ANTLR end "ruleQEMREF"


    // $ANTLR start "entryRuleContainedPropertyAssociation"
    // InternalSecMFParser.g:1046:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalSecMFParser.g:1047:2: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalSecMFParser.g:1048:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
            {
             newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation();

            state._fsp--;

             current =iv_ruleContainedPropertyAssociation; 
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
    // $ANTLR end "entryRuleContainedPropertyAssociation"


    // $ANTLR start "ruleContainedPropertyAssociation"
    // InternalSecMFParser.g:1055:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
    public final EObject ruleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_append_2_0=null;
        Token lv_constant_3_0=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_ownedValue_4_0 = null;

        EObject lv_ownedValue_6_0 = null;

        EObject lv_appliesTo_8_0 = null;

        EObject lv_appliesTo_10_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1058:28: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalSecMFParser.g:1059:1: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalSecMFParser.g:1059:1: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalSecMFParser.g:1059:2: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalSecMFParser.g:1059:2: ( ( ruleQPREF ) )
            // InternalSecMFParser.g:1060:1: ( ruleQPREF )
            {
            // InternalSecMFParser.g:1060:1: ( ruleQPREF )
            // InternalSecMFParser.g:1061:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_24);
            ruleQPREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:1075:2: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==EqualsSignGreaterThanSign) ) {
                alt21=1;
            }
            else if ( (LA21_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSecMFParser.g:1076:2: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_25); 

                        	newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:1081:6: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalSecMFParser.g:1081:6: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalSecMFParser.g:1082:1: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalSecMFParser.g:1082:1: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalSecMFParser.g:1083:3: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FOLLOW_25); 

                            newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "append", true, "+=>");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalSecMFParser.g:1097:3: ( (lv_constant_3_0= Constant ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Constant) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecMFParser.g:1098:1: (lv_constant_3_0= Constant )
                    {
                    // InternalSecMFParser.g:1098:1: (lv_constant_3_0= Constant )
                    // InternalSecMFParser.g:1099:3: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FOLLOW_25); 

                            newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		setWithLastConsumed(current, "constant", true, "constant");
                    	    

                    }


                    }
                    break;

            }

            // InternalSecMFParser.g:1113:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalSecMFParser.g:1113:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalSecMFParser.g:1113:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalSecMFParser.g:1114:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalSecMFParser.g:1114:1: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalSecMFParser.g:1115:3: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {
             
            	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0()); 
            	    
            pushFollow(FOLLOW_26);
            lv_ownedValue_4_0=ruleOptionalModalPropertyValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	        }
                   		add(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_4_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:1131:2: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSecMFParser.g:1132:2: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FOLLOW_25); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	        
            	    // InternalSecMFParser.g:1136:1: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalSecMFParser.g:1137:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalSecMFParser.g:1137:1: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalSecMFParser.g:1138:3: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_26);
            	    lv_ownedValue_6_0=ruleOptionalModalPropertyValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedValue",
            	            		lv_ownedValue_6_0, 
            	            		"org.osate.xtext.aadl2.properties.Properties.OptionalModalPropertyValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            // InternalSecMFParser.g:1154:5: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Applies) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSecMFParser.g:1155:5: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {
                     
                            newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0()); 
                        
                    pushFollow(FOLLOW_6);
                    ruleAppliesToKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    // InternalSecMFParser.g:1162:1: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalSecMFParser.g:1163:1: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalSecMFParser.g:1163:1: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalSecMFParser.g:1164:3: lv_appliesTo_8_0= ruleContainmentPath
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_27);
                    lv_appliesTo_8_0=ruleContainmentPath();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                           		add(
                           			current, 
                           			"appliesTo",
                            		lv_appliesTo_8_0, 
                            		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSecMFParser.g:1180:2: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalSecMFParser.g:1181:2: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_6); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // InternalSecMFParser.g:1185:1: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalSecMFParser.g:1186:1: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalSecMFParser.g:1186:1: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalSecMFParser.g:1187:3: lv_appliesTo_10_0= ruleContainmentPath
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_27);
                    	    lv_appliesTo_10_0=ruleContainmentPath();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getContainedPropertyAssociationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"appliesTo",
                    	            		lv_appliesTo_10_0, 
                    	            		"org.osate.xtext.aadl2.properties.Properties.ContainmentPath");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSecMFParser.g:1203:6: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==In) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecMFParser.g:1204:5: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {
                     
                            newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0()); 
                        
                    pushFollow(FOLLOW_28);
                    ruleInBindingKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    otherlv_12=(Token)match(input,LeftParenthesis,FOLLOW_6); 

                        	newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
                        
                    // InternalSecMFParser.g:1216:1: ( ( ruleQCREF ) )
                    // InternalSecMFParser.g:1217:1: ( ruleQCREF )
                    {
                    // InternalSecMFParser.g:1217:1: ( ruleQCREF )
                    // InternalSecMFParser.g:1218:3: ruleQCREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_29);
                    ruleQCREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,RightParenthesis,FOLLOW_5); 

                        	newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_15, grammarAccess.getContainedPropertyAssociationAccess().getSemicolonKeyword_6());
                

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
    // $ANTLR end "ruleContainedPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPath"
    // InternalSecMFParser.g:1254:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalSecMFParser.g:1255:2: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalSecMFParser.g:1256:2: iv_ruleContainmentPath= ruleContainmentPath EOF
            {
             newCompositeNode(grammarAccess.getContainmentPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainmentPath=ruleContainmentPath();

            state._fsp--;

             current =iv_ruleContainmentPath; 
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
    // $ANTLR end "entryRuleContainmentPath"


    // $ANTLR start "ruleContainmentPath"
    // InternalSecMFParser.g:1263:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1266:28: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalSecMFParser.g:1267:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalSecMFParser.g:1267:1: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalSecMFParser.g:1268:1: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalSecMFParser.g:1268:1: (lv_path_0_0= ruleContainmentPathElement )
            // InternalSecMFParser.g:1269:3: lv_path_0_0= ruleContainmentPathElement
            {
             
            	        newCompositeNode(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_path_0_0=ruleContainmentPathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainmentPathRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleContainmentPath"


    // $ANTLR start "entryRuleOptionalModalPropertyValue"
    // InternalSecMFParser.g:1295:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalSecMFParser.g:1296:2: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalSecMFParser.g:1297:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue();

            state._fsp--;

             current =iv_ruleOptionalModalPropertyValue; 
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
    // $ANTLR end "entryRuleOptionalModalPropertyValue"


    // $ANTLR start "ruleOptionalModalPropertyValue"
    // InternalSecMFParser.g:1304:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
    public final EObject ruleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1307:28: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalSecMFParser.g:1308:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalSecMFParser.g:1308:1: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalSecMFParser.g:1308:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalSecMFParser.g:1308:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalSecMFParser.g:1309:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalSecMFParser.g:1309:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalSecMFParser.g:1310:3: lv_ownedValue_0_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_30);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalModalPropertyValueRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:1326:2: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==In) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==Modes) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalSecMFParser.g:1327:5: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {
                     
                            newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_28);
                    ruleInModesKeywords();

                    state._fsp--;


                            afterParserOrEnumRuleCall();
                        
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_6); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
                        
                    // InternalSecMFParser.g:1339:1: ( (otherlv_3= RULE_ID ) )
                    // InternalSecMFParser.g:1340:1: (otherlv_3= RULE_ID )
                    {
                    // InternalSecMFParser.g:1340:1: (otherlv_3= RULE_ID )
                    // InternalSecMFParser.g:1341:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_31); 

                    		newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0()); 
                    	

                    }


                    }

                    // InternalSecMFParser.g:1352:2: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==Comma) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalSecMFParser.g:1353:2: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_6); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // InternalSecMFParser.g:1357:1: ( (otherlv_5= RULE_ID ) )
                    	    // InternalSecMFParser.g:1358:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalSecMFParser.g:1358:1: (otherlv_5= RULE_ID )
                    	    // InternalSecMFParser.g:1359:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_31); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightParenthesis,FOLLOW_2); 

                        	newLeafNode(otherlv_6, grammarAccess.getOptionalModalPropertyValueAccess().getRightParenthesisKeyword_1_4());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleOptionalModalPropertyValue"


    // $ANTLR start "entryRulePropertyValue"
    // InternalSecMFParser.g:1383:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalSecMFParser.g:1384:2: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalSecMFParser.g:1385:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalSecMFParser.g:1392:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1395:28: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalSecMFParser.g:1396:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalSecMFParser.g:1396:1: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalSecMFParser.g:1397:1: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalSecMFParser.g:1397:1: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalSecMFParser.g:1398:3: lv_ownedValue_0_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_ownedValue_0_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyValueRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRulePropertyExpression"
    // InternalSecMFParser.g:1422:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalSecMFParser.g:1423:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalSecMFParser.g:1424:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;

             current =iv_rulePropertyExpression; 
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
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // InternalSecMFParser.g:1431:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject this_RecordTerm_0 = null;

        EObject this_ReferenceTerm_1 = null;

        EObject this_ComponentClassifierTerm_2 = null;

        EObject this_ComputedTerm_3 = null;

        EObject this_StringTerm_4 = null;

        EObject this_NumericRangeTerm_5 = null;

        EObject this_RealTerm_6 = null;

        EObject this_IntegerTerm_7 = null;

        EObject this_ListTerm_8 = null;

        EObject this_BooleanLiteral_9 = null;

        EObject this_LiteralorReferenceTerm_10 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1434:28: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalSecMFParser.g:1435:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalSecMFParser.g:1435:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt29=11;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // InternalSecMFParser.g:1436:5: this_RecordTerm_0= ruleRecordTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;


                            current = this_RecordTerm_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:1446:5: this_ReferenceTerm_1= ruleReferenceTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ReferenceTerm_1=ruleReferenceTerm();

                    state._fsp--;


                            current = this_ReferenceTerm_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSecMFParser.g:1456:5: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ComponentClassifierTerm_2=ruleComponentClassifierTerm();

                    state._fsp--;


                            current = this_ComponentClassifierTerm_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSecMFParser.g:1466:5: this_ComputedTerm_3= ruleComputedTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ComputedTerm_3=ruleComputedTerm();

                    state._fsp--;


                            current = this_ComputedTerm_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalSecMFParser.g:1476:5: this_StringTerm_4= ruleStringTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_2);
                    this_StringTerm_4=ruleStringTerm();

                    state._fsp--;


                            current = this_StringTerm_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // InternalSecMFParser.g:1486:5: this_NumericRangeTerm_5= ruleNumericRangeTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_2);
                    this_NumericRangeTerm_5=ruleNumericRangeTerm();

                    state._fsp--;


                            current = this_NumericRangeTerm_5;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // InternalSecMFParser.g:1496:5: this_RealTerm_6= ruleRealTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RealTerm_6=ruleRealTerm();

                    state._fsp--;


                            current = this_RealTerm_6;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // InternalSecMFParser.g:1506:5: this_IntegerTerm_7= ruleIntegerTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IntegerTerm_7=ruleIntegerTerm();

                    state._fsp--;


                            current = this_IntegerTerm_7;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // InternalSecMFParser.g:1516:5: this_ListTerm_8= ruleListTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ListTerm_8=ruleListTerm();

                    state._fsp--;


                            current = this_ListTerm_8;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // InternalSecMFParser.g:1526:5: this_BooleanLiteral_9= ruleBooleanLiteral
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_2);
                    this_BooleanLiteral_9=ruleBooleanLiteral();

                    state._fsp--;


                            current = this_BooleanLiteral_9;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // InternalSecMFParser.g:1536:5: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {
                     
                            newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_2);
                    this_LiteralorReferenceTerm_10=ruleLiteralorReferenceTerm();

                    state._fsp--;


                            current = this_LiteralorReferenceTerm_10;
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRuleLiteralorReferenceTerm"
    // InternalSecMFParser.g:1552:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalSecMFParser.g:1553:2: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalSecMFParser.g:1554:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
            {
             newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm();

            state._fsp--;

             current =iv_ruleLiteralorReferenceTerm; 
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
    // $ANTLR end "entryRuleLiteralorReferenceTerm"


    // $ANTLR start "ruleLiteralorReferenceTerm"
    // InternalSecMFParser.g:1561:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1564:28: ( ( ( ruleQPREF ) ) )
            // InternalSecMFParser.g:1565:1: ( ( ruleQPREF ) )
            {
            // InternalSecMFParser.g:1565:1: ( ( ruleQPREF ) )
            // InternalSecMFParser.g:1566:1: ( ruleQPREF )
            {
            // InternalSecMFParser.g:1566:1: ( ruleQPREF )
            // InternalSecMFParser.g:1567:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0()); 
            	    
            pushFollow(FOLLOW_2);
            ruleQPREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleLiteralorReferenceTerm"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalSecMFParser.g:1589:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalSecMFParser.g:1590:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalSecMFParser.g:1591:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalSecMFParser.g:1598:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1601:28: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalSecMFParser.g:1602:1: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalSecMFParser.g:1602:1: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalSecMFParser.g:1602:2: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalSecMFParser.g:1602:2: ()
            // InternalSecMFParser.g:1603:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
                        current);
                

            }

            // InternalSecMFParser.g:1608:2: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==True) ) {
                alt30=1;
            }
            else if ( (LA30_0==False) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSecMFParser.g:1608:3: ( (lv_value_1_0= True ) )
                    {
                    // InternalSecMFParser.g:1608:3: ( (lv_value_1_0= True ) )
                    // InternalSecMFParser.g:1609:1: (lv_value_1_0= True )
                    {
                    // InternalSecMFParser.g:1609:1: (lv_value_1_0= True )
                    // InternalSecMFParser.g:1610:3: lv_value_1_0= True
                    {
                    lv_value_1_0=(Token)match(input,True,FOLLOW_2); 

                            newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    	        }
                           		setWithLastConsumed(current, "value", true, "true");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:1626:2: otherlv_2= False
                    {
                    otherlv_2=(Token)match(input,False,FOLLOW_2); 

                        	newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // InternalSecMFParser.g:1638:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalSecMFParser.g:1639:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalSecMFParser.g:1640:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue; 
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
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalSecMFParser.g:1647:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1650:28: ( ( ( ruleQPREF ) ) )
            // InternalSecMFParser.g:1651:1: ( ( ruleQPREF ) )
            {
            // InternalSecMFParser.g:1651:1: ( ( ruleQPREF ) )
            // InternalSecMFParser.g:1652:1: ( ruleQPREF )
            {
            // InternalSecMFParser.g:1652:1: ( ruleQPREF )
            // InternalSecMFParser.g:1653:3: ruleQPREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0()); 
            	    
            pushFollow(FOLLOW_2);
            ruleQPREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleReferenceTerm"
    // InternalSecMFParser.g:1675:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalSecMFParser.g:1676:2: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalSecMFParser.g:1677:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
            {
             newCompositeNode(grammarAccess.getReferenceTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReferenceTerm=ruleReferenceTerm();

            state._fsp--;

             current =iv_ruleReferenceTerm; 
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
    // $ANTLR end "entryRuleReferenceTerm"


    // $ANTLR start "ruleReferenceTerm"
    // InternalSecMFParser.g:1684:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1687:28: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalSecMFParser.g:1688:1: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalSecMFParser.g:1688:1: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalSecMFParser.g:1689:2: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FOLLOW_28); 

                	newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
                
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
                
            // InternalSecMFParser.g:1698:1: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalSecMFParser.g:1699:1: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalSecMFParser.g:1699:1: (lv_path_2_0= ruleContainmentPathElement )
            // InternalSecMFParser.g:1700:3: lv_path_2_0= ruleContainmentPathElement
            {
             
            	        newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_29);
            lv_path_2_0=ruleContainmentPathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceTermRule());
            	        }
                   		set(
                   			current, 
                   			"path",
                    		lv_path_2_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getReferenceTermAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleReferenceTerm"


    // $ANTLR start "entryRuleRecordTerm"
    // InternalSecMFParser.g:1729:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalSecMFParser.g:1730:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalSecMFParser.g:1731:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
             newCompositeNode(grammarAccess.getRecordTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;

             current =iv_ruleRecordTerm; 
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
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // InternalSecMFParser.g:1738:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1741:28: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalSecMFParser.g:1742:1: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalSecMFParser.g:1742:1: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalSecMFParser.g:1743:2: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_6); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
                
            // InternalSecMFParser.g:1747:1: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSecMFParser.g:1748:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalSecMFParser.g:1748:1: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalSecMFParser.g:1749:3: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_32);
            	    lv_ownedFieldValue_1_0=ruleFieldPropertyAssociation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"ownedFieldValue",
            	            		lv_ownedFieldValue_1_0, 
            	            		"org.osate.xtext.aadl2.properties.Properties.FieldPropertyAssociation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightSquareBracketKeyword_2());
                

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
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleComputedTerm"
    // InternalSecMFParser.g:1780:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalSecMFParser.g:1781:2: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalSecMFParser.g:1782:2: iv_ruleComputedTerm= ruleComputedTerm EOF
            {
             newCompositeNode(grammarAccess.getComputedTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComputedTerm=ruleComputedTerm();

            state._fsp--;

             current =iv_ruleComputedTerm; 
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
    // $ANTLR end "entryRuleComputedTerm"


    // $ANTLR start "ruleComputedTerm"
    // InternalSecMFParser.g:1789:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1792:28: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalSecMFParser.g:1793:1: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalSecMFParser.g:1793:1: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalSecMFParser.g:1794:2: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FOLLOW_28); 

                	newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
                
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
                
            // InternalSecMFParser.g:1803:1: ( (lv_function_2_0= RULE_ID ) )
            // InternalSecMFParser.g:1804:1: (lv_function_2_0= RULE_ID )
            {
            // InternalSecMFParser.g:1804:1: (lv_function_2_0= RULE_ID )
            // InternalSecMFParser.g:1805:3: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            			newLeafNode(lv_function_2_0, grammarAccess.getComputedTermAccess().getFunctionIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getComputedTermRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"function",
                    		lv_function_2_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getComputedTermAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleComputedTerm"


    // $ANTLR start "entryRuleComponentClassifierTerm"
    // InternalSecMFParser.g:1834:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalSecMFParser.g:1835:2: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalSecMFParser.g:1836:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
            {
             newCompositeNode(grammarAccess.getComponentClassifierTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm();

            state._fsp--;

             current =iv_ruleComponentClassifierTerm; 
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
    // $ANTLR end "entryRuleComponentClassifierTerm"


    // $ANTLR start "ruleComponentClassifierTerm"
    // InternalSecMFParser.g:1843:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1846:28: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalSecMFParser.g:1847:1: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalSecMFParser.g:1847:1: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalSecMFParser.g:1848:2: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FOLLOW_28); 

                	newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
                
            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_6); 

                	newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
                
            // InternalSecMFParser.g:1857:1: ( ( ruleQCREF ) )
            // InternalSecMFParser.g:1858:1: ( ruleQCREF )
            {
            // InternalSecMFParser.g:1858:1: ( ruleQCREF )
            // InternalSecMFParser.g:1859:3: ruleQCREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getComponentClassifierTermRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_29);
            ruleQCREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getComponentClassifierTermAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleComponentClassifierTerm"


    // $ANTLR start "entryRuleListTerm"
    // InternalSecMFParser.g:1886:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalSecMFParser.g:1887:2: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalSecMFParser.g:1888:2: iv_ruleListTerm= ruleListTerm EOF
            {
             newCompositeNode(grammarAccess.getListTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;

             current =iv_ruleListTerm; 
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
    // $ANTLR end "entryRuleListTerm"


    // $ANTLR start "ruleListTerm"
    // InternalSecMFParser.g:1895:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1898:28: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalSecMFParser.g:1899:1: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalSecMFParser.g:1899:1: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalSecMFParser.g:1899:2: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalSecMFParser.g:1899:2: ()
            // InternalSecMFParser.g:1900:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListTermAccess().getListValueAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FOLLOW_33); 

                	newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
                
            // InternalSecMFParser.g:1910:1: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=Classifier && LA33_0<=Reference)||LA33_0==Compute||LA33_0==False||LA33_0==True||LA33_0==LeftParenthesis||LA33_0==PlusSign||LA33_0==HyphenMinus||LA33_0==LeftSquareBracket||LA33_0==RULE_INTEGER_LIT||LA33_0==RULE_REAL_LIT||(LA33_0>=RULE_STRING && LA33_0<=RULE_ID)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSecMFParser.g:1910:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalSecMFParser.g:1910:2: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalSecMFParser.g:1911:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalSecMFParser.g:1911:1: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalSecMFParser.g:1912:3: lv_ownedListElement_2_0= rulePropertyExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_31);
                    lv_ownedListElement_2_0=rulePropertyExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListTermRule());
                    	        }
                           		add(
                           			current, 
                           			"ownedListElement",
                            		lv_ownedListElement_2_0, 
                            		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalSecMFParser.g:1928:2: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalSecMFParser.g:1929:2: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_25); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // InternalSecMFParser.g:1933:1: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalSecMFParser.g:1934:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalSecMFParser.g:1934:1: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalSecMFParser.g:1935:3: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_31);
                    	    lv_ownedListElement_4_0=rulePropertyExpression();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getListTermRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"ownedListElement",
                    	            		lv_ownedListElement_4_0, 
                    	            		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getListTermAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleListTerm"


    // $ANTLR start "entryRuleFieldPropertyAssociation"
    // InternalSecMFParser.g:1964:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalSecMFParser.g:1965:2: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalSecMFParser.g:1966:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
            {
             newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation();

            state._fsp--;

             current =iv_ruleFieldPropertyAssociation; 
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
    // $ANTLR end "entryRuleFieldPropertyAssociation"


    // $ANTLR start "ruleFieldPropertyAssociation"
    // InternalSecMFParser.g:1973:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:1976:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalSecMFParser.g:1977:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalSecMFParser.g:1977:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalSecMFParser.g:1977:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalSecMFParser.g:1977:2: ( (otherlv_0= RULE_ID ) )
            // InternalSecMFParser.g:1978:1: (otherlv_0= RULE_ID )
            {
            // InternalSecMFParser.g:1978:1: (otherlv_0= RULE_ID )
            // InternalSecMFParser.g:1979:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_34); 

            		newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0()); 
            	

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_25); 

                	newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // InternalSecMFParser.g:1995:1: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalSecMFParser.g:1996:1: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalSecMFParser.g:1996:1: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalSecMFParser.g:1997:3: lv_ownedValue_2_0= rulePropertyExpression
            {
             
            	        newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_5);
            lv_ownedValue_2_0=rulePropertyExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFieldPropertyAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"ownedValue",
                    		lv_ownedValue_2_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.PropertyExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,Semicolon,FOLLOW_2); 

                	newLeafNode(otherlv_3, grammarAccess.getFieldPropertyAssociationAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleFieldPropertyAssociation"


    // $ANTLR start "entryRuleContainmentPathElement"
    // InternalSecMFParser.g:2026:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalSecMFParser.g:2027:2: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalSecMFParser.g:2028:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
            {
             newCompositeNode(grammarAccess.getContainmentPathElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainmentPathElement=ruleContainmentPathElement();

            state._fsp--;

             current =iv_ruleContainmentPathElement; 
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
    // $ANTLR end "entryRuleContainmentPathElement"


    // $ANTLR start "ruleContainmentPathElement"
    // InternalSecMFParser.g:2035:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2038:28: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalSecMFParser.g:2039:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalSecMFParser.g:2039:1: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalSecMFParser.g:2039:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalSecMFParser.g:2039:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalSecMFParser.g:2039:3: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalSecMFParser.g:2039:3: ( (otherlv_0= RULE_ID ) )
            // InternalSecMFParser.g:2040:1: (otherlv_0= RULE_ID )
            {
            // InternalSecMFParser.g:2040:1: (otherlv_0= RULE_ID )
            // InternalSecMFParser.g:2041:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainmentPathElementRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            		newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0()); 
            	

            }


            }

            // InternalSecMFParser.g:2052:2: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==LeftSquareBracket) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalSecMFParser.g:2053:1: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalSecMFParser.g:2053:1: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalSecMFParser.g:2054:3: lv_arrayRange_1_0= ruleArrayRange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_35);
            	    lv_arrayRange_1_0=ruleArrayRange();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arrayRange",
            	            		lv_arrayRange_1_0, 
            	            		"org.osate.xtext.aadl2.properties.Properties.ArrayRange");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            // InternalSecMFParser.g:2070:4: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==FullStop) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSecMFParser.g:2071:2: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FOLLOW_6); 

                        	newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                        
                    // InternalSecMFParser.g:2075:1: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalSecMFParser.g:2076:1: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalSecMFParser.g:2076:1: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalSecMFParser.g:2077:3: lv_path_3_0= ruleContainmentPathElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_path_3_0=ruleContainmentPathElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainmentPathElementRule());
                    	        }
                           		set(
                           			current, 
                           			"path",
                            		lv_path_3_0, 
                            		"org.osate.xtext.aadl2.properties.Properties.ContainmentPathElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleContainmentPathElement"


    // $ANTLR start "entryRulePlusMinus"
    // InternalSecMFParser.g:2103:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalSecMFParser.g:2104:1: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalSecMFParser.g:2105:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus.getText(); 
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
    // $ANTLR end "entryRulePlusMinus"


    // $ANTLR start "rulePlusMinus"
    // InternalSecMFParser.g:2112:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2116:6: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalSecMFParser.g:2117:1: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalSecMFParser.g:2117:1: (kw= PlusSign | kw= HyphenMinus )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==PlusSign) ) {
                alt36=1;
            }
            else if ( (LA36_0==HyphenMinus) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecMFParser.g:2118:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:2125:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPlusMinusAccess().getHyphenMinusKeyword_1()); 
                        

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
    // $ANTLR end "rulePlusMinus"


    // $ANTLR start "entryRuleStringTerm"
    // InternalSecMFParser.g:2138:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalSecMFParser.g:2139:2: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalSecMFParser.g:2140:2: iv_ruleStringTerm= ruleStringTerm EOF
            {
             newCompositeNode(grammarAccess.getStringTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringTerm=ruleStringTerm();

            state._fsp--;

             current =iv_ruleStringTerm; 
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
    // $ANTLR end "entryRuleStringTerm"


    // $ANTLR start "ruleStringTerm"
    // InternalSecMFParser.g:2147:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2150:28: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalSecMFParser.g:2151:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalSecMFParser.g:2151:1: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalSecMFParser.g:2152:1: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalSecMFParser.g:2152:1: (lv_value_0_0= ruleNoQuoteString )
            // InternalSecMFParser.g:2153:3: lv_value_0_0= ruleNoQuoteString
            {
             
            	        newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleNoQuoteString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStringTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.NoQuoteString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleStringTerm"


    // $ANTLR start "entryRuleNoQuoteString"
    // InternalSecMFParser.g:2177:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalSecMFParser.g:2178:1: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalSecMFParser.g:2179:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
             newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;

             current =iv_ruleNoQuoteString.getText(); 
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
    // $ANTLR end "entryRuleNoQuoteString"


    // $ANTLR start "ruleNoQuoteString"
    // InternalSecMFParser.g:2186:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2190:6: (this_STRING_0= RULE_STRING )
            // InternalSecMFParser.g:2191:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getNoQuoteStringAccess().getSTRINGTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleNoQuoteString"


    // $ANTLR start "entryRuleArrayRange"
    // InternalSecMFParser.g:2206:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalSecMFParser.g:2207:2: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalSecMFParser.g:2208:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
             newCompositeNode(grammarAccess.getArrayRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;

             current =iv_ruleArrayRange; 
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
    // $ANTLR end "entryRuleArrayRange"


    // $ANTLR start "ruleArrayRange"
    // InternalSecMFParser.g:2215:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2218:28: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalSecMFParser.g:2219:1: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalSecMFParser.g:2219:1: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalSecMFParser.g:2219:2: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalSecMFParser.g:2219:2: ()
            // InternalSecMFParser.g:2220:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_36); 

                	newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
                
            // InternalSecMFParser.g:2230:1: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalSecMFParser.g:2231:1: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalSecMFParser.g:2231:1: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalSecMFParser.g:2232:3: lv_lowerBound_2_0= ruleINTVALUE
            {
             
            	        newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_37);
            lv_lowerBound_2_0=ruleINTVALUE();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
            	        }
                   		set(
                   			current, 
                   			"lowerBound",
                    		lv_lowerBound_2_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:2248:2: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==FullStopFullStop) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSecMFParser.g:2249:2: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FOLLOW_36); 

                        	newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                        
                    // InternalSecMFParser.g:2253:1: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalSecMFParser.g:2254:1: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalSecMFParser.g:2254:1: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalSecMFParser.g:2255:3: lv_upperBound_4_0= ruleINTVALUE
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_38);
                    lv_upperBound_4_0=ruleINTVALUE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayRangeRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_4_0, 
                            		"org.osate.xtext.aadl2.properties.Properties.INTVALUE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                	newLeafNode(otherlv_5, grammarAccess.getArrayRangeAccess().getRightSquareBracketKeyword_4());
                

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
    // $ANTLR end "ruleArrayRange"


    // $ANTLR start "entryRuleSignedConstant"
    // InternalSecMFParser.g:2284:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalSecMFParser.g:2285:2: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalSecMFParser.g:2286:2: iv_ruleSignedConstant= ruleSignedConstant EOF
            {
             newCompositeNode(grammarAccess.getSignedConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedConstant=ruleSignedConstant();

            state._fsp--;

             current =iv_ruleSignedConstant; 
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
    // $ANTLR end "entryRuleSignedConstant"


    // $ANTLR start "ruleSignedConstant"
    // InternalSecMFParser.g:2293:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2296:28: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalSecMFParser.g:2297:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalSecMFParser.g:2297:1: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalSecMFParser.g:2297:2: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalSecMFParser.g:2297:2: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalSecMFParser.g:2298:1: (lv_op_0_0= rulePlusMinus )
            {
            // InternalSecMFParser.g:2298:1: (lv_op_0_0= rulePlusMinus )
            // InternalSecMFParser.g:2299:3: lv_op_0_0= rulePlusMinus
            {
             
            	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_39);
            lv_op_0_0=rulePlusMinus();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.PlusMinus");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:2315:2: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalSecMFParser.g:2316:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalSecMFParser.g:2316:1: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalSecMFParser.g:2317:3: lv_ownedPropertyExpression_1_0= ruleConstantValue
            {
             
            	        newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_2);
            lv_ownedPropertyExpression_1_0=ruleConstantValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignedConstantRule());
            	        }
                   		add(
                   			current, 
                   			"ownedPropertyExpression",
                    		lv_ownedPropertyExpression_1_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.ConstantValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleSignedConstant"


    // $ANTLR start "entryRuleIntegerTerm"
    // InternalSecMFParser.g:2341:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalSecMFParser.g:2342:2: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalSecMFParser.g:2343:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
            {
             newCompositeNode(grammarAccess.getIntegerTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerTerm=ruleIntegerTerm();

            state._fsp--;

             current =iv_ruleIntegerTerm; 
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
    // $ANTLR end "entryRuleIntegerTerm"


    // $ANTLR start "ruleIntegerTerm"
    // InternalSecMFParser.g:2350:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2353:28: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalSecMFParser.g:2354:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalSecMFParser.g:2354:1: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalSecMFParser.g:2354:2: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalSecMFParser.g:2354:2: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalSecMFParser.g:2355:1: (lv_value_0_0= ruleSignedInt )
            {
            // InternalSecMFParser.g:2355:1: (lv_value_0_0= ruleSignedInt )
            // InternalSecMFParser.g:2356:3: lv_value_0_0= ruleSignedInt
            {
             
            	        newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_value_0_0=ruleSignedInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIntegerTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.SignedInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:2372:2: ( (otherlv_1= RULE_ID ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSecMFParser.g:2373:1: (otherlv_1= RULE_ID )
                    {
                    // InternalSecMFParser.g:2373:1: (otherlv_1= RULE_ID )
                    // InternalSecMFParser.g:2374:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntegerTermRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_1, grammarAccess.getIntegerTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleIntegerTerm"


    // $ANTLR start "entryRuleSignedInt"
    // InternalSecMFParser.g:2393:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalSecMFParser.g:2394:1: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalSecMFParser.g:2395:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt.getText(); 
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
    // $ANTLR end "entryRuleSignedInt"


    // $ANTLR start "ruleSignedInt"
    // InternalSecMFParser.g:2402:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2406:6: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalSecMFParser.g:2407:1: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalSecMFParser.g:2407:1: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalSecMFParser.g:2407:2: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalSecMFParser.g:2407:2: (kw= PlusSign | kw= HyphenMinus )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==PlusSign) ) {
                alt39=1;
            }
            else if ( (LA39_0==HyphenMinus) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // InternalSecMFParser.g:2408:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FOLLOW_36); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:2415:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_36); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_INTEGER_LIT_2=(Token)match(input,RULE_INTEGER_LIT,FOLLOW_2); 

            		current.merge(this_INTEGER_LIT_2);
                
             
                newLeafNode(this_INTEGER_LIT_2, grammarAccess.getSignedIntAccess().getINTEGER_LITTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleSignedInt"


    // $ANTLR start "entryRuleRealTerm"
    // InternalSecMFParser.g:2435:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalSecMFParser.g:2436:2: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalSecMFParser.g:2437:2: iv_ruleRealTerm= ruleRealTerm EOF
            {
             newCompositeNode(grammarAccess.getRealTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealTerm=ruleRealTerm();

            state._fsp--;

             current =iv_ruleRealTerm; 
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
    // $ANTLR end "entryRuleRealTerm"


    // $ANTLR start "ruleRealTerm"
    // InternalSecMFParser.g:2444:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2447:28: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalSecMFParser.g:2448:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalSecMFParser.g:2448:1: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalSecMFParser.g:2448:2: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalSecMFParser.g:2448:2: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalSecMFParser.g:2449:1: (lv_value_0_0= ruleSignedReal )
            {
            // InternalSecMFParser.g:2449:1: (lv_value_0_0= ruleSignedReal )
            // InternalSecMFParser.g:2450:3: lv_value_0_0= ruleSignedReal
            {
             
            	        newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_16);
            lv_value_0_0=ruleSignedReal();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRealTermRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.SignedReal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:2466:2: ( (otherlv_1= RULE_ID ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSecMFParser.g:2467:1: (otherlv_1= RULE_ID )
                    {
                    // InternalSecMFParser.g:2467:1: (otherlv_1= RULE_ID )
                    // InternalSecMFParser.g:2468:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRealTermRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		newLeafNode(otherlv_1, grammarAccess.getRealTermAccess().getUnitUnitLiteralCrossReference_1_0()); 
                    	

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleRealTerm"


    // $ANTLR start "entryRuleSignedReal"
    // InternalSecMFParser.g:2487:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalSecMFParser.g:2488:1: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalSecMFParser.g:2489:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
             newCompositeNode(grammarAccess.getSignedRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;

             current =iv_ruleSignedReal.getText(); 
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
    // $ANTLR end "entryRuleSignedReal"


    // $ANTLR start "ruleSignedReal"
    // InternalSecMFParser.g:2496:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2500:6: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalSecMFParser.g:2501:1: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalSecMFParser.g:2501:1: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalSecMFParser.g:2501:2: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalSecMFParser.g:2501:2: (kw= PlusSign | kw= HyphenMinus )?
            int alt41=3;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==PlusSign) ) {
                alt41=1;
            }
            else if ( (LA41_0==HyphenMinus) ) {
                alt41=2;
            }
            switch (alt41) {
                case 1 :
                    // InternalSecMFParser.g:2502:2: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FOLLOW_40); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:2509:2: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FOLLOW_40); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1()); 
                        

                    }
                    break;

            }

            this_REAL_LIT_2=(Token)match(input,RULE_REAL_LIT,FOLLOW_2); 

            		current.merge(this_REAL_LIT_2);
                
             
                newLeafNode(this_REAL_LIT_2, grammarAccess.getSignedRealAccess().getREAL_LITTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleSignedReal"


    // $ANTLR start "entryRuleNumericRangeTerm"
    // InternalSecMFParser.g:2529:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalSecMFParser.g:2530:2: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalSecMFParser.g:2531:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
            {
             newCompositeNode(grammarAccess.getNumericRangeTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericRangeTerm=ruleNumericRangeTerm();

            state._fsp--;

             current =iv_ruleNumericRangeTerm; 
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
    // $ANTLR end "entryRuleNumericRangeTerm"


    // $ANTLR start "ruleNumericRangeTerm"
    // InternalSecMFParser.g:2538:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2541:28: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalSecMFParser.g:2542:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalSecMFParser.g:2542:1: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalSecMFParser.g:2542:2: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalSecMFParser.g:2542:2: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalSecMFParser.g:2543:1: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalSecMFParser.g:2543:1: (lv_minimum_0_0= ruleNumAlt )
            // InternalSecMFParser.g:2544:3: lv_minimum_0_0= ruleNumAlt
            {
             
            	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_41);
            lv_minimum_0_0=ruleNumAlt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
            	        }
                   		set(
                   			current, 
                   			"minimum",
                    		lv_minimum_0_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,FullStopFullStop,FOLLOW_39); 

                	newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
                
            // InternalSecMFParser.g:2565:1: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalSecMFParser.g:2566:1: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalSecMFParser.g:2566:1: (lv_maximum_2_0= ruleNumAlt )
            // InternalSecMFParser.g:2567:3: lv_maximum_2_0= ruleNumAlt
            {
             
            	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_42);
            lv_maximum_2_0=ruleNumAlt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
            	        }
                   		set(
                   			current, 
                   			"maximum",
                    		lv_maximum_2_0, 
                    		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalSecMFParser.g:2583:2: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Delta) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalSecMFParser.g:2584:2: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FOLLOW_39); 

                        	newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                        
                    // InternalSecMFParser.g:2588:1: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalSecMFParser.g:2589:1: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalSecMFParser.g:2589:1: (lv_delta_4_0= ruleNumAlt )
                    // InternalSecMFParser.g:2590:3: lv_delta_4_0= ruleNumAlt
                    {
                     
                    	        newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_2);
                    lv_delta_4_0=ruleNumAlt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNumericRangeTermRule());
                    	        }
                           		set(
                           			current, 
                           			"delta",
                            		lv_delta_4_0, 
                            		"org.osate.xtext.aadl2.properties.Properties.NumAlt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleNumericRangeTerm"


    // $ANTLR start "entryRuleNumAlt"
    // InternalSecMFParser.g:2614:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalSecMFParser.g:2615:2: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalSecMFParser.g:2616:2: iv_ruleNumAlt= ruleNumAlt EOF
            {
             newCompositeNode(grammarAccess.getNumAltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumAlt=ruleNumAlt();

            state._fsp--;

             current =iv_ruleNumAlt; 
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
    // $ANTLR end "entryRuleNumAlt"


    // $ANTLR start "ruleNumAlt"
    // InternalSecMFParser.g:2623:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;


         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2626:28: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalSecMFParser.g:2627:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalSecMFParser.g:2627:1: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt43=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt43=3;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt43=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt43=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt43=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt43=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt43=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt43=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalSecMFParser.g:2628:5: this_RealTerm_0= ruleRealTerm
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_2);
                    this_RealTerm_0=ruleRealTerm();

                    state._fsp--;


                            current = this_RealTerm_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:2638:5: this_IntegerTerm_1= ruleIntegerTerm
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_2);
                    this_IntegerTerm_1=ruleIntegerTerm();

                    state._fsp--;


                            current = this_IntegerTerm_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalSecMFParser.g:2648:5: this_SignedConstant_2= ruleSignedConstant
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_2);
                    this_SignedConstant_2=ruleSignedConstant();

                    state._fsp--;


                            current = this_SignedConstant_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalSecMFParser.g:2658:5: this_ConstantValue_3= ruleConstantValue
                    {
                     
                            newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_2);
                    this_ConstantValue_3=ruleConstantValue();

                    state._fsp--;


                            current = this_ConstantValue_3;
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleNumAlt"


    // $ANTLR start "entryRuleAppliesToKeywords"
    // InternalSecMFParser.g:2674:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalSecMFParser.g:2675:1: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalSecMFParser.g:2676:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
            {
             newCompositeNode(grammarAccess.getAppliesToKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppliesToKeywords=ruleAppliesToKeywords();

            state._fsp--;

             current =iv_ruleAppliesToKeywords.getText(); 
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
    // $ANTLR end "entryRuleAppliesToKeywords"


    // $ANTLR start "ruleAppliesToKeywords"
    // InternalSecMFParser.g:2683:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2687:6: ( (kw= Applies kw= To ) )
            // InternalSecMFParser.g:2688:1: (kw= Applies kw= To )
            {
            // InternalSecMFParser.g:2688:1: (kw= Applies kw= To )
            // InternalSecMFParser.g:2689:2: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FOLLOW_43); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0()); 
                
            kw=(Token)match(input,To,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getToKeyword_1()); 
                

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
    // $ANTLR end "ruleAppliesToKeywords"


    // $ANTLR start "entryRuleInBindingKeywords"
    // InternalSecMFParser.g:2708:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalSecMFParser.g:2709:1: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalSecMFParser.g:2710:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
            {
             newCompositeNode(grammarAccess.getInBindingKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInBindingKeywords=ruleInBindingKeywords();

            state._fsp--;

             current =iv_ruleInBindingKeywords.getText(); 
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
    // $ANTLR end "entryRuleInBindingKeywords"


    // $ANTLR start "ruleInBindingKeywords"
    // InternalSecMFParser.g:2717:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2721:6: ( (kw= In kw= Binding ) )
            // InternalSecMFParser.g:2722:1: (kw= In kw= Binding )
            {
            // InternalSecMFParser.g:2722:1: (kw= In kw= Binding )
            // InternalSecMFParser.g:2723:2: kw= In kw= Binding
            {
            kw=(Token)match(input,In,FOLLOW_44); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0()); 
                
            kw=(Token)match(input,Binding,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getBindingKeyword_1()); 
                

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
    // $ANTLR end "ruleInBindingKeywords"


    // $ANTLR start "entryRuleInModesKeywords"
    // InternalSecMFParser.g:2742:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalSecMFParser.g:2743:1: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalSecMFParser.g:2744:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
            {
             newCompositeNode(grammarAccess.getInModesKeywordsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInModesKeywords=ruleInModesKeywords();

            state._fsp--;

             current =iv_ruleInModesKeywords.getText(); 
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
    // $ANTLR end "entryRuleInModesKeywords"


    // $ANTLR start "ruleInModesKeywords"
    // InternalSecMFParser.g:2751:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2755:6: ( (kw= In kw= Modes ) )
            // InternalSecMFParser.g:2756:1: (kw= In kw= Modes )
            {
            // InternalSecMFParser.g:2756:1: (kw= In kw= Modes )
            // InternalSecMFParser.g:2757:2: kw= In kw= Modes
            {
            kw=(Token)match(input,In,FOLLOW_45); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0()); 
                
            kw=(Token)match(input,Modes,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getModesKeyword_1()); 
                

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
    // $ANTLR end "ruleInModesKeywords"


    // $ANTLR start "entryRuleINTVALUE"
    // InternalSecMFParser.g:2776:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalSecMFParser.g:2777:1: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalSecMFParser.g:2778:2: iv_ruleINTVALUE= ruleINTVALUE EOF
            {
             newCompositeNode(grammarAccess.getINTVALUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleINTVALUE=ruleINTVALUE();

            state._fsp--;

             current =iv_ruleINTVALUE.getText(); 
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
    // $ANTLR end "entryRuleINTVALUE"


    // $ANTLR start "ruleINTVALUE"
    // InternalSecMFParser.g:2785:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2789:6: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalSecMFParser.g:2790:5: this_INTEGER_LIT_0= RULE_INTEGER_LIT
            {
            this_INTEGER_LIT_0=(Token)match(input,RULE_INTEGER_LIT,FOLLOW_2); 

            		current.merge(this_INTEGER_LIT_0);
                
             
                newLeafNode(this_INTEGER_LIT_0, grammarAccess.getINTVALUEAccess().getINTEGER_LITTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleINTVALUE"


    // $ANTLR start "entryRuleQPREF"
    // InternalSecMFParser.g:2807:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalSecMFParser.g:2808:1: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalSecMFParser.g:2809:2: iv_ruleQPREF= ruleQPREF EOF
            {
             newCompositeNode(grammarAccess.getQPREFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;

             current =iv_ruleQPREF.getText(); 
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
    // $ANTLR end "entryRuleQPREF"


    // $ANTLR start "ruleQPREF"
    // InternalSecMFParser.g:2816:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2820:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalSecMFParser.g:2821:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalSecMFParser.g:2821:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalSecMFParser.g:2821:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                
            // InternalSecMFParser.g:2828:1: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==ColonColon) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSecMFParser.g:2829:2: kw= ColonColon this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FOLLOW_6); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
                        
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQCREF"
    // InternalSecMFParser.g:2849:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalSecMFParser.g:2850:1: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalSecMFParser.g:2851:2: iv_ruleQCREF= ruleQCREF EOF
            {
             newCompositeNode(grammarAccess.getQCREFRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;

             current =iv_ruleQCREF.getText(); 
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
    // $ANTLR end "entryRuleQCREF"


    // $ANTLR start "ruleQCREF"
    // InternalSecMFParser.g:2858:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2862:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalSecMFParser.g:2863:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalSecMFParser.g:2863:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalSecMFParser.g:2863:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalSecMFParser.g:2863:2: (this_ID_0= RULE_ID kw= ColonColon )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    int LA45_1 = input.LA(2);

                    if ( (LA45_1==ColonColon) ) {
                        alt45=1;
                    }


                }


                switch (alt45) {
            	case 1 :
            	    // InternalSecMFParser.g:2863:7: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,ColonColon,FOLLOW_6); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_47); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1()); 
                
            // InternalSecMFParser.g:2883:1: (kw= FullStop this_ID_4= RULE_ID )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==FullStop) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSecMFParser.g:2884:2: kw= FullStop this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FOLLOW_6); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0()); 
                        
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    		current.merge(this_ID_4);
                        
                     
                        newLeafNode(this_ID_4, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleQCREF"


    // $ANTLR start "entryRuleSTAR"
    // InternalSecMFParser.g:2904:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalSecMFParser.g:2905:1: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalSecMFParser.g:2906:2: iv_ruleSTAR= ruleSTAR EOF
            {
             newCompositeNode(grammarAccess.getSTARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;

             current =iv_ruleSTAR.getText(); 
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
    // $ANTLR end "entryRuleSTAR"


    // $ANTLR start "ruleSTAR"
    // InternalSecMFParser.g:2913:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalSecMFParser.g:2917:6: (kw= Asterisk )
            // InternalSecMFParser.g:2919:2: kw= Asterisk
            {
            kw=(Token)match(input,Asterisk,FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getSTARAccess().getAsteriskKeyword()); 
                

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
    // $ANTLR end "ruleSTAR"

    // Delegated rules


    protected DFA29 dfa29 = new DFA29(this);
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\10\uffff\1\17\1\21\1\23\3\uffff\1\17\1\uffff\1\21\3\uffff\1\23";
    static final String dfa_3s = "\1\6\5\uffff\2\62\3\12\3\uffff\1\12\1\uffff\1\12\1\uffff\1\72\1\uffff\1\12";
    static final String dfa_4s = "\1\72\5\uffff\4\72\1\54\3\uffff\1\54\1\uffff\1\54\1\uffff\1\72\1\uffff\1\54";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\5\uffff\1\11\1\12\1\6\1\uffff\1\7\1\uffff\1\10\1\uffff\1\13\1\uffff";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\3\1\2\4\uffff\1\4\7\uffff\1\14\2\uffff\1\14\14\uffff\1\13\2\uffff\1\6\1\uffff\1\7\3\uffff\1\1\4\uffff\1\11\3\uffff\1\10\2\uffff\1\5\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\11\3\uffff\1\10\3\uffff\1\15",
            "\1\11\3\uffff\1\10\3\uffff\1\15",
            "\1\17\24\uffff\1\15\2\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17\15\uffff\1\16",
            "\1\21\24\uffff\1\15\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21\15\uffff\1\20",
            "\1\23\24\uffff\1\15\1\22\1\uffff\1\23\2\uffff\1\23\2\uffff\1\23\3\uffff\1\23",
            "",
            "",
            "",
            "\1\17\24\uffff\1\15\2\uffff\1\17\2\uffff\1\17\2\uffff\1\17\3\uffff\1\17",
            "",
            "\1\21\24\uffff\1\15\2\uffff\1\21\2\uffff\1\21\2\uffff\1\21\3\uffff\1\21",
            "",
            "\1\24",
            "",
            "\1\23\24\uffff\1\15\2\uffff\1\23\2\uffff\1\23\2\uffff\1\23\3\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1435:1: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0400000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0400000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0400000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000204000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x06442290009012C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000110400000400L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000110400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0400400000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x064422B0009012C0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000240000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000400080000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0444028000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000040000000002L});

}