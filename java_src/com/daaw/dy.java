package com.daaw;
/* loaded from: classes2.dex */
public abstract class dy extends pl {
    public long q;
    public boolean r;
    public h6<eu<?>> s;

    public static /* synthetic */ void b0(dy dyVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        dyVar.a0(z);
    }

    public final void W(boolean z) {
        long X = this.q - X(z);
        this.q = X;
        if (X <= 0 && this.r) {
            shutdown();
        }
    }

    public final long X(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public final void Y(eu<?> euVar) {
        h6<eu<?>> h6Var = this.s;
        if (h6Var == null) {
            h6Var = new h6<>();
            this.s = h6Var;
        }
        h6Var.a(euVar);
    }

    public long Z() {
        h6<eu<?>> h6Var = this.s;
        return (h6Var == null || h6Var.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void a0(boolean z) {
        this.q += X(z);
        if (z) {
            return;
        }
        this.r = true;
    }

    public final boolean c0() {
        return this.q >= X(true);
    }

    public final boolean d0() {
        h6<eu<?>> h6Var = this.s;
        if (h6Var == null) {
            return true;
        }
        return h6Var.c();
    }

    public final boolean e0() {
        eu<?> d;
        h6<eu<?>> h6Var = this.s;
        if (h6Var == null || (d = h6Var.d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    public void shutdown() {
    }
}
