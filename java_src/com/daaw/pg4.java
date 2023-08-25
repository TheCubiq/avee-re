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

    /* renamed from: A */
    public final WeakReference f22909A;

    /* renamed from: B */
    public final WeakReference f22910B;
    @GuardedBy("this")

    /* renamed from: C */
    public boolean f22911C;

    /* renamed from: D */
    public final AtomicBoolean f22912D = new AtomicBoolean();

    /* renamed from: E */
    public final la3 f22913E;

    /* renamed from: p */
    public final Context f22914p;

    /* renamed from: q */
    public final Executor f22915q;

    /* renamed from: r */
    public final Executor f22916r;

    /* renamed from: s */
    public final ScheduledExecutorService f22917s;

    /* renamed from: t */
    public final fi6 f22918t;

    /* renamed from: u */
    public final th6 f22919u;

    /* renamed from: v */
    public final kp6 f22920v;

    /* renamed from: w */
    public final aj6 f22921w;

    /* renamed from: x */
    public final sl2 f22922x;

    /* renamed from: y */
    public final ja3 f22923y;

    /* renamed from: z */
    public final to6 f22924z;

    public pg4(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, fi6 fi6Var, th6 th6Var, kp6 kp6Var, aj6 aj6Var, View view, a74 a74Var, sl2 sl2Var, ja3 ja3Var, la3 la3Var, to6 to6Var, byte[] bArr) {
        this.f22914p = context;
        this.f22915q = executor;
        this.f22916r = executor2;
        this.f22917s = scheduledExecutorService;
        this.f22918t = fi6Var;
        this.f22919u = th6Var;
        this.f22920v = kp6Var;
        this.f22921w = aj6Var;
        this.f22922x = sl2Var;
        this.f22909A = new WeakReference(view);
        this.f22910B = new WeakReference(a74Var);
        this.f22923y = ja3Var;
        this.f22913E = la3Var;
        this.f22924z = to6Var;
    }

    @Override // com.daaw.er4
    /* renamed from: A */
    public final void mo9178A(zze zzeVar) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10777o1)).booleanValue()) {
            this.f22921w.m27441a(this.f22920v.m17533c(this.f22918t, this.f22919u, kp6.m17530f(2, zzeVar.zza, this.f22919u.f27710p)));
        }
    }

    /* renamed from: F */
    public final /* synthetic */ void m13399F() {
        this.f22915q.execute(new Runnable() { // from class: com.daaw.mg4
            @Override // java.lang.Runnable
            public final void run() {
                pg4.this.m13396S();
            }
        });
    }

    /* renamed from: H */
    public final /* synthetic */ void m13398H(int i, int i2) {
        m13395W(i - 1, i2);
    }

    /* renamed from: M */
    public final /* synthetic */ void m13397M(final int i, final int i2) {
        this.f22915q.execute(new Runnable() { // from class: com.daaw.kg4
            @Override // java.lang.Runnable
            public final void run() {
                pg4.this.m13398H(i, i2);
            }
        });
    }

    /* renamed from: S */
    public final void m13396S() {
        int i;
        String zzh = ((Boolean) zzba.zzc().m23658b(g93.f10614Z2)).booleanValue() ? this.f22922x.m10202c().zzh(this.f22914p, (View) this.f22909A.get(), null) : null;
        if ((((Boolean) zzba.zzc().m23658b(g93.f10743l0)).booleanValue() && this.f22918t.f9624b.f8508b.f31257g) || !((Boolean) za3.f34688h.m16137e()).booleanValue()) {
            aj6 aj6Var = this.f22921w;
            kp6 kp6Var = this.f22920v;
            fi6 fi6Var = this.f22918t;
            th6 th6Var = this.f22919u;
            aj6Var.m27441a(kp6Var.m17532d(fi6Var, th6Var, false, zzh, null, th6Var.f27686d));
            return;
        }
        if (((Boolean) za3.f34687g.m16137e()).booleanValue() && ((i = this.f22919u.f27682b) == 1 || i == 2 || i == 5)) {
            a74 a74Var = (a74) this.f22910B.get();
        }
        s67.m10625r((j67) s67.m10628o(j67.m18784D(s67.m10634i(null)), ((Long) zzba.zzc().m23658b(g93.f10512P0)).longValue(), TimeUnit.MILLISECONDS, this.f22917s), new og4(this, zzh), this.f22915q);
    }

    @Override // com.daaw.lq4
    /* renamed from: T */
    public final void mo5177T() {
        aj6 aj6Var = this.f22921w;
        kp6 kp6Var = this.f22920v;
        fi6 fi6Var = this.f22918t;
        th6 th6Var = this.f22919u;
        aj6Var.m27441a(kp6Var.m17533c(fi6Var, th6Var, th6Var.f27694h));
    }

    /* renamed from: W */
    public final void m13395W(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f22909A.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m13396S();
        } else {
            this.f22917s.schedule(new Runnable() { // from class: com.daaw.ig4
                @Override // java.lang.Runnable
                public final void run() {
                    pg4.this.m13397M(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.daaw.lq4
    /* renamed from: c */
    public final void mo5175c() {
        aj6 aj6Var = this.f22921w;
        kp6 kp6Var = this.f22920v;
        fi6 fi6Var = this.f22918t;
        th6 th6Var = this.f22919u;
        aj6Var.m27441a(kp6Var.m17533c(fi6Var, th6Var, th6Var.f27698j));
    }

    @Override // com.daaw.lq4
    /* renamed from: m */
    public final void mo5170m(cv3 cv3Var, String str, String str2) {
        aj6 aj6Var = this.f22921w;
        kp6 kp6Var = this.f22920v;
        th6 th6Var = this.f22919u;
        aj6Var.m27441a(kp6Var.m17531e(th6Var, th6Var.f27696i, cv3Var));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) zzba.zzc().m23658b(g93.f10743l0)).booleanValue() && this.f22918t.f9624b.f8508b.f31257g) && ((Boolean) za3.f34684d.m16137e()).booleanValue()) {
            s67.m10625r(s67.m10637f(j67.m18784D(this.f22923y.m18677a()), Throwable.class, new ey6() { // from class: com.daaw.jg4
                @Override // com.daaw.ey6
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, z04.f34310f), new ng4(this), this.f22915q);
            return;
        }
        aj6 aj6Var = this.f22921w;
        kp6 kp6Var = this.f22920v;
        fi6 fi6Var = this.f22918t;
        th6 th6Var = this.f22919u;
        aj6Var.m27439c(kp6Var.m17533c(fi6Var, th6Var, th6Var.f27684c), true == zzt.zzo().m11899x(this.f22914p) ? 2 : 1);
    }

    @Override // com.daaw.lq4
    public final void zzj() {
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        if (this.f22912D.compareAndSet(false, true)) {
            int intValue = ((Integer) zzba.zzc().m23658b(g93.f10658d3)).intValue();
            if (intValue > 0) {
                m13395W(intValue, ((Integer) zzba.zzc().m23658b(g93.f10669e3)).intValue());
                return;
            }
            if (((Boolean) zzba.zzc().m23658b(g93.f10647c3)).booleanValue()) {
                this.f22916r.execute(new Runnable() { // from class: com.daaw.lg4
                    @Override // java.lang.Runnable
                    public final void run() {
                        pg4.this.m13399F();
                    }
                });
            } else {
                m13396S();
            }
        }
    }

    @Override // com.daaw.lq4
    public final void zzm() {
    }

    @Override // com.daaw.fs4
    public final synchronized void zzn() {
        aj6 aj6Var;
        List m17533c;
        if (this.f22911C) {
            ArrayList arrayList = new ArrayList(this.f22919u.f27686d);
            arrayList.addAll(this.f22919u.f27692g);
            aj6Var = this.f22921w;
            m17533c = this.f22920v.m17532d(this.f22918t, this.f22919u, true, null, null, arrayList);
        } else {
            aj6 aj6Var2 = this.f22921w;
            kp6 kp6Var = this.f22920v;
            fi6 fi6Var = this.f22918t;
            th6 th6Var = this.f22919u;
            aj6Var2.m27441a(kp6Var.m17533c(fi6Var, th6Var, th6Var.f27706n));
            aj6Var = this.f22921w;
            kp6 kp6Var2 = this.f22920v;
            fi6 fi6Var2 = this.f22918t;
            th6 th6Var2 = this.f22919u;
            m17533c = kp6Var2.m17533c(fi6Var2, th6Var2, th6Var2.f27692g);
        }
        aj6Var.m27441a(m17533c);
        this.f22911C = true;
    }

    @Override // com.daaw.lq4
    public final void zzo() {
    }
}
