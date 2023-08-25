package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzccb;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
/* loaded from: classes.dex */
public final class xe5 implements pt4, zza, lq4, ir4, jr4, fs4, oq4, hp2, fn6 {
    public final List p;
    public final vd5 q;
    public long r;

    public xe5(vd5 vd5Var, b94 b94Var) {
        this.q = vd5Var;
        this.p = Collections.singletonList(b94Var);
    }

    @Override // com.daaw.fn6
    public final void A(ym6 ym6Var, String str) {
        W(xm6.class, "onTaskStarted", str);
    }

    @Override // com.daaw.pt4
    public final void F(fi6 fi6Var) {
    }

    @Override // com.daaw.hp2
    public final void H(String str, String str2) {
        W(hp2.class, "onAppEvent", str, str2);
    }

    @Override // com.daaw.fn6
    public final void M(ym6 ym6Var, String str) {
        W(xm6.class, "onTaskSucceeded", str);
    }

    @Override // com.daaw.fn6
    public final void S(ym6 ym6Var, String str, Throwable th) {
        W(xm6.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.daaw.lq4
    public final void T() {
        W(lq4.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void W(Class cls, String str, Object... objArr) {
        this.q.a(this.p, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.daaw.oq4
    public final void b(zze zzeVar) {
        W(oq4.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.daaw.lq4
    public final void c() {
        W(lq4.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.daaw.pt4
    public final void e(zzccb zzccbVar) {
        this.r = zzt.zzB().b();
        W(pt4.class, "onAdRequest", new Object[0]);
    }

    @Override // com.daaw.jr4
    public final void f(Context context) {
        W(jr4.class, "onDestroy", context);
    }

    @Override // com.daaw.fn6
    public final void k(ym6 ym6Var, String str) {
        W(xm6.class, "onTaskCreated", str);
    }

    @Override // com.daaw.jr4
    public final void l(Context context) {
        W(jr4.class, "onResume", context);
    }

    @Override // com.daaw.lq4
    @ParametersAreNonnullByDefault
    public final void m(cv3 cv3Var, String str, String str2) {
        W(lq4.class, "onRewarded", cv3Var, str, str2);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        W(zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.daaw.jr4
    public final void s(Context context) {
        W(jr4.class, "onPause", context);
    }

    @Override // com.daaw.lq4
    public final void zzj() {
        W(lq4.class, "onAdClosed", new Object[0]);
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        W(ir4.class, "onAdImpression", new Object[0]);
    }

    @Override // com.daaw.lq4
    public final void zzm() {
        W(lq4.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        long b = zzt.zzB().b();
        long j = this.r;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (b - j));
        W(fs4.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.daaw.lq4
    public final void zzo() {
        W(lq4.class, "onAdOpened", new Object[0]);
    }
}
