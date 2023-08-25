package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class cr3 extends cp2 implements dr3 {
    public static dr3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return queryLocalInterface instanceof dr3 ? (dr3) queryLocalInterface : new br3(iBinder);
    }
}
