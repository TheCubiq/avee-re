package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import java.util.concurrent.Future;
@zzadh
/* loaded from: classes2.dex */
public final class zzahn extends zzajx implements zzaht, zzahw, zzaia {
    private final Context mContext;
    public final String zzbth;
    private final zzaji zzbze;
    private final zzaib zzcll;
    private final zzahw zzclm;
    private final String zzcln;
    private final zzwx zzclo;
    private final long zzclp;
    private zzahq zzclr;
    private Future zzcls;
    private volatile com.google.android.gms.ads.internal.gmsg.zzb zzclt;
    private int zzclq = 0;
    private int mErrorCode = 3;
    private final Object mLock = new Object();

    public zzahn(Context context, String str, String str2, zzwx zzwxVar, zzaji zzajiVar, zzaib zzaibVar, zzahw zzahwVar, long j) {
        this.mContext = context;
        this.zzbth = str;
        this.zzcln = str2;
        this.zzclo = zzwxVar;
        this.zzbze = zzajiVar;
        this.zzcll = zzaibVar;
        this.zzclm = zzahwVar;
        this.zzclp = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzjj zzjjVar, zzxq zzxqVar) {
        this.zzcll.zzpf().zza((zzahw) this);
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(this.zzbth)) {
                zzxqVar.zza(zzjjVar, this.zzcln, this.zzclo.zzbrr);
            } else {
                zzxqVar.zzc(zzjjVar, this.zzcln);
            }
        } catch (RemoteException e) {
            zzakb.zzc("Fail to load ad from adapter.", e);
            zza(this.zzbth, 0);
        }
    }

    private final boolean zzf(long j) {
        int i;
        long elapsedRealtime = this.zzclp - (com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime() - j);
        if (elapsedRealtime <= 0) {
            i = 4;
        } else {
            try {
                this.mLock.wait(elapsedRealtime);
                return true;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                i = 5;
            }
        }
        this.mErrorCode = i;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void onStop() {
    }

    public final void zza(com.google.android.gms.ads.internal.gmsg.zzb zzbVar) {
        this.zzclt = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void zza(String str, int i) {
        synchronized (this.mLock) {
            this.zzclq = 2;
            this.mErrorCode = i;
            this.mLock.notify();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzac(int i) {
        zza(this.zzbth, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final void zzc(Bundle bundle) {
        com.google.android.gms.ads.internal.gmsg.zzb zzbVar = this.zzclt;
        if (zzbVar != null) {
            zzbVar.zza("", bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahw
    public final void zzcb(String str) {
        synchronized (this.mLock) {
            this.zzclq = 1;
            this.mLock.notify();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zzdn() {
        Handler handler;
        Runnable zzahpVar;
        zzaib zzaibVar = this.zzcll;
        if (zzaibVar == null || zzaibVar.zzpf() == null || this.zzcll.zzpe() == null) {
            return;
        }
        zzahv zzpf = this.zzcll.zzpf();
        zzpf.zza((zzahw) null);
        zzpf.zza((zzaht) this);
        zzpf.zza((zzaia) this);
        zzjj zzjjVar = this.zzbze.zzcgs.zzccv;
        zzxq zzpe = this.zzcll.zzpe();
        try {
            if (zzpe.isInitialized()) {
                handler = zzamu.zzsy;
                zzahpVar = new zzaho(this, zzjjVar, zzpe);
            } else {
                handler = zzamu.zzsy;
                zzahpVar = new zzahp(this, zzpe, zzjjVar, zzpf);
            }
            handler.post(zzahpVar);
        } catch (RemoteException e) {
            zzakb.zzc("Fail to check if adapter is initialized.", e);
            zza(this.zzbth, 0);
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime();
        while (true) {
            synchronized (this.mLock) {
                if (this.zzclq == 0) {
                    if (!zzf(elapsedRealtime)) {
                        this.zzclr = new zzahs().zzad(this.mErrorCode).zzg(com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime() - elapsedRealtime).zzcc(this.zzbth).zzcd(this.zzclo.zzbru).zzpd();
                        break;
                    }
                } else {
                    this.zzclr = new zzahs().zzg(com.google.android.gms.ads.internal.zzbv.zzer().elapsedRealtime() - elapsedRealtime).zzad(1 == this.zzclq ? 6 : this.mErrorCode).zzcc(this.zzbth).zzcd(this.zzclo.zzbru).zzpd();
                }
            }
        }
        zzpf.zza((zzahw) null);
        zzpf.zza((zzaht) null);
        if (this.zzclq == 1) {
            this.zzclm.zzcb(this.zzbth);
        } else {
            this.zzclm.zza(this.zzbth, this.mErrorCode);
        }
    }

    public final Future zzoz() {
        Future future = this.zzcls;
        if (future != null) {
            return future;
        }
        zzanz zzanzVar = (zzanz) zznt();
        this.zzcls = zzanzVar;
        return zzanzVar;
    }

    public final zzahq zzpa() {
        zzahq zzahqVar;
        synchronized (this.mLock) {
            zzahqVar = this.zzclr;
        }
        return zzahqVar;
    }

    public final zzwx zzpb() {
        return this.zzclo;
    }

    @Override // com.google.android.gms.internal.ads.zzaht
    public final void zzpc() {
        zza(this.zzbze.zzcgs.zzccv, this.zzcll.zzpe());
    }
}
