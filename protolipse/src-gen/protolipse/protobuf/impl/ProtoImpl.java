/**
 */
package protolipse.protobuf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import protolipse.protobuf.Proto;
import protolipse.protobuf.ProtobufPackage;
import protolipse.protobuf.Statement;
import protolipse.protobuf.Syntax;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proto</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.impl.ProtoImpl#getSyntax <em>Syntax</em>}</li>
 *   <li>{@link protolipse.protobuf.impl.ProtoImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtoImpl extends MinimalEObjectImpl.Container implements Proto
{
  /**
   * The cached value of the '{@link #getSyntax() <em>Syntax</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSyntax()
   * @generated
   * @ordered
   */
  protected Syntax syntax;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProtoImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ProtobufPackage.Literals.PROTO;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Syntax getSyntax()
  {
    return syntax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSyntax(Syntax newSyntax, NotificationChain msgs)
  {
    Syntax oldSyntax = syntax;
    syntax = newSyntax;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtobufPackage.PROTO__SYNTAX, oldSyntax, newSyntax);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSyntax(Syntax newSyntax)
  {
    if (newSyntax != syntax)
    {
      NotificationChain msgs = null;
      if (syntax != null)
        msgs = ((InternalEObject)syntax).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.PROTO__SYNTAX, null, msgs);
      if (newSyntax != null)
        msgs = ((InternalEObject)newSyntax).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.PROTO__SYNTAX, null, msgs);
      msgs = basicSetSyntax(newSyntax, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtobufPackage.PROTO__SYNTAX, newSyntax, newSyntax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, ProtobufPackage.PROTO__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ProtobufPackage.PROTO__SYNTAX:
        return basicSetSyntax(null, msgs);
      case ProtobufPackage.PROTO__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ProtobufPackage.PROTO__SYNTAX:
        return getSyntax();
      case ProtobufPackage.PROTO__STATEMENTS:
        return getStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ProtobufPackage.PROTO__SYNTAX:
        setSyntax((Syntax)newValue);
        return;
      case ProtobufPackage.PROTO__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ProtobufPackage.PROTO__SYNTAX:
        setSyntax((Syntax)null);
        return;
      case ProtobufPackage.PROTO__STATEMENTS:
        getStatements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ProtobufPackage.PROTO__SYNTAX:
        return syntax != null;
      case ProtobufPackage.PROTO__STATEMENTS:
        return statements != null && !statements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProtoImpl
