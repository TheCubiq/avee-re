package christophedelory.plist;

import com.mpatric.mp3agic.MpegFrame;
/* loaded from: classes.dex */
public class Plist {
    private java.lang.String _version = MpegFrame.MPEG_VERSION_1_0;
    private PlistObject _object = null;

    public java.lang.String getVersion() {
        return this._version;
    }

    public void setVersion(java.lang.String str) {
        this._version = str.trim();
    }

    public PlistObject getPlistObject() {
        return this._object;
    }

    public void setPlistObject(PlistObject plistObject) {
        if (plistObject instanceof Key) {
            throw new IllegalArgumentException("No dictionary key allowed in a plist");
        }
        plistObject.setParent(this);
        this._object = plistObject;
    }
}
