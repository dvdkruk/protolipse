/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.CustomOption#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getCustomOption()
 * @model
 * @generated
 */
public interface CustomOption extends Option, EnumElement
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' attribute.
   * @see #setSource(String)
   * @see protolipse.protobuf.ProtobufPackage#getCustomOption_Source()
   * @model
   * @generated
   */
  String getSource();

  /**
   * Sets the value of the '{@link protolipse.protobuf.CustomOption#getSource <em>Source</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' attribute.
   * @see #getSource()
   * @generated
   */
  void setSource(String value);

} // CustomOption
