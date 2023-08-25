package android.support.p000v4.p001os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: android.support.v4.os.a */
/* loaded from: classes.dex */
public interface InterfaceC0033a extends IInterface {

    /* renamed from: android.support.v4.os.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0034a extends Binder implements InterfaceC0033a {

        /* renamed from: android.support.v4.os.a$a$a */
        /* loaded from: classes.dex */
        public static class C0035a implements InterfaceC0033a {

            /* renamed from: p */
            public IBinder f74p;

            public C0035a(IBinder iBinder) {
                this.f74p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f74p;
            }
        }

        public AbstractBinderC0034a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: D */
        public static InterfaceC0033a m30387D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0033a)) ? new C0035a(iBinder) : (InterfaceC0033a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
                mo30388d3(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
        }
    }

    /* renamed from: d3 */
    void mo30388d3(int i, Bundle bundle);
}
