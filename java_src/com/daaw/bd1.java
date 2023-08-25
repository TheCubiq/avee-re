package com.daaw;

import com.daaw.m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class bd1 implements m7 {
    public int b;
    public int c;
    public int d;
    public boolean e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;
    public byte[] i;
    public byte[] j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public long o;

    public bd1() {
        ByteBuffer byteBuffer = m7.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        this.b = -1;
        this.c = -1;
        this.i = new byte[0];
        this.j = new byte[0];
    }

    public final int a(long j) {
        return (int) ((j * this.c) / 1000000);
    }

    public final int b(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i = this.d;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    @Override // com.daaw.m7
    public boolean c() {
        return this.h && this.g == m7.a;
    }

    @Override // com.daaw.m7
    public boolean d() {
        return this.c != -1 && this.e;
    }

    @Override // com.daaw.m7
    public void e() {
        this.e = false;
        flush();
        this.f = m7.a;
        this.b = -1;
        this.c = -1;
        this.m = 0;
        this.i = new byte[0];
        this.j = new byte[0];
    }

    @Override // com.daaw.m7
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.g;
        this.g = m7.a;
        return byteBuffer;
    }

    @Override // com.daaw.m7
    public void flush() {
        if (d()) {
            int a = a(100000L) * this.d;
            if (this.i.length != a) {
                this.i = new byte[a];
            }
            int a2 = a(10000L) * this.d;
            this.m = a2;
            if (this.j.length != a2) {
                this.j = new byte[a2];
            }
        }
        this.k = 0;
        this.g = m7.a;
        this.h = false;
        this.o = 0L;
        this.l = 0;
        this.n = false;
    }

    @Override // com.daaw.m7
    public void g(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.k;
            if (i == 0) {
                s(byteBuffer);
            } else if (i == 1) {
                r(byteBuffer);
            } else if (i != 2) {
                throw new IllegalStateException();
            } else {
                t(byteBuffer);
            }
        }
    }

    @Override // com.daaw.m7
    public int h() {
        return this.b;
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
        this.h = true;
        int i = this.l;
        if (i > 0) {
            p(this.i, i);
        }
        if (this.n) {
            return;
        }
        this.o += this.m / this.d;
    }

    @Override // com.daaw.m7
    public boolean l(int i, int i2, int i3) {
        if (i3 == 2) {
            if (this.c == i && this.b == i2) {
                return false;
            }
            this.c = i;
            this.b = i2;
            this.d = i2 * 2;
            return true;
        }
        throw new m7.a(i, i2, i3);
    }

    public final int m(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i = this.d;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    public long n() {
        return this.o;
    }

    public final void o(ByteBuffer byteBuffer) {
        q(byteBuffer.remaining());
        this.f.put(byteBuffer);
        this.f.flip();
        this.g = this.f;
    }

    public final void p(byte[] bArr, int i) {
        q(i);
        this.f.put(bArr, 0, i);
        this.f.flip();
        this.g = this.f;
    }

    public final void q(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        if (i > 0) {
            this.n = true;
        }
    }

    public final void r(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m = m(byteBuffer);
        int position = m - byteBuffer.position();
        byte[] bArr = this.i;
        int length = bArr.length;
        int i = this.l;
        int i2 = length - i;
        if (m < limit && position < i2) {
            p(bArr, i);
            this.l = 0;
            this.k = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.i, this.l, min);
        int i3 = this.l + min;
        this.l = i3;
        byte[] bArr2 = this.i;
        if (i3 == bArr2.length) {
            if (this.n) {
                p(bArr2, this.m);
                this.o += (this.l - (this.m * 2)) / this.d;
            } else {
                this.o += (i3 - this.m) / this.d;
            }
            v(byteBuffer, this.i, this.l);
            this.l = 0;
            this.k = 2;
        }
        byteBuffer.limit(limit);
    }

    public final void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.i.length));
        int b = b(byteBuffer);
        if (b == byteBuffer.position()) {
            this.k = 1;
        } else {
            byteBuffer.limit(b);
            o(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    public final void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m = m(byteBuffer);
        byteBuffer.limit(m);
        this.o += byteBuffer.remaining() / this.d;
        v(byteBuffer, this.j, this.m);
        if (m < limit) {
            p(this.j, this.m);
            this.k = 0;
            byteBuffer.limit(limit);
        }
    }

    public void u(boolean z) {
        this.e = z;
        flush();
    }

    public final void v(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.m);
        int i2 = this.m - min;
        System.arraycopy(bArr, i - i2, this.j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.j, i2, min);
    }
}
