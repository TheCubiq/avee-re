package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ai3 extends bp2 implements ci3 {
    public ai3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.daaw.ci3
    public final void f(String str) {
        Parcel D = D();
        D.writeString(str);
        M(1, D);
    }

    @Override // com.daaw.ci3
    public final void zze() {
        M(2, D());
    }
}
