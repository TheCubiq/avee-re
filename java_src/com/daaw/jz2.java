package com.daaw;
/* loaded from: classes.dex */
public final class jz2 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d = 0;

    public jz2(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r0 == 8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(int r9) {
        /*
            r8 = this;
            int r0 = r9 >> 3
            r1 = 0
            r2 = 0
        L4:
            r3 = 255(0xff, float:3.57E-43)
            if (r1 >= r0) goto L40
            int r4 = r8.c
            int r4 = r4 + 1
            boolean r4 = r8.h(r4)
            if (r4 == 0) goto L17
            int r4 = r8.c
            int r4 = r4 + 2
            goto L1b
        L17:
            int r4 = r8.c
            int r4 = r4 + 1
        L1b:
            int r5 = r8.d
            if (r5 == 0) goto L30
            byte[] r6 = r8.a
            int r7 = r8.c
            r7 = r6[r7]
            r7 = r7 & r3
            int r7 = r7 << r5
            r6 = r6[r4]
            r6 = r6 & r3
            int r5 = 8 - r5
            int r5 = r6 >>> r5
            r5 = r5 | r7
            goto L36
        L30:
            byte[] r5 = r8.a
            int r6 = r8.c
            r5 = r5[r6]
        L36:
            int r9 = r9 + (-8)
            r3 = r3 & r5
            int r3 = r3 << r9
            r2 = r2 | r3
            r8.c = r4
            int r1 = r1 + 1
            goto L4
        L40:
            if (r9 <= 0) goto L86
            int r0 = r8.d
            int r0 = r0 + r9
            r1 = 8
            int r9 = 8 - r9
            int r9 = r3 >> r9
            byte r9 = (byte) r9
            int r4 = r8.c
            int r4 = r4 + 1
            boolean r4 = r8.h(r4)
            if (r4 == 0) goto L5b
            int r4 = r8.c
            int r4 = r4 + 2
            goto L5f
        L5b:
            int r4 = r8.c
            int r4 = r4 + 1
        L5f:
            byte[] r5 = r8.a
            int r6 = r8.c
            if (r0 <= r1) goto L78
            r6 = r5[r6]
            r6 = r6 & r3
            int r7 = r0 + (-8)
            int r6 = r6 << r7
            r5 = r5[r4]
            r3 = r3 & r5
            int r5 = 16 - r0
            int r3 = r3 >> r5
            r3 = r3 | r6
            r9 = r9 & r3
            r9 = r9 | r2
        L74:
            r8.c = r4
        L76:
            r2 = r9
            goto L83
        L78:
            r5 = r5[r6]
            r3 = r3 & r5
            int r5 = 8 - r0
            int r3 = r3 >> r5
            r9 = r9 & r3
            r9 = r9 | r2
            if (r0 != r1) goto L76
            goto L74
        L83:
            int r0 = r0 % r1
            r8.d = r0
        L86:
            r8.g()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.jz2.a(int):int");
    }

    public final int b() {
        int f = f();
        return (f % 2 == 0 ? -1 : 1) * ((f + 1) / 2);
    }

    public final int c() {
        return f();
    }

    public final void d(int i) {
        int i2 = this.c;
        int i3 = (i >> 3) + i2;
        this.c = i3;
        int i4 = this.d + (i & 7);
        this.d = i4;
        if (i4 > 7) {
            this.c = i3 + 1;
            this.d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                g();
                return;
            } else if (h(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }

    public final boolean e() {
        return a(1) == 1;
    }

    public final int f() {
        int i = 0;
        while (!e()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? a(i) : 0);
    }

    public final void g() {
        int i;
        int i2;
        int i3 = this.c;
        boolean z = true;
        if (i3 < 0 || (i = this.d) < 0 || i >= 8 || (i3 >= (i2 = this.b) && (i3 != i2 || i != 0))) {
            z = false;
        }
        az2.e(z);
    }

    public final boolean h(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }
}
