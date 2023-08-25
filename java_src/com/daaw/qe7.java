package com.daaw;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class qe7 {

    /* renamed from: b */
    public static final qe7 f23895b = new qe7();

    /* renamed from: a */
    public final AtomicReference f23896a = new AtomicReference(new nf7(new hf7(), null));

    /* renamed from: b */
    public static qe7 m12574b() {
        return f23895b;
    }

    /* renamed from: a */
    public final m87 m12575a(ef7 ef7Var, x97 x97Var) {
        try {
            try {
                return ((nf7) this.f23896a.get()).m15192a(ef7Var, x97Var);
            } catch (GeneralSecurityException e) {
                throw new of7("Creating a LegacyProtoKey failed", e);
            }
        } catch (GeneralSecurityException unused) {
            return new ie7(ef7Var, x97Var);
        }
    }

    /* renamed from: c */
    public final synchronized void m12573c(xd7 xd7Var) {
        hf7 hf7Var = new hf7((nf7) this.f23896a.get());
        hf7Var.m20828a(xd7Var);
        this.f23896a.set(new nf7(hf7Var, null));
    }

    /* renamed from: d */
    public final synchronized void m12572d(be7 be7Var) {
        hf7 hf7Var = new hf7((nf7) this.f23896a.get());
        hf7Var.m20827b(be7Var);
        this.f23896a.set(new nf7(hf7Var, null));
    }

    /* renamed from: e */
    public final synchronized void m12571e(ue7 ue7Var) {
        hf7 hf7Var = new hf7((nf7) this.f23896a.get());
        hf7Var.m20826c(ue7Var);
        this.f23896a.set(new nf7(hf7Var, null));
    }

    /* renamed from: f */
    public final synchronized void m12570f(bf7 bf7Var) {
        hf7 hf7Var = new hf7((nf7) this.f23896a.get());
        hf7Var.m20825d(bf7Var);
        this.f23896a.set(new nf7(hf7Var, null));
    }
}
