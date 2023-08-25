package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.daaw.k04;
import com.google.android.gms.ads.MuteThisAdReason;
/* loaded from: classes.dex */
public final class zzcx implements MuteThisAdReason {

    /* renamed from: a */
    public final String f36109a;

    /* renamed from: b */
    public final zzcw f36110b;

    public zzcx(zzcw zzcwVar) {
        String str;
        this.f36110b = zzcwVar;
        try {
            str = zzcwVar.zze();
        } catch (RemoteException e) {
            k04.zzh("", e);
            str = null;
        }
        this.f36109a = str;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.f36109a;
    }

    public final String toString() {
        return this.f36109a;
    }

    public final zzcw zza() {
        return this.f36110b;
    }
}
