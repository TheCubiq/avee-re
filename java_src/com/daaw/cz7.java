package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class cz7 extends az7 {
    public int z;

    public cz7(String str) {
        super("mvhd");
    }

    public final int e() {
        if (!this.r) {
            c();
        }
        return this.z;
    }

    public final long f(ByteBuffer byteBuffer) {
        this.z = hh2.c(byteBuffer.get());
        hh2.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
