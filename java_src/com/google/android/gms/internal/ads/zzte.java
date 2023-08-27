package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;
/* loaded from: classes2.dex */
final class zzte extends zzoe {
    private final /* synthetic */ zzst zzbnw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzte(zzst zzstVar) {
        this.zzbnw = zzstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final void zza(zzoa zzoaVar) throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztf(this, zzoaVar));
    }
}
