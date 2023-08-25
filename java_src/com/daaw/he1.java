package com.daaw;

import com.daaw.m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
/* loaded from: classes.dex */
public final class he1 implements m7 {
    public int g;
    public ge1 h;
    public ByteBuffer i;
    public ShortBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;
    public float d = 1.0f;
    public float e = 1.0f;
    public int b = -1;
    public int c = -1;
    public int f = -1;

    public he1() {
        ByteBuffer byteBuffer = m7.a;
        this.i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = byteBuffer;
        this.g = -1;
    }

    public long a(long j) {
        long j2 = this.m;
        if (j2 >= 1024) {
            int i = this.f;
            int i2 = this.c;
            long j3 = this.l;
            return i == i2 ? sq1.T(j, j3, j2) : sq1.T(j, j3 * i, j2 * i2);
        }
        double d = this.d;
        double d2 = j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    public float b(float f) {
        float k = sq1.k(f, 0.1f, 8.0f);
        if (this.e != k) {
            this.e = k;
            this.h = null;
        }
        flush();
        return k;
    }

    @Override // com.daaw.m7
    public boolean c() {
        ge1 ge1Var;
        return this.n && ((ge1Var = this.h) == null || ge1Var.j() == 0);
    }

    @Override // com.daaw.m7
    public boolean d() {
        return this.c != -1 && (Math.abs(this.d - 1.0f) >= 0.01f || Math.abs(this.e - 1.0f) >= 0.01f || this.f != this.c);
    }

    @Override // com.daaw.m7
    public void e() {
        this.d = 1.0f;
        this.e = 1.0f;
        this.b = -1;
        this.c = -1;
        this.f = -1;
        ByteBuffer byteBuffer = m7.a;
        this.i = byteBuffer;
        this.j = byteBuffer.asShortBuffer();
        this.k = byteBuffer;
        this.g = -1;
        this.h = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // com.daaw.m7
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.k;
        this.k = m7.a;
        return byteBuffer;
    }

    @Override // com.daaw.m7
    public void flush() {
        if (d()) {
            ge1 ge1Var = this.h;
            if (ge1Var == null) {
                this.h = new ge1(this.c, this.b, this.d, this.e, this.f);
            } else {
                ge1Var.i();
            }
        }
        this.k = m7.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // com.daaw.m7
    public void g(ByteBuffer byteBuffer) {
        s6.f(this.h != null);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.l += remaining;
            this.h.s(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int j = this.h.j() * this.b * 2;
        if (j > 0) {
            if (this.i.capacity() < j) {
                ByteBuffer order = ByteBuffer.allocateDirect(j).order(ByteOrder.nativeOrder());
                this.i = order;
                this.j = order.asShortBuffer();
            } else {
                this.i.clear();
                this.j.clear();
            }
            this.h.k(this.j);
            this.m += j;
            this.i.limit(j);
            this.k = this.i;
        }
    }

    @Override // com.daaw.m7
    public int h() {
        return this.b;
    }

    @Override // com.daaw.m7
    public int i() {
        return this.f;
    }

    @Override // com.daaw.m7
    public int j() {
        return 2;
    }

    @Override // com.daaw.m7
    public void k() {
        s6.f(this.h != null);
        this.h.r();
        this.n = true;
    }

    @Override // com.daaw.m7
    public boolean l(int i, int i2, int i3) {
        if (i3 == 2) {
            int i4 = this.g;
            if (i4 == -1) {
                i4 = i;
            }
            if (this.c == i && this.b == i2 && this.f == i4) {
                return false;
            }
            this.c = i;
            this.b = i2;
            this.f = i4;
            this.h = null;
            return true;
        }
        throw new m7.a(i, i2, i3);
    }

    public float m(float f) {
        float k = sq1.k(f, 0.1f, 8.0f);
        if (this.d != k) {
            this.d = k;
            this.h = null;
        }
        flush();
        return k;
    }
}
