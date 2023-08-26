package christophedelory.rss;

import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes.dex */
public class Image {
    private URI _url = null;
    private String _title = null;
    private URI _link = null;
    private Integer _width = null;
    private Integer _height = null;
    private String _description = null;

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

    public void setTitle(String str) {
        this._title = str.trim();
    }

    public String getTitle() {
        return this._title;
    }

    public String getLinkString() {
        return this._link.toString();
    }

    public void setLinkString(String str) throws URISyntaxException {
        this._link = new URI(str);
    }

    public void setLink(URI uri) {
        if (uri == null) {
            throw new NullPointerException("No link");
        }
        this._link = uri;
    }

    public URI getLink() {
        return this._link;
    }

    public Integer getWidth() {
        return this._width;
    }

    public void setWidth(Integer num) {
        this._width = num;
    }

    public Integer getHeight() {
        return this._height;
    }

    public void setHeight(Integer num) {
        this._height = num;
    }

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String str) {
        this._description = str;
    }
}
