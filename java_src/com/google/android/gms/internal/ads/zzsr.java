package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzsr implements BaseGmsClient.BaseOnConnectionFailedListener {
    private final /* synthetic */ zzsm zzbnn;
    private final /* synthetic */ zzaoj zzbno;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsr(zzsm zzsmVar, zzaoj zzaojVar) {
        this.zzbnn = zzsmVar;
        this.zzbno = zzaojVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Object obj;
        obj = this.zzbnn.mLock;
        synchronized (obj) {
            this.zzbno.setException(new RuntimeException("Connection failed."));
        }
    }
}
