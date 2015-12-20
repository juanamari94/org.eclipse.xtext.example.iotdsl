/**
 */
package org.xtext.example.mydsl.iotdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.Device#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.Device#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.Device#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.Device#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.Device#getEvents <em>Events</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.Device#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getDevice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iotdsl.Device#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Device)
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getDevice_SuperType()
   * @model
   * @generated
   */
  Device getSuperType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iotdsl.Device#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Device value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(Attribute)
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getDevice_Attributes()
   * @model containment="true"
   * @generated
   */
  Attribute getAttributes();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iotdsl.Device#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(Attribute value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.iotdsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getDevice_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.iotdsl.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getDevice_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

  /**
   * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.iotdsl.Transition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transitions</em>' containment reference list.
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getDevice_Transitions()
   * @model containment="true"
   * @generated
   */
  EList<Transition> getTransitions();

} // Device
