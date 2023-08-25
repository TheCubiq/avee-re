package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class pu7 implements IInterface {

    /* renamed from: p */
    public final IBinder f23309p;

    /* renamed from: q */
    public final String f23310q = "com.android.vending.billing.IInAppBillingService";

    public pu7(IBinder iBinder, String str) {
        this.f23309p = iBinder;
    }

    /* renamed from: D */
    public final Parcel m13119D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f23310q);
        return obtain;
    }

    /* renamed from: I */
    public final Parcel m13118I(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f23309p.transact(i, parcel, obtain, 0);
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
        return this.f23309p;
    }
}
