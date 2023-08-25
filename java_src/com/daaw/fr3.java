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
        Parcel m25951I = m25951I(11, m25952D());
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.hr3
    public final void zzg(int i, int i2, Intent intent) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25952D.writeInt(i2);
        dp2.m24103e(m25952D, intent);
        m25950M(12, m25952D);
    }

    @Override // com.daaw.hr3
    public final void zzh() {
        m25950M(10, m25952D());
    }

    @Override // com.daaw.hr3
    public final void zzj(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(13, m25952D);
    }

    @Override // com.daaw.hr3
    public final void zzk(Bundle bundle) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, bundle);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.hr3
    public final void zzl() {
        m25950M(8, m25952D());
    }

    @Override // com.daaw.hr3
    public final void zzn() {
        m25950M(5, m25952D());
    }

    @Override // com.daaw.hr3
    public final void zzo() {
        m25950M(2, m25952D());
    }

    @Override // com.daaw.hr3
    public final void zzp() {
        m25950M(4, m25952D());
    }

    @Override // com.daaw.hr3
    public final void zzq(Bundle bundle) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, bundle);
        Parcel m25951I = m25951I(6, m25952D);
        if (m25951I.readInt() != 0) {
            bundle.readFromParcel(m25951I);
        }
        m25951I.recycle();
    }

    @Override // com.daaw.hr3
    public final void zzr() {
        m25950M(3, m25952D());
    }

    @Override // com.daaw.hr3
    public final void zzs() {
        m25950M(7, m25952D());
    }

    @Override // com.daaw.hr3
    public final void zzt() {
        m25950M(14, m25952D());
    }

    @Override // com.daaw.hr3
    public final void zzv() {
        m25950M(9, m25952D());
    }
}
