package org.jwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;

/**
 * This is the applications {@link EntryPoint} as defined in the
 * "Application.gwt.xml".
 */
public class ApplicationEntryPoint implements EntryPoint {

	@Override
	public void onModuleLoad() {
		Window.alert("jwt tutorial loaded");
	}
}
