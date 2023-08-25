package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ep2 extends bp2 implements gp2 {
    public ep2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.daaw.gp2
    /* renamed from: C */
    public final void mo21363C(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(0);
        m25950M(6, m25952D);
    }

    @Override // com.daaw.gp2
    /* renamed from: E */
    public final void mo21362E(int[] iArr) {
        Parcel m25952D = m25952D();
        m25952D.writeIntArray(null);
        m25950M(4, m25952D);
    }

    @Override // com.daaw.gp2
    /* renamed from: Y */
    public final void mo21361Y(yd0 yd0Var, String str) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeString("GMA_SDK");
        m25950M(2, m25952D);
    }

    @Override // com.daaw.gp2
    /* renamed from: c */
    public final void mo21360c(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(7, m25952D);
    }

    @Override // com.daaw.gp2
    /* renamed from: w */
    public final void mo21359w(byte[] bArr) {
        Parcel m25952D = m25952D();
        m25952D.writeByteArray(bArr);
        m25950M(5, m25952D);
    }

    @Override // com.daaw.gp2
    public final void zzf() {
        m25950M(3, m25952D());
    }
}
