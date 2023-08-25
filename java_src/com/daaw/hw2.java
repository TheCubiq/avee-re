package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class hw2 implements ws2 {
    public fw2 e;
    public fw2 f;
    public zzatd g;
    public zzatd h;
    public long i;
    public gw2 k;
    public final nx2 l;
    public final ew2 a = new ew2();
    public final dw2 b = new dw2();
    public final iz2 c = new iz2(32);
    public final AtomicInteger d = new AtomicInteger();
    public int j = 65536;

    public hw2(nx2 nx2Var, byte[] bArr) {
        this.l = nx2Var;
        fw2 fw2Var = new fw2(0L, 65536);
        this.e = fw2Var;
        this.f = fw2Var;
    }

    @Override // com.daaw.ws2
    public final void a(zzatd zzatdVar) {
        zzatd zzatdVar2 = zzatdVar == null ? null : zzatdVar;
        boolean k = this.a.k(zzatdVar2);
        this.h = zzatdVar;
        gw2 gw2Var = this.k;
        if (gw2Var == null || !k) {
            return;
        }
        gw2Var.d(zzatdVar2);
    }

    @Override // com.daaw.ws2
    public final int b(ms2 ms2Var, int i, boolean z) {
        if (!t()) {
            int b = ms2Var.b(i);
            if (b != -1) {
                return b;
            }
            throw new EOFException();
        }
        try {
            int a = ms2Var.a(this.f.d.a, this.j, o(i));
            if (a != -1) {
                this.j += a;
                this.i += a;
                return a;
            }
            throw new EOFException();
        } finally {
            r();
        }
    }

    @Override // com.daaw.ws2
    public final void c(iz2 iz2Var, int i) {
        if (!t()) {
            iz2Var.w(i);
            return;
        }
        while (i > 0) {
            int o = o(i);
            iz2Var.q(this.f.d.a, this.j, o);
            this.j += o;
            this.i += o;
            i -= o;
        }
        r();
    }

    @Override // com.daaw.ws2
    public final void d(long j, int i, int i2, int i3, vs2 vs2Var) {
        if (!t()) {
            this.a.i(j);
            return;
        }
        try {
            this.a.h(j, i, this.i - i2, i2, vs2Var);
        } finally {
            r();
        }
    }

    public final int e() {
        return this.a.a();
    }

    public final int f(cq2 cq2Var, bs2 bs2Var, boolean z, boolean z2, long j) {
        int i;
        int b = this.a.b(cq2Var, bs2Var, z, z2, this.g, this.b);
        if (b == -5) {
            this.g = cq2Var.a;
            return -5;
        } else if (b != -4) {
            return -3;
        } else {
            if (!bs2Var.f()) {
                if (bs2Var.d < j) {
                    bs2Var.a(Integer.MIN_VALUE);
                }
                if (bs2Var.i()) {
                    dw2 dw2Var = this.b;
                    long j2 = dw2Var.b;
                    this.c.s(1);
                    s(j2, this.c.a, 1);
                    long j3 = j2 + 1;
                    byte b2 = this.c.a[0];
                    boolean z3 = (b2 & 128) != 0;
                    int i2 = b2 & Byte.MAX_VALUE;
                    zr2 zr2Var = bs2Var.b;
                    if (zr2Var.a == null) {
                        zr2Var.a = new byte[16];
                    }
                    s(j3, zr2Var.a, i2);
                    long j4 = j3 + i2;
                    if (z3) {
                        this.c.s(2);
                        s(j4, this.c.a, 2);
                        j4 += 2;
                        i = this.c.j();
                    } else {
                        i = 1;
                    }
                    zr2 zr2Var2 = bs2Var.b;
                    int[] iArr = zr2Var2.d;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zr2Var2.e;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i3 = i * 6;
                        this.c.s(i3);
                        s(j4, this.c.a, i3);
                        j4 += i3;
                        this.c.v(0);
                        for (int i4 = 0; i4 < i; i4++) {
                            iArr2[i4] = this.c.j();
                            iArr4[i4] = this.c.i();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = dw2Var.a - ((int) (j4 - dw2Var.b));
                    }
                    vs2 vs2Var = dw2Var.d;
                    zr2 zr2Var3 = bs2Var.b;
                    zr2Var3.b(i, iArr2, iArr4, vs2Var.b, zr2Var3.a, 1);
                    long j5 = dw2Var.b;
                    int i5 = (int) (j4 - j5);
                    dw2Var.b = j5 + i5;
                    dw2Var.a -= i5;
                }
                bs2Var.h(this.b.a);
                dw2 dw2Var2 = this.b;
                long j6 = dw2Var2.b;
                ByteBuffer byteBuffer = bs2Var.c;
                int i6 = dw2Var2.a;
                q(j6);
                while (i6 > 0) {
                    int i7 = (int) (j6 - this.e.a);
                    int min = Math.min(i6, 65536 - i7);
                    hx2 hx2Var = this.e.d;
                    byteBuffer.put(hx2Var.a, i7, min);
                    j6 += min;
                    i6 -= min;
                    if (j6 == this.e.b) {
                        this.l.c(hx2Var);
                        fw2 fw2Var = this.e;
                        fw2Var.d = null;
                        this.e = fw2Var.e;
                    }
                }
                q(this.b.c);
            }
            return -4;
        }
    }

    public final long g() {
        return this.a.c();
    }

    public final zzatd h() {
        return this.a.f();
    }

    public final void i() {
        if (this.d.getAndSet(2) == 0) {
            p();
        }
    }

    public final void j(boolean z) {
        int andSet = this.d.getAndSet(true != z ? 2 : 0);
        p();
        this.a.j();
        if (andSet == 2) {
            this.g = null;
        }
    }

    public final void k(gw2 gw2Var) {
        this.k = gw2Var;
    }

    public final void l() {
        long d = this.a.d();
        if (d != -1) {
            q(d);
        }
    }

    public final boolean m() {
        return this.a.l();
    }

    public final boolean n(long j, boolean z) {
        long e = this.a.e(j, z);
        if (e == -1) {
            return false;
        }
        q(e);
        return true;
    }

    public final int o(int i) {
        if (this.j == 65536) {
            this.j = 0;
            fw2 fw2Var = this.f;
            if (fw2Var.c) {
                this.f = fw2Var.e;
            }
            fw2 fw2Var2 = this.f;
            hx2 b = this.l.b();
            fw2 fw2Var3 = new fw2(this.f.b, 65536);
            fw2Var2.d = b;
            fw2Var2.e = fw2Var3;
            fw2Var2.c = true;
        }
        return Math.min(i, 65536 - this.j);
    }

    public final void p() {
        this.a.g();
        fw2 fw2Var = this.e;
        if (fw2Var.c) {
            fw2 fw2Var2 = this.f;
            int i = (fw2Var2.c ? 1 : 0) + (((int) (fw2Var2.a - fw2Var.a)) / 65536);
            hx2[] hx2VarArr = new hx2[i];
            for (int i2 = 0; i2 < i; i2++) {
                hx2VarArr[i2] = fw2Var.d;
                fw2Var.d = null;
                fw2Var = fw2Var.e;
            }
            this.l.d(hx2VarArr);
        }
        fw2 fw2Var3 = new fw2(0L, 65536);
        this.e = fw2Var3;
        this.f = fw2Var3;
        this.i = 0L;
        this.j = 65536;
        this.l.g();
    }

    public final void q(long j) {
        while (true) {
            fw2 fw2Var = this.e;
            if (j < fw2Var.b) {
                return;
            }
            this.l.c(fw2Var.d);
            fw2 fw2Var2 = this.e;
            fw2Var2.d = null;
            this.e = fw2Var2.e;
        }
    }

    public final void r() {
        if (this.d.compareAndSet(1, 0)) {
            return;
        }
        p();
    }

    public final void s(long j, byte[] bArr, int i) {
        q(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.e.a);
            int min = Math.min(i - i2, 65536 - i3);
            hx2 hx2Var = this.e.d;
            System.arraycopy(hx2Var.a, i3, bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.e.b) {
                this.l.c(hx2Var);
                fw2 fw2Var = this.e;
                fw2Var.d = null;
                this.e = fw2Var.e;
            }
        }
    }

    public final boolean t() {
        return this.d.compareAndSet(0, 1);
    }
}
