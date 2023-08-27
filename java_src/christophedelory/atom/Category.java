package christophedelory.atom;
/* loaded from: classes.dex */
public class Category extends Common {
    private String _term = null;
    private String _scheme = null;
    private String _label = null;

    public String getTerm() {
        return this._term;
    }

    public void setTerm(String str) {
        this._term = str.trim();
    }

    public String getScheme() {
        return this._scheme;
    }

    public void setScheme(String str) {
        this._scheme = str;
    }

    public String getLabel() {
        return this._label;
    }

    public void setLabel(String str) {
        this._label = str;
    }
}
