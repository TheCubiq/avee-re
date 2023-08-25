package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;
/* loaded from: classes.dex */
public abstract class qs3 extends cp2 implements rs3 {
    public qs3() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static rs3 g3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof rs3 ? (rs3) queryLocalInterface : new ps3(iBinder);
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            dp2.c(parcel);
            x0(createTypedArrayList);
        } else if (i != 2) {
            return false;
        } else {
            String readString = parcel.readString();
            dp2.c(parcel);
            a(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
