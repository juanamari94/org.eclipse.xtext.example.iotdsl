/**
 */
package org.xtext.example.mydsl.iotdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.VariableRef#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getVariableRef()
 * @model
 * @generated
 */
public interface VariableRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Variable)
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getVariableRef_Variable()
   * @model
   * @generated
   */
  Variable getVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iotdsl.VariableRef#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Variable value);

} // VariableRef
