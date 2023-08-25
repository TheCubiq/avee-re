package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class mz1 implements IInterface {

    /* renamed from: p */
    public final IBinder f19304p;

    /* renamed from: q */
    public final String f19305q;

    public mz1(IBinder iBinder, String str) {
        this.f19304p = iBinder;
        this.f19305q = str;
    }

    /* renamed from: D */
    public final Parcel m15654D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f19305q);
        return obtain;
    }

    /* renamed from: I */
    public final void m15653I(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f19304p.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: M */
    public final void m15652M(int i, Parcel parcel) {
        try {
            this.f19304p.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f19304p;
    }
}
