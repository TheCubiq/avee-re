package com.daaw;

import java.util.ArrayDeque;
/* renamed from: com.daaw.tq */
/* loaded from: classes.dex */
public final class C3107tq implements InterfaceC2483ov {

    /* renamed from: a */
    public final byte[] f27952a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque<C3109b> f27953b = new ArrayDeque<>();

    /* renamed from: c */
    public final zr1 f27954c = new zr1();

    /* renamed from: d */
    public InterfaceC2591pv f27955d;

    /* renamed from: e */
    public int f27956e;

    /* renamed from: f */
    public int f27957f;

    /* renamed from: g */
    public long f27958g;

    /* renamed from: com.daaw.tq$b */
    /* loaded from: classes.dex */
    public static final class C3109b {

        /* renamed from: a */
        public final int f27959a;

        /* renamed from: b */
        public final long f27960b;

        public C3109b(int i, long j) {
            this.f27959a = i;
            this.f27960b = j;
        }
    }

    @Override // com.daaw.InterfaceC2483ov
    /* renamed from: a */
    public boolean mo8886a(a00 a00Var) {
        C2914s6.m10685f(this.f27955d != null);
        while (true) {
            if (!this.f27953b.isEmpty() && a00Var.getPosition() >= this.f27953b.peek().f27960b) {
                this.f27955d.mo7911a(this.f27953b.pop().f27959a);
                return true;
            }
            if (this.f27956e == 0) {
                long m1966d = this.f27954c.m1966d(a00Var, true, false, 4);
                if (m1966d == -2) {
                    m1966d = m8884c(a00Var);
                }
                if (m1966d == -1) {
                    return false;
                }
                this.f27957f = (int) m1966d;
                this.f27956e = 1;
            }
            if (this.f27956e == 1) {
                this.f27958g = this.f27954c.m1966d(a00Var, false, true, 8);
                this.f27956e = 2;
            }
            int mo7910b = this.f27955d.mo7910b(this.f27957f);
            if (mo7910b != 0) {
                if (mo7910b == 1) {
                    long position = a00Var.getPosition();
                    this.f27953b.push(new C3109b(this.f27957f, this.f27958g + position));
                    this.f27955d.mo7906f(this.f27957f, position, this.f27958g);
                    this.f27956e = 0;
                    return true;
                } else if (mo7910b == 2) {
                    long j = this.f27958g;
                    if (j <= 8) {
                        this.f27955d.mo7904h(this.f27957f, m8881f(a00Var, (int) j));
                        this.f27956e = 0;
                        return true;
                    }
                    throw new tv0("Invalid integer size: " + this.f27958g);
                } else if (mo7910b == 3) {
                    long j2 = this.f27958g;
                    if (j2 <= 2147483647L) {
                        this.f27955d.mo7908d(this.f27957f, m8880g(a00Var, (int) j2));
                        this.f27956e = 0;
                        return true;
                    }
                    throw new tv0("String element size: " + this.f27958g);
                } else if (mo7910b == 4) {
                    this.f27955d.mo7905g(this.f27957f, (int) this.f27958g, a00Var);
                    this.f27956e = 0;
                    return true;
                } else if (mo7910b != 5) {
                    throw new tv0("Invalid element type " + mo7910b);
                } else {
                    long j3 = this.f27958g;
                    if (j3 == 4 || j3 == 8) {
                        this.f27955d.mo7907e(this.f27957f, m8883d(a00Var, (int) j3));
                        this.f27956e = 0;
                        return true;
                    }
                    throw new tv0("Invalid float size: " + this.f27958g);
                }
            }
            a00Var.mo5857j((int) this.f27958g);
            this.f27956e = 0;
        }
    }

    @Override // com.daaw.InterfaceC2483ov
    /* renamed from: b */
    public void mo8885b(InterfaceC2591pv interfaceC2591pv) {
        this.f27955d = interfaceC2591pv;
    }

    /* renamed from: c */
    public final long m8884c(a00 a00Var) {
        a00Var.mo5858i();
        while (true) {
            a00Var.mo5856k(this.f27952a, 0, 4);
            int m1967c = zr1.m1967c(this.f27952a[0]);
            if (m1967c != -1 && m1967c <= 4) {
                int m1969a = (int) zr1.m1969a(this.f27952a, m1967c, false);
                if (this.f27955d.mo7909c(m1969a)) {
                    a00Var.mo5857j(m1967c);
                    return m1969a;
                }
            }
            a00Var.mo5857j(1);
        }
    }

    /* renamed from: d */
    public final double m8883d(a00 a00Var, int i) {
        long m8881f = m8881f(a00Var, i);
        return i == 4 ? Float.intBitsToFloat((int) m8881f) : Double.longBitsToDouble(m8881f);
    }

    @Override // com.daaw.InterfaceC2483ov
    /* renamed from: e */
    public void mo8882e() {
        this.f27956e = 0;
        this.f27953b.clear();
        this.f27954c.m1965e();
    }

    /* renamed from: f */
    public final long m8881f(a00 a00Var, int i) {
        a00Var.mo5861f(this.f27952a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f27952a[i2] & 255);
        }
        return j;
    }

    /* renamed from: g */
    public final String m8880g(a00 a00Var, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        a00Var.mo5861f(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }
}
