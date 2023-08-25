package android.support.p000v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: android.support.v4.media.session.b */
/* loaded from: classes.dex */
public interface InterfaceC0018b extends IInterface {

    /* renamed from: android.support.v4.media.session.b$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0019a extends Binder implements InterfaceC0018b {

        /* renamed from: android.support.v4.media.session.b$a$a */
        /* loaded from: classes.dex */
        public static class C0020a implements InterfaceC0018b {

            /* renamed from: p */
            public IBinder f61p;

            public C0020a(IBinder iBinder) {
                this.f61p = iBinder;
            }

            @Override // android.support.p000v4.media.session.InterfaceC0018b
            /* renamed from: V */
            public void mo30439V(InterfaceC0016a interfaceC0016a) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(interfaceC0016a != null ? interfaceC0016a.asBinder() : null);
                    this.f61p.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f61p;
            }
        }

        /* renamed from: D */
        public static InterfaceC0018b m30440D(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0018b)) ? new C0020a(iBinder) : (InterfaceC0018b) queryLocalInterface;
        }
    }

    /* renamed from: V */
    void mo30439V(InterfaceC0016a interfaceC0016a);
}
