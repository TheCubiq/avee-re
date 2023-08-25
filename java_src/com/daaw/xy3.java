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
        Parcel D = D();
        dp2.g(D, yd0Var);
        dp2.e(D, zzcgjVar);
        dp2.g(D, wy3Var);
        M(1, D);
    }

    @Override // com.daaw.zy3
    public final void zzf(zzcao zzcaoVar) {
        Parcel D = D();
        dp2.e(D, zzcaoVar);
        M(7, D);
    }

    @Override // com.daaw.zy3
    public final void zzg(List list, yd0 yd0Var, rs3 rs3Var) {
        Parcel D = D();
        D.writeTypedList(list);
        dp2.g(D, yd0Var);
        dp2.g(D, rs3Var);
        M(10, D);
    }

    @Override // com.daaw.zy3
    public final void zzh(List list, yd0 yd0Var, rs3 rs3Var) {
        Parcel D = D();
        D.writeTypedList(list);
        dp2.g(D, yd0Var);
        dp2.g(D, rs3Var);
        M(9, D);
    }

    @Override // com.daaw.zy3
    public final void zzi(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(8, D);
    }

    @Override // com.daaw.zy3
    public final void zzj(yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, yd0Var);
        M(2, D);
    }

    @Override // com.daaw.zy3
    public final void zzk(List list, yd0 yd0Var, rs3 rs3Var) {
        Parcel D = D();
        D.writeTypedList(list);
        dp2.g(D, yd0Var);
        dp2.g(D, rs3Var);
        M(6, D);
    }

    @Override // com.daaw.zy3
    public final void zzl(List list, yd0 yd0Var, rs3 rs3Var) {
        Parcel D = D();
        D.writeTypedList(list);
        dp2.g(D, yd0Var);
        dp2.g(D, rs3Var);
        M(5, D);
    }
}
