package com.daaw.avee.comp.AlbumArt;

import android.net.Uri;
import android.widget.ImageView;
/* loaded from: classes.dex */
public interface IAlbumArtCore {
    void cancelRequest(ImageView imageView);

    void loadAlbumArt(Uri uri, String str, String str2, String str3, ImageView imageView, boolean z, boolean z2, boolean z3);

    void loadAlbumArtLarge(boolean z, Uri uri, String str, String str2, String str3, boolean z2, ImageLoadedListener imageLoadedListener, int i, int i2, int i3, int i4, int i5, int i6, boolean z3, ImageColorKeyParams imageColorKeyParams, Object obj);
}
