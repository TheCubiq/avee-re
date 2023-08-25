package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class xt8 extends l64 {

    /* renamed from: h */
    public static final Object f32949h = new Object();

    /* renamed from: i */
    public static final f53 f32950i;

    /* renamed from: c */
    public final long f32951c;

    /* renamed from: d */
    public final long f32952d;

    /* renamed from: e */
    public final boolean f32953e;

    /* renamed from: f */
    public final f53 f32954f;

    /* renamed from: g */
    public final ht2 f32955g;

    static {
        ee2 ee2Var = new ee2();
        ee2Var.m23540a("SinglePeriodTimeline");
        ee2Var.m23539b(Uri.EMPTY);
        f32950i = ee2Var.m23538c();
    }

    public xt8(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, f53 f53Var, ht2 ht2Var) {
        this.f32951c = j4;
        this.f32952d = j5;
        this.f32953e = z;
        this.f32954f = f53Var;
        this.f32955g = ht2Var;
    }

    @Override // com.daaw.l64
    /* renamed from: a */
    public final int mo4511a(Object obj) {
        return f32949h.equals(obj) ? 0 : -1;
    }

    @Override // com.daaw.l64
    /* renamed from: b */
    public final int mo4510b() {
        return 1;
    }

    @Override // com.daaw.l64
    /* renamed from: c */
    public final int mo4509c() {
        return 1;
    }

    @Override // com.daaw.l64
    /* renamed from: d */
    public final d34 mo1924d(int i, d34 d34Var, boolean z) {
        uo4.m7877a(i, 0, 1);
        d34Var.m24718k(null, z ? f32949h : null, 0, this.f32951c, 0L, fl4.f9664d, false);
        return d34Var;
    }

    @Override // com.daaw.l64
    /* renamed from: e */
    public final i54 mo1923e(int i, i54 i54Var, long j) {
        uo4.m7877a(i, 0, 1);
        i54Var.m20120a(i54.f13263o, this.f32954f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f32953e, false, this.f32955g, 0L, this.f32952d, 0, 0, 0L);
        return i54Var;
    }

    @Override // com.daaw.l64
    /* renamed from: f */
    public final Object mo4508f(int i) {
        uo4.m7877a(i, 0, 1);
        return f32949h;
    }
}
