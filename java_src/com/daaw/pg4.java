package com.daaw;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
/* loaded from: classes.dex */
public final class pg4 implements lq4, fs4, ir4, zza, er4 {
    public final WeakReference A;
    public final WeakReference B;
    @GuardedBy("this")
    public boolean C;
    public final AtomicBoolean D = new AtomicBoolean();
    public final la3 E;
    public final Context p;
    public final Executor q;
    public final Executor r;
    public final ScheduledExecutorService s;
    public final fi6 t;
    public final th6 u;
    public final kp6 v;
    public final aj6 w;
    public final sl2 x;
    public final ja3 y;
    public final to6 z;

    public pg4(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, fi6 fi6Var, th6 th6Var, kp6 kp6Var, aj6 aj6Var, View view, a74 a74Var, sl2 sl2Var, ja3 ja3Var, la3 la3Var, to6 to6Var, byte[] bArr) {
        this.p = context;
        this.q = executor;
        this.r = executor2;
        this.s = scheduledExecutorService;
        this.t = fi6Var;
        this.u = th6Var;
        this.v = kp6Var;
        this.w = aj6Var;
        this.x = sl2Var;
        this.A = new WeakReference(view);
        this.B = new WeakReference(a74Var);
        this.y = ja3Var;
        this.E = la3Var;
        this.z = to6Var;
    }

    @Override // com.daaw.er4
    public final void A(zze zzeVar) {
        if (((Boolean) zzba.zzc().b(g93.o1)).booleanValue()) {
            this.w.a(this.v.c(this.t, this.u, kp6.f(2, zzeVar.zza, this.u.p)));
        }
    }

    public final /* synthetic */ void F() {
        this.q.execute(new Runnable() { // from class: com.daaw.mg4
            @Override // java.lang.Runnable
            public final void run() {
                pg4.this.S();
            }
        });
    }

    public final /* synthetic */ void H(int i, int i2) {
        W(i - 1, i2);
    }

    public final /* synthetic */ void M(final int i, final int i2) {
        this.q.execute(new Runnable() { // from class: com.daaw.kg4
            @Override // java.lang.Runnable
            public final void run() {
                pg4.this.H(i, i2);
            }
        });
    }

    public final void S() {
        int i;
        String zzh = ((Boolean) zzba.zzc().b(g93.Z2)).booleanValue() ? this.x.c().zzh(this.p, (View) this.A.get(), null) : null;
        if ((((Boolean) zzba.zzc().b(g93.l0)).booleanValue() && this.t.b.b.g) || !((Boolean) za3.h.e()).booleanValue()) {
            aj6 aj6Var = this.w;
            kp6 kp6Var = this.v;
            fi6 fi6Var = this.t;
            th6 th6Var = this.u;
            aj6Var.a(kp6Var.d(fi6Var, th6Var, false, zzh, null, th6Var.d));
            return;
        }
        if (((Boolean) za3.g.e()).booleanValue() && ((i = this.u.b) == 1 || i == 2 || i == 5)) {
            a74 a74Var = (a74) this.B.get();
        }
        s67.r((j67) s67.o(j67.D(s67.i(null)), ((Long) zzba.zzc().b(g93.P0)).longValue(), TimeUnit.MILLISECONDS, this.s), new og4(this, zzh), this.q);
    }

    @Override // com.daaw.lq4
    public final void T() {
        aj6 aj6Var = this.w;
        kp6 kp6Var = this.v;
        fi6 fi6Var = this.t;
        th6 th6Var = this.u;
        aj6Var.a(kp6Var.c(fi6Var, th6Var, th6Var.h));
    }

    public final void W(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.A.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            S();
        } else {
            this.s.schedule(new Runnable() { // from class: com.daaw.ig4
                @Override // java.lang.Runnable
                public final void run() {
                    pg4.this.M(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.daaw.lq4
    public final void c() {
        aj6 aj6Var = this.w;
        kp6 kp6Var = this.v;
        fi6 fi6Var = this.t;
        th6 th6Var = this.u;
        aj6Var.a(kp6Var.c(fi6Var, th6Var, th6Var.j));
    }

    @Override // com.daaw.lq4
    public final void m(cv3 cv3Var, String str, String str2) {
        aj6 aj6Var = this.w;
        kp6 kp6Var = this.v;
        th6 th6Var = this.u;
        aj6Var.a(kp6Var.e(th6Var, th6Var.i, cv3Var));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) zzba.zzc().b(g93.l0)).booleanValue() && this.t.b.b.g) && ((Boolean) za3.d.e()).booleanValue()) {
            s67.r(s67.f(j67.D(this.y.a()), Throwable.class, new ey6() { // from class: com.daaw.jg4
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, z04.f), new ng4(this), this.q);
            return;
        }
        aj6 aj6Var = this.w;
        kp6 kp6Var = this.v;
        fi6 fi6Var = this.t;
        th6 th6Var = this.u;
        aj6Var.c(kp6Var.c(fi6Var, th6Var, th6Var.c), true == zzt.zzo().x(this.p) ? 2 : 1);
    }

    @Override // com.daaw.lq4
    public final void zzj() {
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        if (this.D.compareAndSet(false, true)) {
            int intValue = ((Integer) zzba.zzc().b(g93.d3)).intValue();
            if (intValue > 0) {
                W(intValue, ((Integer) zzba.zzc().b(g93.e3)).intValue());
                return;
            }
            if (((Boolean) zzba.zzc().b(g93.c3)).booleanValue()) {
                this.r.execute(new Runnable() { // from class: com.daaw.lg4
                    @Override // java.lang.Runnable
                    public final void run() {
                        pg4.this.F();
                    }
                });
            } else {
                S();
            }
        }
    }

    @Override // com.daaw.lq4
    public final void zzm() {
    }

    @Override // com.daaw.fs4
    public final synchronized void zzn() {
        aj6 aj6Var;
        List c;
        if (this.C) {
            ArrayList arrayList = new ArrayList(this.u.d);
            arrayList.addAll(this.u.g);
            aj6Var = this.w;
            c = this.v.d(this.t, this.u, true, null, null, arrayList);
        } else {
            aj6 aj6Var2 = this.w;
            kp6 kp6Var = this.v;
            fi6 fi6Var = this.t;
            th6 th6Var = this.u;
            aj6Var2.a(kp6Var.c(fi6Var, th6Var, th6Var.n));
            aj6Var = this.w;
            kp6 kp6Var2 = this.v;
            fi6 fi6Var2 = this.t;
            th6 th6Var2 = this.u;
            c = kp6Var2.c(fi6Var2, th6Var2, th6Var2.g);
        }
        aj6Var.a(c);
        this.C = true;
    }

    @Override // com.daaw.lq4
    public final void zzo() {
    }
}
