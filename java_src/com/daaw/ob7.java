package com.daaw;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
/* loaded from: classes2.dex */
public final class ob7 extends r95 {
    public final yb8 p;
    public Boolean q;
    public String r;

    public ob7(yb8 yb8Var, String str) {
        ry0.j(yb8Var);
        this.p = yb8Var;
        this.r = null;
    }

    @Override // com.daaw.ua5
    public final void C1(zzkw zzkwVar, zzq zzqVar) {
        ry0.j(zzkwVar);
        k3(zzqVar, false);
        j3(new c77(this, zzkwVar, zzqVar));
    }

    @Override // com.daaw.ua5
    public final void C2(zzac zzacVar, zzq zzqVar) {
        ry0.j(zzacVar);
        ry0.j(zzacVar.r);
        k3(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.p = zzqVar.p;
        j3(new jt6(this, zzacVar2, zzqVar));
    }

    @Override // com.daaw.ua5
    public final List G0(String str, String str2, String str3) {
        l3(str, true);
        try {
            return (List) this.p.r().s(new my6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.p.i().q().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    public final void I(zzaw zzawVar, zzq zzqVar) {
        this.p.c();
        this.p.h(zzawVar, zzqVar);
    }

    public final zzaw M(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if ("_cmp".equals(zzawVar.p) && (zzauVar = zzawVar.q) != null && zzauVar.zza() != 0) {
            String v = zzawVar.q.v("_cis");
            if ("referrer broadcast".equals(v) || "referrer API".equals(v)) {
                this.p.i().u().b("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.q, zzawVar.r, zzawVar.s);
            }
        }
        return zzawVar;
    }

    @Override // com.daaw.ua5
    public final void T1(zzq zzqVar) {
        ry0.f(zzqVar.p);
        ry0.j(zzqVar.K);
        f27 f27Var = new f27(this, zzqVar);
        ry0.j(f27Var);
        if (this.p.r().C()) {
            f27Var.run();
        } else {
            this.p.r().A(f27Var);
        }
    }

    @Override // com.daaw.ua5
    public final void X(zzq zzqVar) {
        k3(zzqVar, false);
        j3(new c17(this, zzqVar));
    }

    @Override // com.daaw.ua5
    public final List a2(String str, String str2, boolean z, zzq zzqVar) {
        k3(zzqVar, false);
        String str3 = zzqVar.p;
        ry0.j(str3);
        try {
            List<mc8> list = (List) this.p.r().s(new dv6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (mc8 mc8Var : list) {
                if (z || !dd8.W(mc8Var.c)) {
                    arrayList.add(new zzkw(mc8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.p.i().q().c("Failed to query user properties. appId", om5.z(zzqVar.p), e);
            return Collections.emptyList();
        }
    }

    @Override // com.daaw.ua5
    public final void e0(final Bundle bundle, zzq zzqVar) {
        k3(zzqVar, false);
        final String str = zzqVar.p;
        ry0.j(str);
        j3(new Runnable() { // from class: com.daaw.gs6
            @Override // java.lang.Runnable
            public final void run() {
                ob7.this.i3(str, bundle);
            }
        });
    }

    @Override // com.daaw.ua5
    public final List h0(String str, String str2, String str3, boolean z) {
        l3(str, true);
        try {
            List<mc8> list = (List) this.p.r().s(new gw6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (mc8 mc8Var : list) {
                if (z || !dd8.W(mc8Var.c)) {
                    arrayList.add(new zzkw(mc8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.p.i().q().c("Failed to get user properties as. appId", om5.z(str), e);
            return Collections.emptyList();
        }
    }

    public final void h3(zzaw zzawVar, zzq zzqVar) {
        hk5 v;
        String str;
        String str2;
        if (!this.p.a0().C(zzqVar.p)) {
            I(zzawVar, zzqVar);
            return;
        }
        this.p.i().v().b("EES config found for", zzqVar.p);
        gh6 a0 = this.p.a0();
        String str3 = zzqVar.p;
        tr3 tr3Var = TextUtils.isEmpty(str3) ? null : (tr3) a0.j.c(str3);
        if (tr3Var != null) {
            try {
                Map I = this.p.g0().I(zzawVar.q.q(), true);
                String a = dh7.a(zzawVar.p);
                if (a == null) {
                    a = zzawVar.p;
                }
                if (tr3Var.e(new s32(a, zzawVar.s, I))) {
                    if (tr3Var.g()) {
                        this.p.i().v().b("EES edited event", zzawVar.p);
                        zzawVar = this.p.g0().A(tr3Var.a().b());
                    }
                    I(zzawVar, zzqVar);
                    if (tr3Var.f()) {
                        for (s32 s32Var : tr3Var.a().c()) {
                            this.p.i().v().b("EES logging created event", s32Var.d());
                            I(this.p.g0().A(s32Var), zzqVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (sk4 unused) {
                this.p.i().q().c("EES error. appId, eventName", zzqVar.q, zzawVar.p);
            }
            v = this.p.i().v();
            str = zzawVar.p;
            str2 = "EES was not applied to event";
        } else {
            v = this.p.i().v();
            str = zzqVar.p;
            str2 = "EES not loaded for";
        }
        v.b(str2, str);
        I(zzawVar, zzqVar);
    }

    @Override // com.daaw.ua5
    public final void i1(zzaw zzawVar, zzq zzqVar) {
        ry0.j(zzawVar);
        k3(zzqVar, false);
        j3(new h37(this, zzawVar, zzqVar));
    }

    public final /* synthetic */ void i3(String str, Bundle bundle) {
        uh2 W = this.p.W();
        W.f();
        W.g();
        byte[] i = W.b.g0().B(new on2(W.a, "", str, "dep", 0L, 0L, bundle)).i();
        W.a.i().v().c("Saving default event parameters, appId, data size", W.a.D().d(str), Integer.valueOf(i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", i);
        try {
            if (W.P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                W.a.i().q().b("Failed to insert default event parameters (got -1). appId", om5.z(str));
            }
        } catch (SQLiteException e) {
            W.a.i().q().c("Error storing default event parameters. appId", om5.z(str), e);
        }
    }

    public final void j3(Runnable runnable) {
        ry0.j(runnable);
        if (this.p.r().C()) {
            runnable.run();
        } else {
            this.p.r().z(runnable);
        }
    }

    @Override // com.daaw.ua5
    public final void k0(zzac zzacVar) {
        ry0.j(zzacVar);
        ry0.j(zzacVar.r);
        ry0.f(zzacVar.p);
        l3(zzacVar.p, true);
        j3(new hu6(this, new zzac(zzacVar)));
    }

    public final void k3(zzq zzqVar, boolean z) {
        ry0.j(zzqVar);
        ry0.f(zzqVar.p);
        l3(zzqVar.p, false);
        this.p.h0().L(zzqVar.q, zzqVar.F);
    }

    @Override // com.daaw.ua5
    public final List l0(zzq zzqVar, boolean z) {
        k3(zzqVar, false);
        String str = zzqVar.p;
        ry0.j(str);
        try {
            List<mc8> list = (List) this.p.r().s(new f87(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (mc8 mc8Var : list) {
                if (z || !dd8.W(mc8Var.c)) {
                    arrayList.add(new zzkw(mc8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.p.i().q().c("Failed to get user properties. appId", om5.z(zzqVar.p), e);
            return null;
        }
    }

    public final void l3(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.p.i().q().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.q == null) {
                    if (!"com.google.android.gms".equals(this.r) && !fp1.a(this.p.d(), Binder.getCallingUid()) && !d80.a(this.p.d()).c(Binder.getCallingUid())) {
                        z2 = false;
                        this.q = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.q = Boolean.valueOf(z2);
                }
                if (this.q.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.p.i().q().b("Measurement Service called with invalid calling package. appId", om5.z(str));
                throw e;
            }
        }
        if (this.r == null && c80.j(this.p.d(), Binder.getCallingUid(), str)) {
            this.r = str;
        }
        if (str.equals(this.r)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    @Override // com.daaw.ua5
    public final byte[] m0(zzaw zzawVar, String str) {
        ry0.f(str);
        ry0.j(zzawVar);
        l3(str, true);
        this.p.i().p().b("Log and bundle. event", this.p.X().d(zzawVar.p));
        long c = this.p.b().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.p.r().t(new z57(this, zzawVar, str)).get();
            if (bArr == null) {
                this.p.i().q().b("Log and bundle returned null. appId", om5.z(str));
                bArr = new byte[0];
            }
            this.p.i().p().d("Log and bundle processed. event, size, time_ms", this.p.X().d(zzawVar.p), Integer.valueOf(bArr.length), Long.valueOf((this.p.b().c() / 1000000) - c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.p.i().q().d("Failed to log and bundle. appId, event, error", om5.z(str), this.p.X().d(zzawVar.p), e);
            return null;
        }
    }

    @Override // com.daaw.ua5
    public final void m1(zzq zzqVar) {
        k3(zzqVar, false);
        j3(new i97(this, zzqVar));
    }

    @Override // com.daaw.ua5
    public final List n1(String str, String str2, zzq zzqVar) {
        k3(zzqVar, false);
        String str3 = zzqVar.p;
        ry0.j(str3);
        try {
            return (List) this.p.r().s(new jx6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.p.i().q().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.daaw.ua5
    public final void s2(zzq zzqVar) {
        ry0.f(zzqVar.p);
        l3(zzqVar.p, false);
        j3(new pz6(this, zzqVar));
    }

    @Override // com.daaw.ua5
    public final void u1(long j, String str, String str2, String str3) {
        j3(new la7(this, str2, str3, str, j));
    }

    @Override // com.daaw.ua5
    public final String w0(zzq zzqVar) {
        k3(zzqVar, false);
        return this.p.j0(zzqVar);
    }

    @Override // com.daaw.ua5
    public final void y1(zzaw zzawVar, String str, String str2) {
        ry0.j(zzawVar);
        ry0.f(str);
        l3(str, true);
        j3(new k47(this, zzawVar, str));
    }
}
