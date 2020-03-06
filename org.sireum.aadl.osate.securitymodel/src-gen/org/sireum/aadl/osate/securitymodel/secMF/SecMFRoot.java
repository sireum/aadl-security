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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot#getSubclauses <em>Subclauses</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSecMFRoot()
 * @model
 * @generated
 */
public interface SecMFRoot extends EObject, NamedElement
{
  /**
   * Returns the value of the '<em><b>Library</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Library</em>' containment reference.
   * @see #setLibrary(SecModelLibrary)
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSecMFRoot_Library()
   * @model containment="true"
   * @generated
   */
  SecModelLibrary getLibrary();

  /**
   * Sets the value of the '{@link org.sireum.aadl.osate.securitymodel.secMF.SecMFRoot#getLibrary <em>Library</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Library</em>' containment reference.
   * @see #getLibrary()
   * @generated
   */
  void setLibrary(SecModelLibrary value);

  /**
   * Returns the value of the '<em><b>Subclauses</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subclauses</em>' containment reference list.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSecMFRoot_Subclauses()
   * @model containment="true"
   * @generated
   */
  EList<SecModelSubclause> getSubclauses();

} // SecMFRoot
