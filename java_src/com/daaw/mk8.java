package com.daaw;

import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class mk8 extends kk8 {
    public int[] i;
    public int[] j;

    @Override // com.daaw.hi8
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer d = d(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                d.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        d.flip();
    }

    @Override // com.daaw.kk8
    public final di8 c(di8 di8Var) {
        int[] iArr = this.i;
        if (iArr == null) {
            return di8.e;
        }
        if (di8Var.c != 2) {
            throw new fi8(di8Var);
        }
        boolean z = di8Var.b != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new di8(di8Var.a, length, 2) : di8.e;
            }
            int i2 = iArr[i];
            if (i2 >= di8Var.b) {
                throw new fi8(di8Var);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.daaw.kk8
    public final void e() {
        this.j = this.i;
    }

    @Override // com.daaw.kk8
    public final void g() {
        this.j = null;
        this.i = null;
    }

    public final void i(int[] iArr) {
        this.i = iArr;
    }
}
