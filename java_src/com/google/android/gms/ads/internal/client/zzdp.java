package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.cp2;
import com.daaw.dp2;
/* loaded from: classes.dex */
public abstract class zzdp extends cp2 implements zzdq {
    public zzdp() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzdq zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof zzdq ? (zzdq) queryLocalInterface : new zzdo(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean zzq;
        float zzg;
        zzdt zzdrVar;
        switch (i) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean m24100h = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                zzj(m24100h);
                parcel2.writeNoException();
                return true;
            case 4:
                zzq = zzq();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzq);
                return true;
            case 5:
                int zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(zzh);
                return true;
            case 6:
                zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 7:
                zzg = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdrVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    zzdrVar = queryLocalInterface instanceof zzdt ? (zzdt) queryLocalInterface : new zzdr(readStrongBinder);
                }
                dp2.m24105c(parcel);
                zzm(zzdrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzg = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 10:
                zzq = zzp();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzq);
                return true;
            case 11:
                zzdt zzi = zzi();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzi);
                return true;
            case 12:
                zzq = zzo();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzq);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
