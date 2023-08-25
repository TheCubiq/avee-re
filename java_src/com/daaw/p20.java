package com.daaw;

import com.daaw.m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class p20 implements m7 {
    public static final int h = Float.floatToIntBits(Float.NaN);
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public ByteBuffer e;
    public ByteBuffer f;
    public boolean g;

    public p20() {
        ByteBuffer byteBuffer = m7.a;
        this.e = byteBuffer;
        this.f = byteBuffer;
    }

    public static void a(int i, ByteBuffer byteBuffer) {
        double d = i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == h) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.daaw.m7
    public boolean c() {
        return this.g && this.f == m7.a;
    }

    @Override // com.daaw.m7
    public boolean d() {
        return sq1.H(this.d);
    }

    @Override // com.daaw.m7
    public void e() {
        flush();
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = m7.a;
    }

    @Override // com.daaw.m7
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.f;
        this.f = m7.a;
        return byteBuffer;
    }

    @Override // com.daaw.m7
    public void flush() {
        this.f = m7.a;
        this.g = false;
    }

    @Override // com.daaw.m7
    public void g(ByteBuffer byteBuffer) {
        boolean z = this.d == 1073741824;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (!z) {
            i = (i / 3) * 4;
        }
        if (this.e.capacity() < i) {
            this.e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.e.clear();
        }
        if (z) {
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), this.e);
                position += 4;
            }
        } else {
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), this.e);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        this.e.flip();
        this.f = this.e;
    }

    @Override // com.daaw.m7
    public int h() {
        return this.c;
    }

    @Override // com.daaw.m7
    public int i() {
        return this.b;
    }

    @Override // com.daaw.m7
    public int j() {
        return 4;
    }

    @Override // com.daaw.m7
    public void k() {
        this.g = true;
    }

    @Override // com.daaw.m7
    public boolean l(int i, int i2, int i3) {
        if (sq1.H(i3)) {
            if (this.b == i && this.c == i2 && this.d == i3) {
                return false;
            }
            this.b = i;
            this.c = i2;
            this.d = i3;
            return true;
        }
        throw new m7.a(i, i2, i3);
    }
}
