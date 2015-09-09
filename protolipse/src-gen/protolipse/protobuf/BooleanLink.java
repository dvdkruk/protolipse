/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.BooleanLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getBooleanLink()
 * @model
 * @generated
 */
public interface BooleanLink extends SimpleValueLink
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * The literals are from the enumeration {@link protolipse.protobuf.BOOL}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see protolipse.protobuf.BOOL
   * @see #setTarget(BOOL)
   * @see protolipse.protobuf.ProtobufPackage#getBooleanLink_Target()
   * @model
   * @generated
   */
  BOOL getTarget();

  /**
   * Sets the value of the '{@link protolipse.protobuf.BooleanLink#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see protolipse.protobuf.BOOL
   * @see #getTarget()
   * @generated
   */
  void setTarget(BOOL value);

} // BooleanLink
