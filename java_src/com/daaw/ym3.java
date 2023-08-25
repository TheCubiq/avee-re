package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ym3 extends bp2 implements an3 {
    public ym3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    @Override // com.daaw.an3
    /* renamed from: a */
    public final boolean mo3509a(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        Parcel m25951I = m25951I(2, m25952D);
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.an3
    /* renamed from: l */
    public final boolean mo3508l(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        Parcel m25951I = m25951I(4, m25952D);
        boolean m24100h = dp2.m24100h(m25951I);
        m25951I.recycle();
        return m24100h;
    }

    @Override // com.daaw.an3
    /* renamed from: m */
    public final dp3 mo3507m(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        Parcel m25951I = m25951I(3, m25952D);
        dp3 m25143g3 = cp3.m25143g3(m25951I.readStrongBinder());
        m25951I.recycle();
        return m25143g3;
    }

    @Override // com.daaw.an3
    public final dn3 zzb(String str) {
        dn3 bn3Var;
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        Parcel m25951I = m25951I(1, m25952D);
        IBinder readStrongBinder = m25951I.readStrongBinder();
        if (readStrongBinder == null) {
            bn3Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            bn3Var = queryLocalInterface instanceof dn3 ? (dn3) queryLocalInterface : new bn3(readStrongBinder);
        }
        m25951I.recycle();
        return bn3Var;
    }
}
