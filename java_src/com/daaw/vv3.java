package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.yd0;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcdy;
/* loaded from: classes.dex */
public abstract class vv3 extends cp2 implements wv3 {
    public vv3() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static wv3 zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof wv3 ? (wv3) queryLocalInterface : new uv3(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzd;
        dw3 dw3Var = null;
        dw3 dw3Var2 = null;
        ew3 ew3Var = null;
        zv3 zv3Var = null;
        switch (i) {
            case 1:
                zzl zzlVar = (zzl) dp2.m24107a(parcel, zzl.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    dw3Var = queryLocalInterface instanceof dw3 ? (dw3) queryLocalInterface : new bw3(readStrongBinder);
                }
                dp2.m24105c(parcel);
                zzf(zzlVar, dw3Var);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    zv3Var = queryLocalInterface2 instanceof zv3 ? (zv3) queryLocalInterface2 : new xv3(readStrongBinder2);
                }
                dp2.m24105c(parcel);
                zzk(zv3Var);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zzo = zzo();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzo);
                return true;
            case 4:
                String zze = zze();
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 5:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzm(m3857I);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    ew3Var = queryLocalInterface3 instanceof ew3 ? (ew3) queryLocalInterface3 : new ew3(readStrongBinder3);
                }
                dp2.m24105c(parcel);
                zzp(ew3Var);
                parcel2.writeNoException();
                return true;
            case 7:
                dp2.m24105c(parcel);
                zzl((zzcdy) dp2.m24107a(parcel, zzcdy.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzdd zzb = zzdc.zzb(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzi(zzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle zzb2 = zzb();
                parcel2.writeNoException();
                dp2.m24102f(parcel2, zzb2);
                return true;
            case 10:
                yd0 m3857I2 = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                boolean m24100h = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                zzn(m3857I2, m24100h);
                parcel2.writeNoException();
                return true;
            case 11:
                zzd = zzd();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzd);
                return true;
            case 12:
                zzd = zzc();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzd);
                return true;
            case 13:
                zzdg zzb3 = zzdf.zzb(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzj(zzb3);
                parcel2.writeNoException();
                return true;
            case 14:
                zzl zzlVar2 = (zzl) dp2.m24107a(parcel, zzl.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    dw3Var2 = queryLocalInterface4 instanceof dw3 ? (dw3) queryLocalInterface4 : new bw3(readStrongBinder4);
                }
                dp2.m24105c(parcel);
                zzg(zzlVar2, dw3Var2);
                parcel2.writeNoException();
                return true;
            case 15:
                boolean m24100h2 = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                zzh(m24100h2);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
