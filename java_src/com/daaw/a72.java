package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
/* loaded from: classes.dex */
public final class a72 extends z22 implements e92 {
    public a72(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.daaw.e92
    public final boolean P1(zzs zzsVar, yd0 yd0Var) {
        Parcel I = I();
        sr3.d(I, zzsVar);
        sr3.e(I, yd0Var);
        Parcel D = D(5, I);
        boolean f = sr3.f(D);
        D.recycle();
        return f;
    }

    @Override // com.daaw.e92
    public final zzq f1(zzo zzoVar) {
        Parcel I = I();
        sr3.d(I, zzoVar);
        Parcel D = D(6, I);
        zzq zzqVar = (zzq) sr3.a(D, zzq.CREATOR);
        D.recycle();
        return zzqVar;
    }

    @Override // com.daaw.e92
    public final zzq v1(zzo zzoVar) {
        Parcel I = I();
        sr3.d(I, zzoVar);
        Parcel D = D(8, I);
        zzq zzqVar = (zzq) sr3.a(D, zzq.CREATOR);
        D.recycle();
        return zzqVar;
    }

    @Override // com.daaw.e92
    public final boolean zzi() {
        Parcel D = D(7, I());
        boolean f = sr3.f(D);
        D.recycle();
        return f;
    }
}
