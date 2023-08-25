package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes2.dex */
public class x22 implements IInterface {

    /* renamed from: p */
    public final IBinder f32012p;

    /* renamed from: q */
    public final String f32013q = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public x22(IBinder iBinder, String str) {
        this.f32012p = iBinder;
    }

    /* renamed from: D */
    public final Parcel m5608D() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f32013q);
        return obtain;
    }

    /* renamed from: I */
    public final Parcel m5607I(int i, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f32012p.transact(i, parcel, obtain, 0);
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
        return this.f32012p;
    }
}
