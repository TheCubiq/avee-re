package christophedelory.atom;

import christophedelory.lang.StringUtils;
/* loaded from: classes.dex */
public class Type extends Common {
    private String _type = null;

    public String getType() {
        return this._type;
    }

    public void setType(String str) {
        this._type = StringUtils.normalize(str);
    }
}
