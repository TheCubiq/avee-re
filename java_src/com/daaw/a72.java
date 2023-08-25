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
    /* renamed from: P1 */
    public final boolean mo23662P1(zzs zzsVar, yd0 yd0Var) {
        Parcel m2965I = m2965I();
        sr3.m9940d(m2965I, zzsVar);
        sr3.m9939e(m2965I, yd0Var);
        Parcel m2966D = m2966D(5, m2965I);
        boolean m9938f = sr3.m9938f(m2966D);
        m2966D.recycle();
        return m9938f;
    }

    @Override // com.daaw.e92
    /* renamed from: f1 */
    public final zzq mo23661f1(zzo zzoVar) {
        Parcel m2965I = m2965I();
        sr3.m9940d(m2965I, zzoVar);
        Parcel m2966D = m2966D(6, m2965I);
        zzq zzqVar = (zzq) sr3.m9943a(m2966D, zzq.CREATOR);
        m2966D.recycle();
        return zzqVar;
    }

    @Override // com.daaw.e92
    /* renamed from: v1 */
    public final zzq mo23660v1(zzo zzoVar) {
        Parcel m2965I = m2965I();
        sr3.m9940d(m2965I, zzoVar);
        Parcel m2966D = m2966D(8, m2965I);
        zzq zzqVar = (zzq) sr3.m9943a(m2966D, zzq.CREATOR);
        m2966D.recycle();
        return zzqVar;
    }

    @Override // com.daaw.e92
    public final boolean zzi() {
        Parcel m2966D = m2966D(7, m2965I());
        boolean m9938f = sr3.m9938f(m2966D);
        m2966D.recycle();
        return m9938f;
    }
}
