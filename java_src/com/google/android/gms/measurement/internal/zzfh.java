package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public class zzfh extends BroadcastReceiver {
    private static final String zza = zzfh.class.getName();
    private final zzkp zzb;
    private boolean zzc;
    private boolean zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfh(zzkp zzkpVar) {
        Preconditions.checkNotNull(zzkpVar);
        this.zzb = zzkpVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.zzb.zzn();
        String action = intent.getAction();
        this.zzb.zzq().zzw().zza("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zze = this.zzb.zzd().zze();
            if (this.zzd != zze) {
                this.zzd = zze;
                this.zzb.zzp().zza(new zzfg(this, zze));
                return;
            }
            return;
        }
        this.zzb.zzq().zzh().zza("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void zza() {
        this.zzb.zzn();
        this.zzb.zzp().zzc();
        if (this.zzc) {
            return;
        }
        this.zzb.zzm().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzd = this.zzb.zzd().zze();
        this.zzb.zzq().zzw().zza("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzb() {
        this.zzb.zzn();
        this.zzb.zzp().zzc();
        this.zzb.zzp().zzc();
        if (this.zzc) {
            this.zzb.zzq().zzw().zza("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zzm().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.zzb.zzq().zze().zza("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
