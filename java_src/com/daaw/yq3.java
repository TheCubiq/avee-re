package com.daaw;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class yq3 extends bp2 implements ar3 {
    public yq3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.daaw.ar3
    public final void N(Intent intent) {
        Parcel D = D();
        dp2.e(D, intent);
        M(1, D);
    }

    @Override // com.daaw.ar3
    public final void l1(yd0 yd0Var, String str, String str2) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString(str);
        D.writeString(str2);
        M(2, D);
    }

    @Override // com.daaw.ar3
    public final void zzf() {
        M(3, D());
    }
}
