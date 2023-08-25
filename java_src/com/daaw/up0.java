package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class up0 extends kj1 {
    public up0 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public int h(int i) {
        int b = b(16);
        if (b != 0) {
            return this.b.getInt(d(b) + (i * 4));
        }
        return 0;
    }

    public int i() {
        int b = b(16);
        if (b != 0) {
            return e(b);
        }
        return 0;
    }

    public boolean j() {
        int b = b(6);
        return (b == 0 || this.b.get(b + this.a) == 0) ? false : true;
    }

    public short k() {
        int b = b(14);
        if (b != 0) {
            return this.b.getShort(b + this.a);
        }
        return (short) 0;
    }

    public int l() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }

    public short m() {
        int b = b(8);
        if (b != 0) {
            return this.b.getShort(b + this.a);
        }
        return (short) 0;
    }

    public short n() {
        int b = b(12);
        if (b != 0) {
            return this.b.getShort(b + this.a);
        }
        return (short) 0;
    }
}
