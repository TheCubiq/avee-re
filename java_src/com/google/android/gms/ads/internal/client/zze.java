package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.z71;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public zze zzd;
    public IBinder zze;

    public zze(int i, String str, String str2, zze zzeVar, IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.zza);
        z71.m2717q(parcel, 2, this.zzb, false);
        z71.m2717q(parcel, 3, this.zzc, false);
        z71.m2718p(parcel, 4, this.zzd, i, false);
        z71.m2724j(parcel, 5, this.zze, false);
        z71.m2732b(parcel, m2733a);
    }

    public final AdError zza() {
        zze zzeVar = this.zzd;
        return new AdError(this.zza, this.zzb, this.zzc, zzeVar == null ? null : new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
    }

    public final LoadAdError zzb() {
        zze zzeVar = this.zzd;
        zzdn zzdnVar = null;
        AdError adError = zzeVar == null ? null : new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        int i = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdnVar = queryLocalInterface instanceof zzdn ? (zzdn) queryLocalInterface : new zzdl(iBinder);
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.zza(zzdnVar));
    }
}
