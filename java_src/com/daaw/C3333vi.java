package com.daaw;
/* renamed from: com.daaw.vi */
/* loaded from: classes.dex */
public class C3333vi implements gb1 {

    /* renamed from: p */
    public final gb1[] f30239p;

    public C3333vi(gb1[] gb1VarArr) {
        this.f30239p = gb1VarArr;
    }

    @Override // com.daaw.gb1
    /* renamed from: b */
    public final long mo2087b() {
        long j = Long.MAX_VALUE;
        for (gb1 gb1Var : this.f30239p) {
            long mo2087b = gb1Var.mo2087b();
            if (mo2087b != Long.MIN_VALUE) {
                j = Math.min(j, mo2087b);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.daaw.gb1
    /* renamed from: c */
    public boolean mo2086c(long j) {
        gb1[] gb1VarArr;
        boolean z;
        boolean z2 = false;
        do {
            long mo2087b = mo2087b();
            if (mo2087b == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (gb1 gb1Var : this.f30239p) {
                long mo2087b2 = gb1Var.mo2087b();
                boolean z3 = mo2087b2 != Long.MIN_VALUE && mo2087b2 <= j;
                if (mo2087b2 == mo2087b || z3) {
                    z |= gb1Var.mo2086c(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.daaw.gb1
    /* renamed from: f */
    public final long mo2083f() {
        long j = Long.MAX_VALUE;
        for (gb1 gb1Var : this.f30239p) {
            long mo2083f = gb1Var.mo2083f();
            if (mo2083f != Long.MIN_VALUE) {
                j = Math.min(j, mo2083f);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.daaw.gb1
    /* renamed from: g */
    public final void mo2082g(long j) {
        for (gb1 gb1Var : this.f30239p) {
            gb1Var.mo2082g(j);
        }
    }
}
