package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes.dex */
public final class zzdl {
    final Uri zza;
    final String zzb;
    final String zzc;
    private final String zzd;
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    @Nullable
    private final zzdv<Context, Boolean> zzi;

    public zzdl(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzdl(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, @Nullable zzdv<Context, Boolean> zzdvVar) {
        this.zzd = null;
        this.zza = uri;
        this.zzb = str2;
        this.zzc = str3;
        this.zze = false;
        this.zzf = false;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzdc<Long> zza(String str, long j) {
        zzdc<Long> zzb;
        zzb = zzdc.zzb(this, str, j, true);
        return zzb;
    }

    public final zzdc<Boolean> zza(String str, boolean z) {
        zzdc<Boolean> zzb;
        zzb = zzdc.zzb(this, str, z, true);
        return zzb;
    }

    public final zzdc<Double> zza(String str, double d) {
        zzdc<Double> zzb;
        zzb = zzdc.zzb(this, str, -3.0d, true);
        return zzb;
    }

    public final zzdc<String> zza(String str, String str2) {
        zzdc<String> zzb;
        zzb = zzdc.zzb(this, str, str2, true);
        return zzb;
    }
}
