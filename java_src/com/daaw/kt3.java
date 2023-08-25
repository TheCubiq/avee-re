package com.daaw;

import android.os.Parcel;
/* loaded from: classes.dex */
public abstract class kt3 extends cp2 implements ot3 {
    public kt3() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // com.daaw.cp2
    public final boolean M(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzb();
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
