package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.daaw.bu6;
import com.daaw.d04;
import com.daaw.es6;
import com.daaw.g93;
import com.daaw.k04;
import com.daaw.ll2;
import com.daaw.mt6;
import com.daaw.ol2;
import com.daaw.rl2;
import com.daaw.su7;
import com.daaw.z04;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzchu;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class zzi implements Runnable, ol2 {

    /* renamed from: A */
    public final zzchu f36351A;

    /* renamed from: B */
    public final boolean f36352B;

    /* renamed from: D */
    public int f36354D;

    /* renamed from: s */
    public boolean f36358s;

    /* renamed from: t */
    public final boolean f36359t;

    /* renamed from: u */
    public final boolean f36360u;

    /* renamed from: v */
    public final Executor f36361v;

    /* renamed from: w */
    public final es6 f36362w;

    /* renamed from: x */
    public Context f36363x;

    /* renamed from: y */
    public final Context f36364y;

    /* renamed from: z */
    public zzchu f36365z;

    /* renamed from: p */
    public final List f36355p = new Vector();

    /* renamed from: q */
    public final AtomicReference f36356q = new AtomicReference();

    /* renamed from: r */
    public final AtomicReference f36357r = new AtomicReference();

    /* renamed from: C */
    public final CountDownLatch f36353C = new CountDownLatch(1);

    public zzi(Context context, zzchu zzchuVar) {
        this.f36363x = context;
        this.f36364y = context;
        this.f36365z = zzchuVar;
        this.f36351A = zzchuVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f36361v = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().m23658b(g93.f10593X1)).booleanValue();
        this.f36352B = booleanValue;
        this.f36362w = es6.m23231a(context, newCachedThreadPool, booleanValue);
        this.f36359t = ((Boolean) zzba.zzc().m23658b(g93.f10553T1)).booleanValue();
        this.f36360u = ((Boolean) zzba.zzc().m23658b(g93.f10603Y1)).booleanValue();
        if (((Boolean) zzba.zzc().m23658b(g93.f10583W1)).booleanValue()) {
            this.f36354D = 2;
        } else {
            this.f36354D = 1;
        }
        if (!((Boolean) zzba.zzc().m23658b(g93.f10584W2)).booleanValue()) {
            this.f36358s = m1316c();
        }
        if (!((Boolean) zzba.zzc().m23658b(g93.f10514P2)).booleanValue()) {
            zzay.zzb();
            if (!d04.m24836A()) {
                run();
                return;
            }
        }
        z04.f34305a.execute(this);
    }

    /* renamed from: h */
    public static final Context m1311h(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: b */
    public final /* synthetic */ void m1317b(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ll2.m16874a(this.f36351A.f36993p, m1311h(this.f36364y), z, this.f36352B).m16867h();
        } catch (NullPointerException e) {
            this.f36362w.m23229c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    /* renamed from: c */
    public final boolean m1316c() {
        Context context = this.f36363x;
        es6 es6Var = this.f36362w;
        su7 su7Var = new su7(this);
        return new bu6(this.f36363x, mt6.m15772b(context, es6Var), su7Var, ((Boolean) zzba.zzc().m23658b(g93.f10563U1)).booleanValue()).m25821d(1);
    }

    /* renamed from: d */
    public final int m1315d() {
        if (!this.f36359t || this.f36358s) {
            return this.f36354D;
        }
        return 1;
    }

    /* renamed from: e */
    public final ol2 m1314e() {
        return (ol2) (m1315d() == 2 ? this.f36357r : this.f36356q).get();
    }

    /* renamed from: f */
    public final void m1313f() {
        ol2 m1314e = m1314e();
        if (this.f36355p.isEmpty() || m1314e == null) {
            return;
        }
        for (Object[] objArr : this.f36355p) {
            int length = objArr.length;
            if (length == 1) {
                m1314e.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                m1314e.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.f36355p.clear();
    }

    /* renamed from: g */
    public final void m1312g(boolean z) {
        this.f36356q.set(rl2.m11196q(this.f36365z.f36993p, m1311h(this.f36363x), z, this.f36354D));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.google.android.gms.internal.ads.zzchu] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().m23658b(g93.f10584W2)).booleanValue()) {
                this.f36358s = m1316c();
            }
            boolean z = this.f36365z.f36996s;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().m23658b(g93.f10522Q0)).booleanValue() && z) {
                z2 = true;
            }
            if (m1315d() == 1) {
                m1312g(z2);
                if (this.f36354D == 2) {
                    this.f36361v.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi.this.m1317b(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    ll2 m16874a = ll2.m16874a(this.f36365z.f36993p, m1311h(this.f36363x), z2, this.f36352B);
                    this.f36357r.set(m16874a);
                    if (this.f36360u && !m16874a.m16865j()) {
                        this.f36354D = 1;
                        m1312g(z2);
                    }
                } catch (NullPointerException e) {
                    this.f36354D = 1;
                    m1312g(z2);
                    this.f36362w.m23229c(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.f36353C.countDown();
            this.f36363x = null;
            this.f36365z = null;
        }
    }

    public final boolean zzd() {
        try {
            this.f36353C.await();
            return true;
        } catch (InterruptedException e) {
            k04.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.daaw.ol2
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.daaw.ol2
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (zzd()) {
            ol2 m1314e = m1314e();
            if (((Boolean) zzba.zzc().m23658b(g93.f10540R8)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 4, null);
            }
            if (m1314e != null) {
                m1313f();
                return m1314e.zzf(m1311h(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.daaw.ol2
    public final String zzg(Context context) {
        ol2 m1314e;
        if (!zzd() || (m1314e = m1314e()) == null) {
            return "";
        }
        m1313f();
        return m1314e.zzg(m1311h(context));
    }

    @Override // com.daaw.ol2
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().m23658b(g93.f10530Q8)).booleanValue()) {
            ol2 m1314e = m1314e();
            if (((Boolean) zzba.zzc().m23658b(g93.f10540R8)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return m1314e != null ? m1314e.zzh(context, view, activity) : "";
        } else if (zzd()) {
            ol2 m1314e2 = m1314e();
            if (((Boolean) zzba.zzc().m23658b(g93.f10540R8)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return m1314e2 != null ? m1314e2.zzh(context, view, activity) : "";
        } else {
            return "";
        }
    }

    @Override // com.daaw.ol2
    public final void zzk(MotionEvent motionEvent) {
        ol2 m1314e = m1314e();
        if (m1314e == null) {
            this.f36355p.add(new Object[]{motionEvent});
            return;
        }
        m1313f();
        m1314e.zzk(motionEvent);
    }

    @Override // com.daaw.ol2
    public final void zzl(int i, int i2, int i3) {
        ol2 m1314e = m1314e();
        if (m1314e == null) {
            this.f36355p.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        m1313f();
        m1314e.zzl(i, i2, i3);
    }

    @Override // com.daaw.ol2
    public final void zzn(View view) {
        ol2 m1314e = m1314e();
        if (m1314e != null) {
            m1314e.zzn(view);
        }
    }
}
