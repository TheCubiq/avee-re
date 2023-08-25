package com.daaw;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzcl;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class dr6 implements xe7 {
    public static volatile dr6 H;
    public volatile Boolean A;
    public Boolean B;
    public Boolean C;
    public volatile boolean D;
    public int E;
    public final long G;
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final b52 f;
    public final qa2 g;
    public final l36 h;
    public final om5 i;
    public final vn6 j;
    public final ca8 k;
    public final dd8 l;
    public final xg5 m;
    public final ag n;
    public final r48 o;
    public final p28 p;
    public final vk4 q;
    public final k38 r;
    public final String s;
    public re5 t;
    public x78 u;
    public lm2 v;
    public xb5 w;
    public Boolean y;
    public long z;
    public boolean x = false;
    public final AtomicInteger F = new AtomicInteger(0);

    public dr6(vn7 vn7Var) {
        hk5 w;
        String str;
        Bundle bundle;
        boolean z = false;
        ry0.j(vn7Var);
        Context context = vn7Var.a;
        b52 b52Var = new b52(context);
        this.f = b52Var;
        d45.a = b52Var;
        this.a = context;
        this.b = vn7Var.b;
        this.c = vn7Var.c;
        this.d = vn7Var.d;
        this.e = vn7Var.h;
        this.A = vn7Var.e;
        this.s = vn7Var.j;
        this.D = true;
        zzcl zzclVar = vn7Var.g;
        if (zzclVar != null && (bundle = zzclVar.v) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = zzclVar.v.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        j38.e(context);
        ag d = mq.d();
        this.n = d;
        Long l = vn7Var.i;
        this.G = l != null ? l.longValue() : d.a();
        this.g = new qa2(this);
        l36 l36Var = new l36(this);
        l36Var.k();
        this.h = l36Var;
        om5 om5Var = new om5(this);
        om5Var.k();
        this.i = om5Var;
        dd8 dd8Var = new dd8(this);
        dd8Var.k();
        this.l = dd8Var;
        this.m = new xg5(new sm7(vn7Var, this));
        this.q = new vk4(this);
        r48 r48Var = new r48(this);
        r48Var.h();
        this.o = r48Var;
        p28 p28Var = new p28(this);
        p28Var.h();
        this.p = p28Var;
        ca8 ca8Var = new ca8(this);
        ca8Var.h();
        this.k = ca8Var;
        k38 k38Var = new k38(this);
        k38Var.k();
        this.r = k38Var;
        vn6 vn6Var = new vn6(this);
        vn6Var.k();
        this.j = vn6Var;
        zzcl zzclVar2 = vn7Var.g;
        z = (zzclVar2 == null || zzclVar2.q == 0) ? true : true;
        if (context.getApplicationContext() instanceof Application) {
            p28 I = I();
            if (I.a.a.getApplicationContext() instanceof Application) {
                Application application = (Application) I.a.a.getApplicationContext();
                if (I.c == null) {
                    I.c = new m28(I, null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(I.c);
                    application.registerActivityLifecycleCallbacks(I.c);
                    w = I.a.i().v();
                    str = "Registered activity lifecycle callback";
                }
            }
            vn6Var.z(new bq6(this, vn7Var));
        }
        w = i().w();
        str = "Application context is not an Application";
        w.a(str);
        vn6Var.z(new bq6(this, vn7Var));
    }

    public static dr6 H(Context context, zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.t == null || zzclVar.u == null)) {
            zzclVar = new zzcl(zzclVar.p, zzclVar.q, zzclVar.r, zzclVar.s, null, null, zzclVar.v, null);
        }
        ry0.j(context);
        ry0.j(context.getApplicationContext());
        if (H == null) {
            synchronized (dr6.class) {
                if (H == null) {
                    H = new dr6(new vn7(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.v) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            ry0.j(H);
            H.A = Boolean.valueOf(zzclVar.v.getBoolean("dataCollectionDefaultEnabled"));
        }
        ry0.j(H);
        return H;
    }

    public static /* bridge */ /* synthetic */ void c(dr6 dr6Var, vn7 vn7Var) {
        dr6Var.r().f();
        dr6Var.g.w();
        lm2 lm2Var = new lm2(dr6Var);
        lm2Var.k();
        dr6Var.v = lm2Var;
        xb5 xb5Var = new xb5(dr6Var, vn7Var.f);
        xb5Var.h();
        dr6Var.w = xb5Var;
        re5 re5Var = new re5(dr6Var);
        re5Var.h();
        dr6Var.t = re5Var;
        x78 x78Var = new x78(dr6Var);
        x78Var.h();
        dr6Var.u = x78Var;
        dr6Var.l.l();
        dr6Var.h.l();
        dr6Var.w.j();
        hk5 u = dr6Var.i().u();
        dr6Var.g.p();
        u.b("App measurement initialized, version", 74029L);
        dr6Var.i().u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String s = xb5Var.s();
        if (TextUtils.isEmpty(dr6Var.b)) {
            if (dr6Var.N().T(s)) {
                dr6Var.i().u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                dr6Var.i().u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(s)));
            }
        }
        dr6Var.i().p().a("Debug-level message logging enabled");
        if (dr6Var.E != dr6Var.F.get()) {
            dr6Var.i().q().c("Not all components initialized", Integer.valueOf(dr6Var.E), Integer.valueOf(dr6Var.F.get()));
        }
        dr6Var.x = true;
    }

    public static final void t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void u(rc7 rc7Var) {
        if (rc7Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void v(c86 c86Var) {
        if (c86Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!c86Var.l()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(c86Var.getClass())));
        }
    }

    public static final void w(ud7 ud7Var) {
        if (ud7Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!ud7Var.m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(ud7Var.getClass())));
        }
    }

    @Pure
    public final lm2 A() {
        w(this.v);
        return this.v;
    }

    @Pure
    public final xb5 B() {
        v(this.w);
        return this.w;
    }

    @Pure
    public final re5 C() {
        v(this.t);
        return this.t;
    }

    @Pure
    public final xg5 D() {
        return this.m;
    }

    public final om5 E() {
        om5 om5Var = this.i;
        if (om5Var == null || !om5Var.m()) {
            return null;
        }
        return om5Var;
    }

    @Pure
    public final l36 F() {
        u(this.h);
        return this.h;
    }

    @SideEffectFree
    public final vn6 G() {
        return this.j;
    }

    @Pure
    public final p28 I() {
        v(this.p);
        return this.p;
    }

    @Pure
    public final k38 J() {
        w(this.r);
        return this.r;
    }

    @Pure
    public final r48 K() {
        v(this.o);
        return this.o;
    }

    @Pure
    public final x78 L() {
        v(this.u);
        return this.u;
    }

    @Pure
    public final ca8 M() {
        v(this.k);
        return this.k;
    }

    @Pure
    public final dd8 N() {
        u(this.l);
        return this.l;
    }

    @Pure
    public final String O() {
        return this.b;
    }

    @Pure
    public final String P() {
        return this.c;
    }

    @Pure
    public final String Q() {
        return this.d;
    }

    @Pure
    public final String R() {
        return this.s;
    }

    @Override // com.daaw.xe7
    @Pure
    public final b52 a() {
        return this.f;
    }

    @Override // com.daaw.xe7
    @Pure
    public final ag b() {
        return this.n;
    }

    @Override // com.daaw.xe7
    @Pure
    public final Context d() {
        return this.a;
    }

    public final void e() {
        this.F.incrementAndGet();
    }

    public final /* synthetic */ void f(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            i().w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            F().s.a(true);
            if (bArr == null || bArr.length == 0) {
                i().p().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    i().p().a("Deferred Deep Link is empty.");
                    return;
                }
                dd8 N = N();
                dr6 dr6Var = N.a;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = N.a.a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.p.u("auto", "_cmp", bundle);
                    dd8 N2 = N();
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = N2.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            N2.a.a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            return;
                        }
                        return;
                    } catch (RuntimeException e) {
                        N2.a.i().q().b("Failed to persist Deferred Deep Link. exception", e);
                        return;
                    }
                }
                i().w().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                i().q().b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        i().w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    public final void g() {
        this.E++;
    }

    public final void h() {
        r().f();
        w(J());
        String s = B().s();
        Pair o = F().o(s);
        if (!this.g.A() || ((Boolean) o.second).booleanValue() || TextUtils.isEmpty((CharSequence) o.first)) {
            i().p().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        k38 J = J();
        J.j();
        ConnectivityManager connectivityManager = (ConnectivityManager) J.a.a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            i().w().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        dd8 N = N();
        B().a.g.p();
        URL s2 = N.s(74029L, s, (String) o.first, F().t.a() - 1);
        if (s2 != null) {
            k38 J2 = J();
            yo6 yo6Var = new yo6(this);
            J2.f();
            J2.j();
            ry0.j(s2);
            ry0.j(yo6Var);
            J2.a.r().y(new h38(J2, s, s2, null, null, yo6Var, null));
        }
    }

    @Override // com.daaw.xe7
    @Pure
    public final om5 i() {
        w(this.i);
        return this.i;
    }

    public final void j(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    public final void k(boolean z) {
        r().f();
        this.D = z;
    }

    public final void l(zzcl zzclVar) {
        cd2 cd2Var;
        r().f();
        cd2 p = F().p();
        l36 F = F();
        dr6 dr6Var = F.a;
        F.f();
        int i = 100;
        int i2 = F.n().getInt("consent_source", 100);
        qa2 qa2Var = this.g;
        dr6 dr6Var2 = qa2Var.a;
        Boolean t = qa2Var.t("google_analytics_default_allow_ad_storage");
        qa2 qa2Var2 = this.g;
        dr6 dr6Var3 = qa2Var2.a;
        Boolean t2 = qa2Var2.t("google_analytics_default_allow_analytics_storage");
        if (!(t == null && t2 == null) && F().w(-10)) {
            cd2Var = new cd2(t, t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(B().t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                I().G(cd2.b, -10, this.G);
            } else if (TextUtils.isEmpty(B().t()) && zzclVar != null && zzclVar.v != null && F().w(30)) {
                cd2Var = cd2.a(zzclVar.v);
                if (!cd2Var.equals(cd2.b)) {
                    i = 30;
                }
            }
            cd2Var = null;
        }
        if (cd2Var != null) {
            I().G(cd2Var, i, this.G);
            p = cd2Var;
        }
        I().J(p);
        if (F().e.a() == 0) {
            i().v().b("Persisting first open", Long.valueOf(this.G));
            F().e.b(this.G);
        }
        I().n.c();
        if (q()) {
            if (!TextUtils.isEmpty(B().t()) || !TextUtils.isEmpty(B().q())) {
                dd8 N = N();
                String t3 = B().t();
                l36 F2 = F();
                F2.f();
                String string = F2.n().getString("gmp_app_id", null);
                String q = B().q();
                l36 F3 = F();
                F3.f();
                if (N.b0(t3, string, q, F3.n().getString("admob_app_id", null))) {
                    i().u().a("Rechecking which service to use due to a GMP App Id change");
                    l36 F4 = F();
                    F4.f();
                    Boolean q2 = F4.q();
                    SharedPreferences.Editor edit = F4.n().edit();
                    edit.clear();
                    edit.apply();
                    if (q2 != null) {
                        F4.s(q2);
                    }
                    C().p();
                    this.u.Q();
                    this.u.P();
                    F().e.b(this.G);
                    F().g.b(null);
                }
                l36 F5 = F();
                String t4 = B().t();
                F5.f();
                SharedPreferences.Editor edit2 = F5.n().edit();
                edit2.putString("gmp_app_id", t4);
                edit2.apply();
                l36 F6 = F();
                String q3 = B().q();
                F6.f();
                SharedPreferences.Editor edit3 = F6.n().edit();
                edit3.putString("admob_app_id", q3);
                edit3.apply();
            }
            if (!F().p().i(vb2.ANALYTICS_STORAGE)) {
                F().g.b(null);
            }
            I().C(F().g.a());
            qj8.b();
            if (this.g.B(null, m75.e0)) {
                try {
                    N().a.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(F().u.a())) {
                        i().w().a("Remote config removed with active feature rollouts");
                        F().u.b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(B().t()) || !TextUtils.isEmpty(B().q())) {
                boolean n = n();
                if (!F().u() && !this.g.E()) {
                    F().t(!n);
                }
                if (n) {
                    I().f0();
                }
                M().d.a();
                L().S(new AtomicReference());
                L().v(F().x.a());
            }
        } else if (n()) {
            if (!N().S("android.permission.INTERNET")) {
                i().q().a("App is missing INTERNET permission");
            }
            if (!N().S("android.permission.ACCESS_NETWORK_STATE")) {
                i().q().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!ez1.a(this.a).g() && !this.g.G()) {
                if (!dd8.Y(this.a)) {
                    i().q().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!dd8.Z(this.a, false)) {
                    i().q().a("AppMeasurementService not registered/enabled");
                }
            }
            i().q().a("Uploading is not possible. App measurement disabled");
        }
        F().n.a(true);
    }

    public final boolean m() {
        return this.A != null && this.A.booleanValue();
    }

    public final boolean n() {
        return x() == 0;
    }

    public final boolean o() {
        r().f();
        return this.D;
    }

    @Pure
    public final boolean p() {
        return TextUtils.isEmpty(this.b);
    }

    public final boolean q() {
        if (this.x) {
            r().f();
            Boolean bool = this.y;
            if (bool == null || this.z == 0 || (!bool.booleanValue() && Math.abs(this.n.b() - this.z) > 1000)) {
                this.z = this.n.b();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(N().S("android.permission.INTERNET") && N().S("android.permission.ACCESS_NETWORK_STATE") && (ez1.a(this.a).g() || this.g.G() || (dd8.Y(this.a) && dd8.Z(this.a, false))));
                this.y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!N().L(B().t(), B().q()) && TextUtils.isEmpty(B().q())) {
                        z = false;
                    }
                    this.y = Boolean.valueOf(z);
                }
            }
            return this.y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Override // com.daaw.xe7
    @Pure
    public final vn6 r() {
        w(this.j);
        return this.j;
    }

    @Pure
    public final boolean s() {
        return this.e;
    }

    public final int x() {
        r().f();
        if (this.g.E()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool == null || !bool.booleanValue()) {
            r().f();
            if (this.D) {
                Boolean q = F().q();
                if (q != null) {
                    return q.booleanValue() ? 0 : 3;
                }
                qa2 qa2Var = this.g;
                b52 b52Var = qa2Var.a.f;
                Boolean t = qa2Var.t("firebase_analytics_collection_enabled");
                if (t != null) {
                    return t.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.B;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.A == null || this.A.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Pure
    public final vk4 y() {
        vk4 vk4Var = this.q;
        if (vk4Var != null) {
            return vk4Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    public final qa2 z() {
        return this.g;
    }
}
