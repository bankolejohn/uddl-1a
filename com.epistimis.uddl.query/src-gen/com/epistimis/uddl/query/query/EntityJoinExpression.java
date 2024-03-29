/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Join Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.EntityJoinExpression#getJoinEntity <em>Join Entity</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.EntityJoinExpression#getEntityJoinCriteria <em>Entity Join Criteria</em>}</li>
 * </ul>
 *
 * @see com.epistimis.uddl.query.query.QueryPackage#getEntityJoinExpression()
 * @model
 * @generated
 */
public interface EntityJoinExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Join Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Entity</em>' containment reference.
   * @see #setJoinEntity(JoinEntity)
   * @see com.epistimis.uddl.query.query.QueryPackage#getEntityJoinExpression_JoinEntity()
   * @model containment="true"
   * @generated
   */
  JoinEntity getJoinEntity();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.EntityJoinExpression#getJoinEntity <em>Join Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Join Entity</em>' containment reference.
   * @see #getJoinEntity()
   * @generated
   */
  void setJoinEntity(JoinEntity value);

  /**
   * Returns the value of the '<em><b>Entity Join Criteria</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Join Criteria</em>' containment reference.
   * @see #setEntityJoinCriteria(EntityJoinCriteria)
   * @see com.epistimis.uddl.query.query.QueryPackage#getEntityJoinExpression_EntityJoinCriteria()
   * @model containment="true"
   * @generated
   */
  EntityJoinCriteria getEntityJoinCriteria();

  /**
   * Sets the value of the '{@link com.epistimis.uddl.query.query.EntityJoinExpression#getEntityJoinCriteria <em>Entity Join Criteria</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity Join Criteria</em>' containment reference.
   * @see #getEntityJoinCriteria()
   * @generated
   */
  void setEntityJoinCriteria(EntityJoinCriteria value);

} // EntityJoinExpression
