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
    /* renamed from: k2 */
    public final void mo8956k2(List list) {
        Parcel m25952D = m25952D();
        m25952D.writeTypedList(list);
        m25950M(1, m25952D);
    }
}
