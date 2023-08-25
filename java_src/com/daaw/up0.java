package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class up0 extends kj1 {
    /* renamed from: f */
    public up0 m7852f(int i, ByteBuffer byteBuffer) {
        m7851g(i, byteBuffer);
        return this;
    }

    /* renamed from: g */
    public void m7851g(int i, ByteBuffer byteBuffer) {
        m17703c(i, byteBuffer);
    }

    /* renamed from: h */
    public int m7850h(int i) {
        int m17704b = m17704b(16);
        if (m17704b != 0) {
            return this.f16409b.getInt(m17702d(m17704b) + (i * 4));
        }
        return 0;
    }

    /* renamed from: i */
    public int m7849i() {
        int m17704b = m17704b(16);
        if (m17704b != 0) {
            return m17701e(m17704b);
        }
        return 0;
    }

    /* renamed from: j */
    public boolean m7848j() {
        int m17704b = m17704b(6);
        return (m17704b == 0 || this.f16409b.get(m17704b + this.f16408a) == 0) ? false : true;
    }

    /* renamed from: k */
    public short m7847k() {
        int m17704b = m17704b(14);
        if (m17704b != 0) {
            return this.f16409b.getShort(m17704b + this.f16408a);
        }
        return (short) 0;
    }

    /* renamed from: l */
    public int m7846l() {
        int m17704b = m17704b(4);
        if (m17704b != 0) {
            return this.f16409b.getInt(m17704b + this.f16408a);
        }
        return 0;
    }

    /* renamed from: m */
    public short m7845m() {
        int m17704b = m17704b(8);
        if (m17704b != 0) {
            return this.f16409b.getShort(m17704b + this.f16408a);
        }
        return (short) 0;
    }

    /* renamed from: n */
    public short m7844n() {
        int m17704b = m17704b(12);
        if (m17704b != 0) {
            return this.f16409b.getShort(m17704b + this.f16408a);
        }
        return (short) 0;
    }
}
