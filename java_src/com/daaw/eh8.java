package com.daaw;

import sun.misc.Unsafe;
/* loaded from: classes2.dex */
public final class eh8 extends gh8 {
    public eh8(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.daaw.gh8
    /* renamed from: a */
    public final double mo21605a(Object obj, long j) {
        return Double.longBitsToDouble(m21595k(obj, j));
    }

    @Override // com.daaw.gh8
    /* renamed from: b */
    public final float mo21604b(Object obj, long j) {
        return Float.intBitsToFloat(m21596j(obj, j));
    }

    @Override // com.daaw.gh8
    /* renamed from: c */
    public final void mo21603c(Object obj, long j, boolean z) {
        if (ih8.f13652h) {
            ih8.m19809d(obj, j, r3 ? (byte) 1 : (byte) 0);
        } else {
            ih8.m19808e(obj, j, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.daaw.gh8
    /* renamed from: d */
    public final void mo21602d(Object obj, long j, byte b) {
        if (ih8.f13652h) {
            ih8.m19809d(obj, j, b);
        } else {
            ih8.m19808e(obj, j, b);
        }
    }

    @Override // com.daaw.gh8
    /* renamed from: e */
    public final void mo21601e(Object obj, long j, double d) {
        m21591o(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.daaw.gh8
    /* renamed from: f */
    public final void mo21600f(Object obj, long j, float f) {
        m21592n(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.daaw.gh8
    /* renamed from: g */
    public final boolean mo21599g(Object obj, long j) {
        return ih8.f13652h ? ih8.m19788y(obj, j) : ih8.m19787z(obj, j);
    }
}
