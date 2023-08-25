package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
public final class te3 extends bp2 implements ve3 {
    public te3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.daaw.ve3
    public final void f(String str) {
        Parcel D = D();
        D.writeString(str);
        M(1, D);
    }

    @Override // com.daaw.ve3
    public final void zze() {
        M(2, D());
    }
}
