package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class z22 implements IInterface {
    public final IBinder p;
    public final String q;

    public z22(IBinder iBinder, String str) {
        this.p = iBinder;
        this.q = str;
    }

    public final Parcel D(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.p.transact(i, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel I() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.q);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.p;
    }
}
