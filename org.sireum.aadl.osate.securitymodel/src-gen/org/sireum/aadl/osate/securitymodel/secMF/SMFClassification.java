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
 * A representation of the model object '<em><b>SMF Classification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SMFClassification#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SMFClassification#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSMFClassification()
 * @model
 * @generated
 */
public interface SMFClassification extends EObject, NamedElement
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(NamedElement)
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSMFClassification_Feature()
   * @model
   * @generated
   */
  NamedElement getFeature();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFClassification#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(NamedElement value);

  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' reference.
   * @see #setTypeRef(SMFTypeRef)
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSMFClassification_TypeRef()
   * @model
   * @generated
   */
  SMFTypeRef getTypeRef();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.securitymodel.secMF.SMFClassification#getTypeRef <em>Type Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(SMFTypeRef value);

} // SMFClassification
