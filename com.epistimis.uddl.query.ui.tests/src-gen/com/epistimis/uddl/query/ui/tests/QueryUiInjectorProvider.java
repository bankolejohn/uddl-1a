/*
 * generated by Xtext 2.33.0
 */
/*
 * Copyright (c) 2022 - 2024 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.query.ui.tests;

import com.epistimis.uddl.query.ui.internal.QueryActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;

public class QueryUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return QueryActivator.getInstance().getInjector("com.epistimis.uddl.query.Query");
	}

}
