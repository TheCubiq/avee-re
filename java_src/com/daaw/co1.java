package com.daaw;

import com.daaw.m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class co1 implements m7 {
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public ByteBuffer h;
    public ByteBuffer i;
    public byte[] j;
    public int k;
    public boolean l;

    public co1() {
        ByteBuffer byteBuffer = m7.a;
        this.h = byteBuffer;
        this.i = byteBuffer;
        this.e = -1;
        this.f = -1;
        this.j = new byte[0];
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    @Override // com.daaw.m7
    public boolean c() {
        return this.l && this.i == m7.a;
    }

    @Override // com.daaw.m7
    public boolean d() {
        return this.b;
    }

    @Override // com.daaw.m7
    public void e() {
        flush();
        this.h = m7.a;
        this.e = -1;
        this.f = -1;
        this.j = new byte[0];
    }

    @Override // com.daaw.m7
    public ByteBuffer f() {
        ByteBuffer byteBuffer = this.i;
        this.i = m7.a;
        return byteBuffer;
    }

    @Override // com.daaw.m7
    public void flush() {
        this.i = m7.a;
        this.l = false;
        this.g = 0;
        this.k = 0;
    }

    @Override // com.daaw.m7
    public void g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int min = Math.min(i, this.g);
        this.g -= min;
        byteBuffer.position(position + min);
        if (this.g > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.k + i2) - this.j.length;
        if (this.h.capacity() < length) {
            this.h = ByteBuffer.allocateDirect(length).order(ByteOrder.nativeOrder());
        } else {
            this.h.clear();
        }
        int l = sq1.l(length, 0, this.k);
        this.h.put(this.j, 0, l);
        int l2 = sq1.l(length - l, 0, i2);
        byteBuffer.limit(byteBuffer.position() + l2);
        this.h.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - l2;
        int i4 = this.k - l;
        this.k = i4;
        byte[] bArr = this.j;
        System.arraycopy(bArr, l, bArr, 0, i4);
        byteBuffer.get(this.j, this.k, i3);
        this.k += i3;
        this.h.flip();
        this.i = this.h;
    }

    @Override // com.daaw.m7
    public int h() {
        return this.e;
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
        this.l = true;
    }

    @Override // com.daaw.m7
    public boolean l(int i, int i2, int i3) {
        if (i3 == 2) {
            this.e = i2;
            this.f = i;
            int i4 = this.d;
            this.j = new byte[i4 * i2 * 2];
            this.k = 0;
            int i5 = this.c;
            this.g = i2 * i5 * 2;
            boolean z = this.b;
            boolean z2 = (i5 == 0 && i4 == 0) ? false : true;
            this.b = z2;
            return z != z2;
        }
        throw new m7.a(i, i2, i3);
    }
}
