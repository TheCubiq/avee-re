package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzip implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzin zzb;
    private final /* synthetic */ zzin zzc;
    private final /* synthetic */ long zzd;
    private final /* synthetic */ zzim zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zzim zzimVar, Bundle bundle, zzin zzinVar, zzin zzinVar2, long j) {
        this.zze = zzimVar;
        this.zza = bundle;
        this.zzb = zzinVar;
        this.zzc = zzinVar2;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
