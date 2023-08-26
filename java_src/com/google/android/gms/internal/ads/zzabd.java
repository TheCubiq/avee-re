package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes2.dex */
public final class zzabd extends zzek implements zzabc {
    public static zzabc zzx(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        return queryLocalInterface instanceof zzabc ? (zzabc) queryLocalInterface : new zzabe(iBinder);
    }
}
