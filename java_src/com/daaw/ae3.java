package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ae3 extends bp2 implements ce3 {
    public ae3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.daaw.ce3
    public final void u0(sd3 sd3Var, String str) {
        Parcel D = D();
        dp2.g(D, sd3Var);
        D.writeString(str);
        M(1, D);
    }
}
