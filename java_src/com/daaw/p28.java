package com.daaw;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class p28 extends c86 {
    public m28 c;
    public mk7 d;
    public final Set e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public cd2 i;
    public int j;
    public final AtomicLong k;
    public long l;
    public int m;
    public final gr8 n;
    public boolean o;
    public final ad8 p;

    public p28(dr6 dr6Var) {
        super(dr6Var);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.o = true;
        this.p = new f18(this);
        this.g = new AtomicReference();
        this.i = new cd2(null, null);
        this.j = 100;
        this.l = -1L;
        this.m = 100;
        this.k = new AtomicLong(0L);
        this.n = new gr8(dr6Var);
    }

    public static /* bridge */ /* synthetic */ void b0(p28 p28Var, cd2 cd2Var, cd2 cd2Var2) {
        boolean z;
        vb2[] vb2VarArr = {vb2.ANALYTICS_STORAGE, vb2.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            vb2 vb2Var = vb2VarArr[i];
            if (!cd2Var2.i(vb2Var) && cd2Var.i(vb2Var)) {
                z = true;
                break;
            }
            i++;
        }
        boolean l = cd2Var.l(cd2Var2, vb2.ANALYTICS_STORAGE, vb2.AD_STORAGE);
        if (z || l) {
            p28Var.a.B().v();
        }
    }

    public static /* synthetic */ void c0(p28 p28Var, cd2 cd2Var, int i, long j, boolean z, boolean z2) {
        p28Var.f();
        p28Var.g();
        if (j <= p28Var.l && cd2.j(p28Var.m, i)) {
            p28Var.a.i().u().b("Dropped out-of-date consent setting, proposed settings", cd2Var);
            return;
        }
        l36 F = p28Var.a.F();
        dr6 dr6Var = F.a;
        F.f();
        if (!F.w(i)) {
            p28Var.a.i().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor edit = F.n().edit();
        edit.putString("consent_settings", cd2Var.h());
        edit.putInt("consent_source", i);
        edit.apply();
        p28Var.l = j;
        p28Var.m = i;
        p28Var.a.L().t(z);
        if (z2) {
            p28Var.a.L().S(new AtomicReference());
        }
    }

    public final void A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelable);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.a.r().z(new xv7(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void B(String str, String str2, long j, Object obj) {
        this.a.r().z(new ax7(this, str, str2, obj, j));
    }

    public final void C(String str) {
        this.g.set(str);
    }

    public final void D(Bundle bundle) {
        E(bundle, this.a.b().a());
    }

    public final void E(Bundle bundle, long j) {
        ry0.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.a.i().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        ry0.j(bundle2);
        ag7.a(bundle2, "app_id", String.class, null);
        ag7.a(bundle2, "origin", String.class, null);
        ag7.a(bundle2, "name", String.class, null);
        ag7.a(bundle2, "value", Object.class, null);
        ag7.a(bundle2, "trigger_event_name", String.class, null);
        ag7.a(bundle2, "trigger_timeout", Long.class, 0L);
        ag7.a(bundle2, "timed_out_event_name", String.class, null);
        ag7.a(bundle2, "timed_out_event_params", Bundle.class, null);
        ag7.a(bundle2, "triggered_event_name", String.class, null);
        ag7.a(bundle2, "triggered_event_params", Bundle.class, null);
        ag7.a(bundle2, "time_to_live", Long.class, 0L);
        ag7.a(bundle2, "expired_event_name", String.class, null);
        ag7.a(bundle2, "expired_event_params", Bundle.class, null);
        ry0.f(bundle2.getString("name"));
        ry0.f(bundle2.getString("origin"));
        ry0.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.a.N().n0(string) != 0) {
            this.a.i().q().b("Invalid conditional user property name", this.a.D().f(string));
        } else if (this.a.N().j0(string, obj) != 0) {
            this.a.i().q().c("Invalid conditional user property value", this.a.D().f(string), obj);
        } else {
            Object o = this.a.N().o(string, obj);
            if (o == null) {
                this.a.i().q().c("Unable to normalize conditional user property value", this.a.D().f(string), obj);
                return;
            }
            ag7.b(bundle2, o);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.a.z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.a.i().q().c("Invalid conditional user property timeout", this.a.D().f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.a.z();
            if (j3 > 15552000000L || j3 < 1) {
                this.a.i().q().c("Invalid conditional user property time to live", this.a.D().f(string), Long.valueOf(j3));
            } else {
                this.a.r().z(new i08(this, bundle2));
            }
        }
    }

    public final void F(Bundle bundle, int i, long j) {
        g();
        String g = cd2.g(bundle);
        if (g != null) {
            this.a.i().x().b("Ignoring invalid consent setting", g);
            this.a.i().x().a("Valid consent values are 'granted', 'denied'");
        }
        G(cd2.a(bundle), i, j);
    }

    public final void G(cd2 cd2Var, int i, long j) {
        cd2 cd2Var2;
        boolean z;
        boolean z2;
        boolean z3;
        cd2 cd2Var3 = cd2Var;
        g();
        if (i != -10 && cd2Var.e() == null && cd2Var.f() == null) {
            this.a.i().x().a("Discarding empty consent settings");
            return;
        }
        synchronized (this.h) {
            cd2Var2 = this.i;
            z = true;
            z2 = false;
            if (cd2.j(i, this.j)) {
                boolean k = cd2Var3.k(this.i);
                vb2 vb2Var = vb2.ANALYTICS_STORAGE;
                if (cd2Var3.i(vb2Var) && !this.i.i(vb2Var)) {
                    z2 = true;
                }
                cd2Var3 = cd2Var3.d(this.i);
                this.i = cd2Var3;
                this.j = i;
                z3 = z2;
                z2 = k;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.a.i().u().b("Ignoring lower-priority consent settings, proposed settings", cd2Var3);
            return;
        }
        long andIncrement = this.k.getAndIncrement();
        if (z2) {
            this.g.set(null);
            this.a.r().A(new x18(this, cd2Var3, j, i, andIncrement, z3, cd2Var2));
            return;
        }
        a28 a28Var = new a28(this, cd2Var3, i, andIncrement, z3, cd2Var2);
        if (i == 30 || i == -10) {
            this.a.r().A(a28Var);
        } else {
            this.a.r().z(a28Var);
        }
    }

    public final void H(mk7 mk7Var) {
        mk7 mk7Var2;
        f();
        g();
        if (mk7Var != null && mk7Var != (mk7Var2 = this.d)) {
            ry0.n(mk7Var2 == null, "EventInterceptor already set.");
        }
        this.d = mk7Var;
    }

    public final void I(Boolean bool) {
        g();
        this.a.r().z(new u18(this, bool));
    }

    public final void J(cd2 cd2Var) {
        f();
        boolean z = (cd2Var.i(vb2.ANALYTICS_STORAGE) && cd2Var.i(vb2.AD_STORAGE)) || this.a.L().A();
        if (z != this.a.o()) {
            this.a.k(z);
            l36 F = this.a.F();
            dr6 dr6Var = F.a;
            F.f();
            Boolean valueOf = F.n().contains("measurement_enabled_from_api") ? Boolean.valueOf(F.n().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                O(Boolean.valueOf(z), false);
            }
        }
    }

    public final void K(String str, String str2, Object obj, boolean z) {
        L("auto", "_ldl", obj, true, this.a.b().a());
    }

    public final void L(String str, String str2, Object obj, boolean z, long j) {
        int i;
        String str3 = str == null ? "app" : str;
        if (z) {
            i = this.a.N().n0(str2);
        } else {
            dd8 N = this.a.N();
            if (N.R("user property", str2)) {
                if (N.N("user property", jj7.a, null, str2)) {
                    N.a.z();
                    if (N.M("user property", 24, str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        if (i != 0) {
            dd8 N2 = this.a.N();
            this.a.z();
            this.a.N().B(this.p, null, i, "_ev", N2.q(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj == null) {
            B(str3, str2, j, null);
        } else {
            int j0 = this.a.N().j0(str2, obj);
            if (j0 != 0) {
                dd8 N3 = this.a.N();
                this.a.z();
                this.a.N().B(this.p, null, j0, "_ev", N3.q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object o = this.a.N().o(str2, obj);
            if (o != null) {
                B(str3, str2, j, o);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.daaw.ry0.f(r9)
            com.daaw.ry0.f(r10)
            r8.f()
            r8.g()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L61
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L4f
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L4f
            r10 = 1
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r10 == r11) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = r2
        L38:
            java.lang.Long r11 = java.lang.Long.valueOf(r10)
            com.daaw.dr6 r10 = r8.a
            com.daaw.l36 r10 = r10.F()
            com.daaw.i26 r10 = r10.m
            long r4 = r11.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L5b
            java.lang.String r0 = "true"
            goto L5b
        L4f:
            if (r11 != 0) goto L61
            com.daaw.dr6 r10 = r8.a
            com.daaw.l36 r10 = r10.F()
            com.daaw.i26 r10 = r10.m
            java.lang.String r0 = "unset"
        L5b:
            r10.b(r0)
            r6 = r11
            r3 = r1
            goto L63
        L61:
            r3 = r10
            r6 = r11
        L63:
            com.daaw.dr6 r10 = r8.a
            boolean r10 = r10.n()
            if (r10 != 0) goto L7b
            com.daaw.dr6 r9 = r8.a
            com.daaw.om5 r9 = r9.i()
            com.daaw.hk5 r9 = r9.v()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L7b:
            com.daaw.dr6 r10 = r8.a
            boolean r10 = r10.q()
            if (r10 != 0) goto L84
            return
        L84:
            com.google.android.gms.measurement.internal.zzkw r10 = new com.google.android.gms.measurement.internal.zzkw
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.daaw.dr6 r9 = r8.a
            com.daaw.x78 r9 = r9.L()
            r9.y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.p28.M(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void N(pl7 pl7Var) {
        g();
        ry0.j(pl7Var);
        if (this.e.remove(pl7Var)) {
            return;
        }
        this.a.i().w().a("OnEventListener had not been registered");
    }

    public final void O(Boolean bool, boolean z) {
        f();
        g();
        this.a.i().p().b("Setting app measurement enabled (FE)", bool);
        this.a.F().s(bool);
        if (z) {
            l36 F = this.a.F();
            dr6 dr6Var = F.a;
            F.f();
            SharedPreferences.Editor edit = F.n().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.a.o() || !(bool == null || bool.booleanValue())) {
            P();
        }
    }

    public final void P() {
        Long valueOf;
        f();
        String a = this.a.F().m.a();
        if (a != null) {
            if ("unset".equals(a)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(true != "true".equals(a) ? 0L : 1L);
            }
            M("app", "_npa", valueOf, this.a.b().a());
        }
        if (!this.a.n() || !this.o) {
            this.a.i().p().a("Updating Scion state (FE)");
            this.a.L().w();
            return;
        }
        this.a.i().p().a("Recording app launch after enabling measurement for the first time (FE)");
        f0();
        rk8.b();
        if (this.a.z().B(null, m75.f0)) {
            this.a.M().d.a();
        }
        this.a.r().z(new it7(this));
    }

    public final int Q(String str) {
        ry0.f(str);
        this.a.z();
        return 25;
    }

    public final Boolean R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.a.r().q(atomicReference, 15000L, "boolean test flag value", new w08(this, atomicReference));
    }

    public final Double S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.a.r().q(atomicReference, 15000L, "double test flag value", new r18(this, atomicReference));
    }

    public final Integer T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.a.r().q(atomicReference, 15000L, "int test flag value", new o18(this, atomicReference));
    }

    public final Long U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.a.r().q(atomicReference, 15000L, "long test flag value", new l18(this, atomicReference));
    }

    public final String V() {
        return (String) this.g.get();
    }

    public final String W() {
        t38 q = this.a.K().q();
        if (q != null) {
            return q.b;
        }
        return null;
    }

    public final String X() {
        t38 q = this.a.K().q();
        if (q != null) {
            return q.a;
        }
        return null;
    }

    public final String Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.a.r().q(atomicReference, 15000L, "String test flag value", new i18(this, atomicReference));
    }

    public final ArrayList Z(String str, String str2) {
        if (this.a.r().C()) {
            this.a.i().q().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.a.a();
        if (b52.a()) {
            this.a.i().q().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.r().q(atomicReference, 5000L, "get conditional user properties", new t08(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.a.i().q().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return dd8.v(list);
    }

    public final Map a0(String str, String str2, boolean z) {
        hk5 q;
        String str3;
        if (this.a.r().C()) {
            q = this.a.i().q();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.a.a();
            if (!b52.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.a.r().q(atomicReference, 5000L, "get user properties", new z08(this, atomicReference, null, str, str2, z));
                List<zzkw> list = (List) atomicReference.get();
                if (list == null) {
                    this.a.i().q().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                g6 g6Var = new g6(list.size());
                for (zzkw zzkwVar : list) {
                    Object h = zzkwVar.h();
                    if (h != null) {
                        g6Var.put(zzkwVar.q, h);
                    }
                }
                return g6Var;
            }
            q = this.a.i().q();
            str3 = "Cannot get user properties from main thread";
        }
        q.a(str3);
        return Collections.emptyMap();
    }

    public final void f0() {
        f();
        g();
        if (this.a.q()) {
            if (this.a.z().B(null, m75.Z)) {
                qa2 z = this.a.z();
                z.a.a();
                Boolean t = z.t("google_analytics_deferred_deep_link_enabled");
                if (t != null && t.booleanValue()) {
                    this.a.i().p().a("Deferred Deep Link feature enabled.");
                    this.a.r().z(new Runnable() { // from class: com.daaw.hs7
                        @Override // java.lang.Runnable
                        public final void run() {
                            p28 p28Var = p28.this;
                            p28Var.f();
                            if (p28Var.a.F().s.b()) {
                                p28Var.a.i().p().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long a = p28Var.a.F().t.a();
                            p28Var.a.F().t.b(1 + a);
                            p28Var.a.z();
                            if (a < 5) {
                                p28Var.a.h();
                                return;
                            }
                            p28Var.a.i().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            p28Var.a.F().s.a(true);
                        }
                    });
                }
            }
            this.a.L().O();
            this.o = false;
            l36 F = this.a.F();
            F.f();
            String string = F.n().getString("previous_os_version", null);
            F.a.A().j();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = F.n().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.a.A().j();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            u("auto", "_ou", bundle);
        }
    }

    @Override // com.daaw.c86
    public final boolean m() {
        return false;
    }

    public final void n(String str, String str2, Bundle bundle) {
        long a = this.a.b().a();
        ry0.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.a.r().z(new q08(this, bundle2));
    }

    public final void o() {
        if (!(this.a.d().getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) this.a.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    public final /* synthetic */ void p(Bundle bundle) {
        if (bundle == null) {
            this.a.F().x.b(new Bundle());
            return;
        }
        Bundle a = this.a.F().x.a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.a.N().U(obj)) {
                    this.a.N().B(this.p, null, 27, null, null, 0);
                }
                this.a.i().x().c("Invalid default event parameter type. Name, value", str, obj);
            } else if (dd8.W(str)) {
                this.a.i().x().b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                a.remove(str);
            } else {
                dd8 N = this.a.N();
                this.a.z();
                if (N.P("param", str, 100, obj)) {
                    this.a.N().C(a, str, obj);
                }
            }
        }
        this.a.N();
        int l = this.a.z().l();
        if (a.size() > l) {
            int i = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i++;
                if (i > l) {
                    a.remove(str2);
                }
            }
            this.a.N().B(this.p, null, 26, null, null, 0);
            this.a.i().x().a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.a.F().x.b(a);
        this.a.L().v(a);
    }

    public final void q(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, this.a.b().a());
    }

    public final void s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.a.K().E(bundle2, j);
        } else {
            A(str3, str2, j, bundle2, z2, !z2 || this.d == null || dd8.W(str2), z, null);
        }
    }

    public final void t(String str, String str2, Bundle bundle, String str3) {
        dr6.t();
        A("auto", str2, this.a.b().a(), bundle, false, true, true, str3);
    }

    public final void u(String str, String str2, Bundle bundle) {
        f();
        v(str, str2, this.a.b().a(), bundle);
    }

    public final void v(String str, String str2, long j, Bundle bundle) {
        f();
        w(str, str2, j, bundle, true, this.d == null || dd8.W(str2), true, null);
    }

    public final void w(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        String str4;
        ArrayList arrayList;
        long j2;
        Bundle[] bundleArr;
        Object[] objArr;
        ry0.f(str);
        ry0.j(bundle);
        f();
        g();
        if (!this.a.n()) {
            this.a.i().p().a("Event not sent since app measurement is disabled");
            return;
        }
        List u = this.a.B().u();
        if (u != null && !u.contains(str2)) {
            this.a.i().p().c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                try {
                    (!this.a.s() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.a.d());
                } catch (Exception e) {
                    this.a.i().w().b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.a.i().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.a.a();
            M("auto", "_lgclid", bundle.getString("gclid"), this.a.b().a());
        }
        this.a.a();
        if (z && dd8.a0(str2)) {
            this.a.N().z(bundle, this.a.F().x.a());
        }
        if (!z3) {
            this.a.a();
            if (!"_iap".equals(str2)) {
                dd8 N = this.a.N();
                int i = 2;
                if (N.R("event", str2)) {
                    if (N.N("event", dh7.a, dh7.b, str2)) {
                        N.a.z();
                        if (N.M("event", 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    this.a.i().s().b("Invalid public event name. Event will not be logged (FE)", this.a.D().d(str2));
                    dd8 N2 = this.a.N();
                    this.a.z();
                    this.a.N().B(this.p, null, i, "_ev", N2.q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.a.a();
        t38 s = this.a.K().s(false);
        if (s != null && !bundle.containsKey("_sc")) {
            s.d = true;
        }
        dd8.y(s, bundle, z && !z3);
        boolean equals = "am".equals(str);
        boolean W = dd8.W(str2);
        if (!z || this.d == null || W) {
            z4 = equals;
        } else if (!equals) {
            this.a.i().p().c("Passing event to registered event handler (FE)", this.a.D().d(str2), this.a.D().b(bundle));
            ry0.j(this.d);
            this.d.a(str, str2, bundle, j);
            return;
        } else {
            z4 = true;
        }
        if (this.a.q()) {
            int k0 = this.a.N().k0(str2);
            if (k0 != 0) {
                this.a.i().s().b("Invalid event name. Event will not be logged (FE)", this.a.D().d(str2));
                dd8 N3 = this.a.N();
                this.a.z();
                this.a.N().B(this.p, str3, k0, "_ev", N3.q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            String str5 = "_o";
            Bundle v0 = this.a.N().v0(str3, str2, bundle, ig.c("_o", "_sn", "_sc", "_si"), z3);
            ry0.j(v0);
            this.a.a();
            if (this.a.K().s(false) != null && "_ae".equals(str2)) {
                w98 w98Var = this.a.M().e;
                long b = w98Var.d.a.b().b();
                long j3 = b - w98Var.b;
                w98Var.b = b;
                if (j3 > 0) {
                    this.a.N().w(v0, j3);
                }
            }
            qj8.b();
            if (this.a.z().B(null, m75.e0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    dd8 N4 = this.a.N();
                    String string = v0.getString("_ffr");
                    if (eh1.a(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (pc8.a(string, N4.a.F().u.a())) {
                        N4.a.i().p().a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    N4.a.F().u.b(string);
                } else if ("_ae".equals(str2)) {
                    String a = this.a.N().a.F().u.a();
                    if (!TextUtils.isEmpty(a)) {
                        v0.putString("_ffr", a);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(v0);
            if (this.a.F().o.a() > 0 && this.a.F().v(j) && this.a.F().r.b()) {
                this.a.i().v().a("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j2 = 0;
                str4 = "_ae";
                M("auto", "_sid", null, this.a.b().a());
                M("auto", "_sno", null, this.a.b().a());
                M("auto", "_se", null, this.a.b().a());
                this.a.F().p.b(0L);
            } else {
                str4 = "_ae";
                arrayList = arrayList2;
                j2 = 0;
            }
            if (v0.getLong("extend_session", j2) == 1) {
                this.a.i().v().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.a.M().d.b(j, true);
            }
            ArrayList arrayList3 = new ArrayList(v0.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str6 = (String) arrayList3.get(i2);
                if (str6 != null) {
                    this.a.N();
                    Object obj = v0.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else {
                        if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            objArr = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj;
                            objArr = arrayList4.toArray(new Bundle[arrayList4.size()]);
                        } else {
                            bundleArr = null;
                        }
                        bundleArr = (Bundle[]) objArr;
                    }
                    if (bundleArr != null) {
                        v0.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                ArrayList arrayList5 = arrayList;
                Bundle bundle2 = (Bundle) arrayList5.get(i3);
                String str7 = i3 != 0 ? "_ep" : str2;
                bundle2.putString(str5, str);
                if (z2) {
                    bundle2 = this.a.N().u0(bundle2);
                }
                Bundle bundle3 = bundle2;
                String str8 = str5;
                this.a.L().n(new zzaw(str7, new zzau(bundle3), str, j), str3);
                if (!z4) {
                    for (pl7 pl7Var : this.e) {
                        pl7Var.a(str, str2, new Bundle(bundle3), j);
                    }
                }
                i3++;
                str5 = str8;
                arrayList = arrayList5;
            }
            this.a.a();
            if (this.a.K().s(false) == null || !str4.equals(str2)) {
                return;
            }
            this.a.M().e.d(true, true, this.a.b().b());
        }
    }

    public final void x(pl7 pl7Var) {
        g();
        ry0.j(pl7Var);
        if (this.e.add(pl7Var)) {
            return;
        }
        this.a.i().w().a("OnEventListener already registered");
    }

    public final void y(long j) {
        this.g.set(null);
        this.a.r().z(new fz7(this, j));
    }

    public final void z(long j, boolean z) {
        f();
        g();
        this.a.i().p().a("Resetting analytics data (FE)");
        ca8 M = this.a.M();
        M.f();
        M.e.a();
        zm8.b();
        if (this.a.z().B(null, m75.o0)) {
            this.a.B().v();
        }
        boolean n = this.a.n();
        l36 F = this.a.F();
        F.e.b(j);
        if (!TextUtils.isEmpty(F.a.F().u.a())) {
            F.u.b(null);
        }
        rk8.b();
        qa2 z2 = F.a.z();
        j65 j65Var = m75.f0;
        if (z2.B(null, j65Var)) {
            F.o.b(0L);
        }
        F.p.b(0L);
        if (!F.a.z().E()) {
            F.t(!n);
        }
        F.v.b(null);
        F.w.b(0L);
        F.x.b(null);
        if (z) {
            this.a.L().p();
        }
        rk8.b();
        if (this.a.z().B(null, j65Var)) {
            this.a.M().d.a();
        }
        this.o = !n;
    }
}
