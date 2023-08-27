package com.google.android.gms.internal.ads;
/* loaded from: classes2.dex */
public final class zzvs extends zzaop<zzwb> {
    private final Object mLock = new Object();
    private final zzvw zzbqq;
    private boolean zzbqr;

    public zzvs(zzvw zzvwVar) {
        this.zzbqq = zzvwVar;
    }

    public final void release() {
        synchronized (this.mLock) {
            if (this.zzbqr) {
                return;
            }
            this.zzbqr = true;
            zza(new zzvt(this), new zzaon());
            zza(new zzvu(this), new zzvv(this));
        }
    }
}
