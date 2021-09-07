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

/** Copyright (c) 2021, Kansas State University
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
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
    // InternalSecMFParser.g:67:1: entryRuleSecMFRoot returns [EObject current=null] : iv_ruleSecMFRoot= ruleSecMFRoot EOF ;
    public final EObject entryRuleSecMFRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecMFRoot = null;


        try {
            // InternalSecMFParser.g:67:50: (iv_ruleSecMFRoot= ruleSecMFRoot EOF )
            // InternalSecMFParser.g:68:2: iv_ruleSecMFRoot= ruleSecMFRoot EOF
            {
             newCompositeNode(grammarAccess.getSecMFRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSecMFRoot=ruleSecMFRoot();

            state._fsp--;

             current =iv_ruleSecMFRoot; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:74:1: ruleSecMFRoot returns [EObject current=null] : ( () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* ) ) ;
    public final EObject ruleSecMFRoot() throws RecognitionException {
        EObject current = null;

        EObject lv_library_1_0 = null;

        EObject lv_subclauses_2_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:80:2: ( ( () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* ) ) )
            // InternalSecMFParser.g:81:2: ( () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* ) )
            {
            // InternalSecMFParser.g:81:2: ( () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* ) )
            // InternalSecMFParser.g:82:3: () ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* )
            {
            // InternalSecMFParser.g:82:3: ()
            // InternalSecMFParser.g:83:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecMFRootAccess().getSecMFRootAction_0(),
            					current);
            			

            }

            // InternalSecMFParser.g:89:3: ( ( (lv_library_1_0= ruleSMFLibrary ) ) | ( (lv_subclauses_2_0= ruleSMFSubclause ) )* )
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
                    // InternalSecMFParser.g:90:4: ( (lv_library_1_0= ruleSMFLibrary ) )
                    {
                    // InternalSecMFParser.g:90:4: ( (lv_library_1_0= ruleSMFLibrary ) )
                    // InternalSecMFParser.g:91:5: (lv_library_1_0= ruleSMFLibrary )
                    {
                    // InternalSecMFParser.g:91:5: (lv_library_1_0= ruleSMFLibrary )
                    // InternalSecMFParser.g:92:6: lv_library_1_0= ruleSMFLibrary
                    {

                    						newCompositeNode(grammarAccess.getSecMFRootAccess().getLibrarySMFLibraryParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
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
                    // InternalSecMFParser.g:110:4: ( (lv_subclauses_2_0= ruleSMFSubclause ) )*
                    {
                    // InternalSecMFParser.g:110:4: ( (lv_subclauses_2_0= ruleSMFSubclause ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==Subclause) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSecMFParser.g:111:5: (lv_subclauses_2_0= ruleSMFSubclause )
                    	    {
                    	    // InternalSecMFParser.g:111:5: (lv_subclauses_2_0= ruleSMFSubclause )
                    	    // InternalSecMFParser.g:112:6: lv_subclauses_2_0= ruleSMFSubclause
                    	    {

                    	    						newCompositeNode(grammarAccess.getSecMFRootAccess().getSubclausesSMFSubclauseParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_3);
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
    // InternalSecMFParser.g:134:1: entryRuleSecModelLibrary returns [EObject current=null] : iv_ruleSecModelLibrary= ruleSecModelLibrary EOF ;
    public final EObject entryRuleSecModelLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecModelLibrary = null;


        try {
            // InternalSecMFParser.g:134:56: (iv_ruleSecModelLibrary= ruleSecModelLibrary EOF )
            // InternalSecMFParser.g:135:2: iv_ruleSecModelLibrary= ruleSecModelLibrary EOF
            {
             newCompositeNode(grammarAccess.getSecModelLibraryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSecModelLibrary=ruleSecModelLibrary();

            state._fsp--;

             current =iv_ruleSecModelLibrary; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:141:1: ruleSecModelLibrary returns [EObject current=null] : ( () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )? ) ;
    public final EObject ruleSecModelLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:147:2: ( ( () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )? ) )
            // InternalSecMFParser.g:148:2: ( () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )? )
            {
            // InternalSecMFParser.g:148:2: ( () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )? )
            // InternalSecMFParser.g:149:3: () ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )?
            {
            // InternalSecMFParser.g:149:3: ()
            // InternalSecMFParser.g:150:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecModelLibraryAccess().getSecModelLibraryAction_0(),
            					current);
            			

            }

            // InternalSecMFParser.g:156:3: ( ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Domain) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSecMFParser.g:157:4: ruleDomainTypesKeywords ( (lv_types_2_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_4= Semicolon
                    {

                    				newCompositeNode(grammarAccess.getSecModelLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_4);
                    ruleDomainTypesKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSecMFParser.g:164:4: ( (lv_types_2_0= ruleSMFTypeDef ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSecMFParser.g:165:5: (lv_types_2_0= ruleSMFTypeDef )
                    	    {
                    	    // InternalSecMFParser.g:165:5: (lv_types_2_0= ruleSMFTypeDef )
                    	    // InternalSecMFParser.g:166:6: lv_types_2_0= ruleSMFTypeDef
                    	    {

                    	    						newCompositeNode(grammarAccess.getSecModelLibraryAccess().getTypesSMFTypeDefParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_4);
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
                    			
                    pushFollow(FollowSets000.FOLLOW_5);
                    ruleEndTypesKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:199:1: entryRuleSMFLibrary returns [EObject current=null] : iv_ruleSMFLibrary= ruleSMFLibrary EOF ;
    public final EObject entryRuleSMFLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFLibrary = null;


        try {
            // InternalSecMFParser.g:199:51: (iv_ruleSMFLibrary= ruleSMFLibrary EOF )
            // InternalSecMFParser.g:200:2: iv_ruleSMFLibrary= ruleSMFLibrary EOF
            {
             newCompositeNode(grammarAccess.getSMFLibraryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSMFLibrary=ruleSMFLibrary();

            state._fsp--;

             current =iv_ruleSMFLibrary; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:206:1: ruleSMFLibrary returns [EObject current=null] : ( ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) ) | (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon ) ) ;
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
            // InternalSecMFParser.g:212:2: ( ( ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) ) | (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon ) ) )
            // InternalSecMFParser.g:213:2: ( ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) ) | (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon ) )
            {
            // InternalSecMFParser.g:213:2: ( ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) ) | (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon ) )
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
                    // InternalSecMFParser.g:214:3: ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) )
                    {
                    // InternalSecMFParser.g:214:3: ( () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? ) )
                    // InternalSecMFParser.g:215:4: () (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? )
                    {
                    // InternalSecMFParser.g:215:4: ()
                    // InternalSecMFParser.g:216:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getSMFLibraryAccess().getSecModelLibraryAction_0_0(),
                    						current);
                    				

                    }

                    // InternalSecMFParser.g:222:4: (otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )? )
                    // InternalSecMFParser.g:223:5: otherlv_1= Library ( (lv_name_2_0= ruleQEMREF ) ) ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )?
                    {
                    otherlv_1=(Token)match(input,Library,FollowSets000.FOLLOW_6); 

                    					newLeafNode(otherlv_1, grammarAccess.getSMFLibraryAccess().getLibraryKeyword_0_1_0());
                    				
                    // InternalSecMFParser.g:227:5: ( (lv_name_2_0= ruleQEMREF ) )
                    // InternalSecMFParser.g:228:6: (lv_name_2_0= ruleQEMREF )
                    {
                    // InternalSecMFParser.g:228:6: (lv_name_2_0= ruleQEMREF )
                    // InternalSecMFParser.g:229:7: lv_name_2_0= ruleQEMREF
                    {

                    							newCompositeNode(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_0_1_1_0());
                    						
                    pushFollow(FollowSets000.FOLLOW_7);
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

                    // InternalSecMFParser.g:246:5: ( ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==Domain) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalSecMFParser.g:247:6: ruleDomainTypesKeywords ( (lv_types_4_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_6= Semicolon
                            {

                            						newCompositeNode(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_0_1_2_0());
                            					
                            pushFollow(FollowSets000.FOLLOW_4);
                            ruleDomainTypesKeywords();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					
                            // InternalSecMFParser.g:254:6: ( (lv_types_4_0= ruleSMFTypeDef ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==RULE_ID) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalSecMFParser.g:255:7: (lv_types_4_0= ruleSMFTypeDef )
                            	    {
                            	    // InternalSecMFParser.g:255:7: (lv_types_4_0= ruleSMFTypeDef )
                            	    // InternalSecMFParser.g:256:8: lv_types_4_0= ruleSMFTypeDef
                            	    {

                            	    								newCompositeNode(grammarAccess.getSMFLibraryAccess().getTypesSMFTypeDefParserRuleCall_0_1_2_1_0());
                            	    							
                            	    pushFollow(FollowSets000.FOLLOW_4);
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
                            					
                            pushFollow(FollowSets000.FOLLOW_5);
                            ruleEndTypesKeywords();

                            state._fsp--;


                            						afterParserOrEnumRuleCall();
                            					
                            otherlv_6=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); 

                            						newLeafNode(otherlv_6, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_0_1_2_3());
                            					

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:288:3: (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon )
                    {
                    // InternalSecMFParser.g:288:3: (otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon )
                    // InternalSecMFParser.g:289:4: otherlv_7= Package ( (lv_name_8_0= ruleQEMREF ) ) otherlv_9= Public otherlv_10= Annex this_ID_11= RULE_ID otherlv_12= LeftCurlyBracketAsteriskAsterisk ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )? otherlv_17= AsteriskAsteriskRightCurlyBracket otherlv_18= Semicolon otherlv_19= End ruleQEMREF otherlv_21= Semicolon
                    {
                    otherlv_7=(Token)match(input,Package,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getSMFLibraryAccess().getPackageKeyword_1_0());
                    			
                    // InternalSecMFParser.g:293:4: ( (lv_name_8_0= ruleQEMREF ) )
                    // InternalSecMFParser.g:294:5: (lv_name_8_0= ruleQEMREF )
                    {
                    // InternalSecMFParser.g:294:5: (lv_name_8_0= ruleQEMREF )
                    // InternalSecMFParser.g:295:6: lv_name_8_0= ruleQEMREF
                    {

                    						newCompositeNode(grammarAccess.getSMFLibraryAccess().getNameQEMREFParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_8);
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

                    otherlv_9=(Token)match(input,Public,FollowSets000.FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getSMFLibraryAccess().getPublicKeyword_1_2());
                    			
                    otherlv_10=(Token)match(input,Annex,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getSMFLibraryAccess().getAnnexKeyword_1_3());
                    			
                    this_ID_11=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_10); 

                    				newLeafNode(this_ID_11, grammarAccess.getSMFLibraryAccess().getIDTerminalRuleCall_1_4());
                    			
                    otherlv_12=(Token)match(input,LeftCurlyBracketAsteriskAsterisk,FollowSets000.FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getSMFLibraryAccess().getLeftCurlyBracketAsteriskAsteriskKeyword_1_5());
                    			
                    // InternalSecMFParser.g:328:4: ( ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Domain) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalSecMFParser.g:329:5: ruleDomainTypesKeywords ( (lv_type_14_0= ruleSMFTypeDef ) )* ruleEndTypesKeywords otherlv_16= Semicolon
                            {

                            					newCompositeNode(grammarAccess.getSMFLibraryAccess().getDomainTypesKeywordsParserRuleCall_1_6_0());
                            				
                            pushFollow(FollowSets000.FOLLOW_4);
                            ruleDomainTypesKeywords();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            // InternalSecMFParser.g:336:5: ( (lv_type_14_0= ruleSMFTypeDef ) )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==RULE_ID) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // InternalSecMFParser.g:337:6: (lv_type_14_0= ruleSMFTypeDef )
                            	    {
                            	    // InternalSecMFParser.g:337:6: (lv_type_14_0= ruleSMFTypeDef )
                            	    // InternalSecMFParser.g:338:7: lv_type_14_0= ruleSMFTypeDef
                            	    {

                            	    							newCompositeNode(grammarAccess.getSMFLibraryAccess().getTypeSMFTypeDefParserRuleCall_1_6_1_0());
                            	    						
                            	    pushFollow(FollowSets000.FOLLOW_4);
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
                            				
                            pushFollow(FollowSets000.FOLLOW_5);
                            ruleEndTypesKeywords();

                            state._fsp--;


                            					afterParserOrEnumRuleCall();
                            				
                            otherlv_16=(Token)match(input,Semicolon,FollowSets000.FOLLOW_12); 

                            					newLeafNode(otherlv_16, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_6_3());
                            				

                            }
                            break;

                    }

                    otherlv_17=(Token)match(input,AsteriskAsteriskRightCurlyBracket,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getSMFLibraryAccess().getAsteriskAsteriskRightCurlyBracketKeyword_1_7());
                    			
                    otherlv_18=(Token)match(input,Semicolon,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getSMFLibraryAccess().getSemicolonKeyword_1_8());
                    			
                    otherlv_19=(Token)match(input,End,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_19, grammarAccess.getSMFLibraryAccess().getEndKeyword_1_9());
                    			

                    				newCompositeNode(grammarAccess.getSMFLibraryAccess().getQEMREFParserRuleCall_1_10());
                    			
                    pushFollow(FollowSets000.FOLLOW_5);
                    ruleQEMREF();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_21=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:395:1: entryRuleSMFSubclause returns [EObject current=null] : iv_ruleSMFSubclause= ruleSMFSubclause EOF ;
    public final EObject entryRuleSMFSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFSubclause = null;


        try {
            // InternalSecMFParser.g:395:53: (iv_ruleSMFSubclause= ruleSMFSubclause EOF )
            // InternalSecMFParser.g:396:2: iv_ruleSMFSubclause= ruleSMFSubclause EOF
            {
             newCompositeNode(grammarAccess.getSMFSubclauseRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSMFSubclause=ruleSMFSubclause();

            state._fsp--;

             current =iv_ruleSMFSubclause; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:402:1: ruleSMFSubclause returns [EObject current=null] : ( () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )? ) ;
    public final EObject ruleSMFSubclause() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_classification_4_0 = null;

        EObject lv_declassification_6_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:408:2: ( ( () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )? ) )
            // InternalSecMFParser.g:409:2: ( () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )? )
            {
            // InternalSecMFParser.g:409:2: ( () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )? )
            // InternalSecMFParser.g:410:3: () otherlv_1= Subclause ( (lv_name_2_0= ruleQCREF ) ) ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )?
            {
            // InternalSecMFParser.g:410:3: ()
            // InternalSecMFParser.g:411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSMFSubclauseAccess().getSecModelSubclauseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Subclause,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSMFSubclauseAccess().getSubclauseKeyword_1());
            		
            // InternalSecMFParser.g:421:3: ( (lv_name_2_0= ruleQCREF ) )
            // InternalSecMFParser.g:422:4: (lv_name_2_0= ruleQCREF )
            {
            // InternalSecMFParser.g:422:4: (lv_name_2_0= ruleQCREF )
            // InternalSecMFParser.g:423:5: lv_name_2_0= ruleQCREF
            {

            					newCompositeNode(grammarAccess.getSMFSubclauseAccess().getNameQCREFParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_14);
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

            // InternalSecMFParser.g:440:3: ( ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Classification) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSecMFParser.g:441:4: ruleClassificationKeywords ( (lv_classification_4_0= ruleSMFClassification ) )+
                    {

                    				newCompositeNode(grammarAccess.getSMFSubclauseAccess().getClassificationKeywordsParserRuleCall_3_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleClassificationKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSecMFParser.g:448:4: ( (lv_classification_4_0= ruleSMFClassification ) )+
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
                    	    // InternalSecMFParser.g:449:5: (lv_classification_4_0= ruleSMFClassification )
                    	    {
                    	    // InternalSecMFParser.g:449:5: (lv_classification_4_0= ruleSMFClassification )
                    	    // InternalSecMFParser.g:450:6: lv_classification_4_0= ruleSMFClassification
                    	    {

                    	    						newCompositeNode(grammarAccess.getSMFSubclauseAccess().getClassificationSMFClassificationParserRuleCall_3_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_15);
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

            // InternalSecMFParser.g:468:3: ( ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+ )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DeClassification) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSecMFParser.g:469:4: ruleDeclassificationKeywords ( (lv_declassification_6_0= ruleSMFDeclassification ) )+
                    {

                    				newCompositeNode(grammarAccess.getSMFSubclauseAccess().getDeclassificationKeywordsParserRuleCall_4_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleDeclassificationKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSecMFParser.g:476:4: ( (lv_declassification_6_0= ruleSMFDeclassification ) )+
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
                    	    // InternalSecMFParser.g:477:5: (lv_declassification_6_0= ruleSMFDeclassification )
                    	    {
                    	    // InternalSecMFParser.g:477:5: (lv_declassification_6_0= ruleSMFDeclassification )
                    	    // InternalSecMFParser.g:478:6: lv_declassification_6_0= ruleSMFDeclassification
                    	    {

                    	    						newCompositeNode(grammarAccess.getSMFSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalSecMFParser.g:500:1: entryRuleSecModelSubclause returns [EObject current=null] : iv_ruleSecModelSubclause= ruleSecModelSubclause EOF ;
    public final EObject entryRuleSecModelSubclause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecModelSubclause = null;


        try {
            // InternalSecMFParser.g:500:58: (iv_ruleSecModelSubclause= ruleSecModelSubclause EOF )
            // InternalSecMFParser.g:501:2: iv_ruleSecModelSubclause= ruleSecModelSubclause EOF
            {
             newCompositeNode(grammarAccess.getSecModelSubclauseRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSecModelSubclause=ruleSecModelSubclause();

            state._fsp--;

             current =iv_ruleSecModelSubclause; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:507:1: ruleSecModelSubclause returns [EObject current=null] : ( () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )? ) ;
    public final EObject ruleSecModelSubclause() throws RecognitionException {
        EObject current = null;

        EObject lv_classification_2_0 = null;

        EObject lv_declassification_4_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:513:2: ( ( () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )? ) )
            // InternalSecMFParser.g:514:2: ( () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )? )
            {
            // InternalSecMFParser.g:514:2: ( () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )? )
            // InternalSecMFParser.g:515:3: () ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )? ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )?
            {
            // InternalSecMFParser.g:515:3: ()
            // InternalSecMFParser.g:516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSecModelSubclauseAccess().getSecModelSubclauseAction_0(),
            					current);
            			

            }

            // InternalSecMFParser.g:522:3: ( ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Classification) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSecMFParser.g:523:4: ruleClassificationKeywords ( (lv_classification_2_0= ruleSMFClassification ) )+
                    {

                    				newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getClassificationKeywordsParserRuleCall_1_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleClassificationKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSecMFParser.g:530:4: ( (lv_classification_2_0= ruleSMFClassification ) )+
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
                    	    // InternalSecMFParser.g:531:5: (lv_classification_2_0= ruleSMFClassification )
                    	    {
                    	    // InternalSecMFParser.g:531:5: (lv_classification_2_0= ruleSMFClassification )
                    	    // InternalSecMFParser.g:532:6: lv_classification_2_0= ruleSMFClassification
                    	    {

                    	    						newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getClassificationSMFClassificationParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_15);
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

            // InternalSecMFParser.g:550:3: ( ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==DeClassification) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSecMFParser.g:551:4: ruleDeclassificationKeywords ( (lv_declassification_4_0= ruleSMFDeclassification ) )+
                    {

                    				newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getDeclassificationKeywordsParserRuleCall_2_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleDeclassificationKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSecMFParser.g:558:4: ( (lv_declassification_4_0= ruleSMFDeclassification ) )+
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
                    	    // InternalSecMFParser.g:559:5: (lv_declassification_4_0= ruleSMFDeclassification )
                    	    {
                    	    // InternalSecMFParser.g:559:5: (lv_declassification_4_0= ruleSMFDeclassification )
                    	    // InternalSecMFParser.g:560:6: lv_declassification_4_0= ruleSMFDeclassification
                    	    {

                    	    						newCompositeNode(grammarAccess.getSecModelSubclauseAccess().getDeclassificationSMFDeclassificationParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FollowSets000.FOLLOW_16);
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
    // InternalSecMFParser.g:582:1: entryRuleSMFClassification returns [EObject current=null] : iv_ruleSMFClassification= ruleSMFClassification EOF ;
    public final EObject entryRuleSMFClassification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFClassification = null;


        try {
            // InternalSecMFParser.g:582:58: (iv_ruleSMFClassification= ruleSMFClassification EOF )
            // InternalSecMFParser.g:583:2: iv_ruleSMFClassification= ruleSMFClassification EOF
            {
             newCompositeNode(grammarAccess.getSMFClassificationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSMFClassification=ruleSMFClassification();

            state._fsp--;

             current =iv_ruleSMFClassification; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:589:1: ruleSMFClassification returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon ) ;
    public final EObject ruleSMFClassification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:595:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon ) )
            // InternalSecMFParser.g:596:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon )
            {
            // InternalSecMFParser.g:596:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon )
            // InternalSecMFParser.g:597:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( (otherlv_3= RULE_ID ) ) otherlv_4= Semicolon
            {
            // InternalSecMFParser.g:597:3: ()
            // InternalSecMFParser.g:598:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSMFClassificationAccess().getSMFClassificationAction_0(),
            					current);
            			

            }

            // InternalSecMFParser.g:604:3: ( (otherlv_1= RULE_ID ) )
            // InternalSecMFParser.g:605:4: (otherlv_1= RULE_ID )
            {
            // InternalSecMFParser.g:605:4: (otherlv_1= RULE_ID )
            // InternalSecMFParser.g:606:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMFClassificationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getSMFClassificationAccess().getFeatureNamedElementCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getSMFClassificationAccess().getColonKeyword_2());
            		
            // InternalSecMFParser.g:621:3: ( (otherlv_3= RULE_ID ) )
            // InternalSecMFParser.g:622:4: (otherlv_3= RULE_ID )
            {
            // InternalSecMFParser.g:622:4: (otherlv_3= RULE_ID )
            // InternalSecMFParser.g:623:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMFClassificationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(otherlv_3, grammarAccess.getSMFClassificationAccess().getTypeRefSMFTypeRefCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:642:1: entryRuleSMFTypeRef returns [EObject current=null] : iv_ruleSMFTypeRef= ruleSMFTypeRef EOF ;
    public final EObject entryRuleSMFTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFTypeRef = null;


        try {
            // InternalSecMFParser.g:642:51: (iv_ruleSMFTypeRef= ruleSMFTypeRef EOF )
            // InternalSecMFParser.g:643:2: iv_ruleSMFTypeRef= ruleSMFTypeRef EOF
            {
             newCompositeNode(grammarAccess.getSMFTypeRefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSMFTypeRef=ruleSMFTypeRef();

            state._fsp--;

             current =iv_ruleSMFTypeRef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:649:1: ruleSMFTypeRef returns [EObject current=null] : this_SMFTypeDef_0= ruleSMFTypeDef ;
    public final EObject ruleSMFTypeRef() throws RecognitionException {
        EObject current = null;

        EObject this_SMFTypeDef_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:655:2: (this_SMFTypeDef_0= ruleSMFTypeDef )
            // InternalSecMFParser.g:656:2: this_SMFTypeDef_0= ruleSMFTypeDef
            {

            		newCompositeNode(grammarAccess.getSMFTypeRefAccess().getSMFTypeDefParserRuleCall());
            	
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:667:1: entryRuleSMFDeclassification returns [EObject current=null] : iv_ruleSMFDeclassification= ruleSMFDeclassification EOF ;
    public final EObject entryRuleSMFDeclassification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFDeclassification = null;


        try {
            // InternalSecMFParser.g:667:60: (iv_ruleSMFDeclassification= ruleSMFDeclassification EOF )
            // InternalSecMFParser.g:668:2: iv_ruleSMFDeclassification= ruleSMFDeclassification EOF
            {
             newCompositeNode(grammarAccess.getSMFDeclassificationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSMFDeclassification=ruleSMFDeclassification();

            state._fsp--;

             current =iv_ruleSMFDeclassification; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:674:1: ruleSMFDeclassification returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon ) ;
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
            // InternalSecMFParser.g:680:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon ) )
            // InternalSecMFParser.g:681:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon )
            {
            // InternalSecMFParser.g:681:2: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon )
            // InternalSecMFParser.g:682:3: () ( (otherlv_1= RULE_ID ) ) otherlv_2= Colon ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) ) otherlv_5= HyphenMinusGreaterThanSign ( (otherlv_6= RULE_ID ) ) otherlv_7= Semicolon
            {
            // InternalSecMFParser.g:682:3: ()
            // InternalSecMFParser.g:683:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSMFDeclassificationAccess().getSMFDeclassificationAction_0(),
            					current);
            			

            }

            // InternalSecMFParser.g:689:3: ( (otherlv_1= RULE_ID ) )
            // InternalSecMFParser.g:690:4: (otherlv_1= RULE_ID )
            {
            // InternalSecMFParser.g:690:4: (otherlv_1= RULE_ID )
            // InternalSecMFParser.g:691:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMFDeclassificationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getSMFDeclassificationAccess().getFlowNamedElementCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FollowSets000.FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSMFDeclassificationAccess().getColonKeyword_2());
            		
            // InternalSecMFParser.g:706:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_any_4_0= Any ) ) )
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
                    // InternalSecMFParser.g:707:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalSecMFParser.g:707:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSecMFParser.g:708:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSecMFParser.g:708:5: (otherlv_3= RULE_ID )
                    // InternalSecMFParser.g:709:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMFDeclassificationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_19); 

                    						newLeafNode(otherlv_3, grammarAccess.getSMFDeclassificationAccess().getSrcNameSMFTypeRefCrossReference_3_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:721:4: ( (lv_any_4_0= Any ) )
                    {
                    // InternalSecMFParser.g:721:4: ( (lv_any_4_0= Any ) )
                    // InternalSecMFParser.g:722:5: (lv_any_4_0= Any )
                    {
                    // InternalSecMFParser.g:722:5: (lv_any_4_0= Any )
                    // InternalSecMFParser.g:723:6: lv_any_4_0= Any
                    {
                    lv_any_4_0=(Token)match(input,Any,FollowSets000.FOLLOW_19); 

                    						newLeafNode(lv_any_4_0, grammarAccess.getSMFDeclassificationAccess().getAnyAnyKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSMFDeclassificationRule());
                    						}
                    						setWithLastConsumed(current, "any", lv_any_4_0 != null, "any");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,HyphenMinusGreaterThanSign,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSMFDeclassificationAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalSecMFParser.g:740:3: ( (otherlv_6= RULE_ID ) )
            // InternalSecMFParser.g:741:4: (otherlv_6= RULE_ID )
            {
            // InternalSecMFParser.g:741:4: (otherlv_6= RULE_ID )
            // InternalSecMFParser.g:742:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSMFDeclassificationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(otherlv_6, grammarAccess.getSMFDeclassificationAccess().getSnkNameSMFTypeRefCrossReference_5_0());
            				

            }


            }

            otherlv_7=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:761:1: entryRuleSMFTypeDef returns [EObject current=null] : iv_ruleSMFTypeDef= ruleSMFTypeDef EOF ;
    public final EObject entryRuleSMFTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSMFTypeDef = null;


        try {
            // InternalSecMFParser.g:761:51: (iv_ruleSMFTypeDef= ruleSMFTypeDef EOF )
            // InternalSecMFParser.g:762:2: iv_ruleSMFTypeDef= ruleSMFTypeDef EOF
            {
             newCompositeNode(grammarAccess.getSMFTypeDefRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSMFTypeDef=ruleSMFTypeDef();

            state._fsp--;

             current =iv_ruleSMFTypeDef; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:768:1: ruleSMFTypeDef returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )* ) ) otherlv_7= Semicolon ) ;
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
            // InternalSecMFParser.g:774:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )* ) ) otherlv_7= Semicolon ) )
            // InternalSecMFParser.g:775:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )* ) ) otherlv_7= Semicolon )
            {
            // InternalSecMFParser.g:775:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )* ) ) otherlv_7= Semicolon )
            // InternalSecMFParser.g:776:3: ( (lv_name_0_0= RULE_ID ) ) ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )* ) ) otherlv_7= Semicolon
            {
            // InternalSecMFParser.g:776:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalSecMFParser.g:777:4: (lv_name_0_0= RULE_ID )
            {
            // InternalSecMFParser.g:777:4: (lv_name_0_0= RULE_ID )
            // InternalSecMFParser.g:778:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_17); 

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

            // InternalSecMFParser.g:794:3: ( (otherlv_1= Colon otherlv_2= Type ) | (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )* ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Colon) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==Type) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==Extends) ) {
                        alt20=2;
                    }
                    else if ( (LA20_2==Semicolon) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSecMFParser.g:795:4: (otherlv_1= Colon otherlv_2= Type )
                    {
                    // InternalSecMFParser.g:795:4: (otherlv_1= Colon otherlv_2= Type )
                    // InternalSecMFParser.g:796:5: otherlv_1= Colon otherlv_2= Type
                    {
                    otherlv_1=(Token)match(input,Colon,FollowSets000.FOLLOW_20); 

                    					newLeafNode(otherlv_1, grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_0_0());
                    				
                    otherlv_2=(Token)match(input,Type,FollowSets000.FOLLOW_5); 

                    					newLeafNode(otherlv_2, grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:806:4: (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )* )
                    {
                    // InternalSecMFParser.g:806:4: (otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )* )
                    // InternalSecMFParser.g:807:5: otherlv_3= Colon otherlv_4= Type otherlv_5= Extends ( (otherlv_6= RULE_ID ) )*
                    {
                    otherlv_3=(Token)match(input,Colon,FollowSets000.FOLLOW_20); 

                    					newLeafNode(otherlv_3, grammarAccess.getSMFTypeDefAccess().getColonKeyword_1_1_0());
                    				
                    otherlv_4=(Token)match(input,Type,FollowSets000.FOLLOW_21); 

                    					newLeafNode(otherlv_4, grammarAccess.getSMFTypeDefAccess().getTypeKeyword_1_1_1());
                    				
                    otherlv_5=(Token)match(input,Extends,FollowSets000.FOLLOW_22); 

                    					newLeafNode(otherlv_5, grammarAccess.getSMFTypeDefAccess().getExtendsKeyword_1_1_2());
                    				
                    // InternalSecMFParser.g:819:5: ( (otherlv_6= RULE_ID ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_ID) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSecMFParser.g:820:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalSecMFParser.g:820:6: (otherlv_6= RULE_ID )
                    	    // InternalSecMFParser.g:821:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSMFTypeDefRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_22); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getSMFTypeDefAccess().getTypeSMFTypeRefCrossReference_1_1_3_0());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:842:1: entryRuleClassificationKeywords returns [String current=null] : iv_ruleClassificationKeywords= ruleClassificationKeywords EOF ;
    public final String entryRuleClassificationKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleClassificationKeywords = null;


        try {
            // InternalSecMFParser.g:842:62: (iv_ruleClassificationKeywords= ruleClassificationKeywords EOF )
            // InternalSecMFParser.g:843:2: iv_ruleClassificationKeywords= ruleClassificationKeywords EOF
            {
             newCompositeNode(grammarAccess.getClassificationKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassificationKeywords=ruleClassificationKeywords();

            state._fsp--;

             current =iv_ruleClassificationKeywords.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:849:1: ruleClassificationKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Classification ;
    public final AntlrDatatypeRuleToken ruleClassificationKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:855:2: (kw= Classification )
            // InternalSecMFParser.g:856:2: kw= Classification
            {
            kw=(Token)match(input,Classification,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:864:1: entryRuleDeclassificationKeywords returns [String current=null] : iv_ruleDeclassificationKeywords= ruleDeclassificationKeywords EOF ;
    public final String entryRuleDeclassificationKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDeclassificationKeywords = null;


        try {
            // InternalSecMFParser.g:864:64: (iv_ruleDeclassificationKeywords= ruleDeclassificationKeywords EOF )
            // InternalSecMFParser.g:865:2: iv_ruleDeclassificationKeywords= ruleDeclassificationKeywords EOF
            {
             newCompositeNode(grammarAccess.getDeclassificationKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDeclassificationKeywords=ruleDeclassificationKeywords();

            state._fsp--;

             current =iv_ruleDeclassificationKeywords.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:871:1: ruleDeclassificationKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= DeClassification ;
    public final AntlrDatatypeRuleToken ruleDeclassificationKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:877:2: (kw= DeClassification )
            // InternalSecMFParser.g:878:2: kw= DeClassification
            {
            kw=(Token)match(input,DeClassification,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:886:1: entryRuleDomainTypesKeywords returns [String current=null] : iv_ruleDomainTypesKeywords= ruleDomainTypesKeywords EOF ;
    public final String entryRuleDomainTypesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDomainTypesKeywords = null;


        try {
            // InternalSecMFParser.g:886:59: (iv_ruleDomainTypesKeywords= ruleDomainTypesKeywords EOF )
            // InternalSecMFParser.g:887:2: iv_ruleDomainTypesKeywords= ruleDomainTypesKeywords EOF
            {
             newCompositeNode(grammarAccess.getDomainTypesKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDomainTypesKeywords=ruleDomainTypesKeywords();

            state._fsp--;

             current =iv_ruleDomainTypesKeywords.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:893:1: ruleDomainTypesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Domain kw= Types ) ;
    public final AntlrDatatypeRuleToken ruleDomainTypesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:899:2: ( (kw= Domain kw= Types ) )
            // InternalSecMFParser.g:900:2: (kw= Domain kw= Types )
            {
            // InternalSecMFParser.g:900:2: (kw= Domain kw= Types )
            // InternalSecMFParser.g:901:3: kw= Domain kw= Types
            {
            kw=(Token)match(input,Domain,FollowSets000.FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDomainTypesKeywordsAccess().getDomainKeyword_0());
            		
            kw=(Token)match(input,Types,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:915:1: entryRuleEndTypesKeywords returns [String current=null] : iv_ruleEndTypesKeywords= ruleEndTypesKeywords EOF ;
    public final String entryRuleEndTypesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEndTypesKeywords = null;


        try {
            // InternalSecMFParser.g:915:56: (iv_ruleEndTypesKeywords= ruleEndTypesKeywords EOF )
            // InternalSecMFParser.g:916:2: iv_ruleEndTypesKeywords= ruleEndTypesKeywords EOF
            {
             newCompositeNode(grammarAccess.getEndTypesKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEndTypesKeywords=ruleEndTypesKeywords();

            state._fsp--;

             current =iv_ruleEndTypesKeywords.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:922:1: ruleEndTypesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= End kw= Types ) ;
    public final AntlrDatatypeRuleToken ruleEndTypesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:928:2: ( (kw= End kw= Types ) )
            // InternalSecMFParser.g:929:2: (kw= End kw= Types )
            {
            // InternalSecMFParser.g:929:2: (kw= End kw= Types )
            // InternalSecMFParser.g:930:3: kw= End kw= Types
            {
            kw=(Token)match(input,End,FollowSets000.FOLLOW_23); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEndTypesKeywordsAccess().getEndKeyword_0());
            		
            kw=(Token)match(input,Types,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:944:1: entryRuleQEMREF returns [String current=null] : iv_ruleQEMREF= ruleQEMREF EOF ;
    public final String entryRuleQEMREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQEMREF = null;


        try {
            // InternalSecMFParser.g:944:46: (iv_ruleQEMREF= ruleQEMREF EOF )
            // InternalSecMFParser.g:945:2: iv_ruleQEMREF= ruleQEMREF EOF
            {
             newCompositeNode(grammarAccess.getQEMREFRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQEMREF=ruleQEMREF();

            state._fsp--;

             current =iv_ruleQEMREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:951:1: ruleQEMREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQEMREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:957:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) )
            // InternalSecMFParser.g:958:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            {
            // InternalSecMFParser.g:958:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            // InternalSecMFParser.g:959:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_0());
            		
            // InternalSecMFParser.g:966:3: (kw= ColonColon this_ID_2= RULE_ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==ColonColon) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSecMFParser.g:967:4: kw= ColonColon this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQEMREFAccess().getColonColonKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQEMREFAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSecMFParser.g:984:1: entryRuleContainedPropertyAssociation returns [EObject current=null] : iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF ;
    public final EObject entryRuleContainedPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainedPropertyAssociation = null;


        try {
            // InternalSecMFParser.g:984:69: (iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF )
            // InternalSecMFParser.g:985:2: iv_ruleContainedPropertyAssociation= ruleContainedPropertyAssociation EOF
            {
             newCompositeNode(grammarAccess.getContainedPropertyAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainedPropertyAssociation=ruleContainedPropertyAssociation();

            state._fsp--;

             current =iv_ruleContainedPropertyAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:991:1: ruleContainedPropertyAssociation returns [EObject current=null] : ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) ;
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
            // InternalSecMFParser.g:997:2: ( ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon ) )
            // InternalSecMFParser.g:998:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            {
            // InternalSecMFParser.g:998:2: ( ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon )
            // InternalSecMFParser.g:999:3: ( ( ruleQPREF ) ) (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) ) ( (lv_constant_3_0= Constant ) )? ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* ) ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )? ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )? otherlv_15= Semicolon
            {
            // InternalSecMFParser.g:999:3: ( ( ruleQPREF ) )
            // InternalSecMFParser.g:1000:4: ( ruleQPREF )
            {
            // InternalSecMFParser.g:1000:4: ( ruleQPREF )
            // InternalSecMFParser.g:1001:5: ruleQPREF
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getPropertyPropertyCrossReference_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_25);
            ruleQPREF();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSecMFParser.g:1015:3: (otherlv_1= EqualsSignGreaterThanSign | ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EqualsSignGreaterThanSign) ) {
                alt22=1;
            }
            else if ( (LA22_0==PlusSignEqualsSignGreaterThanSign) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalSecMFParser.g:1016:4: otherlv_1= EqualsSignGreaterThanSign
                    {
                    otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getContainedPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:1021:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    {
                    // InternalSecMFParser.g:1021:4: ( (lv_append_2_0= PlusSignEqualsSignGreaterThanSign ) )
                    // InternalSecMFParser.g:1022:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    {
                    // InternalSecMFParser.g:1022:5: (lv_append_2_0= PlusSignEqualsSignGreaterThanSign )
                    // InternalSecMFParser.g:1023:6: lv_append_2_0= PlusSignEqualsSignGreaterThanSign
                    {
                    lv_append_2_0=(Token)match(input,PlusSignEqualsSignGreaterThanSign,FollowSets000.FOLLOW_26); 

                    						newLeafNode(lv_append_2_0, grammarAccess.getContainedPropertyAssociationAccess().getAppendPlusSignEqualsSignGreaterThanSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    						}
                    						setWithLastConsumed(current, "append", lv_append_2_0 != null, "+=>");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSecMFParser.g:1036:3: ( (lv_constant_3_0= Constant ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Constant) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSecMFParser.g:1037:4: (lv_constant_3_0= Constant )
                    {
                    // InternalSecMFParser.g:1037:4: (lv_constant_3_0= Constant )
                    // InternalSecMFParser.g:1038:5: lv_constant_3_0= Constant
                    {
                    lv_constant_3_0=(Token)match(input,Constant,FollowSets000.FOLLOW_26); 

                    					newLeafNode(lv_constant_3_0, grammarAccess.getContainedPropertyAssociationAccess().getConstantConstantKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    					}
                    					setWithLastConsumed(current, "constant", lv_constant_3_0 != null, "constant");
                    				

                    }


                    }
                    break;

            }

            // InternalSecMFParser.g:1050:3: ( ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )* )
            // InternalSecMFParser.g:1051:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) ) (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            {
            // InternalSecMFParser.g:1051:4: ( (lv_ownedValue_4_0= ruleOptionalModalPropertyValue ) )
            // InternalSecMFParser.g:1052:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            {
            // InternalSecMFParser.g:1052:5: (lv_ownedValue_4_0= ruleOptionalModalPropertyValue )
            // InternalSecMFParser.g:1053:6: lv_ownedValue_4_0= ruleOptionalModalPropertyValue
            {

            						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_0_0());
            					
            pushFollow(FollowSets000.FOLLOW_27);
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

            // InternalSecMFParser.g:1070:4: (otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalSecMFParser.g:1071:5: otherlv_5= Comma ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    {
            	    otherlv_5=(Token)match(input,Comma,FollowSets000.FOLLOW_26); 

            	    					newLeafNode(otherlv_5, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalSecMFParser.g:1075:5: ( (lv_ownedValue_6_0= ruleOptionalModalPropertyValue ) )
            	    // InternalSecMFParser.g:1076:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    {
            	    // InternalSecMFParser.g:1076:6: (lv_ownedValue_6_0= ruleOptionalModalPropertyValue )
            	    // InternalSecMFParser.g:1077:7: lv_ownedValue_6_0= ruleOptionalModalPropertyValue
            	    {

            	    							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueOptionalModalPropertyValueParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FollowSets000.FOLLOW_27);
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
            	    break loop24;
                }
            } while (true);


            }

            // InternalSecMFParser.g:1096:3: ( ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Applies) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSecMFParser.g:1097:4: ruleAppliesToKeywords ( (lv_appliesTo_8_0= ruleContainmentPath ) ) (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    {

                    				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToKeywordsParserRuleCall_4_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_6);
                    ruleAppliesToKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    // InternalSecMFParser.g:1104:4: ( (lv_appliesTo_8_0= ruleContainmentPath ) )
                    // InternalSecMFParser.g:1105:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    {
                    // InternalSecMFParser.g:1105:5: (lv_appliesTo_8_0= ruleContainmentPath )
                    // InternalSecMFParser.g:1106:6: lv_appliesTo_8_0= ruleContainmentPath
                    {

                    						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_28);
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

                    // InternalSecMFParser.g:1123:4: (otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==Comma) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSecMFParser.g:1124:5: otherlv_9= Comma ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FollowSets000.FOLLOW_6); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getContainedPropertyAssociationAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSecMFParser.g:1128:5: ( (lv_appliesTo_10_0= ruleContainmentPath ) )
                    	    // InternalSecMFParser.g:1129:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    {
                    	    // InternalSecMFParser.g:1129:6: (lv_appliesTo_10_0= ruleContainmentPath )
                    	    // InternalSecMFParser.g:1130:7: lv_appliesTo_10_0= ruleContainmentPath
                    	    {

                    	    							newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToContainmentPathParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_28);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSecMFParser.g:1149:3: ( ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==In) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSecMFParser.g:1150:4: ruleInBindingKeywords otherlv_12= LeftParenthesis ( ( ruleQCREF ) ) otherlv_14= RightParenthesis
                    {

                    				newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingKeywordsParserRuleCall_5_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_29);
                    ruleInBindingKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_12=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getContainedPropertyAssociationAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalSecMFParser.g:1161:4: ( ( ruleQCREF ) )
                    // InternalSecMFParser.g:1162:5: ( ruleQCREF )
                    {
                    // InternalSecMFParser.g:1162:5: ( ruleQCREF )
                    // InternalSecMFParser.g:1163:6: ruleQCREF
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainedPropertyAssociationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContainedPropertyAssociationAccess().getInBindingClassifierCrossReference_5_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_30);
                    ruleQCREF();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getContainedPropertyAssociationAccess().getRightParenthesisKeyword_5_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1190:1: entryRuleContainmentPath returns [EObject current=null] : iv_ruleContainmentPath= ruleContainmentPath EOF ;
    public final EObject entryRuleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPath = null;


        try {
            // InternalSecMFParser.g:1190:56: (iv_ruleContainmentPath= ruleContainmentPath EOF )
            // InternalSecMFParser.g:1191:2: iv_ruleContainmentPath= ruleContainmentPath EOF
            {
             newCompositeNode(grammarAccess.getContainmentPathRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainmentPath=ruleContainmentPath();

            state._fsp--;

             current =iv_ruleContainmentPath; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1197:1: ruleContainmentPath returns [EObject current=null] : ( (lv_path_0_0= ruleContainmentPathElement ) ) ;
    public final EObject ruleContainmentPath() throws RecognitionException {
        EObject current = null;

        EObject lv_path_0_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:1203:2: ( ( (lv_path_0_0= ruleContainmentPathElement ) ) )
            // InternalSecMFParser.g:1204:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            {
            // InternalSecMFParser.g:1204:2: ( (lv_path_0_0= ruleContainmentPathElement ) )
            // InternalSecMFParser.g:1205:3: (lv_path_0_0= ruleContainmentPathElement )
            {
            // InternalSecMFParser.g:1205:3: (lv_path_0_0= ruleContainmentPathElement )
            // InternalSecMFParser.g:1206:4: lv_path_0_0= ruleContainmentPathElement
            {

            				newCompositeNode(grammarAccess.getContainmentPathAccess().getPathContainmentPathElementParserRuleCall_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:1226:1: entryRuleOptionalModalPropertyValue returns [EObject current=null] : iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF ;
    public final EObject entryRuleOptionalModalPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalModalPropertyValue = null;


        try {
            // InternalSecMFParser.g:1226:67: (iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF )
            // InternalSecMFParser.g:1227:2: iv_ruleOptionalModalPropertyValue= ruleOptionalModalPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getOptionalModalPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOptionalModalPropertyValue=ruleOptionalModalPropertyValue();

            state._fsp--;

             current =iv_ruleOptionalModalPropertyValue; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1233:1: ruleOptionalModalPropertyValue returns [EObject current=null] : ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) ;
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
            // InternalSecMFParser.g:1239:2: ( ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? ) )
            // InternalSecMFParser.g:1240:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            {
            // InternalSecMFParser.g:1240:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )? )
            // InternalSecMFParser.g:1241:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            {
            // InternalSecMFParser.g:1241:3: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalSecMFParser.g:1242:4: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalSecMFParser.g:1242:4: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalSecMFParser.g:1243:5: lv_ownedValue_0_0= rulePropertyExpression
            {

            					newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_31);
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

            // InternalSecMFParser.g:1260:3: ( ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==In) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==Modes) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalSecMFParser.g:1261:4: ruleInModesKeywords otherlv_2= LeftParenthesis ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* otherlv_6= RightParenthesis
                    {

                    				newCompositeNode(grammarAccess.getOptionalModalPropertyValueAccess().getInModesKeywordsParserRuleCall_1_0());
                    			
                    pushFollow(FollowSets000.FOLLOW_29);
                    ruleInModesKeywords();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getOptionalModalPropertyValueAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalSecMFParser.g:1272:4: ( (otherlv_3= RULE_ID ) )
                    // InternalSecMFParser.g:1273:5: (otherlv_3= RULE_ID )
                    {
                    // InternalSecMFParser.g:1273:5: (otherlv_3= RULE_ID )
                    // InternalSecMFParser.g:1274:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); 

                    						newLeafNode(otherlv_3, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_2_0());
                    					

                    }


                    }

                    // InternalSecMFParser.g:1285:4: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==Comma) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSecMFParser.g:1286:5: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FollowSets000.FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOptionalModalPropertyValueAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalSecMFParser.g:1290:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalSecMFParser.g:1291:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalSecMFParser.g:1291:6: (otherlv_5= RULE_ID )
                    	    // InternalSecMFParser.g:1292:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getOptionalModalPropertyValueRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_32); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getOptionalModalPropertyValueAccess().getInModeModeCrossReference_1_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1313:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalSecMFParser.g:1313:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalSecMFParser.g:1314:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1320:1: rulePropertyValue returns [EObject current=null] : ( (lv_ownedValue_0_0= rulePropertyExpression ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject lv_ownedValue_0_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:1326:2: ( ( (lv_ownedValue_0_0= rulePropertyExpression ) ) )
            // InternalSecMFParser.g:1327:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            {
            // InternalSecMFParser.g:1327:2: ( (lv_ownedValue_0_0= rulePropertyExpression ) )
            // InternalSecMFParser.g:1328:3: (lv_ownedValue_0_0= rulePropertyExpression )
            {
            // InternalSecMFParser.g:1328:3: (lv_ownedValue_0_0= rulePropertyExpression )
            // InternalSecMFParser.g:1329:4: lv_ownedValue_0_0= rulePropertyExpression
            {

            				newCompositeNode(grammarAccess.getPropertyValueAccess().getOwnedValuePropertyExpressionParserRuleCall_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:1349:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // InternalSecMFParser.g:1349:59: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // InternalSecMFParser.g:1350:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;

             current =iv_rulePropertyExpression; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1356:1: rulePropertyExpression returns [EObject current=null] : (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) ;
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
            // InternalSecMFParser.g:1362:2: ( (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm ) )
            // InternalSecMFParser.g:1363:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            {
            // InternalSecMFParser.g:1363:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )
            int alt30=11;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalSecMFParser.g:1364:3: this_RecordTerm_0= ruleRecordTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRecordTermParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RecordTerm_0=ruleRecordTerm();

                    state._fsp--;


                    			current = this_RecordTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:1373:3: this_ReferenceTerm_1= ruleReferenceTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getReferenceTermParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReferenceTerm_1=ruleReferenceTerm();

                    state._fsp--;


                    			current = this_ReferenceTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSecMFParser.g:1382:3: this_ComponentClassifierTerm_2= ruleComponentClassifierTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComponentClassifierTermParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComponentClassifierTerm_2=ruleComponentClassifierTerm();

                    state._fsp--;


                    			current = this_ComponentClassifierTerm_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSecMFParser.g:1391:3: this_ComputedTerm_3= ruleComputedTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getComputedTermParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ComputedTerm_3=ruleComputedTerm();

                    state._fsp--;


                    			current = this_ComputedTerm_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSecMFParser.g:1400:3: this_StringTerm_4= ruleStringTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getStringTermParserRuleCall_4());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringTerm_4=ruleStringTerm();

                    state._fsp--;


                    			current = this_StringTerm_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSecMFParser.g:1409:3: this_NumericRangeTerm_5= ruleNumericRangeTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getNumericRangeTermParserRuleCall_5());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NumericRangeTerm_5=ruleNumericRangeTerm();

                    state._fsp--;


                    			current = this_NumericRangeTerm_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSecMFParser.g:1418:3: this_RealTerm_6= ruleRealTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getRealTermParserRuleCall_6());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealTerm_6=ruleRealTerm();

                    state._fsp--;


                    			current = this_RealTerm_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSecMFParser.g:1427:3: this_IntegerTerm_7= ruleIntegerTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getIntegerTermParserRuleCall_7());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerTerm_7=ruleIntegerTerm();

                    state._fsp--;


                    			current = this_IntegerTerm_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSecMFParser.g:1436:3: this_ListTerm_8= ruleListTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getListTermParserRuleCall_8());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ListTerm_8=ruleListTerm();

                    state._fsp--;


                    			current = this_ListTerm_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSecMFParser.g:1445:3: this_BooleanLiteral_9= ruleBooleanLiteral
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getBooleanLiteralParserRuleCall_9());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanLiteral_9=ruleBooleanLiteral();

                    state._fsp--;


                    			current = this_BooleanLiteral_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalSecMFParser.g:1454:3: this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm
                    {

                    			newCompositeNode(grammarAccess.getPropertyExpressionAccess().getLiteralorReferenceTermParserRuleCall_10());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:1466:1: entryRuleLiteralorReferenceTerm returns [EObject current=null] : iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF ;
    public final EObject entryRuleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralorReferenceTerm = null;


        try {
            // InternalSecMFParser.g:1466:63: (iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF )
            // InternalSecMFParser.g:1467:2: iv_ruleLiteralorReferenceTerm= ruleLiteralorReferenceTerm EOF
            {
             newCompositeNode(grammarAccess.getLiteralorReferenceTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLiteralorReferenceTerm=ruleLiteralorReferenceTerm();

            state._fsp--;

             current =iv_ruleLiteralorReferenceTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1473:1: ruleLiteralorReferenceTerm returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleLiteralorReferenceTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSecMFParser.g:1479:2: ( ( ( ruleQPREF ) ) )
            // InternalSecMFParser.g:1480:2: ( ( ruleQPREF ) )
            {
            // InternalSecMFParser.g:1480:2: ( ( ruleQPREF ) )
            // InternalSecMFParser.g:1481:3: ( ruleQPREF )
            {
            // InternalSecMFParser.g:1481:3: ( ruleQPREF )
            // InternalSecMFParser.g:1482:4: ruleQPREF
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralorReferenceTermRule());
            				}
            			

            				newCompositeNode(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAbstractNamedValueCrossReference_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:1499:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // InternalSecMFParser.g:1499:55: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // InternalSecMFParser.g:1500:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
             newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;

             current =iv_ruleBooleanLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1506:1: ruleBooleanLiteral returns [EObject current=null] : ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:1512:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) )
            // InternalSecMFParser.g:1513:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            {
            // InternalSecMFParser.g:1513:2: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
            // InternalSecMFParser.g:1514:3: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            {
            // InternalSecMFParser.g:1514:3: ()
            // InternalSecMFParser.g:1515:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_0(),
            					current);
            			

            }

            // InternalSecMFParser.g:1521:3: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==True) ) {
                alt31=1;
            }
            else if ( (LA31_0==False) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSecMFParser.g:1522:4: ( (lv_value_1_0= True ) )
                    {
                    // InternalSecMFParser.g:1522:4: ( (lv_value_1_0= True ) )
                    // InternalSecMFParser.g:1523:5: (lv_value_1_0= True )
                    {
                    // InternalSecMFParser.g:1523:5: (lv_value_1_0= True )
                    // InternalSecMFParser.g:1524:6: lv_value_1_0= True
                    {
                    lv_value_1_0=(Token)match(input,True,FollowSets000.FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getBooleanLiteralAccess().getValueTrueKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBooleanLiteralRule());
                    						}
                    						setWithLastConsumed(current, "value", lv_value_1_0 != null, "true");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:1537:4: otherlv_2= False
                    {
                    otherlv_2=(Token)match(input,False,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1546:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // InternalSecMFParser.g:1546:54: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalSecMFParser.g:1547:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1553:1: ruleConstantValue returns [EObject current=null] : ( ( ruleQPREF ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalSecMFParser.g:1559:2: ( ( ( ruleQPREF ) ) )
            // InternalSecMFParser.g:1560:2: ( ( ruleQPREF ) )
            {
            // InternalSecMFParser.g:1560:2: ( ( ruleQPREF ) )
            // InternalSecMFParser.g:1561:3: ( ruleQPREF )
            {
            // InternalSecMFParser.g:1561:3: ( ruleQPREF )
            // InternalSecMFParser.g:1562:4: ruleQPREF
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getConstantValueRule());
            				}
            			

            				newCompositeNode(grammarAccess.getConstantValueAccess().getNamedValuePropertyConstantCrossReference_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:1579:1: entryRuleReferenceTerm returns [EObject current=null] : iv_ruleReferenceTerm= ruleReferenceTerm EOF ;
    public final EObject entryRuleReferenceTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceTerm = null;


        try {
            // InternalSecMFParser.g:1579:54: (iv_ruleReferenceTerm= ruleReferenceTerm EOF )
            // InternalSecMFParser.g:1580:2: iv_ruleReferenceTerm= ruleReferenceTerm EOF
            {
             newCompositeNode(grammarAccess.getReferenceTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReferenceTerm=ruleReferenceTerm();

            state._fsp--;

             current =iv_ruleReferenceTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1586:1: ruleReferenceTerm returns [EObject current=null] : (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleReferenceTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:1592:2: ( (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis ) )
            // InternalSecMFParser.g:1593:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            {
            // InternalSecMFParser.g:1593:2: (otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis )
            // InternalSecMFParser.g:1594:3: otherlv_0= Reference otherlv_1= LeftParenthesis ( (lv_path_2_0= ruleContainmentPathElement ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Reference,FollowSets000.FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceTermAccess().getReferenceKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSecMFParser.g:1602:3: ( (lv_path_2_0= ruleContainmentPathElement ) )
            // InternalSecMFParser.g:1603:4: (lv_path_2_0= ruleContainmentPathElement )
            {
            // InternalSecMFParser.g:1603:4: (lv_path_2_0= ruleContainmentPathElement )
            // InternalSecMFParser.g:1604:5: lv_path_2_0= ruleContainmentPathElement
            {

            					newCompositeNode(grammarAccess.getReferenceTermAccess().getPathContainmentPathElementParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_30);
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

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1629:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // InternalSecMFParser.g:1629:51: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // InternalSecMFParser.g:1630:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
             newCompositeNode(grammarAccess.getRecordTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;

             current =iv_ruleRecordTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1636:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_ownedFieldValue_1_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:1642:2: ( (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket ) )
            // InternalSecMFParser.g:1643:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            {
            // InternalSecMFParser.g:1643:2: (otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket )
            // InternalSecMFParser.g:1644:3: otherlv_0= LeftSquareBracket ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+ otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalSecMFParser.g:1648:3: ( (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation ) )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSecMFParser.g:1649:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    {
            	    // InternalSecMFParser.g:1649:4: (lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation )
            	    // InternalSecMFParser.g:1650:5: lv_ownedFieldValue_1_0= ruleFieldPropertyAssociation
            	    {

            	    					newCompositeNode(grammarAccess.getRecordTermAccess().getOwnedFieldValueFieldPropertyAssociationParserRuleCall_1_0());
            	    				
            	    pushFollow(FollowSets000.FOLLOW_33);
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
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            otherlv_2=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1675:1: entryRuleComputedTerm returns [EObject current=null] : iv_ruleComputedTerm= ruleComputedTerm EOF ;
    public final EObject entryRuleComputedTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComputedTerm = null;


        try {
            // InternalSecMFParser.g:1675:53: (iv_ruleComputedTerm= ruleComputedTerm EOF )
            // InternalSecMFParser.g:1676:2: iv_ruleComputedTerm= ruleComputedTerm EOF
            {
             newCompositeNode(grammarAccess.getComputedTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComputedTerm=ruleComputedTerm();

            state._fsp--;

             current =iv_ruleComputedTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1682:1: ruleComputedTerm returns [EObject current=null] : (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComputedTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_function_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:1688:2: ( (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis ) )
            // InternalSecMFParser.g:1689:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            {
            // InternalSecMFParser.g:1689:2: (otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis )
            // InternalSecMFParser.g:1690:3: otherlv_0= Compute otherlv_1= LeftParenthesis ( (lv_function_2_0= RULE_ID ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Compute,FollowSets000.FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getComputedTermAccess().getComputeKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getComputedTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSecMFParser.g:1698:3: ( (lv_function_2_0= RULE_ID ) )
            // InternalSecMFParser.g:1699:4: (lv_function_2_0= RULE_ID )
            {
            // InternalSecMFParser.g:1699:4: (lv_function_2_0= RULE_ID )
            // InternalSecMFParser.g:1700:5: lv_function_2_0= RULE_ID
            {
            lv_function_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_30); 

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

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1724:1: entryRuleComponentClassifierTerm returns [EObject current=null] : iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF ;
    public final EObject entryRuleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentClassifierTerm = null;


        try {
            // InternalSecMFParser.g:1724:64: (iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF )
            // InternalSecMFParser.g:1725:2: iv_ruleComponentClassifierTerm= ruleComponentClassifierTerm EOF
            {
             newCompositeNode(grammarAccess.getComponentClassifierTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponentClassifierTerm=ruleComponentClassifierTerm();

            state._fsp--;

             current =iv_ruleComponentClassifierTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1731:1: ruleComponentClassifierTerm returns [EObject current=null] : (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) ;
    public final EObject ruleComponentClassifierTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:1737:2: ( (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis ) )
            // InternalSecMFParser.g:1738:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            {
            // InternalSecMFParser.g:1738:2: (otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis )
            // InternalSecMFParser.g:1739:3: otherlv_0= Classifier otherlv_1= LeftParenthesis ( ( ruleQCREF ) ) otherlv_3= RightParenthesis
            {
            otherlv_0=(Token)match(input,Classifier,FollowSets000.FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentClassifierTermAccess().getClassifierKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentClassifierTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSecMFParser.g:1747:3: ( ( ruleQCREF ) )
            // InternalSecMFParser.g:1748:4: ( ruleQCREF )
            {
            // InternalSecMFParser.g:1748:4: ( ruleQCREF )
            // InternalSecMFParser.g:1749:5: ruleQCREF
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentClassifierTermRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentClassifierTermAccess().getClassifierComponentClassifierCrossReference_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_30);
            ruleQCREF();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1771:1: entryRuleListTerm returns [EObject current=null] : iv_ruleListTerm= ruleListTerm EOF ;
    public final EObject entryRuleListTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListTerm = null;


        try {
            // InternalSecMFParser.g:1771:49: (iv_ruleListTerm= ruleListTerm EOF )
            // InternalSecMFParser.g:1772:2: iv_ruleListTerm= ruleListTerm EOF
            {
             newCompositeNode(grammarAccess.getListTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleListTerm=ruleListTerm();

            state._fsp--;

             current =iv_ruleListTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1778:1: ruleListTerm returns [EObject current=null] : ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) ;
    public final EObject ruleListTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_ownedListElement_2_0 = null;

        EObject lv_ownedListElement_4_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:1784:2: ( ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis ) )
            // InternalSecMFParser.g:1785:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            {
            // InternalSecMFParser.g:1785:2: ( () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis )
            // InternalSecMFParser.g:1786:3: () otherlv_1= LeftParenthesis ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )? otherlv_5= RightParenthesis
            {
            // InternalSecMFParser.g:1786:3: ()
            // InternalSecMFParser.g:1787:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListTermAccess().getListValueAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftParenthesis,FollowSets000.FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getListTermAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSecMFParser.g:1797:3: ( ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=Classifier && LA34_0<=Reference)||LA34_0==Compute||LA34_0==False||LA34_0==True||LA34_0==LeftParenthesis||LA34_0==PlusSign||LA34_0==HyphenMinus||LA34_0==LeftSquareBracket||LA34_0==RULE_INTEGER_LIT||LA34_0==RULE_REAL_LIT||(LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSecMFParser.g:1798:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) ) (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    {
                    // InternalSecMFParser.g:1798:4: ( (lv_ownedListElement_2_0= rulePropertyExpression ) )
                    // InternalSecMFParser.g:1799:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    {
                    // InternalSecMFParser.g:1799:5: (lv_ownedListElement_2_0= rulePropertyExpression )
                    // InternalSecMFParser.g:1800:6: lv_ownedListElement_2_0= rulePropertyExpression
                    {

                    						newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    // InternalSecMFParser.g:1817:4: (otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==Comma) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalSecMFParser.g:1818:5: otherlv_3= Comma ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FollowSets000.FOLLOW_26); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getListTermAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSecMFParser.g:1822:5: ( (lv_ownedListElement_4_0= rulePropertyExpression ) )
                    	    // InternalSecMFParser.g:1823:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    {
                    	    // InternalSecMFParser.g:1823:6: (lv_ownedListElement_4_0= rulePropertyExpression )
                    	    // InternalSecMFParser.g:1824:7: lv_ownedListElement_4_0= rulePropertyExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getListTermAccess().getOwnedListElementPropertyExpressionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FollowSets000.FOLLOW_32);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,RightParenthesis,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1851:1: entryRuleFieldPropertyAssociation returns [EObject current=null] : iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF ;
    public final EObject entryRuleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldPropertyAssociation = null;


        try {
            // InternalSecMFParser.g:1851:65: (iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF )
            // InternalSecMFParser.g:1852:2: iv_ruleFieldPropertyAssociation= ruleFieldPropertyAssociation EOF
            {
             newCompositeNode(grammarAccess.getFieldPropertyAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFieldPropertyAssociation=ruleFieldPropertyAssociation();

            state._fsp--;

             current =iv_ruleFieldPropertyAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1858:1: ruleFieldPropertyAssociation returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) ;
    public final EObject ruleFieldPropertyAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_ownedValue_2_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:1864:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon ) )
            // InternalSecMFParser.g:1865:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            {
            // InternalSecMFParser.g:1865:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon )
            // InternalSecMFParser.g:1866:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSignGreaterThanSign ( (lv_ownedValue_2_0= rulePropertyExpression ) ) otherlv_3= Semicolon
            {
            // InternalSecMFParser.g:1866:3: ( (otherlv_0= RULE_ID ) )
            // InternalSecMFParser.g:1867:4: (otherlv_0= RULE_ID )
            {
            // InternalSecMFParser.g:1867:4: (otherlv_0= RULE_ID )
            // InternalSecMFParser.g:1868:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldPropertyAssociationRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getFieldPropertyAssociationAccess().getPropertyBasicPropertyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,EqualsSignGreaterThanSign,FollowSets000.FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldPropertyAssociationAccess().getEqualsSignGreaterThanSignKeyword_1());
            		
            // InternalSecMFParser.g:1883:3: ( (lv_ownedValue_2_0= rulePropertyExpression ) )
            // InternalSecMFParser.g:1884:4: (lv_ownedValue_2_0= rulePropertyExpression )
            {
            // InternalSecMFParser.g:1884:4: (lv_ownedValue_2_0= rulePropertyExpression )
            // InternalSecMFParser.g:1885:5: lv_ownedValue_2_0= rulePropertyExpression
            {

            					newCompositeNode(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValuePropertyExpressionParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_5);
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

            otherlv_3=(Token)match(input,Semicolon,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1910:1: entryRuleContainmentPathElement returns [EObject current=null] : iv_ruleContainmentPathElement= ruleContainmentPathElement EOF ;
    public final EObject entryRuleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainmentPathElement = null;


        try {
            // InternalSecMFParser.g:1910:63: (iv_ruleContainmentPathElement= ruleContainmentPathElement EOF )
            // InternalSecMFParser.g:1911:2: iv_ruleContainmentPathElement= ruleContainmentPathElement EOF
            {
             newCompositeNode(grammarAccess.getContainmentPathElementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleContainmentPathElement=ruleContainmentPathElement();

            state._fsp--;

             current =iv_ruleContainmentPathElement; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1917:1: ruleContainmentPathElement returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) ;
    public final EObject ruleContainmentPathElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_arrayRange_1_0 = null;

        EObject lv_path_3_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:1923:2: ( ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? ) )
            // InternalSecMFParser.g:1924:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            {
            // InternalSecMFParser.g:1924:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )? )
            // InternalSecMFParser.g:1925:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* ) (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            {
            // InternalSecMFParser.g:1925:3: ( ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )* )
            // InternalSecMFParser.g:1926:4: ( (otherlv_0= RULE_ID ) ) ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            {
            // InternalSecMFParser.g:1926:4: ( (otherlv_0= RULE_ID ) )
            // InternalSecMFParser.g:1927:5: (otherlv_0= RULE_ID )
            {
            // InternalSecMFParser.g:1927:5: (otherlv_0= RULE_ID )
            // InternalSecMFParser.g:1928:6: otherlv_0= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getContainmentPathElementRule());
            						}
            					
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_36); 

            						newLeafNode(otherlv_0, grammarAccess.getContainmentPathElementAccess().getNamedElementNamedElementCrossReference_0_0_0());
            					

            }


            }

            // InternalSecMFParser.g:1939:4: ( (lv_arrayRange_1_0= ruleArrayRange ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==LeftSquareBracket) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalSecMFParser.g:1940:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    {
            	    // InternalSecMFParser.g:1940:5: (lv_arrayRange_1_0= ruleArrayRange )
            	    // InternalSecMFParser.g:1941:6: lv_arrayRange_1_0= ruleArrayRange
            	    {

            	    						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getArrayRangeArrayRangeParserRuleCall_0_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_36);
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
            	    break loop35;
                }
            } while (true);


            }

            // InternalSecMFParser.g:1959:3: (otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==FullStop) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSecMFParser.g:1960:4: otherlv_2= FullStop ( (lv_path_3_0= ruleContainmentPathElement ) )
                    {
                    otherlv_2=(Token)match(input,FullStop,FollowSets000.FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getContainmentPathElementAccess().getFullStopKeyword_1_0());
                    			
                    // InternalSecMFParser.g:1964:4: ( (lv_path_3_0= ruleContainmentPathElement ) )
                    // InternalSecMFParser.g:1965:5: (lv_path_3_0= ruleContainmentPathElement )
                    {
                    // InternalSecMFParser.g:1965:5: (lv_path_3_0= ruleContainmentPathElement )
                    // InternalSecMFParser.g:1966:6: lv_path_3_0= ruleContainmentPathElement
                    {

                    						newCompositeNode(grammarAccess.getContainmentPathElementAccess().getPathContainmentPathElementParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:1988:1: entryRulePlusMinus returns [String current=null] : iv_rulePlusMinus= rulePlusMinus EOF ;
    public final String entryRulePlusMinus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlusMinus = null;


        try {
            // InternalSecMFParser.g:1988:49: (iv_rulePlusMinus= rulePlusMinus EOF )
            // InternalSecMFParser.g:1989:2: iv_rulePlusMinus= rulePlusMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusMinusRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePlusMinus=rulePlusMinus();

            state._fsp--;

             current =iv_rulePlusMinus.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:1995:1: rulePlusMinus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= PlusSign | kw= HyphenMinus ) ;
    public final AntlrDatatypeRuleToken rulePlusMinus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2001:2: ( (kw= PlusSign | kw= HyphenMinus ) )
            // InternalSecMFParser.g:2002:2: (kw= PlusSign | kw= HyphenMinus )
            {
            // InternalSecMFParser.g:2002:2: (kw= PlusSign | kw= HyphenMinus )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==PlusSign) ) {
                alt37=1;
            }
            else if ( (LA37_0==HyphenMinus) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalSecMFParser.g:2003:3: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPlusMinusAccess().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:2009:3: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2018:1: entryRuleStringTerm returns [EObject current=null] : iv_ruleStringTerm= ruleStringTerm EOF ;
    public final EObject entryRuleStringTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringTerm = null;


        try {
            // InternalSecMFParser.g:2018:51: (iv_ruleStringTerm= ruleStringTerm EOF )
            // InternalSecMFParser.g:2019:2: iv_ruleStringTerm= ruleStringTerm EOF
            {
             newCompositeNode(grammarAccess.getStringTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringTerm=ruleStringTerm();

            state._fsp--;

             current =iv_ruleStringTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2025:1: ruleStringTerm returns [EObject current=null] : ( (lv_value_0_0= ruleNoQuoteString ) ) ;
    public final EObject ruleStringTerm() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:2031:2: ( ( (lv_value_0_0= ruleNoQuoteString ) ) )
            // InternalSecMFParser.g:2032:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            {
            // InternalSecMFParser.g:2032:2: ( (lv_value_0_0= ruleNoQuoteString ) )
            // InternalSecMFParser.g:2033:3: (lv_value_0_0= ruleNoQuoteString )
            {
            // InternalSecMFParser.g:2033:3: (lv_value_0_0= ruleNoQuoteString )
            // InternalSecMFParser.g:2034:4: lv_value_0_0= ruleNoQuoteString
            {

            				newCompositeNode(grammarAccess.getStringTermAccess().getValueNoQuoteStringParserRuleCall_0());
            			
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:2054:1: entryRuleNoQuoteString returns [String current=null] : iv_ruleNoQuoteString= ruleNoQuoteString EOF ;
    public final String entryRuleNoQuoteString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNoQuoteString = null;


        try {
            // InternalSecMFParser.g:2054:53: (iv_ruleNoQuoteString= ruleNoQuoteString EOF )
            // InternalSecMFParser.g:2055:2: iv_ruleNoQuoteString= ruleNoQuoteString EOF
            {
             newCompositeNode(grammarAccess.getNoQuoteStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNoQuoteString=ruleNoQuoteString();

            state._fsp--;

             current =iv_ruleNoQuoteString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2061:1: ruleNoQuoteString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleNoQuoteString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2067:2: (this_STRING_0= RULE_STRING )
            // InternalSecMFParser.g:2068:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2078:1: entryRuleArrayRange returns [EObject current=null] : iv_ruleArrayRange= ruleArrayRange EOF ;
    public final EObject entryRuleArrayRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayRange = null;


        try {
            // InternalSecMFParser.g:2078:51: (iv_ruleArrayRange= ruleArrayRange EOF )
            // InternalSecMFParser.g:2079:2: iv_ruleArrayRange= ruleArrayRange EOF
            {
             newCompositeNode(grammarAccess.getArrayRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArrayRange=ruleArrayRange();

            state._fsp--;

             current =iv_ruleArrayRange; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2085:1: ruleArrayRange returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) ;
    public final EObject ruleArrayRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_lowerBound_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_4_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:2091:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket ) )
            // InternalSecMFParser.g:2092:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            {
            // InternalSecMFParser.g:2092:2: ( () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket )
            // InternalSecMFParser.g:2093:3: () otherlv_1= LeftSquareBracket ( (lv_lowerBound_2_0= ruleINTVALUE ) ) (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )? otherlv_5= RightSquareBracket
            {
            // InternalSecMFParser.g:2093:3: ()
            // InternalSecMFParser.g:2094:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArrayRangeAccess().getArrayRangeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FollowSets000.FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayRangeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalSecMFParser.g:2104:3: ( (lv_lowerBound_2_0= ruleINTVALUE ) )
            // InternalSecMFParser.g:2105:4: (lv_lowerBound_2_0= ruleINTVALUE )
            {
            // InternalSecMFParser.g:2105:4: (lv_lowerBound_2_0= ruleINTVALUE )
            // InternalSecMFParser.g:2106:5: lv_lowerBound_2_0= ruleINTVALUE
            {

            					newCompositeNode(grammarAccess.getArrayRangeAccess().getLowerBoundINTVALUEParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalSecMFParser.g:2123:3: (otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==FullStopFullStop) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalSecMFParser.g:2124:4: otherlv_3= FullStopFullStop ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    {
                    otherlv_3=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getArrayRangeAccess().getFullStopFullStopKeyword_3_0());
                    			
                    // InternalSecMFParser.g:2128:4: ( (lv_upperBound_4_0= ruleINTVALUE ) )
                    // InternalSecMFParser.g:2129:5: (lv_upperBound_4_0= ruleINTVALUE )
                    {
                    // InternalSecMFParser.g:2129:5: (lv_upperBound_4_0= ruleINTVALUE )
                    // InternalSecMFParser.g:2130:6: lv_upperBound_4_0= ruleINTVALUE
                    {

                    						newCompositeNode(grammarAccess.getArrayRangeAccess().getUpperBoundINTVALUEParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_39);
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

            otherlv_5=(Token)match(input,RightSquareBracket,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2156:1: entryRuleSignedConstant returns [EObject current=null] : iv_ruleSignedConstant= ruleSignedConstant EOF ;
    public final EObject entryRuleSignedConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedConstant = null;


        try {
            // InternalSecMFParser.g:2156:55: (iv_ruleSignedConstant= ruleSignedConstant EOF )
            // InternalSecMFParser.g:2157:2: iv_ruleSignedConstant= ruleSignedConstant EOF
            {
             newCompositeNode(grammarAccess.getSignedConstantRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedConstant=ruleSignedConstant();

            state._fsp--;

             current =iv_ruleSignedConstant; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2163:1: ruleSignedConstant returns [EObject current=null] : ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) ;
    public final EObject ruleSignedConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ownedPropertyExpression_1_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:2169:2: ( ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) ) )
            // InternalSecMFParser.g:2170:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            {
            // InternalSecMFParser.g:2170:2: ( ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) ) )
            // InternalSecMFParser.g:2171:3: ( (lv_op_0_0= rulePlusMinus ) ) ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            {
            // InternalSecMFParser.g:2171:3: ( (lv_op_0_0= rulePlusMinus ) )
            // InternalSecMFParser.g:2172:4: (lv_op_0_0= rulePlusMinus )
            {
            // InternalSecMFParser.g:2172:4: (lv_op_0_0= rulePlusMinus )
            // InternalSecMFParser.g:2173:5: lv_op_0_0= rulePlusMinus
            {

            					newCompositeNode(grammarAccess.getSignedConstantAccess().getOpPlusMinusParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_40);
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

            // InternalSecMFParser.g:2190:3: ( (lv_ownedPropertyExpression_1_0= ruleConstantValue ) )
            // InternalSecMFParser.g:2191:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            {
            // InternalSecMFParser.g:2191:4: (lv_ownedPropertyExpression_1_0= ruleConstantValue )
            // InternalSecMFParser.g:2192:5: lv_ownedPropertyExpression_1_0= ruleConstantValue
            {

            					newCompositeNode(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionConstantValueParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:2213:1: entryRuleIntegerTerm returns [EObject current=null] : iv_ruleIntegerTerm= ruleIntegerTerm EOF ;
    public final EObject entryRuleIntegerTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTerm = null;


        try {
            // InternalSecMFParser.g:2213:52: (iv_ruleIntegerTerm= ruleIntegerTerm EOF )
            // InternalSecMFParser.g:2214:2: iv_ruleIntegerTerm= ruleIntegerTerm EOF
            {
             newCompositeNode(grammarAccess.getIntegerTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerTerm=ruleIntegerTerm();

            state._fsp--;

             current =iv_ruleIntegerTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2220:1: ruleIntegerTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleIntegerTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:2226:2: ( ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalSecMFParser.g:2227:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalSecMFParser.g:2227:2: ( ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalSecMFParser.g:2228:3: ( (lv_value_0_0= ruleSignedInt ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalSecMFParser.g:2228:3: ( (lv_value_0_0= ruleSignedInt ) )
            // InternalSecMFParser.g:2229:4: (lv_value_0_0= ruleSignedInt )
            {
            // InternalSecMFParser.g:2229:4: (lv_value_0_0= ruleSignedInt )
            // InternalSecMFParser.g:2230:5: lv_value_0_0= ruleSignedInt
            {

            					newCompositeNode(grammarAccess.getIntegerTermAccess().getValueSignedIntParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_16);
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

            // InternalSecMFParser.g:2247:3: ( (otherlv_1= RULE_ID ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSecMFParser.g:2248:4: (otherlv_1= RULE_ID )
                    {
                    // InternalSecMFParser.g:2248:4: (otherlv_1= RULE_ID )
                    // InternalSecMFParser.g:2249:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntegerTermRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2264:1: entryRuleSignedInt returns [String current=null] : iv_ruleSignedInt= ruleSignedInt EOF ;
    public final String entryRuleSignedInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedInt = null;


        try {
            // InternalSecMFParser.g:2264:49: (iv_ruleSignedInt= ruleSignedInt EOF )
            // InternalSecMFParser.g:2265:2: iv_ruleSignedInt= ruleSignedInt EOF
            {
             newCompositeNode(grammarAccess.getSignedIntRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedInt=ruleSignedInt();

            state._fsp--;

             current =iv_ruleSignedInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2271:1: ruleSignedInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INTEGER_LIT_2=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2277:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT ) )
            // InternalSecMFParser.g:2278:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            {
            // InternalSecMFParser.g:2278:2: ( (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT )
            // InternalSecMFParser.g:2279:3: (kw= PlusSign | kw= HyphenMinus )? this_INTEGER_LIT_2= RULE_INTEGER_LIT
            {
            // InternalSecMFParser.g:2279:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==PlusSign) ) {
                alt40=1;
            }
            else if ( (LA40_0==HyphenMinus) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // InternalSecMFParser.g:2280:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedIntAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:2286:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_37); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedIntAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            this_INTEGER_LIT_2=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2303:1: entryRuleRealTerm returns [EObject current=null] : iv_ruleRealTerm= ruleRealTerm EOF ;
    public final EObject entryRuleRealTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTerm = null;


        try {
            // InternalSecMFParser.g:2303:49: (iv_ruleRealTerm= ruleRealTerm EOF )
            // InternalSecMFParser.g:2304:2: iv_ruleRealTerm= ruleRealTerm EOF
            {
             newCompositeNode(grammarAccess.getRealTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRealTerm=ruleRealTerm();

            state._fsp--;

             current =iv_ruleRealTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2310:1: ruleRealTerm returns [EObject current=null] : ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) ;
    public final EObject ruleRealTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:2316:2: ( ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? ) )
            // InternalSecMFParser.g:2317:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            {
            // InternalSecMFParser.g:2317:2: ( ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )? )
            // InternalSecMFParser.g:2318:3: ( (lv_value_0_0= ruleSignedReal ) ) ( (otherlv_1= RULE_ID ) )?
            {
            // InternalSecMFParser.g:2318:3: ( (lv_value_0_0= ruleSignedReal ) )
            // InternalSecMFParser.g:2319:4: (lv_value_0_0= ruleSignedReal )
            {
            // InternalSecMFParser.g:2319:4: (lv_value_0_0= ruleSignedReal )
            // InternalSecMFParser.g:2320:5: lv_value_0_0= ruleSignedReal
            {

            					newCompositeNode(grammarAccess.getRealTermAccess().getValueSignedRealParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_16);
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

            // InternalSecMFParser.g:2337:3: ( (otherlv_1= RULE_ID ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSecMFParser.g:2338:4: (otherlv_1= RULE_ID )
                    {
                    // InternalSecMFParser.g:2338:4: (otherlv_1= RULE_ID )
                    // InternalSecMFParser.g:2339:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealTermRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2354:1: entryRuleSignedReal returns [String current=null] : iv_ruleSignedReal= ruleSignedReal EOF ;
    public final String entryRuleSignedReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSignedReal = null;


        try {
            // InternalSecMFParser.g:2354:50: (iv_ruleSignedReal= ruleSignedReal EOF )
            // InternalSecMFParser.g:2355:2: iv_ruleSignedReal= ruleSignedReal EOF
            {
             newCompositeNode(grammarAccess.getSignedRealRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignedReal=ruleSignedReal();

            state._fsp--;

             current =iv_ruleSignedReal.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2361:1: ruleSignedReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) ;
    public final AntlrDatatypeRuleToken ruleSignedReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REAL_LIT_2=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2367:2: ( ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT ) )
            // InternalSecMFParser.g:2368:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            {
            // InternalSecMFParser.g:2368:2: ( (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT )
            // InternalSecMFParser.g:2369:3: (kw= PlusSign | kw= HyphenMinus )? this_REAL_LIT_2= RULE_REAL_LIT
            {
            // InternalSecMFParser.g:2369:3: (kw= PlusSign | kw= HyphenMinus )?
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==PlusSign) ) {
                alt42=1;
            }
            else if ( (LA42_0==HyphenMinus) ) {
                alt42=2;
            }
            switch (alt42) {
                case 1 :
                    // InternalSecMFParser.g:2370:4: kw= PlusSign
                    {
                    kw=(Token)match(input,PlusSign,FollowSets000.FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedRealAccess().getPlusSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:2376:4: kw= HyphenMinus
                    {
                    kw=(Token)match(input,HyphenMinus,FollowSets000.FOLLOW_41); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getSignedRealAccess().getHyphenMinusKeyword_0_1());
                    			

                    }
                    break;

            }

            this_REAL_LIT_2=(Token)match(input,RULE_REAL_LIT,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2393:1: entryRuleNumericRangeTerm returns [EObject current=null] : iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF ;
    public final EObject entryRuleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericRangeTerm = null;


        try {
            // InternalSecMFParser.g:2393:57: (iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF )
            // InternalSecMFParser.g:2394:2: iv_ruleNumericRangeTerm= ruleNumericRangeTerm EOF
            {
             newCompositeNode(grammarAccess.getNumericRangeTermRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumericRangeTerm=ruleNumericRangeTerm();

            state._fsp--;

             current =iv_ruleNumericRangeTerm; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2400:1: ruleNumericRangeTerm returns [EObject current=null] : ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) ;
    public final EObject ruleNumericRangeTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_minimum_0_0 = null;

        EObject lv_maximum_2_0 = null;

        EObject lv_delta_4_0 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:2406:2: ( ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? ) )
            // InternalSecMFParser.g:2407:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            {
            // InternalSecMFParser.g:2407:2: ( ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )? )
            // InternalSecMFParser.g:2408:3: ( (lv_minimum_0_0= ruleNumAlt ) ) otherlv_1= FullStopFullStop ( (lv_maximum_2_0= ruleNumAlt ) ) (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            {
            // InternalSecMFParser.g:2408:3: ( (lv_minimum_0_0= ruleNumAlt ) )
            // InternalSecMFParser.g:2409:4: (lv_minimum_0_0= ruleNumAlt )
            {
            // InternalSecMFParser.g:2409:4: (lv_minimum_0_0= ruleNumAlt )
            // InternalSecMFParser.g:2410:5: lv_minimum_0_0= ruleNumAlt
            {

            					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMinimumNumAltParserRuleCall_0_0());
            				
            pushFollow(FollowSets000.FOLLOW_42);
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

            otherlv_1=(Token)match(input,FullStopFullStop,FollowSets000.FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getNumericRangeTermAccess().getFullStopFullStopKeyword_1());
            		
            // InternalSecMFParser.g:2431:3: ( (lv_maximum_2_0= ruleNumAlt ) )
            // InternalSecMFParser.g:2432:4: (lv_maximum_2_0= ruleNumAlt )
            {
            // InternalSecMFParser.g:2432:4: (lv_maximum_2_0= ruleNumAlt )
            // InternalSecMFParser.g:2433:5: lv_maximum_2_0= ruleNumAlt
            {

            					newCompositeNode(grammarAccess.getNumericRangeTermAccess().getMaximumNumAltParserRuleCall_2_0());
            				
            pushFollow(FollowSets000.FOLLOW_43);
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

            // InternalSecMFParser.g:2450:3: (otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Delta) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalSecMFParser.g:2451:4: otherlv_3= Delta ( (lv_delta_4_0= ruleNumAlt ) )
                    {
                    otherlv_3=(Token)match(input,Delta,FollowSets000.FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getNumericRangeTermAccess().getDeltaKeyword_3_0());
                    			
                    // InternalSecMFParser.g:2455:4: ( (lv_delta_4_0= ruleNumAlt ) )
                    // InternalSecMFParser.g:2456:5: (lv_delta_4_0= ruleNumAlt )
                    {
                    // InternalSecMFParser.g:2456:5: (lv_delta_4_0= ruleNumAlt )
                    // InternalSecMFParser.g:2457:6: lv_delta_4_0= ruleNumAlt
                    {

                    						newCompositeNode(grammarAccess.getNumericRangeTermAccess().getDeltaNumAltParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:2479:1: entryRuleNumAlt returns [EObject current=null] : iv_ruleNumAlt= ruleNumAlt EOF ;
    public final EObject entryRuleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumAlt = null;


        try {
            // InternalSecMFParser.g:2479:47: (iv_ruleNumAlt= ruleNumAlt EOF )
            // InternalSecMFParser.g:2480:2: iv_ruleNumAlt= ruleNumAlt EOF
            {
             newCompositeNode(grammarAccess.getNumAltRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNumAlt=ruleNumAlt();

            state._fsp--;

             current =iv_ruleNumAlt; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2486:1: ruleNumAlt returns [EObject current=null] : (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) ;
    public final EObject ruleNumAlt() throws RecognitionException {
        EObject current = null;

        EObject this_RealTerm_0 = null;

        EObject this_IntegerTerm_1 = null;

        EObject this_SignedConstant_2 = null;

        EObject this_ConstantValue_3 = null;



        	enterRule();

        try {
            // InternalSecMFParser.g:2492:2: ( (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue ) )
            // InternalSecMFParser.g:2493:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            {
            // InternalSecMFParser.g:2493:2: (this_RealTerm_0= ruleRealTerm | this_IntegerTerm_1= ruleIntegerTerm | this_SignedConstant_2= ruleSignedConstant | this_ConstantValue_3= ruleConstantValue )
            int alt44=4;
            switch ( input.LA(1) ) {
            case PlusSign:
                {
                switch ( input.LA(2) ) {
                case RULE_REAL_LIT:
                    {
                    alt44=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt44=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt44=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }

                }
                break;
            case HyphenMinus:
                {
                switch ( input.LA(2) ) {
                case RULE_ID:
                    {
                    alt44=3;
                    }
                    break;
                case RULE_REAL_LIT:
                    {
                    alt44=1;
                    }
                    break;
                case RULE_INTEGER_LIT:
                    {
                    alt44=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_REAL_LIT:
                {
                alt44=1;
                }
                break;
            case RULE_INTEGER_LIT:
                {
                alt44=2;
                }
                break;
            case RULE_ID:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalSecMFParser.g:2494:3: this_RealTerm_0= ruleRealTerm
                    {

                    			newCompositeNode(grammarAccess.getNumAltAccess().getRealTermParserRuleCall_0());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_RealTerm_0=ruleRealTerm();

                    state._fsp--;


                    			current = this_RealTerm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSecMFParser.g:2503:3: this_IntegerTerm_1= ruleIntegerTerm
                    {

                    			newCompositeNode(grammarAccess.getNumAltAccess().getIntegerTermParserRuleCall_1());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerTerm_1=ruleIntegerTerm();

                    state._fsp--;


                    			current = this_IntegerTerm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSecMFParser.g:2512:3: this_SignedConstant_2= ruleSignedConstant
                    {

                    			newCompositeNode(grammarAccess.getNumAltAccess().getSignedConstantParserRuleCall_2());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SignedConstant_2=ruleSignedConstant();

                    state._fsp--;


                    			current = this_SignedConstant_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSecMFParser.g:2521:3: this_ConstantValue_3= ruleConstantValue
                    {

                    			newCompositeNode(grammarAccess.getNumAltAccess().getConstantValueParserRuleCall_3());
                    		
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // InternalSecMFParser.g:2533:1: entryRuleAppliesToKeywords returns [String current=null] : iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF ;
    public final String entryRuleAppliesToKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAppliesToKeywords = null;


        try {
            // InternalSecMFParser.g:2533:57: (iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF )
            // InternalSecMFParser.g:2534:2: iv_ruleAppliesToKeywords= ruleAppliesToKeywords EOF
            {
             newCompositeNode(grammarAccess.getAppliesToKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAppliesToKeywords=ruleAppliesToKeywords();

            state._fsp--;

             current =iv_ruleAppliesToKeywords.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2540:1: ruleAppliesToKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Applies kw= To ) ;
    public final AntlrDatatypeRuleToken ruleAppliesToKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2546:2: ( (kw= Applies kw= To ) )
            // InternalSecMFParser.g:2547:2: (kw= Applies kw= To )
            {
            // InternalSecMFParser.g:2547:2: (kw= Applies kw= To )
            // InternalSecMFParser.g:2548:3: kw= Applies kw= To
            {
            kw=(Token)match(input,Applies,FollowSets000.FOLLOW_44); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getAppliesToKeywordsAccess().getAppliesKeyword_0());
            		
            kw=(Token)match(input,To,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2562:1: entryRuleInBindingKeywords returns [String current=null] : iv_ruleInBindingKeywords= ruleInBindingKeywords EOF ;
    public final String entryRuleInBindingKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInBindingKeywords = null;


        try {
            // InternalSecMFParser.g:2562:57: (iv_ruleInBindingKeywords= ruleInBindingKeywords EOF )
            // InternalSecMFParser.g:2563:2: iv_ruleInBindingKeywords= ruleInBindingKeywords EOF
            {
             newCompositeNode(grammarAccess.getInBindingKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInBindingKeywords=ruleInBindingKeywords();

            state._fsp--;

             current =iv_ruleInBindingKeywords.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2569:1: ruleInBindingKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Binding ) ;
    public final AntlrDatatypeRuleToken ruleInBindingKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2575:2: ( (kw= In kw= Binding ) )
            // InternalSecMFParser.g:2576:2: (kw= In kw= Binding )
            {
            // InternalSecMFParser.g:2576:2: (kw= In kw= Binding )
            // InternalSecMFParser.g:2577:3: kw= In kw= Binding
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_45); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getInBindingKeywordsAccess().getInKeyword_0());
            		
            kw=(Token)match(input,Binding,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2591:1: entryRuleInModesKeywords returns [String current=null] : iv_ruleInModesKeywords= ruleInModesKeywords EOF ;
    public final String entryRuleInModesKeywords() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInModesKeywords = null;


        try {
            // InternalSecMFParser.g:2591:55: (iv_ruleInModesKeywords= ruleInModesKeywords EOF )
            // InternalSecMFParser.g:2592:2: iv_ruleInModesKeywords= ruleInModesKeywords EOF
            {
             newCompositeNode(grammarAccess.getInModesKeywordsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInModesKeywords=ruleInModesKeywords();

            state._fsp--;

             current =iv_ruleInModesKeywords.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2598:1: ruleInModesKeywords returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= In kw= Modes ) ;
    public final AntlrDatatypeRuleToken ruleInModesKeywords() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2604:2: ( (kw= In kw= Modes ) )
            // InternalSecMFParser.g:2605:2: (kw= In kw= Modes )
            {
            // InternalSecMFParser.g:2605:2: (kw= In kw= Modes )
            // InternalSecMFParser.g:2606:3: kw= In kw= Modes
            {
            kw=(Token)match(input,In,FollowSets000.FOLLOW_46); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getInModesKeywordsAccess().getInKeyword_0());
            		
            kw=(Token)match(input,Modes,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2620:1: entryRuleINTVALUE returns [String current=null] : iv_ruleINTVALUE= ruleINTVALUE EOF ;
    public final String entryRuleINTVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTVALUE = null;


        try {
            // InternalSecMFParser.g:2620:48: (iv_ruleINTVALUE= ruleINTVALUE EOF )
            // InternalSecMFParser.g:2621:2: iv_ruleINTVALUE= ruleINTVALUE EOF
            {
             newCompositeNode(grammarAccess.getINTVALUERule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleINTVALUE=ruleINTVALUE();

            state._fsp--;

             current =iv_ruleINTVALUE.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2627:1: ruleINTVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INTEGER_LIT_0= RULE_INTEGER_LIT ;
    public final AntlrDatatypeRuleToken ruleINTVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_LIT_0=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2633:2: (this_INTEGER_LIT_0= RULE_INTEGER_LIT )
            // InternalSecMFParser.g:2634:2: this_INTEGER_LIT_0= RULE_INTEGER_LIT
            {
            this_INTEGER_LIT_0=(Token)match(input,RULE_INTEGER_LIT,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2644:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // InternalSecMFParser.g:2644:45: (iv_ruleQPREF= ruleQPREF EOF )
            // InternalSecMFParser.g:2645:2: iv_ruleQPREF= ruleQPREF EOF
            {
             newCompositeNode(grammarAccess.getQPREFRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;

             current =iv_ruleQPREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2651:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2657:2: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? ) )
            // InternalSecMFParser.g:2658:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            {
            // InternalSecMFParser.g:2658:2: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )? )
            // InternalSecMFParser.g:2659:3: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_24); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0());
            		
            // InternalSecMFParser.g:2666:3: (kw= ColonColon this_ID_2= RULE_ID )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ColonColon) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSecMFParser.g:2667:4: kw= ColonColon this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0());
                    			
                    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2684:1: entryRuleQCREF returns [String current=null] : iv_ruleQCREF= ruleQCREF EOF ;
    public final String entryRuleQCREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQCREF = null;


        try {
            // InternalSecMFParser.g:2684:45: (iv_ruleQCREF= ruleQCREF EOF )
            // InternalSecMFParser.g:2685:2: iv_ruleQCREF= ruleQCREF EOF
            {
             newCompositeNode(grammarAccess.getQCREFRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleQCREF=ruleQCREF();

            state._fsp--;

             current =iv_ruleQCREF.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2691:1: ruleQCREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleQCREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2697:2: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? ) )
            // InternalSecMFParser.g:2698:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            {
            // InternalSecMFParser.g:2698:2: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )? )
            // InternalSecMFParser.g:2699:3: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )?
            {
            // InternalSecMFParser.g:2699:3: (this_ID_0= RULE_ID kw= ColonColon )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1==ColonColon) ) {
                        alt46=1;
                    }


                }


                switch (alt46) {
            	case 1 :
            	    // InternalSecMFParser.g:2700:4: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_47); 

            	    				current.merge(this_ID_0);
            	    			

            	    				newLeafNode(this_ID_0, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_0_0());
            	    			
            	    kw=(Token)match(input,ColonColon,FollowSets000.FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQCREFAccess().getColonColonKeyword_0_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_48); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getQCREFAccess().getIDTerminalRuleCall_1());
            		
            // InternalSecMFParser.g:2720:3: (kw= FullStop this_ID_4= RULE_ID )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==FullStop) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSecMFParser.g:2721:4: kw= FullStop this_ID_4= RULE_ID
                    {
                    kw=(Token)match(input,FullStop,FollowSets000.FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQCREFAccess().getFullStopKeyword_2_0());
                    			
                    this_ID_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2738:1: entryRuleSTAR returns [String current=null] : iv_ruleSTAR= ruleSTAR EOF ;
    public final String entryRuleSTAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTAR = null;


        try {
            // InternalSecMFParser.g:2738:44: (iv_ruleSTAR= ruleSTAR EOF )
            // InternalSecMFParser.g:2739:2: iv_ruleSTAR= ruleSTAR EOF
            {
             newCompositeNode(grammarAccess.getSTARRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSTAR=ruleSTAR();

            state._fsp--;

             current =iv_ruleSTAR.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // InternalSecMFParser.g:2745:1: ruleSTAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Asterisk ;
    public final AntlrDatatypeRuleToken ruleSTAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSecMFParser.g:2751:2: (kw= Asterisk )
            // InternalSecMFParser.g:2752:2: kw= Asterisk
            {
            kw=(Token)match(input,Asterisk,FollowSets000.FOLLOW_2); 

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


    protected DFA30 dfa30 = new DFA30(this);
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

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1363:2: (this_RecordTerm_0= ruleRecordTerm | this_ReferenceTerm_1= ruleReferenceTerm | this_ComponentClassifierTerm_2= ruleComponentClassifierTerm | this_ComputedTerm_3= ruleComputedTerm | this_StringTerm_4= ruleStringTerm | this_NumericRangeTerm_5= ruleNumericRangeTerm | this_RealTerm_6= ruleRealTerm | this_IntegerTerm_7= ruleIntegerTerm | this_ListTerm_8= ruleListTerm | this_BooleanLiteral_9= ruleBooleanLiteral | this_LiteralorReferenceTerm_10= ruleLiteralorReferenceTerm )";
        }
    }
 

    
    private static class FollowSets000 {
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
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0400100000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000002L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000204000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x06442290009012C0L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000110400000400L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000110400000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000012000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400400000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x064422B0009012C0L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000240000000002L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400080000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0444028000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000040000000002L});
    }


}