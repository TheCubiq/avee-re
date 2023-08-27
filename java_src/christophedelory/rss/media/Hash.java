package christophedelory.rss.media;
/* loaded from: classes.dex */
public class Hash {
    private String _algo = null;
    private String _value = null;

    public void setValue(String str) {
        this._value = str.trim();
    }

    public String getValue() {
        return this._value;
    }

    public void setAlgo(String str) {
        this._algo = str;
    }

    public String getAlgo() {
        return this._algo;
    }
}
