package com.daaw;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class es6 {

    /* renamed from: e */
    public static volatile int f8739e = 1;

    /* renamed from: f */
    public static final /* synthetic */ int f8740f = 0;

    /* renamed from: a */
    public final Context f8741a;

    /* renamed from: b */
    public final Executor f8742b;

    /* renamed from: c */
    public final rj1 f8743c;

    /* renamed from: d */
    public final boolean f8744d;

    public es6(Context context, Executor executor, rj1 rj1Var, boolean z) {
        this.f8741a = context;
        this.f8742b = executor;
        this.f8743c = rj1Var;
        this.f8744d = z;
    }

    /* renamed from: a */
    public static es6 m23231a(final Context context, Executor executor, boolean z) {
        final tj1 tj1Var = new tj1();
        executor.execute(z ? new Runnable() { // from class: com.daaw.as6
            @Override // java.lang.Runnable
            public final void run() {
                tj1Var.m9080c(ku6.m17428b(context, "GLAS", null));
            }
        } : new Runnable() { // from class: com.daaw.bs6
            @Override // java.lang.Runnable
            public final void run() {
                tj1.this.m9080c(ku6.m17427c());
            }
        });
        return new es6(context, executor, tj1Var.m9082a(), z);
    }

    /* renamed from: g */
    public static void m23225g(int i) {
        f8739e = i;
    }

    /* renamed from: b */
    public final rj1 m23230b(int i, String str) {
        return m23224h(i, 0L, null, null, null, str);
    }

    /* renamed from: c */
    public final rj1 m23229c(int i, long j, Exception exc) {
        return m23224h(i, j, exc, null, null, null);
    }

    /* renamed from: d */
    public final rj1 m23228d(int i, long j) {
        return m23224h(i, j, null, null, null, null);
    }

    /* renamed from: e */
    public final rj1 m23227e(int i, long j, String str) {
        return m23224h(i, j, null, null, null, str);
    }

    /* renamed from: f */
    public final rj1 m23226f(int i, long j, String str, Map map) {
        return m23224h(i, j, null, str, null, null);
    }

    /* renamed from: h */
    public final rj1 m23224h(final int i, long j, Exception exc, String str, Map map, String str2) {
        if (this.f8744d) {
            final oh2 m5116L = xh2.m5116L();
            m5116L.m14278s(this.f8741a.getPackageName());
            m5116L.m14274w(j);
            m5116L.m14272y(f8739e);
            if (exc != null) {
                m5116L.m14273x(jz6.m18127a(exc));
                m5116L.m14275v(exc.getClass().getName());
            }
            if (str2 != null) {
                m5116L.m14277t(str2);
            }
            if (str != null) {
                m5116L.m14276u(str);
            }
            return this.f8743c.mo11243g(this.f8742b, new InterfaceC1587hl() { // from class: com.daaw.ds6
                @Override // com.daaw.InterfaceC1587hl
                /* renamed from: a */
                public final Object mo2139a(rj1 rj1Var) {
                    oh2 oh2Var = oh2.this;
                    int i2 = i;
                    int i3 = es6.f8740f;
                    if (rj1Var.mo11236n()) {
                        ju6 m17429a = ((ku6) rj1Var.mo11239k()).m17429a(((xh2) oh2Var.m22315n()).mo4516a());
                        m17429a.m18239a(i2);
                        m17429a.m18237c();
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
            });
        }
        return this.f8743c.mo11243g(this.f8742b, new InterfaceC1587hl() { // from class: com.daaw.cs6
            @Override // com.daaw.InterfaceC1587hl
            /* renamed from: a */
            public final Object mo2139a(rj1 rj1Var) {
                return Boolean.valueOf(rj1Var.mo11236n());
            }
        });
    }
}
