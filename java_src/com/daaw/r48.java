package com.daaw;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class r48 extends c86 {

    /* renamed from: c */
    public volatile t38 f24846c;

    /* renamed from: d */
    public volatile t38 f24847d;

    /* renamed from: e */
    public t38 f24848e;

    /* renamed from: f */
    public final Map f24849f;

    /* renamed from: g */
    public Activity f24850g;

    /* renamed from: h */
    public volatile boolean f24851h;

    /* renamed from: i */
    public volatile t38 f24852i;

    /* renamed from: j */
    public t38 f24853j;

    /* renamed from: k */
    public boolean f24854k;

    /* renamed from: l */
    public final Object f24855l;

    public r48(dr6 dr6Var) {
        super(dr6Var);
        this.f24855l = new Object();
        this.f24849f = new ConcurrentHashMap();
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ void m11738w(r48 r48Var, Bundle bundle, t38 t38Var, t38 t38Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        r48Var.m11746n(t38Var, t38Var2, j, true, r48Var.f25143a.m24045N().m24459v0(null, "screen_view", bundle, null, false));
    }

    /* renamed from: A */
    public final void m11753A(Activity activity) {
        synchronized (this.f24855l) {
            this.f24854k = false;
            this.f24851h = true;
        }
        long mo15859b = this.f25143a.mo3909b().mo15859b();
        if (!this.f25143a.m24020z().m12675D()) {
            this.f24846c = null;
            this.f25143a.mo3882r().m6978z(new i48(this, mo15859b));
            return;
        }
        t38 m11748F = m11748F(activity);
        this.f24847d = this.f24846c;
        this.f24846c = null;
        this.f25143a.mo3882r().m6978z(new l48(this, m11748F, mo15859b));
    }

    /* renamed from: B */
    public final void m11752B(Activity activity) {
        synchronized (this.f24855l) {
            this.f24854k = true;
            if (activity != this.f24850g) {
                synchronized (this.f24855l) {
                    this.f24850g = activity;
                    this.f24851h = false;
                }
                if (this.f25143a.m24020z().m12675D()) {
                    this.f24852i = null;
                    this.f25143a.mo3882r().m6978z(new o48(this));
                }
            }
        }
        if (!this.f25143a.m24020z().m12675D()) {
            this.f24846c = this.f24852i;
            this.f25143a.mo3882r().m6978z(new f48(this));
            return;
        }
        m11747G(activity, m11748F(activity), false);
        vk4 m24021y = this.f25143a.m24021y();
        m24021y.f25143a.mo3882r().m6978z(new wr3(m24021y, m24021y.f25143a.mo3909b().mo15859b()));
    }

    /* renamed from: C */
    public final void m11751C(Activity activity, Bundle bundle) {
        t38 t38Var;
        if (!this.f25143a.m24020z().m12675D() || bundle == null || (t38Var = (t38) this.f24849f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", t38Var.f26981c);
        bundle2.putString("name", t38Var.f26979a);
        bundle2.putString("referrer_name", t38Var.f26980b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @Deprecated
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11750D(Activity activity, String str, String str2) {
        if (!this.f25143a.m24020z().m12675D()) {
            this.f25143a.mo3895i().m14154x().m20653a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        t38 t38Var = this.f24846c;
        if (t38Var == null) {
            this.f25143a.mo3895i().m14154x().m20653a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f24849f.get(activity) == null) {
            this.f25143a.mo3895i().m14154x().m20653a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = m11741t(activity.getClass(), "Activity");
            }
            boolean m6545a = w38.m6545a(t38Var.f26980b, str2);
            boolean m6545a2 = w38.m6545a(t38Var.f26979a, str);
            if (m6545a && m6545a2) {
                this.f25143a.mo3895i().m14154x().m20653a("setCurrentScreen cannot be called with the same class and name");
                return;
            }
            if (str != null) {
                if (str.length() > 0) {
                    this.f25143a.m24020z();
                }
                this.f25143a.mo3895i().m14154x().m20652b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
                return;
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    this.f25143a.m24020z();
                }
                this.f25143a.mo3895i().m14154x().m20652b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
                return;
            }
            this.f25143a.mo3895i().m14156v().m20651c("Setting current screen to name, class", str == null ? "null" : str, str2);
            t38 t38Var2 = new t38(str, str2, this.f25143a.m24045N().m24467r0());
            this.f24849f.put(activity, t38Var2);
            m11747G(activity, t38Var2, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11749E(Bundle bundle, long j) {
        String str;
        synchronized (this.f24855l) {
            if (!this.f24854k) {
                this.f25143a.mo3895i().m14154x().m20653a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String string = bundle.getString("screen_name");
            if (string != null) {
                if (string.length() > 0) {
                    int length = string.length();
                    this.f25143a.m24020z();
                }
                this.f25143a.mo3895i().m14154x().m20652b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                return;
            }
            String string2 = bundle.getString("screen_class");
            if (string2 != null) {
                if (string2.length() > 0) {
                    int length2 = string2.length();
                    this.f25143a.m24020z();
                }
                this.f25143a.mo3895i().m14154x().m20652b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                return;
            }
            if (string2 == null) {
                Activity activity = this.f24850g;
                str = activity != null ? m11741t(activity.getClass(), "Activity") : "Activity";
            } else {
                str = string2;
            }
            t38 t38Var = this.f24846c;
            if (this.f24851h && t38Var != null) {
                this.f24851h = false;
                boolean m6545a = w38.m6545a(t38Var.f26980b, str);
                boolean m6545a2 = w38.m6545a(t38Var.f26979a, string);
                if (m6545a && m6545a2) {
                    this.f25143a.mo3895i().m14154x().m20653a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            this.f25143a.mo3895i().m14156v().m20651c("Logging screen view with name, class", string == null ? "null" : string, str == null ? "null" : str);
            t38 t38Var2 = this.f24846c == null ? this.f24847d : this.f24846c;
            t38 t38Var3 = new t38(string, str, this.f25143a.m24045N().m24467r0(), true, j);
            this.f24846c = t38Var3;
            this.f24847d = t38Var2;
            this.f24852i = t38Var3;
            this.f25143a.mo3882r().m6978z(new z38(this, bundle, t38Var3, t38Var2, this.f25143a.mo3909b().mo15859b()));
        }
    }

    /* renamed from: F */
    public final t38 m11748F(Activity activity) {
        ry0.m10830j(activity);
        t38 t38Var = (t38) this.f24849f.get(activity);
        if (t38Var == null) {
            t38 t38Var2 = new t38(null, m11741t(activity.getClass(), "Activity"), this.f25143a.m24045N().m24467r0());
            this.f24849f.put(activity, t38Var2);
            t38Var = t38Var2;
        }
        return this.f24852i != null ? this.f24852i : t38Var;
    }

    /* renamed from: G */
    public final void m11747G(Activity activity, t38 t38Var, boolean z) {
        t38 t38Var2;
        t38 t38Var3 = this.f24846c == null ? this.f24847d : this.f24846c;
        if (t38Var.f26980b == null) {
            t38Var2 = new t38(t38Var.f26979a, activity != null ? m11741t(activity.getClass(), "Activity") : null, t38Var.f26981c, t38Var.f26983e, t38Var.f26984f);
        } else {
            t38Var2 = t38Var;
        }
        this.f24847d = this.f24846c;
        this.f24846c = t38Var2;
        this.f25143a.mo3882r().m6978z(new c48(this, t38Var2, t38Var3, this.f25143a.mo3909b().mo15859b(), z));
    }

    @Override // com.daaw.c86
    /* renamed from: m */
    public final boolean mo5306m() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [long, android.os.Bundle] */
    /* renamed from: n */
    public final void m11746n(t38 t38Var, t38 t38Var2, long j, boolean z, Bundle bundle) {
        long j2;
        mo6991f();
        boolean z2 = false;
        boolean z3 = (t38Var2 != null && t38Var2.f26981c == t38Var.f26981c && w38.m6545a(t38Var2.f26980b, t38Var.f26980b) && w38.m6545a(t38Var2.f26979a, t38Var.f26979a)) ? false : true;
        if (z && this.f24848e != null) {
            z2 = true;
        }
        if (z3) {
            dd8.m24455y(t38Var, bundle != null ? new Bundle(bundle) : new Bundle(), true);
            if (t38Var2 != null) {
                String str = t38Var2.f26979a;
                if (str != null) {
                    "_pn".putString("_pn", str);
                }
                String str2 = t38Var2.f26980b;
                if (str2 != null) {
                    "_pc".putString("_pc", str2);
                }
                ?? r8 = t38Var2.f26981c;
                r8.putLong("_pi", r8);
            }
            ?? r82 = 0;
            if (z2) {
                w98 w98Var = this.f25143a.m24046M().f5684e;
                long j3 = j - w98Var.f31090b;
                w98Var.f31090b = j;
                if (j3 > 0) {
                    this.f25143a.m24045N().m24458w(null, j3);
                }
            }
            if (!this.f25143a.m24020z().m12675D()) {
                r82.putLong("_mst", 1L);
            }
            String str3 = true != t38Var.f26983e ? "auto" : "app";
            long mo15860a = this.f25143a.mo3909b().mo15860a();
            if (t38Var.f26983e) {
                mo15860a = t38Var.f26984f;
                if (mo15860a != 0) {
                    j2 = mo15860a;
                    this.f25143a.m24050I().m13682v(str3, "_vs", j2, null);
                }
            }
            j2 = mo15860a;
            this.f25143a.m24050I().m13682v(str3, "_vs", j2, null);
        }
        if (z2) {
            m11745o(this.f24848e, true, j);
        }
        this.f24848e = t38Var;
        if (t38Var.f26983e) {
            this.f24853j = t38Var;
        }
        this.f25143a.m24047L().m5454u(t38Var);
    }

    /* renamed from: o */
    public final void m11745o(t38 t38Var, boolean z, long j) {
        this.f25143a.m24021y().m7080m(this.f25143a.mo3909b().mo15859b());
        if (!this.f25143a.m24046M().f5684e.m6278d(t38Var != null && t38Var.f26982d, z, j) || t38Var == null) {
            return;
        }
        t38Var.f26982d = false;
    }

    /* renamed from: q */
    public final t38 m11743q() {
        return this.f24846c;
    }

    /* renamed from: s */
    public final t38 m11742s(boolean z) {
        m25515g();
        mo6991f();
        if (z) {
            t38 t38Var = this.f24848e;
            return t38Var != null ? t38Var : this.f24853j;
        }
        return this.f24848e;
    }

    /* renamed from: t */
    public final String m11741t(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.f25143a.m24020z();
        if (length2 > 100) {
            this.f25143a.m24020z();
            return str2.substring(0, 100);
        }
        return str2;
    }

    /* renamed from: y */
    public final void m11736y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.f25143a.m24020z().m12675D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f24849f.put(activity, new t38(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* renamed from: z */
    public final void m11735z(Activity activity) {
        synchronized (this.f24855l) {
            if (activity == this.f24850g) {
                this.f24850g = null;
            }
        }
        if (this.f25143a.m24020z().m12675D()) {
            this.f24849f.remove(activity);
        }
    }
}
