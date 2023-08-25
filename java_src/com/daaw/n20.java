package com.daaw;

import com.daaw.da1;
import com.daaw.rg1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class n20 extends rg1 {

    /* renamed from: n */
    public o20 f19361n;

    /* renamed from: o */
    public C2236a f19362o;

    /* renamed from: com.daaw.n20$a */
    /* loaded from: classes.dex */
    public class C2236a implements ut0, da1 {

        /* renamed from: a */
        public long[] f19363a;

        /* renamed from: b */
        public long[] f19364b;

        /* renamed from: c */
        public long f19365c = -1;

        /* renamed from: d */
        public long f19366d = -1;

        public C2236a() {
        }

        @Override // com.daaw.ut0
        /* renamed from: a */
        public long mo7738a(a00 a00Var) {
            long j = this.f19366d;
            if (j >= 0) {
                long j2 = -(j + 2);
                this.f19366d = -1L;
                return j2;
            }
            return -1L;
        }

        @Override // com.daaw.ut0
        /* renamed from: c */
        public da1 mo7737c() {
            return this;
        }

        @Override // com.daaw.ut0
        /* renamed from: d */
        public long mo7736d(long j) {
            long m11347b = n20.this.m11347b(j);
            this.f19366d = this.f19363a[sq1.m10011e(this.f19363a, m11347b, true, true)];
            return m11347b;
        }

        @Override // com.daaw.da1
        /* renamed from: e */
        public boolean mo6932e() {
            return true;
        }

        /* renamed from: f */
        public void m15571f(rv0 rv0Var) {
            rv0Var.m10920K(1);
            int m10930A = rv0Var.m10930A() / 18;
            this.f19363a = new long[m10930A];
            this.f19364b = new long[m10930A];
            for (int i = 0; i < m10930A; i++) {
                this.f19363a[i] = rv0Var.m10903q();
                this.f19364b[i] = rv0Var.m10903q();
                rv0Var.m10920K(2);
            }
        }

        @Override // com.daaw.da1
        /* renamed from: g */
        public da1.C1068a mo6931g(long j) {
            int m10011e = sq1.m10011e(this.f19363a, n20.this.m11347b(j), true, true);
            long m11348a = n20.this.m11348a(this.f19363a[m10011e]);
            fa1 fa1Var = new fa1(m11348a, this.f19365c + this.f19364b[m10011e]);
            if (m11348a < j) {
                long[] jArr = this.f19363a;
                if (m10011e != jArr.length - 1) {
                    int i = m10011e + 1;
                    return new da1.C1068a(fa1Var, new fa1(n20.this.m11348a(jArr[i]), this.f19365c + this.f19364b[i]));
                }
            }
            return new da1.C1068a(fa1Var);
        }

        @Override // com.daaw.da1
        /* renamed from: h */
        public long mo6930h() {
            return n20.this.f19361n.m14602b();
        }

        /* renamed from: i */
        public void m15570i(long j) {
            this.f19365c = j;
        }
    }

    /* renamed from: n */
    public static boolean m15573n(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: o */
    public static boolean m15572o(rv0 rv0Var) {
        return rv0Var.m10919a() >= 5 && rv0Var.m10896x() == 127 && rv0Var.m10894z() == 1179402563;
    }

    @Override // com.daaw.rg1
    /* renamed from: e */
    public long mo3177e(rv0 rv0Var) {
        if (m15573n(rv0Var.f25637a)) {
            return m15574m(rv0Var);
        }
        return -1L;
    }

    @Override // com.daaw.rg1
    /* renamed from: h */
    public boolean mo3176h(rv0 rv0Var, long j, rg1.C2860b c2860b) {
        byte[] bArr = rv0Var.f25637a;
        if (this.f19361n == null) {
            this.f19361n = new o20(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, rv0Var.m10916d());
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int m14603a = this.f19361n.m14603a();
            o20 o20Var = this.f19361n;
            c2860b.f25265a = Format.m1722u(null, "audio/flac", null, -1, m14603a, o20Var.f20944f, o20Var.f20943e, singletonList, null, 0, null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            C2236a c2236a = new C2236a();
            this.f19362o = c2236a;
            c2236a.m15571f(rv0Var);
            return true;
        } else if (m15573n(bArr)) {
            C2236a c2236a2 = this.f19362o;
            if (c2236a2 != null) {
                c2236a2.m15570i(j);
                c2860b.f25266b = this.f19362o;
            }
            return false;
        } else {
            return true;
        }
    }

    @Override // com.daaw.rg1
    /* renamed from: j */
    public void mo3175j(boolean z) {
        super.mo3175j(z);
        if (z) {
            this.f19361n = null;
            this.f19362o = null;
        }
    }

    /* renamed from: m */
    public final int m15574m(rv0 rv0Var) {
        int i;
        int i2;
        int i3 = (rv0Var.f25637a[2] & 255) >> 4;
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
                rv0Var.m10920K(4);
                rv0Var.m10926E();
                int m10896x = i3 == 6 ? rv0Var.m10896x() : rv0Var.m10927D();
                rv0Var.m10921J(0);
                return m10896x + 1;
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
