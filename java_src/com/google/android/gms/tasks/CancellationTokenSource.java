package com.google.android.gms.tasks;
/* loaded from: classes2.dex */
public class CancellationTokenSource {
    private final zza zzc = new zza();

    public CancellationToken getToken() {
        return this.zzc;
    }

    public void cancel() {
        this.zzc.cancel();
    }
}
