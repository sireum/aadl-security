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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.AnnexSubclause;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sec Model Subclause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.sireum.aadl.osate.securitymodel.secMF.SecModelSubclause#getDeclassification <em>Declassification</em>}</li>
 * </ul>
 *
 * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSecModelSubclause()
 * @model
 * @generated
 */
public interface SecModelSubclause extends EObject, AnnexSubclause
{
  /**
   * Returns the value of the '<em><b>Classification</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.osate.securitymodel.secMF.SMFClassification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classification</em>' containment reference list.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSecModelSubclause_Classification()
   * @model containment="true"
   * @generated
   */
  EList<SMFClassification> getClassification();

  /**
   * Returns the value of the '<em><b>Declassification</b></em>' containment reference list.
   * The list contents are of type {@link org.sireum.aadl.osate.securitymodel.secMF.SMFDeclassification}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declassification</em>' containment reference list.
   * @see org.sireum.aadl.osate.securitymodel.secMF.SecMFPackage#getSecModelSubclause_Declassification()
   * @model containment="true"
   * @generated
   */
  EList<SMFDeclassification> getDeclassification();

} // SecModelSubclause
