package christophedelory.rss.media;
/* loaded from: classes.dex */
public class Rating {
    private String _scheme = null;
    private String _value = null;

    public String getValue() {
        return this._value;
    }

    public void setValue(String str) {
        this._value = str.trim();
    }

    public String getScheme() {
        return this._scheme;
    }

    public void setScheme(String str) {
        this._scheme = str;
    }
}
