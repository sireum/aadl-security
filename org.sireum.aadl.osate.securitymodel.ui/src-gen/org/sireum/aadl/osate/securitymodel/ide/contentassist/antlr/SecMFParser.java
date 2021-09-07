
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
package org.sireum.aadl.osate.securitymodel.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.sireum.aadl.osate.securitymodel.ide.contentassist.antlr.internal.InternalSecMFParser;
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess;

public class SecMFParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SecMFGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SecMFGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSecMFRootAccess().getAlternatives_1(), "rule__SecMFRoot__Alternatives_1");
			builder.put(grammarAccess.getNamedElementAccess().getAlternatives(), "rule__NamedElement__Alternatives");
			builder.put(grammarAccess.getSMFLibraryAccess().getAlternatives(), "rule__SMFLibrary__Alternatives");
			builder.put(grammarAccess.getSMFDeclassificationAccess().getAlternatives_3(), "rule__SMFDeclassification__Alternatives_3");
			builder.put(grammarAccess.getSMFTypeDefAccess().getAlternatives_1(), "rule__SMFTypeDef__Alternatives_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1(), "rule__ContainedPropertyAssociation__Alternatives_1");
			builder.put(grammarAccess.getPropertyAssociationAccess().getAlternatives_1(), "rule__PropertyAssociation__Alternatives_1");
			builder.put(grammarAccess.getPropertyExpressionAccess().getAlternatives(), "rule__PropertyExpression__Alternatives");
			builder.put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
			builder.put(grammarAccess.getPlusMinusAccess().getAlternatives(), "rule__PlusMinus__Alternatives");
			builder.put(grammarAccess.getSignedIntAccess().getAlternatives_0(), "rule__SignedInt__Alternatives_0");
			builder.put(grammarAccess.getSignedRealAccess().getAlternatives_0(), "rule__SignedReal__Alternatives_0");
			builder.put(grammarAccess.getNumAltAccess().getAlternatives(), "rule__NumAlt__Alternatives");
			builder.put(grammarAccess.getSecMFRootAccess().getGroup(), "rule__SecMFRoot__Group__0");
			builder.put(grammarAccess.getSecModelLibraryAccess().getGroup(), "rule__SecModelLibrary__Group__0");
			builder.put(grammarAccess.getSecModelLibraryAccess().getGroup_1(), "rule__SecModelLibrary__Group_1__0");
			builder.put(grammarAccess.getSMFLibraryAccess().getGroup_0(), "rule__SMFLibrary__Group_0__0");
			builder.put(grammarAccess.getSMFLibraryAccess().getGroup_0_1(), "rule__SMFLibrary__Group_0_1__0");
			builder.put(grammarAccess.getSMFLibraryAccess().getGroup_0_1_2(), "rule__SMFLibrary__Group_0_1_2__0");
			builder.put(grammarAccess.getSMFLibraryAccess().getGroup_1(), "rule__SMFLibrary__Group_1__0");
			builder.put(grammarAccess.getSMFLibraryAccess().getGroup_1_6(), "rule__SMFLibrary__Group_1_6__0");
			builder.put(grammarAccess.getSMFSubclauseAccess().getGroup(), "rule__SMFSubclause__Group__0");
			builder.put(grammarAccess.getSMFSubclauseAccess().getGroup_3(), "rule__SMFSubclause__Group_3__0");
			builder.put(grammarAccess.getSMFSubclauseAccess().getGroup_4(), "rule__SMFSubclause__Group_4__0");
			builder.put(grammarAccess.getSecModelSubclauseAccess().getGroup(), "rule__SecModelSubclause__Group__0");
			builder.put(grammarAccess.getSecModelSubclauseAccess().getGroup_1(), "rule__SecModelSubclause__Group_1__0");
			builder.put(grammarAccess.getSecModelSubclauseAccess().getGroup_2(), "rule__SecModelSubclause__Group_2__0");
			builder.put(grammarAccess.getSMFClassificationAccess().getGroup(), "rule__SMFClassification__Group__0");
			builder.put(grammarAccess.getSMFDeclassificationAccess().getGroup(), "rule__SMFDeclassification__Group__0");
			builder.put(grammarAccess.getSMFTypeDefAccess().getGroup(), "rule__SMFTypeDef__Group__0");
			builder.put(grammarAccess.getSMFTypeDefAccess().getGroup_1_0(), "rule__SMFTypeDef__Group_1_0__0");
			builder.put(grammarAccess.getSMFTypeDefAccess().getGroup_1_1(), "rule__SMFTypeDef__Group_1_1__0");
			builder.put(grammarAccess.getSMFTypeDefAccess().getGroup_1_1_4(), "rule__SMFTypeDef__Group_1_1_4__0");
			builder.put(grammarAccess.getDomainTypesKeywordsAccess().getGroup(), "rule__DomainTypesKeywords__Group__0");
			builder.put(grammarAccess.getEndTypesKeywordsAccess().getGroup(), "rule__EndTypesKeywords__Group__0");
			builder.put(grammarAccess.getQUALIFIEDNAMEAccess().getGroup(), "rule__QUALIFIEDNAME__Group__0");
			builder.put(grammarAccess.getQUALIFIEDNAMEAccess().getGroup_1(), "rule__QUALIFIEDNAME__Group_1__0");
			builder.put(grammarAccess.getQEMREFAccess().getGroup(), "rule__QEMREF__Group__0");
			builder.put(grammarAccess.getQEMREFAccess().getGroup_1(), "rule__QEMREF__Group_1__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup(), "rule__ContainedPropertyAssociation__Group__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3(), "rule__ContainedPropertyAssociation__Group_3__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1(), "rule__ContainedPropertyAssociation__Group_3_1__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4(), "rule__ContainedPropertyAssociation__Group_4__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_2(), "rule__ContainedPropertyAssociation__Group_4_2__0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5(), "rule__ContainedPropertyAssociation__Group_5__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup_3(), "rule__PropertyAssociation__Group_3__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup_3_1(), "rule__PropertyAssociation__Group_3_1__0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getGroup_4(), "rule__PropertyAssociation__Group_4__0");
			builder.put(grammarAccess.getBasicPropertyAssociationAccess().getGroup(), "rule__BasicPropertyAssociation__Group__0");
			builder.put(grammarAccess.getModalPropertyValueAccess().getGroup(), "rule__ModalPropertyValue__Group__0");
			builder.put(grammarAccess.getModalPropertyValueAccess().getGroup_4(), "rule__ModalPropertyValue__Group_4__0");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup(), "rule__OptionalModalPropertyValue__Group__0");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1(), "rule__OptionalModalPropertyValue__Group_1__0");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_3(), "rule__OptionalModalPropertyValue__Group_1_3__0");
			builder.put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
			builder.put(grammarAccess.getReferenceTermAccess().getGroup(), "rule__ReferenceTerm__Group__0");
			builder.put(grammarAccess.getRecordTermAccess().getGroup(), "rule__RecordTerm__Group__0");
			builder.put(grammarAccess.getOldRecordTermAccess().getGroup(), "rule__OldRecordTerm__Group__0");
			builder.put(grammarAccess.getComputedTermAccess().getGroup(), "rule__ComputedTerm__Group__0");
			builder.put(grammarAccess.getComponentClassifierTermAccess().getGroup(), "rule__ComponentClassifierTerm__Group__0");
			builder.put(grammarAccess.getListTermAccess().getGroup(), "rule__ListTerm__Group__0");
			builder.put(grammarAccess.getListTermAccess().getGroup_2(), "rule__ListTerm__Group_2__0");
			builder.put(grammarAccess.getListTermAccess().getGroup_2_1(), "rule__ListTerm__Group_2_1__0");
			builder.put(grammarAccess.getFieldPropertyAssociationAccess().getGroup(), "rule__FieldPropertyAssociation__Group__0");
			builder.put(grammarAccess.getContainmentPathElementAccess().getGroup(), "rule__ContainmentPathElement__Group__0");
			builder.put(grammarAccess.getContainmentPathElementAccess().getGroup_0(), "rule__ContainmentPathElement__Group_0__0");
			builder.put(grammarAccess.getContainmentPathElementAccess().getGroup_1(), "rule__ContainmentPathElement__Group_1__0");
			builder.put(grammarAccess.getANNEXREFAccess().getGroup(), "rule__ANNEXREF__Group__0");
			builder.put(grammarAccess.getArrayRangeAccess().getGroup(), "rule__ArrayRange__Group__0");
			builder.put(grammarAccess.getArrayRangeAccess().getGroup_3(), "rule__ArrayRange__Group_3__0");
			builder.put(grammarAccess.getSignedConstantAccess().getGroup(), "rule__SignedConstant__Group__0");
			builder.put(grammarAccess.getIntegerTermAccess().getGroup(), "rule__IntegerTerm__Group__0");
			builder.put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
			builder.put(grammarAccess.getRealTermAccess().getGroup(), "rule__RealTerm__Group__0");
			builder.put(grammarAccess.getSignedRealAccess().getGroup(), "rule__SignedReal__Group__0");
			builder.put(grammarAccess.getNumericRangeTermAccess().getGroup(), "rule__NumericRangeTerm__Group__0");
			builder.put(grammarAccess.getNumericRangeTermAccess().getGroup_3(), "rule__NumericRangeTerm__Group_3__0");
			builder.put(grammarAccess.getAppliesToKeywordsAccess().getGroup(), "rule__AppliesToKeywords__Group__0");
			builder.put(grammarAccess.getInBindingKeywordsAccess().getGroup(), "rule__InBindingKeywords__Group__0");
			builder.put(grammarAccess.getInModesKeywordsAccess().getGroup(), "rule__InModesKeywords__Group__0");
			builder.put(grammarAccess.getQCLREFAccess().getGroup(), "rule__QCLREF__Group__0");
			builder.put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
			builder.put(grammarAccess.getQPREFAccess().getGroup_1(), "rule__QPREF__Group_1__0");
			builder.put(grammarAccess.getQCREFAccess().getGroup(), "rule__QCREF__Group__0");
			builder.put(grammarAccess.getQCREFAccess().getGroup_0(), "rule__QCREF__Group_0__0");
			builder.put(grammarAccess.getQCREFAccess().getGroup_2(), "rule__QCREF__Group_2__0");
			builder.put(grammarAccess.getSecMFRootAccess().getLibraryAssignment_1_0(), "rule__SecMFRoot__LibraryAssignment_1_0");
			builder.put(grammarAccess.getSecMFRootAccess().getSubclausesAssignment_1_1(), "rule__SecMFRoot__SubclausesAssignment_1_1");
			builder.put(grammarAccess.getSecModelLibraryAccess().getTypesAssignment_1_1(), "rule__SecModelLibrary__TypesAssignment_1_1");
			builder.put(grammarAccess.getSMFLibraryAccess().getNameAssignment_0_1_1(), "rule__SMFLibrary__NameAssignment_0_1_1");
			builder.put(grammarAccess.getSMFLibraryAccess().getTypesAssignment_0_1_2_1(), "rule__SMFLibrary__TypesAssignment_0_1_2_1");
			builder.put(grammarAccess.getSMFLibraryAccess().getNameAssignment_1_1(), "rule__SMFLibrary__NameAssignment_1_1");
			builder.put(grammarAccess.getSMFLibraryAccess().getTypeAssignment_1_6_1(), "rule__SMFLibrary__TypeAssignment_1_6_1");
			builder.put(grammarAccess.getSMFSubclauseAccess().getNameAssignment_2(), "rule__SMFSubclause__NameAssignment_2");
			builder.put(grammarAccess.getSMFSubclauseAccess().getClassificationAssignment_3_1(), "rule__SMFSubclause__ClassificationAssignment_3_1");
			builder.put(grammarAccess.getSMFSubclauseAccess().getDeclassificationAssignment_4_1(), "rule__SMFSubclause__DeclassificationAssignment_4_1");
			builder.put(grammarAccess.getSecModelSubclauseAccess().getClassificationAssignment_1_1(), "rule__SecModelSubclause__ClassificationAssignment_1_1");
			builder.put(grammarAccess.getSecModelSubclauseAccess().getDeclassificationAssignment_2_1(), "rule__SecModelSubclause__DeclassificationAssignment_2_1");
			builder.put(grammarAccess.getSMFClassificationAccess().getFeatureAssignment_1(), "rule__SMFClassification__FeatureAssignment_1");
			builder.put(grammarAccess.getSMFClassificationAccess().getTypeRefAssignment_3(), "rule__SMFClassification__TypeRefAssignment_3");
			builder.put(grammarAccess.getSMFDeclassificationAccess().getFlowAssignment_1(), "rule__SMFDeclassification__FlowAssignment_1");
			builder.put(grammarAccess.getSMFDeclassificationAccess().getSrcNameAssignment_3_0(), "rule__SMFDeclassification__SrcNameAssignment_3_0");
			builder.put(grammarAccess.getSMFDeclassificationAccess().getAnyAssignment_3_1(), "rule__SMFDeclassification__AnyAssignment_3_1");
			builder.put(grammarAccess.getSMFDeclassificationAccess().getSnkNameAssignment_5(), "rule__SMFDeclassification__SnkNameAssignment_5");
			builder.put(grammarAccess.getSMFTypeDefAccess().getNameAssignment_0(), "rule__SMFTypeDef__NameAssignment_0");
			builder.put(grammarAccess.getSMFTypeDefAccess().getTypeAssignment_1_1_3(), "rule__SMFTypeDef__TypeAssignment_1_1_3");
			builder.put(grammarAccess.getSMFTypeDefAccess().getTypeAssignment_1_1_4_1(), "rule__SMFTypeDef__TypeAssignment_1_1_4_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0(), "rule__ContainedPropertyAssociation__PropertyAssignment_0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__ContainedPropertyAssociation__AppendAssignment_1_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2(), "rule__ContainedPropertyAssociation__ConstantAssignment_2");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_2_1");
			builder.put(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_2(), "rule__ContainedPropertyAssociation__InBindingAssignment_5_2");
			builder.put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_0(), "rule__PropertyAssociation__PropertyAssignment_0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__PropertyAssociation__AppendAssignment_1_1");
			builder.put(grammarAccess.getPropertyAssociationAccess().getConstantAssignment_2(), "rule__PropertyAssociation__ConstantAssignment_2");
			builder.put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__PropertyAssociation__OwnedValueAssignment_3_0");
			builder.put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_1_1");
			builder.put(grammarAccess.getPropertyAssociationAccess().getInBindingAssignment_4_2(), "rule__PropertyAssociation__InBindingAssignment_4_2");
			builder.put(grammarAccess.getBasicPropertyAssociationAccess().getPropertyAssignment_0(), "rule__BasicPropertyAssociation__PropertyAssignment_0");
			builder.put(grammarAccess.getBasicPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__BasicPropertyAssociation__OwnedValueAssignment_2");
			builder.put(grammarAccess.getContainmentPathAccess().getPathAssignment(), "rule__ContainmentPath__PathAssignment");
			builder.put(grammarAccess.getModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__ModalPropertyValue__OwnedValueAssignment_0");
			builder.put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_3(), "rule__ModalPropertyValue__InModeAssignment_3");
			builder.put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_4_1(), "rule__ModalPropertyValue__InModeAssignment_4_1");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__OptionalModalPropertyValue__OwnedValueAssignment_0");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_2(), "rule__OptionalModalPropertyValue__InModeAssignment_1_2");
			builder.put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3_1(), "rule__OptionalModalPropertyValue__InModeAssignment_1_3_1");
			builder.put(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment(), "rule__PropertyValue__OwnedValueAssignment");
			builder.put(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment(), "rule__LiteralorReferenceTerm__NamedValueAssignment");
			builder.put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0(), "rule__BooleanLiteral__ValueAssignment_1_0");
			builder.put(grammarAccess.getConstantValueAccess().getNamedValueAssignment(), "rule__ConstantValue__NamedValueAssignment");
			builder.put(grammarAccess.getReferenceTermAccess().getPathAssignment_2(), "rule__ReferenceTerm__PathAssignment_2");
			builder.put(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__RecordTerm__OwnedFieldValueAssignment_1");
			builder.put(grammarAccess.getOldRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__OldRecordTerm__OwnedFieldValueAssignment_1");
			builder.put(grammarAccess.getComputedTermAccess().getFunctionAssignment_2(), "rule__ComputedTerm__FunctionAssignment_2");
			builder.put(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2(), "rule__ComponentClassifierTerm__ClassifierAssignment_2");
			builder.put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0(), "rule__ListTerm__OwnedListElementAssignment_2_0");
			builder.put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1(), "rule__ListTerm__OwnedListElementAssignment_2_1_1");
			builder.put(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0(), "rule__FieldPropertyAssociation__PropertyAssignment_0");
			builder.put(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__FieldPropertyAssociation__OwnedValueAssignment_2");
			builder.put(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0_0(), "rule__ContainmentPathElement__NamedElementAssignment_0_0");
			builder.put(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_0_1(), "rule__ContainmentPathElement__ArrayRangeAssignment_0_1");
			builder.put(grammarAccess.getContainmentPathElementAccess().getPathAssignment_1_1(), "rule__ContainmentPathElement__PathAssignment_1_1");
			builder.put(grammarAccess.getStringTermAccess().getValueAssignment(), "rule__StringTerm__ValueAssignment");
			builder.put(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2(), "rule__ArrayRange__LowerBoundAssignment_2");
			builder.put(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1(), "rule__ArrayRange__UpperBoundAssignment_3_1");
			builder.put(grammarAccess.getSignedConstantAccess().getOpAssignment_0(), "rule__SignedConstant__OpAssignment_0");
			builder.put(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1(), "rule__SignedConstant__OwnedPropertyExpressionAssignment_1");
			builder.put(grammarAccess.getIntegerTermAccess().getValueAssignment_0(), "rule__IntegerTerm__ValueAssignment_0");
			builder.put(grammarAccess.getIntegerTermAccess().getUnitAssignment_1(), "rule__IntegerTerm__UnitAssignment_1");
			builder.put(grammarAccess.getRealTermAccess().getValueAssignment_0(), "rule__RealTerm__ValueAssignment_0");
			builder.put(grammarAccess.getRealTermAccess().getUnitAssignment_1(), "rule__RealTerm__UnitAssignment_1");
			builder.put(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0(), "rule__NumericRangeTerm__MinimumAssignment_0");
			builder.put(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2(), "rule__NumericRangeTerm__MaximumAssignment_2");
			builder.put(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1(), "rule__NumericRangeTerm__DeltaAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SecMFGrammarAccess grammarAccess;

	@Override
	protected InternalSecMFParser createParser() {
		InternalSecMFParser result = new InternalSecMFParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}

	public SecMFGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SecMFGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
