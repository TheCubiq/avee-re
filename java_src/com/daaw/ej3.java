package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
/* loaded from: classes.dex */
public final class ej3 extends bp2 implements gj3 {
    public ej3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.daaw.gj3
    public final void k2(List list) {
        Parcel D = D();
        D.writeTypedList(list);
        M(1, D);
    }
}
