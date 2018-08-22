package org.jwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

/**
 * This is the applications {@link EntryPoint} as defined in the
 * "Application.gwt.xml".
 */
public class ApplicationEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		GWT.log("jwt tutorial loaded");
	}
}