
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
package org.sireum.aadl.osate.securitymodel.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.ArrayRange;
import org.osate.aadl2.BasicPropertyAssociation;
import org.osate.aadl2.BooleanLiteral;
import org.osate.aadl2.ClassifierValue;
import org.osate.aadl2.ComputedValue;
import org.osate.aadl2.ContainedNamedElement;
import org.osate.aadl2.ContainmentPathElement;
import org.osate.aadl2.IntegerLiteral;
import org.osate.aadl2.ListValue;
import org.osate.aadl2.ModalPropertyValue;
import org.osate.aadl2.NamedValue;
import org.osate.aadl2.Operation;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.RangeValue;
import org.osate.aadl2.RealLiteral;
import org.osate.aadl2.RecordValue;
import org.osate.aadl2.ReferenceValue;
import org.osate.aadl2.StringLiteral;
import org.osate.xtext.aadl2.properties.serializer.PropertiesSemanticSequencer;
import org.sireum.aadl.osate.securitymodel.secMF.SMFClassification;
import org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause;
import org.sireum.aadl.osate.securitymodel.secMF.SmfTypeDef;
import org.sireum.aadl.osate.securitymodel.services.SecMFGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractSecMFSemanticSequencer extends PropertiesSemanticSequencer {

	@Inject
	private SecMFGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Aadl2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Aadl2Package.ARRAY_RANGE:
				sequence_ArrayRange(context, (ArrayRange) semanticObject); 
				return; 
			case Aadl2Package.BASIC_PROPERTY_ASSOCIATION:
				sequence_FieldPropertyAssociation(context, (BasicPropertyAssociation) semanticObject); 
				return; 
			case Aadl2Package.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case Aadl2Package.CLASSIFIER_VALUE:
				sequence_ComponentClassifierTerm(context, (ClassifierValue) semanticObject); 
				return; 
			case Aadl2Package.COMPUTED_VALUE:
				sequence_ComputedTerm(context, (ComputedValue) semanticObject); 
				return; 
			case Aadl2Package.CONTAINED_NAMED_ELEMENT:
				sequence_ContainmentPath(context, (ContainedNamedElement) semanticObject); 
				return; 
			case Aadl2Package.CONTAINMENT_PATH_ELEMENT:
				sequence_ContainmentPathElement(context, (ContainmentPathElement) semanticObject); 
				return; 
			case Aadl2Package.INTEGER_LITERAL:
				sequence_IntegerTerm(context, (IntegerLiteral) semanticObject); 
				return; 
			case Aadl2Package.LIST_VALUE:
				sequence_ListTerm(context, (ListValue) semanticObject); 
				return; 
			case Aadl2Package.MODAL_PROPERTY_VALUE:
				if (rule == grammarAccess.getModalPropertyValueRule()) {
					sequence_ModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOptionalModalPropertyValueRule()) {
					sequence_OptionalModalPropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyValueRule()) {
					sequence_PropertyValue(context, (ModalPropertyValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.NAMED_VALUE:
				if (rule == grammarAccess.getConstantValueRule()
						|| rule == grammarAccess.getNumAltRule()) {
					sequence_ConstantValue(context, (NamedValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyExpressionRule()
						|| rule == grammarAccess.getLiteralorReferenceTermRule()) {
					sequence_LiteralorReferenceTerm(context, (NamedValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.OPERATION:
				sequence_SignedConstant(context, (Operation) semanticObject); 
				return; 
			case Aadl2Package.PROPERTY_ASSOCIATION:
				if (rule == grammarAccess.getBasicPropertyAssociationRule()) {
					sequence_BasicPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPModelRule()
						|| rule == grammarAccess.getContainedPropertyAssociationRule()) {
					sequence_ContainedPropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyAssociationRule()) {
					sequence_PropertyAssociation(context, (PropertyAssociation) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.RANGE_VALUE:
				sequence_NumericRangeTerm(context, (RangeValue) semanticObject); 
				return; 
			case Aadl2Package.REAL_LITERAL:
				sequence_RealTerm(context, (RealLiteral) semanticObject); 
				return; 
			case Aadl2Package.RECORD_VALUE:
				if (rule == grammarAccess.getOldRecordTermRule()) {
					sequence_OldRecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getPropertyExpressionRule()
						|| rule == grammarAccess.getRecordTermRule()) {
					sequence_RecordTerm(context, (RecordValue) semanticObject); 
					return; 
				}
				else break;
			case Aadl2Package.REFERENCE_VALUE:
				sequence_ReferenceTerm(context, (ReferenceValue) semanticObject); 
				return; 
			case Aadl2Package.STRING_LITERAL:
				sequence_StringTerm(context, (StringLiteral) semanticObject); 
				return; 
			}
		else if (epackage == SecMFPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SecMFPackage.SMF_CLASSIFICATION:
				sequence_SMFClassification(context, (SMFClassification) semanticObject); 
				return; 
			case SecMFPackage.SMF_DECLASSIFICATION:
				sequence_SMFDeclassification(context, (SMFDeclassification) semanticObject); 
				return; 
			case SecMFPackage.SEC_MF_ROOT:
				sequence_SecMFRoot(context, (SecMFRoot) semanticObject); 
				return; 
			case SecMFPackage.SEC_MODEL_LIBRARY:
				if (rule == grammarAccess.getSMFLibraryRule()) {
					sequence_SMFLibrary(context, (SecModelLibrary) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAnnexLibraryRule()
						|| rule == grammarAccess.getNamedElementRule()
						|| rule == grammarAccess.getSecModelLibraryRule()) {
					sequence_SecModelLibrary(context, (SecModelLibrary) semanticObject); 
					return; 
				}
				else break;
			case SecMFPackage.SEC_MODEL_SUBCLAUSE:
				if (rule == grammarAccess.getSMFSubclauseRule()) {
					sequence_SMFSubclause(context, (SecModelSubclause) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAnnexSubclauseRule()
						|| rule == grammarAccess.getModalElementRule()
						|| rule == grammarAccess.getSecModelSubclauseRule()) {
					sequence_SecModelSubclause(context, (SecModelSubclause) semanticObject); 
					return; 
				}
				else break;
			case SecMFPackage.SMF_TYPE_DEF:
				sequence_SMFTypeDef(context, (SmfTypeDef) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     NamedElement returns SMFClassification
	 *     SMFClassification returns SMFClassification
	 *
	 * Constraint:
	 *     (feature=[NamedElement|ID] typeRef=[SMFTypeRef|ID])
	 */
	protected void sequence_SMFClassification(ISerializationContext context, SMFClassification semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SecMFPackage.Literals.SMF_CLASSIFICATION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecMFPackage.Literals.SMF_CLASSIFICATION__FEATURE));
			if (transientValues.isValueTransient(semanticObject, SecMFPackage.Literals.SMF_CLASSIFICATION__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SecMFPackage.Literals.SMF_CLASSIFICATION__TYPE_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSMFClassificationAccess().getFeatureNamedElementIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SecMFPackage.Literals.SMF_CLASSIFICATION__FEATURE, false));
		feeder.accept(grammarAccess.getSMFClassificationAccess().getTypeRefSMFTypeRefIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SecMFPackage.Literals.SMF_CLASSIFICATION__TYPE_REF, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns SMFDeclassification
	 *     SMFDeclassification returns SMFDeclassification
	 *
	 * Constraint:
	 *     (flow=[NamedElement|ID] (srcName=[SMFTypeRef|ID] | any?='any') snkName=[SMFTypeRef|ID])
	 */
	protected void sequence_SMFDeclassification(ISerializationContext context, SMFDeclassification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMFLibrary returns SecModelLibrary
	 *
	 * Constraint:
	 *     ((name=QEMREF types+=SMFTypeDef*) | (name=QEMREF type+=SMFTypeDef*))
	 */
	protected void sequence_SMFLibrary(ISerializationContext context, SecModelLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SMFSubclause returns SecModelSubclause
	 *
	 * Constraint:
	 *     (name=QCREF classification+=SMFClassification* declassification+=SMFDeclassification*)
	 */
	protected void sequence_SMFSubclause(ISerializationContext context, SecModelSubclause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns SmfTypeDef
	 *     Element returns SmfTypeDef
	 *     SMFTypeRef returns SmfTypeDef
	 *     SMFTypeDef returns SmfTypeDef
	 *
	 * Constraint:
	 *     (name=ID (type+=[SMFTypeRef|ID] type+=[SMFTypeRef|ID]*)?)
	 */
	protected void sequence_SMFTypeDef(ISerializationContext context, SmfTypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SecMFRoot returns SecMFRoot
	 *
	 * Constraint:
	 *     (library=SMFLibrary | subclauses+=SMFSubclause+)?
	 */
	protected void sequence_SecMFRoot(ISerializationContext context, SecMFRoot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AnnexLibrary returns SecModelLibrary
	 *     NamedElement returns SecModelLibrary
	 *     SecModelLibrary returns SecModelLibrary
	 *
	 * Constraint:
	 *     types+=SMFTypeDef*
	 */
	protected void sequence_SecModelLibrary(ISerializationContext context, SecModelLibrary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AnnexSubclause returns SecModelSubclause
	 *     ModalElement returns SecModelSubclause
	 *     SecModelSubclause returns SecModelSubclause
	 *
	 * Constraint:
	 *     (classification+=SMFClassification* declassification+=SMFDeclassification*)
	 */
	protected void sequence_SecModelSubclause(ISerializationContext context, SecModelSubclause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
