package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
/* loaded from: classes.dex */
public final class e62 implements ud0 {
    public final IBinder p;

    public e62(IBinder iBinder) {
        this.p = iBinder;
    }

    @Override // com.daaw.ud0
    public final void Q2(td0 td0Var, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(td0Var != null ? td0Var.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                ef8.a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.p.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.p;
    }
}
