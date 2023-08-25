package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class yl8 extends kk8 {

    /* renamed from: i */
    public static final int f33788i = Float.floatToIntBits(Float.NaN);

    /* renamed from: i */
    public static void m3569i(int i, ByteBuffer byteBuffer) {
        double d = i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f33788i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.daaw.hi8
    /* renamed from: b */
    public final void mo3498b(ByteBuffer byteBuffer) {
        ByteBuffer m17680d;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f16433b.f7135c;
        if (i2 == 536870912) {
            m17680d = m17680d((i / 3) * 4);
            while (position < limit) {
                m3569i(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m17680d);
                position += 3;
            }
        } else if (i2 != 805306368) {
            throw new IllegalStateException();
        } else {
            m17680d = m17680d(i);
            while (position < limit) {
                m3569i((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m17680d);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m17680d.flip();
    }

    @Override // com.daaw.kk8
    /* renamed from: c */
    public final di8 mo3570c(di8 di8Var) {
        int i = di8Var.f7135c;
        if (it5.m19375u(i)) {
            return i != 4 ? new di8(di8Var.f7133a, di8Var.f7134b, 4) : di8.f7132e;
        }
        throw new fi8(di8Var);
    }
}
