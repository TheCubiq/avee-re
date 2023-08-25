package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public abstract class tk4 extends c38 implements oe5 {
    /* renamed from: D */
    public static oe5 m9045D(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        return queryLocalInterface instanceof oe5 ? (oe5) queryLocalInterface : new ur3(iBinder);
    }
}
