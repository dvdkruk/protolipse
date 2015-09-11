/**
 */
package protolipse.protobuf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Oneof</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.Oneof#getName <em>Name</em>}</li>
 *   <li>{@link protolipse.protobuf.Oneof#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getOneof()
 * @model
 * @generated
 */
public interface Oneof extends MessageElement
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
   * @see protolipse.protobuf.ProtobufPackage#getOneof_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Oneof#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link protolipse.protobuf.OneofField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see protolipse.protobuf.ProtobufPackage#getOneof_Fields()
   * @model containment="true"
   * @generated
   */
  EList<OneofField> getFields();

} // Oneof
