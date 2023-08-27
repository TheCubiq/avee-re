package christophedelory.atom;

import christophedelory.lang.StringUtils;
/* loaded from: classes.dex */
public class Person extends Common {
    private String _name = null;
    private String _uri = null;
    private String _email = null;

    public String getName() {
        return this._name;
    }

    public void setName(String str) {
        this._name = str.trim();
    }

    public String getURIString() {
        return this._uri;
    }

    public void setURIString(String str) {
        this._uri = StringUtils.normalize(str);
    }

    public String getEmail() {
        return this._email;
    }

    public void setEmail(String str) {
        this._email = StringUtils.normalize(str);
    }
}
