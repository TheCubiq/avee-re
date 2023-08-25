package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class x22 implements IInterface {
    public final IBinder p;
    public final String q = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public x22(IBinder iBinder, String str) {
        this.p = iBinder;
    }

    public final Parcel D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.q);
        return obtain;
    }

    public final Parcel I(int i, Parcel parcel) {
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

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.p;
    }
}
