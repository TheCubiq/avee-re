package com.daaw;

import java.nio.ByteBuffer;
import java.util.Objects;
/* loaded from: classes.dex */
public final class mk8 extends kk8 {

    /* renamed from: i */
    public int[] f18949i;

    /* renamed from: j */
    public int[] f18950j;

    @Override // com.daaw.hi8
    /* renamed from: b */
    public final void mo3498b(ByteBuffer byteBuffer) {
        int[] iArr = this.f18950j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m17680d = m17680d(((limit - position) / this.f16433b.f7136d) * this.f16434c.f7136d);
        while (position < limit) {
            for (int i : iArr) {
                m17680d.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.f16433b.f7136d;
        }
        byteBuffer.position(limit);
        m17680d.flip();
    }

    @Override // com.daaw.kk8
    /* renamed from: c */
    public final di8 mo3570c(di8 di8Var) {
        int[] iArr = this.f18949i;
        if (iArr == null) {
            return di8.f7132e;
        }
        if (di8Var.f7135c != 2) {
            throw new fi8(di8Var);
        }
        boolean z = di8Var.f7134b != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new di8(di8Var.f7133a, length, 2) : di8.f7132e;
            }
            int i2 = iArr[i];
            if (i2 >= di8Var.f7134b) {
                throw new fi8(di8Var);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.daaw.kk8
    /* renamed from: e */
    public final void mo8013e() {
        this.f18950j = this.f18949i;
    }

    @Override // com.daaw.kk8
    /* renamed from: g */
    public final void mo8011g() {
        this.f18950j = null;
        this.f18949i = null;
    }

    /* renamed from: i */
    public final void m15983i(int[] iArr) {
        this.f18949i = iArr;
    }
}
