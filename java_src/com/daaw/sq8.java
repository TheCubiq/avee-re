package com.daaw;

import android.os.Handler;
import java.util.HashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class sq8 extends lq8 {
    public final HashMap h = new HashMap();
    public Handler i;
    public qz6 j;

    public final void A(final Object obj, rr8 rr8Var) {
        uo4.d(!this.h.containsKey(obj));
        qr8 qr8Var = new qr8() { // from class: com.daaw.pq8
            @Override // com.daaw.qr8
            public final void a(rr8 rr8Var2, l64 l64Var) {
                sq8.this.E(obj, rr8Var2, l64Var);
            }
        };
        qq8 qq8Var = new qq8(this, obj);
        this.h.put(obj, new rq8(rr8Var, qr8Var, qq8Var));
        Handler handler = this.i;
        Objects.requireNonNull(handler);
        rr8Var.f(handler, qq8Var);
        Handler handler2 = this.i;
        Objects.requireNonNull(handler2);
        rr8Var.d(handler2, qq8Var);
        rr8Var.m(qr8Var, this.j, o());
        if (z()) {
            return;
        }
        rr8Var.a(qr8Var);
    }

    public int B(Object obj, int i) {
        return i;
    }

    public long C(Object obj, long j) {
        return j;
    }

    public abstract pr8 D(Object obj, pr8 pr8Var);

    public abstract void E(Object obj, rr8 rr8Var, l64 l64Var);

    @Override // com.daaw.rr8
    public void e() {
        for (rq8 rq8Var : this.h.values()) {
            rq8Var.a.e();
        }
    }

    @Override // com.daaw.lq8
    public final void u() {
        for (rq8 rq8Var : this.h.values()) {
            rq8Var.a.a(rq8Var.b);
        }
    }

    @Override // com.daaw.lq8
    public final void v() {
        for (rq8 rq8Var : this.h.values()) {
            rq8Var.a.j(rq8Var.b);
        }
    }

    @Override // com.daaw.lq8
    public void w(qz6 qz6Var) {
        this.j = qz6Var;
        this.i = it5.d(null);
    }

    @Override // com.daaw.lq8
    public void y() {
        for (rq8 rq8Var : this.h.values()) {
            rq8Var.a.n(rq8Var.b);
            rq8Var.a.g(rq8Var.c);
            rq8Var.a.i(rq8Var.c);
        }
        this.h.clear();
    }
}
