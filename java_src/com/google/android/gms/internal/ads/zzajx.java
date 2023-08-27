package com.google.android.gms.internal.ads;
@zzadh
/* loaded from: classes2.dex */
public abstract class zzajx implements zzalc<zzanz> {
    private volatile Thread zzcqr;
    private final Runnable zzy = new zzajy(this);
    private boolean zzcqs = false;

    public zzajx() {
    }

    public zzajx(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzalc
    public final void cancel() {
        onStop();
        if (this.zzcqr != null) {
            this.zzcqr.interrupt();
        }
    }

    public abstract void onStop();

    public abstract void zzdn();

    @Override // com.google.android.gms.internal.ads.zzalc
    public final /* synthetic */ zzanz zznt() {
        return this.zzcqs ? zzaki.zzc(this.zzy) : zzaki.zzb(this.zzy);
    }

    public final zzanz zzqo() {
        return this.zzcqs ? zzaki.zzc(this.zzy) : zzaki.zzb(this.zzy);
    }
}
