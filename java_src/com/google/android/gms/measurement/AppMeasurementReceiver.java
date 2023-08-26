package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzfs;
import com.google.android.gms.measurement.internal.zzft;
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzfs {
    private zzft zza;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzft(this);
        }
        this.zza.zza(context, intent);
    }

    @Override // com.google.android.gms.measurement.internal.zzfs
    public final void doStartService(Context context, Intent intent) {
        startWakefulService(context, intent);
    }

    public final BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }
}
