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

    /* renamed from: H */
    public static volatile dr6 f7658H;

    /* renamed from: A */
    public volatile Boolean f7659A;

    /* renamed from: B */
    public Boolean f7660B;

    /* renamed from: C */
    public Boolean f7661C;

    /* renamed from: D */
    public volatile boolean f7662D;

    /* renamed from: E */
    public int f7663E;

    /* renamed from: G */
    public final long f7665G;

    /* renamed from: a */
    public final Context f7666a;

    /* renamed from: b */
    public final String f7667b;

    /* renamed from: c */
    public final String f7668c;

    /* renamed from: d */
    public final String f7669d;

    /* renamed from: e */
    public final boolean f7670e;

    /* renamed from: f */
    public final b52 f7671f;

    /* renamed from: g */
    public final qa2 f7672g;

    /* renamed from: h */
    public final l36 f7673h;

    /* renamed from: i */
    public final om5 f7674i;

    /* renamed from: j */
    public final vn6 f7675j;

    /* renamed from: k */
    public final ca8 f7676k;

    /* renamed from: l */
    public final dd8 f7677l;

    /* renamed from: m */
    public final xg5 f7678m;

    /* renamed from: n */
    public final InterfaceC0623ag f7679n;

    /* renamed from: o */
    public final r48 f7680o;

    /* renamed from: p */
    public final p28 f7681p;

    /* renamed from: q */
    public final vk4 f7682q;

    /* renamed from: r */
    public final k38 f7683r;

    /* renamed from: s */
    public final String f7684s;

    /* renamed from: t */
    public re5 f7685t;

    /* renamed from: u */
    public x78 f7686u;

    /* renamed from: v */
    public lm2 f7687v;

    /* renamed from: w */
    public xb5 f7688w;

    /* renamed from: y */
    public Boolean f7690y;

    /* renamed from: z */
    public long f7691z;

    /* renamed from: x */
    public boolean f7689x = false;

    /* renamed from: F */
    public final AtomicInteger f7664F = new AtomicInteger(0);

    public dr6(vn7 vn7Var) {
        hk5 m14155w;
        String str;
        Bundle bundle;
        boolean z = false;
        ry0.m10830j(vn7Var);
        Context context = vn7Var.f30370a;
        b52 b52Var = new b52(context);
        this.f7671f = b52Var;
        d45.f6527a = b52Var;
        this.f7666a = context;
        this.f7667b = vn7Var.f30371b;
        this.f7668c = vn7Var.f30372c;
        this.f7669d = vn7Var.f30373d;
        this.f7670e = vn7Var.f30377h;
        this.f7659A = vn7Var.f30374e;
        this.f7684s = vn7Var.f30379j;
        this.f7662D = true;
        zzcl zzclVar = vn7Var.f30376g;
        if (zzclVar != null && (bundle = zzclVar.f37047v) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f7660B = (Boolean) obj;
            }
            Object obj2 = zzclVar.f37047v.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f7661C = (Boolean) obj2;
            }
        }
        j38.m19092e(context);
        InterfaceC0623ag m15857d = C2202mq.m15857d();
        this.f7679n = m15857d;
        Long l = vn7Var.f30378i;
        this.f7665G = l != null ? l.longValue() : m15857d.mo15860a();
        this.f7672g = new qa2(this);
        l36 l36Var = new l36(this);
        l36Var.m8309k();
        this.f7673h = l36Var;
        om5 om5Var = new om5(this);
        om5Var.m8309k();
        this.f7674i = om5Var;
        dd8 dd8Var = new dd8(this);
        dd8Var.m8309k();
        this.f7677l = dd8Var;
        this.f7678m = new xg5(new sm7(vn7Var, this));
        this.f7682q = new vk4(this);
        r48 r48Var = new r48(this);
        r48Var.m25514h();
        this.f7680o = r48Var;
        p28 p28Var = new p28(this);
        p28Var.m25514h();
        this.f7681p = p28Var;
        ca8 ca8Var = new ca8(this);
        ca8Var.m25514h();
        this.f7676k = ca8Var;
        k38 k38Var = new k38(this);
        k38Var.m8309k();
        this.f7683r = k38Var;
        vn6 vn6Var = new vn6(this);
        vn6Var.m8309k();
        this.f7675j = vn6Var;
        zzcl zzclVar2 = vn7Var.f30376g;
        z = (zzclVar2 == null || zzclVar2.f37042q == 0) ? true : true;
        if (context.getApplicationContext() instanceof Application) {
            p28 m24050I = m24050I();
            if (m24050I.f25143a.f7666a.getApplicationContext() instanceof Application) {
                Application application = (Application) m24050I.f25143a.f7666a.getApplicationContext();
                if (m24050I.f22544c == null) {
                    m24050I.f22544c = new m28(m24050I, null);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(m24050I.f22544c);
                    application.registerActivityLifecycleCallbacks(m24050I.f22544c);
                    m14155w = m24050I.f25143a.mo3895i().m14156v();
                    str = "Registered activity lifecycle callback";
                }
            }
            vn6Var.m6978z(new bq6(this, vn7Var));
        }
        m14155w = mo3895i().m14155w();
        str = "Application context is not an Application";
        m14155w.m20653a(str);
        vn6Var.m6978z(new bq6(this, vn7Var));
    }

    /* renamed from: H */
    public static dr6 m24051H(Context context, zzcl zzclVar, Long l) {
        Bundle bundle;
        if (zzclVar != null && (zzclVar.f37045t == null || zzclVar.f37046u == null)) {
            zzclVar = new zzcl(zzclVar.f37041p, zzclVar.f37042q, zzclVar.f37043r, zzclVar.f37044s, null, null, zzclVar.f37047v, null);
        }
        ry0.m10830j(context);
        ry0.m10830j(context.getApplicationContext());
        if (f7658H == null) {
            synchronized (dr6.class) {
                if (f7658H == null) {
                    f7658H = new dr6(new vn7(context, zzclVar, l));
                }
            }
        } else if (zzclVar != null && (bundle = zzclVar.f37047v) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            ry0.m10830j(f7658H);
            f7658H.f7659A = Boolean.valueOf(zzclVar.f37047v.getBoolean("dataCollectionDefaultEnabled"));
        }
        ry0.m10830j(f7658H);
        return f7658H;
    }

    /* renamed from: c */
    public static /* bridge */ /* synthetic */ void m24040c(dr6 dr6Var, vn7 vn7Var) {
        dr6Var.mo3882r().mo6991f();
        dr6Var.f7672g.m12655w();
        lm2 lm2Var = new lm2(dr6Var);
        lm2Var.m8309k();
        dr6Var.f7687v = lm2Var;
        xb5 xb5Var = new xb5(dr6Var, vn7Var.f30375f);
        xb5Var.m25514h();
        dr6Var.f7688w = xb5Var;
        re5 re5Var = new re5(dr6Var);
        re5Var.m25514h();
        dr6Var.f7685t = re5Var;
        x78 x78Var = new x78(dr6Var);
        x78Var.m25514h();
        dr6Var.f7686u = x78Var;
        dr6Var.f7677l.m8308l();
        dr6Var.f7673h.m8308l();
        dr6Var.f7688w.m25513j();
        hk5 m14157u = dr6Var.mo3895i().m14157u();
        dr6Var.f7672g.m12661p();
        m14157u.m20652b("App measurement initialized, version", 74029L);
        dr6Var.mo3895i().m14157u().m20653a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m5301s = xb5Var.m5301s();
        if (TextUtils.isEmpty(dr6Var.f7667b)) {
            if (dr6Var.m24045N().m24495T(m5301s)) {
                dr6Var.mo3895i().m14157u().m20653a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                dr6Var.mo3895i().m14157u().m20653a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(m5301s)));
            }
        }
        dr6Var.mo3895i().m14161p().m20653a("Debug-level message logging enabled");
        if (dr6Var.f7663E != dr6Var.f7664F.get()) {
            dr6Var.mo3895i().m14160q().m20651c("Not all components initialized", Integer.valueOf(dr6Var.f7663E), Integer.valueOf(dr6Var.f7664F.get()));
        }
        dr6Var.f7689x = true;
    }

    /* renamed from: t */
    public static final void m24026t() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: u */
    public static final void m24025u(rc7 rc7Var) {
        if (rc7Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: v */
    public static final void m24024v(c86 c86Var) {
        if (c86Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!c86Var.m25512l()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(c86Var.getClass())));
        }
    }

    /* renamed from: w */
    public static final void m24023w(ud7 ud7Var) {
        if (ud7Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!ud7Var.m8307m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(ud7Var.getClass())));
        }
    }

    @Pure
    /* renamed from: A */
    public final lm2 m24058A() {
        m24023w(this.f7687v);
        return this.f7687v;
    }

    @Pure
    /* renamed from: B */
    public final xb5 m24057B() {
        m24024v(this.f7688w);
        return this.f7688w;
    }

    @Pure
    /* renamed from: C */
    public final re5 m24056C() {
        m24024v(this.f7685t);
        return this.f7685t;
    }

    @Pure
    /* renamed from: D */
    public final xg5 m24055D() {
        return this.f7678m;
    }

    /* renamed from: E */
    public final om5 m24054E() {
        om5 om5Var = this.f7674i;
        if (om5Var == null || !om5Var.m8307m()) {
            return null;
        }
        return om5Var;
    }

    @Pure
    /* renamed from: F */
    public final l36 m24053F() {
        m24025u(this.f7673h);
        return this.f7673h;
    }

    @SideEffectFree
    /* renamed from: G */
    public final vn6 m24052G() {
        return this.f7675j;
    }

    @Pure
    /* renamed from: I */
    public final p28 m24050I() {
        m24024v(this.f7681p);
        return this.f7681p;
    }

    @Pure
    /* renamed from: J */
    public final k38 m24049J() {
        m24023w(this.f7683r);
        return this.f7683r;
    }

    @Pure
    /* renamed from: K */
    public final r48 m24048K() {
        m24024v(this.f7680o);
        return this.f7680o;
    }

    @Pure
    /* renamed from: L */
    public final x78 m24047L() {
        m24024v(this.f7686u);
        return this.f7686u;
    }

    @Pure
    /* renamed from: M */
    public final ca8 m24046M() {
        m24024v(this.f7676k);
        return this.f7676k;
    }

    @Pure
    /* renamed from: N */
    public final dd8 m24045N() {
        m24025u(this.f7677l);
        return this.f7677l;
    }

    @Pure
    /* renamed from: O */
    public final String m24044O() {
        return this.f7667b;
    }

    @Pure
    /* renamed from: P */
    public final String m24043P() {
        return this.f7668c;
    }

    @Pure
    /* renamed from: Q */
    public final String m24042Q() {
        return this.f7669d;
    }

    @Pure
    /* renamed from: R */
    public final String m24041R() {
        return this.f7684s;
    }

    @Override // com.daaw.xe7
    @Pure
    /* renamed from: a */
    public final b52 mo3911a() {
        return this.f7671f;
    }

    @Override // com.daaw.xe7
    @Pure
    /* renamed from: b */
    public final InterfaceC0623ag mo3909b() {
        return this.f7679n;
    }

    @Override // com.daaw.xe7
    @Pure
    /* renamed from: d */
    public final Context mo3905d() {
        return this.f7666a;
    }

    /* renamed from: e */
    public final void m24039e() {
        this.f7664F.incrementAndGet();
    }

    /* renamed from: f */
    public final /* synthetic */ void m24038f(String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            mo3895i().m14155w().m20651c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
        }
        if (th == null) {
            m24053F().f17017s.m12013a(true);
            if (bArr == null || bArr.length == 0) {
                mo3895i().m14161p().m20653a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                String optString2 = jSONObject.optString("gclid", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                if (TextUtils.isEmpty(optString)) {
                    mo3895i().m14161p().m20653a("Deferred Deep Link is empty.");
                    return;
                }
                dd8 m24045N = m24045N();
                dr6 dr6Var = m24045N.f25143a;
                if (!TextUtils.isEmpty(optString) && (queryIntentActivities = m24045N.f25143a.f7666a.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) != null && !queryIntentActivities.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", optString2);
                    bundle.putString("_cis", "ddp");
                    this.f7681p.m13683u("auto", "_cmp", bundle);
                    dd8 m24045N2 = m24045N();
                    if (TextUtils.isEmpty(optString)) {
                        return;
                    }
                    try {
                        SharedPreferences.Editor edit = m24045N2.f25143a.f7666a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                        edit.putString("deeplink", optString);
                        edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                        if (edit.commit()) {
                            m24045N2.f25143a.f7666a.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                            return;
                        }
                        return;
                    } catch (RuntimeException e) {
                        m24045N2.f25143a.mo3895i().m14160q().m20652b("Failed to persist Deferred Deep Link. exception", e);
                        return;
                    }
                }
                mo3895i().m14155w().m20651c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            } catch (JSONException e2) {
                mo3895i().m14160q().m20652b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        mo3895i().m14155w().m20651c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
    }

    /* renamed from: g */
    public final void m24037g() {
        this.f7663E++;
    }

    /* renamed from: h */
    public final void m24036h() {
        mo3882r().mo6991f();
        m24023w(m24049J());
        String m5301s = m24057B().m5301s();
        Pair m17175o = m24053F().m17175o(m5301s);
        if (!this.f7672g.m12678A() || ((Boolean) m17175o.second).booleanValue() || TextUtils.isEmpty((CharSequence) m17175o.first)) {
            mo3895i().m14161p().m20653a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        k38 m24049J = m24049J();
        m24049J.m8310j();
        ConnectivityManager connectivityManager = (ConnectivityManager) m24049J.f25143a.f7666a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            mo3895i().m14155w().m20653a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        dd8 m24045N = m24045N();
        m24057B().f25143a.f7672g.m12661p();
        URL m24466s = m24045N.m24466s(74029L, m5301s, (String) m17175o.first, m24053F().f17018t.m4400a() - 1);
        if (m24466s != null) {
            k38 m24049J2 = m24049J();
            yo6 yo6Var = new yo6(this);
            m24049J2.mo6991f();
            m24049J2.m8310j();
            ry0.m10830j(m24466s);
            ry0.m10830j(yo6Var);
            m24049J2.f25143a.mo3882r().m6979y(new h38(m24049J2, m5301s, m24466s, null, null, yo6Var, null));
        }
    }

    @Override // com.daaw.xe7
    @Pure
    /* renamed from: i */
    public final om5 mo3895i() {
        m24023w(this.f7674i);
        return this.f7674i;
    }

    /* renamed from: j */
    public final void m24035j(boolean z) {
        this.f7659A = Boolean.valueOf(z);
    }

    /* renamed from: k */
    public final void m24034k(boolean z) {
        mo3882r().mo6991f();
        this.f7662D = z;
    }

    /* renamed from: l */
    public final void m24033l(zzcl zzclVar) {
        cd2 cd2Var;
        mo3882r().mo6991f();
        cd2 m17174p = m24053F().m17174p();
        l36 m24053F = m24053F();
        dr6 dr6Var = m24053F.f25143a;
        m24053F.mo6991f();
        int i = 100;
        int i2 = m24053F.m17176n().getInt("consent_source", 100);
        qa2 qa2Var = this.f7672g;
        dr6 dr6Var2 = qa2Var.f25143a;
        Boolean m12658t = qa2Var.m12658t("google_analytics_default_allow_ad_storage");
        qa2 qa2Var2 = this.f7672g;
        dr6 dr6Var3 = qa2Var2.f25143a;
        Boolean m12658t2 = qa2Var2.m12658t("google_analytics_default_allow_analytics_storage");
        if (!(m12658t == null && m12658t2 == null) && m24053F().m17168w(-10)) {
            cd2Var = new cd2(m12658t, m12658t2);
            i = -10;
        } else {
            if (!TextUtils.isEmpty(m24057B().m5300t()) && (i2 == 0 || i2 == 30 || i2 == 10 || i2 == 30 || i2 == 30 || i2 == 40)) {
                m24050I().m13715G(cd2.f5740b, -10, this.f7665G);
            } else if (TextUtils.isEmpty(m24057B().m5300t()) && zzclVar != null && zzclVar.f37047v != null && m24053F().m17168w(30)) {
                cd2Var = cd2.m25431a(zzclVar.f37047v);
                if (!cd2Var.equals(cd2.f5740b)) {
                    i = 30;
                }
            }
            cd2Var = null;
        }
        if (cd2Var != null) {
            m24050I().m13715G(cd2Var, i, this.f7665G);
            m17174p = cd2Var;
        }
        m24050I().m13712J(m17174p);
        if (m24053F().f17003e.m4400a() == 0) {
            mo3895i().m14156v().m20652b("Persisting first open", Long.valueOf(this.f7665G));
            m24053F().f17003e.m4399b(this.f7665G);
        }
        m24050I().f22555n.m21302c();
        if (m24028q()) {
            if (!TextUtils.isEmpty(m24057B().m5300t()) || !TextUtils.isEmpty(m24057B().m5302q())) {
                dd8 m24045N = m24045N();
                String m5300t = m24057B().m5300t();
                l36 m24053F2 = m24053F();
                m24053F2.mo6991f();
                String string = m24053F2.m17176n().getString("gmp_app_id", null);
                String m5302q = m24057B().m5302q();
                l36 m24053F3 = m24053F();
                m24053F3.mo6991f();
                if (m24045N.m24487b0(m5300t, string, m5302q, m24053F3.m17176n().getString("admob_app_id", null))) {
                    mo3895i().m14157u().m20653a("Rechecking which service to use due to a GMP App Id change");
                    l36 m24053F4 = m24053F();
                    m24053F4.mo6991f();
                    Boolean m17173q = m24053F4.m17173q();
                    SharedPreferences.Editor edit = m24053F4.m17176n().edit();
                    edit.clear();
                    edit.apply();
                    if (m17173q != null) {
                        m24053F4.m17172s(m17173q);
                    }
                    m24056C().m11364p();
                    this.f7686u.m5467Q();
                    this.f7686u.m5468P();
                    m24053F().f17003e.m4399b(this.f7665G);
                    m24053F().f17005g.m20166b(null);
                }
                l36 m24053F5 = m24053F();
                String m5300t2 = m24057B().m5300t();
                m24053F5.mo6991f();
                SharedPreferences.Editor edit2 = m24053F5.m17176n().edit();
                edit2.putString("gmp_app_id", m5300t2);
                edit2.apply();
                l36 m24053F6 = m24053F();
                String m5302q2 = m24057B().m5302q();
                m24053F6.mo6991f();
                SharedPreferences.Editor edit3 = m24053F6.m17176n().edit();
                edit3.putString("admob_app_id", m5302q2);
                edit3.apply();
            }
            if (!m24053F().m17174p().m25423i(vb2.ANALYTICS_STORAGE)) {
                m24053F().f17005g.m20166b(null);
            }
            m24050I().m13719C(m24053F().f17005g.m20167a());
            qj8.m12386b();
            if (this.f7672g.m12677B(null, m75.f18528e0)) {
                try {
                    m24045N().f25143a.f7666a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                } catch (ClassNotFoundException unused) {
                    if (!TextUtils.isEmpty(m24053F().f17019u.m20167a())) {
                        mo3895i().m14155w().m20653a("Remote config removed with active feature rollouts");
                        m24053F().f17019u.m20166b(null);
                    }
                }
            }
            if (!TextUtils.isEmpty(m24057B().m5300t()) || !TextUtils.isEmpty(m24057B().m5302q())) {
                boolean m24031n = m24031n();
                if (!m24053F().m17170u() && !this.f7672g.m12674E()) {
                    m24053F().m17171t(!m24031n);
                }
                if (m24031n) {
                    m24050I().m13690f0();
                }
                m24046M().f5683d.m2584a();
                m24047L().m5465S(new AtomicReference());
                m24047L().m5453v(m24053F().f17022x.m7652a());
            }
        } else if (m24031n()) {
            if (!m24045N().m24496S("android.permission.INTERNET")) {
                mo3895i().m14160q().m20653a("App is missing INTERNET permission");
            }
            if (!m24045N().m24496S("android.permission.ACCESS_NETWORK_STATE")) {
                mo3895i().m14160q().m20653a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!ez1.m22979a(this.f7666a).m19340g() && !this.f7672g.m12672G()) {
                if (!dd8.m24490Y(this.f7666a)) {
                    mo3895i().m14160q().m20653a("AppMeasurementReceiver not registered/enabled");
                }
                if (!dd8.m24489Z(this.f7666a, false)) {
                    mo3895i().m14160q().m20653a("AppMeasurementService not registered/enabled");
                }
            }
            mo3895i().m14160q().m20653a("Uploading is not possible. App measurement disabled");
        }
        m24053F().f17012n.m12013a(true);
    }

    /* renamed from: m */
    public final boolean m24032m() {
        return this.f7659A != null && this.f7659A.booleanValue();
    }

    /* renamed from: n */
    public final boolean m24031n() {
        return m24022x() == 0;
    }

    /* renamed from: o */
    public final boolean m24030o() {
        mo3882r().mo6991f();
        return this.f7662D;
    }

    @Pure
    /* renamed from: p */
    public final boolean m24029p() {
        return TextUtils.isEmpty(this.f7667b);
    }

    /* renamed from: q */
    public final boolean m24028q() {
        if (this.f7689x) {
            mo3882r().mo6991f();
            Boolean bool = this.f7690y;
            if (bool == null || this.f7691z == 0 || (!bool.booleanValue() && Math.abs(this.f7679n.mo15859b() - this.f7691z) > 1000)) {
                this.f7691z = this.f7679n.mo15859b();
                boolean z = true;
                Boolean valueOf = Boolean.valueOf(m24045N().m24496S("android.permission.INTERNET") && m24045N().m24496S("android.permission.ACCESS_NETWORK_STATE") && (ez1.m22979a(this.f7666a).m19340g() || this.f7672g.m12672G() || (dd8.m24490Y(this.f7666a) && dd8.m24489Z(this.f7666a, false))));
                this.f7690y = valueOf;
                if (valueOf.booleanValue()) {
                    if (!m24045N().m24503L(m24057B().m5300t(), m24057B().m5302q()) && TextUtils.isEmpty(m24057B().m5302q())) {
                        z = false;
                    }
                    this.f7690y = Boolean.valueOf(z);
                }
            }
            return this.f7690y.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    @Override // com.daaw.xe7
    @Pure
    /* renamed from: r */
    public final vn6 mo3882r() {
        m24023w(this.f7675j);
        return this.f7675j;
    }

    @Pure
    /* renamed from: s */
    public final boolean m24027s() {
        return this.f7670e;
    }

    /* renamed from: x */
    public final int m24022x() {
        mo3882r().mo6991f();
        if (this.f7672g.m12674E()) {
            return 1;
        }
        Boolean bool = this.f7661C;
        if (bool == null || !bool.booleanValue()) {
            mo3882r().mo6991f();
            if (this.f7662D) {
                Boolean m17173q = m24053F().m17173q();
                if (m17173q != null) {
                    return m17173q.booleanValue() ? 0 : 3;
                }
                qa2 qa2Var = this.f7672g;
                b52 b52Var = qa2Var.f25143a.f7671f;
                Boolean m12658t = qa2Var.m12658t("firebase_analytics_collection_enabled");
                if (m12658t != null) {
                    return m12658t.booleanValue() ? 0 : 4;
                }
                Boolean bool2 = this.f7660B;
                return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f7659A == null || this.f7659A.booleanValue()) ? 0 : 7;
            }
            return 8;
        }
        return 2;
    }

    @Pure
    /* renamed from: y */
    public final vk4 m24021y() {
        vk4 vk4Var = this.f7682q;
        if (vk4Var != null) {
            return vk4Var;
        }
        throw new IllegalStateException("Component not created");
    }

    @Pure
    /* renamed from: z */
    public final qa2 m24020z() {
        return this.f7672g;
    }
}
