package org.jadice.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;

public interface CustomMessages extends Messages {

	CustomMessages INSTANCE = GWT.create(CustomMessages.class);

	String openDocument_description();

	String openDocument_dialog_label();

	String openDocument_dialog_ok();
}
