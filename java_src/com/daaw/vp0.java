package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class vp0 extends kj1 {
    public static vp0 h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new vp0());
    }

    public static vp0 i(ByteBuffer byteBuffer, vp0 vp0Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return vp0Var.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public vp0 f(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
        return this;
    }

    public void g(int i, ByteBuffer byteBuffer) {
        c(i, byteBuffer);
    }

    public up0 j(up0 up0Var, int i) {
        int b = b(6);
        if (b != 0) {
            return up0Var.f(a(d(b) + (i * 4)), this.b);
        }
        return null;
    }

    public int k() {
        int b = b(6);
        if (b != 0) {
            return e(b);
        }
        return 0;
    }

    public int l() {
        int b = b(4);
        if (b != 0) {
            return this.b.getInt(b + this.a);
        }
        return 0;
    }
}
