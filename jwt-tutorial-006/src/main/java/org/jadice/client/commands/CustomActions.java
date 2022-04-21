package org.jadice.client.commands;

import org.jadice.client.ui.resources.CustomImages;
import org.jadice.client.ui.resources.CustomMessages;

import com.jadice.web.util.icon.client.EffectIcons;
import com.jadice.web.util.icon.client.StateEffectIcon;
import com.jadice.web.util.icon.client.StateIcon;
import com.levigo.jadice.web.client.util.action.Action;
import com.levigo.jadice.web.client.util.action.KeyStroke;
import com.levigo.jadice.web.client.util.action.RegisteredAction;
import com.levigo.jadice.web.client.util.context.Context;

public class CustomActions {

	public static Action openDocumentAction(KeyStroke keyStroke, Context context) {

		String description = CustomMessages.INSTANCE.openDocument_description();
		StateIcon stateIcon = new StateEffectIcon(EffectIcons.getEffectIcon(CustomImages.INSTANCE.open()));
		OpenDocumentCommand openDocumentCommand = new OpenDocumentCommand();

		return new RegisteredAction(description, keyStroke, stateIcon, openDocumentCommand, context);
	}
}
