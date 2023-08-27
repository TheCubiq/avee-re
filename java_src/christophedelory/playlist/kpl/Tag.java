package christophedelory.playlist.kpl;

import christophedelory.lang.StringUtils;
/* loaded from: classes.dex */
public class Tag {
    private String _artist = null;
    private String _album = null;
    private String _title = null;
    private String _year = null;
    private String _comment = null;
    private String _genre = null;
    private String _track = null;
    private String _gid = null;
    private String _has_tag = "True";

    public String getArtist() {
        return this._artist;
    }

    public void setArtist(String str) {
        this._artist = StringUtils.normalize(str);
    }

    public String getAlbum() {
        return this._album;
    }

    public void setAlbum(String str) {
        this._album = StringUtils.normalize(str);
    }

    public String getTitle() {
        return this._title;
    }

    public void setTitle(String str) {
        this._title = StringUtils.normalize(str);
    }

    public String getYear() {
        return this._year;
    }

    public void setYear(String str) {
        this._year = StringUtils.normalize(str);
    }

    public String getComment() {
        return this._comment;
    }

    public void setComment(String str) {
        this._comment = StringUtils.normalize(str);
    }

    public String getGenre() {
        return this._genre;
    }

    public void setGenre(String str) {
        this._genre = StringUtils.normalize(str);
    }

    public String getTrack() {
        return this._track;
    }

    public void setTrack(String str) {
        this._track = StringUtils.normalize(str);
    }

    public String getGid() {
        return this._gid;
    }

    public void setGid(String str) {
        this._gid = StringUtils.normalize(str);
    }

    public String getHasTag() {
        return this._has_tag;
    }

    public void setHasTag(String str) {
        this._has_tag = StringUtils.normalize(str);
    }
}
