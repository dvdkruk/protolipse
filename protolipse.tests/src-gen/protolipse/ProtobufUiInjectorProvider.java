/*
 * generated by Xtext
 */
package protolipse;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class ProtobufUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return protolipse.ui.internal.ProtobufActivator.getInstance().getInjector("protolipse.Protobuf");
	}
	
}
