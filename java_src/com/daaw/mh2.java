package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class mh2 extends az7 {

    /* renamed from: z */
    public ByteBuffer f18876z;

    public mh2(String str) {
        super(str);
    }

    @Override // com.daaw.az7
    /* renamed from: b */
    public final void mo16028b(ByteBuffer byteBuffer) {
        this.f18876z = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
