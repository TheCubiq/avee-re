package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class x78 extends c86 {

    /* renamed from: c */
    public final u78 f32172c;

    /* renamed from: d */
    public ua5 f32173d;

    /* renamed from: e */
    public volatile Boolean f32174e;

    /* renamed from: f */
    public final hl2 f32175f;

    /* renamed from: g */
    public final fa8 f32176g;

    /* renamed from: h */
    public final List f32177h;

    /* renamed from: i */
    public final hl2 f32178i;

    public x78(dr6 dr6Var) {
        super(dr6Var);
        this.f32177h = new ArrayList();
        this.f32176g = new fa8(dr6Var.mo3909b());
        this.f32172c = new u78(this);
        this.f32175f = new u58(this, dr6Var);
        this.f32178i = new a68(this, dr6Var);
    }

    /* renamed from: M */
    public static /* bridge */ /* synthetic */ void m5471M(x78 x78Var, ComponentName componentName) {
        x78Var.mo6991f();
        if (x78Var.f32173d != null) {
            x78Var.f32173d = null;
            x78Var.f25143a.mo3895i().m14156v().m20652b("Disconnected from device MeasurementService", componentName);
            x78Var.mo6991f();
            x78Var.m5468P();
        }
    }

    /* renamed from: A */
    public final boolean m5483A() {
        mo6991f();
        m25515g();
        return !m5482B() || this.f25143a.m24045N().m24472o0() >= ((Integer) m75.f18534h0.m18786a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5482B() {
        hk5 m14156v;
        String str;
        hk5 m14155w;
        String str2;
        mo6991f();
        m25515g();
        if (this.f32174e == null) {
            mo6991f();
            m25515g();
            l36 m24053F = this.f25143a.m24053F();
            m24053F.mo6991f();
            boolean z = false;
            Boolean valueOf = !m24053F.m17176n().contains("use_service") ? null : Boolean.valueOf(m24053F.m17176n().getBoolean("use_service", false));
            if (valueOf == null || !valueOf.booleanValue()) {
                this.f25143a.mo3911a();
                if (this.f25143a.m24057B().m5305n() != 1) {
                    this.f25143a.mo3895i().m14156v().m20653a("Checking service availability");
                    int m24470p0 = this.f25143a.m24045N().m24470p0(c80.f5613a);
                    if (m24470p0 != 0) {
                        if (m24470p0 != 1) {
                            if (m24470p0 != 2) {
                                if (m24470p0 == 3) {
                                    m14155w = this.f25143a.mo3895i().m14155w();
                                    str2 = "Service disabled";
                                } else if (m24470p0 == 9) {
                                    m14155w = this.f25143a.mo3895i().m14155w();
                                    str2 = "Service invalid";
                                } else if (m24470p0 != 18) {
                                    this.f25143a.mo3895i().m14155w().m20652b("Unexpected service status", Integer.valueOf(m24470p0));
                                } else {
                                    m14156v = this.f25143a.mo3895i().m14155w();
                                    str = "Service updating";
                                }
                                m14155w.m20653a(str2);
                            } else {
                                this.f25143a.mo3895i().m14161p().m20653a("Service container out of date");
                                if (this.f25143a.m24045N().m24472o0() >= 17443) {
                                    z = valueOf == null;
                                }
                            }
                            r1 = false;
                        } else {
                            this.f25143a.mo3895i().m14156v().m20653a("Service missing");
                        }
                        if (z && this.f25143a.m24020z().m12672G()) {
                            this.f25143a.mo3895i().m14160q().m20653a("No way to upload. Consider using the full version of Analytics");
                        } else if (r1) {
                            l36 m24053F2 = this.f25143a.m24053F();
                            m24053F2.mo6991f();
                            SharedPreferences.Editor edit = m24053F2.m17176n().edit();
                            edit.putBoolean("use_service", z);
                            edit.apply();
                        }
                        r1 = z;
                    } else {
                        m14156v = this.f25143a.mo3895i().m14156v();
                        str = "Service available";
                    }
                    m14156v.m20653a(str);
                }
                z = true;
                if (z) {
                }
                if (r1) {
                }
                r1 = z;
            }
            this.f32174e = Boolean.valueOf(r1);
        }
        return this.f32174e.booleanValue();
    }

    /* renamed from: C */
    public final zzq m5481C(boolean z) {
        Pair m23795a;
        this.f25143a.mo3911a();
        xb5 m24057B = this.f25143a.m24057B();
        String str = null;
        if (z) {
            om5 mo3895i = this.f25143a.mo3895i();
            if (mo3895i.f25143a.m24053F().f17002d != null && (m23795a = mo3895i.f25143a.m24053F().f17002d.m23795a()) != null && m23795a != l36.f17000y) {
                str = String.valueOf(m23795a.second) + ":" + ((String) m23795a.first);
            }
        }
        return m24057B.m5303p(str);
    }

    /* renamed from: D */
    public final void m5480D() {
        mo6991f();
        this.f25143a.mo3895i().m14156v().m20652b("Processing queued up service tasks", Integer.valueOf(this.f32177h.size()));
        for (Runnable runnable : this.f32177h) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                this.f25143a.mo3895i().m14160q().m20652b("Task exception while flushing queue", e);
            }
        }
        this.f32177h.clear();
        this.f32178i.m20638b();
    }

    /* renamed from: E */
    public final void m5479E() {
        mo6991f();
        this.f32176g.m22815b();
        hl2 hl2Var = this.f32175f;
        this.f25143a.m24020z();
        hl2Var.m20637d(((Long) m75.f18503K.m18786a(null)).longValue());
    }

    /* renamed from: F */
    public final void m5478F(Runnable runnable) {
        mo6991f();
        if (m5449z()) {
            runnable.run();
            return;
        }
        int size = this.f32177h.size();
        this.f25143a.m24020z();
        if (size >= 1000) {
            this.f25143a.mo3895i().m14160q().m20653a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.f32177h.add(runnable);
        this.f32178i.m20637d(60000L);
        m5468P();
    }

    /* renamed from: G */
    public final boolean m5477G() {
        this.f25143a.mo3911a();
        return true;
    }

    /* renamed from: J */
    public final Boolean m5474J() {
        return this.f32174e;
    }

    /* renamed from: O */
    public final void m5469O() {
        mo6991f();
        m25515g();
        zzq m5481C = m5481C(true);
        this.f25143a.m24056C().m11363q();
        m5478F(new l58(this, m5481C));
    }

    /* renamed from: P */
    public final void m5468P() {
        mo6991f();
        m25515g();
        if (m5449z()) {
            return;
        }
        if (m5482B()) {
            this.f32172c.m8445c();
        } else if (this.f25143a.m24020z().m12672G()) {
        } else {
            this.f25143a.mo3911a();
            List<ResolveInfo> queryIntentServices = this.f25143a.mo3905d().getPackageManager().queryIntentServices(new Intent().setClassName(this.f25143a.mo3905d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                this.f25143a.mo3895i().m14160q().m20653a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            Context mo3905d = this.f25143a.mo3905d();
            this.f25143a.mo3911a();
            intent.setComponent(new ComponentName(mo3905d, "com.google.android.gms.measurement.AppMeasurementService"));
            this.f32172c.m8446b(intent);
        }
    }

    /* renamed from: Q */
    public final void m5467Q() {
        mo6991f();
        m25515g();
        this.f32172c.m8444d();
        try {
            C1291fj.m22614b().m22613c(this.f25143a.mo3905d(), this.f32172c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f32173d = null;
    }

    /* renamed from: R */
    public final void m5466R(ox3 ox3Var) {
        mo6991f();
        m25515g();
        m5478F(new i58(this, m5481C(false), ox3Var));
    }

    /* renamed from: S */
    public final void m5465S(AtomicReference atomicReference) {
        mo6991f();
        m25515g();
        m5478F(new f58(this, atomicReference, m5481C(false)));
    }

    /* renamed from: T */
    public final void m5464T(ox3 ox3Var, String str, String str2) {
        mo6991f();
        m25515g();
        m5478F(new z68(this, str, str2, m5481C(false), ox3Var));
    }

    /* renamed from: U */
    public final void m5463U(AtomicReference atomicReference, String str, String str2, String str3) {
        mo6991f();
        m25515g();
        m5478F(new w68(this, atomicReference, null, str2, str3, m5481C(false)));
    }

    /* renamed from: V */
    public final void m5462V(ox3 ox3Var, String str, String str2, boolean z) {
        mo6991f();
        m25515g();
        m5478F(new u48(this, str, str2, m5481C(false), z, ox3Var));
    }

    /* renamed from: W */
    public final void m5461W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        mo6991f();
        m25515g();
        m5478F(new c78(this, atomicReference, null, str2, str3, m5481C(false), z));
    }

    @Override // com.daaw.c86
    /* renamed from: m */
    public final boolean mo5306m() {
        return false;
    }

    /* renamed from: n */
    public final void m5460n(zzaw zzawVar, String str) {
        ry0.m10830j(zzawVar);
        mo6991f();
        m25515g();
        m5477G();
        m5478F(new q68(this, true, m5481C(true), this.f25143a.m24056C().m11359v(zzawVar), zzawVar, str));
    }

    /* renamed from: o */
    public final void m5459o(ox3 ox3Var, zzaw zzawVar, String str) {
        mo6991f();
        m25515g();
        if (this.f25143a.m24045N().m24470p0(c80.f5613a) == 0) {
            m5478F(new x58(this, zzawVar, str, ox3Var));
            return;
        }
        this.f25143a.mo3895i().m14155w().m20653a("Not bundling data. Service unavailable or out of date");
        this.f25143a.m24045N().m24508G(ox3Var, new byte[0]);
    }

    /* renamed from: p */
    public final void m5458p() {
        mo6991f();
        m25515g();
        zzq m5481C = m5481C(false);
        m5477G();
        this.f25143a.m24056C().m11364p();
        m5478F(new c58(this, m5481C));
    }

    /* renamed from: q */
    public final void m5457q(ua5 ua5Var, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i;
        hk5 m14160q;
        String str;
        mo6991f();
        m25515g();
        m5477G();
        this.f25143a.m24020z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List m11365o = this.f25143a.m24056C().m11365o(100);
            if (m11365o != null) {
                arrayList.addAll(m11365o);
                i = m11365o.size();
            } else {
                i = 0;
            }
            if (abstractSafeParcelable != null && i < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i4);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        ua5Var.mo8371i1((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        e = e;
                        m14160q = this.f25143a.mo3895i().m14160q();
                        str = "Failed to send event to the service";
                        m14160q.m20652b(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkw) {
                    try {
                        ua5Var.mo8379C1((zzkw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        m14160q = this.f25143a.mo3895i().m14160q();
                        str = "Failed to send user property to the service";
                        m14160q.m20652b(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        ua5Var.mo8378C2((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        m14160q = this.f25143a.mo3895i().m14160q();
                        str = "Failed to send conditional user property to the service";
                        m14160q.m20652b(str, e);
                    }
                } else {
                    this.f25143a.mo3895i().m14160q().m20653a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* renamed from: s */
    public final void m5456s(zzac zzacVar) {
        ry0.m10830j(zzacVar);
        mo6991f();
        m25515g();
        this.f25143a.mo3911a();
        m5478F(new t68(this, true, m5481C(true), this.f25143a.m24056C().m11360u(zzacVar), new zzac(zzacVar), zzacVar));
    }

    /* renamed from: t */
    public final void m5455t(boolean z) {
        mo6991f();
        m25515g();
        if (z) {
            m5477G();
            this.f25143a.m24056C().m11364p();
        }
        if (m5483A()) {
            m5478F(new n68(this, m5481C(false)));
        }
    }

    /* renamed from: u */
    public final void m5454u(t38 t38Var) {
        mo6991f();
        m25515g();
        m5478F(new o58(this, t38Var));
    }

    /* renamed from: v */
    public final void m5453v(Bundle bundle) {
        mo6991f();
        m25515g();
        m5478F(new r58(this, m5481C(false), bundle));
    }

    /* renamed from: w */
    public final void m5452w() {
        mo6991f();
        m25515g();
        m5478F(new d68(this, m5481C(true)));
    }

    /* renamed from: x */
    public final void m5451x(ua5 ua5Var) {
        mo6991f();
        ry0.m10830j(ua5Var);
        this.f32173d = ua5Var;
        m5479E();
        m5480D();
    }

    /* renamed from: y */
    public final void m5450y(zzkw zzkwVar) {
        mo6991f();
        m25515g();
        m5477G();
        m5478F(new x48(this, m5481C(true), this.f25143a.m24056C().m11358w(zzkwVar), zzkwVar));
    }

    /* renamed from: z */
    public final boolean m5449z() {
        mo6991f();
        m25515g();
        return this.f32173d != null;
    }
}
