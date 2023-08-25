package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class ll2 implements ol2 {
    public static ll2 F;
    public volatile boolean C;
    public volatile boolean D;
    public final int E;
    public final Context p;
    public final wt6 q;
    public final bu6 r;
    public final du6 s;
    public final qm2 t;
    public final es6 u;
    public final Executor v;
    public final au6 w;
    public final gn2 y;
    public final xm2 z;
    public volatile long A = 0;
    public final Object B = new Object();
    public final CountDownLatch x = new CountDownLatch(1);

    public ll2(Context context, es6 es6Var, wt6 wt6Var, bu6 bu6Var, du6 du6Var, qm2 qm2Var, Executor executor, zr6 zr6Var, int i, gn2 gn2Var, xm2 xm2Var) {
        this.D = false;
        this.p = context;
        this.u = es6Var;
        this.q = wt6Var;
        this.r = bu6Var;
        this.s = du6Var;
        this.t = qm2Var;
        this.v = executor;
        this.E = i;
        this.y = gn2Var;
        this.z = xm2Var;
        this.D = false;
        this.w = new jl2(this, zr6Var);
    }

    public static synchronized ll2 a(String str, Context context, boolean z, boolean z2) {
        ll2 b;
        synchronized (ll2.class) {
            b = b(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return b;
    }

    @Deprecated
    public static synchronized ll2 b(String str, Context context, Executor executor, boolean z, boolean z2) {
        ll2 ll2Var;
        synchronized (ll2.class) {
            if (F == null) {
                is6 a = js6.a();
                a.a(str);
                a.c(z);
                js6 d = a.d();
                es6 a2 = es6.a(context, executor, z2);
                wl2 c = ((Boolean) zzba.zzc().b(g93.S2)).booleanValue() ? wl2.c(context) : null;
                gn2 d2 = ((Boolean) zzba.zzc().b(g93.T2)).booleanValue() ? gn2.d(context, executor) : null;
                xm2 xm2Var = ((Boolean) zzba.zzc().b(g93.l2)).booleanValue() ? new xm2() : null;
                at6 e = at6.e(context, executor, a2, d);
                pm2 pm2Var = new pm2(context);
                qm2 qm2Var = new qm2(d, e, new en2(context, pm2Var), pm2Var, c, d2, xm2Var);
                int b = mt6.b(context, a2);
                zr6 zr6Var = new zr6();
                ll2 ll2Var2 = new ll2(context, a2, new wt6(context, b), new bu6(context, b, new el2(a2), ((Boolean) zzba.zzc().b(g93.U1)).booleanValue()), new du6(context, qm2Var, a2, zr6Var), qm2Var, executor, zr6Var, b, d2, xm2Var);
                F = ll2Var2;
                ll2Var2.g();
                F.h();
            }
            ll2Var = F;
        }
        return ll2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.N().T().equals(r5.T()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void f(com.daaw.ll2 r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ll2.f(com.daaw.ll2):void");
    }

    public final synchronized void g() {
        long currentTimeMillis = System.currentTimeMillis();
        vt6 l = l(1);
        if (l == null) {
            this.u.d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.s.c(l)) {
            this.D = true;
            this.x.countDown();
        }
    }

    public final void h() {
        if (this.C) {
            return;
        }
        synchronized (this.B) {
            if (!this.C) {
                if ((System.currentTimeMillis() / 1000) - this.A < 3600) {
                    return;
                }
                vt6 b = this.s.b();
                if ((b == null || b.d(3600L)) && mt6.a(this.E)) {
                    this.v.execute(new kl2(this));
                }
            }
        }
    }

    public final synchronized boolean j() {
        return this.D;
    }

    public final void k() {
        gn2 gn2Var = this.y;
        if (gn2Var != null) {
            gn2Var.h();
        }
    }

    public final vt6 l(int i) {
        if (mt6.a(this.E)) {
            return ((Boolean) zzba.zzc().b(g93.S1)).booleanValue() ? this.r.c(1) : this.q.c(1);
        }
        return null;
    }

    @Override // com.daaw.ol2
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.daaw.ol2
    public final String zzf(Context context, String str, View view, Activity activity) {
        k();
        if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
            this.z.i();
        }
        h();
        ks6 a = this.s.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String c = a.c(context, null, str, view, activity);
            this.u.f(5000, System.currentTimeMillis() - currentTimeMillis, c, null);
            return c;
        }
        return "";
    }

    @Override // com.daaw.ol2
    public final String zzg(Context context) {
        k();
        if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
            this.z.j();
        }
        h();
        ks6 a = this.s.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = a.a(context, null);
            this.u.f(5001, System.currentTimeMillis() - currentTimeMillis, a2, null);
            return a2;
        }
        return "";
    }

    @Override // com.daaw.ol2
    public final String zzh(Context context, View view, Activity activity) {
        k();
        if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
            this.z.k(context, view);
        }
        h();
        ks6 a = this.s.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String d = a.d(context, null, view, activity);
            this.u.f(5002, System.currentTimeMillis() - currentTimeMillis, d, null);
            return d;
        }
        return "";
    }

    @Override // com.daaw.ol2
    public final void zzk(MotionEvent motionEvent) {
        ks6 a = this.s.a();
        if (a != null) {
            try {
                a.b(null, motionEvent);
            } catch (cu6 e) {
                this.u.c(e.a(), -1L, e);
            }
        }
    }

    @Override // com.daaw.ol2
    public final void zzl(int i, int i2, int i3) {
    }

    @Override // com.daaw.ol2
    public final void zzn(View view) {
        this.t.a(view);
    }
}
