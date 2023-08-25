package com.daaw;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
@SuppressLint({"RestrictedApi"})
@TargetApi(18)
/* loaded from: classes.dex */
public final class pw6 {
    public static final cx6 c = new cx6("OverlayDisplayService");
    public static final Intent d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");
    public final qx6 a;
    public final String b;

    public pw6(Context context) {
        this.a = tx6.a(context) ? new qx6(context.getApplicationContext(), c, "OverlayDisplayService", d, kw6.a, null, null) : null;
        this.b = context.getPackageName();
    }

    public final void c() {
        if (this.a == null) {
            return;
        }
        c.d("unbind LMD display overlay service", new Object[0]);
        this.a.r();
    }

    public final void d(dw6 dw6Var, uw6 uw6Var) {
        if (this.a == null) {
            c.b("error: %s", "Play Store not found.");
            return;
        }
        tj1 tj1Var = new tj1();
        this.a.p(new mw6(this, tj1Var, dw6Var, uw6Var, tj1Var), tj1Var);
    }

    public final void e(rw6 rw6Var, uw6 uw6Var) {
        if (this.a == null) {
            c.b("error: %s", "Play Store not found.");
        } else if (rw6Var.g() != null) {
            tj1 tj1Var = new tj1();
            this.a.p(new lw6(this, tj1Var, rw6Var, uw6Var, tj1Var), tj1Var);
        } else {
            c.b("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            sw6 c2 = tw6.c();
            c2.b(8160);
            uw6Var.a(c2.c());
        }
    }

    public final void f(ww6 ww6Var, uw6 uw6Var, int i) {
        if (this.a == null) {
            c.b("error: %s", "Play Store not found.");
            return;
        }
        tj1 tj1Var = new tj1();
        this.a.p(new nw6(this, tj1Var, ww6Var, i, uw6Var, tj1Var), tj1Var);
    }
}
