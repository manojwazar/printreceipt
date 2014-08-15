package com.ae.module;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class InjectorFactory {
	private InjectorFactory() {
	}

	// Singleton instance
	private static Injector injector;

	static {
		injector = Guice.createInjector(new ShoppingModules());
	}

	/**
	 * Return the default injector.
	 */
	public static Injector getInjector() {
		return injector;
	}

}