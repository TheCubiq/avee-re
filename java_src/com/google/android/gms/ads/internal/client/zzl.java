package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.l04;
import com.daaw.ot0;
import com.daaw.z71;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzn();
    public final int zza;
    @Deprecated
    public final long zzb;
    public final Bundle zzc;
    @Deprecated
    public final int zzd;
    public final List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfh zzj;
    public final Location zzk;
    public final String zzl;
    public final Bundle zzm;
    public final Bundle zzn;
    public final List zzo;
    public final String zzp;
    public final String zzq;
    @Deprecated
    public final boolean zzr;
    public final zzc zzs;
    public final int zzt;
    public final String zzu;
    public final List zzv;
    public final int zzw;
    public final String zzx;

    public zzl(int i, long j, Bundle bundle, int i2, List list, boolean z, int i3, boolean z2, String str, zzfh zzfhVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z3, zzc zzcVar, int i4, String str5, List list3, int i5, String str6) {
        this.zza = i;
        this.zzb = j;
        this.zzc = bundle == null ? new Bundle() : bundle;
        this.zzd = i2;
        this.zze = list;
        this.zzf = z;
        this.zzg = i3;
        this.zzh = z2;
        this.zzi = str;
        this.zzj = zzfhVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z3;
        this.zzs = zzcVar;
        this.zzt = i4;
        this.zzu = str5;
        this.zzv = list3 == null ? new ArrayList() : list3;
        this.zzw = i5;
        this.zzx = str6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzl) {
            zzl zzlVar = (zzl) obj;
            return this.zza == zzlVar.zza && this.zzb == zzlVar.zzb && l04.m17225a(this.zzc, zzlVar.zzc) && this.zzd == zzlVar.zzd && ot0.m13981a(this.zze, zzlVar.zze) && this.zzf == zzlVar.zzf && this.zzg == zzlVar.zzg && this.zzh == zzlVar.zzh && ot0.m13981a(this.zzi, zzlVar.zzi) && ot0.m13981a(this.zzj, zzlVar.zzj) && ot0.m13981a(this.zzk, zzlVar.zzk) && ot0.m13981a(this.zzl, zzlVar.zzl) && l04.m17225a(this.zzm, zzlVar.zzm) && l04.m17225a(this.zzn, zzlVar.zzn) && ot0.m13981a(this.zzo, zzlVar.zzo) && ot0.m13981a(this.zzp, zzlVar.zzp) && ot0.m13981a(this.zzq, zzlVar.zzq) && this.zzr == zzlVar.zzr && this.zzt == zzlVar.zzt && ot0.m13981a(this.zzu, zzlVar.zzu) && ot0.m13981a(this.zzv, zzlVar.zzv) && this.zzw == zzlVar.zzw && ot0.m13981a(this.zzx, zzlVar.zzx);
        }
        return false;
    }

    public final int hashCode() {
        return ot0.m13980b(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc, Integer.valueOf(this.zzd), this.zze, Boolean.valueOf(this.zzf), Integer.valueOf(this.zzg), Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, Boolean.valueOf(this.zzr), Integer.valueOf(this.zzt), this.zzu, this.zzv, Integer.valueOf(this.zzw), this.zzx);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m2733a = z71.m2733a(parcel);
        z71.m2723k(parcel, 1, this.zza);
        z71.m2720n(parcel, 2, this.zzb);
        z71.m2729e(parcel, 3, this.zzc, false);
        z71.m2723k(parcel, 4, this.zzd);
        z71.m2715s(parcel, 5, this.zze, false);
        z71.m2731c(parcel, 6, this.zzf);
        z71.m2723k(parcel, 7, this.zzg);
        z71.m2731c(parcel, 8, this.zzh);
        z71.m2717q(parcel, 9, this.zzi, false);
        z71.m2718p(parcel, 10, this.zzj, i, false);
        z71.m2718p(parcel, 11, this.zzk, i, false);
        z71.m2717q(parcel, 12, this.zzl, false);
        z71.m2729e(parcel, 13, this.zzm, false);
        z71.m2729e(parcel, 14, this.zzn, false);
        z71.m2715s(parcel, 15, this.zzo, false);
        z71.m2717q(parcel, 16, this.zzp, false);
        z71.m2717q(parcel, 17, this.zzq, false);
        z71.m2731c(parcel, 18, this.zzr);
        z71.m2718p(parcel, 19, this.zzs, i, false);
        z71.m2723k(parcel, 20, this.zzt);
        z71.m2717q(parcel, 21, this.zzu, false);
        z71.m2715s(parcel, 22, this.zzv, false);
        z71.m2723k(parcel, 23, this.zzw);
        z71.m2717q(parcel, 24, this.zzx, false);
        z71.m2732b(parcel, m2733a);
    }
}
