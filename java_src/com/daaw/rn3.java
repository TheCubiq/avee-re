package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import java.util.List;
/* loaded from: classes.dex */
public abstract class rn3 extends cp2 implements sn3 {
    public rn3() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    /* renamed from: g3 */
    public static sn3 m11154g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof sn3 ? (sn3) queryLocalInterface : new qn3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String zzs;
        IInterface zzl;
        boolean zzB;
        float zzf;
        switch (i) {
            case 2:
                zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List zzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(zzv);
                return true;
            case 4:
                zzs = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 5:
                zzl = zzl();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzl);
                return true;
            case 6:
                zzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 7:
                zzs = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                zzs = mo10146b();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 10:
                zzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                zzl = zzj();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzl);
                return true;
            case 12:
                parcel2.writeNoException();
                zzl = null;
                dp2.m24101g(parcel2, zzl);
                return true;
            case 13:
                zzl = zzm();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzl);
                return true;
            case 14:
                zzl = zzn();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzl);
                return true;
            case 15:
                zzl = zzo();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzl);
                return true;
            case 16:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                dp2.m24102f(parcel2, zzi);
                return true;
            case 17:
                zzB = zzB();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzB);
                return true;
            case 18:
                zzB = zzA();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzB);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo10143w2(m3857I);
                parcel2.writeNoException();
                return true;
            case 21:
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                yd0 m3857I3 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                yd0 m3857I4 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo10144n2(m3857I2, m3857I3, m3857I4);
                parcel2.writeNoException();
                return true;
            case 22:
                yd0 m3857I5 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                mo10145n0(m3857I5);
                parcel2.writeNoException();
                return true;
            case 23:
                zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                zzf = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 25:
                zzf = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            default:
                return false;
        }
    }
}
