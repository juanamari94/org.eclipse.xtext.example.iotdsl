/**
 */
package org.xtext.example.mydsl.iotdsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.iotdsl.Attribute;
import org.xtext.example.mydsl.iotdsl.Device;
import org.xtext.example.mydsl.iotdsl.Event;
import org.xtext.example.mydsl.iotdsl.IotdslPackage;
import org.xtext.example.mydsl.iotdsl.State;
import org.xtext.example.mydsl.iotdsl.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.impl.DeviceImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.impl.DeviceImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.impl.DeviceImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.impl.DeviceImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.impl.DeviceImpl#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected Device superType;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected Attribute attributes;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvents()
   * @generated
   * @ordered
   */
  protected EList<Event> events;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeviceImpl()
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
    return IotdslPackage.Literals.DEVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.DEVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (Device)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, IotdslPackage.DEVICE__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Device basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(Device newSuperType)
  {
    Device oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.DEVICE__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttributes()
  {
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributes(Attribute newAttributes, NotificationChain msgs)
  {
    Attribute oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IotdslPackage.DEVICE__ATTRIBUTES, oldAttributes, newAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributes(Attribute newAttributes)
  {
    if (newAttributes != attributes)
    {
      NotificationChain msgs = null;
      if (attributes != null)
        msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.DEVICE__ATTRIBUTES, null, msgs);
      if (newAttributes != null)
        msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IotdslPackage.DEVICE__ATTRIBUTES, null, msgs);
      msgs = basicSetAttributes(newAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IotdslPackage.DEVICE__ATTRIBUTES, newAttributes, newAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, IotdslPackage.DEVICE__STATES);
    }
    return states;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvents()
  {
    if (events == null)
    {
      events = new EObjectContainmentEList<Event>(Event.class, this, IotdslPackage.DEVICE__EVENTS);
    }
    return events;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, IotdslPackage.DEVICE__TRANSITIONS);
    }
    return transitions;
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
      case IotdslPackage.DEVICE__ATTRIBUTES:
        return basicSetAttributes(null, msgs);
      case IotdslPackage.DEVICE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
      case IotdslPackage.DEVICE__EVENTS:
        return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
      case IotdslPackage.DEVICE__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
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
      case IotdslPackage.DEVICE__NAME:
        return getName();
      case IotdslPackage.DEVICE__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case IotdslPackage.DEVICE__ATTRIBUTES:
        return getAttributes();
      case IotdslPackage.DEVICE__STATES:
        return getStates();
      case IotdslPackage.DEVICE__EVENTS:
        return getEvents();
      case IotdslPackage.DEVICE__TRANSITIONS:
        return getTransitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IotdslPackage.DEVICE__NAME:
        setName((String)newValue);
        return;
      case IotdslPackage.DEVICE__SUPER_TYPE:
        setSuperType((Device)newValue);
        return;
      case IotdslPackage.DEVICE__ATTRIBUTES:
        setAttributes((Attribute)newValue);
        return;
      case IotdslPackage.DEVICE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
        return;
      case IotdslPackage.DEVICE__EVENTS:
        getEvents().clear();
        getEvents().addAll((Collection<? extends Event>)newValue);
        return;
      case IotdslPackage.DEVICE__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
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
      case IotdslPackage.DEVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case IotdslPackage.DEVICE__SUPER_TYPE:
        setSuperType((Device)null);
        return;
      case IotdslPackage.DEVICE__ATTRIBUTES:
        setAttributes((Attribute)null);
        return;
      case IotdslPackage.DEVICE__STATES:
        getStates().clear();
        return;
      case IotdslPackage.DEVICE__EVENTS:
        getEvents().clear();
        return;
      case IotdslPackage.DEVICE__TRANSITIONS:
        getTransitions().clear();
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
      case IotdslPackage.DEVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case IotdslPackage.DEVICE__SUPER_TYPE:
        return superType != null;
      case IotdslPackage.DEVICE__ATTRIBUTES:
        return attributes != null;
      case IotdslPackage.DEVICE__STATES:
        return states != null && !states.isEmpty();
      case IotdslPackage.DEVICE__EVENTS:
        return events != null && !events.isEmpty();
      case IotdslPackage.DEVICE__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //DeviceImpl
