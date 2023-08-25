package com.daaw;

import com.google.android.exoplayer2.source.TrackGroupArray;
/* loaded from: classes.dex */
public class lr implements hk0 {
    public final jq a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public int h;
    public boolean i;

    public lr() {
        this(new jq(true, 65536));
    }

    @Deprecated
    public lr(jq jqVar) {
        this(jqVar, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public lr(jq jqVar, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(jqVar, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public lr(jq jqVar, int i, int i2, int i3, int i4, int i5, boolean z, gz0 gz0Var) {
        j(i3, 0, "bufferForPlaybackMs", "0");
        j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        j(i, i3, "minBufferMs", "bufferForPlaybackMs");
        j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        j(i2, i, "maxBufferMs", "minBufferMs");
        this.a = jqVar;
        this.b = i * 1000;
        this.c = i2 * 1000;
        this.d = i3 * 1000;
        this.e = i4 * 1000;
        this.f = i5;
        this.g = z;
    }

    public static void j(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        s6.b(z, str + " cannot be less than " + str2);
    }

    @Override // com.daaw.hk0
    public void a() {
        l(false);
    }

    @Override // com.daaw.hk0
    public boolean b() {
        return false;
    }

    @Override // com.daaw.hk0
    public void c(a41[] a41VarArr, TrackGroupArray trackGroupArray, um1 um1Var) {
        int i = this.f;
        if (i == -1) {
            i = k(a41VarArr, um1Var);
        }
        this.h = i;
        this.a.h(i);
    }

    @Override // com.daaw.hk0
    public long d() {
        return 0L;
    }

    @Override // com.daaw.hk0
    public boolean e(long j, float f, boolean z) {
        long z2 = sq1.z(j, f);
        long j2 = z ? this.e : this.d;
        return j2 <= 0 || z2 >= j2 || (!this.g && this.a.f() >= this.h);
    }

    @Override // com.daaw.hk0
    public boolean f(long j, float f) {
        boolean z = true;
        boolean z2 = this.a.f() >= this.h;
        long j2 = this.b;
        if (f > 1.0f) {
            j2 = Math.min(sq1.w(j2, f), this.c);
        }
        if (j < j2) {
            if (!this.g && z2) {
                z = false;
            }
            this.i = z;
        } else if (j > this.c || z2) {
            this.i = false;
        }
        return this.i;
    }

    @Override // com.daaw.hk0
    public void g() {
        l(true);
    }

    @Override // com.daaw.hk0
    public l2 h() {
        return this.a;
    }

    @Override // com.daaw.hk0
    public void i() {
        l(true);
    }

    public int k(a41[] a41VarArr, um1 um1Var) {
        int i = 0;
        for (int i2 = 0; i2 < a41VarArr.length; i2++) {
            if (um1Var.a(i2) != null) {
                i += sq1.u(a41VarArr[i2].i());
            }
        }
        return i;
    }

    public final void l(boolean z) {
        this.h = 0;
        this.i = false;
        if (z) {
            this.a.g();
        }
    }
}
