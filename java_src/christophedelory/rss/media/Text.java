package christophedelory.rss.media;
/* loaded from: classes.dex */
public class Text {
    private String _type = null;
    private String _lang = null;
    private String _start = null;
    private String _end = null;
    private String _value = null;

    public String getValue() {
        return this._value;
    }

    public void setValue(String str) {
        this._value = str.trim();
    }

    public String getType() {
        return this._type;
    }

    public void setType(String str) {
        this._type = str;
    }

    public String getLang() {
        return this._lang;
    }

    public void setLang(String str) {
        this._lang = str;
    }

    public String getStart() {
        return this._start;
    }

    public void setStart(String str) {
        this._start = str;
    }

    public String getEnd() {
        return this._end;
    }

    public void setEnd(String str) {
        this._end = str;
    }
}
