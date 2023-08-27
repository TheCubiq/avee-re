package christophedelory.rss;

import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes.dex */
public class TextInput {
    private String _title = null;
    private String _description = null;
    private String _name = null;
    private URI _link = null;

    public void setTitle(String str) {
        this._title = str.trim();
    }

    public String getTitle() {
        return this._title;
    }

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String str) {
        this._description = str.trim();
    }

    public void setName(String str) {
        this._name = str.trim();
    }

    public String getName() {
        return this._name;
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
}
