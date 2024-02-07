/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic Basis Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.CharacteristicBasisSet#getCharacteristicBasis <em>Characteristic Basis</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getCharacteristicBasisSet()
 * @model
 * @generated
 */
public interface CharacteristicBasisSet extends LogicalSet
{
  /**
   * Returns the value of the '<em><b>Characteristic Basis</b></em>' containment reference list.
   * The list contents are of type {@link com.epistimis.uddl.query.query.CharacteristicBasis}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Characteristic Basis</em>' containment reference list.
   * @see com.epistimis.uddl.query.query.QueryPackage#getCharacteristicBasisSet_CharacteristicBasis()
   * @model containment="true"
   * @generated
   */
  EList<CharacteristicBasis> getCharacteristicBasis();

} // CharacteristicBasisSet