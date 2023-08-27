package christophedelory.rss;
/* loaded from: classes.dex */
public class GUID {
    private boolean _isPermaLink = true;
    private String _value = null;

    public String getValue() {
        return this._value;
    }

    public void setValue(String str) {
        this._value = str.trim();
    }

    public boolean isPermaLink() {
        return this._isPermaLink;
    }

    public void setPermaLink(boolean z) {
        this._isPermaLink = z;
    }
}
