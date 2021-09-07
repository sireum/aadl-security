
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
package org.sireum.aadl.osate.securitymodel.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;
import org.osate.xtext.aadl2.properties.services.PropertiesGrammarAccess;

@Singleton
public class SecMFGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SecMFRootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SecMFRoot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSecMFRootAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cLibraryAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cLibrarySMFLibraryParserRuleCall_1_0_0 = (RuleCall)cLibraryAssignment_1_0.eContents().get(0);
		private final Assignment cSubclausesAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cSubclausesSMFSubclauseParserRuleCall_1_1_0 = (RuleCall)cSubclausesAssignment_1_1.eContents().get(0);
		
		//SecMFRoot returns aadl2::NamedElement:
		//     {SecMFRoot} (library=SMFLibrary | subclauses+=SMFSubclause*)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{SecMFRoot} (library=SMFLibrary | subclauses+=SMFSubclause*)
		public Group getGroup() { return cGroup; }
		
		//{SecMFRoot}
		public Action getSecMFRootAction_0() { return cSecMFRootAction_0; }
		
		//(library=SMFLibrary | subclauses+=SMFSubclause*)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//library=SMFLibrary
		public Assignment getLibraryAssignment_1_0() { return cLibraryAssignment_1_0; }
		
		//SMFLibrary
		public RuleCall getLibrarySMFLibraryParserRuleCall_1_0_0() { return cLibrarySMFLibraryParserRuleCall_1_0_0; }
		
		//subclauses+=SMFSubclause*
		public Assignment getSubclausesAssignment_1_1() { return cSubclausesAssignment_1_1; }
		
		//SMFSubclause
		public RuleCall getSubclausesSMFSubclauseParserRuleCall_1_1_0() { return cSubclausesSMFSubclauseParserRuleCall_1_1_0; }
	}
	public class AnnexLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.AnnexLibrary");
		private final RuleCall cSecModelLibraryParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexLibrary returns aadl2::AnnexLibrary:
		//     SecModelLibrary
		// ;
		@Override public ParserRule getRule() { return rule; }
		
		//SecModelLibrary
		public RuleCall getSecModelLibraryParserRuleCall() { return cSecModelLibraryParserRuleCall; }
	}
	public class AnnexSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.AnnexSubclause");
		private final RuleCall cSecModelSubclauseParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//AnnexSubclause returns aadl2::AnnexSubclause:
		//     SecModelSubclause
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SecModelSubclause
		public RuleCall getSecModelSubclauseParserRuleCall() { return cSecModelSubclauseParserRuleCall; }
	}
	public class NamedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.NamedElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSecModelLibraryParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSMFClassificationParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSMFDeclassificationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cSMFTypeDefParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSMFTypeRefParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//NamedElement returns aadl2::NamedElement:
		//    SecModelLibrary   |  SMFClassification | SMFDeclassification  | SMFTypeDef | SMFTypeRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SecModelLibrary   |  SMFClassification | SMFDeclassification  | SMFTypeDef | SMFTypeRef
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//SecModelLibrary
		public RuleCall getSecModelLibraryParserRuleCall_0() { return cSecModelLibraryParserRuleCall_0; }
		
		//SMFClassification
		public RuleCall getSMFClassificationParserRuleCall_1() { return cSMFClassificationParserRuleCall_1; }
		
		//SMFDeclassification
		public RuleCall getSMFDeclassificationParserRuleCall_2() { return cSMFDeclassificationParserRuleCall_2; }
		
		//SMFTypeDef
		public RuleCall getSMFTypeDefParserRuleCall_3() { return cSMFTypeDefParserRuleCall_3; }
		
		//SMFTypeRef
		public RuleCall getSMFTypeRefParserRuleCall_4() { return cSMFTypeRefParserRuleCall_4; }
	}
	public class SecModelLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SecModelLibrary");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSecModelLibraryAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cDomainTypesKeywordsParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cTypesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cTypesSMFTypeDefParserRuleCall_1_1_0 = (RuleCall)cTypesAssignment_1_1.eContents().get(0);
		private final RuleCall cEndTypesKeywordsParserRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Keyword cSemicolonKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//SecModelLibrary returns SecModelLibrary:
		//    {SecModelLibrary}
		//    (DomainTypesKeywords
		//        (types+=SMFTypeDef)*
		//    EndTypesKeywords ';'
		//    )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{SecModelLibrary}
		//(DomainTypesKeywords
		//    (types+=SMFTypeDef)*
		//EndTypesKeywords ';'
		//)?
		public Group getGroup() { return cGroup; }
		
		//{SecModelLibrary}
		public Action getSecModelLibraryAction_0() { return cSecModelLibraryAction_0; }
		
		//(DomainTypesKeywords
		//    (types+=SMFTypeDef)*
		//EndTypesKeywords ';'
		//)?
		public Group getGroup_1() { return cGroup_1; }
		
		//DomainTypesKeywords
		public RuleCall getDomainTypesKeywordsParserRuleCall_1_0() { return cDomainTypesKeywordsParserRuleCall_1_0; }
		
		//(types+=SMFTypeDef)*
		public Assignment getTypesAssignment_1_1() { return cTypesAssignment_1_1; }
		
		//SMFTypeDef
		public RuleCall getTypesSMFTypeDefParserRuleCall_1_1_0() { return cTypesSMFTypeDefParserRuleCall_1_1_0; }
		
		//EndTypesKeywords
		public RuleCall getEndTypesKeywordsParserRuleCall_1_2() { return cEndTypesKeywordsParserRuleCall_1_2; }
		
		//';'
		public Keyword getSemicolonKeyword_1_3() { return cSemicolonKeyword_1_3; }
	}
	public class SMFLibraryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SMFLibrary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cSecModelLibraryAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Group cGroup_0_1 = (Group)cGroup_0.eContents().get(1);
		private final Keyword cLibraryKeyword_0_1_0 = (Keyword)cGroup_0_1.eContents().get(0);
		private final Assignment cNameAssignment_0_1_1 = (Assignment)cGroup_0_1.eContents().get(1);
		private final RuleCall cNameQEMREFParserRuleCall_0_1_1_0 = (RuleCall)cNameAssignment_0_1_1.eContents().get(0);
		private final Group cGroup_0_1_2 = (Group)cGroup_0_1.eContents().get(2);
		private final RuleCall cDomainTypesKeywordsParserRuleCall_0_1_2_0 = (RuleCall)cGroup_0_1_2.eContents().get(0);
		private final Assignment cTypesAssignment_0_1_2_1 = (Assignment)cGroup_0_1_2.eContents().get(1);
		private final RuleCall cTypesSMFTypeDefParserRuleCall_0_1_2_1_0 = (RuleCall)cTypesAssignment_0_1_2_1.eContents().get(0);
		private final RuleCall cEndTypesKeywordsParserRuleCall_0_1_2_2 = (RuleCall)cGroup_0_1_2.eContents().get(2);
		private final Keyword cSemicolonKeyword_0_1_2_3 = (Keyword)cGroup_0_1_2.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cPackageKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cNameQEMREFParserRuleCall_1_1_0 = (RuleCall)cNameAssignment_1_1.eContents().get(0);
		private final Keyword cPublicKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Keyword cAnnexKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final RuleCall cIDTerminalRuleCall_1_4 = (RuleCall)cGroup_1.eContents().get(4);
		private final Keyword cLeftCurlyBracketAsteriskAsteriskKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		private final Group cGroup_1_6 = (Group)cGroup_1.eContents().get(6);
		private final RuleCall cDomainTypesKeywordsParserRuleCall_1_6_0 = (RuleCall)cGroup_1_6.eContents().get(0);
		private final Assignment cTypeAssignment_1_6_1 = (Assignment)cGroup_1_6.eContents().get(1);
		private final RuleCall cTypeSMFTypeDefParserRuleCall_1_6_1_0 = (RuleCall)cTypeAssignment_1_6_1.eContents().get(0);
		private final RuleCall cEndTypesKeywordsParserRuleCall_1_6_2 = (RuleCall)cGroup_1_6.eContents().get(2);
		private final Keyword cSemicolonKeyword_1_6_3 = (Keyword)cGroup_1_6.eContents().get(3);
		private final Keyword cAsteriskAsteriskRightCurlyBracketKeyword_1_7 = (Keyword)cGroup_1.eContents().get(7);
		private final Keyword cSemicolonKeyword_1_8 = (Keyword)cGroup_1.eContents().get(8);
		private final Keyword cEndKeyword_1_9 = (Keyword)cGroup_1.eContents().get(9);
		private final RuleCall cQEMREFParserRuleCall_1_10 = (RuleCall)cGroup_1.eContents().get(10);
		private final Keyword cSemicolonKeyword_1_11 = (Keyword)cGroup_1.eContents().get(11);
		
		//SMFLibrary returns SecModelLibrary:
		//    {SecModelLibrary}
		//    ('library' name=QEMREF
		//        (
		//            DomainTypesKeywords
		//            (types+=SMFTypeDef)*
		//            EndTypesKeywords ';'
		//        )?
		//    ) |
		//    ('package' name=QEMREF 'public'
		//  'annex' ID  '{**'
		//    (
		//        DomainTypesKeywords
		//        (type+=SMFTypeDef)*
		//        EndTypesKeywords ';'
		//    )?
		//    '**}' ';' 'end' QEMREF ';'
		//    )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  {SecModelLibrary}
		//  ('library' name=QEMREF
		//      (
		//          DomainTypesKeywords
		//          (types+=SMFTypeDef)*
		//          EndTypesKeywords ';'
		//      )?
		//  ) |
		//  ('package' name=QEMREF 'public'
		//'annex' ID  '{**'
		//  (
		//      DomainTypesKeywords
		//      (type+=SMFTypeDef)*
		//      EndTypesKeywords ';'
		//  )?
		//  '**}' ';' 'end' QEMREF ';'
		//  )
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{SecModelLibrary}
		//('library' name=QEMREF
		//    (
		//        DomainTypesKeywords
		//        (types+=SMFTypeDef)*
		//        EndTypesKeywords ';'
		//    )?
		//)
		public Group getGroup_0() { return cGroup_0; }
		
		//{SecModelLibrary}
		public Action getSecModelLibraryAction_0_0() { return cSecModelLibraryAction_0_0; }
		
		//('library' name=QEMREF
		//    (
		//        DomainTypesKeywords
		//        (types+=SMFTypeDef)*
		//        EndTypesKeywords ';'
		//    )?
		//)
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//'library'
		public Keyword getLibraryKeyword_0_1_0() { return cLibraryKeyword_0_1_0; }
		
		//name=QEMREF
		public Assignment getNameAssignment_0_1_1() { return cNameAssignment_0_1_1; }
		
		//QEMREF
		public RuleCall getNameQEMREFParserRuleCall_0_1_1_0() { return cNameQEMREFParserRuleCall_0_1_1_0; }
		
		//(
		//    DomainTypesKeywords
		//    (types+=SMFTypeDef)*
		//    EndTypesKeywords ';'
		//)?
		public Group getGroup_0_1_2() { return cGroup_0_1_2; }
		
		//DomainTypesKeywords
		public RuleCall getDomainTypesKeywordsParserRuleCall_0_1_2_0() { return cDomainTypesKeywordsParserRuleCall_0_1_2_0; }
		
		//(types+=SMFTypeDef)*
		public Assignment getTypesAssignment_0_1_2_1() { return cTypesAssignment_0_1_2_1; }
		
		//SMFTypeDef
		public RuleCall getTypesSMFTypeDefParserRuleCall_0_1_2_1_0() { return cTypesSMFTypeDefParserRuleCall_0_1_2_1_0; }
		
		//EndTypesKeywords
		public RuleCall getEndTypesKeywordsParserRuleCall_0_1_2_2() { return cEndTypesKeywordsParserRuleCall_0_1_2_2; }
		
		//';'
		public Keyword getSemicolonKeyword_0_1_2_3() { return cSemicolonKeyword_0_1_2_3; }
		
		//  ('package' name=QEMREF 'public'
		//'annex' ID  '{**'
		//  (
		//      DomainTypesKeywords
		//      (type+=SMFTypeDef)*
		//      EndTypesKeywords ';'
		//  )?
		//  '**}' ';' 'end' QEMREF ';'
		//  )
		public Group getGroup_1() { return cGroup_1; }
		
		//'package'
		public Keyword getPackageKeyword_1_0() { return cPackageKeyword_1_0; }
		
		//name=QEMREF
		public Assignment getNameAssignment_1_1() { return cNameAssignment_1_1; }
		
		//QEMREF
		public RuleCall getNameQEMREFParserRuleCall_1_1_0() { return cNameQEMREFParserRuleCall_1_1_0; }
		
		//'public'
		public Keyword getPublicKeyword_1_2() { return cPublicKeyword_1_2; }
		
		//'annex'
		public Keyword getAnnexKeyword_1_3() { return cAnnexKeyword_1_3; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_4() { return cIDTerminalRuleCall_1_4; }
		
		//'{**'
		public Keyword getLeftCurlyBracketAsteriskAsteriskKeyword_1_5() { return cLeftCurlyBracketAsteriskAsteriskKeyword_1_5; }
		
		//(
		//    DomainTypesKeywords
		//    (type+=SMFTypeDef)*
		//    EndTypesKeywords ';'
		//)?
		public Group getGroup_1_6() { return cGroup_1_6; }
		
		//DomainTypesKeywords
		public RuleCall getDomainTypesKeywordsParserRuleCall_1_6_0() { return cDomainTypesKeywordsParserRuleCall_1_6_0; }
		
		//(type+=SMFTypeDef)*
		public Assignment getTypeAssignment_1_6_1() { return cTypeAssignment_1_6_1; }
		
		//SMFTypeDef
		public RuleCall getTypeSMFTypeDefParserRuleCall_1_6_1_0() { return cTypeSMFTypeDefParserRuleCall_1_6_1_0; }
		
		//EndTypesKeywords
		public RuleCall getEndTypesKeywordsParserRuleCall_1_6_2() { return cEndTypesKeywordsParserRuleCall_1_6_2; }
		
		//';'
		public Keyword getSemicolonKeyword_1_6_3() { return cSemicolonKeyword_1_6_3; }
		
		//'**}'
		public Keyword getAsteriskAsteriskRightCurlyBracketKeyword_1_7() { return cAsteriskAsteriskRightCurlyBracketKeyword_1_7; }
		
		//';'
		public Keyword getSemicolonKeyword_1_8() { return cSemicolonKeyword_1_8; }
		
		//'end'
		public Keyword getEndKeyword_1_9() { return cEndKeyword_1_9; }
		
		//QEMREF
		public RuleCall getQEMREFParserRuleCall_1_10() { return cQEMREFParserRuleCall_1_10; }
		
		//';'
		public Keyword getSemicolonKeyword_1_11() { return cSemicolonKeyword_1_11; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.Element");
		private final RuleCall cSMFTypeRefParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Element returns aadl2::Element:
		//     SMFTypeRef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SMFTypeRef
		public RuleCall getSMFTypeRefParserRuleCall() { return cSMFTypeRefParserRuleCall; }
	}
	public class ModalElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.ModalElement");
		private final RuleCall cSecModelSubclauseParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ModalElement returns aadl2::ModalElement:
		//    SecModelSubclause
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SecModelSubclause
		public RuleCall getSecModelSubclauseParserRuleCall() { return cSecModelSubclauseParserRuleCall; }
	}
	public class SMFSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SMFSubclause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSecModelSubclauseAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSubclauseKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameQCREFParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final RuleCall cClassificationKeywordsParserRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final Assignment cClassificationAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cClassificationSMFClassificationParserRuleCall_3_1_0 = (RuleCall)cClassificationAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final RuleCall cDeclassificationKeywordsParserRuleCall_4_0 = (RuleCall)cGroup_4.eContents().get(0);
		private final Assignment cDeclassificationAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDeclassificationSMFDeclassificationParserRuleCall_4_1_0 = (RuleCall)cDeclassificationAssignment_4_1.eContents().get(0);
		
		//SMFSubclause returns SecModelSubclause:
		//    {SecModelSubclause} 'subclause' name=QCREF
		//    (ClassificationKeywords (classification += SMFClassification)+)?
		//    (DeclassificationKeywords (declassification += SMFDeclassification)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{SecModelSubclause} 'subclause' name=QCREF
		//(ClassificationKeywords (classification += SMFClassification)+)?
		//(DeclassificationKeywords (declassification += SMFDeclassification)+)?
		public Group getGroup() { return cGroup; }
		
		//{SecModelSubclause}
		public Action getSecModelSubclauseAction_0() { return cSecModelSubclauseAction_0; }
		
		//'subclause'
		public Keyword getSubclauseKeyword_1() { return cSubclauseKeyword_1; }
		
		//name=QCREF
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//QCREF
		public RuleCall getNameQCREFParserRuleCall_2_0() { return cNameQCREFParserRuleCall_2_0; }
		
		//(ClassificationKeywords (classification += SMFClassification)+)?
		public Group getGroup_3() { return cGroup_3; }
		
		//ClassificationKeywords
		public RuleCall getClassificationKeywordsParserRuleCall_3_0() { return cClassificationKeywordsParserRuleCall_3_0; }
		
		//(classification += SMFClassification)+
		public Assignment getClassificationAssignment_3_1() { return cClassificationAssignment_3_1; }
		
		//SMFClassification
		public RuleCall getClassificationSMFClassificationParserRuleCall_3_1_0() { return cClassificationSMFClassificationParserRuleCall_3_1_0; }
		
		//(DeclassificationKeywords (declassification += SMFDeclassification)+)?
		public Group getGroup_4() { return cGroup_4; }
		
		//DeclassificationKeywords
		public RuleCall getDeclassificationKeywordsParserRuleCall_4_0() { return cDeclassificationKeywordsParserRuleCall_4_0; }
		
		//(declassification += SMFDeclassification)+
		public Assignment getDeclassificationAssignment_4_1() { return cDeclassificationAssignment_4_1; }
		
		//SMFDeclassification
		public RuleCall getDeclassificationSMFDeclassificationParserRuleCall_4_1_0() { return cDeclassificationSMFDeclassificationParserRuleCall_4_1_0; }
	}
	public class SecModelSubclauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SecModelSubclause");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSecModelSubclauseAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cClassificationKeywordsParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cClassificationAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cClassificationSMFClassificationParserRuleCall_1_1_0 = (RuleCall)cClassificationAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cDeclassificationKeywordsParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cDeclassificationAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cDeclassificationSMFDeclassificationParserRuleCall_2_1_0 = (RuleCall)cDeclassificationAssignment_2_1.eContents().get(0);
		
		//SecModelSubclause returns SecModelSubclause:
		//    {SecModelSubclause}
		//    (ClassificationKeywords (classification += SMFClassification)+)?
		//    (DeclassificationKeywords (declassification += SMFDeclassification)+)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{SecModelSubclause}
		//(ClassificationKeywords (classification += SMFClassification)+)?
		//(DeclassificationKeywords (declassification += SMFDeclassification)+)?
		public Group getGroup() { return cGroup; }
		
		//{SecModelSubclause}
		public Action getSecModelSubclauseAction_0() { return cSecModelSubclauseAction_0; }
		
		//(ClassificationKeywords (classification += SMFClassification)+)?
		public Group getGroup_1() { return cGroup_1; }
		
		//ClassificationKeywords
		public RuleCall getClassificationKeywordsParserRuleCall_1_0() { return cClassificationKeywordsParserRuleCall_1_0; }
		
		//(classification += SMFClassification)+
		public Assignment getClassificationAssignment_1_1() { return cClassificationAssignment_1_1; }
		
		//SMFClassification
		public RuleCall getClassificationSMFClassificationParserRuleCall_1_1_0() { return cClassificationSMFClassificationParserRuleCall_1_1_0; }
		
		//(DeclassificationKeywords (declassification += SMFDeclassification)+)?
		public Group getGroup_2() { return cGroup_2; }
		
		//DeclassificationKeywords
		public RuleCall getDeclassificationKeywordsParserRuleCall_2_0() { return cDeclassificationKeywordsParserRuleCall_2_0; }
		
		//(declassification += SMFDeclassification)+
		public Assignment getDeclassificationAssignment_2_1() { return cDeclassificationAssignment_2_1; }
		
		//SMFDeclassification
		public RuleCall getDeclassificationSMFDeclassificationParserRuleCall_2_1_0() { return cDeclassificationSMFDeclassificationParserRuleCall_2_1_0; }
	}
	public class SMFClassificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SMFClassification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSMFClassificationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFeatureAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cFeatureNamedElementCrossReference_1_0 = (CrossReference)cFeatureAssignment_1.eContents().get(0);
		private final RuleCall cFeatureNamedElementIDTerminalRuleCall_1_0_1 = (RuleCall)cFeatureNamedElementCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeRefAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeRefSMFTypeRefCrossReference_3_0 = (CrossReference)cTypeRefAssignment_3.eContents().get(0);
		private final RuleCall cTypeRefSMFTypeRefIDTerminalRuleCall_3_0_1 = (RuleCall)cTypeRefSMFTypeRefCrossReference_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SMFClassification returns SMFClassification:
		//    {SMFClassification}
		//    (feature=[aadl2::NamedElement| ID])
		//    ':' typeRef = [SMFTypeRef|ID]
		//    ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{SMFClassification}
		//(feature=[aadl2::NamedElement| ID])
		//':' typeRef = [SMFTypeRef|ID]
		//';'
		public Group getGroup() { return cGroup; }
		
		//{SMFClassification}
		public Action getSMFClassificationAction_0() { return cSMFClassificationAction_0; }
		
		//(feature=[aadl2::NamedElement| ID])
		public Assignment getFeatureAssignment_1() { return cFeatureAssignment_1; }
		
		//[aadl2::NamedElement| ID]
		public CrossReference getFeatureNamedElementCrossReference_1_0() { return cFeatureNamedElementCrossReference_1_0; }
		
		//ID
		public RuleCall getFeatureNamedElementIDTerminalRuleCall_1_0_1() { return cFeatureNamedElementIDTerminalRuleCall_1_0_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//typeRef = [SMFTypeRef|ID]
		public Assignment getTypeRefAssignment_3() { return cTypeRefAssignment_3; }
		
		//[SMFTypeRef|ID]
		public CrossReference getTypeRefSMFTypeRefCrossReference_3_0() { return cTypeRefSMFTypeRefCrossReference_3_0; }
		
		//ID
		public RuleCall getTypeRefSMFTypeRefIDTerminalRuleCall_3_0_1() { return cTypeRefSMFTypeRefIDTerminalRuleCall_3_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }
	}
	public class SMFTypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SMFTypeRef");
		private final RuleCall cSMFTypeDefParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//SMFTypeRef returns SMFTypeRef:
		//    SMFTypeDef
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//SMFTypeDef
		public RuleCall getSMFTypeDefParserRuleCall() { return cSMFTypeDefParserRuleCall; }
	}
	public class SMFDeclassificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SMFDeclassification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSMFDeclassificationAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFlowAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cFlowNamedElementCrossReference_1_0 = (CrossReference)cFlowAssignment_1.eContents().get(0);
		private final RuleCall cFlowNamedElementIDTerminalRuleCall_1_0_1 = (RuleCall)cFlowNamedElementCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cSrcNameAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final CrossReference cSrcNameSMFTypeRefCrossReference_3_0_0 = (CrossReference)cSrcNameAssignment_3_0.eContents().get(0);
		private final RuleCall cSrcNameSMFTypeRefIDTerminalRuleCall_3_0_0_1 = (RuleCall)cSrcNameSMFTypeRefCrossReference_3_0_0.eContents().get(1);
		private final Assignment cAnyAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final Keyword cAnyAnyKeyword_3_1_0 = (Keyword)cAnyAssignment_3_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSnkNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cSnkNameSMFTypeRefCrossReference_5_0 = (CrossReference)cSnkNameAssignment_5.eContents().get(0);
		private final RuleCall cSnkNameSMFTypeRefIDTerminalRuleCall_5_0_1 = (RuleCall)cSnkNameSMFTypeRefCrossReference_5_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//SMFDeclassification returns SMFDeclassification:
		//    {SMFDeclassification}
		//    (flow=[aadl2::NamedElement])
		//    ':' (srcName=[SMFTypeRef|ID] | any?='any') '->' snkName=[SMFTypeRef|ID] ';'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{SMFDeclassification}
		//(flow=[aadl2::NamedElement])
		//':' (srcName=[SMFTypeRef|ID] | any?='any') '->' snkName=[SMFTypeRef|ID] ';'
		public Group getGroup() { return cGroup; }
		
		//{SMFDeclassification}
		public Action getSMFDeclassificationAction_0() { return cSMFDeclassificationAction_0; }
		
		//(flow=[aadl2::NamedElement])
		public Assignment getFlowAssignment_1() { return cFlowAssignment_1; }
		
		//[aadl2::NamedElement]
		public CrossReference getFlowNamedElementCrossReference_1_0() { return cFlowNamedElementCrossReference_1_0; }
		
		//ID
		public RuleCall getFlowNamedElementIDTerminalRuleCall_1_0_1() { return cFlowNamedElementIDTerminalRuleCall_1_0_1; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//(srcName=[SMFTypeRef|ID] | any?='any')
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//srcName=[SMFTypeRef|ID]
		public Assignment getSrcNameAssignment_3_0() { return cSrcNameAssignment_3_0; }
		
		//[SMFTypeRef|ID]
		public CrossReference getSrcNameSMFTypeRefCrossReference_3_0_0() { return cSrcNameSMFTypeRefCrossReference_3_0_0; }
		
		//ID
		public RuleCall getSrcNameSMFTypeRefIDTerminalRuleCall_3_0_0_1() { return cSrcNameSMFTypeRefIDTerminalRuleCall_3_0_0_1; }
		
		//any?='any'
		public Assignment getAnyAssignment_3_1() { return cAnyAssignment_3_1; }
		
		//'any'
		public Keyword getAnyAnyKeyword_3_1_0() { return cAnyAnyKeyword_3_1_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_4() { return cHyphenMinusGreaterThanSignKeyword_4; }
		
		//snkName=[SMFTypeRef|ID]
		public Assignment getSnkNameAssignment_5() { return cSnkNameAssignment_5; }
		
		//[SMFTypeRef|ID]
		public CrossReference getSnkNameSMFTypeRefCrossReference_5_0() { return cSnkNameSMFTypeRefCrossReference_5_0; }
		
		//ID
		public RuleCall getSnkNameSMFTypeRefIDTerminalRuleCall_5_0_1() { return cSnkNameSMFTypeRefIDTerminalRuleCall_5_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class SMFTypeDefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SMFTypeDef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cColonKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Keyword cTypeKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cColonKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Keyword cTypeKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Keyword cExtendsKeyword_1_1_2 = (Keyword)cGroup_1_1.eContents().get(2);
		private final Assignment cTypeAssignment_1_1_3 = (Assignment)cGroup_1_1.eContents().get(3);
		private final CrossReference cTypeSMFTypeRefCrossReference_1_1_3_0 = (CrossReference)cTypeAssignment_1_1_3.eContents().get(0);
		private final RuleCall cTypeSMFTypeRefIDTerminalRuleCall_1_1_3_0_1 = (RuleCall)cTypeSMFTypeRefCrossReference_1_1_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//SMFTypeDef returns SmfTypeDef:
		//    name=ID (
		//        (':' 'type')
		//        |(':' 'type' 'extends' type+=([SMFTypeRef|ID])*)
		//    )
		//    ';';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID (
		//    (':' 'type')
		//    |(':' 'type' 'extends' type+=([SMFTypeRef|ID])*)
		//)
		//';'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//(
		//       (':' 'type')
		//       |(':' 'type' 'extends' type+=([SMFTypeRef|ID])*)
		//   )
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//(':' 'type')
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_0_0() { return cColonKeyword_1_0_0; }
		
		//'type'
		public Keyword getTypeKeyword_1_0_1() { return cTypeKeyword_1_0_1; }
		
		//(':' 'type' 'extends' type+=([SMFTypeRef|ID])*)
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//':'
		public Keyword getColonKeyword_1_1_0() { return cColonKeyword_1_1_0; }
		
		//'type'
		public Keyword getTypeKeyword_1_1_1() { return cTypeKeyword_1_1_1; }
		
		//'extends'
		public Keyword getExtendsKeyword_1_1_2() { return cExtendsKeyword_1_1_2; }
		
		//type+=([SMFTypeRef|ID])*
		public Assignment getTypeAssignment_1_1_3() { return cTypeAssignment_1_1_3; }
		
		//([SMFTypeRef|ID])
		public CrossReference getTypeSMFTypeRefCrossReference_1_1_3_0() { return cTypeSMFTypeRefCrossReference_1_1_3_0; }
		
		//ID
		public RuleCall getTypeSMFTypeRefIDTerminalRuleCall_1_1_3_0_1() { return cTypeSMFTypeRefIDTerminalRuleCall_1_1_3_0_1; }
		
		//';'
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class ClassificationKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.ClassificationKeywords");
		private final Keyword cClassificationKeyword = (Keyword)rule.eContents().get(1);
		
		//ClassificationKeywords:
		//    'classification'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'classification'
		public Keyword getClassificationKeyword() { return cClassificationKeyword; }
	}
	public class DeclassificationKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.DeclassificationKeywords");
		private final Keyword cDeClassificationKeyword = (Keyword)rule.eContents().get(1);
		
		//DeclassificationKeywords:
		//    'de-classification'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'de-classification'
		public Keyword getDeClassificationKeyword() { return cDeClassificationKeyword; }
	}
	public class DomainTypesKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.DomainTypesKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTypesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DomainTypesKeywords:
		//    'domain' 'types'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'domain' 'types'
		public Group getGroup() { return cGroup; }
		
		//'domain'
		public Keyword getDomainKeyword_0() { return cDomainKeyword_0; }
		
		//'types'
		public Keyword getTypesKeyword_1() { return cTypesKeyword_1; }
	}
	public class EndTypesKeywordsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.EndTypesKeywords");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEndKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cTypesKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//EndTypesKeywords:
		//    'end' 'types'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'end' 'types'
		public Group getGroup() { return cGroup; }
		
		//'end'
		public Keyword getEndKeyword_0() { return cEndKeyword_0; }
		
		//'types'
		public Keyword getTypesKeyword_1() { return cTypesKeyword_1; }
	}
	public class QUALIFIEDNAMEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.QUALIFIEDNAME");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QUALIFIEDNAME: ID ('.' ID)+;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)+
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)+
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class QEMREFElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.QEMREF");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QEMREF:
		//     ID ('::' ID)* ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('::' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('::' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'::'
		public Keyword getColonColonKeyword_1_0() { return cColonColonKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final SecMFRootElements pSecMFRoot;
	private final AnnexLibraryElements pAnnexLibrary;
	private final AnnexSubclauseElements pAnnexSubclause;
	private final NamedElementElements pNamedElement;
	private final SecModelLibraryElements pSecModelLibrary;
	private final SMFLibraryElements pSMFLibrary;
	private final ElementElements pElement;
	private final ModalElementElements pModalElement;
	private final SMFSubclauseElements pSMFSubclause;
	private final SecModelSubclauseElements pSecModelSubclause;
	private final SMFClassificationElements pSMFClassification;
	private final SMFTypeRefElements pSMFTypeRef;
	private final SMFDeclassificationElements pSMFDeclassification;
	private final SMFTypeDefElements pSMFTypeDef;
	private final ClassificationKeywordsElements pClassificationKeywords;
	private final DeclassificationKeywordsElements pDeclassificationKeywords;
	private final DomainTypesKeywordsElements pDomainTypesKeywords;
	private final EndTypesKeywordsElements pEndTypesKeywords;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tINTEGER_LIT;
	private final QUALIFIEDNAMEElements pQUALIFIEDNAME;
	private final QEMREFElements pQEMREF;
	
	private final Grammar grammar;
	
	private final PropertiesGrammarAccess gaProperties;

	@Inject
	public SecMFGrammarAccess(GrammarProvider grammarProvider,
			PropertiesGrammarAccess gaProperties) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaProperties = gaProperties;
		this.pSecMFRoot = new SecMFRootElements();
		this.pAnnexLibrary = new AnnexLibraryElements();
		this.pAnnexSubclause = new AnnexSubclauseElements();
		this.pNamedElement = new NamedElementElements();
		this.pSecModelLibrary = new SecModelLibraryElements();
		this.pSMFLibrary = new SMFLibraryElements();
		this.pElement = new ElementElements();
		this.pModalElement = new ModalElementElements();
		this.pSMFSubclause = new SMFSubclauseElements();
		this.pSecModelSubclause = new SecModelSubclauseElements();
		this.pSMFClassification = new SMFClassificationElements();
		this.pSMFTypeRef = new SMFTypeRefElements();
		this.pSMFDeclassification = new SMFDeclassificationElements();
		this.pSMFTypeDef = new SMFTypeDefElements();
		this.pClassificationKeywords = new ClassificationKeywordsElements();
		this.pDeclassificationKeywords = new DeclassificationKeywordsElements();
		this.pDomainTypesKeywords = new DomainTypesKeywordsElements();
		this.pEndTypesKeywords = new EndTypesKeywordsElements();
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.SL_COMMENT");
		this.tINTEGER_LIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.sireum.aadl.osate.securitymodel.SecMF.INTEGER_LIT");
		this.pQUALIFIEDNAME = new QUALIFIEDNAMEElements();
		this.pQEMREF = new QEMREFElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.sireum.aadl.osate.securitymodel.SecMF".equals(grammar.getName())) {
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
	
	
	public PropertiesGrammarAccess getPropertiesGrammarAccess() {
		return gaProperties;
	}

	
	//SecMFRoot returns aadl2::NamedElement:
	//     {SecMFRoot} (library=SMFLibrary | subclauses+=SMFSubclause*)
	//;
	public SecMFRootElements getSecMFRootAccess() {
		return pSecMFRoot;
	}
	
	public ParserRule getSecMFRootRule() {
		return getSecMFRootAccess().getRule();
	}
	
	//AnnexLibrary returns aadl2::AnnexLibrary:
	//     SecModelLibrary
	// ;
	public AnnexLibraryElements getAnnexLibraryAccess() {
		return pAnnexLibrary;
	}
	
	public ParserRule getAnnexLibraryRule() {
		return getAnnexLibraryAccess().getRule();
	}
	
	//AnnexSubclause returns aadl2::AnnexSubclause:
	//     SecModelSubclause
	//;
	public AnnexSubclauseElements getAnnexSubclauseAccess() {
		return pAnnexSubclause;
	}
	
	public ParserRule getAnnexSubclauseRule() {
		return getAnnexSubclauseAccess().getRule();
	}
	
	//NamedElement returns aadl2::NamedElement:
	//    SecModelLibrary   |  SMFClassification | SMFDeclassification  | SMFTypeDef | SMFTypeRef
	//;
	public NamedElementElements getNamedElementAccess() {
		return pNamedElement;
	}
	
	public ParserRule getNamedElementRule() {
		return getNamedElementAccess().getRule();
	}
	
	//SecModelLibrary returns SecModelLibrary:
	//    {SecModelLibrary}
	//    (DomainTypesKeywords
	//        (types+=SMFTypeDef)*
	//    EndTypesKeywords ';'
	//    )?
	//;
	public SecModelLibraryElements getSecModelLibraryAccess() {
		return pSecModelLibrary;
	}
	
	public ParserRule getSecModelLibraryRule() {
		return getSecModelLibraryAccess().getRule();
	}
	
	//SMFLibrary returns SecModelLibrary:
	//    {SecModelLibrary}
	//    ('library' name=QEMREF
	//        (
	//            DomainTypesKeywords
	//            (types+=SMFTypeDef)*
	//            EndTypesKeywords ';'
	//        )?
	//    ) |
	//    ('package' name=QEMREF 'public'
	//  'annex' ID  '{**'
	//    (
	//        DomainTypesKeywords
	//        (type+=SMFTypeDef)*
	//        EndTypesKeywords ';'
	//    )?
	//    '**}' ';' 'end' QEMREF ';'
	//    )
	//;
	public SMFLibraryElements getSMFLibraryAccess() {
		return pSMFLibrary;
	}
	
	public ParserRule getSMFLibraryRule() {
		return getSMFLibraryAccess().getRule();
	}
	
	//Element returns aadl2::Element:
	//     SMFTypeRef
	//;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//ModalElement returns aadl2::ModalElement:
	//    SecModelSubclause
	//;
	public ModalElementElements getModalElementAccess() {
		return pModalElement;
	}
	
	public ParserRule getModalElementRule() {
		return getModalElementAccess().getRule();
	}
	
	//SMFSubclause returns SecModelSubclause:
	//    {SecModelSubclause} 'subclause' name=QCREF
	//    (ClassificationKeywords (classification += SMFClassification)+)?
	//    (DeclassificationKeywords (declassification += SMFDeclassification)+)?
	//;
	public SMFSubclauseElements getSMFSubclauseAccess() {
		return pSMFSubclause;
	}
	
	public ParserRule getSMFSubclauseRule() {
		return getSMFSubclauseAccess().getRule();
	}
	
	//SecModelSubclause returns SecModelSubclause:
	//    {SecModelSubclause}
	//    (ClassificationKeywords (classification += SMFClassification)+)?
	//    (DeclassificationKeywords (declassification += SMFDeclassification)+)?
	//;
	public SecModelSubclauseElements getSecModelSubclauseAccess() {
		return pSecModelSubclause;
	}
	
	public ParserRule getSecModelSubclauseRule() {
		return getSecModelSubclauseAccess().getRule();
	}
	
	//SMFClassification returns SMFClassification:
	//    {SMFClassification}
	//    (feature=[aadl2::NamedElement| ID])
	//    ':' typeRef = [SMFTypeRef|ID]
	//    ';'
	//;
	public SMFClassificationElements getSMFClassificationAccess() {
		return pSMFClassification;
	}
	
	public ParserRule getSMFClassificationRule() {
		return getSMFClassificationAccess().getRule();
	}
	
	//SMFTypeRef returns SMFTypeRef:
	//    SMFTypeDef
	//;
	public SMFTypeRefElements getSMFTypeRefAccess() {
		return pSMFTypeRef;
	}
	
	public ParserRule getSMFTypeRefRule() {
		return getSMFTypeRefAccess().getRule();
	}
	
	//SMFDeclassification returns SMFDeclassification:
	//    {SMFDeclassification}
	//    (flow=[aadl2::NamedElement])
	//    ':' (srcName=[SMFTypeRef|ID] | any?='any') '->' snkName=[SMFTypeRef|ID] ';'
	//;
	public SMFDeclassificationElements getSMFDeclassificationAccess() {
		return pSMFDeclassification;
	}
	
	public ParserRule getSMFDeclassificationRule() {
		return getSMFDeclassificationAccess().getRule();
	}
	
	//SMFTypeDef returns SmfTypeDef:
	//    name=ID (
	//        (':' 'type')
	//        |(':' 'type' 'extends' type+=([SMFTypeRef|ID])*)
	//    )
	//    ';';
	public SMFTypeDefElements getSMFTypeDefAccess() {
		return pSMFTypeDef;
	}
	
	public ParserRule getSMFTypeDefRule() {
		return getSMFTypeDefAccess().getRule();
	}
	
	//ClassificationKeywords:
	//    'classification'
	//;
	public ClassificationKeywordsElements getClassificationKeywordsAccess() {
		return pClassificationKeywords;
	}
	
	public ParserRule getClassificationKeywordsRule() {
		return getClassificationKeywordsAccess().getRule();
	}
	
	//DeclassificationKeywords:
	//    'de-classification'
	//;
	public DeclassificationKeywordsElements getDeclassificationKeywordsAccess() {
		return pDeclassificationKeywords;
	}
	
	public ParserRule getDeclassificationKeywordsRule() {
		return getDeclassificationKeywordsAccess().getRule();
	}
	
	//DomainTypesKeywords:
	//    'domain' 'types'
	//;
	public DomainTypesKeywordsElements getDomainTypesKeywordsAccess() {
		return pDomainTypesKeywords;
	}
	
	public ParserRule getDomainTypesKeywordsRule() {
		return getDomainTypesKeywordsAccess().getRule();
	}
	
	//EndTypesKeywords:
	//    'end' 'types'
	//;
	public EndTypesKeywordsElements getEndTypesKeywordsAccess() {
		return pEndTypesKeywords;
	}
	
	public ParserRule getEndTypesKeywordsRule() {
		return getEndTypesKeywordsAccess().getRule();
	}
	
	//@Override
	//terminal SL_COMMENT:
	//    '--' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//@Override
	//terminal INTEGER_LIT : ('0'..'9')+;
	public TerminalRule getINTEGER_LITRule() {
		return tINTEGER_LIT;
	}
	
	//QUALIFIEDNAME: ID ('.' ID)+;
	public QUALIFIEDNAMEElements getQUALIFIEDNAMEAccess() {
		return pQUALIFIEDNAME;
	}
	
	public ParserRule getQUALIFIEDNAMERule() {
		return getQUALIFIEDNAMEAccess().getRule();
	}
	
	//QEMREF:
	//     ID ('::' ID)* ;
	public QEMREFElements getQEMREFAccess() {
		return pQEMREF;
	}
	
	public ParserRule getQEMREFRule() {
		return getQEMREFAccess().getRule();
	}
	
	//PModel returns aadl2::Element:
	//    ContainedPropertyAssociation //| BasicPropertyAssociation | PropertyAssociation
	//    ;
	public PropertiesGrammarAccess.PModelElements getPModelAccess() {
		return gaProperties.getPModelAccess();
	}
	
	public ParserRule getPModelRule() {
		return getPModelAccess().getRule();
	}
	
	//// Properties
	//ContainedPropertyAssociation returns aadl2::PropertyAssociation:
	//    property=[aadl2::Property|QPREF]
	//    ('=>' | append?='+=>') (constant?='constant')?
	//    (
	//     ownedValue+=OptionalModalPropertyValue
	//    ( ',' ownedValue+=OptionalModalPropertyValue )*
	//    )
	//    (AppliesToKeywords appliesTo+=ContainmentPath
	//        (',' appliesTo+=ContainmentPath)*
	//    )?
	//    (InBindingKeywords '(' inBinding+=[aadl2::Classifier|QCREF]')')?
	//    ';';
	public PropertiesGrammarAccess.ContainedPropertyAssociationElements getContainedPropertyAssociationAccess() {
		return gaProperties.getContainedPropertyAssociationAccess();
	}
	
	public ParserRule getContainedPropertyAssociationRule() {
		return getContainedPropertyAssociationAccess().getRule();
	}
	
	//PropertyAssociation returns aadl2::PropertyAssociation:
	//    property=[aadl2::Property|QPREF]
	//    ('=>' | append?='+=>') (constant?='constant')?
	//    (
	//     ownedValue+=OptionalModalPropertyValue
	//    ( ',' ownedValue+=OptionalModalPropertyValue )*
	//    )
	//    (InBindingKeywords '(' inBinding+=[aadl2::Classifier|QCREF]')')?
	//    ';'
	//    ;
	public PropertiesGrammarAccess.PropertyAssociationElements getPropertyAssociationAccess() {
		return gaProperties.getPropertyAssociationAccess();
	}
	
	public ParserRule getPropertyAssociationRule() {
		return getPropertyAssociationAccess().getRule();
	}
	
	//BasicPropertyAssociation returns aadl2::PropertyAssociation:
	//    property=[aadl2::Property|QPREF]
	//    '=>' ownedValue+=PropertyValue ';'
	//    ;
	public PropertiesGrammarAccess.BasicPropertyAssociationElements getBasicPropertyAssociationAccess() {
		return gaProperties.getBasicPropertyAssociationAccess();
	}
	
	public ParserRule getBasicPropertyAssociationRule() {
		return getBasicPropertyAssociationAccess().getRule();
	}
	
	//ContainmentPath returns aadl2::ContainedNamedElement:
	//    path=ContainmentPathElement
	////    ( 'annex' containmentPathElement+=AnnexPath )?
	//;
	public PropertiesGrammarAccess.ContainmentPathElements getContainmentPathAccess() {
		return gaProperties.getContainmentPathAccess();
	}
	
	public ParserRule getContainmentPathRule() {
		return getContainmentPathAccess().getRule();
	}
	
	////AnnexPath returns aadl2::ContainmentPathElement:
	////     namedElement=[aadl2::NamedElement|IDANNEXTEXT];
	//ModalPropertyValue returns aadl2::ModalPropertyValue:
	//    ownedValue=PropertyExpression
	//    InModesKeywords '('
	//    inMode+=[aadl2::Mode|ID] (',' inMode+=[aadl2::Mode|ID])*
	//    ')'
	//    ;
	public PropertiesGrammarAccess.ModalPropertyValueElements getModalPropertyValueAccess() {
		return gaProperties.getModalPropertyValueAccess();
	}
	
	public ParserRule getModalPropertyValueRule() {
		return getModalPropertyValueAccess().getRule();
	}
	
	//OptionalModalPropertyValue returns aadl2::ModalPropertyValue:
	//    ownedValue=PropertyExpression
	//    // phf made this optional: need to check separately that only the last one is optional
	//    ( InModesKeywords '('
	//    inMode+=[aadl2::Mode|ID] (',' inMode+=[aadl2::Mode|ID])*
	//    ')')?
	//    ;
	public PropertiesGrammarAccess.OptionalModalPropertyValueElements getOptionalModalPropertyValueAccess() {
		return gaProperties.getOptionalModalPropertyValueAccess();
	}
	
	public ParserRule getOptionalModalPropertyValueRule() {
		return getOptionalModalPropertyValueAccess().getRule();
	}
	
	//    // &&&&&&&&&& handling of in binding
	//PropertyValue returns aadl2::ModalPropertyValue:
	//    ownedValue=PropertyExpression
	//    ;
	public PropertiesGrammarAccess.PropertyValueElements getPropertyValueAccess() {
		return gaProperties.getPropertyValueAccess();
	}
	
	public ParserRule getPropertyValueRule() {
		return getPropertyValueAccess().getRule();
	}
	
	//PropertyExpression returns aadl2::PropertyExpression:
	////    OldRecordTerm |
	//      RecordTerm | ReferenceTerm | ComponentClassifierTerm
	//     | ComputedTerm | StringTerm |  NumericRangeTerm
	//    | RealTerm | IntegerTerm
	//          | ListTerm
	//          | BooleanLiteral | LiteralorReferenceTerm
	//    ;
	public PropertiesGrammarAccess.PropertyExpressionElements getPropertyExpressionAccess() {
		return gaProperties.getPropertyExpressionAccess();
	}
	
	public ParserRule getPropertyExpressionRule() {
		return getPropertyExpressionAccess().getRule();
	}
	
	//LiteralorReferenceTerm returns aadl2::NamedValue:
	//  namedValue=[aadl2::AbstractNamedValue|QPREF]
	//;
	public PropertiesGrammarAccess.LiteralorReferenceTermElements getLiteralorReferenceTermAccess() {
		return gaProperties.getLiteralorReferenceTermAccess();
	}
	
	public ParserRule getLiteralorReferenceTermRule() {
		return getLiteralorReferenceTermAccess().getRule();
	}
	
	//BooleanLiteral returns aadl2::BooleanLiteral:
	//  {aadl2::BooleanLiteral}(value?='true'|'false')
	//  ;
	public PropertiesGrammarAccess.BooleanLiteralElements getBooleanLiteralAccess() {
		return gaProperties.getBooleanLiteralAccess();
	}
	
	public ParserRule getBooleanLiteralRule() {
		return getBooleanLiteralAccess().getRule();
	}
	
	//ConstantValue returns aadl2::NamedValue:
	//  namedValue=[aadl2::PropertyConstant|QPREF]
	//  ;
	public PropertiesGrammarAccess.ConstantValueElements getConstantValueAccess() {
		return gaProperties.getConstantValueAccess();
	}
	
	public ParserRule getConstantValueRule() {
		return getConstantValueAccess().getRule();
	}
	
	//ReferenceTerm returns aadl2::ReferenceValue:
	//  'reference' '('
	//  path=ContainmentPathElement
	////    ( 'annex' ID '{**'
	////    containmentPathElement+=ContainmentPathElement
	////    ( '.' containmentPathElement+=ContainmentPathElement)*
	////    '**}')?
	//  ')'
	//  ;
	public PropertiesGrammarAccess.ReferenceTermElements getReferenceTermAccess() {
		return gaProperties.getReferenceTermAccess();
	}
	
	public ParserRule getReferenceTermRule() {
		return getReferenceTermAccess().getRule();
	}
	
	//RecordTerm returns aadl2::RecordValue:
	//   '['
	//   (ownedFieldValue+=FieldPropertyAssociation)+
	//  ']'
	//  ;
	public PropertiesGrammarAccess.RecordTermElements getRecordTermAccess() {
		return gaProperties.getRecordTermAccess();
	}
	
	public ParserRule getRecordTermRule() {
		return getRecordTermAccess().getRule();
	}
	
	//OldRecordTerm returns aadl2::RecordValue:
	//   '('
	//   (ownedFieldValue+=FieldPropertyAssociation)+
	//  ')'
	//  ;
	public PropertiesGrammarAccess.OldRecordTermElements getOldRecordTermAccess() {
		return gaProperties.getOldRecordTermAccess();
	}
	
	public ParserRule getOldRecordTermRule() {
		return getOldRecordTermAccess().getRule();
	}
	
	//ComputedTerm returns aadl2::ComputedValue:
	//   'compute' '('
	//   function=ID
	//  ')'
	//  ;
	public PropertiesGrammarAccess.ComputedTermElements getComputedTermAccess() {
		return gaProperties.getComputedTermAccess();
	}
	
	public ParserRule getComputedTermRule() {
		return getComputedTermAccess().getRule();
	}
	
	//ComponentClassifierTerm returns aadl2::ClassifierValue:
	//   'classifier' '('
	//   classifier=[aadl2::ComponentClassifier|QCREF]
	//  ')'
	//  ;
	public PropertiesGrammarAccess.ComponentClassifierTermElements getComponentClassifierTermAccess() {
		return gaProperties.getComponentClassifierTermAccess();
	}
	
	public ParserRule getComponentClassifierTermRule() {
		return getComponentClassifierTermAccess().getRule();
	}
	
	//ListTerm returns aadl2::ListValue:
	//    {aadl2::ListValue}
	//   '('
	//   (ownedListElement+=(PropertyExpression)
	//   (',' ownedListElement+=(PropertyExpression))*)?
	//  ')'
	//  ;
	public PropertiesGrammarAccess.ListTermElements getListTermAccess() {
		return gaProperties.getListTermAccess();
	}
	
	public ParserRule getListTermRule() {
		return getListTermAccess().getRule();
	}
	
	//FieldPropertyAssociation returns aadl2::BasicPropertyAssociation:
	//    property=[aadl2::BasicProperty|ID]
	//    '=>'
	//    ownedValue=PropertyExpression
	//    ';';
	public PropertiesGrammarAccess.FieldPropertyAssociationElements getFieldPropertyAssociationAccess() {
		return gaProperties.getFieldPropertyAssociationAccess();
	}
	
	public ParserRule getFieldPropertyAssociationRule() {
		return getFieldPropertyAssociationAccess().getRule();
	}
	
	//// from AADL2
	//// need to add annex path element
	//ContainmentPathElement returns aadl2::ContainmentPathElement:
	//    (
	//        (
	//            namedElement=[aadl2::NamedElement|ID]
	//             (arrayRange+=ArrayRange)*
	//        )
	//        ('.' path=ContainmentPathElement)?
	////     |      'annex' namedElement=[aadl2::NamedElement|ID]
	//    )
	//;
	public PropertiesGrammarAccess.ContainmentPathElementElements getContainmentPathElementAccess() {
		return gaProperties.getContainmentPathElementAccess();
	}
	
	public ParserRule getContainmentPathElementRule() {
		return getContainmentPathElementAccess().getRule();
	}
	
	//ANNEXREF :
	//    // check what values are ok inside ** **
	//    '{' STAR STAR ID STAR STAR '}';
	public PropertiesGrammarAccess.ANNEXREFElements getANNEXREFAccess() {
		return gaProperties.getANNEXREFAccess();
	}
	
	public ParserRule getANNEXREFRule() {
		return getANNEXREFAccess().getRule();
	}
	
	//PlusMinus returns aadl2::OperationKind: '+' | '-';
	public PropertiesGrammarAccess.PlusMinusElements getPlusMinusAccess() {
		return gaProperties.getPlusMinusAccess();
	}
	
	public ParserRule getPlusMinusRule() {
		return getPlusMinusAccess().getRule();
	}
	
	//StringTerm returns aadl2::StringLiteral:
	//    value=NoQuoteString ;
	public PropertiesGrammarAccess.StringTermElements getStringTermAccess() {
		return gaProperties.getStringTermAccess();
	}
	
	public ParserRule getStringTermRule() {
		return getStringTermAccess().getRule();
	}
	
	//NoQuoteString :
	//    // remove quotes from string in ValueConverter
	//    STRING
	//;
	public PropertiesGrammarAccess.NoQuoteStringElements getNoQuoteStringAccess() {
		return gaProperties.getNoQuoteStringAccess();
	}
	
	public ParserRule getNoQuoteStringRule() {
		return getNoQuoteStringAccess().getRule();
	}
	
	//ArrayRange returns aadl2::ArrayRange: {aadl2::ArrayRange}
	//    '[' lowerBound=INTVALUE ('..' upperBound=INTVALUE)?
	//    ']'
	//;
	public PropertiesGrammarAccess.ArrayRangeElements getArrayRangeAccess() {
		return gaProperties.getArrayRangeAccess();
	}
	
	public ParserRule getArrayRangeRule() {
		return getArrayRangeAccess().getRule();
	}
	
	//SignedConstant returns aadl2::Operation:
	//    op=PlusMinus ownedPropertyExpression+=ConstantValue
	//    ;
	public PropertiesGrammarAccess.SignedConstantElements getSignedConstantAccess() {
		return gaProperties.getSignedConstantAccess();
	}
	
	public ParserRule getSignedConstantRule() {
		return getSignedConstantAccess().getRule();
	}
	
	//IntegerTerm returns aadl2::IntegerLiteral:
	//    value=SignedInt (unit=[aadl2::UnitLiteral|ID])?
	//    ;
	public PropertiesGrammarAccess.IntegerTermElements getIntegerTermAccess() {
		return gaProperties.getIntegerTermAccess();
	}
	
	public ParserRule getIntegerTermRule() {
		return getIntegerTermAccess().getRule();
	}
	
	//SignedInt returns aadl2::Integer:
	//    ('+'|'-')?INTEGER_LIT ;
	public PropertiesGrammarAccess.SignedIntElements getSignedIntAccess() {
		return gaProperties.getSignedIntAccess();
	}
	
	public ParserRule getSignedIntRule() {
		return getSignedIntAccess().getRule();
	}
	
	//RealTerm returns aadl2::RealLiteral:
	//    value=SignedReal (unit=[aadl2::UnitLiteral|ID])?
	//    ;
	public PropertiesGrammarAccess.RealTermElements getRealTermAccess() {
		return gaProperties.getRealTermAccess();
	}
	
	public ParserRule getRealTermRule() {
		return getRealTermAccess().getRule();
	}
	
	//SignedReal returns aadl2::Real:
	//    ('+'|'-')?REAL_LIT ;
	public PropertiesGrammarAccess.SignedRealElements getSignedRealAccess() {
		return gaProperties.getSignedRealAccess();
	}
	
	public ParserRule getSignedRealRule() {
		return getSignedRealAccess().getRule();
	}
	
	//NumericRangeTerm returns aadl2::RangeValue:
	//    minimum=NumAlt //(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//        '..' maximum=NumAlt//(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//    ( 'delta' delta=NumAlt//(RealTerm|IntegerTerm| SignedConstant | ConstantValue)
	//    )?
	//    ;
	public PropertiesGrammarAccess.NumericRangeTermElements getNumericRangeTermAccess() {
		return gaProperties.getNumericRangeTermAccess();
	}
	
	public ParserRule getNumericRangeTermRule() {
		return getNumericRangeTermAccess().getRule();
	}
	
	//NumAlt  returns aadl2::PropertyExpression:
	//    RealTerm|IntegerTerm| SignedConstant | ConstantValue
	//;
	public PropertiesGrammarAccess.NumAltElements getNumAltAccess() {
		return gaProperties.getNumAltAccess();
	}
	
	public ParserRule getNumAltRule() {
		return getNumAltAccess().getRule();
	}
	
	//AppliesToKeywords:
	//    'applies' 'to'
	//;
	public PropertiesGrammarAccess.AppliesToKeywordsElements getAppliesToKeywordsAccess() {
		return gaProperties.getAppliesToKeywordsAccess();
	}
	
	public ParserRule getAppliesToKeywordsRule() {
		return getAppliesToKeywordsAccess().getRule();
	}
	
	//InBindingKeywords:
	//    'in' 'binding'
	//;
	public PropertiesGrammarAccess.InBindingKeywordsElements getInBindingKeywordsAccess() {
		return gaProperties.getInBindingKeywordsAccess();
	}
	
	public ParserRule getInBindingKeywordsRule() {
		return getInBindingKeywordsAccess().getRule();
	}
	
	//InModesKeywords:
	//    'in' 'modes'
	//;
	public PropertiesGrammarAccess.InModesKeywordsElements getInModesKeywordsAccess() {
		return gaProperties.getInModesKeywordsAccess();
	}
	
	public ParserRule getInModesKeywordsRule() {
		return getInModesKeywordsAccess().getRule();
	}
	
	//INTVALUE returns aadl2::Integer:
	//    INTEGER_LIT //NUMERAL
	//;
	public PropertiesGrammarAccess.INTVALUEElements getINTVALUEAccess() {
		return gaProperties.getINTVALUEAccess();
	}
	
	public ParserRule getINTVALUERule() {
		return getINTVALUEAccess().getRule();
	}
	
	////terminal NUMERAL:
	////    (DIGIT)+('_' (DIGIT)+)*
	////;
	////terminal INT returns ecore::EInt: (DIGIT)+('_' (DIGIT)+)*;
	//terminal fragment
	//EXPONENT  :  ('e'|'E') ('+'|'-')? ( DIGIT )+  ;
	public TerminalRule getEXPONENTRule() {
		return gaProperties.getEXPONENTRule();
	}
	
	//terminal fragment
	//INT_EXPONENT :  ('e'|'E') ('+')? ( DIGIT )+ ;
	public TerminalRule getINT_EXPONENTRule() {
		return gaProperties.getINT_EXPONENTRule();
	}
	
	//terminal REAL_LIT :
	//    (DIGIT)+('_' (DIGIT)+)* ( '.' (DIGIT)+('_' (DIGIT)+)* ( EXPONENT )?)
	//  ;
	public TerminalRule getREAL_LITRule() {
		return gaProperties.getREAL_LITRule();
	}
	
	//terminal fragment
	//DIGIT     :  ( '0'..'9' ) ;
	public TerminalRule getDIGITRule() {
		return gaProperties.getDIGITRule();
	}
	
	//terminal fragment
	//EXTENDED_DIGIT     :  ( '0'..'9' | 'a'..'f' | 'A'..'F') ;
	public TerminalRule getEXTENDED_DIGITRule() {
		return gaProperties.getEXTENDED_DIGITRule();
	}
	
	//terminal fragment
	//BASED_INTEGER      :  ( EXTENDED_DIGIT ) ( ('_')? EXTENDED_DIGIT )* ;
	public TerminalRule getBASED_INTEGERRule() {
		return gaProperties.getBASED_INTEGERRule();
	}
	
	//QCLREF:
	//    ID '::' ID;
	public PropertiesGrammarAccess.QCLREFElements getQCLREFAccess() {
		return gaProperties.getQCLREFAccess();
	}
	
	public ParserRule getQCLREFRule() {
		return getQCLREFAccess().getRule();
	}
	
	//QPREF:
	//    ID ('::' ID)?;
	public PropertiesGrammarAccess.QPREFElements getQPREFAccess() {
		return gaProperties.getQPREFAccess();
	}
	
	public ParserRule getQPREFRule() {
		return getQPREFAccess().getRule();
	}
	
	//QCREF:
	//    (ID '::')* ID ('.' ID)?;
	public PropertiesGrammarAccess.QCREFElements getQCREFAccess() {
		return gaProperties.getQCREFAccess();
	}
	
	public ParserRule getQCREFRule() {
		return getQCREFAccess().getRule();
	}
	
	//STAR : '*';
	public PropertiesGrammarAccess.STARElements getSTARAccess() {
		return gaProperties.getSTARAccess();
	}
	
	public ParserRule getSTARRule() {
		return getSTARAccess().getRule();
	}
	
	//terminal STRING    :
	//            '"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	//            "'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaProperties.getSTRINGRule();
	}
	
	////terminal ID          : '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	//terminal ID:    ('a'..'z'
	//        |'A'..'Z'
	//        ) ( ('_')? ('a'..'z'
	//        |'A'..'Z'
	//        |'0'..'9'))*;
	public TerminalRule getIDRule() {
		return gaProperties.getIDRule();
	}
	
	//terminal WS			: (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaProperties.getWSRule();
	}
}
