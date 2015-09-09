/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Type Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.ScalarTypeLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getScalarTypeLink()
 * @model
 * @generated
 */
public interface ScalarTypeLink extends TypeLink
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * The literals are from the enumeration {@link protolipse.protobuf.ScalarType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see protolipse.protobuf.ScalarType
   * @see #setTarget(ScalarType)
   * @see protolipse.protobuf.ProtobufPackage#getScalarTypeLink_Target()
   * @model
   * @generated
   */
  ScalarType getTarget();

  /**
   * Sets the value of the '{@link protolipse.protobuf.ScalarTypeLink#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see protolipse.protobuf.ScalarType
   * @see #getTarget()
   * @generated
   */
  void setTarget(ScalarType value);

} // ScalarTypeLink
