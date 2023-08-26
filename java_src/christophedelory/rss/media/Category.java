package christophedelory.rss.media;
/* loaded from: classes.dex */
public class Category {
    private String _scheme = null;
    private String _label = null;
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

    public String getLabel() {
        return this._label;
    }

    public void setLabel(String str) {
        this._label = str;
    }
}
