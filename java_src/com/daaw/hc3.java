package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class hc3 implements IInterface {

    /* renamed from: p */
    public final IBinder f12393p;

    /* renamed from: q */
    public final String f12394q;

    public hc3(IBinder iBinder, String str) {
        this.f12393p = iBinder;
        this.f12394q = str;
    }

    /* renamed from: D */
    public final Parcel m20847D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12394q);
        return obtain;
    }

    /* renamed from: I */
    public final Parcel m20846I(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f12393p.transact(i, parcel, obtain, 0);
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

    /* renamed from: M */
    public final void m20845M(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f12393p.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12393p;
    }
}
