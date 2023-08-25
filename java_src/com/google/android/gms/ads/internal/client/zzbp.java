package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.be3;
import com.daaw.ce3;
import com.daaw.cp2;
import com.daaw.dp2;
import com.daaw.ee3;
import com.daaw.fe3;
import com.daaw.ie3;
import com.daaw.le3;
import com.daaw.me3;
import com.daaw.rj3;
import com.daaw.sj3;
import com.daaw.vd3;
import com.daaw.wd3;
import com.daaw.yd3;
import com.daaw.zd3;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbsl;
/* loaded from: classes.dex */
public abstract class zzbp extends cp2 implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbh zzbhVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                dp2.g(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                dp2.c(parcel);
                zzl(zzbhVar);
                break;
            case 3:
                wd3 g3 = vd3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                zzf(g3);
                break;
            case 4:
                zd3 g32 = yd3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                zzg(g32);
                break;
            case 5:
                String readString = parcel.readString();
                fe3 g33 = ee3.g3(parcel.readStrongBinder());
                ce3 g34 = be3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                zzh(readString, g33, g34);
                break;
            case 6:
                dp2.c(parcel);
                zzo((zzblz) dp2.a(parcel, zzblz.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = queryLocalInterface2 instanceof zzcf ? (zzcf) queryLocalInterface2 : new zzcf(readStrongBinder2);
                }
                dp2.c(parcel);
                zzq(zzcfVar);
                break;
            case 8:
                dp2.c(parcel);
                zzj(ie3.g3(parcel.readStrongBinder()), (zzq) dp2.a(parcel, zzq.CREATOR));
                break;
            case 9:
                dp2.c(parcel);
                zzp((PublisherAdViewOptions) dp2.a(parcel, PublisherAdViewOptions.CREATOR));
                break;
            case 10:
                me3 g35 = le3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                zzk(g35);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                dp2.c(parcel);
                zzn((zzbsl) dp2.a(parcel, zzbsl.CREATOR));
                break;
            case 14:
                sj3 g36 = rj3.g3(parcel.readStrongBinder());
                dp2.c(parcel);
                zzi(g36);
                break;
            case 15:
                dp2.c(parcel);
                zzm((AdManagerAdViewOptions) dp2.a(parcel, AdManagerAdViewOptions.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
