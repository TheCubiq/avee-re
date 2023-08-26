package com.daaw.avee.comp.AlbumArt;

import android.content.Context;
/* loaded from: classes.dex */
public class AlbumArtFactory {
    public static IAlbumArtCore getInstance() {
        return AlbumArtCore.getInstance();
    }

    public static IAlbumArtCore createInstance(Context context) {
        return AlbumArtCore.createInstance(context);
    }
}
