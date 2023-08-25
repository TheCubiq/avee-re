package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class qa2 extends rc7 {
    public Boolean b;
    public i92 c;
    public Boolean d;

    public qa2(dr6 dr6Var) {
        super(dr6Var);
        this.c = new i92() { // from class: com.daaw.b82
            @Override // com.daaw.i92
            public final String c(String str, String str2) {
                return null;
            }
        };
    }

    public static final long I() {
        return ((Long) m75.e.a(null)).longValue();
    }

    public static final long g() {
        return ((Long) m75.E.a(null)).longValue();
    }

    public final boolean A() {
        Boolean t = t("google_analytics_adid_collection_enabled");
        return t == null || t.booleanValue();
    }

    public final boolean B(String str, j65 j65Var) {
        Object a;
        if (str != null) {
            String c = this.c.c(str, j65Var.b());
            if (!TextUtils.isEmpty(c)) {
                a = j65Var.a(Boolean.valueOf("1".equals(c)));
                return ((Boolean) a).booleanValue();
            }
        }
        a = j65Var.a(null);
        return ((Boolean) a).booleanValue();
    }

    public final boolean C(String str) {
        return "1".equals(this.c.c(str, "gaia_collection_enabled"));
    }

    public final boolean D() {
        Boolean t = t("google_analytics_automatic_screen_reporting_enabled");
        return t == null || t.booleanValue();
    }

    public final boolean E() {
        this.a.a();
        Boolean t = t("firebase_analytics_collection_deactivated");
        return t != null && t.booleanValue();
    }

    public final boolean F(String str) {
        return "1".equals(this.c.c(str, "measurement.event_sampling_enabled"));
    }

    public final boolean G() {
        if (this.b == null) {
            Boolean t = t("app_measurement_lite");
            this.b = t;
            if (t == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.s();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    public final boolean H() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = this.a.d().getApplicationInfo();
                    String a = hz0.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(a)) {
                            z = true;
                        }
                        this.d = Boolean.valueOf(z);
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        this.a.i().q().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public final String h(String str, String str2) {
        hk5 q;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            ry0.j(str4);
            return str4;
        } catch (ClassNotFoundException e) {
            e = e;
            q = this.a.i().q();
            str3 = "Could not find SystemProperties class";
            q.b(str3, e);
            return "";
        } catch (IllegalAccessException e2) {
            e = e2;
            q = this.a.i().q();
            str3 = "Could not access SystemProperties.get()";
            q.b(str3, e);
            return "";
        } catch (NoSuchMethodException e3) {
            e = e3;
            q = this.a.i().q();
            str3 = "Could not find SystemProperties.get() method";
            q.b(str3, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            q = this.a.i().q();
            str3 = "SystemProperties.get() threw an exception";
            q.b(str3, e);
            return "";
        }
    }

    public final double j(String str, j65 j65Var) {
        if (str != null) {
            String c = this.c.c(str, j65Var.b());
            if (!TextUtils.isEmpty(c)) {
                try {
                    return ((Double) j65Var.a(Double.valueOf(Double.parseDouble(c)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) j65Var.a(null)).doubleValue();
    }

    public final int k(String str) {
        return o(str, m75.I, 500, 2000);
    }

    public final int l() {
        dd8 N = this.a.N();
        Boolean J = N.a.L().J();
        if (N.o0() < 201500) {
            return (J == null || J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    public final int m(String str) {
        return o(str, m75.J, 25, 100);
    }

    public final int n(String str, j65 j65Var) {
        if (str != null) {
            String c = this.c.c(str, j65Var.b());
            if (!TextUtils.isEmpty(c)) {
                try {
                    return ((Integer) j65Var.a(Integer.valueOf(Integer.parseInt(c)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) j65Var.a(null)).intValue();
    }

    public final int o(String str, j65 j65Var, int i, int i2) {
        return Math.max(Math.min(n(str, j65Var), i2), i);
    }

    public final long p() {
        this.a.a();
        return 74029L;
    }

    public final long q(String str, j65 j65Var) {
        if (str != null) {
            String c = this.c.c(str, j65Var.b());
            if (!TextUtils.isEmpty(c)) {
                try {
                    return ((Long) j65Var.a(Long.valueOf(Long.parseLong(c)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) j65Var.a(null)).longValue();
    }

    public final Bundle s() {
        try {
            if (this.a.d().getPackageManager() == null) {
                this.a.i().q().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = ez1.a(this.a.d()).c(this.a.d().getPackageName(), 128);
            if (c == null) {
                this.a.i().q().a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return c.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            this.a.i().q().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final Boolean t(String str) {
        ry0.f(str);
        Bundle s = s();
        if (s == null) {
            this.a.i().q().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (s.containsKey(str)) {
            return Boolean.valueOf(s.getBoolean(str));
        } else {
            return null;
        }
    }

    public final String u() {
        return h("debug.firebase.analytics.app", "");
    }

    public final String v() {
        return h("debug.deferred.deeplink", "");
    }

    public final String w() {
        this.a.a();
        return "FA";
    }

    public final String x(String str, j65 j65Var) {
        return (String) j65Var.a(str == null ? null : this.c.c(str, j65Var.b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List y(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.daaw.ry0.f(r4)
            android.os.Bundle r0 = r3.s()
            r1 = 0
            if (r0 != 0) goto L1d
            com.daaw.dr6 r4 = r3.a
            com.daaw.om5 r4 = r4.i()
            com.daaw.hk5 r4 = r4.q()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            com.daaw.dr6 r0 = r3.a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.d()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            com.daaw.dr6 r0 = r3.a
            com.daaw.om5 r0 = r0.i()
            com.daaw.hk5 r0 = r0.q()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qa2.y(java.lang.String):java.util.List");
    }

    public final void z(i92 i92Var) {
        this.c = i92Var;
    }
}
