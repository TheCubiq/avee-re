package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbu;
/* loaded from: classes.dex */
public final class he3 extends bp2 implements je3 {
    public he3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.daaw.je3
    /* renamed from: U0 */
    public final void mo18543U0(zzbu zzbuVar, yd0 yd0Var) {
        Parcel m25952D = m25952D();
        dp2.m24101g(m25952D, zzbuVar);
        dp2.m24101g(m25952D, yd0Var);
        m25950M(1, m25952D);
    }
}
