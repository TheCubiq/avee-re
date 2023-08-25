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
    public final void U0(zzbu zzbuVar, yd0 yd0Var) {
        Parcel D = D();
        dp2.g(D, zzbuVar);
        dp2.g(D, yd0Var);
        M(1, D);
    }
}
