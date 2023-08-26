package christophedelory.playlist.m3u;

import christophedelory.lang.StringUtils;
/* loaded from: classes.dex */
public class Resource {
    private String _name = null;
    private String _location = null;
    private long _seconds = -1;

    public String getName() {
        return this._name;
    }

    public void setName(String str) {
        this._name = StringUtils.normalize(str);
    }

    public String getLocation() {
        return this._location;
    }

    public void setLocation(String str) {
        this._location = str.trim().replace('\\', '/');
    }

    public long getLength() {
        return this._seconds;
    }

    public void setLength(long j) {
        if (j < 0) {
            this._seconds = -1L;
        } else {
            this._seconds = j;
        }
    }
}
