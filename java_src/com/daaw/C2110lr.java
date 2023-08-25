package com.daaw;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* renamed from: com.daaw.lr */
/* loaded from: classes.dex */
public class C2110lr implements hk0 {

    /* renamed from: a */
    public final C1855jq f17651a;

    /* renamed from: b */
    public final long f17652b;

    /* renamed from: c */
    public final long f17653c;

    /* renamed from: d */
    public final long f17654d;

    /* renamed from: e */
    public final long f17655e;

    /* renamed from: f */
    public final int f17656f;

    /* renamed from: g */
    public final boolean f17657g;

    /* renamed from: h */
    public int f17658h;

    /* renamed from: i */
    public boolean f17659i;

    public C2110lr() {
        this(new C1855jq(true, 65536));
    }

    @Deprecated
    public C2110lr(C1855jq c1855jq) {
        this(c1855jq, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public C2110lr(C1855jq c1855jq, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(c1855jq, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public C2110lr(C1855jq c1855jq, int i, int i2, int i3, int i4, int i5, boolean z, gz0 gz0Var) {
        m16628j(i3, 0, "bufferForPlaybackMs", "0");
        m16628j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m16628j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        m16628j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m16628j(i2, i, "maxBufferMs", "minBufferMs");
        this.f17651a = c1855jq;
        this.f17652b = i * 1000;
        this.f17653c = i2 * 1000;
        this.f17654d = i3 * 1000;
        this.f17655e = i4 * 1000;
        this.f17656f = i5;
        this.f17657g = z;
    }

    /* renamed from: j */
    public static void m16628j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C2914s6.m10689b(z, str + " cannot be less than " + str2);
    }

    @Override // com.daaw.hk0
    /* renamed from: a */
    public void mo16637a() {
        m16626l(false);
    }

    @Override // com.daaw.hk0
    /* renamed from: b */
    public boolean mo16636b() {
        return false;
    }

    @Override // com.daaw.hk0
    /* renamed from: c */
    public void mo16635c(a41[] a41VarArr, TrackGroupArray trackGroupArray, um1 um1Var) {
        int i = this.f17656f;
        if (i == -1) {
            i = m16627k(a41VarArr, um1Var);
        }
        this.f17658h = i;
        this.f17651a.m18340h(i);
    }

    @Override // com.daaw.hk0
    /* renamed from: d */
    public long mo16634d() {
        return 0L;
    }

    @Override // com.daaw.hk0
    /* renamed from: e */
    public boolean mo16633e(long j, float f, boolean z) {
        long m9990z = sq1.m9990z(j, f);
        long j2 = z ? this.f17655e : this.f17654d;
        return j2 <= 0 || m9990z >= j2 || (!this.f17657g && this.f17651a.m18342f() >= this.f17658h);
    }

    @Override // com.daaw.hk0
    /* renamed from: f */
    public boolean mo16632f(long j, float f) {
        boolean z = true;
        boolean z2 = this.f17651a.m18342f() >= this.f17658h;
        long j2 = this.f17652b;
        if (f > 1.0f) {
            j2 = Math.min(sq1.m9993w(j2, f), this.f17653c);
        }
        if (j < j2) {
            if (!this.f17657g && z2) {
                z = false;
            }
            this.f17659i = z;
        } else if (j > this.f17653c || z2) {
            this.f17659i = false;
        }
        return this.f17659i;
    }

    @Override // com.daaw.hk0
    /* renamed from: g */
    public void mo16631g() {
        m16626l(true);
    }

    @Override // com.daaw.hk0
    /* renamed from: h */
    public InterfaceC2006l2 mo16630h() {
        return this.f17651a;
    }

    @Override // com.daaw.hk0
    /* renamed from: i */
    public void mo16629i() {
        m16626l(true);
    }

    /* renamed from: k */
    public int m16627k(a41[] a41VarArr, um1 um1Var) {
        int i = 0;
        for (int i2 = 0; i2 < a41VarArr.length; i2++) {
            if (um1Var.m8019a(i2) != null) {
                i += sq1.m9995u(a41VarArr[i2].mo5361i());
            }
        }
        return i;
    }

    /* renamed from: l */
    public final void m16626l(boolean z) {
        this.f17658h = 0;
        this.f17659i = false;
        if (z) {
            this.f17651a.m18341g();
        }
    }
}
