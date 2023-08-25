package com.daaw;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface xc0 extends IInterface {

    /* renamed from: com.daaw.xc0$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC3524a extends Binder implements xc0 {
        public AbstractBinderC3524a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch (i) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo5285m2(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    break;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo5288Q1(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    break;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo5287R2(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    break;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo5290J2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    break;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    mo5286T2(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    break;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    Bundle mo5289P0 = mo5289P0(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (mo5289P0 != null) {
                        parcel2.writeInt(1);
                        mo5289P0.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: J2 */
    void mo5290J2(String str, Bundle bundle);

    /* renamed from: P0 */
    Bundle mo5289P0(String str, Bundle bundle);

    /* renamed from: Q1 */
    void mo5288Q1(String str, Bundle bundle);

    /* renamed from: R2 */
    void mo5287R2(Bundle bundle);

    /* renamed from: T2 */
    void mo5286T2(int i, Uri uri, boolean z, Bundle bundle);

    /* renamed from: m2 */
    void mo5285m2(int i, Bundle bundle);
}
