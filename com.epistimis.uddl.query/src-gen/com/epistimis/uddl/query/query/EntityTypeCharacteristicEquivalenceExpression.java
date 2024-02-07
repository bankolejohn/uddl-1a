/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type Characteristic Equivalence Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.EntityTypeCharacteristicEquivalenceExpression#getSecr <em>Secr</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.EntityTypeCharacteristicEquivalenceExpression#getSelectedEntity <em>Selected Entity</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getEntityTypeCharacteristicEquivalenceExpression()
 * @model
 * @generated
 */
public interface EntityTypeCharacteristicEquivalenceExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Secr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Secr</em>' containment reference.
   * @see #setSecr(SelectedEntityCharacteristicReference)
   * @see com.epistimis.uddl.query.query.QueryPackage#getEntityTypeCharacteristicEquivalenceExpression_Secr()
   * @model containment="true"
   * @generated
   */
  SelectedEntityCharacteristicReference getSecr();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.EntityTypeCharacteristicEquivalenceExpression#getSecr <em>Secr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Secr</em>' containment reference.
   * @see #getSecr()
   * @generated
   */
  void setSecr(SelectedEntityCharacteristicReference value);

  /**
   * Returns the value of the '<em><b>Selected Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selected Entity</em>' containment reference.
   * @see #setSelectedEntity(SelectedEntityReference)
   * @see com.epistimis.uddl.query.query.QueryPackage#getEntityTypeCharacteristicEquivalenceExpression_SelectedEntity()
   * @model containment="true"
   * @generated
   */
  SelectedEntityReference getSelectedEntity();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.EntityTypeCharacteristicEquivalenceExpression#getSelectedEntity <em>Selected Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Selected Entity</em>' containment reference.
   * @see #getSelectedEntity()
   * @generated
   */
  void setSelectedEntity(SelectedEntityReference value);

} // EntityTypeCharacteristicEquivalenceExpression