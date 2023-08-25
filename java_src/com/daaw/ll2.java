package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzfts;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class ll2 implements ol2 {

    /* renamed from: F */
    public static ll2 f17501F;

    /* renamed from: C */
    public volatile boolean f17504C;

    /* renamed from: D */
    public volatile boolean f17505D;

    /* renamed from: E */
    public final int f17506E;

    /* renamed from: p */
    public final Context f17507p;

    /* renamed from: q */
    public final wt6 f17508q;

    /* renamed from: r */
    public final bu6 f17509r;

    /* renamed from: s */
    public final du6 f17510s;

    /* renamed from: t */
    public final qm2 f17511t;

    /* renamed from: u */
    public final es6 f17512u;

    /* renamed from: v */
    public final Executor f17513v;

    /* renamed from: w */
    public final au6 f17514w;

    /* renamed from: y */
    public final gn2 f17516y;

    /* renamed from: z */
    public final xm2 f17517z;

    /* renamed from: A */
    public volatile long f17502A = 0;

    /* renamed from: B */
    public final Object f17503B = new Object();

    /* renamed from: x */
    public final CountDownLatch f17515x = new CountDownLatch(1);

    public ll2(Context context, es6 es6Var, wt6 wt6Var, bu6 bu6Var, du6 du6Var, qm2 qm2Var, Executor executor, zr6 zr6Var, int i, gn2 gn2Var, xm2 xm2Var) {
        this.f17505D = false;
        this.f17507p = context;
        this.f17512u = es6Var;
        this.f17508q = wt6Var;
        this.f17509r = bu6Var;
        this.f17510s = du6Var;
        this.f17511t = qm2Var;
        this.f17513v = executor;
        this.f17506E = i;
        this.f17516y = gn2Var;
        this.f17517z = xm2Var;
        this.f17505D = false;
        this.f17514w = new jl2(this, zr6Var);
    }

    /* renamed from: a */
    public static synchronized ll2 m16874a(String str, Context context, boolean z, boolean z2) {
        ll2 m16873b;
        synchronized (ll2.class) {
            m16873b = m16873b(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return m16873b;
    }

    @Deprecated
    /* renamed from: b */
    public static synchronized ll2 m16873b(String str, Context context, Executor executor, boolean z, boolean z2) {
        ll2 ll2Var;
        synchronized (ll2.class) {
            if (f17501F == null) {
                is6 m18259a = js6.m18259a();
                m18259a.mo16603a(str);
                m18259a.mo16601c(z);
                js6 mo16600d = m18259a.mo16600d();
                es6 m23231a = es6.m23231a(context, executor, z2);
                wl2 m6014c = ((Boolean) zzba.zzc().m23658b(g93.f10544S2)).booleanValue() ? wl2.m6014c(context) : null;
                gn2 m21437d = ((Boolean) zzba.zzc().m23658b(g93.f10554T2)).booleanValue() ? gn2.m21437d(context, executor) : null;
                xm2 xm2Var = ((Boolean) zzba.zzc().m23658b(g93.f10745l2)).booleanValue() ? new xm2() : null;
                at6 m27037e = at6.m27037e(context, executor, m23231a, mo16600d);
                pm2 pm2Var = new pm2(context);
                qm2 qm2Var = new qm2(mo16600d, m27037e, new en2(context, pm2Var), pm2Var, m6014c, m21437d, xm2Var);
                int m15772b = mt6.m15772b(context, m23231a);
                zr6 zr6Var = new zr6();
                ll2 ll2Var2 = new ll2(context, m23231a, new wt6(context, m15772b), new bu6(context, m15772b, new el2(m23231a), ((Boolean) zzba.zzc().m23658b(g93.f10563U1)).booleanValue()), new du6(context, qm2Var, m23231a, zr6Var), qm2Var, executor, zr6Var, m15772b, m21437d, xm2Var);
                f17501F = ll2Var2;
                ll2Var2.m16868g();
                f17501F.m16867h();
            }
            ll2Var = f17501F;
        }
        return ll2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.m4880N().m27257T().equals(r5.m27257T()) != false) goto L46;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* bridge */ /* synthetic */ void m16869f(ll2 ll2Var) {
        String str;
        String str2;
        zzfts m10973a;
        byte[] bArr;
        es6 es6Var;
        int i;
        long currentTimeMillis;
        xo2 m4881M;
        boolean m5809a;
        long currentTimeMillis2 = System.currentTimeMillis();
        vt6 m16863l = ll2Var.m16863l(1);
        if (m16863l != null) {
            String m27256U = m16863l.m6796a().m27256U();
            str2 = m16863l.m6796a().m27257T();
            str = m27256U;
        } else {
            str = null;
            str2 = null;
        }
        try {
            try {
                m10973a = rs6.m10973a(ll2Var.f17507p, 1, ll2Var.f17506E, str, str2, "1", ll2Var.f17512u);
                bArr = m10973a.f37025q;
            } catch (xs7 e) {
                ll2Var.f17512u.m23229c(4002, System.currentTimeMillis() - currentTimeMillis2, e);
            }
            if (bArr == null || bArr.length == 0) {
                es6Var = ll2Var.f17512u;
                i = 5009;
                currentTimeMillis = System.currentTimeMillis();
            } else {
                try {
                    m4881M = xo2.m4881M(yq7.m3424F(bArr), vr7.m6834a());
                } catch (NullPointerException unused) {
                    es6Var = ll2Var.f17512u;
                    i = 2030;
                    currentTimeMillis = System.currentTimeMillis();
                }
                if (!m4881M.m4880N().m27256U().isEmpty() && !m4881M.m4880N().m27257T().isEmpty() && m4881M.m4879O().m3415j().length != 0) {
                    vt6 m16863l2 = ll2Var.m16863l(1);
                    if (m16863l2 != null) {
                        ap2 m6796a = m16863l2.m6796a();
                        if (m4881M.m4880N().m27256U().equals(m6796a.m27256U())) {
                        }
                    }
                    au6 au6Var = ll2Var.f17514w;
                    int i2 = m10973a.f37026r;
                    if (!((Boolean) zzba.zzc().m23658b(g93.f10543S1)).booleanValue()) {
                        m5809a = ll2Var.f17508q.m5809a(m4881M, au6Var);
                    } else if (i2 == 3) {
                        m5809a = ll2Var.f17509r.m25824a(m4881M);
                    } else {
                        if (i2 == 4) {
                            m5809a = ll2Var.f17509r.m25823b(m4881M, au6Var);
                        }
                        es6Var = ll2Var.f17512u;
                        i = 4009;
                        currentTimeMillis = System.currentTimeMillis();
                    }
                    if (m5809a) {
                        vt6 m16863l3 = ll2Var.m16863l(1);
                        if (m16863l3 != null) {
                            if (ll2Var.f17510s.m23942c(m16863l3)) {
                                ll2Var.f17505D = true;
                            }
                            ll2Var.f17502A = System.currentTimeMillis() / 1000;
                        }
                    }
                    es6Var = ll2Var.f17512u;
                    i = 4009;
                    currentTimeMillis = System.currentTimeMillis();
                }
                es6Var = ll2Var.f17512u;
                i = 5010;
                currentTimeMillis = System.currentTimeMillis();
            }
            es6Var.m23228d(i, currentTimeMillis - currentTimeMillis2);
        } finally {
            ll2Var.f17515x.countDown();
        }
    }

    /* renamed from: g */
    public final synchronized void m16868g() {
        long currentTimeMillis = System.currentTimeMillis();
        vt6 m16863l = m16863l(1);
        if (m16863l == null) {
            this.f17512u.m23228d(4013, System.currentTimeMillis() - currentTimeMillis);
        } else if (this.f17510s.m23942c(m16863l)) {
            this.f17505D = true;
            this.f17515x.countDown();
        }
    }

    /* renamed from: h */
    public final void m16867h() {
        if (this.f17504C) {
            return;
        }
        synchronized (this.f17503B) {
            if (!this.f17504C) {
                if ((System.currentTimeMillis() / 1000) - this.f17502A < 3600) {
                    return;
                }
                vt6 m23943b = this.f17510s.m23943b();
                if ((m23943b == null || m23943b.m6793d(3600L)) && mt6.m15773a(this.f17506E)) {
                    this.f17513v.execute(new kl2(this));
                }
            }
        }
    }

    /* renamed from: j */
    public final synchronized boolean m16865j() {
        return this.f17505D;
    }

    /* renamed from: k */
    public final void m16864k() {
        gn2 gn2Var = this.f17516y;
        if (gn2Var != null) {
            gn2Var.m21433h();
        }
    }

    /* renamed from: l */
    public final vt6 m16863l(int i) {
        if (mt6.m15773a(this.f17506E)) {
            return ((Boolean) zzba.zzc().m23658b(g93.f10543S1)).booleanValue() ? this.f17509r.m25822c(1) : this.f17508q.m5807c(1);
        }
        return null;
    }

    @Override // com.daaw.ol2
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.daaw.ol2
    public final String zzf(Context context, String str, View view, Activity activity) {
        m16864k();
        if (((Boolean) zzba.zzc().m23658b(g93.f10745l2)).booleanValue()) {
            this.f17517z.m4995i();
        }
        m16867h();
        ks6 m23944a = this.f17510s.m23944a();
        if (m23944a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String mo7713c = m23944a.mo7713c(context, null, str, view, activity);
            this.f17512u.m23226f(5000, System.currentTimeMillis() - currentTimeMillis, mo7713c, null);
            return mo7713c;
        }
        return "";
    }

    @Override // com.daaw.ol2
    public final String zzg(Context context) {
        m16864k();
        if (((Boolean) zzba.zzc().m23658b(g93.f10745l2)).booleanValue()) {
            this.f17517z.m4994j();
        }
        m16867h();
        ks6 m23944a = this.f17510s.m23944a();
        if (m23944a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String mo7715a = m23944a.mo7715a(context, null);
            this.f17512u.m23226f(5001, System.currentTimeMillis() - currentTimeMillis, mo7715a, null);
            return mo7715a;
        }
        return "";
    }

    @Override // com.daaw.ol2
    public final String zzh(Context context, View view, Activity activity) {
        m16864k();
        if (((Boolean) zzba.zzc().m23658b(g93.f10745l2)).booleanValue()) {
            this.f17517z.m4993k(context, view);
        }
        m16867h();
        ks6 m23944a = this.f17510s.m23944a();
        if (m23944a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String mo7712d = m23944a.mo7712d(context, null, view, activity);
            this.f17512u.m23226f(5002, System.currentTimeMillis() - currentTimeMillis, mo7712d, null);
            return mo7712d;
        }
        return "";
    }

    @Override // com.daaw.ol2
    public final void zzk(MotionEvent motionEvent) {
        ks6 m23944a = this.f17510s.m23944a();
        if (m23944a != null) {
            try {
                m23944a.mo7714b(null, motionEvent);
            } catch (cu6 e) {
                this.f17512u.m23229c(e.m24974a(), -1L, e);
            }
        }
    }

    @Override // com.daaw.ol2
    public final void zzl(int i, int i2, int i3) {
    }

    @Override // com.daaw.ol2
    public final void zzn(View view) {
        this.f17511t.m12336a(view);
    }
}
