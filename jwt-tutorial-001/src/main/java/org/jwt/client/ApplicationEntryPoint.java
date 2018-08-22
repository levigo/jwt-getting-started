package org.jwt.client;

import java.io.IOException;

import org.jwt.client.ui.JadiceWidget;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;
import com.levigo.jadice.web.conn.client.ServerConnectionBuilder;

/**
 * This is the applications {@link EntryPoint} as defined in the
 * "Application.gwt.xml". It initializes the {@link JadiceWidget} and adds it to
 * {@link RootPanel}.
 */
public class ApplicationEntryPoint implements EntryPoint {

	private JadiceWidget jadiceWidget;

	@Override
	public void onModuleLoad() {

		initServerConnection();

		jadiceWidget = new JadiceWidget();

		// Adds the jadiceWidget to the "Viewer"-div of the rootpanel (see index.html).
		RootPanel rootPanel = RootPanel.get("Viewer");
		rootPanel.add(jadiceWidget);

		GWT.log("jwt tutorial loaded");
	}

	/**
	 * For the tutorial we deactivate websocket communication as not supported by
	 * jetty.
	 */
	private void initServerConnection() {
		try {
			new ServerConnectionBuilder().setWebSocketEnabled(false).build();
		} catch (IOException e) {
			e.printStackTrace();
			Window.alert("Error initializing server-connection.");
		}
	}
}