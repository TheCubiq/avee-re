package com.daaw;
/* loaded from: classes2.dex */
public final class fv extends IllegalStateException {
    public fv(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(rj1<?> rj1Var) {
        if (rj1Var.m()) {
            Exception j = rj1Var.j();
            return new fv("Complete with: ".concat(j != null ? "failure" : rj1Var.n() ? "result ".concat(String.valueOf(rj1Var.k())) : rj1Var.l() ? "cancellation" : "unknown issue"), j);
        }
        return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
}
