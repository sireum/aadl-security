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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.impl.NamedElementImpl;

import org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelLibrary;
import org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFRootImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SecMFRootImpl#getSubclauses <em>Subclauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecMFRootImpl extends NamedElementImpl implements SecMFRoot
{
  /**
   * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLibrary()
   * @generated
   * @ordered
   */
  protected SecModelLibrary library;

  /**
   * The cached value of the '{@link #getSubclauses() <em>Subclauses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubclauses()
   * @generated
   * @ordered
   */
  protected EList<SecModelSubclause> subclauses;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SecMFRootImpl()
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
    return SecMFPackage.Literals.SEC_MF_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SecModelLibrary getLibrary()
  {
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLibrary(SecModelLibrary newLibrary, NotificationChain msgs)
  {
    SecModelLibrary oldLibrary = library;
    library = newLibrary;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecMFPackage.SEC_MF_ROOT__LIBRARY, oldLibrary, newLibrary);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLibrary(SecModelLibrary newLibrary)
  {
    if (newLibrary != library)
    {
      NotificationChain msgs = null;
      if (library != null)
        msgs = ((InternalEObject)library).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecMFPackage.SEC_MF_ROOT__LIBRARY, null, msgs);
      if (newLibrary != null)
        msgs = ((InternalEObject)newLibrary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecMFPackage.SEC_MF_ROOT__LIBRARY, null, msgs);
      msgs = basicSetLibrary(newLibrary, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecMFPackage.SEC_MF_ROOT__LIBRARY, newLibrary, newLibrary));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SecModelSubclause> getSubclauses()
  {
    if (subclauses == null)
    {
      subclauses = new EObjectContainmentEList<SecModelSubclause>(SecModelSubclause.class, this, SecMFPackage.SEC_MF_ROOT__SUBCLAUSES);
    }
    return subclauses;
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
      case SecMFPackage.SEC_MF_ROOT__LIBRARY:
        return basicSetLibrary(null, msgs);
      case SecMFPackage.SEC_MF_ROOT__SUBCLAUSES:
        return ((InternalEList<?>)getSubclauses()).basicRemove(otherEnd, msgs);
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
      case SecMFPackage.SEC_MF_ROOT__LIBRARY:
        return getLibrary();
      case SecMFPackage.SEC_MF_ROOT__SUBCLAUSES:
        return getSubclauses();
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
      case SecMFPackage.SEC_MF_ROOT__LIBRARY:
        setLibrary((SecModelLibrary)newValue);
        return;
      case SecMFPackage.SEC_MF_ROOT__SUBCLAUSES:
        getSubclauses().clear();
        getSubclauses().addAll((Collection<? extends SecModelSubclause>)newValue);
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
      case SecMFPackage.SEC_MF_ROOT__LIBRARY:
        setLibrary((SecModelLibrary)null);
        return;
      case SecMFPackage.SEC_MF_ROOT__SUBCLAUSES:
        getSubclauses().clear();
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
      case SecMFPackage.SEC_MF_ROOT__LIBRARY:
        return library != null;
      case SecMFPackage.SEC_MF_ROOT__SUBCLAUSES:
        return subclauses != null && !subclauses.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SecMFRootImpl
