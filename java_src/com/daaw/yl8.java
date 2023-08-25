package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class yl8 extends kk8 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void i(int i2, ByteBuffer byteBuffer) {
        double d = i2;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.daaw.hi8
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer d;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            d = d((i2 / 3) * 4);
            while (position < limit) {
                i(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), d);
                position += 3;
            }
        } else if (i3 != 805306368) {
            throw new IllegalStateException();
        } else {
            d = d(i2);
            while (position < limit) {
                i((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), d);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        d.flip();
    }

    @Override // com.daaw.kk8
    public final di8 c(di8 di8Var) {
        int i2 = di8Var.c;
        if (it5.u(i2)) {
            return i2 != 4 ? new di8(di8Var.a, di8Var.b, 4) : di8.e;
        }
        throw new fi8(di8Var);
    }
}
