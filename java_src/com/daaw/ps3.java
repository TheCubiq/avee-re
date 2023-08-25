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
    /* renamed from: a */
    public final void mo4546a(String str) {
        Parcel m25952D = m25952D();
        m25952D.writeString(str);
        m25950M(2, m25952D);
    }

    @Override // com.daaw.rs3
    /* renamed from: x0 */
    public final void mo4545x0(List list) {
        Parcel m25952D = m25952D();
        m25952D.writeTypedList(list);
        m25950M(1, m25952D);
    }
}
