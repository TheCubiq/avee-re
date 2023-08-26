package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzsn extends zzaoj<ParcelFileDescriptor> {
    private final /* synthetic */ zzsm zzbnn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzsn(zzsm zzsmVar) {
        this.zzbnn = zzsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaoj, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zzbnn.disconnect();
        return super.cancel(z);
    }
}
