package com.daaw;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class gm8 extends kk8 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[LOOP:4: B:30:0x00af->B:31:0x00b1, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0036, B:31:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.daaw.hi8
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3498b(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.f16433b.f7135c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 == 536870912) {
                        i2 /= 3;
                    } else if (i3 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer m17680d = m17680d(i2);
                i = this.f16433b.f7135c;
                if (i == 3) {
                    while (position < limit) {
                        m17680d.put((byte) 0);
                        m17680d.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        short m19431A = (short) (it5.m19431A(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        m17680d.put((byte) (m19431A & 255));
                        m17680d.put((byte) ((m19431A >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        m17680d.put(byteBuffer.get(position + 1));
                        m17680d.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        m17680d.put(byteBuffer.get(position + 1));
                        m17680d.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i != 805306368) {
                    throw new IllegalStateException();
                } else {
                    while (position < limit) {
                        m17680d.put(byteBuffer.get(position + 2));
                        m17680d.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                m17680d.flip();
            }
            i2 /= 2;
            ByteBuffer m17680d2 = m17680d(i2);
            i = this.f16433b.f7135c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            m17680d2.flip();
        }
        i2 += i2;
        ByteBuffer m17680d22 = m17680d(i2);
        i = this.f16433b.f7135c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        m17680d22.flip();
    }

    @Override // com.daaw.kk8
    /* renamed from: c */
    public final di8 mo3570c(di8 di8Var) {
        int i = di8Var.f7135c;
        if (i != 3) {
            if (i == 2) {
                return di8.f7132e;
            }
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                throw new fi8(di8Var);
            }
        }
        return new di8(di8Var.f7133a, di8Var.f7134b, 2);
    }
}
