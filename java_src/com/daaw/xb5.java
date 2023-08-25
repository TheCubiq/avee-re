package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzq;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes.dex */
public final class xb5 extends c86 {

    /* renamed from: c */
    public String f32327c;

    /* renamed from: d */
    public String f32328d;

    /* renamed from: e */
    public int f32329e;

    /* renamed from: f */
    public String f32330f;

    /* renamed from: g */
    public String f32331g;

    /* renamed from: h */
    public long f32332h;

    /* renamed from: i */
    public final long f32333i;

    /* renamed from: j */
    public List f32334j;

    /* renamed from: k */
    public String f32335k;

    /* renamed from: l */
    public int f32336l;

    /* renamed from: m */
    public String f32337m;

    /* renamed from: n */
    public String f32338n;

    /* renamed from: o */
    public String f32339o;

    /* renamed from: p */
    public long f32340p;

    /* renamed from: q */
    public String f32341q;

    public xb5(dr6 dr6Var, long j) {
        super(dr6Var);
        this.f32340p = 0L;
        this.f32341q = null;
        this.f32333i = j;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(1:3)(6:64|65|(1:67)(2:82|(1:84))|68|69|(20:71|(1:73)(1:80)|75|76|5|(1:63)(1:9)|10|11|13|(1:15)|16|17|(1:19)|20|(3:22|(1:24)(1:26)|25)|(3:28|(1:30)(1:33)|31)|34|(3:36|(1:38)(3:45|(3:48|(1:50)|46)|51)|(2:40|41)(2:43|44))|52|(0)(0)))|4|5|(1:7)|63|10|11|13|(0)|16|17|(0)|20|(0)|(0)|34|(0)|52|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0192, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0193, code lost:
        r11.f25143a.mo3895i().m14160q().m20651c("Fetching Google App Id failed with exception. appId", com.daaw.om5.m14152z(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b A[Catch: IllegalStateException -> 0x0192, TryCatch #0 {IllegalStateException -> 0x0192, blocks: (B:46:0x012a, B:49:0x0143, B:51:0x014b, B:55:0x0169, B:54:0x0165, B:57:0x0173, B:59:0x0189, B:61:0x018e, B:60:0x018c), top: B:83:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0173 A[Catch: IllegalStateException -> 0x0192, TryCatch #0 {IllegalStateException -> 0x0192, blocks: (B:46:0x012a, B:49:0x0143, B:51:0x014b, B:55:0x0169, B:54:0x0165, B:57:0x0173, B:59:0x0189, B:61:0x018e, B:60:0x018c), top: B:83:0x012a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0203  */
    @Override // com.daaw.c86
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo5307k() {
        String str;
        String str2;
        PackageInfo packageInfo;
        boolean z;
        int m24022x;
        hk5 m14156v;
        String str3;
        List<String> m12653y;
        String m12789b;
        String packageName = this.f25143a.mo3905d().getPackageName();
        PackageManager packageManager = this.f25143a.mo3905d().getPackageManager();
        String str4 = "Unknown";
        int i = Integer.MIN_VALUE;
        String str5 = "unknown";
        if (packageManager == null) {
            this.f25143a.mo3895i().m14160q().m20652b("PackageManager is null, app identity information might be inaccurate. appId", om5.m14152z(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.f25143a.mo3895i().m14160q().m20652b("Error retrieving app installer package name. appId", om5.m14152z(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.f25143a.mo3905d().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = "Unknown";
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                try {
                    str4 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.f25143a.mo3895i().m14160q().m20651c("Error retrieving package info. appId, appName", om5.m14152z(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.f32327c = packageName;
                    this.f32330f = str5;
                    this.f32328d = str4;
                    this.f32329e = i;
                    this.f32331g = str2;
                    this.f32332h = 0L;
                    if (TextUtils.isEmpty(this.f25143a.m24044O())) {
                    }
                    m24022x = this.f25143a.m24022x();
                    om5 mo3895i = this.f25143a.mo3895i();
                    switch (m24022x) {
                    }
                    m14156v.m20653a(str3);
                    this.f32337m = "";
                    this.f32338n = "";
                    this.f25143a.mo3911a();
                    if (z) {
                    }
                    m12789b = q38.m12789b(this.f25143a.mo3905d(), "google_app_id", this.f25143a.m24041R());
                    this.f32337m = true != TextUtils.isEmpty(m12789b) ? m12789b : "";
                    if (!TextUtils.isEmpty(m12789b)) {
                    }
                    if (m24022x == 0) {
                    }
                    this.f32334j = null;
                    this.f25143a.mo3911a();
                    m12653y = this.f25143a.m24020z().m12653y("analytics.safelisted_events");
                    if (m12653y != null) {
                    }
                    this.f32334j = m12653y;
                    if (packageManager == null) {
                    }
                }
                this.f32327c = packageName;
                this.f32330f = str5;
                this.f32328d = str4;
                this.f32329e = i;
                this.f32331g = str2;
                this.f32332h = 0L;
                z = TextUtils.isEmpty(this.f25143a.m24044O()) && "am".equals(this.f25143a.m24043P());
                m24022x = this.f25143a.m24022x();
                om5 mo3895i2 = this.f25143a.mo3895i();
                switch (m24022x) {
                    case 0:
                        m14156v = mo3895i2.m14156v();
                        str3 = "App measurement collection enabled";
                        break;
                    case 1:
                        m14156v = mo3895i2.m14157u();
                        str3 = "App measurement deactivated via the manifest";
                        break;
                    case 2:
                        m14156v = mo3895i2.m14156v();
                        str3 = "App measurement deactivated via the init parameters";
                        break;
                    case 3:
                        m14156v = mo3895i2.m14157u();
                        str3 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
                        break;
                    case 4:
                        m14156v = mo3895i2.m14157u();
                        str3 = "App measurement disabled via the manifest";
                        break;
                    case 5:
                        m14156v = mo3895i2.m14156v();
                        str3 = "App measurement disabled via the init parameters";
                        break;
                    case 6:
                        m14156v = mo3895i2.m14154x();
                        str3 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
                        break;
                    case 7:
                        m14156v = mo3895i2.m14157u();
                        str3 = "App measurement disabled via the global data collection setting";
                        break;
                    default:
                        m14156v = mo3895i2.m14157u();
                        str3 = "App measurement disabled due to denied storage consent";
                        break;
                }
                m14156v.m20653a(str3);
                this.f32337m = "";
                this.f32338n = "";
                this.f25143a.mo3911a();
                if (z) {
                    this.f32338n = this.f25143a.m24044O();
                }
                m12789b = q38.m12789b(this.f25143a.mo3905d(), "google_app_id", this.f25143a.m24041R());
                this.f32337m = true != TextUtils.isEmpty(m12789b) ? m12789b : "";
                if (!TextUtils.isEmpty(m12789b)) {
                    Context mo3905d = this.f25143a.mo3905d();
                    String m24041R = this.f25143a.m24041R();
                    ry0.m10830j(mo3905d);
                    Resources resources = mo3905d.getResources();
                    if (TextUtils.isEmpty(m24041R)) {
                        m24041R = ji6.m18489a(mo3905d);
                    }
                    this.f32338n = ji6.m18488b("admob_app_id", resources, m24041R);
                }
                if (m24022x == 0) {
                    this.f25143a.mo3895i().m14156v().m20651c("App measurement enabled for app package, google app id", this.f32327c, TextUtils.isEmpty(this.f32337m) ? this.f32338n : this.f32337m);
                }
                this.f32334j = null;
                this.f25143a.mo3911a();
                m12653y = this.f25143a.m24020z().m12653y("analytics.safelisted_events");
                if (m12653y != null) {
                    if (m12653y.isEmpty()) {
                        this.f25143a.mo3895i().m14154x().m20653a("Safelisted event list is empty. Ignoring");
                    } else {
                        for (String str6 : m12653y) {
                            if (!this.f25143a.m24045N().m24498Q("safelisted event", str6)) {
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.f32336l = lg0.m16965a(this.f25143a.mo3905d()) ? 1 : 0;
                        return;
                    } else {
                        this.f32336l = 0;
                        return;
                    }
                }
                this.f32334j = m12653y;
                if (packageManager == null) {
                }
            }
        }
        str2 = "Unknown";
        this.f32327c = packageName;
        this.f32330f = str5;
        this.f32328d = str4;
        this.f32329e = i;
        this.f32331g = str2;
        this.f32332h = 0L;
        if (TextUtils.isEmpty(this.f25143a.m24044O())) {
        }
        m24022x = this.f25143a.m24022x();
        om5 mo3895i22 = this.f25143a.mo3895i();
        switch (m24022x) {
        }
        m14156v.m20653a(str3);
        this.f32337m = "";
        this.f32338n = "";
        this.f25143a.mo3911a();
        if (z) {
        }
        m12789b = q38.m12789b(this.f25143a.mo3905d(), "google_app_id", this.f25143a.m24041R());
        this.f32337m = true != TextUtils.isEmpty(m12789b) ? m12789b : "";
        if (!TextUtils.isEmpty(m12789b)) {
        }
        if (m24022x == 0) {
        }
        this.f32334j = null;
        this.f25143a.mo3911a();
        m12653y = this.f25143a.m24020z().m12653y("analytics.safelisted_events");
        if (m12653y != null) {
        }
        this.f32334j = m12653y;
        if (packageManager == null) {
        }
    }

    @Override // com.daaw.c86
    /* renamed from: m */
    public final boolean mo5306m() {
        return true;
    }

    /* renamed from: n */
    public final int m5305n() {
        m25515g();
        return this.f32336l;
    }

    /* renamed from: o */
    public final int m5304o() {
        m25515g();
        return this.f32329e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0269  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzq m5303p(String str) {
        String str2;
        Class<?> loadClass;
        hk5 m14153y;
        String str3;
        Object invoke;
        long m4400a;
        String str4;
        long min;
        Boolean m12658t;
        String str5;
        long j;
        String str6;
        String str7;
        mo6991f();
        String m5301s = m5301s();
        String m5300t = m5300t();
        m25515g();
        String str8 = this.f32328d;
        m25515g();
        long j2 = this.f32329e;
        m25515g();
        ry0.m10830j(this.f32330f);
        String str9 = this.f32330f;
        this.f25143a.m24020z().m12661p();
        m25515g();
        mo6991f();
        long j3 = this.f32332h;
        if (j3 == 0) {
            dd8 m24045N = this.f25143a.m24045N();
            Context mo3905d = this.f25143a.mo3905d();
            String packageName = this.f25143a.mo3905d().getPackageName();
            m24045N.mo6991f();
            ry0.m10830j(mo3905d);
            ry0.m10834f(packageName);
            PackageManager packageManager = mo3905d.getPackageManager();
            MessageDigest m24464t = dd8.m24464t();
            long j4 = -1;
            if (m24464t == null) {
                m24045N.f25143a.mo3895i().m14160q().m20653a("Could not get MD5 instance");
            } else {
                if (packageManager != null) {
                    try {
                        if (m24045N.m24493V(mo3905d, packageName)) {
                            j4 = 0;
                            m24045N = m24045N;
                        } else {
                            Signature[] signatureArr = ez1.m22979a(mo3905d).m19341f(m24045N.f25143a.mo3905d().getPackageName(), 64).signatures;
                            if (signatureArr == null || signatureArr.length <= 0) {
                                m24045N.f25143a.mo3895i().m14155w().m20653a("Could not get signatures");
                                m24045N = m24045N;
                            } else {
                                long m24468q0 = dd8.m24468q0(m24464t.digest(signatureArr[0].toByteArray()));
                                j4 = m24468q0;
                                m24045N = m24468q0;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        m24045N.f25143a.mo3895i().m14160q().m20652b("Package name not found", e);
                    }
                }
                j3 = 0;
                this.f32332h = j3;
            }
            j3 = j4;
            this.f32332h = j3;
        }
        long j5 = j3;
        boolean m24031n = this.f25143a.m24031n();
        boolean z = !this.f25143a.m24053F().f17015q;
        mo6991f();
        if (this.f25143a.m24031n()) {
            kn8.m17638b();
            if (this.f25143a.m24020z().m12677B(null, m75.f18524c0)) {
                this.f25143a.mo3895i().m14156v().m20653a("Disabled IID for tests.");
            } else {
                try {
                    loadClass = this.f25143a.mo3905d().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, this.f25143a.mo3905d());
                    } catch (Exception unused2) {
                        m14153y = this.f25143a.mo3895i().m14153y();
                        str3 = "Failed to obtain Firebase Analytics instance";
                    }
                    if (invoke != null) {
                        try {
                            str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (Exception unused3) {
                            m14153y = this.f25143a.mo3895i().m14154x();
                            str3 = "Failed to retrieve Firebase Instance Id";
                            m14153y.m20653a(str3);
                            str2 = null;
                            dr6 dr6Var = this.f25143a;
                            m4400a = dr6Var.m24053F().f17003e.m4400a();
                            if (m4400a != 0) {
                            }
                            m25515g();
                            int i = this.f32336l;
                            boolean m12678A = this.f25143a.m24020z().m12678A();
                            l36 m24053F = this.f25143a.m24053F();
                            m24053F.mo6991f();
                            boolean z2 = m24053F.m17176n().getBoolean("deferred_analytics_collection", false);
                            m25515g();
                            String str10 = this.f32338n;
                            if (this.f25143a.m24020z().m12658t("google_analytics_default_allow_ad_personalization_signals") != null) {
                            }
                            long j6 = this.f32333i;
                            List list = this.f32334j;
                            String m25424h = this.f25143a.m24053F().m17174p().m25424h();
                            if (this.f32335k != null) {
                            }
                            String str11 = this.f32335k;
                            zm8.m2111b();
                            if (this.f25143a.m24020z().m12677B(null, m75.f18548o0)) {
                            }
                            return new zzq(str4, m5300t, str8, j2, str9, 74029L, j5, str, m24031n, z, str2, 0L, min, i, m12678A, z2, str5, r26, j, list, (String) null, m25424h, str6, str7);
                        }
                        dr6 dr6Var2 = this.f25143a;
                        m4400a = dr6Var2.m24053F().f17003e.m4400a();
                        if (m4400a != 0) {
                            str4 = m5301s;
                            min = dr6Var2.f7665G;
                        } else {
                            str4 = m5301s;
                            min = Math.min(dr6Var2.f7665G, m4400a);
                        }
                        m25515g();
                        int i2 = this.f32336l;
                        boolean m12678A2 = this.f25143a.m24020z().m12678A();
                        l36 m24053F2 = this.f25143a.m24053F();
                        m24053F2.mo6991f();
                        boolean z22 = m24053F2.m17176n().getBoolean("deferred_analytics_collection", false);
                        m25515g();
                        String str102 = this.f32338n;
                        Boolean valueOf = this.f25143a.m24020z().m12658t("google_analytics_default_allow_ad_personalization_signals") != null ? null : Boolean.valueOf(!m12658t.booleanValue());
                        long j62 = this.f32333i;
                        List list2 = this.f32334j;
                        String m25424h2 = this.f25143a.m24053F().m17174p().m25424h();
                        if (this.f32335k != null) {
                            str5 = str102;
                            j = j62;
                            this.f32335k = this.f25143a.m24020z().m12677B(null, m75.f18554r0) ? this.f25143a.m24045N().m24471p() : "";
                        } else {
                            str5 = str102;
                            j = j62;
                        }
                        String str112 = this.f32335k;
                        zm8.m2111b();
                        if (this.f25143a.m24020z().m12677B(null, m75.f18548o0)) {
                            str6 = str112;
                            str7 = null;
                        } else {
                            mo6991f();
                            if (this.f32340p == 0) {
                                str6 = str112;
                            } else {
                                str6 = str112;
                                long mo15860a = this.f25143a.mo3909b().mo15860a() - this.f32340p;
                                if (this.f32339o != null && mo15860a > 86400000 && this.f32341q == null) {
                                    m5298v();
                                }
                            }
                            if (this.f32339o == null) {
                                m5298v();
                            }
                            str7 = this.f32339o;
                        }
                        return new zzq(str4, m5300t, str8, j2, str9, 74029L, j5, str, m24031n, z, str2, 0L, min, i2, m12678A2, z22, str5, valueOf, j, list2, (String) null, m25424h2, str6, str7);
                    }
                    str2 = null;
                    dr6 dr6Var22 = this.f25143a;
                    m4400a = dr6Var22.m24053F().f17003e.m4400a();
                    if (m4400a != 0) {
                    }
                    m25515g();
                    int i22 = this.f32336l;
                    boolean m12678A22 = this.f25143a.m24020z().m12678A();
                    l36 m24053F22 = this.f25143a.m24053F();
                    m24053F22.mo6991f();
                    boolean z222 = m24053F22.m17176n().getBoolean("deferred_analytics_collection", false);
                    m25515g();
                    String str1022 = this.f32338n;
                    if (this.f25143a.m24020z().m12658t("google_analytics_default_allow_ad_personalization_signals") != null) {
                    }
                    long j622 = this.f32333i;
                    List list22 = this.f32334j;
                    String m25424h22 = this.f25143a.m24053F().m17174p().m25424h();
                    if (this.f32335k != null) {
                    }
                    String str1122 = this.f32335k;
                    zm8.m2111b();
                    if (this.f25143a.m24020z().m12677B(null, m75.f18548o0)) {
                    }
                    return new zzq(str4, m5300t, str8, j2, str9, 74029L, j5, str, m24031n, z, str2, 0L, min, i22, m12678A22, z222, str5, valueOf, j, list22, (String) null, m25424h22, str6, str7);
                }
            }
        }
        str2 = null;
        dr6 dr6Var222 = this.f25143a;
        m4400a = dr6Var222.m24053F().f17003e.m4400a();
        if (m4400a != 0) {
        }
        m25515g();
        int i222 = this.f32336l;
        boolean m12678A222 = this.f25143a.m24020z().m12678A();
        l36 m24053F222 = this.f25143a.m24053F();
        m24053F222.mo6991f();
        boolean z2222 = m24053F222.m17176n().getBoolean("deferred_analytics_collection", false);
        m25515g();
        String str10222 = this.f32338n;
        if (this.f25143a.m24020z().m12658t("google_analytics_default_allow_ad_personalization_signals") != null) {
        }
        long j6222 = this.f32333i;
        List list222 = this.f32334j;
        String m25424h222 = this.f25143a.m24053F().m17174p().m25424h();
        if (this.f32335k != null) {
        }
        String str11222 = this.f32335k;
        zm8.m2111b();
        if (this.f25143a.m24020z().m12677B(null, m75.f18548o0)) {
        }
        return new zzq(str4, m5300t, str8, j2, str9, 74029L, j5, str, m24031n, z, str2, 0L, min, i222, m12678A222, z2222, str5, valueOf, j, list222, (String) null, m25424h222, str6, str7);
    }

    /* renamed from: q */
    public final String m5302q() {
        m25515g();
        return this.f32338n;
    }

    /* renamed from: s */
    public final String m5301s() {
        m25515g();
        ry0.m10830j(this.f32327c);
        return this.f32327c;
    }

    /* renamed from: t */
    public final String m5300t() {
        mo6991f();
        m25515g();
        ry0.m10830j(this.f32337m);
        return this.f32337m;
    }

    /* renamed from: u */
    public final List m5299u() {
        return this.f32334j;
    }

    /* renamed from: v */
    public final void m5298v() {
        String format;
        mo6991f();
        if (this.f25143a.m24053F().m17174p().m25423i(vb2.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            this.f25143a.m24045N().m24462u().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            this.f25143a.mo3895i().m14161p().m20653a("Analytics Storage consent is not granted");
            format = null;
        }
        hk5 m14161p = this.f25143a.mo3895i().m14161p();
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        m14161p.m20653a(String.format("Resetting session stitching token to %s", objArr));
        this.f32339o = format;
        this.f32340p = this.f25143a.mo3909b().mo15860a();
    }

    /* renamed from: w */
    public final boolean m5297w(String str) {
        String str2 = this.f32341q;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.f32341q = str;
        return z;
    }
}
