package com.daaw;
/* loaded from: classes.dex */
public final class ef5 {
    public final zh3 a;

    public ef5(zh3 zh3Var) {
        this.a = zh3Var;
    }

    public final void a() {
        s(new df5("initialize", null));
    }

    public final void b(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onAdClicked";
        this.a.zzb(df5.a(df5Var));
    }

    public final void c(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onAdClosed";
        s(df5Var);
    }

    public final void d(long j, int i) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onAdFailedToLoad";
        df5Var.d = Integer.valueOf(i);
        s(df5Var);
    }

    public final void e(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onAdLoaded";
        s(df5Var);
    }

    public final void f(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onNativeAdObjectNotAvailable";
        s(df5Var);
    }

    public final void g(long j) {
        df5 df5Var = new df5("interstitial", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onAdOpened";
        s(df5Var);
    }

    public final void h(long j) {
        df5 df5Var = new df5("creation", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "nativeObjectCreated";
        s(df5Var);
    }

    public final void i(long j) {
        df5 df5Var = new df5("creation", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "nativeObjectNotCreated";
        s(df5Var);
    }

    public final void j(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onAdClicked";
        s(df5Var);
    }

    public final void k(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onRewardedAdClosed";
        s(df5Var);
    }

    public final void l(long j, tv3 tv3Var) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onUserEarnedReward";
        df5Var.e = tv3Var.zzf();
        df5Var.f = Integer.valueOf(tv3Var.zze());
        s(df5Var);
    }

    public final void m(long j, int i) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onRewardedAdFailedToLoad";
        df5Var.d = Integer.valueOf(i);
        s(df5Var);
    }

    public final void n(long j, int i) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onRewardedAdFailedToShow";
        df5Var.d = Integer.valueOf(i);
        s(df5Var);
    }

    public final void o(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onAdImpression";
        s(df5Var);
    }

    public final void p(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onRewardedAdLoaded";
        s(df5Var);
    }

    public final void q(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onNativeAdObjectNotAvailable";
        s(df5Var);
    }

    public final void r(long j) {
        df5 df5Var = new df5("rewarded", null);
        df5Var.a = Long.valueOf(j);
        df5Var.c = "onRewardedAdOpened";
        s(df5Var);
    }

    public final void s(df5 df5Var) {
        String a = df5.a(df5Var);
        k04.zzi("Dispatching AFMA event on publisher webview: ".concat(a));
        this.a.zzb(a);
    }
}
