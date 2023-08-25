package com.daaw;
/* loaded from: classes.dex */
public abstract class ld1<Z> extends AbstractC3683ya<Z> {

    /* renamed from: q */
    public final int f17269q;

    /* renamed from: r */
    public final int f17270r;

    public ld1() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public ld1(int i, int i2) {
        this.f17269q = i;
        this.f17270r = i2;
    }

    @Override // com.daaw.pj1
    /* renamed from: e */
    public final void mo13330e(sd1 sd1Var) {
        if (tq1.m8859l(this.f17269q, this.f17270r)) {
            sd1Var.mo10453f(this.f17269q, this.f17270r);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f17269q + " and height: " + this.f17270r + ", either provide dimensions in the constructor or call override()");
    }
}
