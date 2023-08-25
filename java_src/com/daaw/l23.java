package com.daaw;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfe;
/* loaded from: classes.dex */
public final class l23 extends AppOpenAd {

    /* renamed from: a */
    public final p23 f16972a;

    /* renamed from: b */
    public final String f16973b;

    /* renamed from: c */
    public final m23 f16974c = new m23();

    /* renamed from: d */
    public FullScreenContentCallback f16975d;

    /* renamed from: e */
    public OnPaidEventListener f16976e;

    public l23(p23 p23Var, String str) {
        this.f16972a = p23Var;
        this.f16973b = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.f16973b;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f16975d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f16976e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVar;
        try {
            zzdnVar = this.f16972a.zzf();
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
            zzdnVar = null;
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f16975d = fullScreenContentCallback;
        this.f16974c.m16294g3(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z) {
        try {
            this.f16972a.mo7136V2(z);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f16976e = onPaidEventListener;
        try {
            this.f16972a.mo7134Y0(new zzfe(onPaidEventListener));
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.f16972a.mo7133t1(nt0.m14830g3(activity), this.f16974c);
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
