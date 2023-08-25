package com.daaw;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
/* loaded from: classes2.dex */
public final class gh6 extends pa8 implements i92 {

    /* renamed from: d */
    public final Map f11274d;

    /* renamed from: e */
    public final Map f11275e;

    /* renamed from: f */
    public final Map f11276f;

    /* renamed from: g */
    public final Map f11277g;

    /* renamed from: h */
    public final Map f11278h;

    /* renamed from: i */
    public final Map f11279i;

    /* renamed from: j */
    public final wl0 f11280j;

    /* renamed from: k */
    public final zp8 f11281k;

    /* renamed from: l */
    public final Map f11282l;

    /* renamed from: m */
    public final Map f11283m;

    /* renamed from: n */
    public final Map f11284n;

    public gh6(yb8 yb8Var) {
        super(yb8Var);
        this.f11274d = new C1370g6();
        this.f11275e = new C1370g6();
        this.f11276f = new C1370g6();
        this.f11277g = new C1370g6();
        this.f11278h = new C1370g6();
        this.f11282l = new C1370g6();
        this.f11283m = new C1370g6();
        this.f11284n = new C1370g6();
        this.f11279i = new C1370g6();
        this.f11280j = new xd6(this, 20);
        this.f11281k = new af6(this);
    }

    /* renamed from: p */
    public static final Map m21615p(wd6 wd6Var) {
        C1370g6 c1370g6 = new C1370g6();
        if (wd6Var != null) {
            for (ii6 ii6Var : wd6Var.m6141P()) {
                c1370g6.put(ii6Var.m19766E(), ii6Var.m19765F());
            }
        }
        return c1370g6;
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ tr3 m21613s(gh6 gh6Var, String str) {
        gh6Var.m13533g();
        ry0.m10834f(str);
        if (gh6Var.m21631C(str)) {
            if (!gh6Var.f11278h.containsKey(str) || gh6Var.f11278h.get(str) == null) {
                gh6Var.m21617n(str);
            } else {
                gh6Var.m21616o(str, (wd6) gh6Var.f11278h.get(str));
            }
            return (tr3) gh6Var.f11280j.m6018h().get(str);
        }
        return null;
    }

    /* renamed from: A */
    public final void m21633A(String str) {
        mo6991f();
        this.f11278h.remove(str);
    }

    /* renamed from: B */
    public final boolean m21632B(String str) {
        mo6991f();
        wd6 m21612t = m21612t(str);
        if (m21612t == null) {
            return false;
        }
        return m21612t.m6138S();
    }

    /* renamed from: C */
    public final boolean m21631C(String str) {
        wd6 wd6Var;
        return (TextUtils.isEmpty(str) || (wd6Var = (wd6) this.f11278h.get(str)) == null || wd6Var.m6153D() == 0) ? false : true;
    }

    /* renamed from: D */
    public final boolean m21630D(String str) {
        return "1".equals(mo20012c(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: E */
    public final boolean m21629E(String str, String str2) {
        Boolean bool;
        mo6991f();
        m21617n(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f11277g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: F */
    public final boolean m21628F(String str, String str2) {
        Boolean bool;
        mo6991f();
        m21617n(str);
        if (m21630D(str) && dd8.m24492W(str2)) {
            return true;
        }
        if (m21627G(str) && dd8.m24491X(str2)) {
            return true;
        }
        Map map = (Map) this.f11276f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: G */
    public final boolean m21627G(String str) {
        return "1".equals(mo20012c(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: H */
    public final boolean m21626H(String str, byte[] bArr, String str2, String str3) {
        m13533g();
        mo6991f();
        ry0.m10834f(str);
        tc6 tc6Var = (tc6) m21619l(str, bArr).m18675A();
        m21618m(str, tc6Var);
        m21616o(str, (wd6) tc6Var.m3975m());
        this.f11278h.put(str, (wd6) tc6Var.m3975m());
        this.f11282l.put(str, tc6Var.m9308w());
        this.f11283m.put(str, str2);
        this.f11284n.put(str, str3);
        this.f11274d.put(str, m21615p((wd6) tc6Var.m3975m()));
        this.f19771b.m3915W().m8147m(str, new ArrayList(tc6Var.m9307x()));
        try {
            tc6Var.m9310u();
            bArr = ((wd6) tc6Var.m3975m()).m6531i();
        } catch (RuntimeException e) {
            this.f25143a.mo3895i().m14155w().m20651c("Unable to serialize reduced-size config. Storing full config instead. appId", om5.m14152z(str), e);
        }
        uh2 m3915W = this.f19771b.m3915W();
        ry0.m10834f(str);
        m3915W.mo6991f();
        m3915W.m13533g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (m3915W.f25143a.m24020z().m12677B(null, m75.f18552q0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (m3915W.m8168P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                m3915W.f25143a.mo3895i().m14160q().m20652b("Failed to update remote config (got 0). appId", om5.m14152z(str));
            }
        } catch (SQLiteException e2) {
            m3915W.f25143a.mo3895i().m14160q().m20651c("Error storing remote config. appId", om5.m14152z(str), e2);
        }
        this.f11278h.put(str, (wd6) tc6Var.m3975m());
        return true;
    }

    /* renamed from: I */
    public final boolean m21625I(String str) {
        mo6991f();
        m21617n(str);
        return this.f11275e.get(str) != null && ((Set) this.f11275e.get(str)).contains("app_instance_id");
    }

    /* renamed from: J */
    public final boolean m21624J(String str) {
        mo6991f();
        m21617n(str);
        return this.f11275e.get(str) != null && (((Set) this.f11275e.get(str)).contains("device_model") || ((Set) this.f11275e.get(str)).contains("device_info"));
    }

    /* renamed from: K */
    public final boolean m21623K(String str) {
        mo6991f();
        m21617n(str);
        return this.f11275e.get(str) != null && ((Set) this.f11275e.get(str)).contains("enhanced_user_id");
    }

    /* renamed from: L */
    public final boolean m21622L(String str) {
        mo6991f();
        m21617n(str);
        return this.f11275e.get(str) != null && ((Set) this.f11275e.get(str)).contains("google_signals");
    }

    /* renamed from: M */
    public final boolean m21621M(String str) {
        mo6991f();
        m21617n(str);
        return this.f11275e.get(str) != null && (((Set) this.f11275e.get(str)).contains("os_version") || ((Set) this.f11275e.get(str)).contains("device_info"));
    }

    /* renamed from: N */
    public final boolean m21620N(String str) {
        mo6991f();
        m21617n(str);
        return this.f11275e.get(str) != null && ((Set) this.f11275e.get(str)).contains("user_id");
    }

    @Override // com.daaw.i92
    /* renamed from: c */
    public final String mo20012c(String str, String str2) {
        mo6991f();
        m21617n(str);
        Map map = (Map) this.f11274d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.daaw.pa8
    /* renamed from: k */
    public final boolean mo8149k() {
        return false;
    }

    /* renamed from: l */
    public final wd6 m21619l(String str, byte[] bArr) {
        if (bArr == null) {
            return wd6.m6147J();
        }
        try {
            wd6 wd6Var = (wd6) ((tc6) ec8.m23601C(wd6.m6149H(), bArr)).m3975m();
            this.f25143a.mo3895i().m14156v().m20651c("Parsed config. version, gmp_app_id", wd6Var.m6136U() ? Long.valueOf(wd6Var.m6151F()) : null, wd6Var.m6137T() ? wd6Var.m6146K() : null);
            return wd6Var;
        } catch (mb8 | RuntimeException e) {
            this.f25143a.mo3895i().m14155w().m20651c("Unable to merge remote config. appId", om5.m14152z(str), e);
            return wd6.m6147J();
        }
    }

    /* renamed from: m */
    public final void m21618m(String str, tc6 tc6Var) {
        HashSet hashSet = new HashSet();
        C1370g6 c1370g6 = new C1370g6();
        C1370g6 c1370g62 = new C1370g6();
        C1370g6 c1370g63 = new C1370g6();
        for (k96 k96Var : tc6Var.m9306y()) {
            hashSet.add(k96Var.m17936E());
        }
        for (int i = 0; i < tc6Var.m9312s(); i++) {
            na6 na6Var = (na6) tc6Var.m9311t(i).m18675A();
            if (na6Var.m15355u().isEmpty()) {
                this.f25143a.mo3895i().m14155w().m20653a("EventConfig contained null event name");
            } else {
                String m15355u = na6Var.m15355u();
                String m24377b = dh7.m24377b(na6Var.m15355u());
                if (!TextUtils.isEmpty(m24377b)) {
                    na6Var.m15356t(m24377b);
                    tc6Var.m9309v(i, na6Var);
                }
                if (na6Var.m15352x() && na6Var.m15354v()) {
                    c1370g6.put(m15355u, Boolean.TRUE);
                }
                if (na6Var.m15351y() && na6Var.m15353w()) {
                    c1370g62.put(na6Var.m15355u(), Boolean.TRUE);
                }
                if (na6Var.m15350z()) {
                    if (na6Var.m15357s() < 2 || na6Var.m15357s() > 65535) {
                        this.f25143a.mo3895i().m14155w().m20651c("Invalid sampling rate. Event name, sample rate", na6Var.m15355u(), Integer.valueOf(na6Var.m15357s()));
                    } else {
                        c1370g63.put(na6Var.m15355u(), Integer.valueOf(na6Var.m15357s()));
                    }
                }
            }
        }
        this.f11275e.put(str, hashSet);
        this.f11276f.put(str, c1370g6);
        this.f11277g.put(str, c1370g62);
        this.f11279i.put(str, c1370g63);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0122: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:36:0x0122 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21617n(String str) {
        SQLiteException e;
        Cursor cursor;
        Cursor cursor2;
        ge2 ge2Var;
        Map map;
        m13533g();
        mo6991f();
        ry0.m10834f(str);
        if (this.f11278h.get(str) == null) {
            uh2 m3915W = this.f19771b.m3915W();
            ry0.m10834f(str);
            m3915W.mo6991f();
            m3915W.m13533g();
            Cursor cursor3 = null;
            String str2 = null;
            try {
                try {
                    cursor = m3915W.m8168P().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                    try {
                    } catch (SQLiteException e2) {
                        e = e2;
                        m3915W.f25143a.mo3895i().m14160q().m20651c("Error querying remote config. appId", om5.m14152z(str), e);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor3 != null) {
                }
                throw th;
            }
            if (cursor.moveToFirst()) {
                byte[] blob = cursor.getBlob(0);
                String string = cursor.getString(1);
                String string2 = m3915W.f25143a.m24020z().m12677B(null, m75.f18552q0) ? cursor.getString(2) : null;
                if (cursor.moveToNext()) {
                    m3915W.f25143a.mo3895i().m14160q().m20652b("Got multiple records for app config, expected one. appId", om5.m14152z(str));
                }
                if (blob != null) {
                    ge2Var = new ge2(blob, string, string2);
                    cursor.close();
                    if (ge2Var != null) {
                        this.f11274d.put(str, null);
                        this.f11276f.put(str, null);
                        this.f11275e.put(str, null);
                        this.f11277g.put(str, null);
                        this.f11278h.put(str, null);
                        this.f11282l.put(str, null);
                        this.f11283m.put(str, null);
                        this.f11284n.put(str, null);
                        map = this.f11279i;
                    } else {
                        tc6 tc6Var = (tc6) m21619l(str, ge2Var.f11121a).m18675A();
                        m21618m(str, tc6Var);
                        this.f11274d.put(str, m21615p((wd6) tc6Var.m3975m()));
                        this.f11278h.put(str, (wd6) tc6Var.m3975m());
                        m21616o(str, (wd6) tc6Var.m3975m());
                        this.f11282l.put(str, tc6Var.m9308w());
                        this.f11283m.put(str, ge2Var.f11122b);
                        map = this.f11284n;
                        str2 = ge2Var.f11123c;
                    }
                    map.put(str, str2);
                }
            }
            cursor.close();
            ge2Var = null;
            if (ge2Var != null) {
            }
            map.put(str, str2);
        }
    }

    /* renamed from: o */
    public final void m21616o(final String str, wd6 wd6Var) {
        if (wd6Var.m6153D() == 0) {
            this.f11280j.m6021e(str);
            return;
        }
        this.f25143a.mo3895i().m14156v().m20652b("EES programs found", Integer.valueOf(wd6Var.m6153D()));
        rm7 rm7Var = (rm7) wd6Var.m6142O().get(0);
        try {
            tr3 tr3Var = new tr3();
            tr3Var.m8852d("internal.remoteConfig", new Callable() { // from class: com.daaw.oa6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new vh8("internal.remoteConfig", new dg6(gh6.this, str));
                }
            });
            tr3Var.m8852d("internal.appMetadata", new Callable() { // from class: com.daaw.rb6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final gh6 gh6Var = gh6.this;
                    final String str2 = str;
                    return new qt8("internal.appMetadata", new Callable() { // from class: com.daaw.l96
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            gh6 gh6Var2 = gh6.this;
                            String str3 = str2;
                            qu7 m8166R = gh6Var2.f19771b.m3915W().m8166R(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            gh6Var2.f25143a.m24020z().m12661p();
                            hashMap.put("gmp_version", 74029L);
                            if (m8166R != null) {
                                String m12163g0 = m8166R.m12163g0();
                                if (m12163g0 != null) {
                                    hashMap.put("app_version", m12163g0);
                                }
                                hashMap.put("app_version_int", Long.valueOf(m8166R.m12191L()));
                                hashMap.put("dynamite_version", Long.valueOf(m8166R.m12182U()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            tr3Var.m8852d("internal.logger", new Callable() { // from class: com.daaw.uc6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new js8(gh6.this.f11281k);
                }
            });
            tr3Var.m8853c(rm7Var);
            this.f11280j.m6022d(str, tr3Var);
            this.f25143a.mo3895i().m14156v().m20651c("EES program loaded for appId, activities", str, Integer.valueOf(rm7Var.m11177D().m22619D()));
            for (lk7 lk7Var : rm7Var.m11177D().m22616G()) {
                this.f25143a.mo3895i().m14156v().m20652b("EES program activity", lk7Var.m16890E());
            }
        } catch (sk4 unused) {
            this.f25143a.mo3895i().m14160q().m20652b("Failed to load EES program. appId", str);
        }
    }

    /* renamed from: q */
    public final int m21614q(String str, String str2) {
        Integer num;
        mo6991f();
        m21617n(str);
        Map map = (Map) this.f11279i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: t */
    public final wd6 m21612t(String str) {
        m13533g();
        mo6991f();
        ry0.m10834f(str);
        m21617n(str);
        return (wd6) this.f11278h.get(str);
    }

    /* renamed from: u */
    public final String m21611u(String str) {
        mo6991f();
        return (String) this.f11284n.get(str);
    }

    /* renamed from: v */
    public final String m21610v(String str) {
        mo6991f();
        return (String) this.f11283m.get(str);
    }

    /* renamed from: w */
    public final String m21609w(String str) {
        mo6991f();
        m21617n(str);
        return (String) this.f11282l.get(str);
    }

    /* renamed from: y */
    public final Set m21607y(String str) {
        mo6991f();
        m21617n(str);
        return (Set) this.f11275e.get(str);
    }

    /* renamed from: z */
    public final void m21606z(String str) {
        mo6991f();
        this.f11283m.put(str, null);
    }
}
