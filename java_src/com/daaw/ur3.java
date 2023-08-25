package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes2.dex */
public final class ur3 extends pu7 implements oe5 {
    public ur3(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.daaw.oe5
    public final int G2(int i, String str, String str2, Bundle bundle) {
        Parcel D = D();
        D.writeInt(i);
        D.writeString(str);
        D.writeString(str2);
        i68.b(D, bundle);
        Parcel I = I(10, D);
        int readInt = I.readInt();
        I.recycle();
        return readInt;
    }

    @Override // com.daaw.oe5
    public final Bundle K2(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel D = D();
        D.writeInt(9);
        D.writeString(str);
        D.writeString(str2);
        D.writeString(str3);
        i68.b(D, bundle);
        Parcel I = I(11, D);
        Bundle bundle2 = (Bundle) i68.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle2;
    }

    @Override // com.daaw.oe5
    public final Bundle O1(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel D = D();
        D.writeInt(i);
        D.writeString(str);
        D.writeString(str2);
        D.writeString(str3);
        D.writeString(null);
        i68.b(D, bundle);
        Parcel I = I(8, D);
        Bundle bundle2 = (Bundle) i68.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle2;
    }

    @Override // com.daaw.oe5
    public final Bundle W0(int i, String str, String str2, String str3) {
        Parcel D = D();
        D.writeInt(3);
        D.writeString(str);
        D.writeString(str2);
        D.writeString(str3);
        Parcel I = I(4, D);
        Bundle bundle = (Bundle) i68.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle;
    }

    @Override // com.daaw.oe5
    public final Bundle Y2(int i, String str, String str2, Bundle bundle) {
        Parcel D = D();
        D.writeInt(9);
        D.writeString(str);
        D.writeString(str2);
        i68.b(D, bundle);
        Parcel I = I(902, D);
        Bundle bundle2 = (Bundle) i68.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle2;
    }

    @Override // com.daaw.oe5
    public final Bundle a1(int i, String str, String str2, String str3, String str4) {
        Parcel D = D();
        D.writeInt(3);
        D.writeString(str);
        D.writeString(str2);
        D.writeString(str3);
        D.writeString(null);
        Parcel I = I(3, D);
        Bundle bundle = (Bundle) i68.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle;
    }

    @Override // com.daaw.oe5
    public final Bundle b0(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel D = D();
        D.writeInt(i);
        D.writeString(str);
        D.writeString(str2);
        i68.b(D, bundle);
        i68.b(D, bundle2);
        Parcel I = I(901, D);
        Bundle bundle3 = (Bundle) i68.a(I, Bundle.CREATOR);
        I.recycle();
        return bundle3;
    }

    @Override // com.daaw.oe5
    public final int c0(int i, String str, String str2) {
        Parcel D = D();
        D.writeInt(i);
        D.writeString(str);
        D.writeString(str2);
        Parcel I = I(1, D);
        int readInt = I.readInt();
        I.recycle();
        return readInt;
    }
}
