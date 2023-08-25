package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class dh2 extends ThreadLocal {
    public dh2(eh2 eh2Var) {
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
