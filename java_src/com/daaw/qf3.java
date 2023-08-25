package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes2.dex */
public final class qf3 extends hc3 implements wh3 {
    public qf3(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.daaw.wh3
    public final Bundle x(Bundle bundle) {
        Parcel D = D();
        ne3.e(D, bundle);
        Parcel I = I(1, D);
        Bundle bundle2 = (Bundle) ne3.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle2;
    }
}
