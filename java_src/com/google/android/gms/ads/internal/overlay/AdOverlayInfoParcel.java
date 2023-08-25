package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.a74;
import com.daaw.br4;
import com.daaw.cq5;
import com.daaw.g93;
import com.daaw.kd5;
import com.daaw.mf3;
import com.daaw.nt0;
import com.daaw.of3;
import com.daaw.on6;
import com.daaw.vy4;
import com.daaw.yd0;
import com.daaw.z71;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzchu;
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    public final zzc zza;
    public final com.google.android.gms.ads.internal.client.zza zzb;
    public final zzo zzc;
    public final a74 zzd;
    public final of3 zze;
    public final String zzf;
    public final boolean zzg;
    public final String zzh;
    public final zzz zzi;
    public final int zzj;
    public final int zzk;
    public final String zzl;
    public final zzchu zzm;
    public final String zzn;
    public final com.google.android.gms.ads.internal.zzj zzo;
    public final mf3 zzp;
    public final String zzq;
    public final cq5 zzr;
    public final kd5 zzs;
    public final on6 zzt;
    public final zzbr zzu;
    public final String zzv;
    public final String zzw;
    public final br4 zzx;
    public final vy4 zzy;

    public AdOverlayInfoParcel(a74 a74Var, zzchu zzchuVar, zzbr zzbrVar, cq5 cq5Var, kd5 kd5Var, on6 on6Var, String str, String str2, int i) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = a74Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = 14;
        this.zzk = 5;
        this.zzl = null;
        this.zzm = zzchuVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = str;
        this.zzv = str2;
        this.zzr = cq5Var;
        this.zzs = kd5Var;
        this.zzt = on6Var;
        this.zzu = zzbrVar;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, mf3 mf3Var, of3 of3Var, zzz zzzVar, a74 a74Var, boolean z, int i, String str, zzchu zzchuVar, vy4 vy4Var) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = a74Var;
        this.zzp = mf3Var;
        this.zze = of3Var;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = str;
        this.zzm = zzchuVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = vy4Var;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, mf3 mf3Var, of3 of3Var, zzz zzzVar, a74 a74Var, boolean z, int i, String str, String str2, zzchu zzchuVar, vy4 vy4Var) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = a74Var;
        this.zzp = mf3Var;
        this.zze = of3Var;
        this.zzf = str2;
        this.zzg = z;
        this.zzh = str;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 3;
        this.zzl = null;
        this.zzm = zzchuVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = vy4Var;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, a74 a74Var, int i, zzchu zzchuVar, String str, com.google.android.gms.ads.internal.zzj zzjVar, String str2, String str3, String str4, br4 br4Var) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzoVar;
        this.zzd = a74Var;
        this.zzp = null;
        this.zze = null;
        this.zzg = false;
        if (((Boolean) zzba.zzc().b(g93.C0)).booleanValue()) {
            this.zzf = null;
            this.zzh = null;
        } else {
            this.zzf = str2;
            this.zzh = str3;
        }
        this.zzi = null;
        this.zzj = i;
        this.zzk = 1;
        this.zzl = null;
        this.zzm = zzchuVar;
        this.zzn = str;
        this.zzo = zzjVar;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = str4;
        this.zzx = br4Var;
        this.zzy = null;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, a74 a74Var, boolean z, int i, zzchu zzchuVar, vy4 vy4Var) {
        this.zza = null;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = a74Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = z;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = i;
        this.zzk = 2;
        this.zzl = null;
        this.zzm = zzchuVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = vy4Var;
    }

    public AdOverlayInfoParcel(zzc zzcVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzchu zzchuVar, String str4, com.google.android.gms.ads.internal.zzj zzjVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.zza = zzcVar;
        this.zzb = (com.google.android.gms.ads.internal.client.zza) nt0.M(yd0.a.I(iBinder));
        this.zzc = (zzo) nt0.M(yd0.a.I(iBinder2));
        this.zzd = (a74) nt0.M(yd0.a.I(iBinder3));
        this.zzp = (mf3) nt0.M(yd0.a.I(iBinder6));
        this.zze = (of3) nt0.M(yd0.a.I(iBinder4));
        this.zzf = str;
        this.zzg = z;
        this.zzh = str2;
        this.zzi = (zzz) nt0.M(yd0.a.I(iBinder5));
        this.zzj = i;
        this.zzk = i2;
        this.zzl = str3;
        this.zzm = zzchuVar;
        this.zzn = str4;
        this.zzo = zzjVar;
        this.zzq = str5;
        this.zzv = str6;
        this.zzr = (cq5) nt0.M(yd0.a.I(iBinder7));
        this.zzs = (kd5) nt0.M(yd0.a.I(iBinder8));
        this.zzt = (on6) nt0.M(yd0.a.I(iBinder9));
        this.zzu = (zzbr) nt0.M(yd0.a.I(iBinder10));
        this.zzw = str7;
        this.zzx = (br4) nt0.M(yd0.a.I(iBinder11));
        this.zzy = (vy4) nt0.M(yd0.a.I(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzcVar, com.google.android.gms.ads.internal.client.zza zzaVar, zzo zzoVar, zzz zzzVar, zzchu zzchuVar, a74 a74Var, vy4 vy4Var) {
        this.zza = zzcVar;
        this.zzb = zzaVar;
        this.zzc = zzoVar;
        this.zzd = a74Var;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = zzzVar;
        this.zzj = -1;
        this.zzk = 4;
        this.zzl = null;
        this.zzm = zzchuVar;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = vy4Var;
    }

    public AdOverlayInfoParcel(zzo zzoVar, a74 a74Var, int i, zzchu zzchuVar) {
        this.zzc = zzoVar;
        this.zzd = a74Var;
        this.zzj = 1;
        this.zzm = zzchuVar;
        this.zza = null;
        this.zzb = null;
        this.zzp = null;
        this.zze = null;
        this.zzf = null;
        this.zzg = false;
        this.zzh = null;
        this.zzi = null;
        this.zzk = 1;
        this.zzl = null;
        this.zzn = null;
        this.zzo = null;
        this.zzq = null;
        this.zzv = null;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
        this.zzw = null;
        this.zzx = null;
        this.zzy = null;
    }

    public static AdOverlayInfoParcel zza(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = z71.a(parcel);
        z71.p(parcel, 2, this.zza, i, false);
        z71.j(parcel, 3, nt0.g3(this.zzb).asBinder(), false);
        z71.j(parcel, 4, nt0.g3(this.zzc).asBinder(), false);
        z71.j(parcel, 5, nt0.g3(this.zzd).asBinder(), false);
        z71.j(parcel, 6, nt0.g3(this.zze).asBinder(), false);
        z71.q(parcel, 7, this.zzf, false);
        z71.c(parcel, 8, this.zzg);
        z71.q(parcel, 9, this.zzh, false);
        z71.j(parcel, 10, nt0.g3(this.zzi).asBinder(), false);
        z71.k(parcel, 11, this.zzj);
        z71.k(parcel, 12, this.zzk);
        z71.q(parcel, 13, this.zzl, false);
        z71.p(parcel, 14, this.zzm, i, false);
        z71.q(parcel, 16, this.zzn, false);
        z71.p(parcel, 17, this.zzo, i, false);
        z71.j(parcel, 18, nt0.g3(this.zzp).asBinder(), false);
        z71.q(parcel, 19, this.zzq, false);
        z71.j(parcel, 20, nt0.g3(this.zzr).asBinder(), false);
        z71.j(parcel, 21, nt0.g3(this.zzs).asBinder(), false);
        z71.j(parcel, 22, nt0.g3(this.zzt).asBinder(), false);
        z71.j(parcel, 23, nt0.g3(this.zzu).asBinder(), false);
        z71.q(parcel, 24, this.zzv, false);
        z71.q(parcel, 25, this.zzw, false);
        z71.j(parcel, 26, nt0.g3(this.zzx).asBinder(), false);
        z71.j(parcel, 27, nt0.g3(this.zzy).asBinder(), false);
        z71.b(parcel, a);
    }
}
