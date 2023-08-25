package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcp;
import com.google.android.gms.ads.internal.client.zzeq;
import com.google.android.gms.ads.internal.client.zzey;
/* loaded from: classes.dex */
public final class mm2 extends ku2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzaw c;

    public mm2(zzaw zzawVar, Context context) {
        this.c = zzawVar;
        this.b = context;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "mobile_ads_settings");
        return new zzey();
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzg(nt0.g3(this.b), 224400000);
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        gt3 gt3Var;
        zzeq zzeqVar;
        g93.c(this.b);
        if (!((Boolean) zzba.zzc().b(g93.S8)).booleanValue()) {
            zzeqVar = this.c.c;
            return zzeqVar.zza(this.b);
        }
        try {
            IBinder zze = ((zzcp) o04.b(this.b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzap
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return queryLocalInterface instanceof zzcp ? (zzcp) queryLocalInterface : new zzcp(obj);
                }
            })).zze(nt0.g3(this.b), 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(zze);
        } catch (RemoteException | n04 | NullPointerException e) {
            this.c.h = et3.c(this.b);
            gt3Var = this.c.h;
            gt3Var.a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
