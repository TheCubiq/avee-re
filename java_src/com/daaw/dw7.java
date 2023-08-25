package com.daaw;

import libcore.io.Memory;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class dw7 extends fw7 {
    public dw7(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.daaw.fw7
    /* renamed from: a */
    public final byte mo22200a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.daaw.fw7
    /* renamed from: b */
    public final double mo22199b(Object obj, long j) {
        return Double.longBitsToDouble(m22188m(obj, j));
    }

    @Override // com.daaw.fw7
    /* renamed from: c */
    public final float mo22198c(Object obj, long j) {
        return Float.intBitsToFloat(m22189l(obj, j));
    }

    @Override // com.daaw.fw7
    /* renamed from: d */
    public final void mo22197d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // com.daaw.fw7
    /* renamed from: e */
    public final void mo22196e(Object obj, long j, boolean z) {
        if (gw7.f11793i) {
            gw7.m21179g(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            gw7.m21178h(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.daaw.fw7
    /* renamed from: f */
    public final void mo22195f(Object obj, long j, byte b) {
        if (gw7.f11793i) {
            gw7.m21179g(obj, j, b);
        } else {
            gw7.m21178h(obj, j, b);
        }
    }

    @Override // com.daaw.fw7
    /* renamed from: g */
    public final void mo22194g(Object obj, long j, double d) {
        m22184q(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.daaw.fw7
    /* renamed from: h */
    public final void mo22193h(Object obj, long j, float f) {
        m22185p(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.daaw.fw7
    /* renamed from: i */
    public final boolean mo22192i(Object obj, long j) {
        return gw7.f11793i ? gw7.m21189E(obj, j) : gw7.m21188F(obj, j);
    }
}
