package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class vo8 extends ma7 {

    /* renamed from: h */
    public long f30410h;

    /* renamed from: i */
    public int f30411i;

    /* renamed from: j */
    public int f30412j;

    public vo8() {
        super(2, 0);
        this.f30412j = 32;
    }

    @Override // com.daaw.ma7, com.daaw.i37
    /* renamed from: b */
    public final void mo6965b() {
        super.mo6965b();
        this.f30411i = 0;
    }

    /* renamed from: m */
    public final int m6964m() {
        return this.f30411i;
    }

    /* renamed from: n */
    public final long m6963n() {
        return this.f30410h;
    }

    /* renamed from: o */
    public final void m6962o(int i) {
        this.f30412j = i;
    }

    /* renamed from: p */
    public final boolean m6961p(ma7 ma7Var) {
        ByteBuffer byteBuffer;
        uo4.m7874d(!ma7Var.m20162d(1073741824));
        uo4.m7874d(!ma7Var.m20162d(268435456));
        uo4.m7874d(!ma7Var.m20162d(4));
        if (m6960q()) {
            if (this.f30411i >= this.f30412j || ma7Var.m20162d(Integer.MIN_VALUE) != m20162d(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = ma7Var.f18728c;
            if (byteBuffer2 != null && (byteBuffer = this.f18728c) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.f30411i;
        this.f30411i = i + 1;
        if (i == 0) {
            this.f18730e = ma7Var.f18730e;
            if (ma7Var.m20162d(1)) {
                m20163c(1);
            }
        }
        if (ma7Var.m20162d(Integer.MIN_VALUE)) {
            m20163c(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = ma7Var.f18728c;
        if (byteBuffer3 != null) {
            m16130i(byteBuffer3.remaining());
            this.f18728c.put(byteBuffer3);
        }
        this.f30410h = ma7Var.f18730e;
        return true;
    }

    /* renamed from: q */
    public final boolean m6960q() {
        return this.f30411i > 0;
    }
}
