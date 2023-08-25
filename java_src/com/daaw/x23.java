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

    /* renamed from: a */
    public zzbu f32014a;

    /* renamed from: b */
    public final Context f32015b;

    /* renamed from: c */
    public final String f32016c;

    /* renamed from: d */
    public final zzdx f32017d;
    @AppOpenAd.AppOpenAdOrientation

    /* renamed from: e */
    public final int f32018e;

    /* renamed from: f */
    public final AppOpenAd.AppOpenAdLoadCallback f32019f;

    /* renamed from: g */
    public final xm3 f32020g = new xm3();

    /* renamed from: h */
    public final zzp f32021h = zzp.zza;

    public x23(Context context, String str, zzdx zzdxVar, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.f32015b = context;
        this.f32016c = str;
        this.f32017d = zzdxVar;
        this.f32018e = i;
        this.f32019f = appOpenAdLoadCallback;
    }

    /* renamed from: a */
    public final void m5606a() {
        try {
            zzbu zzd = zzay.zza().zzd(this.f32015b, zzq.zzb(), this.f32016c, this.f32020g);
            this.f32014a = zzd;
            if (zzd != null) {
                if (this.f32018e != 3) {
                    this.f32014a.zzI(new zzw(this.f32018e));
                }
                this.f32014a.zzH(new k23(this.f32019f, this.f32016c));
                this.f32014a.zzaa(this.f32021h.zza(this.f32015b, this.f32017d));
            }
        } catch (RemoteException e) {
            k04.zzl("#007 Could not call remote method.", e);
        }
    }
}
