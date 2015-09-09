/**
 */
package protolipse.protobuf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.IndexedElement#getModifier <em>Modifier</em>}</li>
 *   <li>{@link protolipse.protobuf.IndexedElement#getName <em>Name</em>}</li>
 *   <li>{@link protolipse.protobuf.IndexedElement#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getIndexedElement()
 * @model
 * @generated
 */
public interface IndexedElement extends MessageElement
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' attribute.
   * The literals are from the enumeration {@link protolipse.protobuf.Modifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' attribute.
   * @see protolipse.protobuf.Modifier
   * @see #setModifier(Modifier)
   * @see protolipse.protobuf.ProtobufPackage#getIndexedElement_Modifier()
   * @model
   * @generated
   */
  Modifier getModifier();

  /**
   * Sets the value of the '{@link protolipse.protobuf.IndexedElement#getModifier <em>Modifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' attribute.
   * @see protolipse.protobuf.Modifier
   * @see #getModifier()
   * @generated
   */
  void setModifier(Modifier value);

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
   * @see protolipse.protobuf.ProtobufPackage#getIndexedElement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link protolipse.protobuf.IndexedElement#getName <em>Name</em>}' attribute.
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
   * @see protolipse.protobuf.ProtobufPackage#getIndexedElement_Index()
   * @model
   * @generated
   */
  int getIndex();

  /**
   * Sets the value of the '{@link protolipse.protobuf.IndexedElement#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(int value);

} // IndexedElement
