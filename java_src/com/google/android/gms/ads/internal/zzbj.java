package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzajh;
import com.google.android.gms.internal.ads.zzakb;
import com.google.android.gms.internal.ads.zzos;
/* loaded from: classes.dex */
final class zzbj implements Runnable {
    private final /* synthetic */ zzbc zzaaf;
    private final /* synthetic */ String zzaal;
    private final /* synthetic */ zzajh zzaam;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(zzbc zzbcVar, String str, zzajh zzajhVar) {
        this.zzaaf = zzbcVar;
        this.zzaal = str;
        this.zzaam = zzajhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzaaf.zzvw.zzadi.get(this.zzaal).zzb((zzos) this.zzaam.zzcoj);
        } catch (RemoteException e) {
            zzakb.zzd("#007 Could not call remote method.", e);
        }
    }
}
