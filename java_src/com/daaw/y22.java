package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class y22 implements IInterface {
    public final IBinder p;
    public final String q = "com.google.android.gms.appset.internal.IAppSetService";

    public y22(IBinder iBinder, String str) {
        this.p = iBinder;
    }

    public final Parcel D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.q);
        return obtain;
    }

    public final void I(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.p.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.p;
    }
}
