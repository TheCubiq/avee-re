package com.google.android.gms.internal.ads;
@zzadh
/* loaded from: classes2.dex */
public abstract class zzadz implements zzadx, zzalc<Void> {
    private final Object mLock = new Object();
    private final zzaol<zzaef> zzccp;
    private final zzadx zzccq;

    public zzadz(zzaol<zzaef> zzaolVar, zzadx zzadxVar) {
        this.zzccp = zzaolVar;
        this.zzccq = zzadxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzalc
    public final void cancel() {
        zznz();
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final void zza(zzaej zzaejVar) {
        synchronized (this.mLock) {
            this.zzccq.zza(zzaejVar);
            zznz();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(zzaen zzaenVar, zzaef zzaefVar) {
        try {
            zzaenVar.zza(zzaefVar, new zzaei(this));
            return true;
        } catch (Throwable th) {
            zzakb.zzc("Could not fetch ad response from ad request service due to an Exception.", th);
            com.google.android.gms.ads.internal.zzbv.zzeo().zza(th, "AdRequestClientTask.getAdResponseFromService");
            this.zzccq.zza(new zzaej(0));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalc
    public final /* synthetic */ Void zznt() {
        zzaen zzoa = zzoa();
        if (zzoa != null) {
            this.zzccp.zza(new zzaea(this, zzoa), new zzaeb(this));
            return null;
        }
        this.zzccq.zza(new zzaej(0));
        zznz();
        return null;
    }

    public abstract void zznz();

    public abstract zzaen zzoa();
}
