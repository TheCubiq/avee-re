package christophedelory.atom;

import christophedelory.lang.StringUtils;
/* loaded from: classes.dex */
public class Generator extends Common {
    private String _value = null;
    private String _uri = null;
    private String _version = null;

    public String getValue() {
        return this._value;
    }

    public void setValue(String str) {
        this._value = str.trim();
    }

    public String getURIString() {
        return this._uri;
    }

    public void setURIString(String str) {
        this._uri = StringUtils.normalize(str);
    }

    public String getVersion() {
        return this._version;
    }

    public void setVersion(String str) {
        this._version = StringUtils.normalize(str);
    }
}
