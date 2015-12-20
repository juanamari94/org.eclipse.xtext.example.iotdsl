/**
 */
package org.xtext.example.mydsl.iotdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.IfStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.IfStatement#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.iotdsl.IfStatement#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Expression
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getIfStatement_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iotdsl.IfStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Block</em>' containment reference.
   * @see #setThenBlock(IfBlock)
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getIfStatement_ThenBlock()
   * @model containment="true"
   * @generated
   */
  IfBlock getThenBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iotdsl.IfStatement#getThenBlock <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Block</em>' containment reference.
   * @see #getThenBlock()
   * @generated
   */
  void setThenBlock(IfBlock value);

  /**
   * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Block</em>' containment reference.
   * @see #setElseBlock(IfBlock)
   * @see org.xtext.example.mydsl.iotdsl.IotdslPackage#getIfStatement_ElseBlock()
   * @model containment="true"
   * @generated
   */
  IfBlock getElseBlock();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.iotdsl.IfStatement#getElseBlock <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Block</em>' containment reference.
   * @see #getElseBlock()
   * @generated
   */
  void setElseBlock(IfBlock value);

} // IfStatement
