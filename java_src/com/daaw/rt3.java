package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class rt3 extends pa {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rt3(android.content.Context r9, android.os.Looper r10, com.daaw.pa.a r11, com.daaw.pa.b r12) {
        /*
            r8 = this;
            android.content.Context r0 = r9.getApplicationContext()
            if (r0 == 0) goto L8
            r2 = r0
            goto L9
        L8:
            r2 = r9
        L9:
            r4 = 8
            r7 = 0
            r1 = r8
            r3 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.rt3.<init>(android.content.Context, android.os.Looper, com.daaw.pa$a, com.daaw.pa$b):void");
    }

    public final bu3 J() {
        return (bu3) super.getService();
    }

    @Override // com.daaw.pa
    public final /* synthetic */ IInterface e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsService");
        return queryLocalInterface instanceof bu3 ? (bu3) queryLocalInterface : new zt3(iBinder);
    }

    @Override // com.daaw.pa
    public final String k() {
        return "com.google.android.gms.ads.internal.request.IAdsService";
    }

    @Override // com.daaw.pa
    public final String l() {
        return "com.google.android.gms.ads.service.ADS";
    }
}
