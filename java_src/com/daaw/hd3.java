package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class hd3 extends cp2 implements InterfaceC1684id3 {
    /* renamed from: g3 */
    public static InterfaceC1684id3 m20838g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof InterfaceC1684id3 ? (InterfaceC1684id3) queryLocalInterface : new gd3(iBinder);
    }
}
