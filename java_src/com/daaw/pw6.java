package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
@SuppressLint({"RestrictedApi"})
@TargetApi(18)
/* loaded from: classes.dex */
public final class pw6 {

    /* renamed from: c */
    public static final cx6 f23464c = new cx6("OverlayDisplayService");

    /* renamed from: d */
    public static final Intent f23465d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final qx6 f23466a;

    /* renamed from: b */
    public final String f23467b;

    public pw6(Context context) {
        this.f23466a = tx6.m8708a(context) ? new qx6(context.getApplicationContext(), f23464c, "OverlayDisplayService", f23465d, kw6.f16792a, null, null) : null;
        this.f23467b = context.getPackageName();
    }

    /* renamed from: c */
    public final void m12968c() {
        if (this.f23466a == null) {
            return;
        }
        f23464c.m24909d("unbind LMD display overlay service", new Object[0]);
        this.f23466a.m11953r();
    }

    /* renamed from: d */
    public final void m12967d(dw6 dw6Var, uw6 uw6Var) {
        if (this.f23466a == null) {
            f23464c.m24911b("error: %s", "Play Store not found.");
            return;
        }
        tj1 tj1Var = new tj1();
        this.f23466a.m11955p(new mw6(this, tj1Var, dw6Var, uw6Var, tj1Var), tj1Var);
    }

    /* renamed from: e */
    public final void m12966e(rw6 rw6Var, uw6 uw6Var) {
        if (this.f23466a == null) {
            f23464c.m24911b("error: %s", "Play Store not found.");
        } else if (rw6Var.mo6730g() != null) {
            tj1 tj1Var = new tj1();
            this.f23466a.m11955p(new lw6(this, tj1Var, rw6Var, uw6Var, tj1Var), tj1Var);
        } else {
            f23464c.m24911b("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            sw6 m8753c = tw6.m8753c();
            m8753c.mo5761b(8160);
            uw6Var.mo1864a(m8753c.mo5760c());
        }
    }

    /* renamed from: f */
    public final void m12965f(ww6 ww6Var, uw6 uw6Var, int i) {
        if (this.f23466a == null) {
            f23464c.m24911b("error: %s", "Play Store not found.");
            return;
        }
        tj1 tj1Var = new tj1();
        this.f23466a.m11955p(new nw6(this, tj1Var, ww6Var, i, uw6Var, tj1Var), tj1Var);
    }
}
