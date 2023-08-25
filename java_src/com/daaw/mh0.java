package com.daaw;

import com.daaw.nl;
import java.util.concurrent.CancellationException;
/* loaded from: classes2.dex */
public interface mh0 extends nl.b {
    public static final b d = b.p;

    /* loaded from: classes2.dex */
    public static final class a {
        public static <R> R a(mh0 mh0Var, R r, n50<? super R, ? super nl.b, ? extends R> n50Var) {
            return (R) nl.b.a.a(mh0Var, r, n50Var);
        }

        public static <E extends nl.b> E b(mh0 mh0Var, nl.c<E> cVar) {
            return (E) nl.b.a.b(mh0Var, cVar);
        }

        public static /* synthetic */ iu c(mh0 mh0Var, boolean z, boolean z2, z40 z40Var, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return mh0Var.w(z, z2, z40Var);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static nl d(mh0 mh0Var, nl.c<?> cVar) {
            return nl.b.a.c(mh0Var, cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements nl.c<mh0> {
        public static final /* synthetic */ b p = new b();
    }

    static {
        rl.b();
    }

    void L(CancellationException cancellationException);

    boolean d();

    CancellationException q();

    iu w(boolean z, boolean z2, z40<? super Throwable, lp1> z40Var);
}
