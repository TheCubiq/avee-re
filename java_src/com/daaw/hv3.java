package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class hv3 extends cp2 implements iv3 {
    /* renamed from: g3 */
    public static iv3 m20388g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof iv3 ? (iv3) queryLocalInterface : new gv3(iBinder);
    }
}
