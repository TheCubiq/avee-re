package christophedelory.atom;

import christophedelory.lang.StringUtils;
/* loaded from: classes.dex */
public class Common {
    private String _base = null;
    private String _lang = null;

    public String getBaseString() {
        return this._base;
    }

    public void setBaseString(String str) {
        this._base = StringUtils.normalize(str);
    }

    public String getLang() {
        return this._lang;
    }

    public void setLang(String str) {
        this._lang = StringUtils.normalize(str);
    }
}
