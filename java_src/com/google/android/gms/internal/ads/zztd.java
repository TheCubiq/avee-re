package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* loaded from: classes2.dex */
final class zztd implements zzts {
    private final /* synthetic */ String val$name;
    private final /* synthetic */ String zzbny;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zztd(zztc zztcVar, String str, String str2) {
        this.val$name = str;
        this.zzbny = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzts
    public final void zzb(zztt zzttVar) throws RemoteException {
        if (zzttVar.zzboe != null) {
            zzttVar.zzboe.onAppEvent(this.val$name, this.zzbny);
        }
    }
}
