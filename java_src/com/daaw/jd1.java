package com.daaw;

import java.nio.ByteBuffer;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public abstract class jd1 extends ed1<xh1, yh1, vh1> implements uh1 {

    /* renamed from: n */
    public final String f15001n;

    public jd1(String str) {
        super(new xh1[2], new yh1[2]);
        this.f15001n = str;
        m23557v(NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV);
    }

    @Override // com.daaw.ed1
    /* renamed from: A */
    public final vh1 mo18595k(xh1 xh1Var, yh1 yh1Var, boolean z) {
        try {
            ByteBuffer byteBuffer = xh1Var.f11565r;
            yh1Var.m3747n(xh1Var.f11566s, mo5845z(byteBuffer.array(), byteBuffer.limit(), z), xh1Var.f32717u);
            yh1Var.m11440g(Integer.MIN_VALUE);
            return null;
        } catch (vh1 e) {
            return e;
        }
    }

    /* renamed from: B */
    public final void m18599B(yh1 yh1Var) {
        super.m23560s(yh1Var);
    }

    @Override // com.daaw.uh1
    /* renamed from: b */
    public void mo8184b(long j) {
    }

    @Override // com.daaw.ed1
    /* renamed from: w */
    public final xh1 mo18598h() {
        return new xh1();
    }

    @Override // com.daaw.ed1
    /* renamed from: x */
    public final yh1 mo18597i() {
        return new kd1(this);
    }

    @Override // com.daaw.ed1
    /* renamed from: y */
    public final vh1 mo18596j(Throwable th) {
        return new vh1("Unexpected decode error", th);
    }

    /* renamed from: z */
    public abstract th1 mo5845z(byte[] bArr, int i, boolean z);
}
