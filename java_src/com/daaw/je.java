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
/* loaded from: classes.dex */
public final class je extends me {
    public static final int[] s = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] t = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] u = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] v = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, p21.T0, p21.U0, p21.V0, p21.W0, 105, p21.X0, p21.Y0, p21.Z0, 109, 110, 111, 112, 113, 114, 115, x21.C0, x21.D0, x21.E0, x21.F0, x21.G0, x21.H0, x21.I0, 231, 247, 209, 241, 9632};
    public static final int[] w = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] x = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] y = {195, 227, 205, 204, 236, 210, 242, 213, 245, x21.J0, x21.L0, 92, 94, 95, x21.K0, x21.M0, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public final int h;
    public final int i;
    public List<ln> l;
    public List<ln> m;
    public int n;
    public int o;
    public boolean p;
    public byte q;
    public byte r;
    public final rv0 g = new rv0();
    public final ArrayList<a> j = new ArrayList<>();
    public a k = new a(0, 4);

    /* loaded from: classes.dex */
    public static class a {
        public final List<CharacterStyle> a = new ArrayList();
        public final List<C0055a> b = new ArrayList();
        public final List<SpannableString> c = new ArrayList();
        public final SpannableStringBuilder d = new SpannableStringBuilder();
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;

        /* renamed from: com.daaw.je$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0055a {
            public final CharacterStyle a;
            public final int b;
            public final int c;

            public C0055a(CharacterStyle characterStyle, int i, int i2) {
                this.a = characterStyle;
                this.b = i;
                this.c = i2;
            }
        }

        public a(int i, int i2) {
            g(i);
            i(i2);
        }

        public void a(char c) {
            this.d.append(c);
        }

        public void b() {
            int length = this.d.length();
            if (length > 0) {
                this.d.delete(length - 1, length);
            }
        }

        public ln c() {
            float f;
            int i;
            int i2;
            int i3;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.c.size(); i4++) {
                spannableStringBuilder.append((CharSequence) this.c.get(i4));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i5 = this.f + this.g;
            int length = (32 - i5) - spannableStringBuilder.length();
            int i6 = i5 - length;
            if (this.h == 2 && (Math.abs(i6) < 3 || length < 0)) {
                f = 0.5f;
                i = 1;
            } else if (this.h != 2 || i6 <= 0) {
                f = ((i5 / 32.0f) * 0.8f) + 0.1f;
                i = 0;
            } else {
                f = (((32 - length) / 32.0f) * 0.8f) + 0.1f;
                i = 2;
            }
            if (this.h == 1 || (i2 = this.e) > 7) {
                i2 = (this.e - 15) - 2;
                i3 = 2;
            } else {
                i3 = 0;
            }
            return new ln(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i2, 1, i3, f, i, Float.MIN_VALUE);
        }

        public SpannableString d() {
            int length = this.d.length();
            int i = 0;
            for (int i2 = 0; i2 < this.a.size(); i2++) {
                this.d.setSpan(this.a.get(i2), 0, length, 33);
            }
            while (i < this.b.size()) {
                C0055a c0055a = this.b.get(i);
                int size = this.b.size();
                int i3 = c0055a.c;
                this.d.setSpan(c0055a.a, c0055a.b, i < size - i3 ? this.b.get(i3 + i).b : length, 33);
                i++;
            }
            if (this.j != -1) {
                this.d.setSpan(new UnderlineSpan(), this.j, length, 33);
            }
            return new SpannableString(this.d);
        }

        public int e() {
            return this.e;
        }

        public boolean f() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.d.length() == 0;
        }

        public void g(int i) {
            this.h = i;
            this.a.clear();
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.e = 15;
            this.f = 0;
            this.g = 0;
            this.j = -1;
        }

        public void h() {
            this.c.add(d());
            this.d.clear();
            this.a.clear();
            this.b.clear();
            this.j = -1;
            int min = Math.min(this.i, this.e);
            while (this.c.size() >= min) {
                this.c.remove(0);
            }
        }

        public void i(int i) {
            this.i = i;
        }

        public void j(int i) {
            this.f = i;
        }

        public void k(CharacterStyle characterStyle, int i) {
            this.b.add(new C0055a(characterStyle, this.d.length(), i));
        }

        public void l(CharacterStyle characterStyle) {
            this.a.add(characterStyle);
        }

        public void m(int i) {
            this.e = i;
        }

        public void n(int i) {
            this.g = i;
        }

        public void o(boolean z) {
            if (z) {
                this.j = this.d.length();
            } else if (this.j != -1) {
                this.d.setSpan(new UnderlineSpan(), this.j, this.d.length(), 33);
                this.j = -1;
            }
        }

        public String toString() {
            return this.d.toString();
        }
    }

    public je(String str, int i) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 3 || i == 4) {
            this.i = 2;
        } else {
            this.i = 1;
        }
        C(0);
        B();
    }

    public static boolean A(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    public static char n(byte b) {
        return (char) v[(b & Byte.MAX_VALUE) - 32];
    }

    public static char p(byte b) {
        return (char) x[b & 31];
    }

    public static char q(byte b) {
        return (char) y[b & 31];
    }

    public static char r(byte b) {
        return (char) w[b & 15];
    }

    public static boolean w(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    public static boolean x(byte b, byte b2) {
        return (b & 247) == 20 && (b2 & 240) == 32;
    }

    public static boolean y(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    public static boolean z(byte b) {
        return (b & 240) == 16;
    }

    public final void B() {
        this.k.g(this.n);
        this.j.clear();
        this.j.add(this.k);
    }

    public final void C(int i) {
        int i2 = this.n;
        if (i2 == i) {
            return;
        }
        this.n = i;
        B();
        if (i2 == 3 || i == 1 || i == 0) {
            this.l = null;
        }
    }

    public final void D(int i) {
        this.o = i;
        this.k.i(i);
    }

    @Override // com.daaw.me, com.daaw.eq
    public void a() {
    }

    @Override // com.daaw.me, com.daaw.uh1
    public /* bridge */ /* synthetic */ void b(long j) {
        super.b(j);
    }

    @Override // com.daaw.me
    public th1 f() {
        List<ln> list = this.l;
        this.m = list;
        return new ne(list);
    }

    @Override // com.daaw.me, com.daaw.eq
    public void flush() {
        super.flush();
        this.l = null;
        this.m = null;
        C(0);
        D(4);
        B();
        this.p = false;
        this.q = (byte) 0;
        this.r = (byte) 0;
    }

    @Override // com.daaw.me
    public void g(xh1 xh1Var) {
        int i;
        a aVar;
        char n;
        this.g.H(xh1Var.r.array(), xh1Var.r.limit());
        boolean z = false;
        boolean z2 = false;
        while (true) {
            int a2 = this.g.a();
            int i2 = this.h;
            if (a2 < i2) {
                break;
            }
            byte x2 = i2 == 2 ? (byte) -4 : (byte) this.g.x();
            byte x3 = (byte) (this.g.x() & 127);
            byte x4 = (byte) (this.g.x() & 127);
            if ((x2 & 6) == 4 && ((i = this.i) != 1 || (x2 & 1) == 0)) {
                if (i != 2 || (x2 & 1) == 1) {
                    if (x3 != 0 || x4 != 0) {
                        if ((x3 & 247) == 17 && (x4 & 240) == 48) {
                            aVar = this.k;
                            n = r(x4);
                        } else if ((x3 & 246) == 18 && (x4 & 224) == 32) {
                            this.k.b();
                            if ((x3 & 1) == 0) {
                                aVar = this.k;
                                n = p(x4);
                            } else {
                                aVar = this.k;
                                n = q(x4);
                            }
                        } else {
                            if ((x3 & 224) == 0) {
                                z2 = s(x3, x4);
                            } else {
                                this.k.a(n(x3));
                                if ((x4 & 224) != 0) {
                                    aVar = this.k;
                                    n = n(x4);
                                }
                            }
                            z = true;
                        }
                        aVar.a(n);
                        z = true;
                    }
                }
            }
        }
        if (z) {
            if (!z2) {
                this.p = false;
            }
            int i3 = this.n;
            if (i3 == 1 || i3 == 3) {
                this.l = o();
            }
        }
    }

    @Override // com.daaw.me
    public /* bridge */ /* synthetic */ xh1 h() {
        return super.d();
    }

    @Override // com.daaw.me
    public /* bridge */ /* synthetic */ yh1 i() {
        return super.c();
    }

    @Override // com.daaw.me
    public boolean j() {
        return this.l != this.m;
    }

    @Override // com.daaw.me
    public /* bridge */ /* synthetic */ void k(xh1 xh1Var) {
        super.e(xh1Var);
    }

    public final List<ln> o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.j.size(); i++) {
            ln c = this.j.get(i).c();
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    public final boolean s(byte b, byte b2) {
        boolean z = z(b);
        if (z) {
            if (this.p && this.q == b && this.r == b2) {
                this.p = false;
                return true;
            }
            this.p = true;
            this.q = b;
            this.r = b2;
        }
        if (w(b, b2)) {
            t(b2);
        } else if (y(b, b2)) {
            v(b, b2);
        } else if (A(b, b2)) {
            this.k.n(b2 - 32);
        } else if (x(b, b2)) {
            u(b2);
        }
        return z;
    }

    public final void t(byte b) {
        this.k.a(' ');
        this.k.o((b & 1) == 1);
        int i = (b >> 1) & 15;
        if (i != 7) {
            this.k.k(new ForegroundColorSpan(u[i]), 1);
            return;
        }
        this.k.k(new StyleSpan(2), 2);
        this.k.k(new ForegroundColorSpan(-1), 1);
    }

    public final void u(byte b) {
        if (b == 32) {
            C(2);
        } else if (b == 41) {
            C(3);
        } else {
            switch (b) {
                case 37:
                    C(1);
                    D(2);
                    return;
                case 38:
                    C(1);
                    D(3);
                    return;
                case 39:
                    C(1);
                    D(4);
                    return;
                default:
                    int i = this.n;
                    if (i == 0) {
                        return;
                    }
                    if (b == 33) {
                        this.k.b();
                        return;
                    }
                    switch (b) {
                        case 44:
                            this.l = null;
                            if (i != 1 && i != 3) {
                                return;
                            }
                            break;
                        case 45:
                            if (i != 1 || this.k.f()) {
                                return;
                            }
                            this.k.h();
                            return;
                        case 46:
                            break;
                        case 47:
                            this.l = o();
                            break;
                        default:
                            return;
                    }
                    B();
                    return;
            }
        }
    }

    public final void v(byte b, byte b2) {
        int i = s[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.k.e()) {
            if (this.n != 1 && !this.k.f()) {
                a aVar = new a(this.n, this.o);
                this.k = aVar;
                this.j.add(aVar);
            }
            this.k.m(i);
        }
        if ((b2 & 1) == 1) {
            this.k.l(new UnderlineSpan());
        }
        int i2 = (b2 >> 1) & 15;
        if (i2 > 7) {
            this.k.j(t[i2 & 7]);
        } else if (i2 != 7) {
            this.k.l(new ForegroundColorSpan(u[i2]));
        } else {
            this.k.l(new StyleSpan(2));
            this.k.l(new ForegroundColorSpan(-1));
        }
    }
}
