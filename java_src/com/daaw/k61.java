package com.daaw;
/* loaded from: classes.dex */
public class k61 {
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public int a() {
        return this.g ? this.a : this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    public int d() {
        return this.g ? this.b : this.a;
    }

    public void e(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.e = i;
            this.a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f = i2;
            this.b = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.g
            if (r2 != r0) goto L5
            return
        L5:
            r1.g = r2
            boolean r0 = r1.h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.e
        L16:
            r1.a = r2
            int r2 = r1.c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.e
        L24:
            r1.a = r2
            int r2 = r1.d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.e
            r1.a = r2
        L2f:
            int r2 = r1.f
        L31:
            r1.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.k61.f(boolean):void");
    }

    public void g(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2;
        }
    }
}
