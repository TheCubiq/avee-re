package com.daaw;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class fr3 extends bp2 implements hr3 {
    public fr3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.daaw.hr3
    public final boolean zzE() {
        Parcel I = I(11, D());
        boolean h = dp2.h(I);
        I.recycle();
        return h;
    }

    @Override // com.daaw.hr3
    public final void zzg(int i, int i2, Intent intent) {
        Parcel D = D();
        D.writeInt(i);
        D.writeInt(i2);
        dp2.e(D, intent);
        M(12, D);
    }

    @Override // com.daaw.hr3
    public final void zzh() {
        M(10, D());
    }

    @Override // com.daaw.hr3
    public final void zzj(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(13, D);
    }

    @Override // com.daaw.hr3
    public final void zzk(Bundle bundle) {
        Parcel D = D();
        dp2.e(D, bundle);
        M(1, D);
    }

    @Override // com.daaw.hr3
    public final void zzl() {
        M(8, D());
    }

    @Override // com.daaw.hr3
    public final void zzn() {
        M(5, D());
    }

    @Override // com.daaw.hr3
    public final void zzo() {
        M(2, D());
    }

    @Override // com.daaw.hr3
    public final void zzp() {
        M(4, D());
    }

    @Override // com.daaw.hr3
    public final void zzq(Bundle bundle) {
        Parcel D = D();
        dp2.e(D, bundle);
        Parcel I = I(6, D);
        if (I.readInt() != 0) {
            bundle.readFromParcel(I);
        }
        I.recycle();
    }

    @Override // com.daaw.hr3
    public final void zzr() {
        M(3, D());
    }

    @Override // com.daaw.hr3
    public final void zzs() {
        M(7, D());
    }

    @Override // com.daaw.hr3
    public final void zzt() {
        M(14, D());
    }

    @Override // com.daaw.hr3
    public final void zzv() {
        M(9, D());
    }
}
