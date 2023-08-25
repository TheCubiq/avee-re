package com.daaw;

import com.google.android.gms.common.api.Status;
/* loaded from: classes.dex */
public class l3 extends Exception {
    @Deprecated
    public final Status p;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l3(com.google.android.gms.common.api.Status r4) {
        /*
            r3 = this;
            int r0 = r4.q()
            java.lang.String r1 = r4.s()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r4.s()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r0)
            r3.p = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.l3.<init>(com.google.android.gms.common.api.Status):void");
    }

    public Status a() {
        return this.p;
    }

    public int b() {
        return this.p.q();
    }
}
