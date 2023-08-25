package com.daaw;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class lq8 implements rr8 {

    /* renamed from: a */
    public final ArrayList f17644a = new ArrayList(1);

    /* renamed from: b */
    public final HashSet f17645b = new HashSet(1);

    /* renamed from: c */
    public final yr8 f17646c = new yr8();

    /* renamed from: d */
    public final jn8 f17647d = new jn8();

    /* renamed from: e */
    public Looper f17648e;

    /* renamed from: f */
    public l64 f17649f;

    /* renamed from: g */
    public lh8 f17650g;

    @Override // com.daaw.rr8
    /* renamed from: a */
    public final void mo11008a(qr8 qr8Var) {
        boolean isEmpty = this.f17645b.isEmpty();
        this.f17645b.remove(qr8Var);
        if ((!isEmpty) && this.f17645b.isEmpty()) {
            mo9982u();
        }
    }

    @Override // com.daaw.rr8
    /* renamed from: b */
    public /* synthetic */ boolean mo11007b() {
        return true;
    }

    @Override // com.daaw.rr8
    /* renamed from: d */
    public final void mo11006d(Handler handler, ln8 ln8Var) {
        Objects.requireNonNull(ln8Var);
        this.f17647d.m18378b(handler, ln8Var);
    }

    @Override // com.daaw.rr8
    /* renamed from: f */
    public final void mo11005f(Handler handler, zr8 zr8Var) {
        Objects.requireNonNull(zr8Var);
        this.f17646c.m3371b(handler, zr8Var);
    }

    @Override // com.daaw.rr8
    /* renamed from: g */
    public final void mo11004g(zr8 zr8Var) {
        this.f17646c.m3360m(zr8Var);
    }

    @Override // com.daaw.rr8
    /* renamed from: i */
    public final void mo11002i(ln8 ln8Var) {
        this.f17647d.m18377c(ln8Var);
    }

    @Override // com.daaw.rr8
    /* renamed from: j */
    public final void mo11001j(qr8 qr8Var) {
        Objects.requireNonNull(this.f17648e);
        boolean isEmpty = this.f17645b.isEmpty();
        this.f17645b.add(qr8Var);
        if (isEmpty) {
            mo9981v();
        }
    }

    @Override // com.daaw.rr8
    /* renamed from: m */
    public final void mo10998m(qr8 qr8Var, qz6 qz6Var, lh8 lh8Var) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f17648e;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        uo4.m7874d(z);
        this.f17650g = lh8Var;
        l64 l64Var = this.f17649f;
        this.f17644a.add(qr8Var);
        if (this.f17648e == null) {
            this.f17648e = myLooper;
            this.f17645b.add(qr8Var);
            mo9980w(qz6Var);
        } else if (l64Var != null) {
            mo11001j(qr8Var);
            qr8Var.mo4028a(this, l64Var);
        }
    }

    @Override // com.daaw.rr8
    /* renamed from: n */
    public final void mo10997n(qr8 qr8Var) {
        this.f17644a.remove(qr8Var);
        if (!this.f17644a.isEmpty()) {
            mo11008a(qr8Var);
            return;
        }
        this.f17648e = null;
        this.f17649f = null;
        this.f17650g = null;
        this.f17645b.clear();
        mo9979y();
    }

    /* renamed from: o */
    public final lh8 m16644o() {
        lh8 lh8Var = this.f17650g;
        uo4.m7876b(lh8Var);
        return lh8Var;
    }

    @Override // com.daaw.rr8
    /* renamed from: p */
    public /* synthetic */ l64 mo10996p() {
        return null;
    }

    /* renamed from: q */
    public final jn8 m16643q(pr8 pr8Var) {
        return this.f17647d.m18379a(0, pr8Var);
    }

    /* renamed from: r */
    public final jn8 m16642r(int i, pr8 pr8Var) {
        return this.f17647d.m18379a(i, pr8Var);
    }

    /* renamed from: s */
    public final yr8 m16641s(pr8 pr8Var) {
        return this.f17646c.m3372a(0, pr8Var, 0L);
    }

    /* renamed from: t */
    public final yr8 m16640t(int i, pr8 pr8Var, long j) {
        return this.f17646c.m3372a(i, pr8Var, 0L);
    }

    /* renamed from: u */
    public void mo9982u() {
    }

    /* renamed from: v */
    public void mo9981v() {
    }

    /* renamed from: w */
    public abstract void mo9980w(qz6 qz6Var);

    /* renamed from: x */
    public final void m16639x(l64 l64Var) {
        this.f17649f = l64Var;
        ArrayList arrayList = this.f17644a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qr8) arrayList.get(i)).mo4028a(this, l64Var);
        }
    }

    /* renamed from: y */
    public abstract void mo9979y();

    /* renamed from: z */
    public final boolean m16638z() {
        return !this.f17645b.isEmpty();
    }
}
