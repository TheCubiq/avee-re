package com.daaw;

import com.google.android.exoplayer2.Format;
/* renamed from: com.daaw.sa */
/* loaded from: classes.dex */
public abstract class AbstractC2928sa extends zn0 {

    /* renamed from: j */
    public final long f26039j;

    /* renamed from: k */
    public C3029ta f26040k;

    /* renamed from: l */
    public int[] f26041l;

    public AbstractC2928sa(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, Format format, int i, Object obj, long j, long j2, long j3, long j4) {
        super(interfaceC2200mp, c2570pp, format, i, obj, j, j2, j4);
        this.f26039j = j3;
    }

    /* renamed from: g */
    public final int m10484g(int i) {
        return this.f26041l[i];
    }

    /* renamed from: h */
    public final C3029ta m10483h() {
        return this.f26040k;
    }

    /* renamed from: i */
    public void m10482i(C3029ta c3029ta) {
        this.f26040k = c3029ta;
        this.f26041l = c3029ta.m9418b();
    }
}
