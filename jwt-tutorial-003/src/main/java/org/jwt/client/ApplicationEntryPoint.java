package org.jwt.client;

import java.io.IOException;

import org.jwt.client.ui.JadiceWidget;
import org.jwt.shared.model.UrlSource;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.levigo.jadice.document.Document;
import com.levigo.jadice.web.client.reader.Reader;
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

		// finally load a testdocument
		loadDocument("https://www.levigo.de/fileadmin/download/jadicewebtoolkit.pdf");
		
		GWT.log("jwt tutorial loaded");
	}

	private void initServerConnection() {
		try {
			new ServerConnectionBuilder().setWebSocketEnabled(false).build();
		} catch (IOException e) {
			e.printStackTrace();
			Window.alert("Error initializing server-connection.");
		}
	}

	/**
	 * Loads the document referenced by the passed url.
	 * 
	 * @param url
	 */
	private void loadDocument(final String url) {
		Reader r = new Reader();
		r.append(new UrlSource(url));
		r.complete(new AsyncCallback<Document>() {

			@Override
			public void onSuccess(Document doc) {
				jadiceWidget.getPageView().setDocument(doc);
			}

			@Override
			public void onFailure(Throwable caught) {
				caught.printStackTrace();
				Window.alert("Cant load document from \"" + url + "\".");
			}
		});
	}
}