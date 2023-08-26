package christophedelory.rss;

import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes.dex */
public class Source {
    private URI _url = null;
    private String _channelName = null;

    public void setChannelName(String str) {
        this._channelName = str.trim();
    }

    public String getChannelName() {
        return this._channelName;
    }

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
}
