package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.InterfaceC0465a;
/* renamed from: androidx.room.b */
/* loaded from: classes.dex */
public interface InterfaceC0468b extends IInterface {

    /* renamed from: androidx.room.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0469a extends Binder implements InterfaceC0468b {

        /* renamed from: androidx.room.b$a$a */
        /* loaded from: classes.dex */
        public static class C0470a implements InterfaceC0468b {

            /* renamed from: p */
            public IBinder f2285p;

            public C0470a(IBinder iBinder) {
                this.f2285p = iBinder;
            }

            @Override // androidx.room.InterfaceC0468b
            /* renamed from: J0 */
            public int mo28089J0(InterfaceC0465a interfaceC0465a, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC0465a != null ? interfaceC0465a.asBinder() : null);
                    obtain.writeString(str);
                    this.f2285p.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC0468b
            /* renamed from: M2 */
            public void mo28088M2(int i, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i);
                    obtain.writeStringArray(strArr);
                    this.f2285p.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // androidx.room.InterfaceC0468b
            /* renamed from: X2 */
            public void mo28087X2(InterfaceC0465a interfaceC0465a, int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(interfaceC0465a != null ? interfaceC0465a.asBinder() : null);
                    obtain.writeInt(i);
                    this.f2285p.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f2285p;
            }
        }

        public AbstractBinderC0469a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        /* renamed from: D */
        public static InterfaceC0468b m28090D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0468b)) ? new C0470a(iBinder) : (InterfaceC0468b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int mo28089J0 = mo28089J0(InterfaceC0465a.AbstractBinderC0466a.m28091D(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(mo28089J0);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo28087X2(InterfaceC0465a.AbstractBinderC0466a.m28091D(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                mo28088M2(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }
    }

    /* renamed from: J0 */
    int mo28089J0(InterfaceC0465a interfaceC0465a, String str);

    /* renamed from: M2 */
    void mo28088M2(int i, String[] strArr);

    /* renamed from: X2 */
    void mo28087X2(InterfaceC0465a interfaceC0465a, int i);
}
