package com.daaw;

import android.content.Context;
import android.content.IntentFilter;
/* loaded from: classes.dex */
public final class gk8 {
    public final Context a;
    public final xh8 b;

    public gk8(Context context, c33 c33Var) {
        this.a = context;
        this.b = new xh8(this, null, null);
    }

    public gk8(Context context, g01 g01Var, is3 is3Var) {
        this.a = context;
        this.b = new xh8(this, g01Var, is3Var, null);
    }

    public final c33 b() {
        xh8.a(this.b);
        return null;
    }

    public final g01 c() {
        return xh8.b(this.b);
    }

    public final void d() {
        this.b.d(this.a);
    }

    public final void e() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.b.c(this.a, intentFilter);
    }
}
