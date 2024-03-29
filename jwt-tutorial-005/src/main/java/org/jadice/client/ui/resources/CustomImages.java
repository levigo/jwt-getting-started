package org.jadice.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface CustomImages extends ClientBundle {

	CustomImages INSTANCE = GWT.create(CustomImages.class);

	@Source("org/jadice/client/ui/resources/open.png")
	ImageResource open();
}