package com.mpatric.mp3agic;
/* loaded from: classes2.dex */
public interface ID3v1 {
    String getAlbum();

    String getArtist();

    String getComment();

    int getGenre();

    String getGenreDescription();

    String getTitle();

    String getTrack();

    String getVersion();

    String getYear();

    void setAlbum(String str);

    void setArtist(String str);

    void setComment(String str);

    void setGenre(int i);

    void setTitle(String str);

    void setTrack(String str);

    void setYear(String str);

    byte[] toBytes() throws NotSupportedException;
}
