package com.daaw;

import com.daaw.InterfaceC2154m7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes.dex */
public final class bd1 implements InterfaceC2154m7 {

    /* renamed from: b */
    public int f4711b;

    /* renamed from: c */
    public int f4712c;

    /* renamed from: d */
    public int f4713d;

    /* renamed from: e */
    public boolean f4714e;

    /* renamed from: f */
    public ByteBuffer f4715f;

    /* renamed from: g */
    public ByteBuffer f4716g;

    /* renamed from: h */
    public boolean f4717h;

    /* renamed from: i */
    public byte[] f4718i;

    /* renamed from: j */
    public byte[] f4719j;

    /* renamed from: k */
    public int f4720k;

    /* renamed from: l */
    public int f4721l;

    /* renamed from: m */
    public int f4722m;

    /* renamed from: n */
    public boolean f4723n;

    /* renamed from: o */
    public long f4724o;

    public bd1() {
        ByteBuffer byteBuffer = InterfaceC2154m7.f18485a;
        this.f4715f = byteBuffer;
        this.f4716g = byteBuffer;
        this.f4711b = -1;
        this.f4712c = -1;
        this.f4718i = new byte[0];
        this.f4719j = new byte[0];
    }

    /* renamed from: a */
    public final int m26223a(long j) {
        return (int) ((j * this.f4712c) / 1000000);
    }

    /* renamed from: b */
    public final int m26222b(ByteBuffer byteBuffer) {
        for (int limit = byteBuffer.limit() - 1; limit >= byteBuffer.position(); limit -= 2) {
            if (Math.abs((int) byteBuffer.get(limit)) > 4) {
                int i = this.f4713d;
                return ((limit / i) * i) + i;
            }
        }
        return byteBuffer.position();
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: c */
    public boolean mo6543c() {
        return this.f4717h && this.f4716g == InterfaceC2154m7.f18485a;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: d */
    public boolean mo6542d() {
        return this.f4712c != -1 && this.f4714e;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: e */
    public void mo6541e() {
        this.f4714e = false;
        flush();
        this.f4715f = InterfaceC2154m7.f18485a;
        this.f4711b = -1;
        this.f4712c = -1;
        this.f4722m = 0;
        this.f4718i = new byte[0];
        this.f4719j = new byte[0];
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: f */
    public ByteBuffer mo6540f() {
        ByteBuffer byteBuffer = this.f4716g;
        this.f4716g = InterfaceC2154m7.f18485a;
        return byteBuffer;
    }

    @Override // com.daaw.InterfaceC2154m7
    public void flush() {
        if (mo6542d()) {
            int m26223a = m26223a(100000L) * this.f4713d;
            if (this.f4718i.length != m26223a) {
                this.f4718i = new byte[m26223a];
            }
            int m26223a2 = m26223a(10000L) * this.f4713d;
            this.f4722m = m26223a2;
            if (this.f4719j.length != m26223a2) {
                this.f4719j = new byte[m26223a2];
            }
        }
        this.f4720k = 0;
        this.f4716g = InterfaceC2154m7.f18485a;
        this.f4717h = false;
        this.f4724o = 0L;
        this.f4721l = 0;
        this.f4723n = false;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: g */
    public void mo6539g(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !this.f4716g.hasRemaining()) {
            int i = this.f4720k;
            if (i == 0) {
                m26215s(byteBuffer);
            } else if (i == 1) {
                m26216r(byteBuffer);
            } else if (i != 2) {
                throw new IllegalStateException();
            } else {
                m26214t(byteBuffer);
            }
        }
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: h */
    public int mo6538h() {
        return this.f4711b;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: i */
    public int mo6537i() {
        return this.f4712c;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: j */
    public int mo6536j() {
        return 2;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: k */
    public void mo6535k() {
        this.f4717h = true;
        int i = this.f4721l;
        if (i > 0) {
            m26218p(this.f4718i, i);
        }
        if (this.f4723n) {
            return;
        }
        this.f4724o += this.f4722m / this.f4713d;
    }

    @Override // com.daaw.InterfaceC2154m7
    /* renamed from: l */
    public boolean mo6534l(int i, int i2, int i3) {
        if (i3 == 2) {
            if (this.f4712c == i && this.f4711b == i2) {
                return false;
            }
            this.f4712c = i;
            this.f4711b = i2;
            this.f4713d = i2 * 2;
            return true;
        }
        throw new InterfaceC2154m7.C2155a(i, i2, i3);
    }

    /* renamed from: m */
    public final int m26221m(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.get(position)) > 4) {
                int i = this.f4713d;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: n */
    public long m26220n() {
        return this.f4724o;
    }

    /* renamed from: o */
    public final void m26219o(ByteBuffer byteBuffer) {
        m26217q(byteBuffer.remaining());
        this.f4715f.put(byteBuffer);
        this.f4715f.flip();
        this.f4716g = this.f4715f;
    }

    /* renamed from: p */
    public final void m26218p(byte[] bArr, int i) {
        m26217q(i);
        this.f4715f.put(bArr, 0, i);
        this.f4715f.flip();
        this.f4716g = this.f4715f;
    }

    /* renamed from: q */
    public final void m26217q(int i) {
        if (this.f4715f.capacity() < i) {
            this.f4715f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f4715f.clear();
        }
        if (i > 0) {
            this.f4723n = true;
        }
    }

    /* renamed from: r */
    public final void m26216r(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m26221m = m26221m(byteBuffer);
        int position = m26221m - byteBuffer.position();
        byte[] bArr = this.f4718i;
        int length = bArr.length;
        int i = this.f4721l;
        int i2 = length - i;
        if (m26221m < limit && position < i2) {
            m26218p(bArr, i);
            this.f4721l = 0;
            this.f4720k = 0;
            return;
        }
        int min = Math.min(position, i2);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f4718i, this.f4721l, min);
        int i3 = this.f4721l + min;
        this.f4721l = i3;
        byte[] bArr2 = this.f4718i;
        if (i3 == bArr2.length) {
            if (this.f4723n) {
                m26218p(bArr2, this.f4722m);
                this.f4724o += (this.f4721l - (this.f4722m * 2)) / this.f4713d;
            } else {
                this.f4724o += (i3 - this.f4722m) / this.f4713d;
            }
            m26212v(byteBuffer, this.f4718i, this.f4721l);
            this.f4721l = 0;
            this.f4720k = 2;
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: s */
    public final void m26215s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f4718i.length));
        int m26222b = m26222b(byteBuffer);
        if (m26222b == byteBuffer.position()) {
            this.f4720k = 1;
        } else {
            byteBuffer.limit(m26222b);
            m26219o(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: t */
    public final void m26214t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m26221m = m26221m(byteBuffer);
        byteBuffer.limit(m26221m);
        this.f4724o += byteBuffer.remaining() / this.f4713d;
        m26212v(byteBuffer, this.f4719j, this.f4722m);
        if (m26221m < limit) {
            m26218p(this.f4719j, this.f4722m);
            this.f4720k = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: u */
    public void m26213u(boolean z) {
        this.f4714e = z;
        flush();
    }

    /* renamed from: v */
    public final void m26212v(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f4722m);
        int i2 = this.f4722m - min;
        System.arraycopy(bArr, i - i2, this.f4719j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f4719j, i2, min);
    }
}
