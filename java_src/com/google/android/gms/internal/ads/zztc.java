package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.List;
/* loaded from: classes2.dex */
final class zztc extends zzlb {
    private final /* synthetic */ zzst zzbnw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztc(zzst zzstVar) {
        this.zzbnw = zzstVar;
    }

    @Override // com.google.android.gms.internal.ads.zzla
    public final void onAppEvent(String str, String str2) throws RemoteException {
        List list;
        list = this.zzbnw.zzxo;
        list.add(new zztd(this, str, str2));
    }
}
