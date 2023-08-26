package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public class ID3Wrapper {
    private final ID3v1 id3v1Tag;
    private final ID3v2 id3v2Tag;

    public ID3Wrapper(ID3v1 iD3v1, ID3v2 iD3v2) {
        this.id3v1Tag = iD3v1;
        this.id3v2Tag = iD3v2;
    }

    public ID3v1 getId3v1Tag() {
        return this.id3v1Tag;
    }

    public ID3v2 getId3v2Tag() {
        return this.id3v2Tag;
    }

    public String getTrack() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null && iD3v2.getTrack() != null && this.id3v2Tag.getTrack().length() > 0) {
            return this.id3v2Tag.getTrack();
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            return iD3v1.getTrack();
        }
        return null;
    }

    public void setTrack(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setTrack(str);
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            iD3v1.setTrack(str);
        }
    }

    public String getArtist() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null && iD3v2.getArtist() != null && this.id3v2Tag.getArtist().length() > 0) {
            return this.id3v2Tag.getArtist();
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            return iD3v1.getArtist();
        }
        return null;
    }

    public void setArtist(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setArtist(str);
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            iD3v1.setArtist(str);
        }
    }

    public String getTitle() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null && iD3v2.getTitle() != null && this.id3v2Tag.getTitle().length() > 0) {
            return this.id3v2Tag.getTitle();
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            return iD3v1.getTitle();
        }
        return null;
    }

    public void setTitle(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setTitle(str);
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            iD3v1.setTitle(str);
        }
    }

    public String getAlbum() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null && iD3v2.getAlbum() != null && this.id3v2Tag.getAlbum().length() > 0) {
            return this.id3v2Tag.getAlbum();
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            return iD3v1.getAlbum();
        }
        return null;
    }

    public void setAlbum(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setAlbum(str);
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            iD3v1.setAlbum(str);
        }
    }

    public String getYear() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null && iD3v2.getYear() != null && this.id3v2Tag.getYear().length() > 0) {
            return this.id3v2Tag.getYear();
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            return iD3v1.getYear();
        }
        return null;
    }

    public void setYear(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setYear(str);
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            iD3v1.setYear(str);
        }
    }

    public int getGenre() {
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null && iD3v1.getGenre() != -1) {
            return this.id3v1Tag.getGenre();
        }
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getGenre();
        }
        return -1;
    }

    public void setGenre(int i) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setGenre(i);
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            iD3v1.setGenre(i);
        }
    }

    public String getGenreDescription() {
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            return iD3v1.getGenreDescription();
        }
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getGenreDescription();
        }
        return null;
    }

    public String getComment() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null && iD3v2.getComment() != null && this.id3v2Tag.getComment().length() > 0) {
            return this.id3v2Tag.getComment();
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            return iD3v1.getComment();
        }
        return null;
    }

    public void setComment(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setComment(str);
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            iD3v1.setComment(str);
        }
    }

    public String getComposer() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getComposer();
        }
        return null;
    }

    public void setComposer(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setComposer(str);
        }
    }

    public String getOriginalArtist() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getOriginalArtist();
        }
        return null;
    }

    public void setOriginalArtist(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setOriginalArtist(str);
        }
    }

    public void setAlbumArtist(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setAlbumArtist(str);
        }
    }

    public String getAlbumArtist() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getAlbumArtist();
        }
        return null;
    }

    public String getCopyright() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getCopyright();
        }
        return null;
    }

    public void setCopyright(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setCopyright(str);
        }
    }

    public String getUrl() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getUrl();
        }
        return null;
    }

    public void setUrl(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setUrl(str);
        }
    }

    public String getEncoder() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getEncoder();
        }
        return null;
    }

    public void setEncoder(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setEncoder(str);
        }
    }

    public byte[] getAlbumImage() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getAlbumImage();
        }
        return null;
    }

    public void setAlbumImage(byte[] bArr, String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setAlbumImage(bArr, str);
        }
    }

    public String getAlbumImageMimeType() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getAlbumImageMimeType();
        }
        return null;
    }

    public void setLyrics(String str) {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.setLyrics(str);
        }
    }

    public String getLyrics() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            return iD3v2.getLyrics();
        }
        return null;
    }

    public void clearComment() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.clearFrameSet("COMM");
        }
        ID3v1 iD3v1 = this.id3v1Tag;
        if (iD3v1 != null) {
            iD3v1.setComment(null);
        }
    }

    public void clearCopyright() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.clearFrameSet(AbstractID3v2Tag.ID_COPYRIGHT);
        }
    }

    public void clearEncoder() {
        ID3v2 iD3v2 = this.id3v2Tag;
        if (iD3v2 != null) {
            iD3v2.clearFrameSet(AbstractID3v2Tag.ID_ENCODER);
        }
    }
}
