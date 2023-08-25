package com.daaw;

import android.os.Handler;
import java.util.HashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class sq8 extends lq8 {

    /* renamed from: h */
    public final HashMap f26538h = new HashMap();

    /* renamed from: i */
    public Handler f26539i;

    /* renamed from: j */
    public qz6 f26540j;

    /* renamed from: A */
    public final void m9988A(final Object obj, rr8 rr8Var) {
        uo4.m7874d(!this.f26538h.containsKey(obj));
        qr8 qr8Var = new qr8() { // from class: com.daaw.pq8
            @Override // com.daaw.qr8
            /* renamed from: a */
            public final void mo4028a(rr8 rr8Var2, l64 l64Var) {
                sq8.this.mo9984E(obj, rr8Var2, l64Var);
            }
        };
        qq8 qq8Var = new qq8(this, obj);
        this.f26538h.put(obj, new rq8(rr8Var, qr8Var, qq8Var));
        Handler handler = this.f26539i;
        Objects.requireNonNull(handler);
        rr8Var.mo11005f(handler, qq8Var);
        Handler handler2 = this.f26539i;
        Objects.requireNonNull(handler2);
        rr8Var.mo11006d(handler2, qq8Var);
        rr8Var.mo10998m(qr8Var, this.f26540j, m16644o());
        if (m16638z()) {
            return;
        }
        rr8Var.mo11008a(qr8Var);
    }

    /* renamed from: B */
    public int mo9987B(Object obj, int i) {
        return i;
    }

    /* renamed from: C */
    public long mo9986C(Object obj, long j) {
        return j;
    }

    /* renamed from: D */
    public abstract pr8 mo9985D(Object obj, pr8 pr8Var);

    /* renamed from: E */
    public abstract void mo9984E(Object obj, rr8 rr8Var, l64 l64Var);

    @Override // com.daaw.rr8
    /* renamed from: e */
    public void mo9983e() {
        for (rq8 rq8Var : this.f26538h.values()) {
            rq8Var.f25525a.mo9983e();
        }
    }

    @Override // com.daaw.lq8
    /* renamed from: u */
    public final void mo9982u() {
        for (rq8 rq8Var : this.f26538h.values()) {
            rq8Var.f25525a.mo11008a(rq8Var.f25526b);
        }
    }

    @Override // com.daaw.lq8
    /* renamed from: v */
    public final void mo9981v() {
        for (rq8 rq8Var : this.f26538h.values()) {
            rq8Var.f25525a.mo11001j(rq8Var.f25526b);
        }
    }

    @Override // com.daaw.lq8
    /* renamed from: w */
    public void mo9980w(qz6 qz6Var) {
        this.f26540j = qz6Var;
        this.f26539i = it5.m19399d(null);
    }

    @Override // com.daaw.lq8
    /* renamed from: y */
    public void mo9979y() {
        for (rq8 rq8Var : this.f26538h.values()) {
            rq8Var.f25525a.mo10997n(rq8Var.f25526b);
            rq8Var.f25525a.mo11004g(rq8Var.f25527c);
            rq8Var.f25525a.mo11002i(rq8Var.f25527c);
        }
        this.f26538h.clear();
    }
}
