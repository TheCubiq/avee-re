package com.daaw;

import com.daaw.da1;
import java.io.EOFException;
import java.io.IOException;
/* loaded from: classes.dex */
public final class nr implements ut0 {
    public final tt0 a = new tt0();
    public final long b;
    public final long c;
    public final rg1 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    /* loaded from: classes.dex */
    public class b implements da1 {
        public b() {
        }

        @Override // com.daaw.da1
        public boolean e() {
            return true;
        }

        @Override // com.daaw.da1
        public da1.a g(long j) {
            if (j == 0) {
                return new da1.a(new fa1(0L, nr.this.b));
            }
            long b = nr.this.d.b(j);
            nr nrVar = nr.this;
            return new da1.a(new fa1(j, nrVar.i(nrVar.b, b, 30000L)));
        }

        @Override // com.daaw.da1
        public long h() {
            return nr.this.d.a(nr.this.f);
        }
    }

    public nr(long j, long j2, rg1 rg1Var, int i, long j3) {
        s6.a(j >= 0 && j2 > j);
        this.d = rg1Var;
        this.b = j;
        this.c = j2;
        if (i != j2 - j) {
            this.e = 0;
            return;
        }
        this.f = j3;
        this.e = 3;
    }

    @Override // com.daaw.ut0
    public long a(a00 a00Var) {
        int i = this.e;
        if (i == 0) {
            long position = a00Var.getPosition();
            this.g = position;
            this.e = 1;
            long j = this.c - 65307;
            if (j > position) {
                return j;
            }
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j2 = this.h;
            long j3 = 0;
            if (j2 != 0) {
                long j4 = j(j2, a00Var);
                if (j4 >= 0) {
                    return j4;
                }
                j3 = o(a00Var, this.h, -(j4 + 2));
            }
            this.e = 3;
            return -(j3 + 2);
        }
        this.f = k(a00Var);
        this.e = 3;
        return this.g;
    }

    @Override // com.daaw.ut0
    public long d(long j) {
        int i = this.e;
        s6.a(i == 3 || i == 2);
        this.h = j != 0 ? this.d.b(j) : 0L;
        this.e = 2;
        l();
        return this.h;
    }

    @Override // com.daaw.ut0
    /* renamed from: h */
    public b c() {
        if (this.f != 0) {
            return new b();
        }
        return null;
    }

    public final long i(long j, long j2, long j3) {
        long j4 = this.c;
        long j5 = this.b;
        long j6 = j + (((j2 * (j4 - j5)) / this.f) - j3);
        if (j6 >= j5) {
            j5 = j6;
        }
        return j5 >= j4 ? j4 - 1 : j5;
    }

    public long j(long j, a00 a00Var) {
        if (this.i == this.j) {
            return -(this.k + 2);
        }
        long position = a00Var.getPosition();
        if (!n(a00Var, this.j)) {
            long j2 = this.i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(a00Var, false);
        a00Var.i();
        tt0 tt0Var = this.a;
        long j3 = tt0Var.c;
        long j4 = j - j3;
        int i = tt0Var.h + tt0Var.i;
        if (j4 >= 0 && j4 <= 72000) {
            a00Var.j(i);
            return -(this.a.c + 2);
        }
        if (j4 < 0) {
            this.j = position;
            this.l = j3;
        } else {
            long j5 = i;
            long position2 = a00Var.getPosition() + j5;
            this.i = position2;
            this.k = this.a.c;
            if ((this.j - position2) + j5 < 100000) {
                a00Var.j(i);
                return -(this.k + 2);
            }
        }
        long j6 = this.j;
        long j7 = this.i;
        if (j6 - j7 < 100000) {
            this.j = j7;
            return j7;
        }
        long j8 = i * (j4 > 0 ? 1L : 2L);
        long j9 = this.j;
        long j10 = this.i;
        return Math.min(Math.max((a00Var.getPosition() - j8) + ((j4 * (j9 - j10)) / (this.l - this.k)), j10), this.j - 1);
    }

    public long k(a00 a00Var) {
        m(a00Var);
        this.a.b();
        while ((this.a.b & 4) != 4 && a00Var.getPosition() < this.c) {
            this.a.a(a00Var, false);
            tt0 tt0Var = this.a;
            a00Var.j(tt0Var.h + tt0Var.i);
        }
        return this.a.c;
    }

    public void l() {
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    public void m(a00 a00Var) {
        if (!n(a00Var, this.c)) {
            throw new EOFException();
        }
    }

    public boolean n(a00 a00Var, long j) {
        int i;
        long min = Math.min(j + 3, this.c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i3 = 0;
            if (a00Var.getPosition() + i2 > min && (i2 = (int) (min - a00Var.getPosition())) < 4) {
                return false;
            }
            a00Var.d(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        a00Var.j(i3);
                        return true;
                    }
                    i3++;
                }
            }
            a00Var.j(i);
        }
    }

    public long o(a00 a00Var, long j, long j2) {
        this.a.a(a00Var, false);
        while (true) {
            tt0 tt0Var = this.a;
            if (tt0Var.c >= j) {
                a00Var.i();
                return j2;
            }
            a00Var.j(tt0Var.h + tt0Var.i);
            tt0 tt0Var2 = this.a;
            long j3 = tt0Var2.c;
            tt0Var2.a(a00Var, false);
            j2 = j3;
        }
    }
}
