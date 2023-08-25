package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.an3;
import com.daaw.et3;
import com.daaw.g93;
import com.daaw.gt3;
import com.daaw.k04;
import com.daaw.m04;
import com.daaw.n04;
import com.daaw.nt0;
import com.daaw.o04;
import com.daaw.r31;
/* loaded from: classes.dex */
public final class zzk extends r31 {

    /* renamed from: c */
    public gt3 f36192c;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.daaw.r31
    /* renamed from: a */
    public final /* synthetic */ Object mo1391a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof zzbv ? (zzbv) queryLocalInterface : new zzbv(iBinder);
    }

    public final zzbu zza(Context context, zzq zzqVar, String str, an3 an3Var, int i) {
        g93.m21879c(context);
        if (!((Boolean) zzba.zzc().m23658b(g93.f10550S8)).booleanValue()) {
            try {
                IBinder zze = ((zzbv) m11808b(context)).zze(nt0.m14830g3(context), zzqVar, str, an3Var, 224400000, i);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(zze);
            } catch (RemoteException | r31.C2817a e) {
                k04.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder zze2 = ((zzbv) o04.m14656b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new m04() { // from class: com.google.android.gms.ads.internal.client.zzj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return queryLocalInterface2 instanceof zzbv ? (zzbv) queryLocalInterface2 : new zzbv(obj);
                }
            })).zze(nt0.m14830g3(context), zzqVar, str, an3Var, 224400000, i);
            if (zze2 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = zze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof zzbu ? (zzbu) queryLocalInterface2 : new zzbs(zze2);
        } catch (RemoteException | n04 | NullPointerException e2) {
            gt3 m23193c = et3.m23193c(context);
            this.f36192c = m23193c;
            m23193c.mo21236a(e2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            k04.zzl("#007 Could not call remote method.", e2);
            return null;
        }
    }
}
