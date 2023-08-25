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

    /* renamed from: p */
    public final List f32634p;

    /* renamed from: q */
    public final vd5 f32635q;

    /* renamed from: r */
    public long f32636r;

    public xe5(vd5 vd5Var, b94 b94Var) {
        this.f32635q = vd5Var;
        this.f32634p = Collections.singletonList(b94Var);
    }

    @Override // com.daaw.fn6
    /* renamed from: A */
    public final void mo5182A(ym6 ym6Var, String str) {
        m5176W(xm6.class, "onTaskStarted", str);
    }

    @Override // com.daaw.pt4
    /* renamed from: F */
    public final void mo5181F(fi6 fi6Var) {
    }

    @Override // com.daaw.hp2
    /* renamed from: H */
    public final void mo5180H(String str, String str2) {
        m5176W(hp2.class, "onAppEvent", str, str2);
    }

    @Override // com.daaw.fn6
    /* renamed from: M */
    public final void mo5179M(ym6 ym6Var, String str) {
        m5176W(xm6.class, "onTaskSucceeded", str);
    }

    @Override // com.daaw.fn6
    /* renamed from: S */
    public final void mo5178S(ym6 ym6Var, String str, Throwable th) {
        m5176W(xm6.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.daaw.lq4
    /* renamed from: T */
    public final void mo5177T() {
        m5176W(lq4.class, "onRewardedVideoStarted", new Object[0]);
    }

    /* renamed from: W */
    public final void m5176W(Class cls, String str, Object... objArr) {
        this.f32635q.m7241a(this.f32634p, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.daaw.oq4
    /* renamed from: b */
    public final void mo2194b(zze zzeVar) {
        m5176W(oq4.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.daaw.lq4
    /* renamed from: c */
    public final void mo5175c() {
        m5176W(lq4.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.daaw.pt4
    /* renamed from: e */
    public final void mo5174e(zzccb zzccbVar) {
        this.f32636r = zzt.zzB().mo15859b();
        m5176W(pt4.class, "onAdRequest", new Object[0]);
    }

    @Override // com.daaw.jr4
    /* renamed from: f */
    public final void mo5173f(Context context) {
        m5176W(jr4.class, "onDestroy", context);
    }

    @Override // com.daaw.fn6
    /* renamed from: k */
    public final void mo5172k(ym6 ym6Var, String str) {
        m5176W(xm6.class, "onTaskCreated", str);
    }

    @Override // com.daaw.jr4
    /* renamed from: l */
    public final void mo5171l(Context context) {
        m5176W(jr4.class, "onResume", context);
    }

    @Override // com.daaw.lq4
    @ParametersAreNonnullByDefault
    /* renamed from: m */
    public final void mo5170m(cv3 cv3Var, String str, String str2) {
        m5176W(lq4.class, "onRewarded", cv3Var, str, str2);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        m5176W(zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.daaw.jr4
    /* renamed from: s */
    public final void mo5169s(Context context) {
        m5176W(jr4.class, "onPause", context);
    }

    @Override // com.daaw.lq4
    public final void zzj() {
        m5176W(lq4.class, "onAdClosed", new Object[0]);
    }

    @Override // com.daaw.ir4
    public final void zzl() {
        m5176W(ir4.class, "onAdImpression", new Object[0]);
    }

    @Override // com.daaw.lq4
    public final void zzm() {
        m5176W(lq4.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.daaw.fs4
    public final void zzn() {
        long mo15859b = zzt.zzB().mo15859b();
        long j = this.f32636r;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (mo15859b - j));
        m5176W(fs4.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.daaw.lq4
    public final void zzo() {
        m5176W(lq4.class, "onAdOpened", new Object[0]);
    }
}
