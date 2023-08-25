package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class lu6 extends bp2 implements nu6 {
    public lu6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.daaw.nu6
    /* renamed from: C */
    public final void mo13928C(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(6, m25952D);
    }

    @Override // com.daaw.nu6
    /* renamed from: E */
    public final void mo13927E(int[] iArr) {
        Parcel m25952D = m25952D();
        m25952D.writeIntArray(null);
        m25950M(4, m25952D);
    }

    @Override // com.daaw.nu6
    /* renamed from: c */
    public final void mo13926c(int i) {
        Parcel m25952D = m25952D();
        m25952D.writeInt(i);
        m25950M(7, m25952D);
    }

    @Override // com.daaw.nu6
    /* renamed from: p2 */
    public final void mo13925p2(yd0 yd0Var, String str, String str2) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeString(str);
        m25952D.writeString(null);
        m25950M(8, m25952D);
    }

    @Override // com.daaw.nu6
    /* renamed from: w */
    public final void mo13924w(byte[] bArr) {
        Parcel m25952D = m25952D();
        m25952D.writeByteArray(bArr);
        m25950M(5, m25952D);
    }

    @Override // com.daaw.nu6
    public final void zzf() {
        m25950M(3, m25952D());
    }
}
