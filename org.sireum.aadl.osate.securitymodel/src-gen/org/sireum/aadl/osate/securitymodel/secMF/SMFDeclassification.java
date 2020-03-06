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
package org.sireum.aadl.osate.securitymodel.secMF;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SMF Declassification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getFlow <em>Flow</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getSrcName <em>Src Name</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#isAny <em>Any</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getSnkName <em>Snk Name</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSMFDeclassification()
 * @model
 * @generated
 */
public interface SMFDeclassification extends EObject, NamedElement
{
  /**
   * Returns the value of the '<em><b>Flow</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Flow</em>' reference.
   * @see #setFlow(NamedElement)
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSMFDeclassification_Flow()
   * @model
   * @generated
   */
  NamedElement getFlow();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getFlow <em>Flow</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Flow</em>' reference.
   * @see #getFlow()
   * @generated
   */
  void setFlow(NamedElement value);

  /**
   * Returns the value of the '<em><b>Src Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src Name</em>' reference.
   * @see #setSrcName(SMFTypeRef)
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSMFDeclassification_SrcName()
   * @model
   * @generated
   */
  SMFTypeRef getSrcName();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getSrcName <em>Src Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src Name</em>' reference.
   * @see #getSrcName()
   * @generated
   */
  void setSrcName(SMFTypeRef value);

  /**
   * Returns the value of the '<em><b>Any</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any</em>' attribute.
   * @see #setAny(boolean)
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSMFDeclassification_Any()
   * @model
   * @generated
   */
  boolean isAny();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#isAny <em>Any</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any</em>' attribute.
   * @see #isAny()
   * @generated
   */
  void setAny(boolean value);

  /**
   * Returns the value of the '<em><b>Snk Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Snk Name</em>' reference.
   * @see #setSnkName(SMFTypeRef)
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSMFDeclassification_SnkName()
   * @model
   * @generated
   */
  SMFTypeRef getSnkName();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification#getSnkName <em>Snk Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Snk Name</em>' reference.
   * @see #getSnkName()
   * @generated
   */
  void setSnkName(SMFTypeRef value);

} // SMFDeclassification
