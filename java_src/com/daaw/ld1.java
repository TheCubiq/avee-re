package com.daaw;
/* loaded from: classes.dex */
public abstract class ld1<Z> extends ya<Z> {
    public final int q;
    public final int r;

    public ld1() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public ld1(int i, int i2) {
        this.q = i;
        this.r = i2;
    }

    @Override // com.daaw.pj1
    public final void e(sd1 sd1Var) {
        if (tq1.l(this.q, this.r)) {
            sd1Var.f(this.q, this.r);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.q + " and height: " + this.r + ", either provide dimensions in the constructor or call override()");
    }
}
