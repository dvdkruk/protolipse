/**
 */
package protolipse.protobuf.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import protolipse.protobuf.BooleanLink;
import protolipse.protobuf.ComplexType;
import protolipse.protobuf.ComplexTypeLink;
import protolipse.protobuf.CustomOption;
import protolipse.protobuf.DefaultValueFieldOption;
import protolipse.protobuf.DoubleLink;
import protolipse.protobuf.EnumElement;
import protolipse.protobuf.EnumField;
import protolipse.protobuf.EnumLink;
import protolipse.protobuf.Extend;
import protolipse.protobuf.ExtensibleType;
import protolipse.protobuf.ExtensionRange;
import protolipse.protobuf.FieldOption;
import protolipse.protobuf.FieldOptions;
import protolipse.protobuf.Group;
import protolipse.protobuf.Import;
import protolipse.protobuf.IndexedElement;
import protolipse.protobuf.IntLink;
import protolipse.protobuf.Message;
import protolipse.protobuf.MessageElement;
import protolipse.protobuf.MessageField;
import protolipse.protobuf.MessageLink;
import protolipse.protobuf.NativeFieldOption;
import protolipse.protobuf.NativeOption;
import protolipse.protobuf.NumberLink;
import protolipse.protobuf.Option;
import protolipse.protobuf.OptionSource;
import protolipse.protobuf.Proto;
import protolipse.protobuf.ProtobufPackage;
import protolipse.protobuf.PublicImport;
import protolipse.protobuf.Range;
import protolipse.protobuf.Rpc;
import protolipse.protobuf.ScalarTypeLink;
import protolipse.protobuf.Service;
import protolipse.protobuf.ServiceElement;
import protolipse.protobuf.SimpleValueLink;
import protolipse.protobuf.Statement;
import protolipse.protobuf.StringLink;
import protolipse.protobuf.Syntax;
import protolipse.protobuf.TypeLink;
import protolipse.protobuf.Value;
import protolipse.protobuf.WeakImport;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see protolipse.protobuf.ProtobufPackage
 * @generated
 */
public class ProtobufSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ProtobufPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProtobufSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ProtobufPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ProtobufPackage.PROTO:
      {
        Proto proto = (Proto)theEObject;
        T result = caseProto(proto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.SYNTAX:
      {
        Syntax syntax = (Syntax)theEObject;
        T result = caseSyntax(syntax);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.PACKAGE:
      {
        protolipse.protobuf.Package package_ = (protolipse.protobuf.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = caseStatement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseStatement(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.PUBLIC_IMPORT:
      {
        PublicImport publicImport = (PublicImport)theEObject;
        T result = casePublicImport(publicImport);
        if (result == null) result = caseImport(publicImport);
        if (result == null) result = caseStatement(publicImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.WEAK_IMPORT:
      {
        WeakImport weakImport = (WeakImport)theEObject;
        T result = caseWeakImport(weakImport);
        if (result == null) result = caseImport(weakImport);
        if (result == null) result = caseStatement(weakImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.OPTION:
      {
        Option option = (Option)theEObject;
        T result = caseOption(option);
        if (result == null) result = caseStatement(option);
        if (result == null) result = caseMessageElement(option);
        if (result == null) result = caseServiceElement(option);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.NATIVE_OPTION:
      {
        NativeOption nativeOption = (NativeOption)theEObject;
        T result = caseNativeOption(nativeOption);
        if (result == null) result = caseOption(nativeOption);
        if (result == null) result = caseStatement(nativeOption);
        if (result == null) result = caseMessageElement(nativeOption);
        if (result == null) result = caseServiceElement(nativeOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.CUSTOM_OPTION:
      {
        CustomOption customOption = (CustomOption)theEObject;
        T result = caseCustomOption(customOption);
        if (result == null) result = caseOption(customOption);
        if (result == null) result = caseEnumElement(customOption);
        if (result == null) result = caseStatement(customOption);
        if (result == null) result = caseMessageElement(customOption);
        if (result == null) result = caseServiceElement(customOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.SIMPLE_VALUE_LINK:
      {
        SimpleValueLink simpleValueLink = (SimpleValueLink)theEObject;
        T result = caseSimpleValueLink(simpleValueLink);
        if (result == null) result = caseValue(simpleValueLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.ENUM_LINK:
      {
        EnumLink enumLink = (EnumLink)theEObject;
        T result = caseEnumLink(enumLink);
        if (result == null) result = caseSimpleValueLink(enumLink);
        if (result == null) result = caseValue(enumLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.STRING_LINK:
      {
        StringLink stringLink = (StringLink)theEObject;
        T result = caseStringLink(stringLink);
        if (result == null) result = caseSimpleValueLink(stringLink);
        if (result == null) result = caseValue(stringLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.BOOLEAN_LINK:
      {
        BooleanLink booleanLink = (BooleanLink)theEObject;
        T result = caseBooleanLink(booleanLink);
        if (result == null) result = caseSimpleValueLink(booleanLink);
        if (result == null) result = caseValue(booleanLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.NUMBER_LINK:
      {
        NumberLink numberLink = (NumberLink)theEObject;
        T result = caseNumberLink(numberLink);
        if (result == null) result = caseSimpleValueLink(numberLink);
        if (result == null) result = caseValue(numberLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.INT_LINK:
      {
        IntLink intLink = (IntLink)theEObject;
        T result = caseIntLink(intLink);
        if (result == null) result = caseNumberLink(intLink);
        if (result == null) result = caseSimpleValueLink(intLink);
        if (result == null) result = caseValue(intLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.DOUBLE_LINK:
      {
        DoubleLink doubleLink = (DoubleLink)theEObject;
        T result = caseDoubleLink(doubleLink);
        if (result == null) result = caseNumberLink(doubleLink);
        if (result == null) result = caseSimpleValueLink(doubleLink);
        if (result == null) result = caseValue(doubleLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.COMPLEX_TYPE:
      {
        ComplexType complexType = (ComplexType)theEObject;
        T result = caseComplexType(complexType);
        if (result == null) result = caseStatement(complexType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.EXTENSIBLE_TYPE:
      {
        ExtensibleType extensibleType = (ExtensibleType)theEObject;
        T result = caseExtensibleType(extensibleType);
        if (result == null) result = caseComplexType(extensibleType);
        if (result == null) result = caseStatement(extensibleType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = caseExtensibleType(message);
        if (result == null) result = caseMessageElement(message);
        if (result == null) result = caseComplexType(message);
        if (result == null) result = caseStatement(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.MESSAGE_ELEMENT:
      {
        MessageElement messageElement = (MessageElement)theEObject;
        T result = caseMessageElement(messageElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.INDEXED_ELEMENT:
      {
        IndexedElement indexedElement = (IndexedElement)theEObject;
        T result = caseIndexedElement(indexedElement);
        if (result == null) result = caseMessageElement(indexedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.EXTENSION_RANGE:
      {
        ExtensionRange extensionRange = (ExtensionRange)theEObject;
        T result = caseExtensionRange(extensionRange);
        if (result == null) result = caseMessageElement(extensionRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.MESSAGE_FIELD:
      {
        MessageField messageField = (MessageField)theEObject;
        T result = caseMessageField(messageField);
        if (result == null) result = caseIndexedElement(messageField);
        if (result == null) result = caseMessageElement(messageField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = caseExtensibleType(group);
        if (result == null) result = caseIndexedElement(group);
        if (result == null) result = caseComplexType(group);
        if (result == null) result = caseMessageElement(group);
        if (result == null) result = caseStatement(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.TYPE_LINK:
      {
        TypeLink typeLink = (TypeLink)theEObject;
        T result = caseTypeLink(typeLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.COMPLEX_TYPE_LINK:
      {
        ComplexTypeLink complexTypeLink = (ComplexTypeLink)theEObject;
        T result = caseComplexTypeLink(complexTypeLink);
        if (result == null) result = caseTypeLink(complexTypeLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.SCALAR_TYPE_LINK:
      {
        ScalarTypeLink scalarTypeLink = (ScalarTypeLink)theEObject;
        T result = caseScalarTypeLink(scalarTypeLink);
        if (result == null) result = caseTypeLink(scalarTypeLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.FIELD_OPTIONS:
      {
        FieldOptions fieldOptions = (FieldOptions)theEObject;
        T result = caseFieldOptions(fieldOptions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.FIELD_OPTION:
      {
        FieldOption fieldOption = (FieldOption)theEObject;
        T result = caseFieldOption(fieldOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.DEFAULT_VALUE_FIELD_OPTION:
      {
        DefaultValueFieldOption defaultValueFieldOption = (DefaultValueFieldOption)theEObject;
        T result = caseDefaultValueFieldOption(defaultValueFieldOption);
        if (result == null) result = caseFieldOption(defaultValueFieldOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.NATIVE_FIELD_OPTION:
      {
        NativeFieldOption nativeFieldOption = (NativeFieldOption)theEObject;
        T result = caseNativeFieldOption(nativeFieldOption);
        if (result == null) result = caseFieldOption(nativeFieldOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.OPTION_SOURCE:
      {
        OptionSource optionSource = (OptionSource)theEObject;
        T result = caseOptionSource(optionSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.ENUM:
      {
        protolipse.protobuf.Enum enum_ = (protolipse.protobuf.Enum)theEObject;
        T result = caseEnum(enum_);
        if (result == null) result = caseComplexType(enum_);
        if (result == null) result = caseMessageElement(enum_);
        if (result == null) result = caseStatement(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.ENUM_ELEMENT:
      {
        EnumElement enumElement = (EnumElement)theEObject;
        T result = caseEnumElement(enumElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.ENUM_FIELD:
      {
        EnumField enumField = (EnumField)theEObject;
        T result = caseEnumField(enumField);
        if (result == null) result = caseEnumElement(enumField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = caseStatement(service);
        if (result == null) result = caseMessageElement(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.SERVICE_ELEMENT:
      {
        ServiceElement serviceElement = (ServiceElement)theEObject;
        T result = caseServiceElement(serviceElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.RPC:
      {
        Rpc rpc = (Rpc)theEObject;
        T result = caseRpc(rpc);
        if (result == null) result = caseServiceElement(rpc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.MESSAGE_LINK:
      {
        MessageLink messageLink = (MessageLink)theEObject;
        T result = caseMessageLink(messageLink);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ProtobufPackage.EXTEND:
      {
        Extend extend = (Extend)theEObject;
        T result = caseExtend(extend);
        if (result == null) result = caseStatement(extend);
        if (result == null) result = caseMessageElement(extend);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Proto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Proto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProto(Proto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Syntax</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Syntax</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSyntax(Syntax object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(protolipse.protobuf.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Public Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Public Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePublicImport(PublicImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weak Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weak Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeakImport(WeakImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOption(Option object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Native Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Native Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNativeOption(NativeOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustomOption(CustomOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Value Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Value Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleValueLink(SimpleValueLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumLink(EnumLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLink(StringLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLink(BooleanLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLink(NumberLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntLink(IntLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleLink(DoubleLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexType(ComplexType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extensible Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extensible Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensibleType(ExtensibleType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageElement(MessageElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indexed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indexed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexedElement(IndexedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensionRange(ExtensionRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageField(MessageField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeLink(TypeLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Type Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Type Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexTypeLink(ComplexTypeLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scalar Type Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scalar Type Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScalarTypeLink(ScalarTypeLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Options</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Options</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldOptions(FieldOptions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldOption(FieldOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Value Field Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Value Field Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultValueFieldOption(DefaultValueFieldOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Native Field Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Native Field Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNativeFieldOption(NativeFieldOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Option Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Option Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptionSource(OptionSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum(protolipse.protobuf.Enum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumElement(EnumElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumField(EnumField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceElement(ServiceElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rpc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rpc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRpc(Rpc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessageLink(MessageLink object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extend</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extend</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtend(Extend object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ProtobufSwitch
