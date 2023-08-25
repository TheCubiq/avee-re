package com.daaw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.daaw.da;
import com.daaw.dl0;
import com.daaw.ri1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class eq1 {
    public final Context a;
    public final ba b;
    public final ly c;
    public final py1 d;
    public final Executor e;
    public final ri1 f;
    public final cg g;
    public final cg h;
    public final tf i;

    public eq1(Context context, ba baVar, ly lyVar, py1 py1Var, Executor executor, ri1 ri1Var, cg cgVar, cg cgVar2, tf tfVar) {
        this.a = context;
        this.b = baVar;
        this.c = lyVar;
        this.d = py1Var;
        this.e = executor;
        this.f = ri1Var;
        this.g = cgVar;
        this.h = cgVar2;
        this.i = tfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(sn1 sn1Var) {
        return Boolean.valueOf(this.c.l(sn1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(sn1 sn1Var) {
        return this.c.y(sn1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, sn1 sn1Var, long j) {
        this.c.O(iterable);
        this.c.p(sn1Var, this.g.a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.c.e(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.i.d();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.i.u(((Integer) entry.getValue()).intValue(), dl0.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(sn1 sn1Var, long j) {
        this.c.p(sn1Var, this.g.a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(sn1 sn1Var, int i) {
        this.d.a(sn1Var, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final sn1 sn1Var, final int i, Runnable runnable) {
        try {
            try {
                ri1 ri1Var = this.f;
                final ly lyVar = this.c;
                Objects.requireNonNull(lyVar);
                ri1Var.q(new ri1.a() { // from class: com.daaw.vp1
                    @Override // com.daaw.ri1.a
                    public final Object a() {
                        return Integer.valueOf(ly.this.c());
                    }
                });
                if (k()) {
                    u(sn1Var, i);
                } else {
                    this.f.q(new ri1.a() { // from class: com.daaw.zp1
                        @Override // com.daaw.ri1.a
                        public final Object a() {
                            Object s;
                            s = eq1.this.s(sn1Var, i);
                            return s;
                        }
                    });
                }
            } catch (qi1 unused) {
                this.d.a(sn1Var, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public by j(rn1 rn1Var) {
        ri1 ri1Var = this.f;
        final tf tfVar = this.i;
        Objects.requireNonNull(tfVar);
        return rn1Var.b(by.a().i(this.g.a()).k(this.h.a()).j("GDT_CLIENT_METRICS").h(new ww(bx.b("proto"), ((wf) ri1Var.q(new ri1.a() { // from class: com.daaw.tp1
            @Override // com.daaw.ri1.a
            public final Object a() {
                return tf.this.n();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public da u(final sn1 sn1Var, int i) {
        da a;
        rn1 a2 = this.b.a(sn1Var.b());
        long j = 0;
        da e = da.e(0L);
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f.q(new ri1.a() { // from class: com.daaw.xp1
                @Override // com.daaw.ri1.a
                public final Object a() {
                    Boolean l;
                    l = eq1.this.l(sn1Var);
                    return l;
                }
            })).booleanValue()) {
                final Iterable<iw0> iterable = (Iterable) this.f.q(new ri1.a() { // from class: com.daaw.yp1
                    @Override // com.daaw.ri1.a
                    public final Object a() {
                        Iterable m;
                        m = eq1.this.m(sn1Var);
                        return m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (a2 == null) {
                    nl0.b("Uploader", "Unknown backend for %s, deleting event batch for it...", sn1Var);
                    a = da.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (iw0 iw0Var : iterable) {
                        arrayList.add(iw0Var.b());
                    }
                    if (sn1Var.e()) {
                        arrayList.add(j(a2));
                    }
                    a = a2.a(ca.a().b(arrayList).c(sn1Var.c()).a());
                }
                e = a;
                if (e.c() == da.a.TRANSIENT_ERROR) {
                    this.f.q(new ri1.a() { // from class: com.daaw.cq1
                        @Override // com.daaw.ri1.a
                        public final Object a() {
                            Object n;
                            n = eq1.this.n(iterable, sn1Var, j2);
                            return n;
                        }
                    });
                    this.d.b(sn1Var, i + 1, true);
                    return e;
                }
                this.f.q(new ri1.a() { // from class: com.daaw.bq1
                    @Override // com.daaw.ri1.a
                    public final Object a() {
                        Object o;
                        o = eq1.this.o(iterable);
                        return o;
                    }
                });
                if (e.c() == da.a.OK) {
                    j = Math.max(j2, e.b());
                    if (sn1Var.e()) {
                        this.f.q(new ri1.a() { // from class: com.daaw.wp1
                            @Override // com.daaw.ri1.a
                            public final Object a() {
                                Object p;
                                p = eq1.this.p();
                                return p;
                            }
                        });
                    }
                } else if (e.c() == da.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (iw0 iw0Var2 : iterable) {
                        String j3 = iw0Var2.b().j();
                        hashMap.put(j3, !hashMap.containsKey(j3) ? 1 : Integer.valueOf(((Integer) hashMap.get(j3)).intValue() + 1));
                    }
                    this.f.q(new ri1.a() { // from class: com.daaw.dq1
                        @Override // com.daaw.ri1.a
                        public final Object a() {
                            Object q;
                            q = eq1.this.q(hashMap);
                            return q;
                        }
                    });
                }
            }
            this.f.q(new ri1.a() { // from class: com.daaw.aq1
                @Override // com.daaw.ri1.a
                public final Object a() {
                    Object r;
                    r = eq1.this.r(sn1Var, j2);
                    return r;
                }
            });
            return e;
        }
    }

    public void v(final sn1 sn1Var, final int i, final Runnable runnable) {
        this.e.execute(new Runnable() { // from class: com.daaw.up1
            @Override // java.lang.Runnable
            public final void run() {
                eq1.this.t(sn1Var, i, runnable);
            }
        });
    }
}
