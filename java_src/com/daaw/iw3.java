package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
/* loaded from: classes.dex */
public final class iw3 {
    public static final wv3 a(Context context, String str, an3 an3Var) {
        try {
            IBinder zze = ((aw3) o04.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new m04() { // from class: com.daaw.hw3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.daaw.m04
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof aw3 ? (aw3) queryLocalInterface : new aw3(obj);
                }
            })).zze(nt0.g3(context), str, an3Var, 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof wv3 ? (wv3) queryLocalInterface : new uv3(zze);
        } catch (RemoteException | n04 e) {
            k04.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
