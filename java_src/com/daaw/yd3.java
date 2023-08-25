package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class yd3 extends cp2 implements zd3 {
    /* renamed from: g3 */
    public static zd3 m3847g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
        return queryLocalInterface instanceof zd3 ? (zd3) queryLocalInterface : new xd3(iBinder);
    }
}
