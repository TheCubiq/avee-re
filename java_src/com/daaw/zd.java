package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
/* loaded from: classes.dex */
public final class zd {
    public static final zd g = new zd(-1, -16777216, 0, 0, -1, null);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Typeface f;

    public zd(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = typeface;
    }

    @TargetApi(19)
    public static zd a(CaptioningManager.CaptionStyle captionStyle) {
        return sq1.a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    @TargetApi(19)
    public static zd b(CaptioningManager.CaptionStyle captionStyle) {
        return new zd(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    public static zd c(CaptioningManager.CaptionStyle captionStyle) {
        return new zd(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : g.a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : g.b, captionStyle.hasWindowColor() ? captionStyle.windowColor : g.c, captionStyle.hasEdgeType() ? captionStyle.edgeType : g.d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : g.e, captionStyle.getTypeface());
    }
}
