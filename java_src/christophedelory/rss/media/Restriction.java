package christophedelory.rss.media;
/* loaded from: classes.dex */
public class Restriction {
    private String _type = null;
    private String _relationship = null;
    private String _value = null;

    public String getValue() {
        return this._value;
    }

    public void setValue(String str) {
        this._value = str;
    }

    public String getType() {
        return this._type;
    }

    public void setType(String str) {
        this._type = str;
    }

    public String getRelationship() {
        return this._relationship;
    }

    public void setRelationship(String str) {
        this._relationship = str.trim();
    }
}
