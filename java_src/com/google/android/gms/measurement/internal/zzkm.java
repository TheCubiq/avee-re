package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@17.5.0 */
/* loaded from: classes2.dex */
public abstract class zzkm extends zzkn {
    private boolean zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkm(zzkp zzkpVar) {
        super(zzkpVar);
        this.zza.zza(this);
    }

    protected abstract boolean zzd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzai() {
        return this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaj() {
        if (!zzai()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzak() {
        if (this.zzb) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzd();
        this.zza.zzs();
        this.zzb = true;
    }
}
