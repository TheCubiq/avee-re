package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class ns3 extends cp2 implements os3 {
    /* renamed from: g3 */
    public static os3 m14847g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof os3 ? (os3) queryLocalInterface : new ms3(iBinder);
    }
}
