package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.cp2;
import com.daaw.dp2;
import com.daaw.ea3;
import com.daaw.fa3;
import com.daaw.hv3;
import com.daaw.iv3;
import com.daaw.ns3;
import com.daaw.os3;
import com.daaw.pr3;
import com.daaw.qr3;
import com.daaw.r23;
import com.daaw.s23;
import com.daaw.yd0;
/* loaded from: classes.dex */
public abstract class zzbt extends cp2 implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzbu zzac(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(iBinder);
    }

    @Override // com.daaw.cp2
    /* renamed from: M */
    public final boolean mo1346M(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface zzn;
        boolean zzZ;
        Parcelable zzg;
        String zzs;
        zzbh zzbhVar = null;
        zzci zzciVar = null;
        zzbk zzbkVar = null;
        zzdg zzdgVar = null;
        zzby zzbyVar = null;
        zzcf zzcfVar = null;
        zzbe zzbeVar = null;
        zzcb zzcbVar = null;
        switch (i) {
            case 1:
                zzn = zzn();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                zzZ = zzZ();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzZ);
                return true;
            case 4:
                dp2.m24105c(parcel);
                zzZ = zzaa((zzl) dp2.m24107a(parcel, zzl.CREATOR));
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzZ);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbhVar = queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbf(readStrongBinder);
                }
                dp2.m24105c(parcel);
                zzD(zzbhVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzcbVar = queryLocalInterface2 instanceof zzcb ? (zzcb) queryLocalInterface2 : new zzbz(readStrongBinder2);
                }
                dp2.m24105c(parcel);
                zzG(zzcbVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzg = zzg();
                parcel2.writeNoException();
                dp2.m24102f(parcel2, zzg);
                return true;
            case 13:
                dp2.m24105c(parcel);
                zzF((zzq) dp2.m24107a(parcel, zzq.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                qr3 m13196g3 = pr3.m13196g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzM(m13196g3);
                parcel2.writeNoException();
                return true;
            case 15:
                os3 m14847g3 = ns3.m14847g3(parcel.readStrongBinder());
                String readString = parcel.readString();
                dp2.m24105c(parcel);
                zzQ(m14847g3, readString);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 19:
                fa3 m23632g3 = ea3.m23632g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzO(m23632g3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbeVar = queryLocalInterface3 instanceof zzbe ? (zzbe) queryLocalInterface3 : new zzbc(readStrongBinder3);
                }
                dp2.m24105c(parcel);
                zzC(zzbeVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcfVar = queryLocalInterface4 instanceof zzcf ? (zzcf) queryLocalInterface4 : new zzcf(readStrongBinder4);
                }
                dp2.m24105c(parcel);
                zzab(zzcfVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean m24100h = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                zzN(m24100h);
                parcel2.writeNoException();
                return true;
            case 23:
                zzZ = zzY();
                parcel2.writeNoException();
                dp2.m24104d(parcel2, zzZ);
                return true;
            case 24:
                iv3 m20388g3 = hv3.m20388g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzS(m20388g3);
                parcel2.writeNoException();
                return true;
            case 25:
                String readString2 = parcel.readString();
                dp2.m24105c(parcel);
                zzT(readString2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzn = zzl();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzn);
                return true;
            case 29:
                dp2.m24105c(parcel);
                zzU((zzfl) dp2.m24107a(parcel, zzfl.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                dp2.m24105c(parcel);
                zzK((zzdu) dp2.m24107a(parcel, zzdu.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                zzs = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 32:
                zzn = zzj();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzn);
                return true;
            case 33:
                zzn = zzi();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzn);
                return true;
            case 34:
                boolean m24100h2 = dp2.m24100h(parcel);
                dp2.m24105c(parcel);
                zzL(m24100h2);
                parcel2.writeNoException();
                return true;
            case 35:
                zzs = zzt();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 36:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzbyVar = queryLocalInterface5 instanceof zzby ? (zzby) queryLocalInterface5 : new zzbw(readStrongBinder5);
                }
                dp2.m24105c(parcel);
                zzE(zzbyVar);
                parcel2.writeNoException();
                return true;
            case 37:
                zzg = zzd();
                parcel2.writeNoException();
                dp2.m24102f(parcel2, zzg);
                return true;
            case 38:
                String readString3 = parcel.readString();
                dp2.m24105c(parcel);
                zzR(readString3);
                parcel2.writeNoException();
                return true;
            case 39:
                dp2.m24105c(parcel);
                zzI((zzw) dp2.m24107a(parcel, zzw.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                s23 m11831g3 = r23.m11831g3(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzH(m11831g3);
                parcel2.writeNoException();
                return true;
            case 41:
                zzn = zzk();
                parcel2.writeNoException();
                dp2.m24101g(parcel2, zzn);
                return true;
            case 42:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdgVar = queryLocalInterface6 instanceof zzdg ? (zzdg) queryLocalInterface6 : new zzde(readStrongBinder6);
                }
                dp2.m24105c(parcel);
                zzP(zzdgVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzl zzlVar = (zzl) dp2.m24107a(parcel, zzl.CREATOR);
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbkVar = queryLocalInterface7 instanceof zzbk ? (zzbk) queryLocalInterface7 : new zzbi(readStrongBinder7);
                }
                dp2.m24105c(parcel);
                zzy(zzlVar, zzbkVar);
                parcel2.writeNoException();
                return true;
            case 44:
                yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(parcel.readStrongBinder());
                dp2.m24105c(parcel);
                zzW(m3857I);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzciVar = queryLocalInterface8 instanceof zzci ? (zzci) queryLocalInterface8 : new zzcg(readStrongBinder8);
                }
                dp2.m24105c(parcel);
                zzJ(zzciVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
