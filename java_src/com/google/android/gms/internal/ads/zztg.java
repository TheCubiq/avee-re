package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;
/* loaded from: classes2.dex */
final class zztg extends zzkf {
    private final /* synthetic */ zzst zzbnw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztg(zzst zzstVar) {
        this.zzbnw = zzstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzke
    public final void onAdClicked() throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zzth(this));
    }
}
