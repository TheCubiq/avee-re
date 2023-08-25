package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.yd0;
/* loaded from: classes.dex */
public final class xc3 extends bp2 implements zc3 {
    public xc3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.daaw.zc3
    public final yd0 zzb(String str) {
        Parcel D = D();
        D.writeString(str);
        Parcel I = I(2, D);
        yd0 I2 = yd0.a.I(I.readStrongBinder());
        I.recycle();
        return I2;
    }

    @Override // com.daaw.zc3
    public final void zzbA(sc3 sc3Var) {
        Parcel D = D();
        dp2.g(D, sc3Var);
        M(8, D);
    }

    @Override // com.daaw.zc3
    public final void zzbB(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(9, D);
    }

    @Override // com.daaw.zc3
    public final void zzbC(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(3, D);
    }

    @Override // com.daaw.zc3
    public final void zzby(String str, yd0 yd0Var) {
        Parcel D = D();
        D.writeString(str);
        dp2.g(D, yd0Var);
        M(1, D);
    }

    @Override // com.daaw.zc3
    public final void zzbz(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(6, D);
    }

    @Override // com.daaw.zc3
    public final void zzc() {
        M(4, D());
    }

    @Override // com.daaw.zc3
    public final void zzd(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(7, D);
    }

    @Override // com.daaw.zc3
    public final void zze(yd0 yd0Var, int i) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        D.writeInt(i);
        M(5, D);
    }
}
