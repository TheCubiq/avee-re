package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class ai3 extends bp2 implements ci3 {
    public ai3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.daaw.ci3
    /* renamed from: f */
    public final void mo18491f(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(1, m25952D);
    }

    @Override // com.daaw.ci3
    public final void zze() {
        m25950M(2, m25952D());
    }
}
