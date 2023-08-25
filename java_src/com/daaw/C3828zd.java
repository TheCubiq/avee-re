package com.daaw;

import android.annotation.TargetApi;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
/* renamed from: com.daaw.zd */
/* loaded from: classes.dex */
public final class C3828zd {

    /* renamed from: g */
    public static final C3828zd f34955g = new C3828zd(-1, -16777216, 0, 0, -1, null);

    /* renamed from: a */
    public final int f34956a;

    /* renamed from: b */
    public final int f34957b;

    /* renamed from: c */
    public final int f34958c;

    /* renamed from: d */
    public final int f34959d;

    /* renamed from: e */
    public final int f34960e;

    /* renamed from: f */
    public final Typeface f34961f;

    public C3828zd(int i, int i2, int i3, int i4, int i5, Typeface typeface) {
        this.f34956a = i;
        this.f34957b = i2;
        this.f34958c = i3;
        this.f34959d = i4;
        this.f34960e = i5;
        this.f34961f = typeface;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static C3828zd m2479a(CaptioningManager.CaptionStyle captionStyle) {
        return sq1.f26525a >= 21 ? m2477c(captionStyle) : m2478b(captionStyle);
    }

    @TargetApi(19)
    /* renamed from: b */
    public static C3828zd m2478b(CaptioningManager.CaptionStyle captionStyle) {
        return new C3828zd(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    @TargetApi(21)
    /* renamed from: c */
    public static C3828zd m2477c(CaptioningManager.CaptionStyle captionStyle) {
        return new C3828zd(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f34955g.f34956a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f34955g.f34957b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f34955g.f34958c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f34955g.f34959d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f34955g.f34960e, captionStyle.getTypeface());
    }
}
