package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
/* loaded from: classes.dex */
public final class tq0 implements InterfaceC3919zz {

    /* renamed from: o */
    public static final e00 f27961o = new C3110a();

    /* renamed from: p */
    public static final int f27962p = sq1.m9994v("Xing");

    /* renamed from: q */
    public static final int f27963q = sq1.m9994v("Info");

    /* renamed from: r */
    public static final int f27964r = sq1.m9994v("VBRI");

    /* renamed from: a */
    public final int f27965a;

    /* renamed from: b */
    public final long f27966b;

    /* renamed from: c */
    public final rv0 f27967c;

    /* renamed from: d */
    public final yq0 f27968d;

    /* renamed from: e */
    public final y50 f27969e;

    /* renamed from: f */
    public final re0 f27970f;

    /* renamed from: g */
    public d00 f27971g;

    /* renamed from: h */
    public sm1 f27972h;

    /* renamed from: i */
    public int f27973i;

    /* renamed from: j */
    public Metadata f27974j;

    /* renamed from: k */
    public InterfaceC3111b f27975k;

    /* renamed from: l */
    public long f27976l;

    /* renamed from: m */
    public long f27977m;

    /* renamed from: n */
    public int f27978n;

    /* renamed from: com.daaw.tq0$a */
    /* loaded from: classes.dex */
    public static class C3110a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new tq0()};
        }
    }

    /* renamed from: com.daaw.tq0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3111b extends da1 {
        /* renamed from: b */
        long mo8871b(long j);
    }

    public tq0() {
        this(0);
    }

    public tq0(int i) {
        this(i, -9223372036854775807L);
    }

    public tq0(int i, long j) {
        this.f27965a = i;
        this.f27966b = j;
        this.f27967c = new rv0(10);
        this.f27968d = new yq0();
        this.f27969e = new y50();
        this.f27976l = -9223372036854775807L;
        this.f27970f = new re0();
    }

    /* renamed from: e */
    public static int m8876e(rv0 rv0Var, int i) {
        if (rv0Var.m10916d() >= i + 4) {
            rv0Var.m10921J(i);
            int m10911i = rv0Var.m10911i();
            if (m10911i == f27962p || m10911i == f27963q) {
                return m10911i;
            }
        }
        if (rv0Var.m10916d() >= 40) {
            rv0Var.m10921J(36);
            int m10911i2 = rv0Var.m10911i();
            int i2 = f27964r;
            if (m10911i2 == i2) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    /* renamed from: g */
    public static boolean m8875g(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* renamed from: b */
    public final InterfaceC3111b m8877b(a00 a00Var) {
        a00Var.mo5856k(this.f27967c.f25637a, 0, 4);
        this.f27967c.m10921J(0);
        yq0.m3449b(this.f27967c.m10911i(), this.f27968d);
        return new C1831jj(a00Var.mo5859h(), a00Var.getPosition(), this.f27968d);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        return m8872k(a00Var, true);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        if (this.f27973i == 0) {
            try {
                m8872k(a00Var, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f27975k == null) {
            InterfaceC3111b m8874h = m8874h(a00Var);
            this.f27975k = m8874h;
            if (m8874h == null || (!m8874h.mo6932e() && (this.f27965a & 1) != 0)) {
                this.f27975k = m8877b(a00Var);
            }
            this.f27971g.mo11475d(this.f27975k);
            sm1 sm1Var = this.f27972h;
            yq0 yq0Var = this.f27968d;
            String str = yq0Var.f33946b;
            int i = yq0Var.f33949e;
            int i2 = yq0Var.f33948d;
            y50 y50Var = this.f27969e;
            sm1Var.mo10156d(Format.m1724s(null, str, null, -1, 4096, i, i2, -1, y50Var.f33366a, y50Var.f33367b, null, null, 0, null, (this.f27965a & 2) != 0 ? null : this.f27974j));
        }
        return m8873j(a00Var);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f27973i = 0;
        this.f27976l = -9223372036854775807L;
        this.f27977m = 0L;
        this.f27978n = 0;
    }

    /* renamed from: h */
    public final InterfaceC3111b m8874h(a00 a00Var) {
        int i;
        rv0 rv0Var = new rv0(this.f27968d.f33947c);
        a00Var.mo5856k(rv0Var.f25637a, 0, this.f27968d.f33947c);
        yq0 yq0Var = this.f27968d;
        int i2 = yq0Var.f33945a & 1;
        int i3 = yq0Var.f33949e;
        if (i2 != 0) {
            if (i3 != 1) {
                i = 36;
            }
            i = 21;
        } else {
            if (i3 == 1) {
                i = 13;
            }
            i = 21;
        }
        int m8876e = m8876e(rv0Var, i);
        if (m8876e != f27962p && m8876e != f27963q) {
            if (m8876e != f27964r) {
                a00Var.mo5858i();
                return null;
            }
            as1 m27101a = as1.m27101a(a00Var.mo5859h(), a00Var.getPosition(), this.f27968d, rv0Var);
            a00Var.mo5857j(this.f27968d.f33947c);
            return m27101a;
        }
        fz1 m22130a = fz1.m22130a(a00Var.mo5859h(), a00Var.getPosition(), this.f27968d, rv0Var);
        if (m22130a != null && !this.f27969e.m4102a()) {
            a00Var.mo5858i();
            a00Var.mo5860g(i + 141);
            a00Var.mo5856k(this.f27967c.f25637a, 0, 3);
            this.f27967c.m10921J(0);
            this.f27969e.m4099d(this.f27967c.m10930A());
        }
        a00Var.mo5857j(this.f27968d.f33947c);
        return (m22130a == null || m22130a.mo6932e() || m8876e != f27963q) ? m22130a : m8877b(a00Var);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f27971g = d00Var;
        this.f27972h = d00Var.mo11478a(0, 1);
        this.f27971g.mo11470n();
    }

    /* renamed from: j */
    public final int m8873j(a00 a00Var) {
        yq0 yq0Var;
        if (this.f27978n == 0) {
            a00Var.mo5858i();
            if (!a00Var.mo5863d(this.f27967c.f25637a, 0, 4, true)) {
                return -1;
            }
            this.f27967c.m10921J(0);
            int m10911i = this.f27967c.m10911i();
            if (!m8875g(m10911i, this.f27973i) || yq0.m3450a(m10911i) == -1) {
                a00Var.mo5857j(1);
                this.f27973i = 0;
                return 0;
            }
            yq0.m3449b(m10911i, this.f27968d);
            if (this.f27976l == -9223372036854775807L) {
                this.f27976l = this.f27975k.mo8871b(a00Var.getPosition());
                if (this.f27966b != -9223372036854775807L) {
                    this.f27976l += this.f27966b - this.f27975k.mo8871b(0L);
                }
            }
            this.f27978n = this.f27968d.f33947c;
        }
        int mo10158b = this.f27972h.mo10158b(a00Var, this.f27978n, true);
        if (mo10158b == -1) {
            return -1;
        }
        int i = this.f27978n - mo10158b;
        this.f27978n = i;
        if (i > 0) {
            return 0;
        }
        this.f27972h.mo10159a(this.f27976l + ((this.f27977m * 1000000) / yq0Var.f33948d), 1, this.f27968d.f33947c, 0, null);
        this.f27977m += this.f27968d.f33951g;
        this.f27978n = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
        if (r14 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
        r13.mo5857j(r2 + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
        r13.mo5858i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
        r12.f27973i = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00aa, code lost:
        return true;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8872k(a00 a00Var, boolean z) {
        int i;
        int i2;
        int m3450a;
        int i3 = z ? 16384 : 131072;
        a00Var.mo5858i();
        if (a00Var.getPosition() == 0) {
            Metadata m11368a = this.f27970f.m11368a(a00Var, (this.f27965a & 2) != 0 ? y50.f33364c : null);
            this.f27974j = m11368a;
            if (m11368a != null) {
                this.f27969e.m4100c(m11368a);
            }
            i2 = (int) a00Var.mo5862e();
            if (!z) {
                a00Var.mo5857j(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!a00Var.mo5863d(this.f27967c.f25637a, 0, 4, i > 0)) {
                break;
            }
            this.f27967c.m10921J(0);
            int m10911i = this.f27967c.m10911i();
            if ((i4 == 0 || m8875g(m10911i, i4)) && (m3450a = yq0.m3450a(m10911i)) != -1) {
                i++;
                if (i != 1) {
                    if (i == 4) {
                        break;
                    }
                } else {
                    yq0.m3449b(m10911i, this.f27968d);
                    i4 = m10911i;
                }
                a00Var.mo5860g(m3450a - 4);
            } else {
                int i6 = i5 + 1;
                if (i5 == i3) {
                    if (z) {
                        return false;
                    }
                    throw new tv0("Searched too many bytes.");
                }
                if (z) {
                    a00Var.mo5858i();
                    a00Var.mo5860g(i2 + i6);
                } else {
                    a00Var.mo5857j(1);
                }
                i5 = i6;
                i = 0;
                i4 = 0;
            }
        }
    }
}
