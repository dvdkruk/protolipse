/**
 */
package protolipse.protobuf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proto</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.Proto#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link protolipse.protobuf.Proto#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see protolipse.protobuf.ProtobufPackage#getProto()
 * @model
 * @generated
 */
public interface Proto extends EObject
{
  /**
   * Returns the value of the '<em><b>Syntax</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Syntax</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Syntax</em>' containment reference.
   * @see #setSyntax(Syntax)
   * @see protolipse.protobuf.ProtobufPackage#getProto_Syntax()
   * @model containment="true"
   * @generated
   */
  Syntax getSyntax();

  /**
   * Sets the value of the '{@link protolipse.protobuf.Proto#getSyntax <em>Syntax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Syntax</em>' containment reference.
   * @see #getSyntax()
   * @generated
   */
  void setSyntax(Syntax value);

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link protolipse.protobuf.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see protolipse.protobuf.ProtobufPackage#getProto_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // Proto
