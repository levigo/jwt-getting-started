package org.jwt.client.ui;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;
import com.levigo.jadice.web.client.PageView;
import com.levigo.jadice.web.client.Viewer;
import com.levigo.jadice.web.client.ViewerBuilder;

/**
 * A simple widget, that adds a {@link Viewer} to a {@link DockLayoutPanel}.
 */
public class JadiceWidget implements IsWidget, RequiresResize {

	private DockLayoutPanel panel;
	private Viewer viewer;

	public JadiceWidget() {
		init();
	}

	private void init() {
		viewer = createViewer();
		
		panel = new DockLayoutPanel(Unit.PX);
		panel.setWidth("100%");
		panel.setHeight("100%");

		panel.add(viewer);
	}

	private Viewer createViewer() {
		final Viewer viewer = new ViewerBuilder().build();
		return viewer;
	}

	public PageView getPageView() {
		return viewer.getPageView();
	}

	@Override
	public Widget asWidget() {
		return panel;
	}

	@Override
	public void onResize() {
		viewer.onResize();
	}
}
