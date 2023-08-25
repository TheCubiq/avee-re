package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class lc3 extends bp2 implements nc3 {
    public lc3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.daaw.nc3
    public final String zzg() {
        Parcel I = I(2, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.nc3
    public final List zzh() {
        Parcel I = I(3, D());
        ArrayList b = dp2.b(I);
        I.recycle();
        return b;
    }
}
