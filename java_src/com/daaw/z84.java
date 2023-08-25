package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class z84 extends cp2 implements a94 {
    /* renamed from: g3 */
    public static a94 m2623g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return queryLocalInterface instanceof a94 ? (a94) queryLocalInterface : new y84(iBinder);
    }
}
