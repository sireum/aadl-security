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
package org.sireum.aadl.osate.securitymodel.secMF.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sireum.aadl.osate.securitymodel.secMF.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecMFFactoryImpl extends EFactoryImpl implements SecMFFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SecMFFactory init()
  {
    try
    {
      SecMFFactory theSecMFFactory = (SecMFFactory)EPackage.Registry.INSTANCE.getEFactory(SecMFPackage.eNS_URI);
      if (theSecMFFactory != null)
      {
        return theSecMFFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SecMFFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SecMFFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SecMFPackage.SEC_MODEL_LIBRARY: return createSecModelLibrary();
      case SecMFPackage.SEC_MODEL_SUBCLAUSE: return createSecModelSubclause();
      case SecMFPackage.SMF_CLASSIFICATION: return createSMFClassification();
      case SecMFPackage.SMF_TYPE_REF: return createSMFTypeRef();
      case SecMFPackage.SMF_DECLASSIFICATION: return createSMFDeclassification();
      case SecMFPackage.SMF_TYPE_DEF: return createSmfTypeDef();
      case SecMFPackage.SEC_MF_ROOT: return createSecMFRoot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SecModelLibrary createSecModelLibrary()
  {
    SecModelLibraryImpl secModelLibrary = new SecModelLibraryImpl();
    return secModelLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SecModelSubclause createSecModelSubclause()
  {
    SecModelSubclauseImpl secModelSubclause = new SecModelSubclauseImpl();
    return secModelSubclause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMFClassification createSMFClassification()
  {
    SMFClassificationImpl smfClassification = new SMFClassificationImpl();
    return smfClassification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMFTypeRef createSMFTypeRef()
  {
    SMFTypeRefImpl smfTypeRef = new SMFTypeRefImpl();
    return smfTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMFDeclassification createSMFDeclassification()
  {
    SMFDeclassificationImpl smfDeclassification = new SMFDeclassificationImpl();
    return smfDeclassification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SmfTypeDef createSmfTypeDef()
  {
    SmfTypeDefImpl smfTypeDef = new SmfTypeDefImpl();
    return smfTypeDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SecMFRoot createSecMFRoot()
  {
    SecMFRootImpl secMFRoot = new SecMFRootImpl();
    return secMFRoot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SecMFPackage getSecMFPackage()
  {
    return (SecMFPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SecMFPackage getPackage()
  {
    return SecMFPackage.eINSTANCE;
  }

} //SecMFFactoryImpl
