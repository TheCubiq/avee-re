package com.daaw;

import android.annotation.TargetApi;
@TargetApi(16)
/* loaded from: classes.dex */
public final class c03 {
    public final b03 a;
    public final boolean b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public long k;

    public c03(double d) {
        long j;
        boolean z = d != -1.0d;
        this.b = z;
        if (z) {
            this.a = b03.a();
            long j2 = (long) (1.0E9d / d);
            this.c = j2;
            j = (j2 * 80) / 100;
        } else {
            this.a = null;
            j = -1;
            this.c = -1L;
        }
        this.d = j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c03(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "window"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r0 = r3.getDefaultDisplay()
            if (r0 == 0) goto L18
            android.view.Display r3 = r3.getDefaultDisplay()
            float r3 = r3.getRefreshRate()
            double r0 = (double) r3
            goto L1a
        L18:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L1a:
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.c03.<init>(android.content.Context):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (d(r0, r14) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r12, long r14) {
        /*
            r11 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            boolean r2 = r11.h
            if (r2 == 0) goto L41
            long r2 = r11.e
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto L19
            long r2 = r11.k
            r4 = 1
            long r2 = r2 + r4
            r11.k = r2
            long r2 = r11.g
            r11.f = r2
        L19:
            long r2 = r11.k
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L3a
            long r4 = r11.j
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r11.f
            long r2 = r2 + r4
            boolean r4 = r11.d(r2, r14)
            if (r4 == 0) goto L33
        L30:
            r11.h = r6
            goto L41
        L33:
            long r4 = r11.i
            long r4 = r4 + r2
            long r6 = r11.j
            long r4 = r4 - r6
            goto L43
        L3a:
            boolean r2 = r11.d(r0, r14)
            if (r2 == 0) goto L41
            goto L30
        L41:
            r4 = r14
            r2 = r0
        L43:
            boolean r6 = r11.h
            r7 = 0
            if (r6 != 0) goto L52
            r11.j = r0
            r11.i = r14
            r11.k = r7
            r14 = 1
            r11.h = r14
        L52:
            r11.e = r12
            r11.g = r2
            com.daaw.b03 r12 = r11.a
            if (r12 == 0) goto L85
            long r12 = r12.p
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L61
            goto L85
        L61:
            com.daaw.b03 r12 = r11.a
            long r12 = r12.p
            long r14 = r11.c
            long r0 = r4 - r12
            long r0 = r0 / r14
            long r0 = r0 * r14
            long r12 = r12 + r0
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 > 0) goto L74
            long r14 = r12 - r14
            goto L78
        L74:
            long r14 = r14 + r12
            r9 = r12
            r12 = r14
            r14 = r9
        L78:
            long r0 = r12 - r4
            long r4 = r4 - r14
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 >= 0) goto L80
            goto L81
        L80:
            r12 = r14
        L81:
            long r14 = r11.d
            long r12 = r12 - r14
            return r12
        L85:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.c03.a(long, long):long");
    }

    public final void b() {
        if (this.b) {
            this.a.c();
        }
    }

    public final void c() {
        this.h = false;
        if (this.b) {
            this.a.b();
        }
    }

    public final boolean d(long j, long j2) {
        return Math.abs((j2 - this.i) - (j - this.j)) > 20000000;
    }
}
