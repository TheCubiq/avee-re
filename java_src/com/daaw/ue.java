package com.daaw;

import com.daaw.m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class ue implements m7 {
    public int b;
    public int c;
    public int[] d;
    public boolean e;
    public int[] f;
    public ByteBuffer g;
    public ByteBuffer h;
    public boolean i;

    public ue() {
        ByteBuffer byteBuffer = m7.a;
        this.g = byteBuffer;
        this.h = byteBuffer;
        this.b = -1;
        this.c = -1;
    }

    public void a(int[] iArr) {
        this.d = iArr;
    }

    @Override // com.daaw.m7
    public boolean c() {
        return this.i && this.h == m7.a;
    }

    @Override // com.daaw.m7
    public boolean d() {
        return this.e;
    }

    @Override // com.daaw.m7
    public void e() {
        flush();
        this.g = m7.a;
        this.b = -1;
        this.c = -1;
        this.f = null;
        this.d = null;
        this.e = false;
    }

    @Override // com.daaw.m7
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.h;
        this.h = m7.a;
        return byteBuffer;
    }

    @Override // com.daaw.m7
    public void flush() {
        this.h = m7.a;
        this.i = false;
    }

    @Override // com.daaw.m7
    public void g(ByteBuffer byteBuffer) {
        s6.f(this.f != null);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.b * 2)) * this.f.length * 2;
        if (this.g.capacity() < length) {
            this.g = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i : this.f) {
                this.g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b * 2;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    @Override // com.daaw.m7
    public int h() {
        int[] iArr = this.f;
        return iArr == null ? this.b : iArr.length;
    }

    @Override // com.daaw.m7
    public int i() {
        return this.c;
    }

    @Override // com.daaw.m7
    public int j() {
        return 2;
    }

    @Override // com.daaw.m7
    public void k() {
        this.i = true;
    }

    @Override // com.daaw.m7
    public boolean l(int i, int i2, int i3) {
        boolean z = !Arrays.equals(this.d, this.f);
        int[] iArr = this.d;
        this.f = iArr;
        if (iArr == null) {
            this.e = false;
            return z;
        } else if (i3 != 2) {
            throw new m7.a(i, i2, i3);
        } else {
            if (!z && this.c == i && this.b == i2) {
                return false;
            }
            this.c = i;
            this.b = i2;
            this.e = i2 != iArr.length;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f;
                if (i4 >= iArr2.length) {
                    return true;
                }
                int i5 = iArr2[i4];
                if (i5 >= i2) {
                    throw new m7.a(i, i2, i3);
                }
                this.e = (i5 != i4) | this.e;
                i4++;
            }
        }
    }
}
