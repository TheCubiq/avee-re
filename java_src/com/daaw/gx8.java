package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class gx8 extends z22 implements tz8 {
    public gx8(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.daaw.tz8
    public final int zzc() {
        Parcel m2966D = m2966D(2, m2965I());
        int readInt = m2966D.readInt();
        m2966D.recycle();
        return readInt;
    }

    @Override // com.daaw.tz8
    public final yd0 zzd() {
        Parcel m2966D = m2966D(1, m2965I());
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m2966D.readStrongBinder());
        m2966D.recycle();
        return m3857I;
    }
}
