package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
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
    public final u78 c;
    public ua5 d;
    public volatile Boolean e;
    public final hl2 f;
    public final fa8 g;
    public final List h;
    public final hl2 i;

    public x78(dr6 dr6Var) {
        super(dr6Var);
        this.h = new ArrayList();
        this.g = new fa8(dr6Var.b());
        this.c = new u78(this);
        this.f = new u58(this, dr6Var);
        this.i = new a68(this, dr6Var);
    }

    public static /* bridge */ /* synthetic */ void M(x78 x78Var, ComponentName componentName) {
        x78Var.f();
        if (x78Var.d != null) {
            x78Var.d = null;
            x78Var.a.i().v().b("Disconnected from device MeasurementService", componentName);
            x78Var.f();
            x78Var.P();
        }
    }

    public final boolean A() {
        f();
        g();
        return !B() || this.a.N().o0() >= ((Integer) m75.h0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B() {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.x78.B():boolean");
    }

    public final zzq C(boolean z) {
        Pair a;
        this.a.a();
        xb5 B = this.a.B();
        String str = null;
        if (z) {
            om5 i = this.a.i();
            if (i.a.F().d != null && (a = i.a.F().d.a()) != null && a != l36.y) {
                str = String.valueOf(a.second) + ":" + ((String) a.first);
            }
        }
        return B.p(str);
    }

    public final void D() {
        f();
        this.a.i().v().b("Processing queued up service tasks", Integer.valueOf(this.h.size()));
        for (Runnable runnable : this.h) {
            try {
                runnable.run();
            } catch (RuntimeException e) {
                this.a.i().q().b("Task exception while flushing queue", e);
            }
        }
        this.h.clear();
        this.i.b();
    }

    public final void E() {
        f();
        this.g.b();
        hl2 hl2Var = this.f;
        this.a.z();
        hl2Var.d(((Long) m75.K.a(null)).longValue());
    }

    public final void F(Runnable runnable) {
        f();
        if (z()) {
            runnable.run();
            return;
        }
        int size = this.h.size();
        this.a.z();
        if (size >= 1000) {
            this.a.i().q().a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.h.add(runnable);
        this.i.d(60000L);
        P();
    }

    public final boolean G() {
        this.a.a();
        return true;
    }

    public final Boolean J() {
        return this.e;
    }

    public final void O() {
        f();
        g();
        zzq C = C(true);
        this.a.C().q();
        F(new l58(this, C));
    }

    public final void P() {
        f();
        g();
        if (z()) {
            return;
        }
        if (B()) {
            this.c.c();
        } else if (this.a.z().G()) {
        } else {
            this.a.a();
            List<ResolveInfo> queryIntentServices = this.a.d().getPackageManager().queryIntentServices(new Intent().setClassName(this.a.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                this.a.i().q().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            Context d = this.a.d();
            this.a.a();
            intent.setComponent(new ComponentName(d, "com.google.android.gms.measurement.AppMeasurementService"));
            this.c.b(intent);
        }
    }

    public final void Q() {
        f();
        g();
        this.c.d();
        try {
            fj.b().c(this.a.d(), this.c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final void R(ox3 ox3Var) {
        f();
        g();
        F(new i58(this, C(false), ox3Var));
    }

    public final void S(AtomicReference atomicReference) {
        f();
        g();
        F(new f58(this, atomicReference, C(false)));
    }

    public final void T(ox3 ox3Var, String str, String str2) {
        f();
        g();
        F(new z68(this, str, str2, C(false), ox3Var));
    }

    public final void U(AtomicReference atomicReference, String str, String str2, String str3) {
        f();
        g();
        F(new w68(this, atomicReference, null, str2, str3, C(false)));
    }

    public final void V(ox3 ox3Var, String str, String str2, boolean z) {
        f();
        g();
        F(new u48(this, str, str2, C(false), z, ox3Var));
    }

    public final void W(AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        f();
        g();
        F(new c78(this, atomicReference, null, str2, str3, C(false), z));
    }

    @Override // com.daaw.c86
    public final boolean m() {
        return false;
    }

    public final void n(zzaw zzawVar, String str) {
        ry0.j(zzawVar);
        f();
        g();
        G();
        F(new q68(this, true, C(true), this.a.C().v(zzawVar), zzawVar, str));
    }

    public final void o(ox3 ox3Var, zzaw zzawVar, String str) {
        f();
        g();
        if (this.a.N().p0(c80.a) == 0) {
            F(new x58(this, zzawVar, str, ox3Var));
            return;
        }
        this.a.i().w().a("Not bundling data. Service unavailable or out of date");
        this.a.N().G(ox3Var, new byte[0]);
    }

    public final void p() {
        f();
        g();
        zzq C = C(false);
        G();
        this.a.C().p();
        F(new c58(this, C));
    }

    public final void q(ua5 ua5Var, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int i;
        hk5 q;
        String str;
        f();
        g();
        G();
        this.a.z();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List o = this.a.C().o(100);
            if (o != null) {
                arrayList.addAll(o);
                i = o.size();
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
                        ua5Var.i1((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e) {
                        e = e;
                        q = this.a.i().q();
                        str = "Failed to send event to the service";
                        q.b(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzkw) {
                    try {
                        ua5Var.C1((zzkw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e2) {
                        e = e2;
                        q = this.a.i().q();
                        str = "Failed to send user property to the service";
                        q.b(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        ua5Var.C2((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e3) {
                        e = e3;
                        q = this.a.i().q();
                        str = "Failed to send conditional user property to the service";
                        q.b(str, e);
                    }
                } else {
                    this.a.i().q().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    public final void s(zzac zzacVar) {
        ry0.j(zzacVar);
        f();
        g();
        this.a.a();
        F(new t68(this, true, C(true), this.a.C().u(zzacVar), new zzac(zzacVar), zzacVar));
    }

    public final void t(boolean z) {
        f();
        g();
        if (z) {
            G();
            this.a.C().p();
        }
        if (A()) {
            F(new n68(this, C(false)));
        }
    }

    public final void u(t38 t38Var) {
        f();
        g();
        F(new o58(this, t38Var));
    }

    public final void v(Bundle bundle) {
        f();
        g();
        F(new r58(this, C(false), bundle));
    }

    public final void w() {
        f();
        g();
        F(new d68(this, C(true)));
    }

    public final void x(ua5 ua5Var) {
        f();
        ry0.j(ua5Var);
        this.d = ua5Var;
        E();
        D();
    }

    public final void y(zzkw zzkwVar) {
        f();
        g();
        G();
        F(new x48(this, C(true), this.a.C().w(zzkwVar), zzkwVar));
    }

    public final boolean z() {
        f();
        g();
        return this.d != null;
    }
}
