package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class cz7 extends az7 {

    /* renamed from: z */
    public int f6315z;

    public cz7(String str) {
        super("mvhd");
    }

    /* renamed from: e */
    public final int m24856e() {
        if (!this.f4130r) {
            m26572c();
        }
        return this.f6315z;
    }

    /* renamed from: f */
    public final long m24855f(ByteBuffer byteBuffer) {
        this.f6315z = hh2.m20795c(byteBuffer.get());
        hh2.m20794d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
