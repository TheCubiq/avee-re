package christophedelory.rss.media;

import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes.dex */
public class Copyright {
    private URI _url = null;
    private String _value = null;

    public void setURLString(String str) throws URISyntaxException {
        this._url = new URI(str);
    }

    public String getURLString() {
        URI uri = this._url;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public void setURL(URI uri) {
        this._url = uri;
    }

    public URI getURL() {
        return this._url;
    }

    public String getValue() {
        return this._value;
    }

    public void setValue(String str) {
        this._value = str.trim();
    }
}
