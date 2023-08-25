package com.daaw;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface yc0 extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements yc0 {

        /* renamed from: com.daaw.yc0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0091a implements yc0 {
            public static yc0 q;
            public IBinder p;

            public C0091a(IBinder iBinder) {
                this.p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.p;
            }

            @Override // com.daaw.yc0
            public boolean e1(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    if (this.p.transact(2, obtain, obtain2, 0) || a.I() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.I().e1(j);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.daaw.yc0
            public boolean h2(xc0 xc0Var, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(xc0Var != null ? xc0Var.asBinder() : null);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.p.transact(10, obtain, obtain2, 0) || a.I() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.I().h2(xc0Var, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.daaw.yc0
            public boolean o0(xc0 xc0Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(xc0Var != null ? xc0Var.asBinder() : null);
                    if (this.p.transact(3, obtain, obtain2, 0) || a.I() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return a.I().o0(xc0Var);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static yc0 D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof yc0)) ? new C0091a(iBinder) : (yc0) queryLocalInterface;
        }

        public static yc0 I() {
            return C0091a.q;
        }
    }

    boolean e1(long j);

    boolean h2(xc0 xc0Var, Bundle bundle);

    boolean o0(xc0 xc0Var);
}
