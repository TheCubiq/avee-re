package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public abstract class le5 extends ux2 implements z76 {
    /* renamed from: D */
    public static z76 m16984D(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof z76 ? (z76) queryLocalInterface : new gl4(iBinder);
    }
}
