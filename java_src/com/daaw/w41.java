package com.daaw;

import com.daaw.m7;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class w41 implements m7 {
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public ByteBuffer e;
    public ByteBuffer f;
    public boolean g;

    public w41() {
        ByteBuffer byteBuffer = m7.a;
        this.e = byteBuffer;
        this.f = byteBuffer;
    }

    @Override // com.daaw.m7
    public boolean c() {
        return this.g && this.f == m7.a;
    }

    @Override // com.daaw.m7
    public boolean d() {
        int i = this.d;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.daaw.m7
    public void e() {
        flush();
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = m7.a;
    }

    @Override // com.daaw.m7
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.f;
        this.f = m7.a;
        return byteBuffer;
    }

    @Override // com.daaw.m7
    public void flush() {
        this.f = m7.a;
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[LOOP:2: B:25:0x0081->B:26:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0041, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.daaw.m7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L20
            if (r3 == r6) goto L21
            if (r3 != r4) goto L1a
            int r2 = r2 / 2
            goto L23
        L1a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L20:
            int r2 = r2 / r6
        L21:
            int r2 = r2 * 2
        L23:
            java.nio.ByteBuffer r3 = r7.e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L3a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.e = r2
            goto L3f
        L3a:
            java.nio.ByteBuffer r2 = r7.e
            r2.clear()
        L3f:
            int r2 = r7.d
            if (r2 == r5) goto L81
            if (r2 == r6) goto L68
            if (r2 != r4) goto L62
        L47:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L47
        L62:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L68:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L68
        L81:
            if (r0 >= r1) goto L9c
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L81
        L9c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.e
            r7.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.w41.g(java.nio.ByteBuffer):void");
    }

    @Override // com.daaw.m7
    public int h() {
        return this.c;
    }

    @Override // com.daaw.m7
    public int i() {
        return this.b;
    }

    @Override // com.daaw.m7
    public int j() {
        return 2;
    }

    @Override // com.daaw.m7
    public void k() {
        this.g = true;
    }

    @Override // com.daaw.m7
    public boolean l(int i, int i2, int i3) {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            if (this.b == i && this.c == i2 && this.d == i3) {
                return false;
            }
            this.b = i;
            this.c = i2;
            this.d = i3;
            return true;
        }
        throw new m7.a(i, i2, i3);
    }
}
