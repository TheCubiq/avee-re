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
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        zzbh zzbhVar = null;
        zzcf zzcfVar = null;
        switch (i) {
            case 1:
                zzbn zze = zze();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                dp2.m24105c(parcel);
                zzl(zzbhVar);
                break;
            case 3:
                wd3 m7242g3 = vd3.m7242g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzf(m7242g3);
                break;
            case 4:
                zd3 m3847g3 = yd3.m3847g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzg(m3847g3);
                break;
            case 5:
                String readString = parcel.readString();
                fe3 m23537g3 = ee3.m23537g3(parcel.readStrongBinder());
                ce3 m26194g3 = be3.m26194g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzh(readString, m23537g3, m26194g3);
                break;
            case 6:
                dp2.m24105c(parcel);
                zzo((zzblz) dp2.m24107a(parcel, zzblz.CREATOR));
                break;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = queryLocalInterface2 instanceof zzcf ? (zzcf) queryLocalInterface2 : new zzcf(readStrongBinder2);
                }
                dp2.m24105c(parcel);
                zzq(zzcfVar);
                break;
            case 8:
                dp2.m24105c(parcel);
                zzj(ie3.m19881g3(parcel.readStrongBinder()), (zzq) dp2.m24107a(parcel, zzq.CREATOR));
                break;
            case 9:
                dp2.m24105c(parcel);
                zzp((PublisherAdViewOptions) dp2.m24107a(parcel, PublisherAdViewOptions.CREATOR));
                break;
            case 10:
                me3 m16986g3 = le3.m16986g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzk(m16986g3);
                break;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                dp2.m24105c(parcel);
                zzn((zzbsl) dp2.m24107a(parcel, zzbsl.CREATOR));
                break;
            case 14:
                sj3 m11230g3 = rj3.m11230g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzi(m11230g3);
                break;
            case 15:
                dp2.m24105c(parcel);
                zzm((AdManagerAdViewOptions) dp2.m24107a(parcel, AdManagerAdViewOptions.CREATOR));
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
