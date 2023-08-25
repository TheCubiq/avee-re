package com.daaw;
/* loaded from: classes.dex */
public final class ef5 {

    /* renamed from: a */
    public final zh3 f8445a;

    public ef5(zh3 zh3Var) {
        this.f8445a = zh3Var;
    }

    /* renamed from: a */
    public final void m23522a() {
        m23504s(new df5("initialize", null));
    }

    /* renamed from: b */
    public final void m23521b(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onAdClicked";
        this.f8445a.zzb(df5.m24428a(df5Var));
    }

    /* renamed from: c */
    public final void m23520c(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onAdClosed";
        m23504s(df5Var);
    }

    /* renamed from: d */
    public final void m23519d(long j, int i) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onAdFailedToLoad";
        df5Var.f7035d = Integer.valueOf(i);
        m23504s(df5Var);
    }

    /* renamed from: e */
    public final void m23518e(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onAdLoaded";
        m23504s(df5Var);
    }

    /* renamed from: f */
    public final void m23517f(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onNativeAdObjectNotAvailable";
        m23504s(df5Var);
    }

    /* renamed from: g */
    public final void m23516g(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onAdOpened";
        m23504s(df5Var);
    }

    /* renamed from: h */
    public final void m23515h(long j) {
        df5 df5Var = new df5("creation", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "nativeObjectCreated";
        m23504s(df5Var);
    }

    /* renamed from: i */
    public final void m23514i(long j) {
        df5 df5Var = new df5("creation", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "nativeObjectNotCreated";
        m23504s(df5Var);
    }

    /* renamed from: j */
    public final void m23513j(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onAdClicked";
        m23504s(df5Var);
    }

    /* renamed from: k */
    public final void m23512k(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onRewardedAdClosed";
        m23504s(df5Var);
    }

    /* renamed from: l */
    public final void m23511l(long j, tv3 tv3Var) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onUserEarnedReward";
        df5Var.f7036e = tv3Var.zzf();
        df5Var.f7037f = Integer.valueOf(tv3Var.zze());
        m23504s(df5Var);
    }

    /* renamed from: m */
    public final void m23510m(long j, int i) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onRewardedAdFailedToLoad";
        df5Var.f7035d = Integer.valueOf(i);
        m23504s(df5Var);
    }

    /* renamed from: n */
    public final void m23509n(long j, int i) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onRewardedAdFailedToShow";
        df5Var.f7035d = Integer.valueOf(i);
        m23504s(df5Var);
    }

    /* renamed from: o */
    public final void m23508o(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onAdImpression";
        m23504s(df5Var);
    }

    /* renamed from: p */
    public final void m23507p(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onRewardedAdLoaded";
        m23504s(df5Var);
    }

    /* renamed from: q */
    public final void m23506q(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onNativeAdObjectNotAvailable";
        m23504s(df5Var);
    }

    /* renamed from: r */
    public final void m23505r(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.f7032a = Long.valueOf(j);
        df5Var.f7034c = "onRewardedAdOpened";
        m23504s(df5Var);
    }

    /* renamed from: s */
    public final void m23504s(df5 df5Var) {
        String m24428a = df5.m24428a(df5Var);
        k04.zzi("Dispatching AFMA event on publisher webview: ".concat(m24428a));
        this.f8445a.zzb(m24428a);
    }
}
