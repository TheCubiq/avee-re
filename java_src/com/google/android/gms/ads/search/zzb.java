package com.google.android.gms.ads.search;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.mediation.NetworkExtras;
/* loaded from: classes.dex */
public final class zzb {
    public final zzdw a = new zzdw();
    public String b;

    public static /* bridge */ /* synthetic */ zzdw a(zzb zzbVar) {
        return zzbVar.a;
    }

    public static /* bridge */ /* synthetic */ String b(zzb zzbVar) {
        return zzbVar.b;
    }

    public final zzb zzb(Class cls, Bundle bundle) {
        this.a.zzr(cls, bundle);
        return this;
    }

    public final zzb zzc(NetworkExtras networkExtras) {
        this.a.zzv(networkExtras);
        return this;
    }

    public final zzb zzd(Class cls, Bundle bundle) {
        this.a.zzu(cls, bundle);
        return this;
    }

    public final zzb zze(String str) {
        this.b = str;
        return this;
    }
}
