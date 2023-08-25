package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes2.dex */
public final class gl4 extends x22 implements z76 {
    public gl4(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // com.daaw.z76
    /* renamed from: t */
    public final boolean mo2680t(boolean z) {
        Parcel m5608D = m5608D();
        hs3.m20439a(m5608D, true);
        Parcel m5607I = m5607I(2, m5608D);
        boolean m20438b = hs3.m20438b(m5607I);
        m5607I.recycle();
        return m20438b;
    }

    @Override // com.daaw.z76
    public final String zzc() {
        Parcel m5607I = m5607I(1, m5608D());
        String readString = m5607I.readString();
        m5607I.recycle();
        return readString;
    }

    @Override // com.daaw.z76
    public final boolean zzd() {
        Parcel m5607I = m5607I(6, m5608D());
        boolean m20438b = hs3.m20438b(m5607I);
        m5607I.recycle();
        return m20438b;
    }
}
