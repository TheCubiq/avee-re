package com.daaw.avee.comp.AlbumArt;

import android.net.Uri;
/* loaded from: classes.dex */
public class AlbumArtRequest2 extends AlbumArtRequest {
    public final boolean fitCenter;
    public final int genBoundsHeight;
    public final int genBoundsWidth;
    public final int genHint;
    public final int genHint2;
    public final ImageColorKeyParams imageColorKeyParams;
    public final int targetBoundsHeight;
    public final int targetBoundsWidth;

    public AlbumArtRequest2(Uri uri, String str, String str2, String str3, boolean z, int i, int i2, int i3, int i4, int i5, int i6, ImageColorKeyParams imageColorKeyParams) {
        super(uri, str, str2, str3);
        this.fitCenter = z;
        this.targetBoundsWidth = i;
        this.targetBoundsHeight = i2;
        this.genBoundsWidth = i3;
        this.genBoundsHeight = i4;
        this.genHint = i5;
        this.genHint2 = i6;
        this.imageColorKeyParams = imageColorKeyParams;
    }
}
