package com.google.android.gms.ads.internal.util;

import com.daaw.ot0;
/* loaded from: classes.dex */
public final class zzbc {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbc(String str, double d, double d2, double d3, int i) {
        this.zza = str;
        this.zzc = d;
        this.zzb = d2;
        this.zzd = d3;
        this.zze = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbc) {
            zzbc zzbcVar = (zzbc) obj;
            return ot0.a(this.zza, zzbcVar.zza) && this.zzb == zzbcVar.zzb && this.zzc == zzbcVar.zzc && this.zze == zzbcVar.zze && Double.compare(this.zzd, zzbcVar.zzd) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return ot0.b(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return ot0.c(this).a("name", this.zza).a("minBound", Double.valueOf(this.zzc)).a("maxBound", Double.valueOf(this.zzb)).a("percent", Double.valueOf(this.zzd)).a("count", Integer.valueOf(this.zze)).toString();
    }
}
