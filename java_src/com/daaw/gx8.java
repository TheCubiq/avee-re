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
        Parcel D = D(2, I());
        int readInt = D.readInt();
        D.recycle();
        return readInt;
    }

    @Override // com.daaw.tz8
    public final yd0 zzd() {
        Parcel D = D(1, I());
        yd0 I = yd0.a.I(D.readStrongBinder());
        D.recycle();
        return I;
    }
}
