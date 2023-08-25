package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final float zze;
    public final int zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzj(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = f;
        this.zzf = i;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = z6;
    }

    public zzj(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f, -1, z4, z5, z6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2731c(parcel, 2, this.zza);
        z71.m2731c(parcel, 3, this.zzb);
        z71.m2717q(parcel, 4, this.zzc, false);
        z71.m2731c(parcel, 5, this.zzd);
        z71.m2726h(parcel, 6, this.zze);
        z71.m2723k(parcel, 7, this.zzf);
        z71.m2731c(parcel, 8, this.zzg);
        z71.m2731c(parcel, 9, this.zzh);
        z71.m2731c(parcel, 10, this.zzi);
        z71.m2732b(parcel, m2733a);
    }
}
