package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public final class nm1 {

    /* renamed from: a */
    public final int f20248a;

    /* renamed from: b */
    public final int f20249b;

    /* renamed from: c */
    public final long f20250c;

    /* renamed from: d */
    public final long f20251d;

    /* renamed from: e */
    public final long f20252e;

    /* renamed from: f */
    public final Format f20253f;

    /* renamed from: g */
    public final int f20254g;

    /* renamed from: h */
    public final long[] f20255h;

    /* renamed from: i */
    public final long[] f20256i;

    /* renamed from: j */
    public final int f20257j;

    /* renamed from: k */
    public final pm1[] f20258k;

    public nm1(int i, int i2, long j, long j2, long j3, Format format, int i3, pm1[] pm1VarArr, int i4, long[] jArr, long[] jArr2) {
        this.f20248a = i;
        this.f20249b = i2;
        this.f20250c = j;
        this.f20251d = j2;
        this.f20252e = j3;
        this.f20253f = format;
        this.f20254g = i3;
        this.f20258k = pm1VarArr;
        this.f20257j = i4;
        this.f20255h = jArr;
        this.f20256i = jArr2;
    }

    /* renamed from: a */
    public pm1 m15041a(int i) {
        pm1[] pm1VarArr = this.f20258k;
        if (pm1VarArr == null) {
            return null;
        }
        return pm1VarArr[i];
    }
}
