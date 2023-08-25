package com.daaw;

import com.daaw.da1;
import java.io.EOFException;
import java.io.IOException;
/* renamed from: com.daaw.nr */
/* loaded from: classes.dex */
public final class C2360nr implements ut0 {

    /* renamed from: a */
    public final tt0 f20583a = new tt0();

    /* renamed from: b */
    public final long f20584b;

    /* renamed from: c */
    public final long f20585c;

    /* renamed from: d */
    public final rg1 f20586d;

    /* renamed from: e */
    public int f20587e;

    /* renamed from: f */
    public long f20588f;

    /* renamed from: g */
    public long f20589g;

    /* renamed from: h */
    public long f20590h;

    /* renamed from: i */
    public long f20591i;

    /* renamed from: j */
    public long f20592j;

    /* renamed from: k */
    public long f20593k;

    /* renamed from: l */
    public long f20594l;

    /* renamed from: com.daaw.nr$b */
    /* loaded from: classes.dex */
    public class C2362b implements da1 {
        public C2362b() {
        }

        @Override // com.daaw.da1
        /* renamed from: e */
        public boolean mo6932e() {
            return true;
        }

        @Override // com.daaw.da1
        /* renamed from: g */
        public da1.C1068a mo6931g(long j) {
            if (j == 0) {
                return new da1.C1068a(new fa1(0L, C2360nr.this.f20584b));
            }
            long m11347b = C2360nr.this.f20586d.m11347b(j);
            C2360nr c2360nr = C2360nr.this;
            return new da1.C1068a(new fa1(j, c2360nr.m14865i(c2360nr.f20584b, m11347b, 30000L)));
        }

        @Override // com.daaw.da1
        /* renamed from: h */
        public long mo6930h() {
            return C2360nr.this.f20586d.m11348a(C2360nr.this.f20588f);
        }
    }

    public C2360nr(long j, long j2, rg1 rg1Var, int i, long j3) {
        C2914s6.m10690a(j >= 0 && j2 > j);
        this.f20586d = rg1Var;
        this.f20584b = j;
        this.f20585c = j2;
        if (i != j2 - j) {
            this.f20587e = 0;
            return;
        }
        this.f20588f = j3;
        this.f20587e = 3;
    }

    @Override // com.daaw.ut0
    /* renamed from: a */
    public long mo7738a(a00 a00Var) {
        int i = this.f20587e;
        if (i == 0) {
            long position = a00Var.getPosition();
            this.f20589g = position;
            this.f20587e = 1;
            long j = this.f20585c - 65307;
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
            long j2 = this.f20590h;
            long j3 = 0;
            if (j2 != 0) {
                long m14864j = m14864j(j2, a00Var);
                if (m14864j >= 0) {
                    return m14864j;
                }
                j3 = m14859o(a00Var, this.f20590h, -(m14864j + 2));
            }
            this.f20587e = 3;
            return -(j3 + 2);
        }
        this.f20588f = m14863k(a00Var);
        this.f20587e = 3;
        return this.f20589g;
    }

    @Override // com.daaw.ut0
    /* renamed from: d */
    public long mo7736d(long j) {
        int i = this.f20587e;
        C2914s6.m10690a(i == 3 || i == 2);
        this.f20590h = j != 0 ? this.f20586d.m11347b(j) : 0L;
        this.f20587e = 2;
        m14862l();
        return this.f20590h;
    }

    @Override // com.daaw.ut0
    /* renamed from: h */
    public C2362b mo7737c() {
        if (this.f20588f != 0) {
            return new C2362b();
        }
        return null;
    }

    /* renamed from: i */
    public final long m14865i(long j, long j2, long j3) {
        long j4 = this.f20585c;
        long j5 = this.f20584b;
        long j6 = j + (((j2 * (j4 - j5)) / this.f20588f) - j3);
        if (j6 >= j5) {
            j5 = j6;
        }
        return j5 >= j4 ? j4 - 1 : j5;
    }

    /* renamed from: j */
    public long m14864j(long j, a00 a00Var) {
        if (this.f20591i == this.f20592j) {
            return -(this.f20593k + 2);
        }
        long position = a00Var.getPosition();
        if (!m14860n(a00Var, this.f20592j)) {
            long j2 = this.f20591i;
            if (j2 != position) {
                return j2;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f20583a.m8830a(a00Var, false);
        a00Var.mo5858i();
        tt0 tt0Var = this.f20583a;
        long j3 = tt0Var.f28048c;
        long j4 = j - j3;
        int i = tt0Var.f28053h + tt0Var.f28054i;
        if (j4 >= 0 && j4 <= 72000) {
            a00Var.mo5857j(i);
            return -(this.f20583a.f28048c + 2);
        }
        if (j4 < 0) {
            this.f20592j = position;
            this.f20594l = j3;
        } else {
            long j5 = i;
            long position2 = a00Var.getPosition() + j5;
            this.f20591i = position2;
            this.f20593k = this.f20583a.f28048c;
            if ((this.f20592j - position2) + j5 < 100000) {
                a00Var.mo5857j(i);
                return -(this.f20593k + 2);
            }
        }
        long j6 = this.f20592j;
        long j7 = this.f20591i;
        if (j6 - j7 < 100000) {
            this.f20592j = j7;
            return j7;
        }
        long j8 = i * (j4 > 0 ? 1L : 2L);
        long j9 = this.f20592j;
        long j10 = this.f20591i;
        return Math.min(Math.max((a00Var.getPosition() - j8) + ((j4 * (j9 - j10)) / (this.f20594l - this.f20593k)), j10), this.f20592j - 1);
    }

    /* renamed from: k */
    public long m14863k(a00 a00Var) {
        m14861m(a00Var);
        this.f20583a.m8829b();
        while ((this.f20583a.f28047b & 4) != 4 && a00Var.getPosition() < this.f20585c) {
            this.f20583a.m8830a(a00Var, false);
            tt0 tt0Var = this.f20583a;
            a00Var.mo5857j(tt0Var.f28053h + tt0Var.f28054i);
        }
        return this.f20583a.f28048c;
    }

    /* renamed from: l */
    public void m14862l() {
        this.f20591i = this.f20584b;
        this.f20592j = this.f20585c;
        this.f20593k = 0L;
        this.f20594l = this.f20588f;
    }

    /* renamed from: m */
    public void m14861m(a00 a00Var) {
        if (!m14860n(a00Var, this.f20585c)) {
            throw new EOFException();
        }
    }

    /* renamed from: n */
    public boolean m14860n(a00 a00Var, long j) {
        int i;
        long min = Math.min(j + 3, this.f20585c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i3 = 0;
            if (a00Var.getPosition() + i2 > min && (i2 = (int) (min - a00Var.getPosition())) < 4) {
                return false;
            }
            a00Var.mo5863d(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        a00Var.mo5857j(i3);
                        return true;
                    }
                    i3++;
                }
            }
            a00Var.mo5857j(i);
        }
    }

    /* renamed from: o */
    public long m14859o(a00 a00Var, long j, long j2) {
        this.f20583a.m8830a(a00Var, false);
        while (true) {
            tt0 tt0Var = this.f20583a;
            if (tt0Var.f28048c >= j) {
                a00Var.mo5858i();
                return j2;
            }
            a00Var.mo5857j(tt0Var.f28053h + tt0Var.f28054i);
            tt0 tt0Var2 = this.f20583a;
            long j3 = tt0Var2.f28048c;
            tt0Var2.m8830a(a00Var, false);
            j2 = j3;
        }
    }
}
