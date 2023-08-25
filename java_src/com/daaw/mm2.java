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

    /* renamed from: b */
    public final /* synthetic */ Context f18976b;

    /* renamed from: c */
    public final /* synthetic */ zzaw f18977c;

    public mm2(zzaw zzawVar, Context context) {
        this.f18977c = zzawVar;
        this.f18976b = context;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f18976b, "mobile_ads_settings");
        return new zzey();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzg(nt0.m14830g3(this.f18976b), 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        gt3 gt3Var;
        zzeq zzeqVar;
        g93.m21879c(this.f18976b);
        if (!((Boolean) zzba.zzc().m23658b(g93.f10550S8)).booleanValue()) {
            zzeqVar = this.f18977c.f36088c;
            return zzeqVar.zza(this.f18976b);
        }
        try {
            IBinder zze = ((zzcp) o04.m14656b(this.f18976b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzap
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return queryLocalInterface instanceof zzcp ? (zzcp) queryLocalInterface : new zzcp(obj);
                }
            })).zze(nt0.m14830g3(this.f18976b), 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(zze);
        } catch (RemoteException | n04 | NullPointerException e) {
            this.f18977c.f36093h = et3.m23193c(this.f18976b);
            gt3Var = this.f18977c.f36093h;
            gt3Var.mo21236a(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
