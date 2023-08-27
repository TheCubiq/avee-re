package christophedelory.rss.media;

import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes.dex */
public class Player {
    private URI _url = null;
    private Integer _width = null;
    private Integer _height = null;

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

    public void setWidth(int i) {
        this._width = Integer.valueOf(i);
    }

    public void setWidth(Integer num) {
        this._width = num;
    }

    public Integer getWidth() {
        return this._width;
    }

    public void setHeight(int i) {
        this._height = Integer.valueOf(i);
    }

    public void setHeight(Integer num) {
        this._height = num;
    }

    public Integer getHeight() {
        return this._height;
    }
}
