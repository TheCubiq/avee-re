package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class pr3 extends cp2 implements qr3 {
    public static qr3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof qr3 ? (qr3) queryLocalInterface : new or3(iBinder);
    }
}
