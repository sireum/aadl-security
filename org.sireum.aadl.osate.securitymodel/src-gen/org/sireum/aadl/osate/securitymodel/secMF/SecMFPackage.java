/**
 * Copyright (c) 2021, Kansas State University
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
package org.sireum.aadl.osate.securitymodel.secMF;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFFactory
 * @model kind="package"
 * @generated
 */
public interface SecMFPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "secMF";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sireum.org/aadl/osate/securitymodel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "secMF";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SecMFPackage eINSTANCE = org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl.init();

  /**
   * The meta object id for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelLibraryImpl <em>Sec Model Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelLibraryImpl
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSecModelLibrary()
   * @generated
   */
  int SEC_MODEL_LIBRARY = 0;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_LIBRARY__OWNED_ELEMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_LIBRARY__OWNED_COMMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_LIBRARY__NAME = Aadl2Package.ANNEX_LIBRARY__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_LIBRARY__QUALIFIED_NAME = Aadl2Package.ANNEX_LIBRARY__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_LIBRARY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_LIBRARY__TYPES = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_LIBRARY__TYPE = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sec Model Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelSubclauseImpl <em>Sec Model Subclause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelSubclauseImpl
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSecModelSubclause()
   * @generated
   */
  int SEC_MODEL_SUBCLAUSE = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE__OWNED_ELEMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE__OWNED_COMMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE__NAME = Aadl2Package.ANNEX_SUBCLAUSE__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE__QUALIFIED_NAME = Aadl2Package.ANNEX_SUBCLAUSE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>In Mode</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE__IN_MODE = Aadl2Package.ANNEX_SUBCLAUSE__IN_MODE;

  /**
   * The feature id for the '<em><b>Classification</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE__CLASSIFICATION = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Declassification</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE__DECLASSIFICATION = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sec Model Subclause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MODEL_SUBCLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFClassificationImpl <em>SMF Classification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SMFClassificationImpl
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSMFClassification()
   * @generated
   */
  int SMF_CLASSIFICATION = 2;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_CLASSIFICATION__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_CLASSIFICATION__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_CLASSIFICATION__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_CLASSIFICATION__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_CLASSIFICATION__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_CLASSIFICATION__FEATURE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_CLASSIFICATION__TYPE_REF = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMF Classification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_CLASSIFICATION_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFTypeRefImpl <em>SMF Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SMFTypeRefImpl
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSMFTypeRef()
   * @generated
   */
  int SMF_TYPE_REF = 3;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_REF__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_REF__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_REF__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_REF__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_REF__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The number of structural features of the '<em>SMF Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_REF_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFDeclassificationImpl <em>SMF Declassification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SMFDeclassificationImpl
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSMFDeclassification()
   * @generated
   */
  int SMF_DECLASSIFICATION = 4;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Flow</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__FLOW = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Src Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__SRC_NAME = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Any</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__ANY = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Snk Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION__SNK_NAME = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>SMF Declassification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_DECLASSIFICATION_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SmfTypeDefImpl <em>Smf Type Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SmfTypeDefImpl
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSmfTypeDef()
   * @generated
   */
  int SMF_TYPE_DEF = 5;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_DEF__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_DEF__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_DEF__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_DEF__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_DEF__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_DEF__TYPE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Smf Type Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMF_TYPE_DEF_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFRootImpl <em>Root</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFRootImpl
   * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSecMFRoot()
   * @generated
   */
  int SEC_MF_ROOT = 6;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MF_ROOT__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MF_ROOT__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MF_ROOT__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MF_ROOT__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MF_ROOT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Library</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MF_ROOT__LIBRARY = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Subclauses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MF_ROOT__SUBCLAUSES = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Root</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEC_MF_ROOT_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary <em>Sec Model Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sec Model Library</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary
   * @generated
   */
  EClass getSecModelLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary#getTypes()
   * @see #getSecModelLibrary()
   * @generated
   */
  EReference getSecModelLibrary_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary#getType()
   * @see #getSecModelLibrary()
   * @generated
   */
  EReference getSecModelLibrary_Type();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause <em>Sec Model Subclause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sec Model Subclause</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause
   * @generated
   */
  EClass getSecModelSubclause();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause#getClassification <em>Classification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classification</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause#getClassification()
   * @see #getSecModelSubclause()
   * @generated
   */
  EReference getSecModelSubclause_Classification();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause#getDeclassification <em>Declassification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declassification</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause#getDeclassification()
   * @see #getSecModelSubclause()
   * @generated
   */
  EReference getSecModelSubclause_Declassification();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFClassification <em>SMF Classification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMF Classification</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFClassification
   * @generated
   */
  EClass getSMFClassification();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFClassification#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFClassification#getFeature()
   * @see #getSMFClassification()
   * @generated
   */
  EReference getSMFClassification_Feature();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFClassification#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Ref</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFClassification#getTypeRef()
   * @see #getSMFClassification()
   * @generated
   */
  EReference getSMFClassification_TypeRef();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFTypeRef <em>SMF Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMF Type Ref</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFTypeRef
   * @generated
   */
  EClass getSMFTypeRef();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification <em>SMF Declassification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMF Declassification</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification
   * @generated
   */
  EClass getSMFDeclassification();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getFlow <em>Flow</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Flow</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getFlow()
   * @see #getSMFDeclassification()
   * @generated
   */
  EReference getSMFDeclassification_Flow();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getSrcName <em>Src Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Src Name</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getSrcName()
   * @see #getSMFDeclassification()
   * @generated
   */
  EReference getSMFDeclassification_SrcName();

  /**
   * Returns the meta object for the attribute '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#isAny <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Any</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#isAny()
   * @see #getSMFDeclassification()
   * @generated
   */
  EAttribute getSMFDeclassification_Any();

  /**
   * Returns the meta object for the reference '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getSnkName <em>Snk Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Snk Name</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getSnkName()
   * @see #getSMFDeclassification()
   * @generated
   */
  EReference getSMFDeclassification_SnkName();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.osate.securitymodel.secMF.SmfTypeDef <em>Smf Type Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Smf Type Def</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SmfTypeDef
   * @generated
   */
  EClass getSmfTypeDef();

  /**
   * Returns the meta object for the reference list '{@link org.sireum.aadl.osate.securitymodel.secMF.SmfTypeDef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Type</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SmfTypeDef#getType()
   * @see #getSmfTypeDef()
   * @generated
   */
  EReference getSmfTypeDef_Type();

  /**
   * Returns the meta object for class '{@link org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot <em>Root</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Root</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot
   * @generated
   */
  EClass getSecMFRoot();

  /**
   * Returns the meta object for the containment reference '{@link org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot#getLibrary <em>Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Library</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot#getLibrary()
   * @see #getSecMFRoot()
   * @generated
   */
  EReference getSecMFRoot_Library();

  /**
   * Returns the meta object for the containment reference list '{@link org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot#getSubclauses <em>Subclauses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subclauses</em>'.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot#getSubclauses()
   * @see #getSecMFRoot()
   * @generated
   */
  EReference getSecMFRoot_Subclauses();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SecMFFactory getSecMFFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelLibraryImpl <em>Sec Model Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelLibraryImpl
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSecModelLibrary()
     * @generated
     */
    EClass SEC_MODEL_LIBRARY = eINSTANCE.getSecModelLibrary();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEC_MODEL_LIBRARY__TYPES = eINSTANCE.getSecModelLibrary_Types();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEC_MODEL_LIBRARY__TYPE = eINSTANCE.getSecModelLibrary_Type();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelSubclauseImpl <em>Sec Model Subclause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelSubclauseImpl
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSecModelSubclause()
     * @generated
     */
    EClass SEC_MODEL_SUBCLAUSE = eINSTANCE.getSecModelSubclause();

    /**
     * The meta object literal for the '<em><b>Classification</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEC_MODEL_SUBCLAUSE__CLASSIFICATION = eINSTANCE.getSecModelSubclause_Classification();

    /**
     * The meta object literal for the '<em><b>Declassification</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEC_MODEL_SUBCLAUSE__DECLASSIFICATION = eINSTANCE.getSecModelSubclause_Declassification();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFClassificationImpl <em>SMF Classification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SMFClassificationImpl
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSMFClassification()
     * @generated
     */
    EClass SMF_CLASSIFICATION = eINSTANCE.getSMFClassification();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMF_CLASSIFICATION__FEATURE = eINSTANCE.getSMFClassification_Feature();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMF_CLASSIFICATION__TYPE_REF = eINSTANCE.getSMFClassification_TypeRef();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFTypeRefImpl <em>SMF Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SMFTypeRefImpl
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSMFTypeRef()
     * @generated
     */
    EClass SMF_TYPE_REF = eINSTANCE.getSMFTypeRef();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFDeclassificationImpl <em>SMF Declassification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SMFDeclassificationImpl
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSMFDeclassification()
     * @generated
     */
    EClass SMF_DECLASSIFICATION = eINSTANCE.getSMFDeclassification();

    /**
     * The meta object literal for the '<em><b>Flow</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMF_DECLASSIFICATION__FLOW = eINSTANCE.getSMFDeclassification_Flow();

    /**
     * The meta object literal for the '<em><b>Src Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMF_DECLASSIFICATION__SRC_NAME = eINSTANCE.getSMFDeclassification_SrcName();

    /**
     * The meta object literal for the '<em><b>Any</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMF_DECLASSIFICATION__ANY = eINSTANCE.getSMFDeclassification_Any();

    /**
     * The meta object literal for the '<em><b>Snk Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMF_DECLASSIFICATION__SNK_NAME = eINSTANCE.getSMFDeclassification_SnkName();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SmfTypeDefImpl <em>Smf Type Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SmfTypeDefImpl
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSmfTypeDef()
     * @generated
     */
    EClass SMF_TYPE_DEF = eINSTANCE.getSmfTypeDef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMF_TYPE_DEF__TYPE = eINSTANCE.getSmfTypeDef_Type();

    /**
     * The meta object literal for the '{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFRootImpl <em>Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFRootImpl
     * @see org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFPackageImpl#getSecMFRoot()
     * @generated
     */
    EClass SEC_MF_ROOT = eINSTANCE.getSecMFRoot();

    /**
     * The meta object literal for the '<em><b>Library</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEC_MF_ROOT__LIBRARY = eINSTANCE.getSecMFRoot_Library();

    /**
     * The meta object literal for the '<em><b>Subclauses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEC_MF_ROOT__SUBCLAUSES = eINSTANCE.getSecMFRoot_Subclauses();

  }

} //SecMFPackage
