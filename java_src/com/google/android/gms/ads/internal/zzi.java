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
    public final zzchu A;
    public final boolean B;
    public int D;
    public boolean s;
    public final boolean t;
    public final boolean u;
    public final Executor v;
    public final es6 w;
    public Context x;
    public final Context y;
    public zzchu z;
    public final List p = new Vector();
    public final AtomicReference q = new AtomicReference();
    public final AtomicReference r = new AtomicReference();
    public final CountDownLatch C = new CountDownLatch(1);

    public zzi(Context context, zzchu zzchuVar) {
        this.x = context;
        this.y = context;
        this.z = zzchuVar;
        this.A = zzchuVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.v = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzba.zzc().b(g93.X1)).booleanValue();
        this.B = booleanValue;
        this.w = es6.a(context, newCachedThreadPool, booleanValue);
        this.t = ((Boolean) zzba.zzc().b(g93.T1)).booleanValue();
        this.u = ((Boolean) zzba.zzc().b(g93.Y1)).booleanValue();
        if (((Boolean) zzba.zzc().b(g93.W1)).booleanValue()) {
            this.D = 2;
        } else {
            this.D = 1;
        }
        if (!((Boolean) zzba.zzc().b(g93.W2)).booleanValue()) {
            this.s = c();
        }
        if (!((Boolean) zzba.zzc().b(g93.P2)).booleanValue()) {
            zzay.zzb();
            if (!d04.A()) {
                run();
                return;
            }
        }
        z04.a.execute(this);
    }

    public static final Context h(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final /* synthetic */ void b(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            ll2.a(this.A.p, h(this.y), z, this.B).h();
        } catch (NullPointerException e) {
            this.w.c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    public final boolean c() {
        Context context = this.x;
        es6 es6Var = this.w;
        su7 su7Var = new su7(this);
        return new bu6(this.x, mt6.b(context, es6Var), su7Var, ((Boolean) zzba.zzc().b(g93.U1)).booleanValue()).d(1);
    }

    public final int d() {
        if (!this.t || this.s) {
            return this.D;
        }
        return 1;
    }

    public final ol2 e() {
        return (ol2) (d() == 2 ? this.r : this.q).get();
    }

    public final void f() {
        ol2 e = e();
        if (this.p.isEmpty() || e == null) {
            return;
        }
        for (Object[] objArr : this.p) {
            int length = objArr.length;
            if (length == 1) {
                e.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                e.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.p.clear();
    }

    public final void g(boolean z) {
        this.q.set(rl2.q(this.z.p, h(this.x), z, this.D));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.google.android.gms.internal.ads.zzchu] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().b(g93.W2)).booleanValue()) {
                this.s = c();
            }
            boolean z = this.z.s;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().b(g93.Q0)).booleanValue() && z) {
                z2 = true;
            }
            if (d() == 1) {
                g(z2);
                if (this.D == 2) {
                    this.v.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzi.this.b(z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    ll2 a = ll2.a(this.z.p, h(this.x), z2, this.B);
                    this.r.set(a);
                    if (this.u && !a.j()) {
                        this.D = 1;
                        g(z2);
                    }
                } catch (NullPointerException e) {
                    this.D = 1;
                    g(z2);
                    this.w.c(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.C.countDown();
            this.x = null;
            this.z = null;
        }
    }

    public final boolean zzd() {
        try {
            this.C.await();
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
            ol2 e = e();
            if (((Boolean) zzba.zzc().b(g93.R8)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 4, null);
            }
            if (e != null) {
                f();
                return e.zzf(h(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.daaw.ol2
    public final String zzg(Context context) {
        ol2 e;
        if (!zzd() || (e = e()) == null) {
            return "";
        }
        f();
        return e.zzg(h(context));
    }

    @Override // com.daaw.ol2
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().b(g93.Q8)).booleanValue()) {
            ol2 e = e();
            if (((Boolean) zzba.zzc().b(g93.R8)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return e != null ? e.zzh(context, view, activity) : "";
        } else if (zzd()) {
            ol2 e2 = e();
            if (((Boolean) zzba.zzc().b(g93.R8)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return e2 != null ? e2.zzh(context, view, activity) : "";
        } else {
            return "";
        }
    }

    @Override // com.daaw.ol2
    public final void zzk(MotionEvent motionEvent) {
        ol2 e = e();
        if (e == null) {
            this.p.add(new Object[]{motionEvent});
            return;
        }
        f();
        e.zzk(motionEvent);
    }

    @Override // com.daaw.ol2
    public final void zzl(int i, int i2, int i3) {
        ol2 e = e();
        if (e == null) {
            this.p.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        f();
        e.zzl(i, i2, i3);
    }

    @Override // com.daaw.ol2
    public final void zzn(View view) {
        ol2 e = e();
        if (e != null) {
            e.zzn(view);
        }
    }
}
