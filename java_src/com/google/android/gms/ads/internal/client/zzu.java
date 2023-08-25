package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public final String zza;
    public long zzb;
    public zze zzc;
    public final Bundle zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;

    public zzu(String str, long j, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.zza = str;
        this.zzb = j;
        this.zzc = zzeVar;
        this.zzd = bundle;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = str4;
        this.zzh = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2717q(parcel, 1, this.zza, false);
        z71.m2720n(parcel, 2, this.zzb);
        z71.m2718p(parcel, 3, this.zzc, i, false);
        z71.m2729e(parcel, 4, this.zzd, false);
        z71.m2717q(parcel, 5, this.zze, false);
        z71.m2717q(parcel, 6, this.zzf, false);
        z71.m2717q(parcel, 7, this.zzg, false);
        z71.m2717q(parcel, 8, this.zzh, false);
        z71.m2732b(parcel, m2733a);
    }
}
