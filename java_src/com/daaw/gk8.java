package com.daaw;

import android.content.Context;
import android.content.IntentFilter;
/* loaded from: classes.dex */
public final class gk8 {

    /* renamed from: a */
    public final Context f11401a;

    /* renamed from: b */
    public final xh8 f11402b;

    public gk8(Context context, c33 c33Var) {
        this.f11401a = context;
        this.f11402b = new xh8(this, null, null);
    }

    public gk8(Context context, g01 g01Var, is3 is3Var) {
        this.f11401a = context;
        this.f11402b = new xh8(this, g01Var, is3Var, null);
    }

    /* renamed from: b */
    public final c33 m21503b() {
        xh8.m5094a(this.f11402b);
        return null;
    }

    /* renamed from: c */
    public final g01 m21502c() {
        return xh8.m5093b(this.f11402b);
    }

    /* renamed from: d */
    public final void m21501d() {
        this.f11402b.m5091d(this.f11401a);
    }

    /* renamed from: e */
    public final void m21500e() {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f11402b.m5092c(this.f11401a, intentFilter);
    }
}
