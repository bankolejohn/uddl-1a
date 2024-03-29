/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exists Predicate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.ExistsPredicate#getSub <em>Sub</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getExistsPredicate()
 * @model
 * @generated
 */
public interface ExistsPredicate extends BooleanPredicate
{
  /**
   * Returns the value of the '<em><b>Sub</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub</em>' containment reference.
   * @see #setSub(Subquery)
   * @see com.epistimis.uddl.query.query.QueryPackage#getExistsPredicate_Sub()
   * @model containment="true"
   * @generated
   */
  Subquery getSub();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.ExistsPredicate#getSub <em>Sub</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sub</em>' containment reference.
   * @see #getSub()
   * @generated
   */
  void setSub(Subquery value);

} // ExistsPredicate
