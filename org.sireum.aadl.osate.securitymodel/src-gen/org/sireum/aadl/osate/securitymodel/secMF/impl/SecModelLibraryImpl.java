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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.AnnexLibraryImpl;

import org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary;
import org.sireum.aadl.osate.securitymodel.secMF.SmfTypeDef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sec Model Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelLibraryImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecModelLibraryImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecModelLibraryImpl extends AnnexLibraryImpl implements SecModelLibrary
{
  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<SmfTypeDef> types;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<SmfTypeDef> type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecModelLibraryImpl()
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
    return SecMFPackage.Literals.SEC_MODEL_LIBRARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SmfTypeDef> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<SmfTypeDef>(SmfTypeDef.class, this, SecMFPackage.SEC_MODEL_LIBRARY__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SmfTypeDef> getType()
  {
    if (type == null)
    {
      type = new EObjectContainmentEList<SmfTypeDef>(SmfTypeDef.class, this, SecMFPackage.SEC_MODEL_LIBRARY__TYPE);
    }
    return type;
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
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPE:
        return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
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
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPES:
        return getTypes();
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPE:
        return getType();
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
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends SmfTypeDef>)newValue);
        return;
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends SmfTypeDef>)newValue);
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
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPES:
        getTypes().clear();
        return;
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPE:
        getType().clear();
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
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPES:
        return types != null && !types.isEmpty();
      case SecMFPackage.SEC_MODEL_LIBRARY__TYPE:
        return type != null && !type.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SecModelLibraryImpl
