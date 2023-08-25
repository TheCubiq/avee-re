package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class nq8 implements mt8 {

    /* renamed from: a */
    public final mt8 f20580a;

    /* renamed from: b */
    public boolean f20581b;

    /* renamed from: c */
    public final /* synthetic */ oq8 f20582c;

    public nq8(oq8 oq8Var, mt8 mt8Var) {
        this.f20582c = oq8Var;
        this.f20580a = mt8Var;
    }

    @Override // com.daaw.mt8
    /* renamed from: a */
    public final int mo6812a(long j) {
        if (this.f20582c.m14065i()) {
            return -3;
        }
        return this.f20580a.mo6812a(j);
    }

    @Override // com.daaw.mt8
    /* renamed from: b */
    public final int mo6811b(a78 a78Var, ma7 ma7Var, int i) {
        if (this.f20582c.m14065i()) {
            return -3;
        }
        if (this.f20581b) {
            ma7Var.m20163c(4);
            return -4;
        }
        int mo6811b = this.f20580a.mo6811b(a78Var, ma7Var, i);
        if (mo6811b == -5) {
            f92 f92Var = a78Var.f2960a;
            Objects.requireNonNull(f92Var);
            int i2 = f92Var.f9259B;
            if (i2 == 0) {
                if (f92Var.f9260C != 0) {
                    i2 = 0;
                }
                return -5;
            }
            int i3 = this.f20582c.f21844t == Long.MIN_VALUE ? f92Var.f9260C : 0;
            b72 m22830b = f92Var.m22830b();
            m22830b.m26394c(i2);
            m22830b.m26392d(i3);
            a78Var.f2960a = m22830b.m26366y();
            return -5;
        }
        oq8 oq8Var = this.f20582c;
        long j = oq8Var.f21844t;
        if (j == Long.MIN_VALUE || ((mo6811b != -4 || ma7Var.f18730e < j) && !(mo6811b == -3 && oq8Var.zzb() == Long.MIN_VALUE && !ma7Var.f18729d))) {
            return mo6811b;
        }
        ma7Var.mo6965b();
        ma7Var.m20163c(4);
        this.f20581b = true;
        return -4;
    }

    /* renamed from: c */
    public final void m14871c() {
        this.f20581b = false;
    }

    @Override // com.daaw.mt8
    public final void zzd() {
        this.f20580a.zzd();
    }

    @Override // com.daaw.mt8
    public final boolean zze() {
        return !this.f20582c.m14065i() && this.f20580a.zze();
    }
}
