package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class qa2 extends rc7 {

    /* renamed from: b */
    public Boolean f23807b;

    /* renamed from: c */
    public i92 f23808c;

    /* renamed from: d */
    public Boolean f23809d;

    public qa2(dr6 dr6Var) {
        super(dr6Var);
        this.f23808c = new i92() { // from class: com.daaw.b82
            @Override // com.daaw.i92
            /* renamed from: c */
            public final String mo20012c(String str, String str2) {
                return null;
            }
        };
    }

    /* renamed from: I */
    public static final long m12670I() {
        return ((Long) m75.f18527e.m18786a(null)).longValue();
    }

    /* renamed from: g */
    public static final long m12669g() {
        return ((Long) m75.f18497E.m18786a(null)).longValue();
    }

    /* renamed from: A */
    public final boolean m12678A() {
        Boolean m12658t = m12658t("google_analytics_adid_collection_enabled");
        return m12658t == null || m12658t.booleanValue();
    }

    /* renamed from: B */
    public final boolean m12677B(String str, j65 j65Var) {
        Object m18786a;
        if (str != null) {
            String mo20012c = this.f23808c.mo20012c(str, j65Var.m18785b());
            if (!TextUtils.isEmpty(mo20012c)) {
                m18786a = j65Var.m18786a(Boolean.valueOf("1".equals(mo20012c)));
                return ((Boolean) m18786a).booleanValue();
            }
        }
        m18786a = j65Var.m18786a(null);
        return ((Boolean) m18786a).booleanValue();
    }

    /* renamed from: C */
    public final boolean m12676C(String str) {
        return "1".equals(this.f23808c.mo20012c(str, "gaia_collection_enabled"));
    }

    /* renamed from: D */
    public final boolean m12675D() {
        Boolean m12658t = m12658t("google_analytics_automatic_screen_reporting_enabled");
        return m12658t == null || m12658t.booleanValue();
    }

    /* renamed from: E */
    public final boolean m12674E() {
        this.f25143a.mo3911a();
        Boolean m12658t = m12658t("firebase_analytics_collection_deactivated");
        return m12658t != null && m12658t.booleanValue();
    }

    /* renamed from: F */
    public final boolean m12673F(String str) {
        return "1".equals(this.f23808c.mo20012c(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: G */
    public final boolean m12672G() {
        if (this.f23807b == null) {
            Boolean m12658t = m12658t("app_measurement_lite");
            this.f23807b = m12658t;
            if (m12658t == null) {
                this.f23807b = Boolean.FALSE;
            }
        }
        return this.f23807b.booleanValue() || !this.f25143a.m24027s();
    }

    @EnsuresNonNull({"this.isMainProcess"})
    /* renamed from: H */
    public final boolean m12671H() {
        if (this.f23809d == null) {
            synchronized (this) {
                if (this.f23809d == null) {
                    ApplicationInfo applicationInfo = this.f25143a.mo3905d().getApplicationInfo();
                    String m20322a = hz0.m20322a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        boolean z = false;
                        if (str != null && str.equals(m20322a)) {
                            z = true;
                        }
                        this.f23809d = Boolean.valueOf(z);
                    }
                    if (this.f23809d == null) {
                        this.f23809d = Boolean.TRUE;
                        this.f25143a.mo3895i().m14160q().m20653a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f23809d.booleanValue();
    }

    /* renamed from: h */
    public final String m12668h(String str, String str2) {
        hk5 m14160q;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            ry0.m10830j(str4);
            return str4;
        } catch (ClassNotFoundException e) {
            e = e;
            m14160q = this.f25143a.mo3895i().m14160q();
            str3 = "Could not find SystemProperties class";
            m14160q.m20652b(str3, e);
            return "";
        } catch (IllegalAccessException e2) {
            e = e2;
            m14160q = this.f25143a.mo3895i().m14160q();
            str3 = "Could not access SystemProperties.get()";
            m14160q.m20652b(str3, e);
            return "";
        } catch (NoSuchMethodException e3) {
            e = e3;
            m14160q = this.f25143a.mo3895i().m14160q();
            str3 = "Could not find SystemProperties.get() method";
            m14160q.m20652b(str3, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            m14160q = this.f25143a.mo3895i().m14160q();
            str3 = "SystemProperties.get() threw an exception";
            m14160q.m20652b(str3, e);
            return "";
        }
    }

    /* renamed from: j */
    public final double m12667j(String str, j65 j65Var) {
        if (str != null) {
            String mo20012c = this.f23808c.mo20012c(str, j65Var.m18785b());
            if (!TextUtils.isEmpty(mo20012c)) {
                try {
                    return ((Double) j65Var.m18786a(Double.valueOf(Double.parseDouble(mo20012c)))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Double) j65Var.m18786a(null)).doubleValue();
    }

    /* renamed from: k */
    public final int m12666k(String str) {
        return m12662o(str, m75.f18501I, 500, 2000);
    }

    /* renamed from: l */
    public final int m12665l() {
        dd8 m24045N = this.f25143a.m24045N();
        Boolean m5474J = m24045N.f25143a.m24047L().m5474J();
        if (m24045N.m24472o0() < 201500) {
            return (m5474J == null || m5474J.booleanValue()) ? 25 : 100;
        }
        return 100;
    }

    /* renamed from: m */
    public final int m12664m(String str) {
        return m12662o(str, m75.f18502J, 25, 100);
    }

    /* renamed from: n */
    public final int m12663n(String str, j65 j65Var) {
        if (str != null) {
            String mo20012c = this.f23808c.mo20012c(str, j65Var.m18785b());
            if (!TextUtils.isEmpty(mo20012c)) {
                try {
                    return ((Integer) j65Var.m18786a(Integer.valueOf(Integer.parseInt(mo20012c)))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Integer) j65Var.m18786a(null)).intValue();
    }

    /* renamed from: o */
    public final int m12662o(String str, j65 j65Var, int i, int i2) {
        return Math.max(Math.min(m12663n(str, j65Var), i2), i);
    }

    /* renamed from: p */
    public final long m12661p() {
        this.f25143a.mo3911a();
        return 74029L;
    }

    /* renamed from: q */
    public final long m12660q(String str, j65 j65Var) {
        if (str != null) {
            String mo20012c = this.f23808c.mo20012c(str, j65Var.m18785b());
            if (!TextUtils.isEmpty(mo20012c)) {
                try {
                    return ((Long) j65Var.m18786a(Long.valueOf(Long.parseLong(mo20012c)))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return ((Long) j65Var.m18786a(null)).longValue();
    }

    /* renamed from: s */
    public final Bundle m12659s() {
        try {
            if (this.f25143a.mo3905d().getPackageManager() == null) {
                this.f25143a.mo3895i().m14160q().m20653a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m19344c = ez1.m22979a(this.f25143a.mo3905d()).m19344c(this.f25143a.mo3905d().getPackageName(), 128);
            if (m19344c == null) {
                this.f25143a.mo3895i().m14160q().m20653a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return m19344c.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            this.f25143a.mo3895i().m14160q().m20652b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    /* renamed from: t */
    public final Boolean m12658t(String str) {
        ry0.m10834f(str);
        Bundle m12659s = m12659s();
        if (m12659s == null) {
            this.f25143a.mo3895i().m14160q().m20653a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (m12659s.containsKey(str)) {
            return Boolean.valueOf(m12659s.getBoolean(str));
        } else {
            return null;
        }
    }

    /* renamed from: u */
    public final String m12657u() {
        return m12668h("debug.firebase.analytics.app", "");
    }

    /* renamed from: v */
    public final String m12656v() {
        return m12668h("debug.deferred.deeplink", "");
    }

    /* renamed from: w */
    public final String m12655w() {
        this.f25143a.mo3911a();
        return "FA";
    }

    /* renamed from: x */
    public final String m12654x(String str, j65 j65Var) {
        return (String) j65Var.m18786a(str == null ? null : this.f23808c.mo20012c(str, j65Var.m18785b()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m12653y(String str) {
        Integer valueOf;
        ry0.m10834f("analytics.safelisted_events");
        Bundle m12659s = m12659s();
        if (m12659s == null) {
            this.f25143a.mo3895i().m14160q().m20653a("Failed to load metadata: Metadata bundle is null");
        } else if (m12659s.containsKey("analytics.safelisted_events")) {
            valueOf = Integer.valueOf(m12659s.getInt("analytics.safelisted_events"));
            if (valueOf != null) {
                try {
                    String[] stringArray = this.f25143a.mo3905d().getResources().getStringArray(valueOf.intValue());
                    if (stringArray == null) {
                        return null;
                    }
                    return Arrays.asList(stringArray);
                } catch (Resources.NotFoundException e) {
                    this.f25143a.mo3895i().m14160q().m20652b("Failed to load string array from metadata: resource not found", e);
                }
            }
            return null;
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return null;
    }

    /* renamed from: z */
    public final void m12652z(i92 i92Var) {
        this.f23808c = i92Var;
    }
}
