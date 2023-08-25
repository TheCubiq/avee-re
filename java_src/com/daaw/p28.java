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
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2.dex */
public final class p28 extends c86 {

    /* renamed from: c */
    public m28 f22544c;

    /* renamed from: d */
    public mk7 f22545d;

    /* renamed from: e */
    public final Set f22546e;

    /* renamed from: f */
    public boolean f22547f;

    /* renamed from: g */
    public final AtomicReference f22548g;

    /* renamed from: h */
    public final Object f22549h;

    /* renamed from: i */
    public cd2 f22550i;

    /* renamed from: j */
    public int f22551j;

    /* renamed from: k */
    public final AtomicLong f22552k;

    /* renamed from: l */
    public long f22553l;

    /* renamed from: m */
    public int f22554m;

    /* renamed from: n */
    public final gr8 f22555n;

    /* renamed from: o */
    public boolean f22556o;

    /* renamed from: p */
    public final ad8 f22557p;

    public p28(dr6 dr6Var) {
        super(dr6Var);
        this.f22546e = new CopyOnWriteArraySet();
        this.f22549h = new Object();
        this.f22556o = true;
        this.f22557p = new f18(this);
        this.f22548g = new AtomicReference();
        this.f22550i = new cd2(null, null);
        this.f22551j = 100;
        this.f22553l = -1L;
        this.f22554m = 100;
        this.f22552k = new AtomicLong(0L);
        this.f22555n = new gr8(dr6Var);
    }

    /* renamed from: b0 */
    public static /* bridge */ /* synthetic */ void m13694b0(p28 p28Var, cd2 cd2Var, cd2 cd2Var2) {
        boolean z;
        vb2[] vb2VarArr = {vb2.ANALYTICS_STORAGE, vb2.AD_STORAGE};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            vb2 vb2Var = vb2VarArr[i];
            if (!cd2Var2.m25423i(vb2Var) && cd2Var.m25423i(vb2Var)) {
                z = true;
                break;
            }
            i++;
        }
        boolean m25420l = cd2Var.m25420l(cd2Var2, vb2.ANALYTICS_STORAGE, vb2.AD_STORAGE);
        if (z || m25420l) {
            p28Var.f25143a.m24057B().m5298v();
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m13693c0(p28 p28Var, cd2 cd2Var, int i, long j, boolean z, boolean z2) {
        p28Var.mo6991f();
        p28Var.m25515g();
        if (j <= p28Var.f22553l && cd2.m25422j(p28Var.f22554m, i)) {
            p28Var.f25143a.mo3895i().m14157u().m20652b("Dropped out-of-date consent setting, proposed settings", cd2Var);
            return;
        }
        l36 m24053F = p28Var.f25143a.m24053F();
        dr6 dr6Var = m24053F.f25143a;
        m24053F.mo6991f();
        if (!m24053F.m17168w(i)) {
            p28Var.f25143a.mo3895i().m14157u().m20652b("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor edit = m24053F.m17176n().edit();
        edit.putString("consent_settings", cd2Var.m25424h());
        edit.putInt("consent_source", i);
        edit.apply();
        p28Var.f22553l = j;
        p28Var.f22554m = i;
        p28Var.f25143a.m24047L().m5455t(z);
        if (z2) {
            p28Var.f25143a.m24047L().m5465S(new AtomicReference());
        }
    }

    /* renamed from: A */
    public final void m13721A(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
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
        this.f25143a.mo3882r().m6978z(new xv7(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    /* renamed from: B */
    public final void m13720B(String str, String str2, long j, Object obj) {
        this.f25143a.mo3882r().m6978z(new ax7(this, str, str2, obj, j));
    }

    /* renamed from: C */
    public final void m13719C(String str) {
        this.f22548g.set(str);
    }

    /* renamed from: D */
    public final void m13718D(Bundle bundle) {
        m13717E(bundle, this.f25143a.mo3909b().mo15860a());
    }

    /* renamed from: E */
    public final void m13717E(Bundle bundle, long j) {
        ry0.m10830j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f25143a.mo3895i().m14155w().m20653a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        ry0.m10830j(bundle2);
        ag7.m27483a(bundle2, "app_id", String.class, null);
        ag7.m27483a(bundle2, "origin", String.class, null);
        ag7.m27483a(bundle2, "name", String.class, null);
        ag7.m27483a(bundle2, "value", Object.class, null);
        ag7.m27483a(bundle2, "trigger_event_name", String.class, null);
        ag7.m27483a(bundle2, "trigger_timeout", Long.class, 0L);
        ag7.m27483a(bundle2, "timed_out_event_name", String.class, null);
        ag7.m27483a(bundle2, "timed_out_event_params", Bundle.class, null);
        ag7.m27483a(bundle2, "triggered_event_name", String.class, null);
        ag7.m27483a(bundle2, "triggered_event_params", Bundle.class, null);
        ag7.m27483a(bundle2, "time_to_live", Long.class, 0L);
        ag7.m27483a(bundle2, "expired_event_name", String.class, null);
        ag7.m27483a(bundle2, "expired_event_params", Bundle.class, null);
        ry0.m10834f(bundle2.getString("name"));
        ry0.m10834f(bundle2.getString("origin"));
        ry0.m10830j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (this.f25143a.m24045N().m24474n0(string) != 0) {
            this.f25143a.mo3895i().m14160q().m20652b("Invalid conditional user property name", this.f25143a.m24055D().m5131f(string));
        } else if (this.f25143a.m24045N().m24479j0(string, obj) != 0) {
            this.f25143a.mo3895i().m14160q().m20651c("Invalid conditional user property value", this.f25143a.m24055D().m5131f(string), obj);
        } else {
            Object m24473o = this.f25143a.m24045N().m24473o(string, obj);
            if (m24473o == null) {
                this.f25143a.mo3895i().m14160q().m20651c("Unable to normalize conditional user property value", this.f25143a.m24055D().m5131f(string), obj);
                return;
            }
            ag7.m27482b(bundle2, m24473o);
            long j2 = bundle2.getLong("trigger_timeout");
            if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
                this.f25143a.m24020z();
                if (j2 > 15552000000L || j2 < 1) {
                    this.f25143a.mo3895i().m14160q().m20651c("Invalid conditional user property timeout", this.f25143a.m24055D().m5131f(string), Long.valueOf(j2));
                    return;
                }
            }
            long j3 = bundle2.getLong("time_to_live");
            this.f25143a.m24020z();
            if (j3 > 15552000000L || j3 < 1) {
                this.f25143a.mo3895i().m14160q().m20651c("Invalid conditional user property time to live", this.f25143a.m24055D().m5131f(string), Long.valueOf(j3));
            } else {
                this.f25143a.mo3882r().m6978z(new i08(this, bundle2));
            }
        }
    }

    /* renamed from: F */
    public final void m13716F(Bundle bundle, int i, long j) {
        m25515g();
        String m25425g = cd2.m25425g(bundle);
        if (m25425g != null) {
            this.f25143a.mo3895i().m14154x().m20652b("Ignoring invalid consent setting", m25425g);
            this.f25143a.mo3895i().m14154x().m20653a("Valid consent values are 'granted', 'denied'");
        }
        m13715G(cd2.m25431a(bundle), i, j);
    }

    /* renamed from: G */
    public final void m13715G(cd2 cd2Var, int i, long j) {
        cd2 cd2Var2;
        boolean z;
        boolean z2;
        boolean z3;
        cd2 cd2Var3 = cd2Var;
        m25515g();
        if (i != -10 && cd2Var.m25427e() == null && cd2Var.m25426f() == null) {
            this.f25143a.mo3895i().m14154x().m20653a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f22549h) {
            cd2Var2 = this.f22550i;
            z = true;
            z2 = false;
            if (cd2.m25422j(i, this.f22551j)) {
                boolean m25421k = cd2Var3.m25421k(this.f22550i);
                vb2 vb2Var = vb2.ANALYTICS_STORAGE;
                if (cd2Var3.m25423i(vb2Var) && !this.f22550i.m25423i(vb2Var)) {
                    z2 = true;
                }
                cd2Var3 = cd2Var3.m25428d(this.f22550i);
                this.f22550i = cd2Var3;
                this.f22551j = i;
                z3 = z2;
                z2 = m25421k;
            } else {
                z = false;
                z3 = false;
            }
        }
        if (!z) {
            this.f25143a.mo3895i().m14157u().m20652b("Ignoring lower-priority consent settings, proposed settings", cd2Var3);
            return;
        }
        long andIncrement = this.f22552k.getAndIncrement();
        if (z2) {
            this.f22548g.set(null);
            this.f25143a.mo3882r().m6996A(new x18(this, cd2Var3, j, i, andIncrement, z3, cd2Var2));
            return;
        }
        a28 a28Var = new a28(this, cd2Var3, i, andIncrement, z3, cd2Var2);
        if (i == 30 || i == -10) {
            this.f25143a.mo3882r().m6996A(a28Var);
        } else {
            this.f25143a.mo3882r().m6978z(a28Var);
        }
    }

    /* renamed from: H */
    public final void m13714H(mk7 mk7Var) {
        mk7 mk7Var2;
        mo6991f();
        m25515g();
        if (mk7Var != null && mk7Var != (mk7Var2 = this.f22545d)) {
            ry0.m10826n(mk7Var2 == null, "EventInterceptor already set.");
        }
        this.f22545d = mk7Var;
    }

    /* renamed from: I */
    public final void m13713I(Boolean bool) {
        m25515g();
        this.f25143a.mo3882r().m6978z(new u18(this, bool));
    }

    /* renamed from: J */
    public final void m13712J(cd2 cd2Var) {
        mo6991f();
        boolean z = (cd2Var.m25423i(vb2.ANALYTICS_STORAGE) && cd2Var.m25423i(vb2.AD_STORAGE)) || this.f25143a.m24047L().m5483A();
        if (z != this.f25143a.m24030o()) {
            this.f25143a.m24034k(z);
            l36 m24053F = this.f25143a.m24053F();
            dr6 dr6Var = m24053F.f25143a;
            m24053F.mo6991f();
            Boolean valueOf = m24053F.m17176n().contains("measurement_enabled_from_api") ? Boolean.valueOf(m24053F.m17176n().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                m13707O(Boolean.valueOf(z), false);
            }
        }
    }

    /* renamed from: K */
    public final void m13711K(String str, String str2, Object obj, boolean z) {
        m13710L("auto", "_ldl", obj, true, this.f25143a.mo3909b().mo15860a());
    }

    /* renamed from: L */
    public final void m13710L(String str, String str2, Object obj, boolean z, long j) {
        int i;
        String str3 = str == null ? "app" : str;
        if (z) {
            i = this.f25143a.m24045N().m24474n0(str2);
        } else {
            dd8 m24045N = this.f25143a.m24045N();
            if (m24045N.m24497R("user property", str2)) {
                if (m24045N.m24501N("user property", jj7.f15137a, null, str2)) {
                    m24045N.f25143a.m24020z();
                    if (m24045N.m24502M("user property", 24, str2)) {
                        i = 0;
                    }
                } else {
                    i = 15;
                }
            }
            i = 6;
        }
        if (i != 0) {
            dd8 m24045N2 = this.f25143a.m24045N();
            this.f25143a.m24020z();
            this.f25143a.m24045N().m24513B(this.f22557p, null, i, "_ev", m24045N2.m24469q(str2, 24, true), str2 != null ? str2.length() : 0);
        } else if (obj == null) {
            m13720B(str3, str2, j, null);
        } else {
            int m24479j0 = this.f25143a.m24045N().m24479j0(str2, obj);
            if (m24479j0 != 0) {
                dd8 m24045N3 = this.f25143a.m24045N();
                this.f25143a.m24020z();
                this.f25143a.m24045N().m24513B(this.f22557p, null, m24479j0, "_ev", m24045N3.m24469q(str2, 24, true), ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0);
                return;
            }
            Object m24473o = this.f25143a.m24045N().m24473o(str2, obj);
            if (m24473o != null) {
                m13720B(str3, str2, j, m24473o);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13709M(String str, String str2, Object obj, long j) {
        String str3;
        Object obj2;
        i26 i26Var;
        String str4;
        Long l;
        ry0.m10834f(str);
        ry0.m10834f(str2);
        mo6991f();
        m25515g();
        if ("allow_personalized_ads".equals(str2)) {
            if (obj instanceof String) {
                String str5 = (String) obj;
                if (!TextUtils.isEmpty(str5)) {
                    String lowerCase = str5.toLowerCase(Locale.ENGLISH);
                    str4 = "false";
                    Long valueOf = Long.valueOf(true != "false".equals(lowerCase) ? 0L : 1L);
                    i26Var = this.f25143a.m24053F().f17011m;
                    int i = (valueOf.longValue() > 1L ? 1 : (valueOf.longValue() == 1L ? 0 : -1));
                    l = valueOf;
                    if (i == 0) {
                        str4 = "true";
                        l = valueOf;
                    }
                    i26Var.m20166b(str4);
                    obj2 = l;
                    str3 = "_npa";
                    if (!this.f25143a.m24031n()) {
                        this.f25143a.mo3895i().m14156v().m20653a("User property not set since app measurement is disabled");
                        return;
                    } else if (this.f25143a.m24028q()) {
                        this.f25143a.m24047L().m5450y(new zzkw(str3, j, obj2, str));
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (obj == null) {
                i26Var = this.f25143a.m24053F().f17011m;
                str4 = "unset";
                l = obj;
                i26Var.m20166b(str4);
                obj2 = l;
                str3 = "_npa";
                if (!this.f25143a.m24031n()) {
                }
            }
        }
        str3 = str2;
        obj2 = obj;
        if (!this.f25143a.m24031n()) {
        }
    }

    /* renamed from: N */
    public final void m13708N(pl7 pl7Var) {
        m25515g();
        ry0.m10830j(pl7Var);
        if (this.f22546e.remove(pl7Var)) {
            return;
        }
        this.f25143a.mo3895i().m14155w().m20653a("OnEventListener had not been registered");
    }

    /* renamed from: O */
    public final void m13707O(Boolean bool, boolean z) {
        mo6991f();
        m25515g();
        this.f25143a.mo3895i().m14161p().m20652b("Setting app measurement enabled (FE)", bool);
        this.f25143a.m24053F().m17172s(bool);
        if (z) {
            l36 m24053F = this.f25143a.m24053F();
            dr6 dr6Var = m24053F.f25143a;
            m24053F.mo6991f();
            SharedPreferences.Editor edit = m24053F.m17176n().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.f25143a.m24030o() || !(bool == null || bool.booleanValue())) {
            m13706P();
        }
    }

    /* renamed from: P */
    public final void m13706P() {
        Long valueOf;
        mo6991f();
        String m20167a = this.f25143a.m24053F().f17011m.m20167a();
        if (m20167a != null) {
            if ("unset".equals(m20167a)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(true != "true".equals(m20167a) ? 0L : 1L);
            }
            m13709M("app", "_npa", valueOf, this.f25143a.mo3909b().mo15860a());
        }
        if (!this.f25143a.m24031n() || !this.f22556o) {
            this.f25143a.mo3895i().m14161p().m20653a("Updating Scion state (FE)");
            this.f25143a.m24047L().m5452w();
            return;
        }
        this.f25143a.mo3895i().m14161p().m20653a("Recording app launch after enabling measurement for the first time (FE)");
        m13690f0();
        rk8.m11208b();
        if (this.f25143a.m24020z().m12677B(null, m75.f18530f0)) {
            this.f25143a.m24046M().f5683d.m2584a();
        }
        this.f25143a.mo3882r().m6978z(new it7(this));
    }

    /* renamed from: Q */
    public final int m13705Q(String str) {
        ry0.m10834f(str);
        this.f25143a.m24020z();
        return 25;
    }

    /* renamed from: R */
    public final Boolean m13704R() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f25143a.mo3882r().m6986q(atomicReference, 15000L, "boolean test flag value", new w08(this, atomicReference));
    }

    /* renamed from: S */
    public final Double m13703S() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f25143a.mo3882r().m6986q(atomicReference, 15000L, "double test flag value", new r18(this, atomicReference));
    }

    /* renamed from: T */
    public final Integer m13702T() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f25143a.mo3882r().m6986q(atomicReference, 15000L, "int test flag value", new o18(this, atomicReference));
    }

    /* renamed from: U */
    public final Long m13701U() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f25143a.mo3882r().m6986q(atomicReference, 15000L, "long test flag value", new l18(this, atomicReference));
    }

    /* renamed from: V */
    public final String m13700V() {
        return (String) this.f22548g.get();
    }

    /* renamed from: W */
    public final String m13699W() {
        t38 m11743q = this.f25143a.m24048K().m11743q();
        if (m11743q != null) {
            return m11743q.f26980b;
        }
        return null;
    }

    /* renamed from: X */
    public final String m13698X() {
        t38 m11743q = this.f25143a.m24048K().m11743q();
        if (m11743q != null) {
            return m11743q.f26979a;
        }
        return null;
    }

    /* renamed from: Y */
    public final String m13697Y() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f25143a.mo3882r().m6986q(atomicReference, 15000L, "String test flag value", new i18(this, atomicReference));
    }

    /* renamed from: Z */
    public final ArrayList m13696Z(String str, String str2) {
        if (this.f25143a.mo3882r().m6994C()) {
            this.f25143a.mo3895i().m14160q().m20653a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        this.f25143a.mo3911a();
        if (b52.m26486a()) {
            this.f25143a.mo3895i().m14160q().m20653a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f25143a.mo3882r().m6986q(atomicReference, 5000L, "get conditional user properties", new t08(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list == null) {
            this.f25143a.mo3895i().m14160q().m20652b("Timed out waiting for get conditional user properties", null);
            return new ArrayList();
        }
        return dd8.m24460v(list);
    }

    /* renamed from: a0 */
    public final Map m13695a0(String str, String str2, boolean z) {
        hk5 m14160q;
        String str3;
        if (this.f25143a.mo3882r().m6994C()) {
            m14160q = this.f25143a.mo3895i().m14160q();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            this.f25143a.mo3911a();
            if (!b52.m26486a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f25143a.mo3882r().m6986q(atomicReference, 5000L, "get user properties", new z08(this, atomicReference, null, str, str2, z));
                List<zzkw> list = (List) atomicReference.get();
                if (list == null) {
                    this.f25143a.mo3895i().m14160q().m20652b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                C1370g6 c1370g6 = new C1370g6(list.size());
                for (zzkw zzkwVar : list) {
                    Object m1073h = zzkwVar.m1073h();
                    if (m1073h != null) {
                        c1370g6.put(zzkwVar.f37073q, m1073h);
                    }
                }
                return c1370g6;
            }
            m14160q = this.f25143a.mo3895i().m14160q();
            str3 = "Cannot get user properties from main thread";
        }
        m14160q.m20653a(str3);
        return Collections.emptyMap();
    }

    /* renamed from: f0 */
    public final void m13690f0() {
        mo6991f();
        m25515g();
        if (this.f25143a.m24028q()) {
            if (this.f25143a.m24020z().m12677B(null, m75.f18518Z)) {
                qa2 m24020z = this.f25143a.m24020z();
                m24020z.f25143a.mo3911a();
                Boolean m12658t = m24020z.m12658t("google_analytics_deferred_deep_link_enabled");
                if (m12658t != null && m12658t.booleanValue()) {
                    this.f25143a.mo3895i().m14161p().m20653a("Deferred Deep Link feature enabled.");
                    this.f25143a.mo3882r().m6978z(new Runnable() { // from class: com.daaw.hs7
                        @Override // java.lang.Runnable
                        public final void run() {
                            p28 p28Var = p28.this;
                            p28Var.mo6991f();
                            if (p28Var.f25143a.m24053F().f17017s.m12012b()) {
                                p28Var.f25143a.mo3895i().m14161p().m20653a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long m4400a = p28Var.f25143a.m24053F().f17018t.m4400a();
                            p28Var.f25143a.m24053F().f17018t.m4399b(1 + m4400a);
                            p28Var.f25143a.m24020z();
                            if (m4400a < 5) {
                                p28Var.f25143a.m24036h();
                                return;
                            }
                            p28Var.f25143a.mo3895i().m14155w().m20653a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                            p28Var.f25143a.m24053F().f17017s.m12013a(true);
                        }
                    });
                }
            }
            this.f25143a.m24047L().m5469O();
            this.f22556o = false;
            l36 m24053F = this.f25143a.m24053F();
            m24053F.mo6991f();
            String string = m24053F.m17176n().getString("previous_os_version", null);
            m24053F.f25143a.m24058A().m8310j();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = m24053F.m17176n().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            this.f25143a.m24058A().m8310j();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m13683u("auto", "_ou", bundle);
        }
    }

    @Override // com.daaw.c86
    /* renamed from: m */
    public final boolean mo5306m() {
        return false;
    }

    /* renamed from: n */
    public final void m13689n(String str, String str2, Bundle bundle) {
        long mo15860a = this.f25143a.mo3909b().mo15860a();
        ry0.m10834f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", mo15860a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        this.f25143a.mo3882r().m6978z(new q08(this, bundle2));
    }

    /* renamed from: o */
    public final void m13688o() {
        if (!(this.f25143a.mo3905d().getApplicationContext() instanceof Application) || this.f22544c == null) {
            return;
        }
        ((Application) this.f25143a.mo3905d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f22544c);
    }

    /* renamed from: p */
    public final /* synthetic */ void m13687p(Bundle bundle) {
        if (bundle == null) {
            this.f25143a.m24053F().f17022x.m7651b(new Bundle());
            return;
        }
        Bundle m7652a = this.f25143a.m24053F().f17022x.m7652a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                if (this.f25143a.m24045N().m24494U(obj)) {
                    this.f25143a.m24045N().m24513B(this.f22557p, null, 27, null, null, 0);
                }
                this.f25143a.mo3895i().m14154x().m20651c("Invalid default event parameter type. Name, value", str, obj);
            } else if (dd8.m24492W(str)) {
                this.f25143a.mo3895i().m14154x().m20652b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m7652a.remove(str);
            } else {
                dd8 m24045N = this.f25143a.m24045N();
                this.f25143a.m24020z();
                if (m24045N.m24499P("param", str, 100, obj)) {
                    this.f25143a.m24045N().m24512C(m7652a, str, obj);
                }
            }
        }
        this.f25143a.m24045N();
        int m12665l = this.f25143a.m24020z().m12665l();
        if (m7652a.size() > m12665l) {
            int i = 0;
            for (String str2 : new TreeSet(m7652a.keySet())) {
                i++;
                if (i > m12665l) {
                    m7652a.remove(str2);
                }
            }
            this.f25143a.m24045N().m24513B(this.f22557p, null, 26, null, null, 0);
            this.f25143a.mo3895i().m14154x().m20653a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        this.f25143a.m24053F().f17022x.m7651b(m7652a);
        this.f25143a.m24047L().m5453v(m7652a);
    }

    /* renamed from: q */
    public final void m13686q(String str, String str2, Bundle bundle) {
        m13685s(str, str2, bundle, true, true, this.f25143a.mo3909b().mo15860a());
    }

    /* renamed from: s */
    public final void m13685s(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (str2 == "screen_view" || (str2 != null && str2.equals("screen_view"))) {
            this.f25143a.m24048K().m11749E(bundle2, j);
        } else {
            m13721A(str3, str2, j, bundle2, z2, !z2 || this.f22545d == null || dd8.m24492W(str2), z, null);
        }
    }

    /* renamed from: t */
    public final void m13684t(String str, String str2, Bundle bundle, String str3) {
        dr6.m24026t();
        m13721A("auto", str2, this.f25143a.mo3909b().mo15860a(), bundle, false, true, true, str3);
    }

    /* renamed from: u */
    public final void m13683u(String str, String str2, Bundle bundle) {
        mo6991f();
        m13682v(str, str2, this.f25143a.mo3909b().mo15860a(), bundle);
    }

    /* renamed from: v */
    public final void m13682v(String str, String str2, long j, Bundle bundle) {
        mo6991f();
        m13681w(str, str2, j, bundle, true, this.f22545d == null || dd8.m24492W(str2), true, null);
    }

    /* renamed from: w */
    public final void m13681w(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        boolean z4;
        String str4;
        ArrayList arrayList;
        long j2;
        Bundle[] bundleArr;
        Object[] objArr;
        ry0.m10834f(str);
        ry0.m10830j(bundle);
        mo6991f();
        m25515g();
        if (!this.f25143a.m24031n()) {
            this.f25143a.mo3895i().m14161p().m20653a("Event not sent since app measurement is disabled");
            return;
        }
        List m5299u = this.f25143a.m24057B().m5299u();
        if (m5299u != null && !m5299u.contains(str2)) {
            this.f25143a.mo3895i().m14161p().m20651c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        if (!this.f22547f) {
            this.f22547f = true;
            try {
                try {
                    (!this.f25143a.m24027s() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f25143a.mo3905d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f25143a.mo3905d());
                } catch (Exception e) {
                    this.f25143a.mo3895i().m14155w().m20652b("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                this.f25143a.mo3895i().m14157u().m20653a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            this.f25143a.mo3911a();
            m13709M("auto", "_lgclid", bundle.getString("gclid"), this.f25143a.mo3909b().mo15860a());
        }
        this.f25143a.mo3911a();
        if (z && dd8.m24488a0(str2)) {
            this.f25143a.m24045N().m24454z(bundle, this.f25143a.m24053F().f17022x.m7652a());
        }
        if (!z3) {
            this.f25143a.mo3911a();
            if (!"_iap".equals(str2)) {
                dd8 m24045N = this.f25143a.m24045N();
                int i = 2;
                if (m24045N.m24497R("event", str2)) {
                    if (m24045N.m24501N("event", dh7.f7091a, dh7.f7092b, str2)) {
                        m24045N.f25143a.m24020z();
                        if (m24045N.m24502M("event", 40, str2)) {
                            i = 0;
                        }
                    } else {
                        i = 13;
                    }
                }
                if (i != 0) {
                    this.f25143a.mo3895i().m14159s().m20652b("Invalid public event name. Event will not be logged (FE)", this.f25143a.m24055D().m5133d(str2));
                    dd8 m24045N2 = this.f25143a.m24045N();
                    this.f25143a.m24020z();
                    this.f25143a.m24045N().m24513B(this.f22557p, null, i, "_ev", m24045N2.m24469q(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        this.f25143a.mo3911a();
        t38 m11742s = this.f25143a.m24048K().m11742s(false);
        if (m11742s != null && !bundle.containsKey("_sc")) {
            m11742s.f26982d = true;
        }
        dd8.m24455y(m11742s, bundle, z && !z3);
        boolean equals = "am".equals(str);
        boolean m24492W = dd8.m24492W(str2);
        if (!z || this.f22545d == null || m24492W) {
            z4 = equals;
        } else if (!equals) {
            this.f25143a.mo3895i().m14161p().m20651c("Passing event to registered event handler (FE)", this.f25143a.m24055D().m5133d(str2), this.f25143a.m24055D().m5135b(bundle));
            ry0.m10830j(this.f22545d);
            this.f22545d.mo15984a(str, str2, bundle, j);
            return;
        } else {
            z4 = true;
        }
        if (this.f25143a.m24028q()) {
            int m24478k0 = this.f25143a.m24045N().m24478k0(str2);
            if (m24478k0 != 0) {
                this.f25143a.mo3895i().m14159s().m20652b("Invalid event name. Event will not be logged (FE)", this.f25143a.m24055D().m5133d(str2));
                dd8 m24045N3 = this.f25143a.m24045N();
                this.f25143a.m24020z();
                this.f25143a.m24045N().m24513B(this.f22557p, str3, m24478k0, "_ev", m24045N3.m24469q(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            String str5 = "_o";
            Bundle m24459v0 = this.f25143a.m24045N().m24459v0(str3, str2, bundle, C1701ig.m19847c("_o", "_sn", "_sc", "_si"), z3);
            ry0.m10830j(m24459v0);
            this.f25143a.mo3911a();
            if (this.f25143a.m24048K().m11742s(false) != null && "_ae".equals(str2)) {
                w98 w98Var = this.f25143a.m24046M().f5684e;
                long mo15859b = w98Var.f31092d.f25143a.mo3909b().mo15859b();
                long j3 = mo15859b - w98Var.f31090b;
                w98Var.f31090b = mo15859b;
                if (j3 > 0) {
                    this.f25143a.m24045N().m24458w(m24459v0, j3);
                }
            }
            qj8.m12386b();
            if (this.f25143a.m24020z().m12677B(null, m75.f18528e0)) {
                if (!"auto".equals(str) && "_ssr".equals(str2)) {
                    dd8 m24045N4 = this.f25143a.m24045N();
                    String string = m24459v0.getString("_ffr");
                    if (eh1.m23467a(string)) {
                        string = null;
                    } else if (string != null) {
                        string = string.trim();
                    }
                    if (pc8.m13446a(string, m24045N4.f25143a.m24053F().f17019u.m20167a())) {
                        m24045N4.f25143a.mo3895i().m14161p().m20653a("Not logging duplicate session_start_with_rollout event");
                        return;
                    }
                    m24045N4.f25143a.m24053F().f17019u.m20166b(string);
                } else if ("_ae".equals(str2)) {
                    String m20167a = this.f25143a.m24045N().f25143a.m24053F().f17019u.m20167a();
                    if (!TextUtils.isEmpty(m20167a)) {
                        m24459v0.putString("_ffr", m20167a);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(m24459v0);
            if (this.f25143a.m24053F().f17013o.m4400a() > 0 && this.f25143a.m24053F().m17169v(j) && this.f25143a.m24053F().f17016r.m12012b()) {
                this.f25143a.mo3895i().m14156v().m20653a("Current session is expired, remove the session number, ID, and engagement time");
                arrayList = arrayList2;
                j2 = 0;
                str4 = "_ae";
                m13709M("auto", "_sid", null, this.f25143a.mo3909b().mo15860a());
                m13709M("auto", "_sno", null, this.f25143a.mo3909b().mo15860a());
                m13709M("auto", "_se", null, this.f25143a.mo3909b().mo15860a());
                this.f25143a.m24053F().f17014p.m4399b(0L);
            } else {
                str4 = "_ae";
                arrayList = arrayList2;
                j2 = 0;
            }
            if (m24459v0.getLong("extend_session", j2) == 1) {
                this.f25143a.mo3895i().m14156v().m20653a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.f25143a.m24046M().f5683d.m2583b(j, true);
            }
            ArrayList arrayList3 = new ArrayList(m24459v0.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str6 = (String) arrayList3.get(i2);
                if (str6 != null) {
                    this.f25143a.m24045N();
                    Object obj = m24459v0.get(str6);
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
                        m24459v0.putParcelableArray(str6, bundleArr);
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
                    bundle2 = this.f25143a.m24045N().m24461u0(bundle2);
                }
                Bundle bundle3 = bundle2;
                String str8 = str5;
                this.f25143a.m24047L().m5460n(new zzaw(str7, new zzau(bundle3), str, j), str3);
                if (!z4) {
                    for (pl7 pl7Var : this.f22546e) {
                        pl7Var.mo3611a(str, str2, new Bundle(bundle3), j);
                    }
                }
                i3++;
                str5 = str8;
                arrayList = arrayList5;
            }
            this.f25143a.mo3911a();
            if (this.f25143a.m24048K().m11742s(false) == null || !str4.equals(str2)) {
                return;
            }
            this.f25143a.m24046M().f5684e.m6278d(true, true, this.f25143a.mo3909b().mo15859b());
        }
    }

    /* renamed from: x */
    public final void m13680x(pl7 pl7Var) {
        m25515g();
        ry0.m10830j(pl7Var);
        if (this.f22546e.add(pl7Var)) {
            return;
        }
        this.f25143a.mo3895i().m14155w().m20653a("OnEventListener already registered");
    }

    /* renamed from: y */
    public final void m13679y(long j) {
        this.f22548g.set(null);
        this.f25143a.mo3882r().m6978z(new fz7(this, j));
    }

    /* renamed from: z */
    public final void m13678z(long j, boolean z) {
        mo6991f();
        m25515g();
        this.f25143a.mo3895i().m14161p().m20653a("Resetting analytics data (FE)");
        ca8 m24046M = this.f25143a.m24046M();
        m24046M.mo6991f();
        m24046M.f5684e.m6281a();
        zm8.m2111b();
        if (this.f25143a.m24020z().m12677B(null, m75.f18548o0)) {
            this.f25143a.m24057B().m5298v();
        }
        boolean m24031n = this.f25143a.m24031n();
        l36 m24053F = this.f25143a.m24053F();
        m24053F.f17003e.m4399b(j);
        if (!TextUtils.isEmpty(m24053F.f25143a.m24053F().f17019u.m20167a())) {
            m24053F.f17019u.m20166b(null);
        }
        rk8.m11208b();
        qa2 m24020z = m24053F.f25143a.m24020z();
        j65 j65Var = m75.f18530f0;
        if (m24020z.m12677B(null, j65Var)) {
            m24053F.f17013o.m4399b(0L);
        }
        m24053F.f17014p.m4399b(0L);
        if (!m24053F.f25143a.m24020z().m12674E()) {
            m24053F.m17171t(!m24031n);
        }
        m24053F.f17020v.m20166b(null);
        m24053F.f17021w.m4399b(0L);
        m24053F.f17022x.m7651b(null);
        if (z) {
            this.f25143a.m24047L().m5458p();
        }
        rk8.m11208b();
        if (this.f25143a.m24020z().m12677B(null, j65Var)) {
            this.f25143a.m24046M().f5683d.m2584a();
        }
        this.f22556o = !m24031n;
    }
}
