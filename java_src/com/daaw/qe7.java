package com.daaw;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class qe7 {
    public static final qe7 b = new qe7();
    public final AtomicReference a = new AtomicReference(new nf7(new hf7(), null));

    public static qe7 b() {
        return b;
    }

    public final m87 a(ef7 ef7Var, x97 x97Var) {
        try {
            try {
                return ((nf7) this.a.get()).a(ef7Var, x97Var);
            } catch (GeneralSecurityException e) {
                throw new of7("Creating a LegacyProtoKey failed", e);
            }
        } catch (GeneralSecurityException unused) {
            return new ie7(ef7Var, x97Var);
        }
    }

    public final synchronized void c(xd7 xd7Var) {
        hf7 hf7Var = new hf7((nf7) this.a.get());
        hf7Var.a(xd7Var);
        this.a.set(new nf7(hf7Var, null));
    }

    public final synchronized void d(be7 be7Var) {
        hf7 hf7Var = new hf7((nf7) this.a.get());
        hf7Var.b(be7Var);
        this.a.set(new nf7(hf7Var, null));
    }

    public final synchronized void e(ue7 ue7Var) {
        hf7 hf7Var = new hf7((nf7) this.a.get());
        hf7Var.c(ue7Var);
        this.a.set(new nf7(hf7Var, null));
    }

    public final synchronized void f(bf7 bf7Var) {
        hf7 hf7Var = new hf7((nf7) this.a.get());
        hf7Var.d(bf7Var);
        this.a.set(new nf7(hf7Var, null));
    }
}
