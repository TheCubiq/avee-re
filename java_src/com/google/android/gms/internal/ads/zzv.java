package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class zzv {
    private final zzm zzaa;
    private final AtomicInteger zzba;
    private final Set<zzr<?>> zzbb;
    private final PriorityBlockingQueue<zzr<?>> zzbc;
    private final PriorityBlockingQueue<zzr<?>> zzbd;
    private final zzn[] zzbe;
    private final List<zzw> zzbf;
    private final zzb zzj;
    private final zzaa zzk;
    private zzd zzq;

    public zzv(zzb zzbVar, zzm zzmVar) {
        this(zzbVar, zzmVar, 4);
    }

    private zzv(zzb zzbVar, zzm zzmVar, int i) {
        this(zzbVar, zzmVar, 4, new zzi(new Handler(Looper.getMainLooper())));
    }

    private zzv(zzb zzbVar, zzm zzmVar, int i, zzaa zzaaVar) {
        this.zzba = new AtomicInteger();
        this.zzbb = new HashSet();
        this.zzbc = new PriorityBlockingQueue<>();
        this.zzbd = new PriorityBlockingQueue<>();
        this.zzbf = new ArrayList();
        this.zzj = zzbVar;
        this.zzaa = zzmVar;
        this.zzbe = new zzn[4];
        this.zzk = zzaaVar;
    }

    public final void start() {
        zzn[] zznVarArr;
        zzd zzdVar = this.zzq;
        if (zzdVar != null) {
            zzdVar.quit();
        }
        for (zzn zznVar : this.zzbe) {
            if (zznVar != null) {
                zznVar.quit();
            }
        }
        zzd zzdVar2 = new zzd(this.zzbc, this.zzbd, this.zzj, this.zzk);
        this.zzq = zzdVar2;
        zzdVar2.start();
        for (int i = 0; i < this.zzbe.length; i++) {
            zzn zznVar2 = new zzn(this.zzbd, this.zzaa, this.zzj, this.zzk);
            this.zzbe[i] = zznVar2;
            zznVar2.start();
        }
    }

    public final <T> zzr<T> zze(zzr<T> zzrVar) {
        zzrVar.zza(this);
        synchronized (this.zzbb) {
            this.zzbb.add(zzrVar);
        }
        zzrVar.zza(this.zzba.incrementAndGet());
        zzrVar.zzb("add-to-queue");
        (!zzrVar.zzh() ? this.zzbd : this.zzbc).add(zzrVar);
        return zzrVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> void zzf(zzr<T> zzrVar) {
        synchronized (this.zzbb) {
            this.zzbb.remove(zzrVar);
        }
        synchronized (this.zzbf) {
            for (zzw zzwVar : this.zzbf) {
                zzwVar.zzg(zzrVar);
            }
        }
    }
}
