package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class bz3 extends cp2 implements cz3 {
    /* renamed from: g3 */
    public static cz3 m25715g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return queryLocalInterface instanceof cz3 ? (cz3) queryLocalInterface : new az3(iBinder);
    }
}
