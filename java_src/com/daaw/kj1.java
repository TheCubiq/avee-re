package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class kj1 {
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;
    public qq1 e = qq1.a();

    public int a(int i) {
        return i + this.b.getInt(i);
    }

    public int b(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public void c(int i, ByteBuffer byteBuffer) {
        short s;
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            s = this.b.getShort(i2);
        } else {
            s = 0;
            this.a = 0;
            this.c = 0;
        }
        this.d = s;
    }

    public int d(int i) {
        int i2 = i + this.a;
        return i2 + this.b.getInt(i2) + 4;
    }

    public int e(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2 + this.b.getInt(i2));
    }
}
