package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class vo8 extends ma7 {
    public long h;
    public int i;
    public int j;

    public vo8() {
        super(2, 0);
        this.j = 32;
    }

    @Override // com.daaw.ma7, com.daaw.i37
    public final void b() {
        super.b();
        this.i = 0;
    }

    public final int m() {
        return this.i;
    }

    public final long n() {
        return this.h;
    }

    public final void o(int i) {
        this.j = i;
    }

    public final boolean p(ma7 ma7Var) {
        ByteBuffer byteBuffer;
        uo4.d(!ma7Var.d(1073741824));
        uo4.d(!ma7Var.d(268435456));
        uo4.d(!ma7Var.d(4));
        if (q()) {
            if (this.i >= this.j || ma7Var.d(Integer.MIN_VALUE) != d(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = ma7Var.c;
            if (byteBuffer2 != null && (byteBuffer = this.c) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.i;
        this.i = i + 1;
        if (i == 0) {
            this.e = ma7Var.e;
            if (ma7Var.d(1)) {
                c(1);
            }
        }
        if (ma7Var.d(Integer.MIN_VALUE)) {
            c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = ma7Var.c;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.c.put(byteBuffer3);
        }
        this.h = ma7Var.e;
        return true;
    }

    public final boolean q() {
        return this.i > 0;
    }
}
