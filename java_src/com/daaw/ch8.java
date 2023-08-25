package com.daaw;

import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class ch8 extends gh8 {
    public ch8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.daaw.gh8
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // com.daaw.gh8
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // com.daaw.gh8
    public final void c(Object obj, long j, boolean z) {
        if (ih8.h) {
            ih8.d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            ih8.e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.daaw.gh8
    public final void d(Object obj, long j, byte b) {
        if (ih8.h) {
            ih8.d(obj, j, b);
        } else {
            ih8.e(obj, j, b);
        }
    }

    @Override // com.daaw.gh8
    public final void e(Object obj, long j, double d) {
        o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.daaw.gh8
    public final void f(Object obj, long j, float f) {
        n(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.daaw.gh8
    public final boolean g(Object obj, long j) {
        return ih8.h ? ih8.y(obj, j) : ih8.z(obj, j);
    }
}
