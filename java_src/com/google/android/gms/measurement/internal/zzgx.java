package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgx extends zzgu {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgx(zzgb zzgbVar) {
        super(zzgbVar);
        this.zzy.zza(this);
    }

    protected void g_() {
    }

    protected abstract boolean zzd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzz() {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzaa() {
        if (!zzz()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzab() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (zzd()) {
            return;
        }
        this.zzy.zzae();
        this.zza = true;
    }

    public final void zzac() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        g_();
        this.zzy.zzae();
        this.zza = true;
    }
}
