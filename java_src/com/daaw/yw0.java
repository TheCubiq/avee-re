package com.daaw;

import com.daaw.bp0;
import com.google.android.exoplayer2.source.TrackGroupArray;
/* loaded from: classes.dex */
public final class yw0 {

    /* renamed from: a */
    public final nl1 f34179a;

    /* renamed from: b */
    public final Object f34180b;

    /* renamed from: c */
    public final bp0.C0880a f34181c;

    /* renamed from: d */
    public final long f34182d;

    /* renamed from: e */
    public final long f34183e;

    /* renamed from: f */
    public final int f34184f;

    /* renamed from: g */
    public final boolean f34185g;

    /* renamed from: h */
    public final TrackGroupArray f34186h;

    /* renamed from: i */
    public final xm1 f34187i;

    /* renamed from: j */
    public volatile long f34188j;

    /* renamed from: k */
    public volatile long f34189k;

    public yw0(nl1 nl1Var, long j, TrackGroupArray trackGroupArray, xm1 xm1Var) {
        this(nl1Var, null, new bp0.C0880a(0), j, -9223372036854775807L, 1, false, trackGroupArray, xm1Var);
    }

    public yw0(nl1 nl1Var, Object obj, bp0.C0880a c0880a, long j, long j2, int i, boolean z, TrackGroupArray trackGroupArray, xm1 xm1Var) {
        this.f34179a = nl1Var;
        this.f34180b = obj;
        this.f34181c = c0880a;
        this.f34182d = j;
        this.f34183e = j2;
        this.f34188j = j;
        this.f34189k = j;
        this.f34184f = i;
        this.f34185g = z;
        this.f34186h = trackGroupArray;
        this.f34187i = xm1Var;
    }

    /* renamed from: a */
    public static void m3162a(yw0 yw0Var, yw0 yw0Var2) {
        yw0Var2.f34188j = yw0Var.f34188j;
        yw0Var2.f34189k = yw0Var.f34189k;
    }

    /* renamed from: b */
    public yw0 m3161b(boolean z) {
        yw0 yw0Var = new yw0(this.f34179a, this.f34180b, this.f34181c, this.f34182d, this.f34183e, this.f34184f, z, this.f34186h, this.f34187i);
        m3162a(this, yw0Var);
        return yw0Var;
    }

    /* renamed from: c */
    public yw0 m3160c(int i) {
        yw0 yw0Var = new yw0(this.f34179a, this.f34180b, this.f34181c.m25955a(i), this.f34182d, this.f34183e, this.f34184f, this.f34185g, this.f34186h, this.f34187i);
        m3162a(this, yw0Var);
        return yw0Var;
    }

    /* renamed from: d */
    public yw0 m3159d(int i) {
        yw0 yw0Var = new yw0(this.f34179a, this.f34180b, this.f34181c, this.f34182d, this.f34183e, i, this.f34185g, this.f34186h, this.f34187i);
        m3162a(this, yw0Var);
        return yw0Var;
    }

    /* renamed from: e */
    public yw0 m3158e(nl1 nl1Var, Object obj) {
        yw0 yw0Var = new yw0(nl1Var, obj, this.f34181c, this.f34182d, this.f34183e, this.f34184f, this.f34185g, this.f34186h, this.f34187i);
        m3162a(this, yw0Var);
        return yw0Var;
    }

    /* renamed from: f */
    public yw0 m3157f(TrackGroupArray trackGroupArray, xm1 xm1Var) {
        yw0 yw0Var = new yw0(this.f34179a, this.f34180b, this.f34181c, this.f34182d, this.f34183e, this.f34184f, this.f34185g, trackGroupArray, xm1Var);
        m3162a(this, yw0Var);
        return yw0Var;
    }

    /* renamed from: g */
    public yw0 m3156g(bp0.C0880a c0880a, long j, long j2) {
        return new yw0(this.f34179a, this.f34180b, c0880a, j, c0880a.m25954b() ? j2 : -9223372036854775807L, this.f34184f, this.f34185g, this.f34186h, this.f34187i);
    }
}
