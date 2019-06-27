package org.jwt.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface CustomImages extends ClientBundle {

	public CustomImages INSTANCE = GWT.create(CustomImages.class);

	@Source("org/jwt/client/ui/resources/open.png")
	public ImageResource open();
}