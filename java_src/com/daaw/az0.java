package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class az0 {
    /* renamed from: a */
    public final boolean m26593a() {
        return m26592b().m18952K(m26591c(), "pref_alwaysHideAppLogo", false);
    }

    /* renamed from: b */
    public final SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m26592b() {
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
        ug0.m8269e(m18928e, "createOrGetInstance()");
        return m18928e;
    }

    /* renamed from: c */
    public final Context m26591c() {
        return dx0.m23837e();
    }

    /* renamed from: d */
    public final boolean m26590d() {
        return m26592b().m18952K(m26591c(), "pref_disableHeaderAds", true);
    }

    /* renamed from: e */
    public final boolean m26589e() {
        return m26592b().m18952K(m26591c(), "pref_showLegacyPremiumInfo", true);
    }

    /* renamed from: f */
    public final void m26588f(boolean z) {
        m26592b().m18946Q(m26591c(), "pref_showLegacyPremiumInfo", z);
    }
}
