package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import java.util.List;
/* loaded from: classes.dex */
public abstract class xe3 extends cp2 implements ye3 {
    public xe3() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        String zzq;
        List b;
        IInterface zzk;
        boolean g2;
        ve3 te3Var;
        switch (i) {
            case 2:
                zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                b = b();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 4:
                zzq = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 5:
                zzk = zzk();
                parcel2.writeNoException();
                dp2.g(parcel2, zzk);
                return true;
            case 6:
                zzq = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 7:
                zzq = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                zzq = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 10:
                zzq = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 11:
                zzk = zzh();
                parcel2.writeNoException();
                dp2.g(parcel2, zzk);
                return true;
            case 12:
                zzq = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 13:
                zzx();
                parcel2.writeNoException();
                return true;
            case 14:
                zzk = zzi();
                parcel2.writeNoException();
                dp2.g(parcel2, zzk);
                return true;
            case 15:
                dp2.c(parcel);
                W2((Bundle) dp2.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                dp2.c(parcel);
                g2 = g2((Bundle) dp2.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dp2.d(parcel2, g2);
                return true;
            case 17:
                dp2.c(parcel);
                Z0((Bundle) dp2.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                zzk = zzm();
                parcel2.writeNoException();
                dp2.g(parcel2, zzk);
                return true;
            case 19:
                zzk = zzl();
                parcel2.writeNoException();
                dp2.g(parcel2, zzk);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                dp2.f(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    te3Var = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    te3Var = queryLocalInterface instanceof ve3 ? (ve3) queryLocalInterface : new te3(readStrongBinder);
                }
                dp2.c(parcel);
                d2(te3Var);
                parcel2.writeNoException();
                return true;
            case 22:
                k();
                parcel2.writeNoException();
                return true;
            case 23:
                b = zzv();
                parcel2.writeNoException();
                parcel2.writeList(b);
                return true;
            case 24:
                g2 = g();
                parcel2.writeNoException();
                dp2.d(parcel2, g2);
                return true;
            case 25:
                zzcw zzb = zzcv.zzb(parcel.readStrongBinder());
                dp2.c(parcel);
                v0(zzb);
                parcel2.writeNoException();
                return true;
            case 26:
                zzcs zzb2 = zzcr.zzb(parcel.readStrongBinder());
                dp2.c(parcel);
                M1(zzb2);
                parcel2.writeNoException();
                return true;
            case 27:
                zzC();
                parcel2.writeNoException();
                return true;
            case 28:
                zzA();
                parcel2.writeNoException();
                return true;
            case 29:
                zzk = zzj();
                parcel2.writeNoException();
                dp2.g(parcel2, zzk);
                return true;
            case 30:
                g2 = j();
                parcel2.writeNoException();
                dp2.d(parcel2, g2);
                return true;
            case 31:
                zzk = zzg();
                parcel2.writeNoException();
                dp2.g(parcel2, zzk);
                return true;
            case 32:
                zzdg zzb3 = zzdf.zzb(parcel.readStrongBinder());
                dp2.c(parcel);
                L0(zzb3);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
