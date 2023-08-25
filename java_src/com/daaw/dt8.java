package com.daaw;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;
/* loaded from: classes.dex */
public final class dt8 extends lq8 implements us8 {
    public final f53 h;
    public final jv2 i;
    public final m36 j;
    public final vn8 k;
    public final int l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public qz6 q;
    public final at8 r;
    public final rw8 s;

    public /* synthetic */ dt8(f53 f53Var, m36 m36Var, at8 at8Var, vn8 vn8Var, rw8 rw8Var, int i, ct8 ct8Var, byte[] bArr) {
        jv2 jv2Var = f53Var.b;
        Objects.requireNonNull(jv2Var);
        this.i = jv2Var;
        this.h = f53Var;
        this.j = m36Var;
        this.r = at8Var;
        this.k = vn8Var;
        this.s = rw8Var;
        this.l = i;
        this.m = true;
        this.n = -9223372036854775807L;
    }

    public final void A() {
        long j = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        f53 f53Var = this.h;
        xt8 xt8Var = new xt8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, f53Var, z2 ? f53Var.d : null);
        x(this.m ? new zs8(this, xt8Var) : xt8Var);
    }

    @Override // com.daaw.us8
    public final void c(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.n;
        }
        if (!this.m && this.n == j && this.o == z && this.p == z2) {
            return;
        }
        this.n = j;
        this.o = z;
        this.p = z2;
        this.m = false;
        A();
    }

    @Override // com.daaw.rr8
    public final void e() {
    }

    @Override // com.daaw.rr8
    public final f53 h() {
        return this.h;
    }

    @Override // com.daaw.rr8
    public final nr8 k(pr8 pr8Var, nw8 nw8Var, long j) {
        p46 zza = this.j.zza();
        qz6 qz6Var = this.q;
        if (qz6Var != null) {
            zza.d(qz6Var);
        }
        Uri uri = this.i.a;
        at8 at8Var = this.r;
        o();
        mq8 mq8Var = new mq8(at8Var.a);
        vn8 vn8Var = this.k;
        jn8 q = q(pr8Var);
        rw8 rw8Var = this.s;
        yr8 s = s(pr8Var);
        String str = this.i.d;
        return new ys8(uri, zza, mq8Var, vn8Var, q, rw8Var, s, this, nw8Var, null, this.l, null);
    }

    @Override // com.daaw.rr8
    public final void l(nr8 nr8Var) {
        ((ys8) nr8Var).v();
    }

    @Override // com.daaw.lq8
    public final void w(qz6 qz6Var) {
        this.q = qz6Var;
        Objects.requireNonNull(Looper.myLooper());
        o();
        A();
    }

    @Override // com.daaw.lq8
    public final void y() {
    }
}
