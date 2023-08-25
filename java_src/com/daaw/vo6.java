package com.daaw;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzchu;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class vo6 implements Runnable {
    public static Boolean y;
    public final Context p;
    public final zzchu q;
    public String s;
    public int t;
    public final sa5 u;
    public final vn5 w;
    public final yu3 x;
    public final dp6 r = gp6.M();
    public boolean v = false;

    public vo6(Context context, zzchu zzchuVar, sa5 sa5Var, vn5 vn5Var, yu3 yu3Var, byte[] bArr) {
        this.p = context;
        this.q = zzchuVar;
        this.u = sa5Var;
        this.w = vn5Var;
        this.x = yu3Var;
    }

    public static synchronized boolean a() {
        boolean booleanValue;
        Boolean valueOf;
        synchronized (vo6.class) {
            if (y == null) {
                if (((Boolean) ta3.b.e()).booleanValue()) {
                    valueOf = Boolean.valueOf(Math.random() < ((Double) ta3.a.e()).doubleValue());
                } else {
                    valueOf = Boolean.FALSE;
                }
                y = valueOf;
            }
            booleanValue = y.booleanValue();
        }
        return booleanValue;
    }

    public final synchronized void b(mo6 mo6Var) {
        if (!this.v) {
            c();
        }
        if (a()) {
            if (mo6Var == null) {
                return;
            }
            if (this.r.s() >= ((Integer) zzba.zzc().b(g93.Q7)).intValue()) {
                return;
            }
            dp6 dp6Var = this.r;
            ep6 L = fp6.L();
            ap6 L2 = bp6.L();
            L2.J(mo6Var.k());
            L2.F(mo6Var.j());
            L2.x(mo6Var.b());
            L2.L(3);
            L2.D(this.q.p);
            L2.s(this.s);
            L2.B(Build.VERSION.RELEASE);
            L2.G(Build.VERSION.SDK_INT);
            L2.K(mo6Var.m());
            L2.A(mo6Var.a());
            L2.v(this.t);
            L2.I(mo6Var.l());
            L2.t(mo6Var.c());
            L2.w(mo6Var.e());
            L2.y(mo6Var.f());
            L2.z(this.u.c(mo6Var.f()));
            L2.C(mo6Var.g());
            L2.u(mo6Var.d());
            L2.H(mo6Var.i());
            L2.E(mo6Var.h());
            L.s(L2);
            dp6Var.t(L);
        }
    }

    public final synchronized void c() {
        if (this.v) {
            return;
        }
        this.v = true;
        if (a()) {
            zzt.zzp();
            this.s = zzs.zzo(this.p);
            this.t = x70.f().a(this.p);
            long intValue = ((Integer) zzba.zzc().b(g93.P7)).intValue();
            z04.d.scheduleAtFixedRate(this, intValue, intValue, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void d() {
        try {
            new un5(this.p, this.q.p, this.x, Binder.getCallingUid(), null).zza(new on5((String) zzba.zzc().b(g93.O7), 60000, new HashMap(), ((gp6) this.r.n()).a(), "application/x-protobuf", false));
            this.r.u();
        } catch (Exception e) {
            if ((e instanceof gi5) && ((gi5) e).a() == 3) {
                this.r.u();
            } else {
                zzt.zzo().t(e, "CuiMonitor.sendCuiPing");
            }
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (a()) {
            if (this.r.s() == 0) {
                return;
            }
            d();
        }
    }
}
