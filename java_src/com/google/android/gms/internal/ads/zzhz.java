package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
public final class zzhz {
    private final byte[] zzalp;
    private int zzalq;
    private int zzalr;
    private final /* synthetic */ zzhx zzals;

    private zzhz(zzhx zzhxVar, byte[] bArr) {
        this.zzals = zzhxVar;
        this.zzalp = bArr;
    }

    public final synchronized void zzbd() {
        try {
            if (this.zzals.zzalo) {
                this.zzals.zzaln.zzc(this.zzalp);
                this.zzals.zzaln.zzg(this.zzalq);
                this.zzals.zzaln.zzh(this.zzalr);
                this.zzals.zzaln.zza(null);
                this.zzals.zzaln.zzbd();
            }
        } catch (RemoteException e) {
            zzane.zza("Clearcut log failed", e);
        }
    }

    public final zzhz zzr(int i) {
        this.zzalq = i;
        return this;
    }

    public final zzhz zzs(int i) {
        this.zzalr = i;
        return this;
    }
}
