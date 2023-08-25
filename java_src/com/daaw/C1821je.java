package com.daaw;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.daaw.je */
/* loaded from: classes.dex */
public final class C1821je extends AbstractC2168me {

    /* renamed from: s */
    public static final int[] f15009s = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: t */
    public static final int[] f15010t = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: u */
    public static final int[] f15011u = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: v */
    public static final int[] f15012v = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, p21.f22328T0, p21.f22334U0, p21.f22340V0, p21.f22346W0, 105, p21.f22352X0, p21.f22358Y0, p21.f22364Z0, 109, 110, 111, 112, 113, 114, 115, x21.f31769C0, x21.f31774D0, x21.f31779E0, x21.f31784F0, x21.f31789G0, x21.f31794H0, x21.f31799I0, 231, 247, 209, 241, 9632};

    /* renamed from: w */
    public static final int[] f15013w = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: x */
    public static final int[] f15014x = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: y */
    public static final int[] f15015y = {195, 227, 205, 204, 236, 210, 242, 213, 245, x21.f31804J0, x21.f31814L0, 92, 94, 95, x21.f31809K0, x21.f31819M0, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: h */
    public final int f15017h;

    /* renamed from: i */
    public final int f15018i;

    /* renamed from: l */
    public List<C2099ln> f15021l;

    /* renamed from: m */
    public List<C2099ln> f15022m;

    /* renamed from: n */
    public int f15023n;

    /* renamed from: o */
    public int f15024o;

    /* renamed from: p */
    public boolean f15025p;

    /* renamed from: q */
    public byte f15026q;

    /* renamed from: r */
    public byte f15027r;

    /* renamed from: g */
    public final rv0 f15016g = new rv0();

    /* renamed from: j */
    public final ArrayList<C1822a> f15019j = new ArrayList<>();

    /* renamed from: k */
    public C1822a f15020k = new C1822a(0, 4);

    /* renamed from: com.daaw.je$a */
    /* loaded from: classes.dex */
    public static class C1822a {

        /* renamed from: a */
        public final List<CharacterStyle> f15028a = new ArrayList();

        /* renamed from: b */
        public final List<C1823a> f15029b = new ArrayList();

        /* renamed from: c */
        public final List<SpannableString> f15030c = new ArrayList();

        /* renamed from: d */
        public final SpannableStringBuilder f15031d = new SpannableStringBuilder();

        /* renamed from: e */
        public int f15032e;

        /* renamed from: f */
        public int f15033f;

        /* renamed from: g */
        public int f15034g;

        /* renamed from: h */
        public int f15035h;

        /* renamed from: i */
        public int f15036i;

        /* renamed from: j */
        public int f15037j;

        /* renamed from: com.daaw.je$a$a */
        /* loaded from: classes.dex */
        public static class C1823a {

            /* renamed from: a */
            public final CharacterStyle f15038a;

            /* renamed from: b */
            public final int f15039b;

            /* renamed from: c */
            public final int f15040c;

            public C1823a(CharacterStyle characterStyle, int i, int i2) {
                this.f15038a = characterStyle;
                this.f15039b = i;
                this.f15040c = i2;
            }
        }

        public C1822a(int i, int i2) {
            m18557g(i);
            m18555i(i2);
        }

        /* renamed from: a */
        public void m18563a(char c) {
            this.f15031d.append(c);
        }

        /* renamed from: b */
        public void m18562b() {
            int length = this.f15031d.length();
            if (length > 0) {
                this.f15031d.delete(length - 1, length);
            }
        }

        /* renamed from: c */
        public C2099ln m18561c() {
            float f;
            int i;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f15030c.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.f15030c.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m18560d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.f15033f + this.f15034g;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (this.f15035h == 2 && (Math.abs(i6) < 3 || length < 0)) {
                f = 0.5f;
                i = 1;
            } else if (this.f15035h != 2 || i6 <= 0) {
                f = ((i5 / 32.0f) * 0.8f) + 0.1f;
                i = 0;
            } else {
                f = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
                i = 2;
            }
            if (this.f15035h == 1 || (i2 = this.f15032e) > 7) {
                i2 = (this.f15032e - 15) - 2;
                i3 = 2;
            } else {
                i3 = 0;
            }
            return new C2099ln(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i2, 1, i3, f, i, Float.MIN_VALUE);
        }

        /* renamed from: d */
        public SpannableString m18560d() {
            int length = this.f15031d.length();
            int i = 0;
            for (int i2 = 0; i2 < this.f15028a.size(); i2++) {
                this.f15031d.setSpan(this.f15028a.get(i2), 0, length, 33);
            }
            while (i < this.f15029b.size()) {
                C1823a c1823a = this.f15029b.get(i);
                int size = this.f15029b.size();
                int i3 = c1823a.f15040c;
                this.f15031d.setSpan(c1823a.f15038a, c1823a.f15039b, i < size - i3 ? this.f15029b.get(i3 + i).f15039b : length, 33);
                i++;
            }
            if (this.f15037j != -1) {
                this.f15031d.setSpan(new UnderlineSpan(), this.f15037j, length, 33);
            }
            return new SpannableString(this.f15031d);
        }

        /* renamed from: e */
        public int m18559e() {
            return this.f15032e;
        }

        /* renamed from: f */
        public boolean m18558f() {
            return this.f15028a.isEmpty() && this.f15029b.isEmpty() && this.f15030c.isEmpty() && this.f15031d.length() == 0;
        }

        /* renamed from: g */
        public void m18557g(int i) {
            this.f15035h = i;
            this.f15028a.clear();
            this.f15029b.clear();
            this.f15030c.clear();
            this.f15031d.clear();
            this.f15032e = 15;
            this.f15033f = 0;
            this.f15034g = 0;
            this.f15037j = -1;
        }

        /* renamed from: h */
        public void m18556h() {
            this.f15030c.add(m18560d());
            this.f15031d.clear();
            this.f15028a.clear();
            this.f15029b.clear();
            this.f15037j = -1;
            int min = Math.min(this.f15036i, this.f15032e);
            while (this.f15030c.size() >= min) {
                this.f15030c.remove(0);
            }
        }

        /* renamed from: i */
        public void m18555i(int i) {
            this.f15036i = i;
        }

        /* renamed from: j */
        public void m18554j(int i) {
            this.f15033f = i;
        }

        /* renamed from: k */
        public void m18553k(CharacterStyle characterStyle, int i) {
            this.f15029b.add(new C1823a(characterStyle, this.f15031d.length(), i));
        }

        /* renamed from: l */
        public void m18552l(CharacterStyle characterStyle) {
            this.f15028a.add(characterStyle);
        }

        /* renamed from: m */
        public void m18551m(int i) {
            this.f15032e = i;
        }

        /* renamed from: n */
        public void m18550n(int i) {
            this.f15034g = i;
        }

        /* renamed from: o */
        public void m18549o(boolean z) {
            if (z) {
                this.f15037j = this.f15031d.length();
            } else if (this.f15037j != -1) {
                this.f15031d.setSpan(new UnderlineSpan(), this.f15037j, this.f15031d.length(), 33);
                this.f15037j = -1;
            }
        }

        public String toString() {
            return this.f15031d.toString();
        }
    }

    public C1821je(String str, int i) {
        this.f15017h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 3 || i == 4) {
            this.f15018i = 2;
        } else {
            this.f15018i = 1;
        }
        m18578C(0);
        m18579B();
    }

    /* renamed from: A */
    public static boolean m18580A(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: n */
    public static char m18576n(byte b) {
        return (char) f15012v[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: p */
    public static char m18574p(byte b) {
        return (char) f15014x[b & 31];
    }

    /* renamed from: q */
    public static char m18573q(byte b) {
        return (char) f15015y[b & 31];
    }

    /* renamed from: r */
    public static char m18572r(byte b) {
        return (char) f15013w[b & 15];
    }

    /* renamed from: w */
    public static boolean m18567w(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: x */
    public static boolean m18566x(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: y */
    public static boolean m18565y(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: z */
    public static boolean m18564z(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: B */
    public final void m18579B() {
        this.f15020k.m18557g(this.f15023n);
        this.f15019j.clear();
        this.f15019j.add(this.f15020k);
    }

    /* renamed from: C */
    public final void m18578C(int i) {
        int i2 = this.f15023n;
        if (i2 == i) {
            return;
        }
        this.f15023n = i;
        m18579B();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f15021l = null;
        }
    }

    /* renamed from: D */
    public final void m18577D(int i) {
        this.f15024o = i;
        this.f15020k.m18555i(i);
    }

    @Override // com.daaw.AbstractC2168me, com.daaw.InterfaceC1211eq
    /* renamed from: a */
    public void mo16074a() {
    }

    @Override // com.daaw.AbstractC2168me, com.daaw.uh1
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo8184b(long j) {
        super.mo8184b(j);
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: f */
    public th1 mo16070f() {
        List<C2099ln> list = this.f15021l;
        this.f15022m = list;
        return new C2285ne(list);
    }

    @Override // com.daaw.AbstractC2168me, com.daaw.InterfaceC1211eq
    public void flush() {
        super.flush();
        this.f15021l = null;
        this.f15022m = null;
        m18578C(0);
        m18577D(4);
        m18579B();
        this.f15025p = false;
        this.f15026q = (byte) 0;
        this.f15027r = (byte) 0;
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: g */
    public void mo16069g(xh1 xh1Var) {
        int i;
        C1822a c1822a;
        char m18576n;
        this.f15016g.m10923H(xh1Var.f11565r.array(), xh1Var.f11565r.limit());
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int m10919a = this.f15016g.m10919a();
            int i2 = this.f15017h;
            if (m10919a < i2) {
                break;
            }
            byte m10896x = i2 == 2 ? (byte) -4 : (byte) this.f15016g.m10896x();
            byte m10896x2 = (byte) (this.f15016g.m10896x() & 127);
            byte m10896x3 = (byte) (this.f15016g.m10896x() & 127);
            if ((m10896x & 6) == 4 && ((i = this.f15018i) != 1 || (m10896x & 1) == 0)) {
                if (i != 2 || (m10896x & 1) == 1) {
                    if (m10896x2 != 0 || m10896x3 != 0) {
                        if ((m10896x2 & 247) == 17 && (m10896x3 & 240) == 48) {
                            c1822a = this.f15020k;
                            m18576n = m18572r(m10896x3);
                        } else if ((m10896x2 & 246) == 18 && (m10896x3 & 224) == 32) {
                            this.f15020k.m18562b();
                            if ((m10896x2 & 1) == 0) {
                                c1822a = this.f15020k;
                                m18576n = m18574p(m10896x3);
                            } else {
                                c1822a = this.f15020k;
                                m18576n = m18573q(m10896x3);
                            }
                        } else {
                            if ((m10896x2 & 224) == 0) {
                                z2 = m18571s(m10896x2, m10896x3);
                            } else {
                                this.f15020k.m18563a(m18576n(m10896x2));
                                if ((m10896x3 & 224) != 0) {
                                    c1822a = this.f15020k;
                                    m18576n = m18576n(m10896x3);
                                }
                            }
                            z = true;
                        }
                        c1822a.m18563a(m18576n);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            if (!z2) {
                this.f15025p = false;
            }
            int i3 = this.f15023n;
            if (i3 == 1 || i3 == 3) {
                this.f15021l = m18575o();
            }
        }
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: h */
    public /* bridge */ /* synthetic */ xh1 mo16068h() {
        return super.mo16072d();
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: i */
    public /* bridge */ /* synthetic */ yh1 mo16067i() {
        return super.mo16073c();
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: j */
    public boolean mo16066j() {
        return this.f15021l != this.f15022m;
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void mo16065k(xh1 xh1Var) {
        super.mo16071e(xh1Var);
    }

    /* renamed from: o */
    public final List<C2099ln> m18575o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f15019j.size(); i++) {
            C2099ln m18561c = this.f15019j.get(i).m18561c();
            if (m18561c != null) {
                arrayList.add(m18561c);
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public final boolean m18571s(byte b, byte b2) {
        boolean m18564z = m18564z(b);
        if (m18564z) {
            if (this.f15025p && this.f15026q == b && this.f15027r == b2) {
                this.f15025p = false;
                return true;
            }
            this.f15025p = true;
            this.f15026q = b;
            this.f15027r = b2;
        }
        if (m18567w(b, b2)) {
            m18570t(b2);
        } else if (m18565y(b, b2)) {
            m18568v(b, b2);
        } else if (m18580A(b, b2)) {
            this.f15020k.m18550n(b2 - 32);
        } else if (m18566x(b, b2)) {
            m18569u(b2);
        }
        return m18564z;
    }

    /* renamed from: t */
    public final void m18570t(byte b) {
        this.f15020k.m18563a(' ');
        this.f15020k.m18549o((b & 1) == 1);
        int i = (b >> 1) & 15;
        if (i != 7) {
            this.f15020k.m18553k(new ForegroundColorSpan(f15011u[i]), 1);
            return;
        }
        this.f15020k.m18553k(new StyleSpan(2), 2);
        this.f15020k.m18553k(new ForegroundColorSpan(-1), 1);
    }

    /* renamed from: u */
    public final void m18569u(byte b) {
        if (b == 32) {
            m18578C(2);
        } else if (b == 41) {
            m18578C(3);
        } else {
            switch (b) {
                case 37:
                    m18578C(1);
                    m18577D(2);
                    return;
                case 38:
                    m18578C(1);
                    m18577D(3);
                    return;
                case 39:
                    m18578C(1);
                    m18577D(4);
                    return;
                default:
                    int i = this.f15023n;
                    if (i == 0) {
                        return;
                    }
                    if (b == 33) {
                        this.f15020k.m18562b();
                        return;
                    }
                    switch (b) {
                        case 44:
                            this.f15021l = null;
                            if (i != 1 && i != 3) {
                                return;
                            }
                            break;
                        case 45:
                            if (i != 1 || this.f15020k.m18558f()) {
                                return;
                            }
                            this.f15020k.m18556h();
                            return;
                        case 46:
                            break;
                        case 47:
                            this.f15021l = m18575o();
                            break;
                        default:
                            return;
                    }
                    m18579B();
                    return;
            }
        }
    }

    /* renamed from: v */
    public final void m18568v(byte b, byte b2) {
        int i = f15009s[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.f15020k.m18559e()) {
            if (this.f15023n != 1 && !this.f15020k.m18558f()) {
                C1822a c1822a = new C1822a(this.f15023n, this.f15024o);
                this.f15020k = c1822a;
                this.f15019j.add(c1822a);
            }
            this.f15020k.m18551m(i);
        }
        if ((b2 & 1) == 1) {
            this.f15020k.m18552l(new UnderlineSpan());
        }
        int i2 = (b2 >> 1) & 15;
        if (i2 > 7) {
            this.f15020k.m18554j(f15010t[i2 & 7]);
        } else if (i2 != 7) {
            this.f15020k.m18552l(new ForegroundColorSpan(f15011u[i2]));
        } else {
            this.f15020k.m18552l(new StyleSpan(2));
            this.f15020k.m18552l(new ForegroundColorSpan(-1));
        }
    }
}
