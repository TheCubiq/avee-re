package christophedelory.rss;
/* loaded from: classes.dex */
public class Category {
    private String _domain = null;
    private String _value = null;

    public String getValue() {
        return this._value;
    }

    public void setValue(String str) {
        this._value = str.trim();
    }

    public String getDomain() {
        return this._domain;
    }

    public void setDomain(String str) {
        this._domain = str;
    }
}
