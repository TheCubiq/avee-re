package com.daaw;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface yc0 extends IInterface {

    /* renamed from: com.daaw.yc0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC3688a extends Binder implements yc0 {

        /* renamed from: com.daaw.yc0$a$a */
        /* loaded from: classes.dex */
        public static class C3689a implements yc0 {

            /* renamed from: q */
            public static yc0 f33516q;

            /* renamed from: p */
            public IBinder f33517p;

            public C3689a(IBinder iBinder) {
                this.f33517p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f33517p;
            }

            @Override // com.daaw.yc0
            /* renamed from: e1 */
            public boolean mo3867e1(long j) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    if (this.f33517p.transact(2, obtain, obtain2, 0) || AbstractBinderC3688a.m3868I() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return AbstractBinderC3688a.m3868I().mo3867e1(j);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.daaw.yc0
            /* renamed from: h2 */
            public boolean mo3866h2(xc0 xc0Var, Bundle bundle) {
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
                    if (this.f33517p.transact(10, obtain, obtain2, 0) || AbstractBinderC3688a.m3868I() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return AbstractBinderC3688a.m3868I().mo3866h2(xc0Var, bundle);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.daaw.yc0
            /* renamed from: o0 */
            public boolean mo3865o0(xc0 xc0Var) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(xc0Var != null ? xc0Var.asBinder() : null);
                    if (this.f33517p.transact(3, obtain, obtain2, 0) || AbstractBinderC3688a.m3868I() == null) {
                        obtain2.readException();
                        return obtain2.readInt() != 0;
                    }
                    return AbstractBinderC3688a.m3868I().mo3865o0(xc0Var);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: D */
        public static yc0 m3869D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof yc0)) ? new C3689a(iBinder) : (yc0) queryLocalInterface;
        }

        /* renamed from: I */
        public static yc0 m3868I() {
            return C3689a.f33516q;
        }
    }

    /* renamed from: e1 */
    boolean mo3867e1(long j);

    /* renamed from: h2 */
    boolean mo3866h2(xc0 xc0Var, Bundle bundle);

    /* renamed from: o0 */
    boolean mo3865o0(xc0 xc0Var);
}
