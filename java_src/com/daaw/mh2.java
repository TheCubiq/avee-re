package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class mh2 extends az7 {
    public ByteBuffer z;

    public mh2(String str) {
        super(str);
    }

    @Override // com.daaw.az7
    public final void b(ByteBuffer byteBuffer) {
        this.z = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
