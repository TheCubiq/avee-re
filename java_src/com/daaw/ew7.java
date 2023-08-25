package com.daaw;

import libcore.io.Memory;
import sun.misc.Unsafe;
/* loaded from: classes.dex */
public final class ew7 extends fw7 {
    public ew7(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.daaw.fw7
    public final byte a(long j) {
        return Memory.peekByte(j);
    }

    @Override // com.daaw.fw7
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(m(obj, j));
    }

    @Override // com.daaw.fw7
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(l(obj, j));
    }

    @Override // com.daaw.fw7
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray(j, bArr, (int) j2, (int) j3);
    }

    @Override // com.daaw.fw7
    public final void e(Object obj, long j, boolean z) {
        if (gw7.i) {
            gw7.g(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            gw7.h(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.daaw.fw7
    public final void f(Object obj, long j, byte b) {
        if (gw7.i) {
            gw7.g(obj, j, b);
        } else {
            gw7.h(obj, j, b);
        }
    }

    @Override // com.daaw.fw7
    public final void g(Object obj, long j, double d) {
        q(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.daaw.fw7
    public final void h(Object obj, long j, float f) {
        p(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.daaw.fw7
    public final boolean i(Object obj, long j) {
        return gw7.i ? gw7.E(obj, j) : gw7.F(obj, j);
    }
}
