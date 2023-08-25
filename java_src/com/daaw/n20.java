package com.daaw;

import com.daaw.da1;
import com.daaw.rg1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class n20 extends rg1 {
    public o20 n;
    public a o;

    /* loaded from: classes.dex */
    public class a implements ut0, da1 {
        public long[] a;
        public long[] b;
        public long c = -1;
        public long d = -1;

        public a() {
        }

        @Override // com.daaw.ut0
        public long a(a00 a00Var) {
            long j = this.d;
            if (j >= 0) {
                long j2 = -(j + 2);
                this.d = -1L;
                return j2;
            }
            return -1L;
        }

        @Override // com.daaw.ut0
        public da1 c() {
            return this;
        }

        @Override // com.daaw.ut0
        public long d(long j) {
            long b = n20.this.b(j);
            this.d = this.a[sq1.e(this.a, b, true, true)];
            return b;
        }

        @Override // com.daaw.da1
        public boolean e() {
            return true;
        }

        public void f(rv0 rv0Var) {
            rv0Var.K(1);
            int A = rv0Var.A() / 18;
            this.a = new long[A];
            this.b = new long[A];
            for (int i = 0; i < A; i++) {
                this.a[i] = rv0Var.q();
                this.b[i] = rv0Var.q();
                rv0Var.K(2);
            }
        }

        @Override // com.daaw.da1
        public da1.a g(long j) {
            int e = sq1.e(this.a, n20.this.b(j), true, true);
            long a = n20.this.a(this.a[e]);
            fa1 fa1Var = new fa1(a, this.c + this.b[e]);
            if (a < j) {
                long[] jArr = this.a;
                if (e != jArr.length - 1) {
                    int i = e + 1;
                    return new da1.a(fa1Var, new fa1(n20.this.a(jArr[i]), this.c + this.b[i]));
                }
            }
            return new da1.a(fa1Var);
        }

        @Override // com.daaw.da1
        public long h() {
            return n20.this.n.b();
        }

        public void i(long j) {
            this.c = j;
        }
    }

    public static boolean n(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean o(rv0 rv0Var) {
        return rv0Var.a() >= 5 && rv0Var.x() == 127 && rv0Var.z() == 1179402563;
    }

    @Override // com.daaw.rg1
    public long e(rv0 rv0Var) {
        if (n(rv0Var.a)) {
            return m(rv0Var);
        }
        return -1L;
    }

    @Override // com.daaw.rg1
    public boolean h(rv0 rv0Var, long j, rg1.b bVar) {
        byte[] bArr = rv0Var.a;
        if (this.n == null) {
            this.n = new o20(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, rv0Var.d());
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int a2 = this.n.a();
            o20 o20Var = this.n;
            bVar.a = Format.u(null, "audio/flac", null, -1, a2, o20Var.f, o20Var.e, singletonList, null, 0, null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            a aVar = new a();
            this.o = aVar;
            aVar.f(rv0Var);
            return true;
        } else if (n(bArr)) {
            a aVar2 = this.o;
            if (aVar2 != null) {
                aVar2.i(j);
                bVar.b = this.o;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override // com.daaw.rg1
    public void j(boolean z) {
        super.j(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }

    public final int m(rv0 rv0Var) {
        int i;
        int i2;
        int i3 = (rv0Var.a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                rv0Var.K(4);
                rv0Var.E();
                int x = i3 == 6 ? rv0Var.x() : rv0Var.D();
                rv0Var.J(0);
                return x + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i3 - 8;
                break;
            default:
                return -1;
        }
        return i << i2;
    }
}
