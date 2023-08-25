package com.daaw;
/* loaded from: classes.dex */
public class vi implements gb1 {
    public final gb1[] p;

    public vi(gb1[] gb1VarArr) {
        this.p = gb1VarArr;
    }

    @Override // com.daaw.gb1
    public final long b() {
        long j = Long.MAX_VALUE;
        for (gb1 gb1Var : this.p) {
            long b = gb1Var.b();
            if (b != Long.MIN_VALUE) {
                j = Math.min(j, b);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.daaw.gb1
    public boolean c(long j) {
        gb1[] gb1VarArr;
        boolean z;
        boolean z2 = false;
        do {
            long b = b();
            if (b == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (gb1 gb1Var : this.p) {
                long b2 = gb1Var.b();
                boolean z3 = b2 != Long.MIN_VALUE && b2 <= j;
                if (b2 == b || z3) {
                    z |= gb1Var.c(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.daaw.gb1
    public final long f() {
        long j = Long.MAX_VALUE;
        for (gb1 gb1Var : this.p) {
            long f = gb1Var.f();
            if (f != Long.MIN_VALUE) {
                j = Math.min(j, f);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.daaw.gb1
    public final void g(long j) {
        for (gb1 gb1Var : this.p) {
            gb1Var.g(j);
        }
    }
}
