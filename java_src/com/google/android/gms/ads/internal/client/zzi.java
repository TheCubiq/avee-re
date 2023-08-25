package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.daaw.an3;
import com.daaw.k04;
import com.daaw.nt0;
import com.daaw.r31;
/* loaded from: classes.dex */
public final class zzi extends r31 {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.daaw.r31
    /* renamed from: a */
    public final /* synthetic */ Object mo1391a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbr(iBinder);
    }

    public final zzbq zza(Context context, String str, an3 an3Var) {
        try {
            IBinder zze = ((zzbr) m11808b(context)).zze(nt0.m14830g3(context), str, an3Var, 224400000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException | r31.C2817a e) {
            k04.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
