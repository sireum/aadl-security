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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.AnnexSubclauseImpl;

import org.sireum.aadl.osate.securitymodel.secMF.SMFClassification;
import org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sec Model Subclause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelSubclauseImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelSubclauseImpl#getDeclassification <em>Declassification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecModelSubclauseImpl extends AnnexSubclauseImpl implements SecModelSubclause
{
  /**
   * The cached value of the '{@link #getClassification() <em>Classification</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassification()
   * @generated
   * @ordered
   */
  protected EList<SMFClassification> classification;

  /**
   * The cached value of the '{@link #getDeclassification() <em>Declassification</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclassification()
   * @generated
   * @ordered
   */
  protected EList<SMFDeclassification> declassification;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecModelSubclauseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SecMFPackage.Literals.SEC_MODEL_SUBCLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SMFClassification> getClassification()
  {
    if (classification == null)
    {
      classification = new EObjectContainmentEList<SMFClassification>(SMFClassification.class, this, SecMFPackage.SEC_MODEL_SUBCLAUSE__CLASSIFICATION);
    }
    return classification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SMFDeclassification> getDeclassification()
  {
    if (declassification == null)
    {
      declassification = new EObjectContainmentEList<SMFDeclassification>(SMFDeclassification.class, this, SecMFPackage.SEC_MODEL_SUBCLAUSE__DECLASSIFICATION);
    }
    return declassification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__CLASSIFICATION:
        return ((InternalEList<?>)getClassification()).basicRemove(otherEnd, msgs);
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__DECLASSIFICATION:
        return ((InternalEList<?>)getDeclassification()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__CLASSIFICATION:
        return getClassification();
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__DECLASSIFICATION:
        return getDeclassification();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__CLASSIFICATION:
        getClassification().clear();
        getClassification().addAll((Collection<? extends SMFClassification>)newValue);
        return;
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__DECLASSIFICATION:
        getDeclassification().clear();
        getDeclassification().addAll((Collection<? extends SMFDeclassification>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__CLASSIFICATION:
        getClassification().clear();
        return;
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__DECLASSIFICATION:
        getDeclassification().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__CLASSIFICATION:
        return classification != null && !classification.isEmpty();
      case SecMFPackage.SEC_MODEL_SUBCLAUSE__DECLASSIFICATION:
        return declassification != null && !declassification.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SecModelSubclauseImpl
