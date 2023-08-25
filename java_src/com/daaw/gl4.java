package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes2.dex */
public final class gl4 extends x22 implements z76 {
    public gl4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.daaw.z76
    public final boolean t(boolean z) {
        Parcel D = D();
        hs3.a(D, true);
        Parcel I = I(2, D);
        boolean b = hs3.b(I);
        I.recycle();
        return b;
    }

    @Override // com.daaw.z76
    public final String zzc() {
        Parcel I = I(1, D());
        String readString = I.readString();
        I.recycle();
        return readString;
    }

    @Override // com.daaw.z76
    public final boolean zzd() {
        Parcel I = I(6, D());
        boolean b = hs3.b(I);
        I.recycle();
        return b;
    }
}
