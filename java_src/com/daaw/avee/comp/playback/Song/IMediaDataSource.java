package com.daaw.avee.comp.playback.Song;

import android.net.Uri;
/* loaded from: classes.dex */
public interface IMediaDataSource {
    public static final int TYPE_DASH = 0;
    public static final int TYPE_HLS = 2;
    public static final int TYPE_OTHER = 3;
    public static final int TYPE_SS = 1;

    String getContentId();

    int getContentType();

    Uri getContentUri();

    String getProviderDASH();
}
