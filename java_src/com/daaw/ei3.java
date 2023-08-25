package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class ei3 extends cp2 implements fi3 {
    public static fi3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
        return queryLocalInterface instanceof fi3 ? (fi3) queryLocalInterface : new di3(iBinder);
    }
}
