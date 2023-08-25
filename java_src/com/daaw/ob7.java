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

    /* renamed from: p */
    public final yb8 f21251p;

    /* renamed from: q */
    public Boolean f21252q;

    /* renamed from: r */
    public String f21253r;

    public ob7(yb8 yb8Var, String str) {
        ry0.m10830j(yb8Var);
        this.f21251p = yb8Var;
        this.f21253r = null;
    }

    @Override // com.daaw.ua5
    /* renamed from: C1 */
    public final void mo8379C1(zzkw zzkwVar, zzq zzqVar) {
        ry0.m10830j(zzkwVar);
        m14405k3(zzqVar, false);
        m14406j3(new c77(this, zzkwVar, zzqVar));
    }

    @Override // com.daaw.ua5
    /* renamed from: C2 */
    public final void mo8378C2(zzac zzacVar, zzq zzqVar) {
        ry0.m10830j(zzacVar);
        ry0.m10830j(zzacVar.f37058r);
        m14405k3(zzqVar, false);
        zzac zzacVar2 = new zzac(zzacVar);
        zzacVar2.f37056p = zzqVar.f37092p;
        m14406j3(new jt6(this, zzacVar2, zzqVar));
    }

    @Override // com.daaw.ua5
    /* renamed from: G0 */
    public final List mo8377G0(String str, String str2, String str3) {
        m14404l3(str, true);
        try {
            return (List) this.f21251p.mo3882r().m6985s(new my6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f21251p.mo3895i().m14160q().m20652b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: I */
    public final void m14411I(zzaw zzawVar, zzq zzqVar) {
        this.f21251p.m3907c();
        this.f21251p.m3897h(zzawVar, zzqVar);
    }

    /* renamed from: M */
    public final zzaw m14410M(zzaw zzawVar, zzq zzqVar) {
        zzau zzauVar;
        if ("_cmp".equals(zzawVar.f37068p) && (zzauVar = zzawVar.f37069q) != null && zzauVar.zza() != 0) {
            String m1074v = zzawVar.f37069q.m1074v("_cis");
            if ("referrer broadcast".equals(m1074v) || "referrer API".equals(m1074v)) {
                this.f21251p.mo3895i().m14157u().m20652b("Event has been filtered ", zzawVar.toString());
                return new zzaw("_cmpx", zzawVar.f37069q, zzawVar.f37070r, zzawVar.f37071s);
            }
        }
        return zzawVar;
    }

    @Override // com.daaw.ua5
    /* renamed from: T1 */
    public final void mo8376T1(zzq zzqVar) {
        ry0.m10834f(zzqVar.f37092p);
        ry0.m10830j(zzqVar.f37089K);
        f27 f27Var = new f27(this, zzqVar);
        ry0.m10830j(f27Var);
        if (this.f21251p.mo3882r().m6994C()) {
            f27Var.run();
        } else {
            this.f21251p.mo3882r().m6996A(f27Var);
        }
    }

    @Override // com.daaw.ua5
    /* renamed from: X */
    public final void mo8375X(zzq zzqVar) {
        m14405k3(zzqVar, false);
        m14406j3(new c17(this, zzqVar));
    }

    @Override // com.daaw.ua5
    /* renamed from: a2 */
    public final List mo8374a2(String str, String str2, boolean z, zzq zzqVar) {
        m14405k3(zzqVar, false);
        String str3 = zzqVar.f37092p;
        ry0.m10830j(str3);
        try {
            List<mc8> list = (List) this.f21251p.mo3882r().m6985s(new dv6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (mc8 mc8Var : list) {
                if (z || !dd8.m24492W(mc8Var.f18796c)) {
                    arrayList.add(new zzkw(mc8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f21251p.mo3895i().m14160q().m20651c("Failed to query user properties. appId", om5.m14152z(zzqVar.f37092p), e);
            return Collections.emptyList();
        }
    }

    @Override // com.daaw.ua5
    /* renamed from: e0 */
    public final void mo8373e0(final Bundle bundle, zzq zzqVar) {
        m14405k3(zzqVar, false);
        final String str = zzqVar.f37092p;
        ry0.m10830j(str);
        m14406j3(new Runnable() { // from class: com.daaw.gs6
            @Override // java.lang.Runnable
            public final void run() {
                ob7.this.m14407i3(str, bundle);
            }
        });
    }

    @Override // com.daaw.ua5
    /* renamed from: h0 */
    public final List mo8372h0(String str, String str2, String str3, boolean z) {
        m14404l3(str, true);
        try {
            List<mc8> list = (List) this.f21251p.mo3882r().m6985s(new gw6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (mc8 mc8Var : list) {
                if (z || !dd8.m24492W(mc8Var.f18796c)) {
                    arrayList.add(new zzkw(mc8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f21251p.mo3895i().m14160q().m20651c("Failed to get user properties as. appId", om5.m14152z(str), e);
            return Collections.emptyList();
        }
    }

    /* renamed from: h3 */
    public final void m14408h3(zzaw zzawVar, zzq zzqVar) {
        hk5 m14156v;
        String str;
        String str2;
        if (!this.f21251p.m3910a0().m21631C(zzqVar.f37092p)) {
            m14411I(zzawVar, zzqVar);
            return;
        }
        this.f21251p.mo3895i().m14156v().m20652b("EES config found for", zzqVar.f37092p);
        gh6 m3910a0 = this.f21251p.m3910a0();
        String str3 = zzqVar.f37092p;
        tr3 tr3Var = TextUtils.isEmpty(str3) ? null : (tr3) m3910a0.f11280j.m6023c(str3);
        if (tr3Var != null) {
            try {
                Map m23595I = this.f21251p.m3898g0().m23595I(zzawVar.f37069q.m1078q(), true);
                String m24378a = dh7.m24378a(zzawVar.f37068p);
                if (m24378a == null) {
                    m24378a = zzawVar.f37068p;
                }
                if (tr3Var.m8851e(new s32(m24378a, zzawVar.f37071s, m23595I))) {
                    if (tr3Var.m8849g()) {
                        this.f21251p.mo3895i().m14156v().m20652b("EES edited event", zzawVar.f37068p);
                        zzawVar = this.f21251p.m3898g0().m23603A(tr3Var.m8855a().m2825b());
                    }
                    m14411I(zzawVar, zzqVar);
                    if (tr3Var.m8850f()) {
                        for (s32 s32Var : tr3Var.m8855a().m2824c()) {
                            this.f21251p.mo3895i().m14156v().m20652b("EES logging created event", s32Var.m10738d());
                            m14411I(this.f21251p.m3898g0().m23603A(s32Var), zzqVar);
                        }
                        return;
                    }
                    return;
                }
            } catch (sk4 unused) {
                this.f21251p.mo3895i().m14160q().m20651c("EES error. appId, eventName", zzqVar.f37093q, zzawVar.f37068p);
            }
            m14156v = this.f21251p.mo3895i().m14156v();
            str = zzawVar.f37068p;
            str2 = "EES was not applied to event";
        } else {
            m14156v = this.f21251p.mo3895i().m14156v();
            str = zzqVar.f37092p;
            str2 = "EES not loaded for";
        }
        m14156v.m20652b(str2, str);
        m14411I(zzawVar, zzqVar);
    }

    @Override // com.daaw.ua5
    /* renamed from: i1 */
    public final void mo8371i1(zzaw zzawVar, zzq zzqVar) {
        ry0.m10830j(zzawVar);
        m14405k3(zzqVar, false);
        m14406j3(new h37(this, zzawVar, zzqVar));
    }

    /* renamed from: i3 */
    public final /* synthetic */ void m14407i3(String str, Bundle bundle) {
        uh2 m3915W = this.f21251p.m3915W();
        m3915W.mo6991f();
        m3915W.m13533g();
        byte[] m6531i = m3915W.f19771b.m3898g0().m23602B(new on2(m3915W.f25143a, "", str, "dep", 0L, 0L, bundle)).m6531i();
        m3915W.f25143a.mo3895i().m14156v().m20651c("Saving default event parameters, appId, data size", m3915W.f25143a.m24055D().m5133d(str), Integer.valueOf(m6531i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", m6531i);
        try {
            if (m3915W.m8168P().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                m3915W.f25143a.mo3895i().m14160q().m20652b("Failed to insert default event parameters (got -1). appId", om5.m14152z(str));
            }
        } catch (SQLiteException e) {
            m3915W.f25143a.mo3895i().m14160q().m20651c("Error storing default event parameters. appId", om5.m14152z(str), e);
        }
    }

    /* renamed from: j3 */
    public final void m14406j3(Runnable runnable) {
        ry0.m10830j(runnable);
        if (this.f21251p.mo3882r().m6994C()) {
            runnable.run();
        } else {
            this.f21251p.mo3882r().m6978z(runnable);
        }
    }

    @Override // com.daaw.ua5
    /* renamed from: k0 */
    public final void mo8370k0(zzac zzacVar) {
        ry0.m10830j(zzacVar);
        ry0.m10830j(zzacVar.f37058r);
        ry0.m10834f(zzacVar.f37056p);
        m14404l3(zzacVar.f37056p, true);
        m14406j3(new hu6(this, new zzac(zzacVar)));
    }

    /* renamed from: k3 */
    public final void m14405k3(zzq zzqVar, boolean z) {
        ry0.m10830j(zzqVar);
        ry0.m10834f(zzqVar.f37092p);
        m14404l3(zzqVar.f37092p, false);
        this.f21251p.m3896h0().m24503L(zzqVar.f37093q, zzqVar.f37084F);
    }

    @Override // com.daaw.ua5
    /* renamed from: l0 */
    public final List mo8369l0(zzq zzqVar, boolean z) {
        m14405k3(zzqVar, false);
        String str = zzqVar.f37092p;
        ry0.m10830j(str);
        try {
            List<mc8> list = (List) this.f21251p.mo3882r().m6985s(new f87(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (mc8 mc8Var : list) {
                if (z || !dd8.m24492W(mc8Var.f18796c)) {
                    arrayList.add(new zzkw(mc8Var));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.f21251p.mo3895i().m14160q().m20651c("Failed to get user properties. appId", om5.m14152z(zzqVar.f37092p), e);
            return null;
        }
    }

    /* renamed from: l3 */
    public final void m14404l3(String str, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            this.f21251p.mo3895i().m14160q().m20653a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.f21252q == null) {
                    if (!"com.google.android.gms".equals(this.f21253r) && !fp1.m22425a(this.f21251p.mo3905d(), Binder.getCallingUid()) && !d80.m24607a(this.f21251p.mo3905d()).m24605c(Binder.getCallingUid())) {
                        z2 = false;
                        this.f21252q = Boolean.valueOf(z2);
                    }
                    z2 = true;
                    this.f21252q = Boolean.valueOf(z2);
                }
                if (this.f21252q.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                this.f21251p.mo3895i().m14160q().m20652b("Measurement Service called with invalid calling package. appId", om5.m14152z(str));
                throw e;
            }
        }
        if (this.f21253r == null && c80.m25518j(this.f21251p.mo3905d(), Binder.getCallingUid(), str)) {
            this.f21253r = str;
        }
        if (str.equals(this.f21253r)) {
            return;
        }
        throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
    }

    @Override // com.daaw.ua5
    /* renamed from: m0 */
    public final byte[] mo8368m0(zzaw zzawVar, String str) {
        ry0.m10834f(str);
        ry0.m10830j(zzawVar);
        m14404l3(str, true);
        this.f21251p.mo3895i().m14161p().m20652b("Log and bundle. event", this.f21251p.m3914X().m5133d(zzawVar.f37068p));
        long mo15858c = this.f21251p.mo3909b().mo15858c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f21251p.mo3882r().m6984t(new z57(this, zzawVar, str)).get();
            if (bArr == null) {
                this.f21251p.mo3895i().m14160q().m20652b("Log and bundle returned null. appId", om5.m14152z(str));
                bArr = new byte[0];
            }
            this.f21251p.mo3895i().m14161p().m20650d("Log and bundle processed. event, size, time_ms", this.f21251p.m3914X().m5133d(zzawVar.f37068p), Integer.valueOf(bArr.length), Long.valueOf((this.f21251p.mo3909b().mo15858c() / 1000000) - mo15858c));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.f21251p.mo3895i().m14160q().m20650d("Failed to log and bundle. appId, event, error", om5.m14152z(str), this.f21251p.m3914X().m5133d(zzawVar.f37068p), e);
            return null;
        }
    }

    @Override // com.daaw.ua5
    /* renamed from: m1 */
    public final void mo8367m1(zzq zzqVar) {
        m14405k3(zzqVar, false);
        m14406j3(new i97(this, zzqVar));
    }

    @Override // com.daaw.ua5
    /* renamed from: n1 */
    public final List mo8366n1(String str, String str2, zzq zzqVar) {
        m14405k3(zzqVar, false);
        String str3 = zzqVar.f37092p;
        ry0.m10830j(str3);
        try {
            return (List) this.f21251p.mo3882r().m6985s(new jx6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.f21251p.mo3895i().m14160q().m20652b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.daaw.ua5
    /* renamed from: s2 */
    public final void mo8365s2(zzq zzqVar) {
        ry0.m10834f(zzqVar.f37092p);
        m14404l3(zzqVar.f37092p, false);
        m14406j3(new pz6(this, zzqVar));
    }

    @Override // com.daaw.ua5
    /* renamed from: u1 */
    public final void mo8364u1(long j, String str, String str2, String str3) {
        m14406j3(new la7(this, str2, str3, str, j));
    }

    @Override // com.daaw.ua5
    /* renamed from: w0 */
    public final String mo8363w0(zzq zzqVar) {
        m14405k3(zzqVar, false);
        return this.f21251p.m3892j0(zzqVar);
    }

    @Override // com.daaw.ua5
    /* renamed from: y1 */
    public final void mo8362y1(zzaw zzawVar, String str, String str2) {
        ry0.m10830j(zzawVar);
        ry0.m10834f(str);
        m14404l3(str, true);
        m14406j3(new k47(this, zzawVar, str));
    }
}
