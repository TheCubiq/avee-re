package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class y22 implements IInterface {

    /* renamed from: p */
    public final IBinder f33230p;

    /* renamed from: q */
    public final String f33231q = "com.google.android.gms.appset.internal.IAppSetService";

    public y22(IBinder iBinder, String str) {
        this.f33230p = iBinder;
    }

    /* renamed from: D */
    public final Parcel m4248D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f33231q);
        return obtain;
    }

    /* renamed from: I */
    public final void m4247I(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f33230p.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f33230p;
    }
}
