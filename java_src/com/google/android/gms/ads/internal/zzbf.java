package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzoo;
import com.google.android.gms.internal.ads.zzoq;
import com.google.android.gms.internal.ads.zzov;
import com.google.android.gms.internal.ads.zzpb;
import java.util.List;
/* loaded from: classes.dex */
final class zzbf implements Runnable {
    private final /* synthetic */ zzbc zzaaf;
    private final /* synthetic */ int zzaag;
    private final /* synthetic */ zzpb zzaaj;
    private final /* synthetic */ List zzaak;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbf(zzbc zzbcVar, zzpb zzpbVar, int i, List list) {
        this.zzaaf = zzbcVar;
        this.zzaaj = zzpbVar;
        this.zzaag = i;
        this.zzaak = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzov zza;
        zzov zza2;
        try {
            if ((this.zzaaj instanceof zzoq) && this.zzaaf.zzvw.zzadg != null) {
                this.zzaaf.zzvu = this.zzaag != this.zzaak.size() - 1;
                zza2 = zzbc.zza(this.zzaaj);
                this.zzaaf.zzvw.zzadg.zza(zza2);
                this.zzaaf.zzb(zza2.zzka());
            } else if ((this.zzaaj instanceof zzoq) && this.zzaaf.zzvw.zzadf != null) {
                this.zzaaf.zzvu = this.zzaag != this.zzaak.size() - 1;
                zzoq zzoqVar = (zzoq) this.zzaaj;
                this.zzaaf.zzvw.zzadf.zza(zzoqVar);
                this.zzaaf.zzb(zzoqVar.zzka());
            } else if ((this.zzaaj instanceof zzoo) && this.zzaaf.zzvw.zzadg != null) {
                this.zzaaf.zzvu = this.zzaag != this.zzaak.size() - 1;
                zza = zzbc.zza(this.zzaaj);
                this.zzaaf.zzvw.zzadg.zza(zza);
                this.zzaaf.zzb(zza.zzka());
            } else if (!(this.zzaaj instanceof zzoo) || this.zzaaf.zzvw.zzade == null) {
                this.zzaaf.zzc(3, this.zzaag != this.zzaak.size() - 1);
            } else {
                this.zzaaf.zzvu = this.zzaag != this.zzaak.size() - 1;
                zzoo zzooVar = (zzoo) this.zzaaj;
                this.zzaaf.zzvw.zzade.zza(zzooVar);
                this.zzaaf.zzb(zzooVar.zzka());
            }
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
