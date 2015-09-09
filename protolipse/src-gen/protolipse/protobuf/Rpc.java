/**
 */
package protolipse.protobuf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rpc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.Rpc#getName <em>Name</em>}</li>
 *   <li>{@link protolipse.protobuf.Rpc#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link protolipse.protobuf.Rpc#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link protolipse.protobuf.Rpc#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getRpc()
 * @model
 * @generated
 */
public interface Rpc extends ServiceElement
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
   * @see protolipse.protobuf.ProtobufPackage#getRpc_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Rpc#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Arg Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg Type</em>' containment reference.
   * @see #setArgType(MessageLink)
   * @see protolipse.protobuf.ProtobufPackage#getRpc_ArgType()
   * @model containment="true"
   * @generated
   */
  MessageLink getArgType();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Rpc#getArgType <em>Arg Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg Type</em>' containment reference.
   * @see #getArgType()
   * @generated
   */
  void setArgType(MessageLink value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(MessageLink)
   * @see protolipse.protobuf.ProtobufPackage#getRpc_ReturnType()
   * @model containment="true"
   * @generated
   */
  MessageLink getReturnType();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Rpc#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(MessageLink value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link protolipse.protobuf.Option}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see protolipse.protobuf.ProtobufPackage#getRpc_Options()
   * @model containment="true"
   * @generated
   */
  EList<Option> getOptions();

} // Rpc
