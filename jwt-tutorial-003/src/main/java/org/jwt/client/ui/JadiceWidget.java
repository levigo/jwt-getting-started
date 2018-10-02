package org.jwt.client.ui;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;
import com.levigo.jadice.web.client.PageView;
import com.levigo.jadice.web.client.Viewer;
import com.levigo.jadice.web.client.ViewerBuilder;
import com.levigo.jadice.web.client.ui.AbstractBar;
import com.levigo.jadice.web.client.ui.DefaultActions;
import com.levigo.jadice.web.client.ui.HorizontalToolbar;
import com.levigo.jadice.web.client.ui.JadiceDefaultButton;
import com.levigo.jadice.web.client.util.action.KeyStroke;
import com.levigo.jadice.web.client.util.action.Keys;
import com.levigo.jadice.web.client.util.context.Context;
import com.levigo.jadice.web.client.util.context.Context.Ancestors;
import com.levigo.jadice.web.client.util.context.Context.Children;

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

		// initialize the context and register the PageView
		Context context = Context.install(this, Children.ALL, Ancestors.ALL);
		context.add(viewer.getPageView());

		// create the toolbar and add it to the panel
		AbstractBar toolbar = createToolbar(context);
		panel.addNorth(toolbar, toolbar.getStyle().size());

		panel.add(viewer);
	}

	protected Viewer createViewer() {
		final Viewer viewer = new ViewerBuilder().build();
		return viewer;
	}

	protected AbstractBar createToolbar(final Context context) {
		final HorizontalToolbar toolbar = new HorizontalToolbar();

		toolbar.add(new JadiceDefaultButton(DefaultActions.zoomInAction(new KeyStroke(Keys.PLUS), context), false));
		toolbar.add(new JadiceDefaultButton(DefaultActions.zoomOutAction(new KeyStroke(Keys.MINUS), context), false));
		toolbar.addSeparator();
		toolbar.add(new JadiceDefaultButton(DefaultActions.pagePrevAction(new KeyStroke(Keys.LEFT), context), false));
		toolbar.add(new JadiceDefaultButton(DefaultActions.pageNextAction(new KeyStroke(Keys.RIGHT), context), false));

		return toolbar;
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
