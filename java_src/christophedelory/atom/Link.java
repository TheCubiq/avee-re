package christophedelory.atom;

import christophedelory.lang.StringUtils;
/* loaded from: classes.dex */
public class Link extends Type {
    private String _href = null;
    private String _rel = null;
    private String _hreflang = null;
    private String _title = null;
    private Long _length = null;

    public String getHref() {
        return this._href;
    }

    public void setHref(String str) {
        this._href = str.trim();
    }

    public String getRel() {
        return this._rel;
    }

    public void setRel(String str) {
        this._rel = StringUtils.normalize(str);
    }

    public String getHrefLang() {
        return this._hreflang;
    }

    public void setHrefLang(String str) {
        this._hreflang = StringUtils.normalize(str);
    }

    public String getTitle() {
        return this._title;
    }

    public void setTitle(String str) {
        this._title = StringUtils.normalize(str);
    }

    public Long getLength() {
        return this._length;
    }

    public void setLength(Long l) {
        this._length = l;
    }
}
