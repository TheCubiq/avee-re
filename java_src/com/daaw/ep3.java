package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
/* loaded from: classes.dex */
public final class ep3 extends bp2 implements gp3 {
    public ep3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.daaw.gp3
    public final void Z(zze zzeVar) {
        Parcel D = D();
        dp2.e(D, zzeVar);
        M(3, D);
    }

    @Override // com.daaw.gp3
    public final void a(String str) {
        Parcel D = D();
        D.writeString(str);
        M(1, D);
    }

    @Override // com.daaw.gp3
    public final void f(String str) {
        Parcel D = D();
        D.writeString(str);
        M(2, D);
    }
}
