package com.mpatric.mp3agic;

import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes2.dex */
public interface ID3v2 extends ID3v1 {
    void clearAlbumImage();

    void clearFrameSet(String str);

    String getAlbumArtist();

    byte[] getAlbumImage();

    String getAlbumImageMimeType();

    String getArtistUrl();

    String getAudioSourceUrl();

    String getAudiofileUrl();

    int getBPM();

    ArrayList<ID3v2ChapterTOCFrameData> getChapterTOC();

    ArrayList<ID3v2ChapterFrameData> getChapters();

    String getCommercialUrl();

    String getComposer();

    String getCopyright();

    String getCopyrightUrl();

    int getDataLength();

    String getDate();

    String getEncoder();

    Map<String, ID3v2FrameSet> getFrameSets();

    String getGrouping();

    String getItunesComment();

    String getKey();

    int getLength();

    String getLyrics();

    boolean getObseleteFormat();

    String getOriginalArtist();

    boolean getPadding();

    String getPartOfSet();

    String getPaymentUrl();

    String getPublisher();

    String getPublisherUrl();

    String getRadiostationUrl();

    String getUrl();

    int getWmpRating();

    boolean hasFooter();

    boolean hasUnsynchronisation();

    boolean isCompilation();

    void setAlbumArtist(String str);

    void setAlbumImage(byte[] bArr, String str);

    void setAlbumImage(byte[] bArr, String str, byte b, String str2);

    void setArtistUrl(String str);

    void setAudioSourceUrl(String str);

    void setAudiofileUrl(String str);

    void setBPM(int i);

    void setChapterTOC(ArrayList<ID3v2ChapterTOCFrameData> arrayList);

    void setChapters(ArrayList<ID3v2ChapterFrameData> arrayList);

    void setCommercialUrl(String str);

    void setCompilation(boolean z);

    void setComposer(String str);

    void setCopyright(String str);

    void setCopyrightUrl(String str);

    void setDate(String str);

    void setEncoder(String str);

    void setFooter(boolean z);

    void setGenreDescription(String str);

    void setGrouping(String str);

    void setItunesComment(String str);

    void setKey(String str);

    void setLyrics(String str);

    void setOriginalArtist(String str);

    void setPadding(boolean z);

    void setPartOfSet(String str);

    void setPaymentUrl(String str);

    void setPublisher(String str);

    void setPublisherUrl(String str);

    void setRadiostationUrl(String str);

    void setUnsynchronisation(boolean z);

    void setUrl(String str);

    void setWmpRating(int i);
}
