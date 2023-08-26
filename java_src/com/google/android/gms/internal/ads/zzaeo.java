package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/* loaded from: classes2.dex */
public abstract class zzaeo extends zzek implements zzaen {
    public zzaeo() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzek
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            zzaeq zzaeqVar = null;
            zzaet zzaetVar = null;
            zzaet zzaetVar2 = null;
            if (i == 2) {
                zzaef zzaefVar = (zzaef) zzel.zza(parcel, zzaef.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    zzaeqVar = queryLocalInterface instanceof zzaeq ? (zzaeq) queryLocalInterface : new zzaes(readStrongBinder);
                }
                zza(zzaefVar, zzaeqVar);
            } else if (i == 4) {
                zzaey zzaeyVar = (zzaey) zzel.zza(parcel, zzaey.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzaetVar2 = queryLocalInterface2 instanceof zzaet ? (zzaet) queryLocalInterface2 : new zzaeu(readStrongBinder2);
                }
                zza(zzaeyVar, zzaetVar2);
            } else if (i != 5) {
                return false;
            } else {
                zzaey zzaeyVar2 = (zzaey) zzel.zza(parcel, zzaey.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzaetVar = queryLocalInterface3 instanceof zzaet ? (zzaet) queryLocalInterface3 : new zzaeu(readStrongBinder3);
                }
                zzb(zzaeyVar2, zzaetVar);
            }
            parcel2.writeNoException();
        } else {
            zzaej zzb = zzb((zzaef) zzel.zza(parcel, zzaef.CREATOR));
            parcel2.writeNoException();
            zzel.zzb(parcel2, zzb);
        }
        return true;
    }
}
