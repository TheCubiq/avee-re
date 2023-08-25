package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class ea3 extends cp2 implements fa3 {
    /* renamed from: g3 */
    public static fa3 m23632g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        return queryLocalInterface instanceof fa3 ? (fa3) queryLocalInterface : new da3(iBinder);
    }
}
