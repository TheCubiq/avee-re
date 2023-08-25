package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public abstract class x72 extends wx2 implements e92 {
    /* renamed from: I */
    public static e92 m5487I(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof e92 ? (e92) queryLocalInterface : new a72(iBinder);
    }
}
