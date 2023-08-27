package christophedelory.playlist.mpcpl;
/* loaded from: classes.dex */
public class Resource {
    private String _filename = null;
    private String _type = "0";
    private String _subtitle = null;

    public String getFilename() {
        return this._filename;
    }

    public void setFilename(String str) {
        this._filename = str.trim();
    }

    public String getType() {
        return this._type;
    }

    public void setType(String str) {
        this._type = str.trim();
    }

    public String getSubtitle() {
        return this._subtitle;
    }

    public void setSubtitle(String str) {
        this._subtitle = str;
    }
}
