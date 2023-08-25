package com.daaw;

import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.NativeConstants;
/* loaded from: classes2.dex */
public class nq1 {

    /* renamed from: a */
    public final op0 f20562a;

    /* renamed from: b */
    public final C3873zl f20563b;

    /* renamed from: c */
    public final String f20564c;

    /* renamed from: d */
    public final C2359a f20565d = new C2359a(false);

    /* renamed from: e */
    public final C2359a f20566e = new C2359a(true);

    /* renamed from: f */
    public final AtomicMarkableReference<String> f20567f = new AtomicMarkableReference<>(null, false);

    /* renamed from: com.daaw.nq1$a */
    /* loaded from: classes2.dex */
    public class C2359a {

        /* renamed from: a */
        public final AtomicMarkableReference<ki0> f20568a;

        /* renamed from: b */
        public final AtomicReference<Callable<Void>> f20569b = new AtomicReference<>(null);

        /* renamed from: c */
        public final boolean f20570c;

        public C2359a(boolean z) {
            this.f20570c = z;
            this.f20568a = new AtomicMarkableReference<>(new ki0(64, z ? 8192 : NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV), false);
        }

        /* renamed from: a */
        public Map<String, String> m14883a() {
            return this.f20568a.getReference().m17734a();
        }
    }

    public nq1(String str, h10 h10Var, C3873zl c3873zl) {
        this.f20564c = str;
        this.f20562a = new op0(h10Var);
        this.f20563b = c3873zl;
    }

    /* renamed from: c */
    public static nq1 m14885c(String str, h10 h10Var, C3873zl c3873zl) {
        op0 op0Var = new op0(h10Var);
        nq1 nq1Var = new nq1(str, h10Var, c3873zl);
        nq1Var.f20565d.f20568a.getReference().m17731d(op0Var.m14107f(str, false));
        nq1Var.f20566e.f20568a.getReference().m17731d(op0Var.m14107f(str, true));
        nq1Var.f20567f.set(op0Var.m14106g(str), false);
        return nq1Var;
    }

    /* renamed from: d */
    public static String m14884d(String str, h10 h10Var) {
        return new op0(h10Var).m14106g(str);
    }

    /* renamed from: a */
    public Map<String, String> m14887a() {
        return this.f20565d.m14883a();
    }

    /* renamed from: b */
    public Map<String, String> m14886b() {
        return this.f20566e.m14883a();
    }
}
