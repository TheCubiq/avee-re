package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: androidx.room.a */
/* loaded from: classes.dex */
public interface InterfaceC0465a extends IInterface {

    /* renamed from: androidx.room.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0466a extends Binder implements InterfaceC0465a {

        /* renamed from: androidx.room.a$a$a */
        /* loaded from: classes.dex */
        public static class C0467a implements InterfaceC0465a {

            /* renamed from: p */
            public IBinder f2284p;

            public C0467a(IBinder iBinder) {
                this.f2284p = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2284p;
            }

            @Override // androidx.room.InterfaceC0465a
            /* renamed from: s0 */
            public void mo28066s0(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f2284p.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public AbstractBinderC0466a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        /* renamed from: D */
        public static InterfaceC0465a m28091D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0465a)) ? new C0467a(iBinder) : (InterfaceC0465a) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                mo28066s0(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    /* renamed from: s0 */
    void mo28066s0(String[] strArr);
}
