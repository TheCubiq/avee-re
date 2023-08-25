package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class lu6 extends bp2 implements nu6 {
    public lu6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.daaw.nu6
    public final void C(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(6, D);
    }

    @Override // com.daaw.nu6
    public final void E(int[] iArr) {
        Parcel D = D();
        D.writeIntArray(null);
        M(4, D);
    }

    @Override // com.daaw.nu6
    public final void c(int i) {
        Parcel D = D();
        D.writeInt(i);
        M(7, D);
    }

    @Override // com.daaw.nu6
    public final void p2(yd0 yd0Var, String str, String str2) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeString(str);
        D.writeString(null);
        M(8, D);
    }

    @Override // com.daaw.nu6
    public final void w(byte[] bArr) {
        Parcel D = D();
        D.writeByteArray(bArr);
        M(5, D);
    }

    @Override // com.daaw.nu6
    public final void zzf() {
        M(3, D());
    }
}
