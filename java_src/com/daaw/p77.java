package com.daaw;

import javax.annotation.CheckForNull;
/* loaded from: classes.dex */
public final class p77 implements Runnable {
    @CheckForNull
    public s77 p;

    public p77(s77 s77Var) {
        this.p = s77Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        r1 = r0.w;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.daaw.s77 r0 = r10.p
            if (r0 != 0) goto L5
            return
        L5:
            com.daaw.f77 r1 = com.daaw.s77.E(r0)
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = 0
            r10.p = r2
            boolean r3 = r1.isDone()
            if (r3 == 0) goto L19
            r0.w(r1)
            return
        L19:
            r3 = 1
            java.util.concurrent.ScheduledFuture r4 = com.daaw.s77.G(r0)     // Catch: java.lang.Throwable -> L7f
            com.daaw.s77.H(r0, r2)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = "Timed out"
            if (r4 == 0) goto L52
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L50
            long r6 = r4.getDelay(r6)     // Catch: java.lang.Throwable -> L50
            long r6 = java.lang.Math.abs(r6)     // Catch: java.lang.Throwable -> L50
            r8 = 10
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L52
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r4.<init>()     // Catch: java.lang.Throwable -> L50
            r4.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r8 = " (timeout delayed by "
            r4.append(r8)     // Catch: java.lang.Throwable -> L50
            r4.append(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = " ms after scheduled time)"
            r4.append(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L50
            r5 = r4
            goto L52
        L50:
            r4 = move-exception
            goto L76
        L52:
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r6.<init>()     // Catch: java.lang.Throwable -> L50
            r6.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = ": "
            r6.append(r7)     // Catch: java.lang.Throwable -> L50
            r6.append(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L50
            com.daaw.r77 r5 = new com.daaw.r77     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L7f
            r0.i(r5)     // Catch: java.lang.Throwable -> L7f
            r1.cancel(r3)
            return
        L76:
            com.daaw.r77 r6 = new com.daaw.r77     // Catch: java.lang.Throwable -> L7f
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L7f
            r0.i(r6)     // Catch: java.lang.Throwable -> L7f
            throw r4     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            r1.cancel(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.p77.run():void");
    }
}
