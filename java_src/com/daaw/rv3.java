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
        Parcel m25951I = m25951I(2, m25952D());
        int readInt = m25951I.readInt();
        m25951I.recycle();
        return readInt;
    }

    @Override // com.daaw.tv3
    public final String zzf() {
        Parcel m25951I = m25951I(1, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }
}
