package com.daaw.avee.comp.AlbumArt;

import android.net.Uri;
/* loaded from: classes.dex */
public class AlbumArtRequest {
    public static final int HINT_FORCE_GEN = 4;
    public static final int HINT_NO_TEXT = 2;
    public static final int HINT_SHIFT_HUE = 1;
    public final String genStr;
    public final String path0;
    public final String path1;
    public final Uri videoThumbDataSource;

    public AlbumArtRequest(Uri uri, String str, String str2, String str3) {
        this.videoThumbDataSource = uri;
        this.path0 = str;
        this.path1 = str2;
        this.genStr = str3;
    }
}
