package christophedelory.playlist.kpl;
/* loaded from: classes.dex */
public class Entry {
    private String _fileName = null;
    private Tag _tag = null;

    public String getFilename() {
        return this._fileName;
    }

    public void setFilename(String str) {
        this._fileName = str.trim();
    }

    public Tag getTag() {
        return this._tag;
    }

    public void setTag(Tag tag) {
        this._tag = tag;
    }
}
