package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public class bp2 implements IInterface {

    /* renamed from: p */
    public final IBinder f5027p;

    /* renamed from: q */
    public final String f5028q;

    public bp2(IBinder iBinder, String str) {
        this.f5027p = iBinder;
        this.f5028q = str;
    }

    /* renamed from: D */
    public final Parcel m25952D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5028q);
        return obtain;
    }

    /* renamed from: I */
    public final Parcel m25951I(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5027p.transact(i, parcel, obtain, 0);
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
    public final void m25950M(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5027p.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5027p;
    }

    /* renamed from: g3 */
    public final void m25949g3(int i, Parcel parcel) {
        try {
            this.f5027p.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
