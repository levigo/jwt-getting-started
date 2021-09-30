package org.jwt.server.dataprovider;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.jwt.shared.model.UrlHandle;
import org.jwt.shared.model.UrlSource;
import org.springframework.stereotype.Component;

import com.levigo.jadice.document.JadiceException;
import com.levigo.jadice.document.read.Reader;
import com.levigo.jadice.web.server.DocumentDataProvider;
import com.levigo.jadice.web.shared.model.PageSegmentHandle;
import com.levigo.jadice.web.shared.model.Source;
import com.levigo.jadice.web.shared.service.exceptions.RecoverFailedException;

/**
 * A {@link DocumentDataProvider} is responsible for loading a document for a
 * {@link Source} or recovering it with the according {@link PageSegmentHandle}.
 * In our case we just load a document from an url referenced by
 * {@link UrlSource}.
 */
@Component
public class UrlDocumentDataProvider implements DocumentDataProvider<UrlSource, UrlHandle> {

	public UrlDocumentDataProvider() {
	}

	@Override
	public UrlHandle createSourceHandle(UrlSource source) {
		return new UrlHandle(source.getUrl());
	}

	@Override
	public void read(Reader reader, UrlSource source) throws JadiceException, IOException {
		// use a java 10 feature: type inference
		var documentStream = getResourceStream(source.getUrl());
		reader.read(documentStream);
	}

	@Override
	public void recover(Reader reader, UrlHandle handle) throws RecoverFailedException, JadiceException {
		try {
			InputStream documentStream = getResourceStream(handle.getUrl());
			reader.read(documentStream);
		} catch (IOException e) {
			throw new RecoverFailedException("Can't recover " + handle, e);
		}
	}

	private InputStream getResourceStream(String url) throws IOException {
		URLConnection connection = new URL(url).openConnection();
		return connection.getInputStream();
	}
}
