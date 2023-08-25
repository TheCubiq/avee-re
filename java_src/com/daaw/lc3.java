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
        Parcel m25951I = m25951I(2, m25952D());
        String readString = m25951I.readString();
        m25951I.recycle();
        return readString;
    }

    @Override // com.daaw.nc3
    public final List zzh() {
        Parcel m25951I = m25951I(3, m25952D());
        ArrayList m24106b = dp2.m24106b(m25951I);
        m25951I.recycle();
        return m24106b;
    }
}
