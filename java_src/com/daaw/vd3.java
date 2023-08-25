package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class vd3 extends cp2 implements wd3 {
    public static wd3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
        return queryLocalInterface instanceof wd3 ? (wd3) queryLocalInterface : new ud3(iBinder);
    }
}
