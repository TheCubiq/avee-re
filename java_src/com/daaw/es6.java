package com.daaw;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class es6 {
    public static volatile int e = 1;
    public static final /* synthetic */ int f = 0;
    public final Context a;
    public final Executor b;
    public final rj1 c;
    public final boolean d;

    public es6(Context context, Executor executor, rj1 rj1Var, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = rj1Var;
        this.d = z;
    }

    public static es6 a(final Context context, Executor executor, boolean z) {
        final tj1 tj1Var = new tj1();
        executor.execute(z ? new Runnable() { // from class: com.daaw.as6
            @Override // java.lang.Runnable
            public final void run() {
                tj1Var.c(ku6.b(context, "GLAS", null));
            }
        } : new Runnable() { // from class: com.daaw.bs6
            @Override // java.lang.Runnable
            public final void run() {
                tj1.this.c(ku6.c());
            }
        });
        return new es6(context, executor, tj1Var.a(), z);
    }

    public static void g(int i) {
        e = i;
    }

    public final rj1 b(int i, String str) {
        return h(i, 0L, null, null, null, str);
    }

    public final rj1 c(int i, long j, Exception exc) {
        return h(i, j, exc, null, null, null);
    }

    public final rj1 d(int i, long j) {
        return h(i, j, null, null, null, null);
    }

    public final rj1 e(int i, long j, String str) {
        return h(i, j, null, null, null, str);
    }

    public final rj1 f(int i, long j, String str, Map map) {
        return h(i, j, null, str, null, null);
    }

    public final rj1 h(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (this.d) {
            final oh2 L = xh2.L();
            L.s(this.a.getPackageName());
            L.w(j);
            L.y(e);
            if (exc != null) {
                L.x(jz6.a(exc));
                L.v(exc.getClass().getName());
            }
            if (str2 != null) {
                L.t(str2);
            }
            if (str != null) {
                L.u(str);
            }
            return this.c.g(this.b, new hl() { // from class: com.daaw.ds6
                @Override // com.daaw.hl
                public final Object a(rj1 rj1Var) {
                    oh2 oh2Var = oh2.this;
                    int i2 = i;
                    int i3 = es6.f;
                    if (rj1Var.n()) {
                        ju6 a = ((ku6) rj1Var.k()).a(((xh2) oh2Var.n()).a());
                        a.a(i2);
                        a.c();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            });
        }
        return this.c.g(this.b, new hl() { // from class: com.daaw.cs6
            @Override // com.daaw.hl
            public final Object a(rj1 rj1Var) {
                return Boolean.valueOf(rj1Var.n());
            }
        });
    }
}
