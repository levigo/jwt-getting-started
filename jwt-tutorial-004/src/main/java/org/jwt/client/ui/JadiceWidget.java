package org.jwt.client.ui;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.RequiresResize;
import com.google.gwt.user.client.ui.Widget;
import com.levigo.jadice.web.client.PageView;
import com.levigo.jadice.web.client.ToolManager;
import com.levigo.jadice.web.client.Viewer;
import com.levigo.jadice.web.client.ViewerBuilder;
import com.levigo.jadice.web.client.tool.DefaultToolActivationPolicy;
import com.levigo.jadice.web.client.tools.HighlightTool;
import com.levigo.jadice.web.client.tools.MouseWheelScrollTool;
import com.levigo.jadice.web.client.tools.MouseWheelZoomTool;
import com.levigo.jadice.web.client.tools.PanForceMouseTool;
import com.levigo.jadice.web.client.tools.TextSelectionTool;
import com.levigo.jadice.web.client.tools.ThumbnailTool;
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

		configureToolManager();
	}

	private Viewer createViewer() {
		final Viewer viewer = new ViewerBuilder().build();
		return viewer;
	}

	private AbstractBar createToolbar(final Context context) {
		final HorizontalToolbar toolbar = new HorizontalToolbar();

		toolbar.add(new JadiceDefaultButton(DefaultActions.zoomInAction(new KeyStroke(Keys.PLUS), context), false));
		toolbar.add(new JadiceDefaultButton(DefaultActions.zoomOutAction(new KeyStroke(Keys.MINUS), context), false));
		toolbar.addSeparator();
		toolbar.add(new JadiceDefaultButton(DefaultActions.pagePrevAction(new KeyStroke(Keys.LEFT), context), false));
		toolbar.add(new JadiceDefaultButton(DefaultActions.pageNextAction(new KeyStroke(Keys.RIGHT), context), false));

		return toolbar;
	}

	private void configureToolManager() {
		ToolManager tm = viewer.getPageView().getToolManager();

		tm.register(PanForceMouseTool.class, true);

		tm.register(MouseWheelScrollTool.class, true);
		tm.register(MouseWheelZoomTool.class, true);

		tm.register(ThumbnailTool.class, true);

		tm.register(TextSelectionTool.class, true);
		tm.register(HighlightTool.class, true);

		// DefaultToolActivationPolicy automatically activates tools like the
		// TextSelectionTool and PanFormceMouseTool if another tool is deactivated
		tm.setActivationPolicy(new DefaultToolActivationPolicy());
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
