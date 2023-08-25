package com.daaw;

import com.daaw.a81;
import com.daaw.sm1;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class b81 implements sm1 {
    public final l2 a;
    public final int b;
    public final a81 c;
    public final a81.a d;
    public final rv0 e;
    public a f;
    public a g;
    public a h;
    public Format i;
    public boolean j;
    public Format k;
    public long l;
    public long m;
    public boolean n;
    public b o;

    /* loaded from: classes.dex */
    public static final class a {
        public final long a;
        public final long b;
        public boolean c;
        public k2 d;
        public a e;

        public a(long j, int i) {
            this.a = j;
            this.b = j + i;
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }

        public void b(k2 k2Var, a aVar) {
            this.d = k2Var;
            this.e = aVar;
            this.c = true;
        }

        public int c(long j) {
            return ((int) (j - this.a)) + this.d.b;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void j(Format format);
    }

    public b81(l2 l2Var) {
        this.a = l2Var;
        int e = l2Var.e();
        this.b = e;
        this.c = new a81();
        this.d = new a81.a();
        this.e = new rv0(32);
        a aVar = new a(0L, e);
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
    }

    public static Format n(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0) {
            long j2 = format.L;
            return j2 != Long.MAX_VALUE ? format.l(j2 + j) : format;
        }
        return format;
    }

    public final void A(long j, byte[] bArr, int i) {
        e(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.g.b - j));
            a aVar = this.g;
            System.arraycopy(aVar.d.a, aVar.c(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            a aVar2 = this.g;
            if (j == aVar2.b) {
                this.g = aVar2.e;
            }
        }
    }

    public final void B(gq gqVar, a81.a aVar) {
        int i;
        long j = aVar.b;
        this.e.G(1);
        A(j, this.e.a, 1);
        long j2 = j + 1;
        byte b2 = this.e.a[0];
        boolean z = (b2 & 128) != 0;
        int i2 = b2 & Byte.MAX_VALUE;
        jn jnVar = gqVar.q;
        if (jnVar.a == null) {
            jnVar.a = new byte[16];
        }
        A(j2, jnVar.a, i2);
        long j3 = j2 + i2;
        if (z) {
            this.e.G(2);
            A(j3, this.e.a, 2);
            j3 += 2;
            i = this.e.D();
        } else {
            i = 1;
        }
        jn jnVar2 = gqVar.q;
        int[] iArr = jnVar2.d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = jnVar2.e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i * 6;
            this.e.G(i3);
            A(j3, this.e.a, i3);
            j3 += i3;
            this.e.J(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i4] = this.e.D();
                iArr4[i4] = this.e.B();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar.a - ((int) (j3 - aVar.b));
        }
        sm1.a aVar2 = aVar.c;
        jn jnVar3 = gqVar.q;
        jnVar3.c(i, iArr2, iArr4, aVar2.b, jnVar3.a, aVar2.a, aVar2.c, aVar2.d);
        long j4 = aVar.b;
        int i5 = (int) (j3 - j4);
        aVar.b = j4 + i5;
        aVar.a -= i5;
    }

    public void C() {
        D(false);
    }

    public void D(boolean z) {
        this.c.x(z);
        h(this.f);
        a aVar = new a(0L, this.b);
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        this.m = 0L;
        this.a.b();
    }

    public void E() {
        this.c.y();
        this.g = this.f;
    }

    public boolean F(int i) {
        return this.c.z(i);
    }

    public void G(long j) {
        if (this.l != j) {
            this.l = j;
            this.j = true;
        }
    }

    public void H(b bVar) {
        this.o = bVar;
    }

    public void I(int i) {
        this.c.A(i);
    }

    public void J() {
        this.n = true;
    }

    @Override // com.daaw.sm1
    public void a(long j, int i, int i2, int i3, sm1.a aVar) {
        if (this.j) {
            d(this.k);
        }
        if (this.n) {
            if ((i & 1) == 0 || !this.c.c(j)) {
                return;
            }
            this.n = false;
        }
        this.c.d(j + this.l, i, (this.m - i2) - i3, i2, aVar);
    }

    @Override // com.daaw.sm1
    public int b(a00 a00Var, int i, boolean z) {
        int x = x(i);
        a aVar = this.h;
        int b2 = a00Var.b(aVar.d.a, aVar.c(this.m), x);
        if (b2 != -1) {
            w(b2);
            return b2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    @Override // com.daaw.sm1
    public void c(rv0 rv0Var, int i) {
        while (i > 0) {
            int x = x(i);
            a aVar = this.h;
            rv0Var.g(aVar.d.a, aVar.c(this.m), x);
            i -= x;
            w(x);
        }
    }

    @Override // com.daaw.sm1
    public void d(Format format) {
        Format n = n(format, this.l);
        boolean l = this.c.l(n);
        this.k = format;
        this.j = false;
        b bVar = this.o;
        if (bVar == null || !l) {
            return;
        }
        bVar.j(n);
    }

    public final void e(long j) {
        while (true) {
            a aVar = this.g;
            if (j < aVar.b) {
                return;
            }
            this.g = aVar.e;
        }
    }

    public int f(long j, boolean z, boolean z2) {
        return this.c.a(j, z, z2);
    }

    public int g() {
        return this.c.b();
    }

    public final void h(a aVar) {
        if (aVar.c) {
            a aVar2 = this.h;
            int i = (aVar2.c ? 1 : 0) + (((int) (aVar2.a - aVar.a)) / this.b);
            k2[] k2VarArr = new k2[i];
            for (int i2 = 0; i2 < i; i2++) {
                k2VarArr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.a.d(k2VarArr);
        }
    }

    public final void i(long j) {
        a aVar;
        if (j == -1) {
            return;
        }
        while (true) {
            aVar = this.f;
            if (j < aVar.b) {
                break;
            }
            this.a.c(aVar.d);
            this.f = this.f.a();
        }
        if (this.g.a < aVar.a) {
            this.g = aVar;
        }
    }

    public void j(long j, boolean z, boolean z2) {
        i(this.c.g(j, z, z2));
    }

    public void k() {
        i(this.c.h());
    }

    public void l() {
        i(this.c.i());
    }

    public void m(int i) {
        long j = this.c.j(i);
        this.m = j;
        if (j != 0) {
            a aVar = this.f;
            if (j != aVar.a) {
                while (this.m > aVar.b) {
                    aVar = aVar.e;
                }
                a aVar2 = aVar.e;
                h(aVar2);
                a aVar3 = new a(aVar.b, this.b);
                aVar.e = aVar3;
                if (this.m == aVar.b) {
                    aVar = aVar3;
                }
                this.h = aVar;
                if (this.g == aVar2) {
                    this.g = aVar3;
                    return;
                }
                return;
            }
        }
        h(this.f);
        a aVar4 = new a(this.m, this.b);
        this.f = aVar4;
        this.g = aVar4;
        this.h = aVar4;
    }

    public int o() {
        return this.c.m();
    }

    public long p() {
        return this.c.n();
    }

    public long q() {
        return this.c.o();
    }

    public int r() {
        return this.c.q();
    }

    public Format s() {
        return this.c.s();
    }

    public int t() {
        return this.c.t();
    }

    public boolean u() {
        return this.c.u();
    }

    public int v() {
        return this.c.v();
    }

    public final void w(int i) {
        long j = this.m + i;
        this.m = j;
        a aVar = this.h;
        if (j == aVar.b) {
            this.h = aVar.e;
        }
    }

    public final int x(int i) {
        a aVar = this.h;
        if (!aVar.c) {
            aVar.b(this.a.a(), new a(this.h.b, this.b));
        }
        return Math.min(i, (int) (this.h.b - this.m));
    }

    public int y(k30 k30Var, gq gqVar, boolean z, boolean z2, long j) {
        int w = this.c.w(k30Var, gqVar, z, z2, this.i, this.d);
        if (w == -5) {
            this.i = k30Var.a;
            return -5;
        } else if (w != -4) {
            if (w == -3) {
                return -3;
            }
            throw new IllegalStateException();
        } else {
            if (!gqVar.j()) {
                if (gqVar.s < j) {
                    gqVar.e(Integer.MIN_VALUE);
                }
                if (gqVar.p()) {
                    B(gqVar, this.d);
                }
                gqVar.n(this.d.a);
                a81.a aVar = this.d;
                z(aVar.b, gqVar.r, aVar.a);
            }
            return -4;
        }
    }

    public final void z(long j, ByteBuffer byteBuffer, int i) {
        e(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.g.b - j));
            a aVar = this.g;
            byteBuffer.put(aVar.d.a, aVar.c(j), min);
            i -= min;
            j += min;
            a aVar2 = this.g;
            if (j == aVar2.b) {
                this.g = aVar2.e;
            }
        }
    }
}
