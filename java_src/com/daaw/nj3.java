package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class nj3 extends bp2 implements pj3 {
    public nj3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.daaw.pj3
    public final void zze(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(2, D);
    }

    @Override // com.daaw.pj3
    public final void zzf() {
        M(1, D());
    }
}
