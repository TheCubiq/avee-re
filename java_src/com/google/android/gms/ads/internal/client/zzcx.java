package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.daaw.k04;
import com.google.android.gms.ads.MuteThisAdReason;
/* loaded from: classes.dex */
public final class zzcx implements MuteThisAdReason {
    public final String a;
    public final zzcw b;

    public zzcx(zzcw zzcwVar) {
        String str;
        this.b = zzcwVar;
        try {
            str = zzcwVar.zze();
        } catch (RemoteException e) {
            k04.zzh("", e);
            str = null;
        }
        this.a = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }

    public final zzcw zza() {
        return this.b;
    }
}
