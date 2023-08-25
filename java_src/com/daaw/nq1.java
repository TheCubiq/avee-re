package com.daaw;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.NativeConstants;
/* loaded from: classes2.dex */
public class nq1 {
    public final op0 a;
    public final zl b;
    public final String c;
    public final a d = new a(false);
    public final a e = new a(true);
    public final AtomicMarkableReference<String> f = new AtomicMarkableReference<>(null, false);

    /* loaded from: classes2.dex */
    public class a {
        public final AtomicMarkableReference<ki0> a;
        public final AtomicReference<Callable<Void>> b = new AtomicReference<>(null);
        public final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new ki0(64, z ? 8192 : NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV), false);
        }

        public Map<String, String> a() {
            return this.a.getReference().a();
        }
    }

    public nq1(String str, h10 h10Var, zl zlVar) {
        this.c = str;
        this.a = new op0(h10Var);
        this.b = zlVar;
    }

    public static nq1 c(String str, h10 h10Var, zl zlVar) {
        op0 op0Var = new op0(h10Var);
        nq1 nq1Var = new nq1(str, h10Var, zlVar);
        nq1Var.d.a.getReference().d(op0Var.f(str, false));
        nq1Var.e.a.getReference().d(op0Var.f(str, true));
        nq1Var.f.set(op0Var.g(str), false);
        return nq1Var;
    }

    public static String d(String str, h10 h10Var) {
        return new op0(h10Var).g(str);
    }

    public Map<String, String> a() {
        return this.d.a();
    }

    public Map<String, String> b() {
        return this.e.a();
    }
}
