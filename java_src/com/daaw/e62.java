package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;
/* loaded from: classes.dex */
public final class e62 implements ud0 {

    /* renamed from: p */
    public final IBinder f8194p;

    public e62(IBinder iBinder) {
        this.f8194p = iBinder;
    }

    @Override // com.daaw.ud0
    /* renamed from: Q2 */
    public final void mo8318Q2(td0 td0Var, GetServiceRequest getServiceRequest) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(td0Var != null ? td0Var.asBinder() : null);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                ef8.m23494a(getServiceRequest, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f8194p.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8194p;
    }
}
