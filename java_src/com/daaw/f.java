package com.daaw;
/* loaded from: classes2.dex */
public abstract class f<T> extends uh0 implements gl<T> {
    public final nl q;

    @Override // com.daaw.uh0
    public final void H(Throwable th) {
        sl.a(this.q, th);
    }

    @Override // com.daaw.uh0
    public String O() {
        String a = ol.a(this.q);
        if (a == null) {
            return super.O();
        }
        return '\"' + a + "\":" + super.O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.daaw.uh0
    public final void U(Object obj) {
        if (!(obj instanceof nh)) {
            k0(obj);
            return;
        }
        nh nhVar = (nh) obj;
        j0(nhVar.a, nhVar.a());
    }

    @Override // com.daaw.gl
    public final void b(Object obj) {
        Object M = M(rh.d(obj, null, 1, null));
        if (M == vh0.b) {
            return;
        }
        i0(M);
    }

    @Override // com.daaw.uh0, com.daaw.mh0
    public boolean d() {
        return super.d();
    }

    @Override // com.daaw.gl
    public final nl getContext() {
        return this.q;
    }

    public void i0(Object obj) {
        h(obj);
    }

    public void j0(Throwable th, boolean z) {
    }

    public void k0(T t) {
    }

    @Override // com.daaw.uh0
    public String m() {
        return ug0.l(aq.a(this), " was cancelled");
    }
}
