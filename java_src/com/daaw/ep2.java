package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ep2 extends bp2 implements gp2 {
    public ep2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.daaw.gp2
    public final void C(int i) {
        Parcel D = D();
        D.writeInt(0);
        M(6, D);
    }

    @Override // com.daaw.gp2
    public final void E(int[] iArr) {
        Parcel D = D();
        D.writeIntArray(null);
        M(4, D);
    }

    @Override // com.daaw.gp2
    public final void Y(yd0 yd0Var, String str) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString("GMA_SDK");
        M(2, D);
    }

    @Override // com.daaw.gp2
    public final void c(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(7, D);
    }

    @Override // com.daaw.gp2
    public final void w(byte[] bArr) {
        Parcel D = D();
        D.writeByteArray(bArr);
        M(5, D);
    }

    @Override // com.daaw.gp2
    public final void zzf() {
        M(3, D());
    }
}
