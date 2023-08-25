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
    /* renamed from: G2 */
    public final int mo7780G2(int i, String str, String str2, Bundle bundle) {
        Parcel m13119D = m13119D();
        m13119D.writeInt(i);
        m13119D.writeString(str);
        m13119D.writeString(str2);
        i68.m20046b(m13119D, bundle);
        Parcel m13118I = m13118I(10, m13119D);
        int readInt = m13118I.readInt();
        m13118I.recycle();
        return readInt;
    }

    @Override // com.daaw.oe5
    /* renamed from: K2 */
    public final Bundle mo7779K2(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel m13119D = m13119D();
        m13119D.writeInt(9);
        m13119D.writeString(str);
        m13119D.writeString(str2);
        m13119D.writeString(str3);
        i68.m20046b(m13119D, bundle);
        Parcel m13118I = m13118I(11, m13119D);
        Bundle bundle2 = (Bundle) i68.m20047a(m13118I, Bundle.CREATOR);
        m13118I.recycle();
        return bundle2;
    }

    @Override // com.daaw.oe5
    /* renamed from: O1 */
    public final Bundle mo7778O1(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel m13119D = m13119D();
        m13119D.writeInt(i);
        m13119D.writeString(str);
        m13119D.writeString(str2);
        m13119D.writeString(str3);
        m13119D.writeString(null);
        i68.m20046b(m13119D, bundle);
        Parcel m13118I = m13118I(8, m13119D);
        Bundle bundle2 = (Bundle) i68.m20047a(m13118I, Bundle.CREATOR);
        m13118I.recycle();
        return bundle2;
    }

    @Override // com.daaw.oe5
    /* renamed from: W0 */
    public final Bundle mo7777W0(int i, String str, String str2, String str3) {
        Parcel m13119D = m13119D();
        m13119D.writeInt(3);
        m13119D.writeString(str);
        m13119D.writeString(str2);
        m13119D.writeString(str3);
        Parcel m13118I = m13118I(4, m13119D);
        Bundle bundle = (Bundle) i68.m20047a(m13118I, Bundle.CREATOR);
        m13118I.recycle();
        return bundle;
    }

    @Override // com.daaw.oe5
    /* renamed from: Y2 */
    public final Bundle mo7776Y2(int i, String str, String str2, Bundle bundle) {
        Parcel m13119D = m13119D();
        m13119D.writeInt(9);
        m13119D.writeString(str);
        m13119D.writeString(str2);
        i68.m20046b(m13119D, bundle);
        Parcel m13118I = m13118I(902, m13119D);
        Bundle bundle2 = (Bundle) i68.m20047a(m13118I, Bundle.CREATOR);
        m13118I.recycle();
        return bundle2;
    }

    @Override // com.daaw.oe5
    /* renamed from: a1 */
    public final Bundle mo7775a1(int i, String str, String str2, String str3, String str4) {
        Parcel m13119D = m13119D();
        m13119D.writeInt(3);
        m13119D.writeString(str);
        m13119D.writeString(str2);
        m13119D.writeString(str3);
        m13119D.writeString(null);
        Parcel m13118I = m13118I(3, m13119D);
        Bundle bundle = (Bundle) i68.m20047a(m13118I, Bundle.CREATOR);
        m13118I.recycle();
        return bundle;
    }

    @Override // com.daaw.oe5
    /* renamed from: b0 */
    public final Bundle mo7774b0(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel m13119D = m13119D();
        m13119D.writeInt(i);
        m13119D.writeString(str);
        m13119D.writeString(str2);
        i68.m20046b(m13119D, bundle);
        i68.m20046b(m13119D, bundle2);
        Parcel m13118I = m13118I(901, m13119D);
        Bundle bundle3 = (Bundle) i68.m20047a(m13118I, Bundle.CREATOR);
        m13118I.recycle();
        return bundle3;
    }

    @Override // com.daaw.oe5
    /* renamed from: c0 */
    public final int mo7773c0(int i, String str, String str2) {
        Parcel m13119D = m13119D();
        m13119D.writeInt(i);
        m13119D.writeString(str);
        m13119D.writeString(str2);
        Parcel m13118I = m13118I(1, m13119D);
        int readInt = m13118I.readInt();
        m13118I.recycle();
        return readInt;
    }
}
