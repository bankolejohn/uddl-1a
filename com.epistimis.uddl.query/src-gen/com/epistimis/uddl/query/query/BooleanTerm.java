/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.BooleanTerm#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getBooleanTerm()
 * @model
 * @generated
 */
public interface BooleanTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>Factor</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.query.query.BooleanFactor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Factor</em>' containment reference list.
   * @see com.epistimis.uddl.query.query.QueryPackage#getBooleanTerm_Factor()
   * @model containment="true"
   * @generated
   */
  EList<BooleanFactor> getFactor();

} // BooleanTerm