package org.jwt.shared.model;

import org.jwt.server.dataprovider.UrlDocumentDataProvider;

import com.levigo.jadice.document.Document;
import com.levigo.jadice.web.shared.model.Source;

/**
 * A {@link Source} identifies a {@link Document}. For example this could be an
 * item-id identifying a document in an archive or the name of a file. In this
 * case we reference a url and assume that the according
 * {@link UrlDocumentDataProvider} can load it.
 */
public class UrlSource extends Source {

	private static final long serialVersionUID = 1L;

	private String url;

	/**
	 * @deprecated NoArgsConstructor for Serialization.
	 */
	public UrlSource() {
	}

	public UrlSource(String url) {
		this.setUrl(url);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "UrlSource [url=" + url + "]";
	}
}
