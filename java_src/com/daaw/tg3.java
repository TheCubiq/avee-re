package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public abstract class tg3 extends kd3 implements wh3 {
    public static wh3 I(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof wh3 ? (wh3) queryLocalInterface : new qf3(iBinder);
    }
}
