package christophedelory.rss;

import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes.dex */
public class Enclosure {
    private URI _url = null;
    private long _length = 0;
    private String _type = "application/octet-stream";

    public void setURLString(String str) throws URISyntaxException {
        this._url = new URI(str);
    }

    public String getURLString() {
        return this._url.toString();
    }

    public void setURL(URI uri) {
        if (uri == null) {
            throw new NullPointerException("No URL");
        }
        this._url = uri;
    }

    public URI getURL() {
        return this._url;
    }

    public void setLength(long j) {
        this._length = j;
    }

    public long getLength() {
        return this._length;
    }

    public String getType() {
        return this._type;
    }

    public void setType(String str) {
        this._type = str.trim();
    }
}
