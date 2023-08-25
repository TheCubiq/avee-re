package com.daaw;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class le extends me {
    public final rv0 g = new rv0();
    public final qv0 h = new qv0();
    public final int i;
    public final a[] j;
    public a k;
    public List<ln> l;
    public List<ln> m;
    public b n;
    public int o;

    /* loaded from: classes.dex */
    public static final class a {
        public static final int[] A;
        public static final int[] B;
        public static final boolean[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int[] G;
        public static final int w = h(2, 2, 2, 0);
        public static final int x;
        public static final int y;
        public static final int[] z;
        public final List<SpannableString> a = new ArrayList();
        public final SpannableStringBuilder b = new SpannableStringBuilder();
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;

        static {
            int h = h(0, 0, 0, 0);
            x = h;
            int h2 = h(0, 0, 0, 3);
            y = h2;
            z = new int[]{0, 0, 0, 0, 0, 2, 0};
            A = new int[]{0, 0, 0, 0, 0, 0, 2};
            B = new int[]{3, 3, 3, 3, 3, 3, 1};
            C = new boolean[]{false, false, false, true, true, true, false};
            D = new int[]{h, h2, h, h, h2, h, h};
            E = new int[]{0, 1, 2, 3, 4, 3, 4};
            F = new int[]{0, 0, 0, 0, 0, 3, 3};
            G = new int[]{h, h, h, h, h, h2, h2};
        }

        public a() {
            l();
        }

        public static int g(int i, int i2, int i3) {
            return h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.daaw.s6.c(r4, r0, r1)
                com.daaw.s6.c(r5, r0, r1)
                com.daaw.s6.c(r6, r0, r1)
                com.daaw.s6.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = 0
                goto L23
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L23
            L21:
                r7 = 255(0xff, float:3.57E-43)
            L23:
                if (r4 <= r1) goto L28
                r4 = 255(0xff, float:3.57E-43)
                goto L29
            L28:
                r4 = 0
            L29:
                if (r5 <= r1) goto L2e
                r5 = 255(0xff, float:3.57E-43)
                goto L2f
            L2e:
                r5 = 0
            L2f:
                if (r6 <= r1) goto L33
                r0 = 255(0xff, float:3.57E-43)
            L33:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.le.a.h(int, int, int, int):int");
        }

        public void a(char c) {
            if (c != '\n') {
                this.b.append(c);
                return;
            }
            this.a.add(d());
            this.b.clear();
            if (this.p != -1) {
                this.p = 0;
            }
            if (this.q != -1) {
                this.q = 0;
            }
            if (this.r != -1) {
                this.r = 0;
            }
            if (this.t != -1) {
                this.t = 0;
            }
            while (true) {
                if ((!this.k || this.a.size() < this.j) && this.a.size() < 15) {
                    return;
                }
                this.a.remove(0);
            }
        }

        public void b() {
            int length = this.b.length();
            if (length > 0) {
                this.b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.daaw.ke c() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.le.a.c():com.daaw.ke");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
        }

        public void f(boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.c = true;
            this.d = z2;
            this.k = z3;
            this.e = i;
            this.f = z5;
            this.g = i2;
            this.h = i3;
            this.i = i6;
            int i9 = i4 + 1;
            if (this.j != i9) {
                this.j = i9;
                while (true) {
                    if ((!z3 || this.a.size() < this.j) && this.a.size() < 15) {
                        break;
                    }
                    this.a.remove(0);
                }
            }
            if (i7 != 0 && this.m != i7) {
                this.m = i7;
                int i10 = i7 - 1;
                q(D[i10], y, C[i10], 0, A[i10], B[i10], z[i10]);
            }
            if (i8 == 0 || this.n == i8) {
                return;
            }
            this.n = i8;
            int i11 = i8 - 1;
            m(0, 1, 1, false, false, F[i11], E[i11]);
            n(w, G[i11], x);
        }

        public boolean i() {
            return this.c;
        }

        public boolean j() {
            return !i() || (this.a.isEmpty() && this.b.length() == 0);
        }

        public boolean k() {
            return this.d;
        }

        public void l() {
            e();
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            int i = x;
            this.o = i;
            this.s = w;
            this.u = i;
        }

        public void m(int i, int i2, int i3, boolean z2, boolean z3, int i4, int i5) {
            if (this.p != -1) {
                if (!z2) {
                    this.b.setSpan(new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            } else if (z2) {
                this.p = this.b.length();
            }
            if (this.q == -1) {
                if (z3) {
                    this.q = this.b.length();
                }
            } else if (z3) {
            } else {
                this.b.setSpan(new UnderlineSpan(), this.q, this.b.length(), 33);
                this.q = -1;
            }
        }

        public void n(int i, int i2, int i3) {
            if (this.r != -1 && this.s != i) {
                this.b.setSpan(new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (i != w) {
                this.r = this.b.length();
                this.s = i;
            }
            if (this.t != -1 && this.u != i2) {
                this.b.setSpan(new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (i2 != x) {
                this.t = this.b.length();
                this.u = i2;
            }
        }

        public void o(int i, int i2) {
            if (this.v != i) {
                a('\n');
            }
            this.v = i;
        }

        public void p(boolean z2) {
            this.d = z2;
        }

        public void q(int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
            this.o = i;
            this.l = i6;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d = 0;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = new byte[(i2 * 2) - 1];
        }
    }

    public le(int i) {
        this.i = i == -1 ? 1 : i;
        this.j = new a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.j[i2] = new a();
        }
        this.k = this.j[0];
        D();
    }

    public final void A() {
        this.h.o(4);
        int h = this.h.h(4);
        this.h.o(2);
        this.k.o(h, this.h.h(6));
    }

    public final void B() {
        int h = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int h2 = this.h.h(2);
        int g = a.g(this.h.h(2), this.h.h(2), this.h.h(2));
        if (this.h.g()) {
            h2 |= 4;
        }
        boolean g2 = this.h.g();
        int h3 = this.h.h(2);
        int h4 = this.h.h(2);
        int h5 = this.h.h(2);
        this.h.o(8);
        this.k.q(h, g, g2, h2, h3, h4, h5);
    }

    public final void C() {
        StringBuilder sb;
        String str;
        b bVar = this.n;
        int i = bVar.d;
        if (i != (bVar.b * 2) - 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((this.n.b * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(this.n.d);
            sb2.append(" (sequence number ");
            sb2.append(this.n.a);
            sb2.append("); ignoring packet");
            return;
        }
        this.h.l(bVar.c, i);
        int h = this.h.h(3);
        int h2 = this.h.h(5);
        if (h == 7) {
            this.h.o(2);
            h += this.h.h(6);
        }
        if (h2 == 0) {
            if (h != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("serviceNumber is non-zero (");
                sb3.append(h);
                sb3.append(") when blockSize is 0");
            }
        } else if (h != this.i) {
        } else {
            boolean z = false;
            while (this.h.b() > 0) {
                int h3 = this.h.h(8);
                if (h3 == 16) {
                    h3 = this.h.h(8);
                    if (h3 <= 31) {
                        r(h3);
                    } else {
                        if (h3 <= 127) {
                            w(h3);
                        } else if (h3 <= 159) {
                            s(h3);
                        } else if (h3 <= 255) {
                            x(h3);
                        } else {
                            sb = new StringBuilder();
                            str = "Invalid extended command: ";
                            sb.append(str);
                            sb.append(h3);
                        }
                        z = true;
                    }
                } else if (h3 <= 31) {
                    p(h3);
                } else {
                    if (h3 <= 127) {
                        u(h3);
                    } else if (h3 <= 159) {
                        q(h3);
                    } else if (h3 <= 255) {
                        v(h3);
                    } else {
                        sb = new StringBuilder();
                        str = "Invalid base command: ";
                        sb.append(str);
                        sb.append(h3);
                    }
                    z = true;
                }
            }
            if (z) {
                this.l = o();
            }
        }
    }

    public final void D() {
        for (int i = 0; i < 8; i++) {
            this.j[i].l();
        }
    }

    @Override // com.daaw.me, com.daaw.eq
    public /* bridge */ /* synthetic */ void a() {
        super.a();
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
        this.o = 0;
        this.k = this.j[0];
        D();
        this.n = null;
    }

    @Override // com.daaw.me
    public void g(xh1 xh1Var) {
        this.g.H(xh1Var.r.array(), xh1Var.r.limit());
        while (this.g.a() >= 3) {
            int x = this.g.x() & 7;
            int i = x & 3;
            boolean z = (x & 4) == 4;
            byte x2 = (byte) this.g.x();
            byte x3 = (byte) this.g.x();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        n();
                        int i2 = (x2 & 192) >> 6;
                        int i3 = x2 & 63;
                        if (i3 == 0) {
                            i3 = 64;
                        }
                        b bVar = new b(i2, i3);
                        this.n = bVar;
                        byte[] bArr = bVar.c;
                        int i4 = bVar.d;
                        bVar.d = i4 + 1;
                        bArr[i4] = x3;
                    } else {
                        s6.a(i == 2);
                        b bVar2 = this.n;
                        if (bVar2 != null) {
                            byte[] bArr2 = bVar2.c;
                            int i5 = bVar2.d;
                            int i6 = i5 + 1;
                            bVar2.d = i6;
                            bArr2[i5] = x2;
                            bVar2.d = i6 + 1;
                            bArr2[i6] = x3;
                        }
                    }
                    b bVar3 = this.n;
                    if (bVar3.d == (bVar3.b * 2) - 1) {
                        n();
                    }
                }
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

    public final void n() {
        if (this.n == null) {
            return;
        }
        C();
        this.n = null;
    }

    public final List<ln> o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.j[i].j() && this.j[i].k()) {
                arrayList.add(this.j[i].c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    public final void p(int i) {
        qv0 qv0Var;
        if (i != 0) {
            if (i == 3) {
                this.l = o();
                return;
            }
            int i2 = 8;
            if (i == 8) {
                this.k.b();
                return;
            }
            switch (i) {
                case 12:
                    D();
                    return;
                case 13:
                    this.k.a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(i);
                        qv0Var = this.h;
                    } else if (i < 24 || i > 31) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid C0 command: ");
                        sb2.append(i);
                        return;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Currently unsupported COMMAND_P16 Command: ");
                        sb3.append(i);
                        qv0Var = this.h;
                        i2 = 16;
                    }
                    qv0Var.o(i2);
                    return;
            }
        }
    }

    public final void q(int i) {
        a aVar;
        a aVar2;
        qv0 qv0Var;
        int i2 = 16;
        int i3 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i4 = i - 128;
                if (this.o != i4) {
                    this.o = i4;
                    aVar = this.j[i4];
                    this.k = aVar;
                    return;
                }
                return;
            case 136:
                while (i3 <= 8) {
                    if (this.h.g()) {
                        this.j[8 - i3].e();
                    }
                    i3++;
                }
                return;
            case 137:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.h.g()) {
                        this.j[8 - i5].p(true);
                    }
                }
                return;
            case 138:
                while (i3 <= 8) {
                    if (this.h.g()) {
                        this.j[8 - i3].p(false);
                    }
                    i3++;
                }
                return;
            case 139:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.h.g()) {
                        this.j[8 - i6].p(!aVar2.k());
                    }
                }
                return;
            case 140:
                while (i3 <= 8) {
                    if (this.h.g()) {
                        this.j[8 - i3].l();
                    }
                    i3++;
                }
                return;
            case 141:
                this.h.o(8);
                return;
            case 142:
                return;
            case 143:
                D();
                return;
            case 144:
                if (this.k.i()) {
                    y();
                    return;
                }
                qv0Var = this.h;
                qv0Var.o(i2);
                return;
            case 145:
                if (this.k.i()) {
                    z();
                    return;
                }
                qv0Var = this.h;
                i2 = 24;
                qv0Var.o(i2);
                return;
            case 146:
                if (this.k.i()) {
                    A();
                    return;
                }
                qv0Var = this.h;
                qv0Var.o(i2);
                return;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid C1 command: ");
                sb.append(i);
                return;
            case 151:
                if (this.k.i()) {
                    B();
                    return;
                }
                qv0Var = this.h;
                i2 = 32;
                qv0Var.o(i2);
                return;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i7 = i - 152;
                t(i7);
                if (this.o != i7) {
                    this.o = i7;
                    aVar = this.j[i7];
                    this.k = aVar;
                    return;
                }
                return;
        }
    }

    public final void r(int i) {
        qv0 qv0Var;
        int i2;
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            qv0Var = this.h;
            i2 = 8;
        } else if (i <= 23) {
            qv0Var = this.h;
            i2 = 16;
        } else if (i > 31) {
            return;
        } else {
            qv0Var = this.h;
            i2 = 24;
        }
        qv0Var.o(i2);
    }

    public final void s(int i) {
        qv0 qv0Var;
        int i2;
        if (i <= 135) {
            qv0Var = this.h;
            i2 = 32;
        } else if (i > 143) {
            if (i <= 159) {
                this.h.o(2);
                this.h.o(this.h.h(6) * 8);
                return;
            }
            return;
        } else {
            qv0Var = this.h;
            i2 = 40;
        }
        qv0Var.o(i2);
    }

    public final void t(int i) {
        a aVar = this.j[i];
        this.h.o(2);
        boolean g = this.h.g();
        boolean g2 = this.h.g();
        boolean g3 = this.h.g();
        int h = this.h.h(3);
        boolean g4 = this.h.g();
        int h2 = this.h.h(7);
        int h3 = this.h.h(8);
        int h4 = this.h.h(4);
        int h5 = this.h.h(4);
        this.h.o(2);
        int h6 = this.h.h(6);
        this.h.o(2);
        aVar.f(g, g2, g3, h, g4, h2, h3, h5, h6, h4, this.h.h(3), this.h.h(3));
    }

    public final void u(int i) {
        if (i == 127) {
            this.k.a((char) 9835);
        } else {
            this.k.a((char) (i & 255));
        }
    }

    public final void v(int i) {
        this.k.a((char) (i & 255));
    }

    public final void w(int i) {
        a aVar;
        char c = ' ';
        if (i == 32) {
            aVar = this.k;
        } else if (i == 33) {
            aVar = this.k;
            c = 160;
        } else if (i == 37) {
            aVar = this.k;
            c = 8230;
        } else if (i == 42) {
            aVar = this.k;
            c = 352;
        } else if (i == 44) {
            aVar = this.k;
            c = 338;
        } else if (i == 63) {
            aVar = this.k;
            c = 376;
        } else if (i == 57) {
            aVar = this.k;
            c = 8482;
        } else if (i == 58) {
            aVar = this.k;
            c = 353;
        } else if (i == 60) {
            aVar = this.k;
            c = 339;
        } else if (i != 61) {
            switch (i) {
                case 48:
                    aVar = this.k;
                    c = 9608;
                    break;
                case 49:
                    aVar = this.k;
                    c = 8216;
                    break;
                case 50:
                    aVar = this.k;
                    c = 8217;
                    break;
                case 51:
                    aVar = this.k;
                    c = 8220;
                    break;
                case 52:
                    aVar = this.k;
                    c = 8221;
                    break;
                case 53:
                    aVar = this.k;
                    c = 8226;
                    break;
                default:
                    switch (i) {
                        case x21.E0 /* 118 */:
                            aVar = this.k;
                            c = 8539;
                            break;
                        case x21.F0 /* 119 */:
                            aVar = this.k;
                            c = 8540;
                            break;
                        case x21.G0 /* 120 */:
                            aVar = this.k;
                            c = 8541;
                            break;
                        case x21.H0 /* 121 */:
                            aVar = this.k;
                            c = 8542;
                            break;
                        case x21.I0 /* 122 */:
                            aVar = this.k;
                            c = 9474;
                            break;
                        case x21.J0 /* 123 */:
                            aVar = this.k;
                            c = 9488;
                            break;
                        case x21.K0 /* 124 */:
                            aVar = this.k;
                            c = 9492;
                            break;
                        case x21.L0 /* 125 */:
                            aVar = this.k;
                            c = 9472;
                            break;
                        case x21.M0 /* 126 */:
                            aVar = this.k;
                            c = 9496;
                            break;
                        case 127:
                            aVar = this.k;
                            c = 9484;
                            break;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("Invalid G2 character: ");
                            sb.append(i);
                            return;
                    }
            }
        } else {
            aVar = this.k;
            c = 8480;
        }
        aVar.a(c);
    }

    public final void x(int i) {
        a aVar;
        char c;
        if (i == 160) {
            aVar = this.k;
            c = 13252;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid G3 character: ");
            sb.append(i);
            aVar = this.k;
            c = '_';
        }
        aVar.a(c);
    }

    public final void y() {
        this.k.m(this.h.h(4), this.h.h(2), this.h.h(2), this.h.g(), this.h.g(), this.h.h(3), this.h.h(3));
    }

    public final void z() {
        int h = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        int h2 = a.h(this.h.h(2), this.h.h(2), this.h.h(2), this.h.h(2));
        this.h.o(2);
        this.k.n(h, h2, a.g(this.h.h(2), this.h.h(2), this.h.h(2)));
    }
}
