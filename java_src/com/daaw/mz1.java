package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class mz1 implements IInterface {
    public final IBinder p;
    public final String q;

    public mz1(IBinder iBinder, String str) {
        this.p = iBinder;
        this.q = str;
    }

    public final Parcel D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.q);
        return obtain;
    }

    public final void I(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.p.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void M(int i, Parcel parcel) {
        try {
            this.p.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.p;
    }
}
