package com.daaw;
/* renamed from: com.daaw.fv */
/* loaded from: classes2.dex */
public final class C1332fv extends IllegalStateException {
    public C1332fv(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m22253a(rj1<?> rj1Var) {
        if (rj1Var.mo11237m()) {
            Exception mo11240j = rj1Var.mo11240j();
            return new C1332fv("Complete with: ".concat(mo11240j != null ? "failure" : rj1Var.mo11236n() ? "result ".concat(String.valueOf(rj1Var.mo11239k())) : rj1Var.mo11238l() ? "cancellation" : "unknown issue"), mo11240j);
        }
        return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
}
