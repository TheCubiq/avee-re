package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public final class zzfr implements ServiceConnection {
    final /* synthetic */ zzfo zza;
    private final String zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfr(zzfo zzfoVar, String str) {
        this.zza = zzfoVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.zza.zza.zzq().zzh().zza("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzd zza = com.google.android.gms.internal.measurement.zzg.zza(iBinder);
            if (zza == null) {
                this.zza.zza.zzq().zzh().zza("Install Referrer Service implementation was not found");
                return;
            }
            this.zza.zza.zzq().zzw().zza("Install Referrer Service connected");
            this.zza.zza.zzp().zza(new zzfq(this, zza, this));
        } catch (Exception e) {
            this.zza.zza.zzq().zzh().zza("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zza.zzq().zzw().zza("Install Referrer Service disconnected");
    }
}
