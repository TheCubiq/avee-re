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
    /* renamed from: x */
    public final Bundle mo6065x(Bundle bundle) {
        Parcel m20847D = m20847D();
        ne3.m15205e(m20847D, bundle);
        Parcel m20846I = m20846I(1, m20847D);
        Bundle bundle2 = (Bundle) ne3.m15209a(m20846I, Bundle.CREATOR);
        m20846I.recycle();
        return bundle2;
    }
}
