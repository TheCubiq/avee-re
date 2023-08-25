package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzi;
/* loaded from: classes.dex */
public final class ak2 extends ku2 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ an3 d;
    public final /* synthetic */ zzaw e;

    public ak2(zzaw zzawVar, Context context, String str, an3 an3Var) {
        this.e = zzawVar;
        this.b = context;
        this.c = str;
        this.d = an3Var;
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object a() {
        zzaw.i(this.b, "native_ad");
        return new zzeu();
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object b(zzce zzceVar) {
        return zzceVar.zzb(nt0.g3(this.b), this.c, this.d, 224400000);
    }

    @Override // com.daaw.ku2
    public final /* bridge */ /* synthetic */ Object c() {
        gt3 gt3Var;
        zzi zziVar;
        g93.c(this.b);
        if (!((Boolean) zzba.zzc().b(g93.S8)).booleanValue()) {
            zziVar = this.e.b;
            return zziVar.zza(this.b, this.c, this.d);
        }
        try {
            IBinder zze = ((zzbr) o04.b(this.b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzan
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbr(obj);
                }
            })).zze(nt0.g3(this.b), this.c, this.d, 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException | n04 | NullPointerException e) {
            this.e.h = et3.c(this.b);
            gt3Var = this.e.h;
            gt3Var.a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
