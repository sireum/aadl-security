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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.NamedElement;

import org.osate.aadl2.impl.NamedElementImpl;

import org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification;
import org.sireum.aadl.osate.securitymodel.secMF.SMFTypeRef;
import org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SMF Declassification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFDeclassificationImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFDeclassificationImpl#getSrcName <em>Src Name</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFDeclassificationImpl#isAny <em>Any</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.impl.SMFDeclassificationImpl#getSnkName <em>Snk Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SMFDeclassificationImpl extends NamedElementImpl implements SMFDeclassification
{
  /**
   * The cached value of the '{@link #getFlow() <em>Flow</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlow()
   * @generated
   * @ordered
   */
  protected NamedElement flow;

  /**
   * The cached value of the '{@link #getSrcName() <em>Src Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrcName()
   * @generated
   * @ordered
   */
  protected SMFTypeRef srcName;

  /**
   * The default value of the '{@link #isAny() <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAny()
   * @generated
   * @ordered
   */
  protected static final boolean ANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAny() <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAny()
   * @generated
   * @ordered
   */
  protected boolean any = ANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getSnkName() <em>Snk Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSnkName()
   * @generated
   * @ordered
   */
  protected SMFTypeRef snkName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SMFDeclassificationImpl()
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
    return SecMFPackage.Literals.SMF_DECLASSIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement getFlow()
  {
    if (flow != null && ((EObject)flow).eIsProxy())
    {
      InternalEObject oldFlow = (InternalEObject)flow;
      flow = (NamedElement)eResolveProxy(oldFlow);
      if (flow != oldFlow)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecMFPackage.SMF_DECLASSIFICATION__FLOW, oldFlow, flow));
      }
    }
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetFlow()
  {
    return flow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFlow(NamedElement newFlow)
  {
    NamedElement oldFlow = flow;
    flow = newFlow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecMFPackage.SMF_DECLASSIFICATION__FLOW, oldFlow, flow));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMFTypeRef getSrcName()
  {
    if (srcName != null && srcName.eIsProxy())
    {
      InternalEObject oldSrcName = (InternalEObject)srcName;
      srcName = (SMFTypeRef)eResolveProxy(oldSrcName);
      if (srcName != oldSrcName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecMFPackage.SMF_DECLASSIFICATION__SRC_NAME, oldSrcName, srcName));
      }
    }
    return srcName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMFTypeRef basicGetSrcName()
  {
    return srcName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSrcName(SMFTypeRef newSrcName)
  {
    SMFTypeRef oldSrcName = srcName;
    srcName = newSrcName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecMFPackage.SMF_DECLASSIFICATION__SRC_NAME, oldSrcName, srcName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isAny()
  {
    return any;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAny(boolean newAny)
  {
    boolean oldAny = any;
    any = newAny;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecMFPackage.SMF_DECLASSIFICATION__ANY, oldAny, any));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SMFTypeRef getSnkName()
  {
    if (snkName != null && snkName.eIsProxy())
    {
      InternalEObject oldSnkName = (InternalEObject)snkName;
      snkName = (SMFTypeRef)eResolveProxy(oldSnkName);
      if (snkName != oldSnkName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecMFPackage.SMF_DECLASSIFICATION__SNK_NAME, oldSnkName, snkName));
      }
    }
    return snkName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SMFTypeRef basicGetSnkName()
  {
    return snkName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSnkName(SMFTypeRef newSnkName)
  {
    SMFTypeRef oldSnkName = snkName;
    snkName = newSnkName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SecMFPackage.SMF_DECLASSIFICATION__SNK_NAME, oldSnkName, snkName));
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
      case SecMFPackage.SMF_DECLASSIFICATION__FLOW:
        if (resolve) return getFlow();
        return basicGetFlow();
      case SecMFPackage.SMF_DECLASSIFICATION__SRC_NAME:
        if (resolve) return getSrcName();
        return basicGetSrcName();
      case SecMFPackage.SMF_DECLASSIFICATION__ANY:
        return isAny();
      case SecMFPackage.SMF_DECLASSIFICATION__SNK_NAME:
        if (resolve) return getSnkName();
        return basicGetSnkName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SecMFPackage.SMF_DECLASSIFICATION__FLOW:
        setFlow((NamedElement)newValue);
        return;
      case SecMFPackage.SMF_DECLASSIFICATION__SRC_NAME:
        setSrcName((SMFTypeRef)newValue);
        return;
      case SecMFPackage.SMF_DECLASSIFICATION__ANY:
        setAny((Boolean)newValue);
        return;
      case SecMFPackage.SMF_DECLASSIFICATION__SNK_NAME:
        setSnkName((SMFTypeRef)newValue);
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
      case SecMFPackage.SMF_DECLASSIFICATION__FLOW:
        setFlow((NamedElement)null);
        return;
      case SecMFPackage.SMF_DECLASSIFICATION__SRC_NAME:
        setSrcName((SMFTypeRef)null);
        return;
      case SecMFPackage.SMF_DECLASSIFICATION__ANY:
        setAny(ANY_EDEFAULT);
        return;
      case SecMFPackage.SMF_DECLASSIFICATION__SNK_NAME:
        setSnkName((SMFTypeRef)null);
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
      case SecMFPackage.SMF_DECLASSIFICATION__FLOW:
        return flow != null;
      case SecMFPackage.SMF_DECLASSIFICATION__SRC_NAME:
        return srcName != null;
      case SecMFPackage.SMF_DECLASSIFICATION__ANY:
        return any != ANY_EDEFAULT;
      case SecMFPackage.SMF_DECLASSIFICATION__SNK_NAME:
        return snkName != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (any: ");
    result.append(any);
    result.append(')');
    return result.toString();
  }

} //SMFDeclassificationImpl
