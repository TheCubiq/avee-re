package com.daaw;

import com.daaw.InterfaceC2307nl;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public interface mh0 extends InterfaceC2307nl.InterfaceC2310b {

    /* renamed from: d */
    public static final C2177b f18874d = C2177b.f18875p;

    /* renamed from: com.daaw.mh0$a */
    /* loaded from: classes2.dex */
    public static final class C2176a {
        /* renamed from: a */
        public static <R> R m16034a(mh0 mh0Var, R r, n50<? super R, ? super InterfaceC2307nl.InterfaceC2310b, ? extends R> n50Var) {
            return (R) InterfaceC2307nl.InterfaceC2310b.C2311a.m15093a(mh0Var, r, n50Var);
        }

        /* renamed from: b */
        public static <E extends InterfaceC2307nl.InterfaceC2310b> E m16033b(mh0 mh0Var, InterfaceC2307nl.InterfaceC2312c<E> interfaceC2312c) {
            return (E) InterfaceC2307nl.InterfaceC2310b.C2311a.m15092b(mh0Var, interfaceC2312c);
        }

        /* renamed from: c */
        public static /* synthetic */ InterfaceC1754iu m16032c(mh0 mh0Var, boolean z, boolean z2, z40 z40Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return mh0Var.mo8202w(z, z2, z40Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: d */
        public static InterfaceC2307nl m16031d(mh0 mh0Var, InterfaceC2307nl.InterfaceC2312c<?> interfaceC2312c) {
            return InterfaceC2307nl.InterfaceC2310b.C2311a.m15091c(mh0Var, interfaceC2312c);
        }
    }

    /* renamed from: com.daaw.mh0$b */
    /* loaded from: classes2.dex */
    public static final class C2177b implements InterfaceC2307nl.InterfaceC2312c<mh0> {

        /* renamed from: p */
        public static final /* synthetic */ C2177b f18875p = new C2177b();
    }

    static {
        C2870rl.m11205b();
    }

    /* renamed from: L */
    void mo8243L(CancellationException cancellationException);

    /* renamed from: d */
    boolean mo8224d();

    /* renamed from: q */
    CancellationException mo8207q();

    /* renamed from: w */
    InterfaceC1754iu mo8202w(boolean z, boolean z2, z40<? super Throwable, lp1> z40Var);
}
