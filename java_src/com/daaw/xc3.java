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
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        Parcel m25951I = m25951I(2, m25952D);
        yd0 m3857I = yd0.AbstractBinderC3691a.m3857I(m25951I.readStrongBinder());
        m25951I.recycle();
        return m3857I;
    }

    @Override // com.daaw.zc3
    public final void zzbA(sc3 sc3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, sc3Var);
        m25950M(8, m25952D);
    }

    @Override // com.daaw.zc3
    public final void zzbB(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(9, m25952D);
    }

    @Override // com.daaw.zc3
    public final void zzbC(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(3, m25952D);
    }

    @Override // com.daaw.zc3
    public final void zzby(String str, yd0 yd0Var) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        dp2.m24101g(m25952D, yd0Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.zc3
    public final void zzbz(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(6, m25952D);
    }

    @Override // com.daaw.zc3
    public final void zzc() {
        m25950M(4, m25952D());
    }

    @Override // com.daaw.zc3
    public final void zzd(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(7, m25952D);
    }

    @Override // com.daaw.zc3
    public final void zze(yd0 yd0Var, int i) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25952D.writeInt(i);
        m25950M(5, m25952D);
    }
}
