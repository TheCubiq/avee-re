package christophedelory.plist;
/* loaded from: classes.dex */
public class PlistText extends PlistObject {
    private java.lang.String _value = null;

    public java.lang.String getValue() {
        return this._value;
    }

    public void setValue(java.lang.String str) {
        this._value = str.trim();
    }
}
