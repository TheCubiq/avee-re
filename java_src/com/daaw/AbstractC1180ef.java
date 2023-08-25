package com.daaw;

import com.daaw.jk0;
import com.google.android.exoplayer2.Format;
/* renamed from: com.daaw.ef */
/* loaded from: classes.dex */
public abstract class AbstractC1180ef implements jk0.InterfaceC1836c {

    /* renamed from: a */
    public final C2570pp f8428a;

    /* renamed from: b */
    public final int f8429b;

    /* renamed from: c */
    public final Format f8430c;

    /* renamed from: d */
    public final int f8431d;

    /* renamed from: e */
    public final Object f8432e;

    /* renamed from: f */
    public final long f8433f;

    /* renamed from: g */
    public final long f8434g;

    /* renamed from: h */
    public final InterfaceC2200mp f8435h;

    public AbstractC1180ef(InterfaceC2200mp interfaceC2200mp, C2570pp c2570pp, int i, Format format, int i2, Object obj, long j, long j2) {
        this.f8435h = (InterfaceC2200mp) C2914s6.m10686e(interfaceC2200mp);
        this.f8428a = (C2570pp) C2914s6.m10686e(c2570pp);
        this.f8429b = i;
        this.f8430c = format;
        this.f8431d = i2;
        this.f8432e = obj;
        this.f8433f = j;
        this.f8434g = j2;
    }

    /* renamed from: c */
    public abstract long mo8279c();

    /* renamed from: d */
    public final long m23532d() {
        return this.f8434g - this.f8433f;
    }
}
