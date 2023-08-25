package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class rv3 extends bp2 implements tv3 {
    public rv3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.daaw.tv3
    public final int zze() {
        Parcel I = I(2, D());
        int readInt = I.readInt();
        I.recycle();
        return readInt;
    }

    @Override // com.daaw.tv3
    public final String zzf() {
        Parcel I = I(1, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }
}
