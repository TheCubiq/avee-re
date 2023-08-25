package com.daaw;
/* loaded from: classes2.dex */
public final class c18 implements Runnable {
    public final /* synthetic */ ox3 p;
    public final /* synthetic */ p28 q;

    public c18(p28 p28Var, ox3 ox3Var) {
        this.q = p28Var;
        this.p = ox3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            com.daaw.p28 r0 = r7.q
            com.daaw.dr6 r0 = r0.a
            com.daaw.ca8 r0 = r0.M()
            com.daaw.tm8.b()
            com.daaw.dr6 r1 = r0.a
            com.daaw.qa2 r1 = r1.z()
            com.daaw.j65 r2 = com.daaw.m75.w0
            r3 = 0
            boolean r1 = r1.B(r3, r2)
            if (r1 == 0) goto L73
            com.daaw.dr6 r1 = r0.a
            com.daaw.l36 r1 = r1.F()
            com.daaw.cd2 r1 = r1.p()
            com.daaw.vb2 r2 = com.daaw.vb2.ANALYTICS_STORAGE
            boolean r1 = r1.i(r2)
            if (r1 != 0) goto L39
            com.daaw.dr6 r0 = r0.a
            com.daaw.om5 r0 = r0.i()
            com.daaw.hk5 r0 = r0.x()
            java.lang.String r1 = "Analytics storage consent denied; will not get session id"
            goto L7f
        L39:
            com.daaw.dr6 r1 = r0.a
            com.daaw.l36 r1 = r1.F()
            com.daaw.dr6 r2 = r0.a
            com.daaw.ag r2 = r2.b()
            long r4 = r2.a()
            boolean r1 = r1.v(r4)
            if (r1 != 0) goto L82
            com.daaw.dr6 r1 = r0.a
            com.daaw.l36 r1 = r1.F()
            com.daaw.xy5 r1 = r1.p
            long r1 = r1.a()
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L62
            goto L82
        L62:
            com.daaw.dr6 r0 = r0.a
            com.daaw.l36 r0 = r0.F()
            com.daaw.xy5 r0 = r0.p
            long r0 = r0.a()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L83
        L73:
            com.daaw.dr6 r0 = r0.a
            com.daaw.om5 r0 = r0.i()
            com.daaw.hk5 r0 = r0.x()
            java.lang.String r1 = "getSessionId has been disabled."
        L7f:
            r0.a(r1)
        L82:
            r0 = r3
        L83:
            if (r0 == 0) goto L97
            com.daaw.p28 r1 = r7.q
            com.daaw.dr6 r1 = r1.a
            com.daaw.dd8 r1 = r1.N()
            com.daaw.ox3 r2 = r7.p
            long r3 = r0.longValue()
            r1.I(r2, r3)
            return
        L97:
            com.daaw.ox3 r0 = r7.p     // Catch: android.os.RemoteException -> L9d
            r0.T0(r3)     // Catch: android.os.RemoteException -> L9d
            return
        L9d:
            r0 = move-exception
            com.daaw.p28 r1 = r7.q
            com.daaw.dr6 r1 = r1.a
            com.daaw.om5 r1 = r1.i()
            com.daaw.hk5 r1 = r1.q()
            java.lang.String r2 = "getSessionId failed with exception"
            r1.b(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.c18.run():void");
    }
}
