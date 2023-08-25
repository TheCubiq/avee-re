package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class bp2 implements IInterface {
    public final IBinder p;
    public final String q;

    public bp2(IBinder iBinder, String str) {
        this.p = iBinder;
        this.q = str;
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

    public final void M(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.p.transact(i, parcel, obtain, 0);
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

    public final void g3(int i, Parcel parcel) {
        try {
            this.p.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
