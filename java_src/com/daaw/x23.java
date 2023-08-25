package com.daaw;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
/* loaded from: classes.dex */
public final class x23 {
    public zzbu a;
    public final Context b;
    public final String c;
    public final zzdx d;
    @AppOpenAd.AppOpenAdOrientation
    public final int e;
    public final AppOpenAd.AppOpenAdLoadCallback f;
    public final xm3 g = new xm3();
    public final zzp h = zzp.zza;

    public x23(Context context, String str, zzdx zzdxVar, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.b = context;
        this.c = str;
        this.d = zzdxVar;
        this.e = i;
        this.f = appOpenAdLoadCallback;
    }

    public final void a() {
        try {
            zzbu zzd = zzay.zza().zzd(this.b, zzq.zzb(), this.c, this.g);
            this.a = zzd;
            if (zzd != null) {
                if (this.e != 3) {
                    this.a.zzI(new zzw(this.e));
                }
                this.a.zzH(new k23(this.f, this.c));
                this.a.zzaa(this.h.zza(this.b, this.d));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
