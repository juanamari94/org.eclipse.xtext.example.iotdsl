/*
 * generated by Xtext 2.9.0.v201507170721
 */
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class IotdslStandaloneSetup extends IotdslStandaloneSetupGenerated{

	public static void doSetup() {
		new IotdslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
