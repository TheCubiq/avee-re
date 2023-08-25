package com.daaw;

import android.content.ContentValues;
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
    public final Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final wl0 j;
    public final zp8 k;
    public final Map l;
    public final Map m;
    public final Map n;

    public gh6(yb8 yb8Var) {
        super(yb8Var);
        this.d = new g6();
        this.e = new g6();
        this.f = new g6();
        this.g = new g6();
        this.h = new g6();
        this.l = new g6();
        this.m = new g6();
        this.n = new g6();
        this.i = new g6();
        this.j = new xd6(this, 20);
        this.k = new af6(this);
    }

    public static final Map p(wd6 wd6Var) {
        g6 g6Var = new g6();
        if (wd6Var != null) {
            for (ii6 ii6Var : wd6Var.P()) {
                g6Var.put(ii6Var.E(), ii6Var.F());
            }
        }
        return g6Var;
    }

    public static /* bridge */ /* synthetic */ tr3 s(gh6 gh6Var, String str) {
        gh6Var.g();
        ry0.f(str);
        if (gh6Var.C(str)) {
            if (!gh6Var.h.containsKey(str) || gh6Var.h.get(str) == null) {
                gh6Var.n(str);
            } else {
                gh6Var.o(str, (wd6) gh6Var.h.get(str));
            }
            return (tr3) gh6Var.j.h().get(str);
        }
        return null;
    }

    public final void A(String str) {
        f();
        this.h.remove(str);
    }

    public final boolean B(String str) {
        f();
        wd6 t = t(str);
        if (t == null) {
            return false;
        }
        return t.S();
    }

    public final boolean C(String str) {
        wd6 wd6Var;
        return (TextUtils.isEmpty(str) || (wd6Var = (wd6) this.h.get(str)) == null || wd6Var.D() == 0) ? false : true;
    }

    public final boolean D(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean E(String str, String str2) {
        Boolean bool;
        f();
        n(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean F(String str, String str2) {
        Boolean bool;
        f();
        n(str);
        if (D(str) && dd8.W(str2)) {
            return true;
        }
        if (G(str) && dd8.X(str2)) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean G(String str) {
        return "1".equals(c(str, "measurement.upload.blacklist_public"));
    }

    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        g();
        f();
        ry0.f(str);
        tc6 tc6Var = (tc6) l(str, bArr).A();
        m(str, tc6Var);
        o(str, (wd6) tc6Var.m());
        this.h.put(str, (wd6) tc6Var.m());
        this.l.put(str, tc6Var.w());
        this.m.put(str, str2);
        this.n.put(str, str3);
        this.d.put(str, p((wd6) tc6Var.m()));
        this.b.W().m(str, new ArrayList(tc6Var.x()));
        try {
            tc6Var.u();
            bArr = ((wd6) tc6Var.m()).i();
        } catch (RuntimeException e) {
            this.a.i().w().c("Unable to serialize reduced-size config. Storing full config instead. appId", om5.z(str), e);
        }
        uh2 W = this.b.W();
        ry0.f(str);
        W.f();
        W.g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (W.a.z().B(null, m75.q0)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (W.P().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                W.a.i().q().b("Failed to update remote config (got 0). appId", om5.z(str));
            }
        } catch (SQLiteException e2) {
            W.a.i().q().c("Error storing remote config. appId", om5.z(str), e2);
        }
        this.h.put(str, (wd6) tc6Var.m());
        return true;
    }

    public final boolean I(String str) {
        f();
        n(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("app_instance_id");
    }

    public final boolean J(String str) {
        f();
        n(str);
        return this.e.get(str) != null && (((Set) this.e.get(str)).contains("device_model") || ((Set) this.e.get(str)).contains("device_info"));
    }

    public final boolean K(String str) {
        f();
        n(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("enhanced_user_id");
    }

    public final boolean L(String str) {
        f();
        n(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("google_signals");
    }

    public final boolean M(String str) {
        f();
        n(str);
        return this.e.get(str) != null && (((Set) this.e.get(str)).contains("os_version") || ((Set) this.e.get(str)).contains("device_info"));
    }

    public final boolean N(String str) {
        f();
        n(str);
        return this.e.get(str) != null && ((Set) this.e.get(str)).contains("user_id");
    }

    @Override // com.daaw.i92
    public final String c(String str, String str2) {
        f();
        n(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.daaw.pa8
    public final boolean k() {
        return false;
    }

    public final wd6 l(String str, byte[] bArr) {
        if (bArr == null) {
            return wd6.J();
        }
        try {
            wd6 wd6Var = (wd6) ((tc6) ec8.C(wd6.H(), bArr)).m();
            this.a.i().v().c("Parsed config. version, gmp_app_id", wd6Var.U() ? Long.valueOf(wd6Var.F()) : null, wd6Var.T() ? wd6Var.K() : null);
            return wd6Var;
        } catch (mb8 | RuntimeException e) {
            this.a.i().w().c("Unable to merge remote config. appId", om5.z(str), e);
            return wd6.J();
        }
    }

    public final void m(String str, tc6 tc6Var) {
        HashSet hashSet = new HashSet();
        g6 g6Var = new g6();
        g6 g6Var2 = new g6();
        g6 g6Var3 = new g6();
        for (k96 k96Var : tc6Var.y()) {
            hashSet.add(k96Var.E());
        }
        for (int i = 0; i < tc6Var.s(); i++) {
            na6 na6Var = (na6) tc6Var.t(i).A();
            if (na6Var.u().isEmpty()) {
                this.a.i().w().a("EventConfig contained null event name");
            } else {
                String u = na6Var.u();
                String b = dh7.b(na6Var.u());
                if (!TextUtils.isEmpty(b)) {
                    na6Var.t(b);
                    tc6Var.v(i, na6Var);
                }
                if (na6Var.x() && na6Var.v()) {
                    g6Var.put(u, Boolean.TRUE);
                }
                if (na6Var.y() && na6Var.w()) {
                    g6Var2.put(na6Var.u(), Boolean.TRUE);
                }
                if (na6Var.z()) {
                    if (na6Var.s() < 2 || na6Var.s() > 65535) {
                        this.a.i().w().c("Invalid sampling rate. Event name, sample rate", na6Var.u(), Integer.valueOf(na6Var.s()));
                    } else {
                        g6Var3.put(na6Var.u(), Integer.valueOf(na6Var.s()));
                    }
                }
            }
        }
        this.e.put(str, hashSet);
        this.f.put(str, g6Var);
        this.g.put(str, g6Var2);
        this.i.put(str, g6Var3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0122: MOVE  (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:36:0x0122 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.gh6.n(java.lang.String):void");
    }

    public final void o(final String str, wd6 wd6Var) {
        if (wd6Var.D() == 0) {
            this.j.e(str);
            return;
        }
        this.a.i().v().b("EES programs found", Integer.valueOf(wd6Var.D()));
        rm7 rm7Var = (rm7) wd6Var.O().get(0);
        try {
            tr3 tr3Var = new tr3();
            tr3Var.d("internal.remoteConfig", new Callable() { // from class: com.daaw.oa6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new vh8("internal.remoteConfig", new dg6(gh6.this, str));
                }
            });
            tr3Var.d("internal.appMetadata", new Callable() { // from class: com.daaw.rb6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final gh6 gh6Var = gh6.this;
                    final String str2 = str;
                    return new qt8("internal.appMetadata", new Callable() { // from class: com.daaw.l96
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            gh6 gh6Var2 = gh6.this;
                            String str3 = str2;
                            qu7 R = gh6Var2.b.W().R(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            gh6Var2.a.z().p();
                            hashMap.put("gmp_version", 74029L);
                            if (R != null) {
                                String g0 = R.g0();
                                if (g0 != null) {
                                    hashMap.put("app_version", g0);
                                }
                                hashMap.put("app_version_int", Long.valueOf(R.L()));
                                hashMap.put("dynamite_version", Long.valueOf(R.U()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            tr3Var.d("internal.logger", new Callable() { // from class: com.daaw.uc6
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new js8(gh6.this.k);
                }
            });
            tr3Var.c(rm7Var);
            this.j.d(str, tr3Var);
            this.a.i().v().c("EES program loaded for appId, activities", str, Integer.valueOf(rm7Var.D().D()));
            for (lk7 lk7Var : rm7Var.D().G()) {
                this.a.i().v().b("EES program activity", lk7Var.E());
            }
        } catch (sk4 unused) {
            this.a.i().q().b("Failed to load EES program. appId", str);
        }
    }

    public final int q(String str, String str2) {
        Integer num;
        f();
        n(str);
        Map map = (Map) this.i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final wd6 t(String str) {
        g();
        f();
        ry0.f(str);
        n(str);
        return (wd6) this.h.get(str);
    }

    public final String u(String str) {
        f();
        return (String) this.n.get(str);
    }

    public final String v(String str) {
        f();
        return (String) this.m.get(str);
    }

    public final String w(String str) {
        f();
        n(str);
        return (String) this.l.get(str);
    }

    public final Set y(String str) {
        f();
        n(str);
        return (Set) this.e.get(str);
    }

    public final void z(String str) {
        f();
        this.m.put(str, null);
    }
}
