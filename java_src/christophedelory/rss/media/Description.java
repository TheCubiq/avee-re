package christophedelory.rss.media;
/* loaded from: classes.dex */
public class Description {
    private String _type = null;
    private String _value = null;

    public void setValue(String str) {
        this._value = str.trim();
    }

    public String getValue() {
        return this._value;
    }

    public void setType(String str) {
        this._type = str;
    }

    public String getType() {
        return this._type;
    }
}
