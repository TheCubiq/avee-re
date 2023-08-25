package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzcao;
import com.google.android.gms.internal.ads.zzcgj;
import java.util.List;
/* loaded from: classes.dex */
public final class xy3 extends bp2 implements zy3 {
    public xy3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.daaw.zy3
    public final void zze(yd0 yd0Var, zzcgj zzcgjVar, wy3 wy3Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24103e(m25952D, zzcgjVar);
        dp2.m24101g(m25952D, wy3Var);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.zy3
    public final void zzf(zzcao zzcaoVar) {
        Parcel m25952D = m25952D();
        dp2.m24103e(m25952D, zzcaoVar);
        m25950M(7, m25952D);
    }

    @Override // com.daaw.zy3
    public final void zzg(List list, yd0 yd0Var, rs3 rs3Var) {
        Parcel m25952D = m25952D();
        m25952D.writeTypedList(list);
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, rs3Var);
        m25950M(10, m25952D);
    }

    @Override // com.daaw.zy3
    public final void zzh(List list, yd0 yd0Var, rs3 rs3Var) {
        Parcel m25952D = m25952D();
        m25952D.writeTypedList(list);
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, rs3Var);
        m25950M(9, m25952D);
    }

    @Override // com.daaw.zy3
    public final void zzi(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(8, m25952D);
    }

    @Override // com.daaw.zy3
    public final void zzj(yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, yd0Var);
        m25950M(2, m25952D);
    }

    @Override // com.daaw.zy3
    public final void zzk(List list, yd0 yd0Var, rs3 rs3Var) {
        Parcel m25952D = m25952D();
        m25952D.writeTypedList(list);
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, rs3Var);
        m25950M(6, m25952D);
    }

    @Override // com.daaw.zy3
    public final void zzl(List list, yd0 yd0Var, rs3 rs3Var) {
        Parcel m25952D = m25952D();
        m25952D.writeTypedList(list);
        dp2.m24101g(m25952D, yd0Var);
        dp2.m24101g(m25952D, rs3Var);
        m25950M(5, m25952D);
    }
}
