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

    /* renamed from: b */
    public final /* synthetic */ Context f3269b;

    /* renamed from: c */
    public final /* synthetic */ String f3270c;

    /* renamed from: d */
    public final /* synthetic */ an3 f3271d;

    /* renamed from: e */
    public final /* synthetic */ zzaw f3272e;

    public ak2(zzaw zzawVar, Context context, String str, an3 an3Var) {
        this.f3272e = zzawVar;
        this.f3269b = context;
        this.f3270c = str;
        this.f3271d = an3Var;
    }

    @Override // com.daaw.ku2
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo3435a() {
        zzaw.m1429i(this.f3269b, "native_ad");
        return new zzeu();
    }

    @Override // com.daaw.ku2
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3434b(zzce zzceVar) {
        return zzceVar.zzb(nt0.m14830g3(this.f3269b), this.f3270c, this.f3271d, 224400000);
    }

    @Override // com.daaw.ku2
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo3433c() {
        gt3 gt3Var;
        zzi zziVar;
        g93.m21879c(this.f3269b);
        if (!((Boolean) zzba.zzc().m23658b(g93.f10550S8)).booleanValue()) {
            zziVar = this.f3272e.f36087b;
            return zziVar.zza(this.f3269b, this.f3270c, this.f3271d);
        }
        try {
            IBinder zze = ((zzbr) o04.m14656b(this.f3269b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzan
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbr(obj);
                }
            })).zze(nt0.m14830g3(this.f3269b), this.f3270c, this.f3271d, 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException | n04 | NullPointerException e) {
            this.f3272e.f36093h = et3.m23193c(this.f3269b);
            gt3Var = this.f3272e.f36093h;
            gt3Var.mo21236a(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
