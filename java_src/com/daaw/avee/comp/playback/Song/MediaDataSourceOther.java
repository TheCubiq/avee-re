package com.daaw.avee.comp.playback.Song;

import android.net.Uri;
/* loaded from: classes.dex */
public class MediaDataSourceOther implements IMediaDataSource {
    private final int contentType;
    private final Uri uriString;

    @Override // com.daaw.avee.comp.playback.Song.IMediaDataSource
    public String getContentId() {
        return null;
    }

    @Override // com.daaw.avee.comp.playback.Song.IMediaDataSource
    public String getProviderDASH() {
        return "widevine_test";
    }

    public MediaDataSourceOther(Uri uri) {
        this.uriString = uri;
        this.contentType = detectContentType(uri);
    }

    public static int detectContentType(Uri uri) {
        String str;
        String path = uri.getPath();
        if (path != null) {
            try {
                str = path.substring(path.lastIndexOf(".") + 1);
            } catch (Exception unused) {
                str = "";
            }
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("mpd")) {
                return 0;
            }
            if (lowerCase.startsWith("ism") || lowerCase.startsWith("isml")) {
                return 1;
            }
            if (!lowerCase.equals("flv") && lowerCase.equals("m3u8")) {
                return 2;
            }
        }
        return 3;
    }

    @Override // com.daaw.avee.comp.playback.Song.IMediaDataSource
    public int getContentType() {
        return this.contentType;
    }

    @Override // com.daaw.avee.comp.playback.Song.IMediaDataSource
    public Uri getContentUri() {
        return this.uriString;
    }
}
