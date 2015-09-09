/**
 */
package protolipse.protobuf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.EnumField#getName <em>Name</em>}</li>
 *   <li>{@link protolipse.protobuf.EnumField#getIndex <em>Index</em>}</li>
 *   <li>{@link protolipse.protobuf.EnumField#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getEnumField()
 * @model
 * @generated
 */
public interface EnumField extends EnumElement
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
   * @see protolipse.protobuf.ProtobufPackage#getEnumField_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link protolipse.protobuf.EnumField#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(int)
   * @see protolipse.protobuf.ProtobufPackage#getEnumField_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link protolipse.protobuf.EnumField#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link protolipse.protobuf.FieldOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see protolipse.protobuf.ProtobufPackage#getEnumField_Options()
   * @model containment="true"
   * @generated
   */
  EList<FieldOption> getOptions();

} // EnumField
