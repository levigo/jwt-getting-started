package org.jadice.client.commands;

import org.jadice.client.api.JadiceApi;
import org.jadice.client.ui.resources.CustomMessages;

import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.levigo.jadice.web.client.commands.AbstractContextCommand;
import com.levigo.jadice.web.client.util.command.Argument;

/**
 * Shows a dialog where the user can input an url. When pressing ok, we try to
 * load this url as a document.
 */
public class OpenDocumentCommand extends AbstractContextCommand {

	private PopupPanel dialog = null;

	private JadiceApi jadiceApi;

	@Override
	protected void execute() {
		if (dialog == null) {
			dialog = createOpenDocumentDialog();
		}

		if (dialog.isShowing()) {
			dialog.hide();
		} else {
			dialog.show();
		}
	}

	private PopupPanel createOpenDocumentDialog() {
		VerticalPanel panel = new VerticalPanel();

		Label label = new Label(CustomMessages.INSTANCE.openDocument_dialog_label());
		panel.add(label);

		TextBox inputBox = new TextBox();
		inputBox.getElement().getStyle().setMarginTop(5, Unit.PX);
		inputBox.getElement().getStyle().setMarginBottom(5, Unit.PX);
		inputBox.setSize("400px", "100%");
		panel.add(inputBox);

		Button okButton = new Button(CustomMessages.INSTANCE.openDocument_dialog_ok());
		okButton.addClickHandler(event -> openUrl(dialog, inputBox));
		panel.add(okButton);

		PopupPanel dialog = new PopupPanel();
		dialog.setPopupPosition(100, 100);
		dialog.setWidget(panel);
		dialog.getElement().getStyle().setZIndex(5);

		return dialog;
	}

	private void openUrl(PopupPanel dialog, TextBox inputBox) {
		String url = inputBox.getValue();
		jadiceApi.loadDocument(url);
		dialog.hide();
	}

	/**
	 * {@link JadiceApi} is injected by the action and command framework from the
	 * context.
	 */
	@Argument
	public void setJadiceApi(JadiceApi jadiceApi) {
		this.jadiceApi = jadiceApi;
	}
}
