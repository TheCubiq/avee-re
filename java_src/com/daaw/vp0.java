package com.daaw;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class vp0 extends kj1 {
    /* renamed from: h */
    public static vp0 m6956h(ByteBuffer byteBuffer) {
        return m6955i(byteBuffer, new vp0());
    }

    /* renamed from: i */
    public static vp0 m6955i(ByteBuffer byteBuffer, vp0 vp0Var) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return vp0Var.m6958f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: f */
    public vp0 m6958f(int i, ByteBuffer byteBuffer) {
        m6957g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m6957g(int i, ByteBuffer byteBuffer) {
        m17703c(i, byteBuffer);
    }

    /* renamed from: j */
    public up0 m6954j(up0 up0Var, int i) {
        int m17704b = m17704b(6);
        if (m17704b != 0) {
            return up0Var.m7852f(m17705a(m17702d(m17704b) + (i * 4)), this.f16409b);
        }
        return null;
    }

    /* renamed from: k */
    public int m6953k() {
        int m17704b = m17704b(6);
        if (m17704b != 0) {
            return m17701e(m17704b);
        }
        return 0;
    }

    /* renamed from: l */
    public int m6952l() {
        int m17704b = m17704b(4);
        if (m17704b != 0) {
            return this.f16409b.getInt(m17704b + this.f16408a);
        }
        return 0;
    }
}
