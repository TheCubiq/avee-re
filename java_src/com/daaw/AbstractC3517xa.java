package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
/* renamed from: com.daaw.xa */
/* loaded from: classes.dex */
public abstract class AbstractC3517xa implements a41, b41 {

    /* renamed from: p */
    public final int f32259p;

    /* renamed from: q */
    public c41 f32260q;

    /* renamed from: r */
    public int f32261r;

    /* renamed from: s */
    public int f32262s;

    /* renamed from: t */
    public d81 f32263t;

    /* renamed from: u */
    public Format[] f32264u;

    /* renamed from: v */
    public long f32265v;

    /* renamed from: w */
    public boolean f32266w = true;

    /* renamed from: x */
    public boolean f32267x;

    public AbstractC3517xa(int i) {
        this.f32259p = i;
    }

    /* renamed from: I */
    public static boolean m5365I(InterfaceC3746yu<?> interfaceC3746yu, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC3746yu == null) {
            return false;
        }
        return interfaceC3746yu.mo1673d(drmInitData);
    }

    /* renamed from: A */
    public abstract void mo3466A();

    /* renamed from: B */
    public void mo5370B(boolean z) {
    }

    /* renamed from: C */
    public abstract void mo3465C(long j, boolean z);

    /* renamed from: D */
    public void mo5369D() {
    }

    /* renamed from: E */
    public void mo5368E() {
    }

    /* renamed from: F */
    public void mo3464F(Format[] formatArr, long j) {
    }

    /* renamed from: G */
    public final int m5367G(k30 k30Var, C1454gq c1454gq, boolean z) {
        int mo3786j = this.f32263t.mo3786j(k30Var, c1454gq, z);
        if (mo3786j == -4) {
            if (c1454gq.m11437j()) {
                this.f32266w = true;
                return this.f32267x ? -4 : -3;
            }
            c1454gq.f11566s += this.f32265v;
        } else if (mo3786j == -5) {
            Format format = k30Var.f15633a;
            long j = format.f35711L;
            if (j != Long.MAX_VALUE) {
                k30Var.f15633a = format.m1726l(j + this.f32265v);
            }
        }
        return mo3786j;
    }

    /* renamed from: H */
    public int m5366H(long j) {
        return this.f32263t.mo3785n(j - this.f32265v);
    }

    @Override // com.daaw.a41
    /* renamed from: b */
    public final d81 mo5364b() {
        return this.f32263t;
    }

    @Override // com.daaw.a41
    /* renamed from: e */
    public final void mo5363e(int i) {
        this.f32261r = i;
    }

    @Override // com.daaw.a41
    /* renamed from: g */
    public final void mo5362g() {
        C2914s6.m10685f(this.f32262s == 1);
        this.f32262s = 0;
        this.f32263t = null;
        this.f32264u = null;
        this.f32267x = false;
        mo3466A();
    }

    @Override // com.daaw.a41
    public final int getState() {
        return this.f32262s;
    }

    @Override // com.daaw.a41, com.daaw.b41
    /* renamed from: i */
    public final int mo5361i() {
        return this.f32259p;
    }

    @Override // com.daaw.a41
    /* renamed from: j */
    public final boolean mo5360j() {
        return this.f32266w;
    }

    @Override // com.daaw.a41
    /* renamed from: k */
    public final void mo5359k(c41 c41Var, Format[] formatArr, d81 d81Var, long j, boolean z, long j2) {
        C2914s6.m10685f(this.f32262s == 0);
        this.f32260q = c41Var;
        this.f32262s = 1;
        mo5370B(z);
        mo5357m(formatArr, d81Var, j2);
        mo3465C(j, z);
    }

    @Override // com.daaw.a41
    /* renamed from: l */
    public final void mo5358l() {
        this.f32267x = true;
    }

    @Override // com.daaw.a41
    /* renamed from: m */
    public final void mo5357m(Format[] formatArr, d81 d81Var, long j) {
        C2914s6.m10685f(!this.f32267x);
        this.f32263t = d81Var;
        this.f32266w = false;
        this.f32264u = formatArr;
        this.f32265v = j;
        mo3464F(formatArr, j);
    }

    @Override // com.daaw.a41
    /* renamed from: n */
    public final b41 mo5356n() {
        return this;
    }

    /* renamed from: p */
    public int mo5355p() {
        return 0;
    }

    @Override // com.daaw.fx0.InterfaceC1343b
    /* renamed from: r */
    public void mo5354r(int i, Object obj) {
    }

    @Override // com.daaw.a41
    /* renamed from: s */
    public final void mo5353s() {
        this.f32263t.mo3789a();
    }

    @Override // com.daaw.a41
    public final void start() {
        C2914s6.m10685f(this.f32262s == 1);
        this.f32262s = 2;
        mo5369D();
    }

    @Override // com.daaw.a41
    public final void stop() {
        C2914s6.m10685f(this.f32262s == 2);
        this.f32262s = 1;
        mo5368E();
    }

    @Override // com.daaw.a41
    /* renamed from: t */
    public final void mo5352t(long j) {
        this.f32267x = false;
        this.f32266w = false;
        mo3465C(j, false);
    }

    @Override // com.daaw.a41
    /* renamed from: u */
    public final boolean mo5351u() {
        return this.f32267x;
    }

    @Override // com.daaw.a41
    /* renamed from: v */
    public ao0 mo5350v() {
        return null;
    }

    /* renamed from: w */
    public final c41 m5349w() {
        return this.f32260q;
    }

    /* renamed from: x */
    public final int m5348x() {
        return this.f32261r;
    }

    /* renamed from: y */
    public final Format[] m5347y() {
        return this.f32264u;
    }

    /* renamed from: z */
    public final boolean m5346z() {
        return this.f32266w ? this.f32267x : this.f32263t.mo3787d();
    }
}
