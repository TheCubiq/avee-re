package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
/* loaded from: classes.dex */
public final class ps3 extends bp2 implements rs3 {
    public ps3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.daaw.rs3
    public final void a(String str) {
        Parcel D = D();
        D.writeString(str);
        M(2, D);
    }

    @Override // com.daaw.rs3
    public final void x0(List list) {
        Parcel D = D();
        D.writeTypedList(list);
        M(1, D);
    }
}
