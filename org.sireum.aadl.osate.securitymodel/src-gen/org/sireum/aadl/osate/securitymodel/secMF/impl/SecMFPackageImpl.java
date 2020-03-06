/**
 * 
 * /** Copyright (c) 2020, Hariharan Thiagarajan, Kansas State University
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
package org.sireum.aadl.osate.securitymodel.secMF.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadl2.Aadl2Package;

import org.sireum.aadl.osate.securitymodel.secMF.SMFClassification;
import org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification;
import org.sireum.aadl.osate.securitymodel.secMF.SMFTypeRef;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFFactory;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause;
import org.sireum.aadl.osate.securitymodel.secMF.SmfTypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecMFPackageImpl extends EPackageImpl implements SecMFPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secModelLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secModelSubclauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smfClassificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smfTypeRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smfDeclassificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass smfTypeDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass secMFRootEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SecMFPackageImpl()
  {
    super(eNS_URI, SecMFFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link SecMFPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SecMFPackage init()
  {
    if (isInited) return (SecMFPackage)EPackage.Registry.INSTANCE.getEPackage(SecMFPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredSecMFPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SecMFPackageImpl theSecMFPackage = registeredSecMFPackage instanceof SecMFPackageImpl ? (SecMFPackageImpl)registeredSecMFPackage : new SecMFPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    EcorePackage.eINSTANCE.eClass();
    Aadl2Package.eINSTANCE.eClass();

    // Create package meta-data objects
    theSecMFPackage.createPackageContents();

    // Initialize created meta-data
    theSecMFPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSecMFPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SecMFPackage.eNS_URI, theSecMFPackage);
    return theSecMFPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSecModelLibrary()
  {
    return secModelLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSecModelLibrary_Types()
  {
    return (EReference)secModelLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSecModelLibrary_Type()
  {
    return (EReference)secModelLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSecModelSubclause()
  {
    return secModelSubclauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSecModelSubclause_Classification()
  {
    return (EReference)secModelSubclauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSecModelSubclause_Declassification()
  {
    return (EReference)secModelSubclauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSMFClassification()
  {
    return smfClassificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSMFClassification_Feature()
  {
    return (EReference)smfClassificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSMFClassification_TypeRef()
  {
    return (EReference)smfClassificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSMFTypeRef()
  {
    return smfTypeRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSMFDeclassification()
  {
    return smfDeclassificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSMFDeclassification_Flow()
  {
    return (EReference)smfDeclassificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSMFDeclassification_SrcName()
  {
    return (EReference)smfDeclassificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSMFDeclassification_Any()
  {
    return (EAttribute)smfDeclassificationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSMFDeclassification_SnkName()
  {
    return (EReference)smfDeclassificationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSmfTypeDef()
  {
    return smfTypeDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSmfTypeDef_Type()
  {
    return (EReference)smfTypeDefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSecMFRoot()
  {
    return secMFRootEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSecMFRoot_Library()
  {
    return (EReference)secMFRootEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSecMFRoot_Subclauses()
  {
    return (EReference)secMFRootEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SecMFFactory getSecMFFactory()
  {
    return (SecMFFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    secModelLibraryEClass = createEClass(SEC_MODEL_LIBRARY);
    createEReference(secModelLibraryEClass, SEC_MODEL_LIBRARY__TYPES);
    createEReference(secModelLibraryEClass, SEC_MODEL_LIBRARY__TYPE);

    secModelSubclauseEClass = createEClass(SEC_MODEL_SUBCLAUSE);
    createEReference(secModelSubclauseEClass, SEC_MODEL_SUBCLAUSE__CLASSIFICATION);
    createEReference(secModelSubclauseEClass, SEC_MODEL_SUBCLAUSE__DECLASSIFICATION);

    smfClassificationEClass = createEClass(SMF_CLASSIFICATION);
    createEReference(smfClassificationEClass, SMF_CLASSIFICATION__FEATURE);
    createEReference(smfClassificationEClass, SMF_CLASSIFICATION__TYPE_REF);

    smfTypeRefEClass = createEClass(SMF_TYPE_REF);

    smfDeclassificationEClass = createEClass(SMF_DECLASSIFICATION);
    createEReference(smfDeclassificationEClass, SMF_DECLASSIFICATION__FLOW);
    createEReference(smfDeclassificationEClass, SMF_DECLASSIFICATION__SRC_NAME);
    createEAttribute(smfDeclassificationEClass, SMF_DECLASSIFICATION__ANY);
    createEReference(smfDeclassificationEClass, SMF_DECLASSIFICATION__SNK_NAME);

    smfTypeDefEClass = createEClass(SMF_TYPE_DEF);
    createEReference(smfTypeDefEClass, SMF_TYPE_DEF__TYPE);

    secMFRootEClass = createEClass(SEC_MF_ROOT);
    createEReference(secMFRootEClass, SEC_MF_ROOT__LIBRARY);
    createEReference(secMFRootEClass, SEC_MF_ROOT__SUBCLAUSES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    secModelLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
    secModelSubclauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
    smfClassificationEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    smfTypeRefEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    smfDeclassificationEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    smfTypeDefEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    smfTypeDefEClass.getESuperTypes().add(this.getSMFTypeRef());
    secMFRootEClass.getESuperTypes().add(theAadl2Package.getNamedElement());

    // Initialize classes and features; add operations and parameters
    initEClass(secModelLibraryEClass, SecModelLibrary.class, "SecModelLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSecModelLibrary_Types(), this.getSmfTypeDef(), null, "types", null, 0, -1, SecModelLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecModelLibrary_Type(), this.getSmfTypeDef(), null, "type", null, 0, -1, SecModelLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(secModelSubclauseEClass, SecModelSubclause.class, "SecModelSubclause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSecModelSubclause_Classification(), this.getSMFClassification(), null, "classification", null, 0, -1, SecModelSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecModelSubclause_Declassification(), this.getSMFDeclassification(), null, "declassification", null, 0, -1, SecModelSubclause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smfClassificationEClass, SMFClassification.class, "SMFClassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMFClassification_Feature(), theAadl2Package.getNamedElement(), null, "feature", null, 0, 1, SMFClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMFClassification_TypeRef(), this.getSMFTypeRef(), null, "typeRef", null, 0, 1, SMFClassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smfTypeRefEClass, SMFTypeRef.class, "SMFTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(smfDeclassificationEClass, SMFDeclassification.class, "SMFDeclassification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSMFDeclassification_Flow(), theAadl2Package.getNamedElement(), null, "flow", null, 0, 1, SMFDeclassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMFDeclassification_SrcName(), this.getSMFTypeRef(), null, "srcName", null, 0, 1, SMFDeclassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSMFDeclassification_Any(), theEcorePackage.getEBoolean(), "any", null, 0, 1, SMFDeclassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSMFDeclassification_SnkName(), this.getSMFTypeRef(), null, "snkName", null, 0, 1, SMFDeclassification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(smfTypeDefEClass, SmfTypeDef.class, "SmfTypeDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSmfTypeDef_Type(), this.getSMFTypeRef(), null, "type", null, 0, 1, SmfTypeDef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(secMFRootEClass, SecMFRoot.class, "SecMFRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSecMFRoot_Library(), this.getSecModelLibrary(), null, "library", null, 0, 1, SecMFRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSecMFRoot_Subclauses(), this.getSecModelSubclause(), null, "subclauses", null, 0, -1, SecMFRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SecMFPackageImpl
