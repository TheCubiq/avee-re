package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class az0 {
    public final boolean a() {
        return b().K(c(), "pref_alwaysHideAppLogo", false);
    }

    public final j5 b() {
        j5 e = j5.e();
        ug0.e(e, "createOrGetInstance()");
        return e;
    }

    public final Context c() {
        return dx0.e();
    }

    public final boolean d() {
        return b().K(c(), "pref_disableHeaderAds", true);
    }

    public final boolean e() {
        return b().K(c(), "pref_showLegacyPremiumInfo", true);
    }

    public final void f(boolean z) {
        b().Q(c(), "pref_showLegacyPremiumInfo", z);
    }
}
