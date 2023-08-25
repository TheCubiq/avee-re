package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class rj3 extends cp2 implements sj3 {
    public static sj3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof sj3 ? (sj3) queryLocalInterface : new qj3(iBinder);
    }
}
