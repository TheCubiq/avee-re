package com.daaw;

import java.util.Objects;
/* loaded from: classes.dex */
public final class nq8 implements mt8 {
    public final mt8 a;
    public boolean b;
    public final /* synthetic */ oq8 c;

    public nq8(oq8 oq8Var, mt8 mt8Var) {
        this.c = oq8Var;
        this.a = mt8Var;
    }

    @Override // com.daaw.mt8
    public final int a(long j) {
        if (this.c.i()) {
            return -3;
        }
        return this.a.a(j);
    }

    @Override // com.daaw.mt8
    public final int b(a78 a78Var, ma7 ma7Var, int i) {
        if (this.c.i()) {
            return -3;
        }
        if (this.b) {
            ma7Var.c(4);
            return -4;
        }
        int b = this.a.b(a78Var, ma7Var, i);
        if (b == -5) {
            f92 f92Var = a78Var.a;
            Objects.requireNonNull(f92Var);
            int i2 = f92Var.B;
            if (i2 == 0) {
                if (f92Var.C != 0) {
                    i2 = 0;
                }
                return -5;
            }
            int i3 = this.c.t == Long.MIN_VALUE ? f92Var.C : 0;
            b72 b2 = f92Var.b();
            b2.c(i2);
            b2.d(i3);
            a78Var.a = b2.y();
            return -5;
        }
        oq8 oq8Var = this.c;
        long j = oq8Var.t;
        if (j == Long.MIN_VALUE || ((b != -4 || ma7Var.e < j) && !(b == -3 && oq8Var.zzb() == Long.MIN_VALUE && !ma7Var.d))) {
            return b;
        }
        ma7Var.b();
        ma7Var.c(4);
        this.b = true;
        return -4;
    }

    public final void c() {
        this.b = false;
    }

    @Override // com.daaw.mt8
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.daaw.mt8
    public final boolean zze() {
        return !this.c.i() && this.a.zze();
    }
}
