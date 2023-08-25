package com.daaw;

import java.nio.ByteBuffer;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public abstract class jd1 extends ed1<xh1, yh1, vh1> implements uh1 {
    public final String n;

    public jd1(String str) {
        super(new xh1[2], new yh1[2]);
        this.n = str;
        v(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
    }

    @Override // com.daaw.ed1
    /* renamed from: A */
    public final vh1 k(xh1 xh1Var, yh1 yh1Var, boolean z) {
        try {
            ByteBuffer byteBuffer = xh1Var.r;
            yh1Var.n(xh1Var.s, z(byteBuffer.array(), byteBuffer.limit(), z), xh1Var.u);
            yh1Var.g(Integer.MIN_VALUE);
            return null;
        } catch (vh1 e) {
            return e;
        }
    }

    public final void B(yh1 yh1Var) {
        super.s(yh1Var);
    }

    @Override // com.daaw.uh1
    public void b(long j) {
    }

    @Override // com.daaw.ed1
    /* renamed from: w */
    public final xh1 h() {
        return new xh1();
    }

    @Override // com.daaw.ed1
    /* renamed from: x */
    public final yh1 i() {
        return new kd1(this);
    }

    @Override // com.daaw.ed1
    /* renamed from: y */
    public final vh1 j(Throwable th) {
        return new vh1("Unexpected decode error", th);
    }

    public abstract th1 z(byte[] bArr, int i, boolean z);
}
