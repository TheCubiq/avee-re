package com.daaw;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class r48 extends c86 {
    public volatile t38 c;
    public volatile t38 d;
    public t38 e;
    public final Map f;
    public Activity g;
    public volatile boolean h;
    public volatile t38 i;
    public t38 j;
    public boolean k;
    public final Object l;

    public r48(dr6 dr6Var) {
        super(dr6Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ void w(r48 r48Var, Bundle bundle, t38 t38Var, t38 t38Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        r48Var.n(t38Var, t38Var2, j, true, r48Var.a.N().v0(null, "screen_view", bundle, null, false));
    }

    public final void A(Activity activity) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
        }
        long b = this.a.b().b();
        if (!this.a.z().D()) {
            this.c = null;
            this.a.r().z(new i48(this, b));
            return;
        }
        t38 F = F(activity);
        this.d = this.c;
        this.c = null;
        this.a.r().z(new l48(this, F, b));
    }

    public final void B(Activity activity) {
        synchronized (this.l) {
            this.k = true;
            if (activity != this.g) {
                synchronized (this.l) {
                    this.g = activity;
                    this.h = false;
                }
                if (this.a.z().D()) {
                    this.i = null;
                    this.a.r().z(new o48(this));
                }
            }
        }
        if (!this.a.z().D()) {
            this.c = this.i;
            this.a.r().z(new f48(this));
            return;
        }
        G(activity, F(activity), false);
        vk4 y = this.a.y();
        y.a.r().z(new wr3(y, y.a.b().b()));
    }

    public final void C(Activity activity, Bundle bundle) {
        t38 t38Var;
        if (!this.a.z().D() || bundle == null || (t38Var = (t38) this.f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", t38Var.c);
        bundle2.putString("name", t38Var.a);
        bundle2.putString("referrer_name", t38Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (r6.length() <= 100) goto L36;
     */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(android.app.Activity r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.daaw.dr6 r0 = r3.a
            com.daaw.qa2 r0 = r0.z()
            boolean r0 = r0.D()
            if (r0 != 0) goto L1c
            com.daaw.dr6 r4 = r3.a
            com.daaw.om5 r4 = r4.i()
            com.daaw.hk5 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while screen reporting is disabled."
            r4.a(r5)
            return
        L1c:
            com.daaw.t38 r0 = r3.c
            if (r0 != 0) goto L30
            com.daaw.dr6 r4 = r3.a
            com.daaw.om5 r4 = r4.i()
            com.daaw.hk5 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called while no activity active"
            r4.a(r5)
            return
        L30:
            java.util.Map r1 = r3.f
            java.lang.Object r1 = r1.get(r4)
            if (r1 != 0) goto L48
            com.daaw.dr6 r4 = r3.a
            com.daaw.om5 r4 = r4.i()
            com.daaw.hk5 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen must be called with an activity in the activity lifecycle"
            r4.a(r5)
            return
        L48:
            if (r6 != 0) goto L54
            java.lang.Class r6 = r4.getClass()
            java.lang.String r1 = "Activity"
            java.lang.String r6 = r3.t(r6, r1)
        L54:
            java.lang.String r1 = r0.b
            boolean r1 = com.daaw.w38.a(r1, r6)
            java.lang.String r0 = r0.a
            boolean r0 = com.daaw.w38.a(r0, r5)
            if (r1 == 0) goto L75
            if (r0 != 0) goto L65
            goto L75
        L65:
            com.daaw.dr6 r4 = r3.a
            com.daaw.om5 r4 = r4.i()
            com.daaw.hk5 r4 = r4.x()
            java.lang.String r5 = "setCurrentScreen cannot be called with the same class and name"
            r4.a(r5)
            return
        L75:
            r0 = 100
            if (r5 == 0) goto La3
            int r1 = r5.length()
            if (r1 <= 0) goto L8b
            com.daaw.dr6 r1 = r3.a
            r1.z()
            int r1 = r5.length()
            if (r1 > r0) goto L8b
            goto La3
        L8b:
            com.daaw.dr6 r4 = r3.a
            com.daaw.om5 r4 = r4.i()
            com.daaw.hk5 r4 = r4.x()
            int r5 = r5.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid screen name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        La3:
            if (r6 == 0) goto Lcf
            int r1 = r6.length()
            if (r1 <= 0) goto Lb7
            com.daaw.dr6 r1 = r3.a
            r1.z()
            int r1 = r6.length()
            if (r1 > r0) goto Lb7
            goto Lcf
        Lb7:
            com.daaw.dr6 r4 = r3.a
            com.daaw.om5 r4 = r4.i()
            com.daaw.hk5 r4 = r4.x()
            int r5 = r6.length()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "Invalid class name length in setCurrentScreen. Length"
            r4.b(r6, r5)
            return
        Lcf:
            com.daaw.dr6 r0 = r3.a
            com.daaw.om5 r0 = r0.i()
            com.daaw.hk5 r0 = r0.v()
            if (r5 != 0) goto Lde
            java.lang.String r1 = "null"
            goto Ldf
        Lde:
            r1 = r5
        Ldf:
            java.lang.String r2 = "Setting current screen to name, class"
            r0.c(r2, r1, r6)
            com.daaw.t38 r0 = new com.daaw.t38
            com.daaw.dr6 r1 = r3.a
            com.daaw.dd8 r1 = r1.N()
            long r1 = r1.r0()
            r0.<init>(r5, r6, r1)
            java.util.Map r5 = r3.f
            r5.put(r4, r0)
            r5 = 1
            r3.G(r4, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r48.D(android.app.Activity, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r2 > 100) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (r4 > 100) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(android.os.Bundle r13, long r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.r48.E(android.os.Bundle, long):void");
    }

    public final t38 F(Activity activity) {
        ry0.j(activity);
        t38 t38Var = (t38) this.f.get(activity);
        if (t38Var == null) {
            t38 t38Var2 = new t38(null, t(activity.getClass(), "Activity"), this.a.N().r0());
            this.f.put(activity, t38Var2);
            t38Var = t38Var2;
        }
        return this.i != null ? this.i : t38Var;
    }

    public final void G(Activity activity, t38 t38Var, boolean z) {
        t38 t38Var2;
        t38 t38Var3 = this.c == null ? this.d : this.c;
        if (t38Var.b == null) {
            t38Var2 = new t38(t38Var.a, activity != null ? t(activity.getClass(), "Activity") : null, t38Var.c, t38Var.e, t38Var.f);
        } else {
            t38Var2 = t38Var;
        }
        this.d = this.c;
        this.c = t38Var2;
        this.a.r().z(new c48(this, t38Var2, t38Var3, this.a.b().b(), z));
    }

    @Override // com.daaw.c86
    public final boolean m() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v6, types: [long, android.os.Bundle] */
    public final void n(t38 t38Var, t38 t38Var2, long j, boolean z, Bundle bundle) {
        long j2;
        f();
        boolean z2 = false;
        boolean z3 = (t38Var2 != null && t38Var2.c == t38Var.c && w38.a(t38Var2.b, t38Var.b) && w38.a(t38Var2.a, t38Var.a)) ? false : true;
        if (z && this.e != null) {
            z2 = true;
        }
        if (z3) {
            dd8.y(t38Var, bundle != null ? new Bundle(bundle) : new Bundle(), true);
            if (t38Var2 != null) {
                String str = t38Var2.a;
                if (str != null) {
                    "_pn".putString("_pn", str);
                }
                String str2 = t38Var2.b;
                if (str2 != null) {
                    "_pc".putString("_pc", str2);
                }
                ?? r8 = t38Var2.c;
                r8.putLong("_pi", r8);
            }
            ?? r82 = 0;
            if (z2) {
                w98 w98Var = this.a.M().e;
                long j3 = j - w98Var.b;
                w98Var.b = j;
                if (j3 > 0) {
                    this.a.N().w(null, j3);
                }
            }
            if (!this.a.z().D()) {
                r82.putLong("_mst", 1L);
            }
            String str3 = true != t38Var.e ? "auto" : "app";
            long a = this.a.b().a();
            if (t38Var.e) {
                a = t38Var.f;
                if (a != 0) {
                    j2 = a;
                    this.a.I().v(str3, "_vs", j2, null);
                }
            }
            j2 = a;
            this.a.I().v(str3, "_vs", j2, null);
        }
        if (z2) {
            o(this.e, true, j);
        }
        this.e = t38Var;
        if (t38Var.e) {
            this.j = t38Var;
        }
        this.a.L().u(t38Var);
    }

    public final void o(t38 t38Var, boolean z, long j) {
        this.a.y().m(this.a.b().b());
        if (!this.a.M().e.d(t38Var != null && t38Var.d, z, j) || t38Var == null) {
            return;
        }
        t38Var.d = false;
    }

    public final t38 q() {
        return this.c;
    }

    public final t38 s(boolean z) {
        g();
        f();
        if (z) {
            t38 t38Var = this.e;
            return t38Var != null ? t38Var : this.j;
        }
        return this.e;
    }

    public final String t(Class cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str2 = length > 0 ? split[length - 1] : "";
        int length2 = str2.length();
        this.a.z();
        if (length2 > 100) {
            this.a.z();
            return str2.substring(0, 100);
        }
        return str2;
    }

    public final void y(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.z().D() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(activity, new t38(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void z(Activity activity) {
        synchronized (this.l) {
            if (activity == this.g) {
                this.g = null;
            }
        }
        if (this.a.z().D()) {
            this.f.remove(activity);
        }
    }
}
