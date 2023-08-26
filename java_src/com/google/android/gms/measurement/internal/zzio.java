package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzio implements Runnable {
    private final /* synthetic */ zzin zza;
    private final /* synthetic */ zzin zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ boolean zzd;
    private final /* synthetic */ zzim zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzio(zzim zzimVar, zzin zzinVar, zzin zzinVar2, long j, boolean z) {
        this.zze = zzimVar;
        this.zza = zzinVar;
        this.zzb = zzinVar2;
        this.zzc = j;
        this.zzd = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zza(this.zza, this.zzb, this.zzc, this.zzd, (Bundle) null);
    }
}
