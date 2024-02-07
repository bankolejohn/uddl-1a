/**
 * generated by Xtext 2.33.0
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.query.impl;

import com.epistimis.uddl.query.query.CharacteristicReference;
import com.epistimis.uddl.query.query.QualifiedProjectedCharacteristicReference;
import com.epistimis.uddl.query.query.QueryPackage;
import com.epistimis.uddl.query.query.SelectedEntityReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Projected Characteristic Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.epistimis.uddl.query.query.impl.QualifiedProjectedCharacteristicReferenceImpl#getSelectedEntityReference <em>Selected Entity Reference</em>}</li>
 *   <li>{@link com.epistimis.uddl.query.query.impl.QualifiedProjectedCharacteristicReferenceImpl#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualifiedProjectedCharacteristicReferenceImpl extends ProjectedCharacteristicReferenceImpl implements QualifiedProjectedCharacteristicReference
{
  /**
   * The cached value of the '{@link #getSelectedEntityReference() <em>Selected Entity Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSelectedEntityReference()
   * @generated
   * @ordered
   */
  protected SelectedEntityReference selectedEntityReference;

  /**
   * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacteristic()
   * @generated
   * @ordered
   */
  protected CharacteristicReference characteristic;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualifiedProjectedCharacteristicReferenceImpl()
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
    return QueryPackage.Literals.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SelectedEntityReference getSelectedEntityReference()
  {
    return selectedEntityReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSelectedEntityReference(SelectedEntityReference newSelectedEntityReference, NotificationChain msgs)
  {
    SelectedEntityReference oldSelectedEntityReference = selectedEntityReference;
    selectedEntityReference = newSelectedEntityReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE, oldSelectedEntityReference, newSelectedEntityReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSelectedEntityReference(SelectedEntityReference newSelectedEntityReference)
  {
    if (newSelectedEntityReference != selectedEntityReference)
    {
      NotificationChain msgs = null;
      if (selectedEntityReference != null)
        msgs = ((InternalEObject)selectedEntityReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE, null, msgs);
      if (newSelectedEntityReference != null)
        msgs = ((InternalEObject)newSelectedEntityReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE, null, msgs);
      msgs = basicSetSelectedEntityReference(newSelectedEntityReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE, newSelectedEntityReference, newSelectedEntityReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharacteristicReference getCharacteristic()
  {
    return characteristic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCharacteristic(CharacteristicReference newCharacteristic, NotificationChain msgs)
  {
    CharacteristicReference oldCharacteristic = characteristic;
    characteristic = newCharacteristic;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC, oldCharacteristic, newCharacteristic);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharacteristic(CharacteristicReference newCharacteristic)
  {
    if (newCharacteristic != characteristic)
    {
      NotificationChain msgs = null;
      if (characteristic != null)
        msgs = ((InternalEObject)characteristic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC, null, msgs);
      if (newCharacteristic != null)
        msgs = ((InternalEObject)newCharacteristic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC, null, msgs);
      msgs = basicSetCharacteristic(newCharacteristic, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC, newCharacteristic, newCharacteristic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE:
        return basicSetSelectedEntityReference(null, msgs);
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC:
        return basicSetCharacteristic(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE:
        return getSelectedEntityReference();
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC:
        return getCharacteristic();
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
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE:
        setSelectedEntityReference((SelectedEntityReference)newValue);
        return;
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC:
        setCharacteristic((CharacteristicReference)newValue);
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
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE:
        setSelectedEntityReference((SelectedEntityReference)null);
        return;
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC:
        setCharacteristic((CharacteristicReference)null);
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
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__SELECTED_ENTITY_REFERENCE:
        return selectedEntityReference != null;
      case QueryPackage.QUALIFIED_PROJECTED_CHARACTERISTIC_REFERENCE__CHARACTERISTIC:
        return characteristic != null;
    }
    return super.eIsSet(featureID);
  }

} //QualifiedProjectedCharacteristicReferenceImpl