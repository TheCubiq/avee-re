package com.daaw;

import com.google.android.gms.internal.ads.zzatd;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class hw2 implements ws2 {

    /* renamed from: e */
    public fw2 f13033e;

    /* renamed from: f */
    public fw2 f13034f;

    /* renamed from: g */
    public zzatd f13035g;

    /* renamed from: h */
    public zzatd f13036h;

    /* renamed from: i */
    public long f13037i;

    /* renamed from: k */
    public gw2 f13039k;

    /* renamed from: l */
    public final nx2 f13040l;

    /* renamed from: a */
    public final ew2 f13029a = new ew2();

    /* renamed from: b */
    public final dw2 f13030b = new dw2();

    /* renamed from: c */
    public final iz2 f13031c = new iz2(32);

    /* renamed from: d */
    public final AtomicInteger f13032d = new AtomicInteger();

    /* renamed from: j */
    public int f13038j = 65536;

    public hw2(nx2 nx2Var, byte[] bArr) {
        this.f13040l = nx2Var;
        fw2 fw2Var = new fw2(0L, 65536);
        this.f13033e = fw2Var;
        this.f13034f = fw2Var;
    }

    @Override // com.daaw.ws2
    /* renamed from: a */
    public final void mo5828a(zzatd zzatdVar) {
        zzatd zzatdVar2 = zzatdVar == null ? null : zzatdVar;
        boolean m23090k = this.f13029a.m23090k(zzatdVar2);
        this.f13036h = zzatdVar;
        gw2 gw2Var = this.f13039k;
        if (gw2Var == null || !m23090k) {
            return;
        }
        gw2Var.mo9818d(zzatdVar2);
    }

    @Override // com.daaw.ws2
    /* renamed from: b */
    public final int mo5827b(ms2 ms2Var, int i, boolean z) {
        if (!m20345t()) {
            int m15803b = ms2Var.m15803b(i);
            if (m15803b != -1) {
                return m15803b;
            }
            throw new EOFException();
        }
        try {
            int m15804a = ms2Var.m15804a(this.f13034f.f10029d.f13046a, this.f13038j, m20350o(i));
            if (m15804a != -1) {
                this.f13038j += m15804a;
                this.f13037i += m15804a;
                return m15804a;
            }
            throw new EOFException();
        } finally {
            m20347r();
        }
    }

    @Override // com.daaw.ws2
    /* renamed from: c */
    public final void mo5826c(iz2 iz2Var, int i) {
        if (!m20345t()) {
            iz2Var.m19224w(i);
            return;
        }
        while (i > 0) {
            int m20350o = m20350o(i);
            iz2Var.m19230q(this.f13034f.f10029d.f13046a, this.f13038j, m20350o);
            this.f13038j += m20350o;
            this.f13037i += m20350o;
            i -= m20350o;
        }
        m20347r();
    }

    @Override // com.daaw.ws2
    /* renamed from: d */
    public final void mo5825d(long j, int i, int i2, int i3, vs2 vs2Var) {
        if (!m20345t()) {
            this.f13029a.m23092i(j);
            return;
        }
        try {
            this.f13029a.m23093h(j, i, this.f13037i - i2, i2, vs2Var);
        } finally {
            m20347r();
        }
    }

    /* renamed from: e */
    public final int m20360e() {
        return this.f13029a.m23100a();
    }

    /* renamed from: f */
    public final int m20359f(cq2 cq2Var, bs2 bs2Var, boolean z, boolean z2, long j) {
        int i;
        int m23099b = this.f13029a.m23099b(cq2Var, bs2Var, z, z2, this.f13035g, this.f13030b);
        if (m23099b == -5) {
            this.f13035g = cq2Var.f6080a;
            return -5;
        } else if (m23099b != -4) {
            return -3;
        } else {
            if (!bs2Var.m5833f()) {
                if (bs2Var.f5094d < j) {
                    bs2Var.m5838a(Integer.MIN_VALUE);
                }
                if (bs2Var.m25842i()) {
                    dw2 dw2Var = this.f13030b;
                    long j2 = dw2Var.f7936b;
                    this.f13031c.m19228s(1);
                    m20346s(j2, this.f13031c.f14125a, 1);
                    long j3 = j2 + 1;
                    byte b = this.f13031c.f14125a[0];
                    boolean z3 = (b & 128) != 0;
                    int i2 = b & Byte.MAX_VALUE;
                    zr2 zr2Var = bs2Var.f5092b;
                    if (zr2Var.f35431a == null) {
                        zr2Var.f35431a = new byte[16];
                    }
                    m20346s(j3, zr2Var.f35431a, i2);
                    long j4 = j3 + i2;
                    if (z3) {
                        this.f13031c.m19228s(2);
                        m20346s(j4, this.f13031c.f14125a, 2);
                        j4 += 2;
                        i = this.f13031c.m19237j();
                    } else {
                        i = 1;
                    }
                    zr2 zr2Var2 = bs2Var.f5092b;
                    int[] iArr = zr2Var2.f35434d;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zr2Var2.f35435e;
                    if (iArr3 == null || iArr3.length < i) {
                        iArr3 = new int[i];
                    }
                    int[] iArr4 = iArr3;
                    if (z3) {
                        int i3 = i * 6;
                        this.f13031c.m19228s(i3);
                        m20346s(j4, this.f13031c.f14125a, i3);
                        j4 += i3;
                        this.f13031c.m19225v(0);
                        for (int i4 = 0; i4 < i; i4++) {
                            iArr2[i4] = this.f13031c.m19237j();
                            iArr4[i4] = this.f13031c.m19238i();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = dw2Var.f7935a - ((int) (j4 - dw2Var.f7936b));
                    }
                    vs2 vs2Var = dw2Var.f7938d;
                    zr2 zr2Var3 = bs2Var.f5092b;
                    zr2Var3.m1963b(i, iArr2, iArr4, vs2Var.f30552b, zr2Var3.f35431a, 1);
                    long j5 = dw2Var.f7936b;
                    int i5 = (int) (j4 - j5);
                    dw2Var.f7936b = j5 + i5;
                    dw2Var.f7935a -= i5;
                }
                bs2Var.m25843h(this.f13030b.f7935a);
                dw2 dw2Var2 = this.f13030b;
                long j6 = dw2Var2.f7936b;
                ByteBuffer byteBuffer = bs2Var.f5093c;
                int i6 = dw2Var2.f7935a;
                m20348q(j6);
                while (i6 > 0) {
                    int i7 = (int) (j6 - this.f13033e.f10026a);
                    int min = Math.min(i6, 65536 - i7);
                    hx2 hx2Var = this.f13033e.f10029d;
                    byteBuffer.put(hx2Var.f13046a, i7, min);
                    j6 += min;
                    i6 -= min;
                    if (j6 == this.f13033e.f10027b) {
                        this.f13040l.m14749c(hx2Var);
                        fw2 fw2Var = this.f13033e;
                        fw2Var.f10029d = null;
                        this.f13033e = fw2Var.f10030e;
                    }
                }
                m20348q(this.f13030b.f7937c);
            }
            return -4;
        }
    }

    /* renamed from: g */
    public final long m20358g() {
        return this.f13029a.m23098c();
    }

    /* renamed from: h */
    public final zzatd m20357h() {
        return this.f13029a.m23095f();
    }

    /* renamed from: i */
    public final void m20356i() {
        if (this.f13032d.getAndSet(2) == 0) {
            m20349p();
        }
    }

    /* renamed from: j */
    public final void m20355j(boolean z) {
        int andSet = this.f13032d.getAndSet(true != z ? 2 : 0);
        m20349p();
        this.f13029a.m23091j();
        if (andSet == 2) {
            this.f13035g = null;
        }
    }

    /* renamed from: k */
    public final void m20354k(gw2 gw2Var) {
        this.f13039k = gw2Var;
    }

    /* renamed from: l */
    public final void m20353l() {
        long m23097d = this.f13029a.m23097d();
        if (m23097d != -1) {
            m20348q(m23097d);
        }
    }

    /* renamed from: m */
    public final boolean m20352m() {
        return this.f13029a.m23089l();
    }

    /* renamed from: n */
    public final boolean m20351n(long j, boolean z) {
        long m23096e = this.f13029a.m23096e(j, z);
        if (m23096e == -1) {
            return false;
        }
        m20348q(m23096e);
        return true;
    }

    /* renamed from: o */
    public final int m20350o(int i) {
        if (this.f13038j == 65536) {
            this.f13038j = 0;
            fw2 fw2Var = this.f13034f;
            if (fw2Var.f10028c) {
                this.f13034f = fw2Var.f10030e;
            }
            fw2 fw2Var2 = this.f13034f;
            hx2 m14750b = this.f13040l.m14750b();
            fw2 fw2Var3 = new fw2(this.f13034f.f10027b, 65536);
            fw2Var2.f10029d = m14750b;
            fw2Var2.f10030e = fw2Var3;
            fw2Var2.f10028c = true;
        }
        return Math.min(i, 65536 - this.f13038j);
    }

    /* renamed from: p */
    public final void m20349p() {
        this.f13029a.m23094g();
        fw2 fw2Var = this.f13033e;
        if (fw2Var.f10028c) {
            fw2 fw2Var2 = this.f13034f;
            int i = (fw2Var2.f10028c ? 1 : 0) + (((int) (fw2Var2.f10026a - fw2Var.f10026a)) / 65536);
            hx2[] hx2VarArr = new hx2[i];
            for (int i2 = 0; i2 < i; i2++) {
                hx2VarArr[i2] = fw2Var.f10029d;
                fw2Var.f10029d = null;
                fw2Var = fw2Var.f10030e;
            }
            this.f13040l.m14748d(hx2VarArr);
        }
        fw2 fw2Var3 = new fw2(0L, 65536);
        this.f13033e = fw2Var3;
        this.f13034f = fw2Var3;
        this.f13037i = 0L;
        this.f13038j = 65536;
        this.f13040l.m14745g();
    }

    /* renamed from: q */
    public final void m20348q(long j) {
        while (true) {
            fw2 fw2Var = this.f13033e;
            if (j < fw2Var.f10027b) {
                return;
            }
            this.f13040l.m14749c(fw2Var.f10029d);
            fw2 fw2Var2 = this.f13033e;
            fw2Var2.f10029d = null;
            this.f13033e = fw2Var2.f10030e;
        }
    }

    /* renamed from: r */
    public final void m20347r() {
        if (this.f13032d.compareAndSet(1, 0)) {
            return;
        }
        m20349p();
    }

    /* renamed from: s */
    public final void m20346s(long j, byte[] bArr, int i) {
        m20348q(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.f13033e.f10026a);
            int min = Math.min(i - i2, 65536 - i3);
            hx2 hx2Var = this.f13033e.f10029d;
            System.arraycopy(hx2Var.f13046a, i3, bArr, i2, min);
            j += min;
            i2 += min;
            if (j == this.f13033e.f10027b) {
                this.f13040l.m14749c(hx2Var);
                fw2 fw2Var = this.f13033e;
                fw2Var.f10029d = null;
                this.f13033e = fw2Var.f10030e;
            }
        }
    }

    /* renamed from: t */
    public final boolean m20345t() {
        return this.f13032d.compareAndSet(0, 1);
    }
}
