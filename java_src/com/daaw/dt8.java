package com.daaw;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;
/* loaded from: classes.dex */
public final class dt8 extends lq8 implements us8 {

    /* renamed from: h */
    public final f53 f7792h;

    /* renamed from: i */
    public final jv2 f7793i;

    /* renamed from: j */
    public final m36 f7794j;

    /* renamed from: k */
    public final vn8 f7795k;

    /* renamed from: l */
    public final int f7796l;

    /* renamed from: m */
    public boolean f7797m;

    /* renamed from: n */
    public long f7798n;

    /* renamed from: o */
    public boolean f7799o;

    /* renamed from: p */
    public boolean f7800p;

    /* renamed from: q */
    public qz6 f7801q;

    /* renamed from: r */
    public final at8 f7802r;

    /* renamed from: s */
    public final rw8 f7803s;

    public /* synthetic */ dt8(f53 f53Var, m36 m36Var, at8 at8Var, vn8 vn8Var, rw8 rw8Var, int i, ct8 ct8Var, byte[] bArr) {
        jv2 jv2Var = f53Var.f9119b;
        Objects.requireNonNull(jv2Var);
        this.f7793i = jv2Var;
        this.f7792h = f53Var;
        this.f7794j = m36Var;
        this.f7802r = at8Var;
        this.f7795k = vn8Var;
        this.f7803s = rw8Var;
        this.f7796l = i;
        this.f7797m = true;
        this.f7798n = -9223372036854775807L;
    }

    /* renamed from: A */
    public final void m23949A() {
        long j = this.f7798n;
        boolean z = this.f7799o;
        boolean z2 = this.f7800p;
        f53 f53Var = this.f7792h;
        xt8 xt8Var = new xt8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, f53Var, z2 ? f53Var.f9121d : null);
        m16639x(this.f7797m ? new zs8(this, xt8Var) : xt8Var);
    }

    @Override // com.daaw.us8
    /* renamed from: c */
    public final void mo7740c(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f7798n;
        }
        if (!this.f7797m && this.f7798n == j && this.f7799o == z && this.f7800p == z2) {
            return;
        }
        this.f7798n = j;
        this.f7799o = z;
        this.f7800p = z2;
        this.f7797m = false;
        m23949A();
    }

    @Override // com.daaw.rr8
    /* renamed from: e */
    public final void mo9983e() {
    }

    @Override // com.daaw.rr8
    /* renamed from: h */
    public final f53 mo11003h() {
        return this.f7792h;
    }

    @Override // com.daaw.rr8
    /* renamed from: k */
    public final nr8 mo11000k(pr8 pr8Var, nw8 nw8Var, long j) {
        p46 zza = this.f7794j.zza();
        qz6 qz6Var = this.f7801q;
        if (qz6Var != null) {
            zza.mo1979d(qz6Var);
        }
        Uri uri = this.f7793i.f15455a;
        at8 at8Var = this.f7802r;
        m16644o();
        mq8 mq8Var = new mq8(at8Var.f3594a);
        vn8 vn8Var = this.f7795k;
        jn8 m16643q = m16643q(pr8Var);
        rw8 rw8Var = this.f7803s;
        yr8 m16641s = m16641s(pr8Var);
        String str = this.f7793i.f15458d;
        return new ys8(uri, zza, mq8Var, vn8Var, m16643q, rw8Var, m16641s, this, nw8Var, null, this.f7796l, null);
    }

    @Override // com.daaw.rr8
    /* renamed from: l */
    public final void mo10999l(nr8 nr8Var) {
        ((ys8) nr8Var).m3284v();
    }

    @Override // com.daaw.lq8
    /* renamed from: w */
    public final void mo9980w(qz6 qz6Var) {
        this.f7801q = qz6Var;
        Objects.requireNonNull(Looper.myLooper());
        m16644o();
        m23949A();
    }

    @Override // com.daaw.lq8
    /* renamed from: y */
    public final void mo9979y() {
    }
}
