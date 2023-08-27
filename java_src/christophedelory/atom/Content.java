package christophedelory.atom;

import christophedelory.lang.StringUtils;
/* loaded from: classes.dex */
public class Content extends Type {
    private String _text = null;
    private String _src = null;

    public String getText() {
        return this._text;
    }

    public void setText(String str) {
        this._text = StringUtils.normalize(str);
    }

    public String getSrc() {
        return this._src;
    }

    public void setSrc(String str) {
        this._src = StringUtils.normalize(str);
    }
}
