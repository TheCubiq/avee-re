package com.daaw;

import com.daaw.bp0;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* loaded from: classes.dex */
public final class yw0 {
    public final nl1 a;
    public final Object b;
    public final bp0.a c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final TrackGroupArray h;
    public final xm1 i;
    public volatile long j;
    public volatile long k;

    public yw0(nl1 nl1Var, long j, TrackGroupArray trackGroupArray, xm1 xm1Var) {
        this(nl1Var, null, new bp0.a(0), j, -9223372036854775807L, 1, false, trackGroupArray, xm1Var);
    }

    public yw0(nl1 nl1Var, Object obj, bp0.a aVar, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, xm1 xm1Var) {
        this.a = nl1Var;
        this.b = obj;
        this.c = aVar;
        this.d = j;
        this.e = j2;
        this.j = j;
        this.k = j;
        this.f = i;
        this.g = z;
        this.h = trackGroupArray;
        this.i = xm1Var;
    }

    public static void a(yw0 yw0Var, yw0 yw0Var2) {
        yw0Var2.j = yw0Var.j;
        yw0Var2.k = yw0Var.k;
    }

    public yw0 b(boolean z) {
        yw0 yw0Var = new yw0(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i);
        a(this, yw0Var);
        return yw0Var;
    }

    public yw0 c(int i) {
        yw0 yw0Var = new yw0(this.a, this.b, this.c.a(i), this.d, this.e, this.f, this.g, this.h, this.i);
        a(this, yw0Var);
        return yw0Var;
    }

    public yw0 d(int i) {
        yw0 yw0Var = new yw0(this.a, this.b, this.c, this.d, this.e, i, this.g, this.h, this.i);
        a(this, yw0Var);
        return yw0Var;
    }

    public yw0 e(nl1 nl1Var, Object obj) {
        yw0 yw0Var = new yw0(nl1Var, obj, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        a(this, yw0Var);
        return yw0Var;
    }

    public yw0 f(TrackGroupArray trackGroupArray, xm1 xm1Var) {
        yw0 yw0Var = new yw0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, trackGroupArray, xm1Var);
        a(this, yw0Var);
        return yw0Var;
    }

    public yw0 g(bp0.a aVar, long j, long j2) {
        return new yw0(this.a, this.b, aVar, j, aVar.b() ? j2 : -9223372036854775807L, this.f, this.g, this.h, this.i);
    }
}
