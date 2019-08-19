package org.jwt.shared.model;

import com.levigo.jadice.document.PageSegment;
import com.levigo.jadice.web.shared.model.PageSegmentHandle;

/**
 * A {@link PageSegmentHandle} is used to identify and recover already loaded
 * {@link PageSegment}s on the server. In our case the handle is identified by
 * the url.
 */
public class UrlHandle extends PageSegmentHandle {

	private static final long serialVersionUID = 1L;

	private String url;

	/**
	 * @deprecated NoArgsConstructor for Serialization.
	 */
	public UrlHandle() {
	}

	public UrlHandle(String url) {
		this.setUrl(url);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String getIdentifier() {
		return url;
	}

	@Override
	public PageSegmentHandle copy() {
		final UrlHandle h = new UrlHandle(url);
		copyTo(h);
		return h;
	}

	@Override
	public String toString() {
		return "UrlHandle [url=" + url + "]";
	}
}
