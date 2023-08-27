package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public abstract class zzg extends zzd {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzy.zza(this);
    }

    protected abstract boolean zzy();

    protected void zzz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzu() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzv() {
        if (!zzu()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzy()) {
            return;
        }
        this.zzy.zzae();
        this.zza = true;
    }

    public final void zzx() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzz();
        this.zzy.zzae();
        this.zza = true;
    }
}
