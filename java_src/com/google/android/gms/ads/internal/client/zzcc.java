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
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(3, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            zzboVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(readStrongBinder);
        }
        m25951I.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        zzbu zzbsVar;
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzqVar);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(13, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        m25951I.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        zzbu zzbsVar;
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzqVar);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(1, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        m25951I.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(yd0 yd0Var, zzq zzqVar, String str, an3 an3Var, int i) {
        zzbu zzbsVar;
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzqVar);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(2, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        m25951I.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(yd0 yd0Var, zzq zzqVar, String str, int i) {
        zzbu zzbsVar;
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzqVar);
        m25952D.writeString(str);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(10, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = queryLocalInterface instanceof zzbu ? (zzbu) queryLocalInterface : new zzbs(readStrongBinder);
        }
        m25951I.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(yd0 yd0Var, int i) {
        zzco zzcmVar;
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(9, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = queryLocalInterface instanceof zzco ? (zzco) queryLocalInterface : new zzcm(readStrongBinder);
        }
        m25951I.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(yd0 yd0Var, an3 an3Var, int i) {
        zzdj zzdhVar;
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(17, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = queryLocalInterface instanceof zzdj ? (zzdj) queryLocalInterface : new zzdh(readStrongBinder);
        }
        m25951I.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zc3 zzi(yd0 yd0Var, yd0 yd0Var2) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, yd0Var2);
        Parcel m25951I = m25951I(5, m25952D);
        zc3 zzbD = yc3.zzbD(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzbD;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final fd3 zzj(yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, yd0Var2);
        dp2.m24101g(m25952D, yd0Var3);
        Parcel m25951I = m25951I(11, m25952D);
        fd3 zze = ed3.zze(m25951I.readStrongBinder());
        m25951I.recycle();
        return zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ci3 zzk(yd0 yd0Var, an3 an3Var, int i, zh3 zh3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        dp2.m24101g(m25952D, zh3Var);
        Parcel m25951I = m25951I(16, m25952D);
        ci3 m26146g3 = bi3.m26146g3(m25951I.readStrongBinder());
        m25951I.recycle();
        return m26146g3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ar3 zzl(yd0 yd0Var, an3 an3Var, int i) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(15, m25952D);
        ar3 m1981g3 = zq3.m1981g3(m25951I.readStrongBinder());
        m25951I.recycle();
        return m1981g3;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final hr3 zzm(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        Parcel m25951I = m25951I(8, m25952D);
        hr3 zzF = gr3.zzF(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzF;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final fv3 zzn(yd0 yd0Var, an3 an3Var, int i) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final wv3 zzo(yd0 yd0Var, String str, an3 an3Var, int i) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeString(str);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(12, m25952D);
        wv3 zzq = vv3.zzq(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zy3 zzp(yd0 yd0Var, an3 an3Var, int i) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, an3Var);
        m25952D.writeInt(224400000);
        Parcel m25951I = m25951I(14, m25952D);
        zy3 zzb = yy3.zzb(m25951I.readStrongBinder());
        m25951I.recycle();
        return zzb;
    }
}
