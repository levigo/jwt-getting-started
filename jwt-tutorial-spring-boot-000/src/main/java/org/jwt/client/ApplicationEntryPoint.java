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

public class ApplicationEntryPoint implements EntryPoint {

  private JadiceWidget jadiceWidget;
  
  public void onModuleLoad() {
    initServerConnection();
    
    jadiceWidget = new JadiceWidget();

    // Adds the jadiceWidget to the "Viewer"-div of the rootpanel (see index.html).
    RootPanel rootPanel = RootPanel.get("Viewer");
    rootPanel.add(jadiceWidget);

    GWT.log("jwt tutorial loaded");
    
    // Finally, load a test document:
    loadDocument("https://www.levigo.de/fileadmin/download/jadicewebtoolkit.pdf");
  }

  private void loadDocument(String docURI) {
		Reader r = new Reader();
		r.append(new UrlSource(docURI));
		r.complete(new AsyncCallback<Document>() {
			@Override
			public void onFailure(Throwable caught) {
				caught.printStackTrace();
			}

			@Override
			public void onSuccess(Document result) {
				jadiceWidget.getPageView().setDocument(result);
			}
		});
	}
  
  /**
   * For the tutorial we deactivate websocket communication as not supported by
   * jetty.
   */
  private void initServerConnection() {
    try {
//      new ServerConnectionBuilder().setWebSocketEnabled(false).setServerSentEventsEnabled(false).build();
    	new ServerConnectionBuilder().setWebSocketEnabled(false).build();
    } catch (IOException e) {
      e.printStackTrace();
      Window.alert("Error initializing server-connection.");
    }
  }
}
