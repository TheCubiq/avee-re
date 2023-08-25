package com.daaw;

import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public abstract class zn0 extends AbstractC1180ef {

    /* renamed from: i */
    public final long f35250i;

    public zn0(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, Format format, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC2200mp, c2570pp, 1, format, i, obj, j, j2);
        C2914s6.m10686e(format);
        this.f35250i = j3;
    }

    /* renamed from: e */
    public long mo2104e() {
        long j = this.f35250i;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    /* renamed from: f */
    public abstract boolean mo2103f();
}
