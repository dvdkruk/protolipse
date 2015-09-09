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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import protolipse.protobuf.MessageLink;
import protolipse.protobuf.Option;
import protolipse.protobuf.ProtobufPackage;
import protolipse.protobuf.Rpc;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rpc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link protolipse.protobuf.impl.RpcImpl#getName <em>Name</em>}</li>
 *   <li>{@link protolipse.protobuf.impl.RpcImpl#getArgType <em>Arg Type</em>}</li>
 *   <li>{@link protolipse.protobuf.impl.RpcImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link protolipse.protobuf.impl.RpcImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RpcImpl extends ServiceElementImpl implements Rpc
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArgType() <em>Arg Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgType()
   * @generated
   * @ordered
   */
  protected MessageLink argType;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected MessageLink returnType;

  /**
   * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptions()
   * @generated
   * @ordered
   */
  protected EList<Option> options;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RpcImpl()
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
    return ProtobufPackage.Literals.RPC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtobufPackage.RPC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageLink getArgType()
  {
    return argType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgType(MessageLink newArgType, NotificationChain msgs)
  {
    MessageLink oldArgType = argType;
    argType = newArgType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtobufPackage.RPC__ARG_TYPE, oldArgType, newArgType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgType(MessageLink newArgType)
  {
    if (newArgType != argType)
    {
      NotificationChain msgs = null;
      if (argType != null)
        msgs = ((InternalEObject)argType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.RPC__ARG_TYPE, null, msgs);
      if (newArgType != null)
        msgs = ((InternalEObject)newArgType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.RPC__ARG_TYPE, null, msgs);
      msgs = basicSetArgType(newArgType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtobufPackage.RPC__ARG_TYPE, newArgType, newArgType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MessageLink getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(MessageLink newReturnType, NotificationChain msgs)
  {
    MessageLink oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProtobufPackage.RPC__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(MessageLink newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.RPC__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProtobufPackage.RPC__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ProtobufPackage.RPC__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Option> getOptions()
  {
    if (options == null)
    {
      options = new EObjectContainmentEList<Option>(Option.class, this, ProtobufPackage.RPC__OPTIONS);
    }
    return options;
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
      case ProtobufPackage.RPC__ARG_TYPE:
        return basicSetArgType(null, msgs);
      case ProtobufPackage.RPC__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case ProtobufPackage.RPC__OPTIONS:
        return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
      case ProtobufPackage.RPC__NAME:
        return getName();
      case ProtobufPackage.RPC__ARG_TYPE:
        return getArgType();
      case ProtobufPackage.RPC__RETURN_TYPE:
        return getReturnType();
      case ProtobufPackage.RPC__OPTIONS:
        return getOptions();
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
      case ProtobufPackage.RPC__NAME:
        setName((String)newValue);
        return;
      case ProtobufPackage.RPC__ARG_TYPE:
        setArgType((MessageLink)newValue);
        return;
      case ProtobufPackage.RPC__RETURN_TYPE:
        setReturnType((MessageLink)newValue);
        return;
      case ProtobufPackage.RPC__OPTIONS:
        getOptions().clear();
        getOptions().addAll((Collection<? extends Option>)newValue);
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
      case ProtobufPackage.RPC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ProtobufPackage.RPC__ARG_TYPE:
        setArgType((MessageLink)null);
        return;
      case ProtobufPackage.RPC__RETURN_TYPE:
        setReturnType((MessageLink)null);
        return;
      case ProtobufPackage.RPC__OPTIONS:
        getOptions().clear();
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
      case ProtobufPackage.RPC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ProtobufPackage.RPC__ARG_TYPE:
        return argType != null;
      case ProtobufPackage.RPC__RETURN_TYPE:
        return returnType != null;
      case ProtobufPackage.RPC__OPTIONS:
        return options != null && !options.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RpcImpl
