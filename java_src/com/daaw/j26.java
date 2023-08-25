package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzew;
/* loaded from: classes.dex */
public final class j26 implements Runnable {

    /* renamed from: p */
    public final /* synthetic */ zzew f14187p;

    public j26(zzew zzewVar) {
        this.f14187p = zzewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar;
        zzbh zzbhVar2;
        zzew zzewVar = this.f14187p;
        zzbhVar = zzewVar.f36183p;
        if (zzbhVar != null) {
            try {
                zzbhVar2 = zzewVar.f36183p;
                zzbhVar2.zze(1);
            } catch (RemoteException e) {
                k04.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
