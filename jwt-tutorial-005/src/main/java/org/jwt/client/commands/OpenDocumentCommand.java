package org.jwt.client.commands;

import org.jwt.client.api.JadiceApi;
import org.jwt.client.ui.resources.CustomMessages;

import com.google.gwt.dom.client.Style;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
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
		label.setSize("100%", "100%");
		panel.add(label);

		TextBox inputBox = new TextBox();
		inputBox.setSize("100%", "100%");
		panel.add(inputBox);

		Button okButton = new Button(CustomMessages.INSTANCE.openDocument_dialog_ok());
		okButton.addClickHandler(event -> {
			openUrl(dialog, inputBox);
		});
		panel.add(okButton);

		PopupPanel dialog = new PopupPanel();
		dialog.setPopupPosition(100, 100);
		dialog.setWidget(panel);

		styleDialog(dialog);

		return dialog;
	}

	private void styleDialog(Widget dialog) {
		Style style = dialog.getElement().getStyle();
		style.setZIndex(5);
		style.setPadding(10, Unit.PX);
		style.setBackgroundColor("white");
	}

	private void openUrl(PopupPanel dialog, TextBox inputBox) {
		String url = inputBox.getValue();
		jadiceApi.loadDocument(url);
		dialog.hide();
	}

	/**
	 * {@link JadiceApi} is injected by the action and command framework from the
	 * context.
	 * 
	 * @param jadiceApi
	 */
	@Argument
	public void setJadiceApi(JadiceApi jadiceApi) {
		this.jadiceApi = jadiceApi;
	}
}
