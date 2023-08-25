package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.an3;
import com.daaw.ar3;
import com.daaw.bi3;
import com.daaw.bp2;
import com.daaw.ci3;
import com.daaw.dp2;
import com.daaw.ed3;
import com.daaw.fd3;
import com.daaw.fv3;
import com.daaw.gr3;
import com.daaw.hr3;
import com.daaw.vv3;
import com.daaw.wv3;
import com.daaw.yc3;
import com.daaw.yd0;
import com.daaw.yy3;
import com.daaw.zc3;
import com.daaw.zh3;
import com.daaw.zq3;
import com.daaw.zy3;
/* loaded from: classes.dex */
public final class zzcc extends bp2 implements zzce {
    public zzcc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(yd0 yd0Var, String str, an3 an3Var, int i) {
        zzbq zzboVar;
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString(str);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(3, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        I.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        zzbu zzbsVar;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzqVar);
        D.writeString(str);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(13, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        I.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        zzbu zzbsVar;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzqVar);
        D.writeString(str);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(1, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        I.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        zzbu zzbsVar;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzqVar);
        D.writeString(str);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(2, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        I.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(yd0 yd0Var, zzq zzqVar, String str, int i) {
        zzbu zzbsVar;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzqVar);
        D.writeString(str);
        D.writeInt(224400000);
        Parcel I = I(10, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        I.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(yd0 yd0Var, int i) {
        zzco zzcmVar;
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeInt(224400000);
        Parcel I = I(9, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        I.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(yd0 yd0Var, an3 an3Var, int i) {
        zzdj zzdhVar;
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(17, D);
        IBinder readStrongBinder = I.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        I.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zc3 zzi(yd0 yd0Var, yd0 yd0Var2) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, yd0Var2);
        Parcel I = I(5, D);
        zc3 zzbD = yc3.zzbD(I.readStrongBinder());
        I.recycle();
        return zzbD;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final fd3 zzj(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, yd0Var2);
        dp2.g(D, yd0Var3);
        Parcel I = I(11, D);
        fd3 zze = ed3.zze(I.readStrongBinder());
        I.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ci3 zzk(yd0 yd0Var, an3 an3Var, int i, zh3 zh3Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        dp2.g(D, zh3Var);
        Parcel I = I(16, D);
        ci3 g3 = bi3.g3(I.readStrongBinder());
        I.recycle();
        return g3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ar3 zzl(yd0 yd0Var, an3 an3Var, int i) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(15, D);
        ar3 g3 = zq3.g3(I.readStrongBinder());
        I.recycle();
        return g3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final hr3 zzm(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        Parcel I = I(8, D);
        hr3 zzF = gr3.zzF(I.readStrongBinder());
        I.recycle();
        return zzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final fv3 zzn(yd0 yd0Var, an3 an3Var, int i) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final wv3 zzo(yd0 yd0Var, String str, an3 an3Var, int i) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString(str);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(12, D);
        wv3 zzq = vv3.zzq(I.readStrongBinder());
        I.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zy3 zzp(yd0 yd0Var, an3 an3Var, int i) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.g(D, an3Var);
        D.writeInt(224400000);
        Parcel I = I(14, D);
        zy3 zzb = yy3.zzb(I.readStrongBinder());
        I.recycle();
        return zzb;
    }
}
