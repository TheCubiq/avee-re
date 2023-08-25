package com.daaw;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.le */
/* loaded from: classes.dex */
public final class C2030le extends AbstractC2168me {

    /* renamed from: g */
    public final rv0 f17307g = new rv0();

    /* renamed from: h */
    public final qv0 f17308h = new qv0();

    /* renamed from: i */
    public final int f17309i;

    /* renamed from: j */
    public final C2031a[] f17310j;

    /* renamed from: k */
    public C2031a f17311k;

    /* renamed from: l */
    public List<C2099ln> f17312l;

    /* renamed from: m */
    public List<C2099ln> f17313m;

    /* renamed from: n */
    public C2032b f17314n;

    /* renamed from: o */
    public int f17315o;

    /* renamed from: com.daaw.le$a */
    /* loaded from: classes.dex */
    public static final class C2031a {

        /* renamed from: A */
        public static final int[] f17316A;

        /* renamed from: B */
        public static final int[] f17317B;

        /* renamed from: C */
        public static final boolean[] f17318C;

        /* renamed from: D */
        public static final int[] f17319D;

        /* renamed from: E */
        public static final int[] f17320E;

        /* renamed from: F */
        public static final int[] f17321F;

        /* renamed from: G */
        public static final int[] f17322G;

        /* renamed from: w */
        public static final int f17323w = m17008h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f17324x;

        /* renamed from: y */
        public static final int f17325y;

        /* renamed from: z */
        public static final int[] f17326z;

        /* renamed from: a */
        public final List<SpannableString> f17327a = new ArrayList();

        /* renamed from: b */
        public final SpannableStringBuilder f17328b = new SpannableStringBuilder();

        /* renamed from: c */
        public boolean f17329c;

        /* renamed from: d */
        public boolean f17330d;

        /* renamed from: e */
        public int f17331e;

        /* renamed from: f */
        public boolean f17332f;

        /* renamed from: g */
        public int f17333g;

        /* renamed from: h */
        public int f17334h;

        /* renamed from: i */
        public int f17335i;

        /* renamed from: j */
        public int f17336j;

        /* renamed from: k */
        public boolean f17337k;

        /* renamed from: l */
        public int f17338l;

        /* renamed from: m */
        public int f17339m;

        /* renamed from: n */
        public int f17340n;

        /* renamed from: o */
        public int f17341o;

        /* renamed from: p */
        public int f17342p;

        /* renamed from: q */
        public int f17343q;

        /* renamed from: r */
        public int f17344r;

        /* renamed from: s */
        public int f17345s;

        /* renamed from: t */
        public int f17346t;

        /* renamed from: u */
        public int f17347u;

        /* renamed from: v */
        public int f17348v;

        static {
            int m17008h = m17008h(0, 0, 0, 0);
            f17324x = m17008h;
            int m17008h2 = m17008h(0, 0, 0, 3);
            f17325y = m17008h2;
            f17326z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f17316A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f17317B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f17318C = new boolean[]{false, false, false, true, true, true, false};
            f17319D = new int[]{m17008h, m17008h2, m17008h, m17008h, m17008h2, m17008h, m17008h};
            f17320E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f17321F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f17322G = new int[]{m17008h, m17008h, m17008h, m17008h, m17008h, m17008h2, m17008h2};
        }

        public C2031a() {
            m17004l();
        }

        /* renamed from: g */
        public static int m17009g(int i, int i2, int i3) {
            return m17008h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int m17008h(int i, int i2, int i3, int i4) {
            int i5;
            C2914s6.m10688c(i, 0, 4);
            C2914s6.m10688c(i2, 0, 4);
            C2914s6.m10688c(i3, 0, 4);
            C2914s6.m10688c(i4, 0, 4);
            if (i4 != 0 && i4 != 1) {
                if (i4 == 2) {
                    i5 = 127;
                } else if (i4 == 3) {
                    i5 = 0;
                }
                return Color.argb(i5, i <= 1 ? 255 : 0, i2 <= 1 ? 255 : 0, i3 > 1 ? 255 : 0);
            }
            i5 = 255;
            return Color.argb(i5, i <= 1 ? 255 : 0, i2 <= 1 ? 255 : 0, i3 > 1 ? 255 : 0);
        }

        /* renamed from: a */
        public void m17015a(char c) {
            if (c != '\n') {
                this.f17328b.append(c);
                return;
            }
            this.f17327a.add(m17012d());
            this.f17328b.clear();
            if (this.f17342p != -1) {
                this.f17342p = 0;
            }
            if (this.f17343q != -1) {
                this.f17343q = 0;
            }
            if (this.f17344r != -1) {
                this.f17344r = 0;
            }
            if (this.f17346t != -1) {
                this.f17346t = 0;
            }
            while (true) {
                if ((!this.f17337k || this.f17327a.size() < this.f17336j) && this.f17327a.size() < 15) {
                    return;
                }
                this.f17327a.remove(0);
            }
        }

        /* renamed from: b */
        public void m17014b() {
            int length = this.f17328b.length();
            if (length > 0) {
                this.f17328b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C1942ke m17013c() {
            Layout.Alignment alignment;
            float f;
            float f2;
            if (m17006j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < this.f17327a.size(); i++) {
                spannableStringBuilder.append((CharSequence) this.f17327a.get(i));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) m17012d());
            int i2 = this.f17338l;
            if (i2 != 0) {
                if (i2 == 1) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else if (i2 == 2) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (i2 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f17338l);
                }
                Layout.Alignment alignment2 = alignment;
                if (this.f17332f) {
                    f = this.f17334h / 209.0f;
                    f2 = this.f17333g / 74.0f;
                } else {
                    f = this.f17334h / 99.0f;
                    f2 = this.f17333g / 99.0f;
                }
                float f3 = (f * 0.9f) + 0.05f;
                float f4 = (f2 * 0.9f) + 0.05f;
                int i3 = this.f17335i;
                int i4 = i3 % 3 != 0 ? 0 : i3 % 3 == 1 ? 1 : 2;
                int i5 = i3 / 3 != 0 ? 0 : i3 / 3 == 1 ? 1 : 2;
                int i6 = this.f17341o;
                return new C1942ke(spannableStringBuilder, alignment2, f4, 0, i4, f3, i5, Float.MIN_VALUE, i6 != f17324x, i6, this.f17331e);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            Layout.Alignment alignment22 = alignment;
            if (this.f17332f) {
            }
            float f32 = (f * 0.9f) + 0.05f;
            float f42 = (f2 * 0.9f) + 0.05f;
            int i32 = this.f17335i;
            if (i32 % 3 != 0) {
            }
            if (i32 / 3 != 0) {
            }
            int i62 = this.f17341o;
            return new C1942ke(spannableStringBuilder, alignment22, f42, 0, i4, f32, i5, Float.MIN_VALUE, i62 != f17324x, i62, this.f17331e);
        }

        /* renamed from: d */
        public SpannableString m17012d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f17328b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f17342p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f17342p, length, 33);
                }
                if (this.f17343q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f17343q, length, 33);
                }
                if (this.f17344r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f17345s), this.f17344r, length, 33);
                }
                if (this.f17346t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f17347u), this.f17346t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void m17011e() {
            this.f17327a.clear();
            this.f17328b.clear();
            this.f17342p = -1;
            this.f17343q = -1;
            this.f17344r = -1;
            this.f17346t = -1;
            this.f17348v = 0;
        }

        /* renamed from: f */
        public void m17010f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f17329c = true;
            this.f17330d = z;
            this.f17337k = z2;
            this.f17331e = i;
            this.f17332f = z4;
            this.f17333g = i2;
            this.f17334h = i3;
            this.f17335i = i6;
            int i9 = i4 + 1;
            if (this.f17336j != i9) {
                this.f17336j = i9;
                while (true) {
                    if ((!z2 || this.f17327a.size() < this.f17336j) && this.f17327a.size() < 15) {
                        break;
                    }
                    this.f17327a.remove(0);
                }
            }
            if (i7 != 0 && this.f17339m != i7) {
                this.f17339m = i7;
                int i10 = i7 - 1;
                m16999q(f17319D[i10], f17325y, f17318C[i10], 0, f17316A[i10], f17317B[i10], f17326z[i10]);
            }
            if (i8 == 0 || this.f17340n == i8) {
                return;
            }
            this.f17340n = i8;
            int i11 = i8 - 1;
            m17003m(0, 1, 1, false, false, f17321F[i11], f17320E[i11]);
            m17002n(f17323w, f17322G[i11], f17324x);
        }

        /* renamed from: i */
        public boolean m17007i() {
            return this.f17329c;
        }

        /* renamed from: j */
        public boolean m17006j() {
            return !m17007i() || (this.f17327a.isEmpty() && this.f17328b.length() == 0);
        }

        /* renamed from: k */
        public boolean m17005k() {
            return this.f17330d;
        }

        /* renamed from: l */
        public void m17004l() {
            m17011e();
            this.f17329c = false;
            this.f17330d = false;
            this.f17331e = 4;
            this.f17332f = false;
            this.f17333g = 0;
            this.f17334h = 0;
            this.f17335i = 0;
            this.f17336j = 15;
            this.f17337k = true;
            this.f17338l = 0;
            this.f17339m = 0;
            this.f17340n = 0;
            int i = f17324x;
            this.f17341o = i;
            this.f17345s = f17323w;
            this.f17347u = i;
        }

        /* renamed from: m */
        public void m17003m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f17342p != -1) {
                if (!z) {
                    this.f17328b.setSpan(new StyleSpan(2), this.f17342p, this.f17328b.length(), 33);
                    this.f17342p = -1;
                }
            } else if (z) {
                this.f17342p = this.f17328b.length();
            }
            if (this.f17343q == -1) {
                if (z2) {
                    this.f17343q = this.f17328b.length();
                }
            } else if (z2) {
            } else {
                this.f17328b.setSpan(new UnderlineSpan(), this.f17343q, this.f17328b.length(), 33);
                this.f17343q = -1;
            }
        }

        /* renamed from: n */
        public void m17002n(int i, int i2, int i3) {
            if (this.f17344r != -1 && this.f17345s != i) {
                this.f17328b.setSpan(new ForegroundColorSpan(this.f17345s), this.f17344r, this.f17328b.length(), 33);
            }
            if (i != f17323w) {
                this.f17344r = this.f17328b.length();
                this.f17345s = i;
            }
            if (this.f17346t != -1 && this.f17347u != i2) {
                this.f17328b.setSpan(new BackgroundColorSpan(this.f17347u), this.f17346t, this.f17328b.length(), 33);
            }
            if (i2 != f17324x) {
                this.f17346t = this.f17328b.length();
                this.f17347u = i2;
            }
        }

        /* renamed from: o */
        public void m17001o(int i, int i2) {
            if (this.f17348v != i) {
                m17015a('\n');
            }
            this.f17348v = i;
        }

        /* renamed from: p */
        public void m17000p(boolean z) {
            this.f17330d = z;
        }

        /* renamed from: q */
        public void m16999q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f17341o = i;
            this.f17338l = i6;
        }
    }

    /* renamed from: com.daaw.le$b */
    /* loaded from: classes.dex */
    public static final class C2032b {

        /* renamed from: a */
        public final int f17349a;

        /* renamed from: b */
        public final int f17350b;

        /* renamed from: c */
        public final byte[] f17351c;

        /* renamed from: d */
        public int f17352d = 0;

        public C2032b(int i, int i2) {
            this.f17349a = i;
            this.f17350b = i2;
            this.f17351c = new byte[(i2 * 2) - 1];
        }
    }

    public C2030le(int i) {
        this.f17309i = i == -1 ? 1 : i;
        this.f17310j = new C2031a[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f17310j[i2] = new C2031a();
        }
        this.f17311k = this.f17310j[0];
        m17029D();
    }

    /* renamed from: A */
    public final void m17032A() {
        this.f17308h.m12118o(4);
        int m12125h = this.f17308h.m12125h(4);
        this.f17308h.m12118o(2);
        this.f17311k.m17001o(m12125h, this.f17308h.m12125h(6));
    }

    /* renamed from: B */
    public final void m17031B() {
        int m17008h = C2031a.m17008h(this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12125h(2));
        int m12125h = this.f17308h.m12125h(2);
        int m17009g = C2031a.m17009g(this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12125h(2));
        if (this.f17308h.m12126g()) {
            m12125h |= 4;
        }
        boolean m12126g = this.f17308h.m12126g();
        int m12125h2 = this.f17308h.m12125h(2);
        int m12125h3 = this.f17308h.m12125h(2);
        int m12125h4 = this.f17308h.m12125h(2);
        this.f17308h.m12118o(8);
        this.f17311k.m16999q(m17008h, m17009g, m12126g, m12125h, m12125h2, m12125h3, m12125h4);
    }

    /* renamed from: C */
    public final void m17030C() {
        StringBuilder sb;
        String str;
        C2032b c2032b = this.f17314n;
        int i = c2032b.f17352d;
        if (i != (c2032b.f17350b * 2) - 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((this.f17314n.f17350b * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(this.f17314n.f17352d);
            sb2.append(" (sequence number ");
            sb2.append(this.f17314n.f17349a);
            sb2.append("); ignoring packet");
            return;
        }
        this.f17308h.m12121l(c2032b.f17351c, i);
        int m12125h = this.f17308h.m12125h(3);
        int m12125h2 = this.f17308h.m12125h(5);
        if (m12125h == 7) {
            this.f17308h.m12118o(2);
            m12125h += this.f17308h.m12125h(6);
        }
        if (m12125h2 == 0) {
            if (m12125h != 0) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("serviceNumber is non-zero (");
                sb3.append(m12125h);
                sb3.append(") when blockSize is 0");
            }
        } else if (m12125h != this.f17309i) {
        } else {
            boolean z = false;
            while (this.f17308h.m12131b() > 0) {
                int m12125h3 = this.f17308h.m12125h(8);
                if (m12125h3 == 16) {
                    m12125h3 = this.f17308h.m12125h(8);
                    if (m12125h3 <= 31) {
                        m17024r(m12125h3);
                    } else {
                        if (m12125h3 <= 127) {
                            m17019w(m12125h3);
                        } else if (m12125h3 <= 159) {
                            m17023s(m12125h3);
                        } else if (m12125h3 <= 255) {
                            m17018x(m12125h3);
                        } else {
                            sb = new StringBuilder();
                            str = "Invalid extended command: ";
                            sb.append(str);
                            sb.append(m12125h3);
                        }
                        z = true;
                    }
                } else if (m12125h3 <= 31) {
                    m17026p(m12125h3);
                } else {
                    if (m12125h3 <= 127) {
                        m17021u(m12125h3);
                    } else if (m12125h3 <= 159) {
                        m17025q(m12125h3);
                    } else if (m12125h3 <= 255) {
                        m17020v(m12125h3);
                    } else {
                        sb = new StringBuilder();
                        str = "Invalid base command: ";
                        sb.append(str);
                        sb.append(m12125h3);
                    }
                    z = true;
                }
            }
            if (z) {
                this.f17312l = m17027o();
            }
        }
    }

    /* renamed from: D */
    public final void m17029D() {
        for (int i = 0; i < 8; i++) {
            this.f17310j[i].m17004l();
        }
    }

    @Override // com.daaw.AbstractC2168me, com.daaw.InterfaceC1211eq
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo16074a() {
        super.mo16074a();
    }

    @Override // com.daaw.AbstractC2168me, com.daaw.uh1
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo8184b(long j) {
        super.mo8184b(j);
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: f */
    public th1 mo16070f() {
        List<C2099ln> list = this.f17312l;
        this.f17313m = list;
        return new C2285ne(list);
    }

    @Override // com.daaw.AbstractC2168me, com.daaw.InterfaceC1211eq
    public void flush() {
        super.flush();
        this.f17312l = null;
        this.f17313m = null;
        this.f17315o = 0;
        this.f17311k = this.f17310j[0];
        m17029D();
        this.f17314n = null;
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: g */
    public void mo16069g(xh1 xh1Var) {
        this.f17307g.m10923H(xh1Var.f11565r.array(), xh1Var.f11565r.limit());
        while (this.f17307g.m10919a() >= 3) {
            int m10896x = this.f17307g.m10896x() & 7;
            int i = m10896x & 3;
            boolean z = (m10896x & 4) == 4;
            byte m10896x2 = (byte) this.f17307g.m10896x();
            byte m10896x3 = (byte) this.f17307g.m10896x();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m17028n();
                        int i2 = (m10896x2 & 192) >> 6;
                        int i3 = m10896x2 & 63;
                        if (i3 == 0) {
                            i3 = 64;
                        }
                        C2032b c2032b = new C2032b(i2, i3);
                        this.f17314n = c2032b;
                        byte[] bArr = c2032b.f17351c;
                        int i4 = c2032b.f17352d;
                        c2032b.f17352d = i4 + 1;
                        bArr[i4] = m10896x3;
                    } else {
                        C2914s6.m10690a(i == 2);
                        C2032b c2032b2 = this.f17314n;
                        if (c2032b2 != null) {
                            byte[] bArr2 = c2032b2.f17351c;
                            int i5 = c2032b2.f17352d;
                            int i6 = i5 + 1;
                            c2032b2.f17352d = i6;
                            bArr2[i5] = m10896x2;
                            c2032b2.f17352d = i6 + 1;
                            bArr2[i6] = m10896x3;
                        }
                    }
                    C2032b c2032b3 = this.f17314n;
                    if (c2032b3.f17352d == (c2032b3.f17350b * 2) - 1) {
                        m17028n();
                    }
                }
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
        return this.f17312l != this.f17313m;
    }

    @Override // com.daaw.AbstractC2168me
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void mo16065k(xh1 xh1Var) {
        super.mo16071e(xh1Var);
    }

    /* renamed from: n */
    public final void m17028n() {
        if (this.f17314n == null) {
            return;
        }
        m17030C();
        this.f17314n = null;
    }

    /* renamed from: o */
    public final List<C2099ln> m17027o() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f17310j[i].m17006j() && this.f17310j[i].m17005k()) {
                arrayList.add(this.f17310j[i].m17013c());
            }
        }
        Collections.sort(arrayList);
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: p */
    public final void m17026p(int i) {
        qv0 qv0Var;
        if (i != 0) {
            if (i == 3) {
                this.f17312l = m17027o();
                return;
            }
            int i2 = 8;
            if (i == 8) {
                this.f17311k.m17014b();
                return;
            }
            switch (i) {
                case 12:
                    m17029D();
                    return;
                case 13:
                    this.f17311k.m17015a('\n');
                    return;
                case 14:
                    return;
                default:
                    if (i >= 17 && i <= 23) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb.append(i);
                        qv0Var = this.f17308h;
                    } else if (i < 24 || i > 31) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid C0 command: ");
                        sb2.append(i);
                        return;
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Currently unsupported COMMAND_P16 Command: ");
                        sb3.append(i);
                        qv0Var = this.f17308h;
                        i2 = 16;
                    }
                    qv0Var.m12118o(i2);
                    return;
            }
        }
    }

    /* renamed from: q */
    public final void m17025q(int i) {
        C2031a c2031a;
        C2031a c2031a2;
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
                if (this.f17315o != i4) {
                    this.f17315o = i4;
                    c2031a = this.f17310j[i4];
                    this.f17311k = c2031a;
                    return;
                }
                return;
            case 136:
                while (i3 <= 8) {
                    if (this.f17308h.m12126g()) {
                        this.f17310j[8 - i3].m17011e();
                    }
                    i3++;
                }
                return;
            case 137:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f17308h.m12126g()) {
                        this.f17310j[8 - i5].m17000p(true);
                    }
                }
                return;
            case 138:
                while (i3 <= 8) {
                    if (this.f17308h.m12126g()) {
                        this.f17310j[8 - i3].m17000p(false);
                    }
                    i3++;
                }
                return;
            case 139:
                for (int i6 = 1; i6 <= 8; i6++) {
                    if (this.f17308h.m12126g()) {
                        this.f17310j[8 - i6].m17000p(!c2031a2.m17005k());
                    }
                }
                return;
            case 140:
                while (i3 <= 8) {
                    if (this.f17308h.m12126g()) {
                        this.f17310j[8 - i3].m17004l();
                    }
                    i3++;
                }
                return;
            case 141:
                this.f17308h.m12118o(8);
                return;
            case 142:
                return;
            case 143:
                m17029D();
                return;
            case 144:
                if (this.f17311k.m17007i()) {
                    m17017y();
                    return;
                }
                qv0Var = this.f17308h;
                qv0Var.m12118o(i2);
                return;
            case 145:
                if (this.f17311k.m17007i()) {
                    m17016z();
                    return;
                }
                qv0Var = this.f17308h;
                i2 = 24;
                qv0Var.m12118o(i2);
                return;
            case 146:
                if (this.f17311k.m17007i()) {
                    m17032A();
                    return;
                }
                qv0Var = this.f17308h;
                qv0Var.m12118o(i2);
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
                if (this.f17311k.m17007i()) {
                    m17031B();
                    return;
                }
                qv0Var = this.f17308h;
                i2 = 32;
                qv0Var.m12118o(i2);
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
                m17022t(i7);
                if (this.f17315o != i7) {
                    this.f17315o = i7;
                    c2031a = this.f17310j[i7];
                    this.f17311k = c2031a;
                    return;
                }
                return;
        }
    }

    /* renamed from: r */
    public final void m17024r(int i) {
        qv0 qv0Var;
        int i2;
        if (i <= 7) {
            return;
        }
        if (i <= 15) {
            qv0Var = this.f17308h;
            i2 = 8;
        } else if (i <= 23) {
            qv0Var = this.f17308h;
            i2 = 16;
        } else if (i > 31) {
            return;
        } else {
            qv0Var = this.f17308h;
            i2 = 24;
        }
        qv0Var.m12118o(i2);
    }

    /* renamed from: s */
    public final void m17023s(int i) {
        qv0 qv0Var;
        int i2;
        if (i <= 135) {
            qv0Var = this.f17308h;
            i2 = 32;
        } else if (i > 143) {
            if (i <= 159) {
                this.f17308h.m12118o(2);
                this.f17308h.m12118o(this.f17308h.m12125h(6) * 8);
                return;
            }
            return;
        } else {
            qv0Var = this.f17308h;
            i2 = 40;
        }
        qv0Var.m12118o(i2);
    }

    /* renamed from: t */
    public final void m17022t(int i) {
        C2031a c2031a = this.f17310j[i];
        this.f17308h.m12118o(2);
        boolean m12126g = this.f17308h.m12126g();
        boolean m12126g2 = this.f17308h.m12126g();
        boolean m12126g3 = this.f17308h.m12126g();
        int m12125h = this.f17308h.m12125h(3);
        boolean m12126g4 = this.f17308h.m12126g();
        int m12125h2 = this.f17308h.m12125h(7);
        int m12125h3 = this.f17308h.m12125h(8);
        int m12125h4 = this.f17308h.m12125h(4);
        int m12125h5 = this.f17308h.m12125h(4);
        this.f17308h.m12118o(2);
        int m12125h6 = this.f17308h.m12125h(6);
        this.f17308h.m12118o(2);
        c2031a.m17010f(m12126g, m12126g2, m12126g3, m12125h, m12126g4, m12125h2, m12125h3, m12125h5, m12125h6, m12125h4, this.f17308h.m12125h(3), this.f17308h.m12125h(3));
    }

    /* renamed from: u */
    public final void m17021u(int i) {
        if (i == 127) {
            this.f17311k.m17015a((char) 9835);
        } else {
            this.f17311k.m17015a((char) (i & 255));
        }
    }

    /* renamed from: v */
    public final void m17020v(int i) {
        this.f17311k.m17015a((char) (i & 255));
    }

    /* renamed from: w */
    public final void m17019w(int i) {
        C2031a c2031a;
        char c = ' ';
        if (i == 32) {
            c2031a = this.f17311k;
        } else if (i == 33) {
            c2031a = this.f17311k;
            c = 160;
        } else if (i == 37) {
            c2031a = this.f17311k;
            c = 8230;
        } else if (i == 42) {
            c2031a = this.f17311k;
            c = 352;
        } else if (i == 44) {
            c2031a = this.f17311k;
            c = 338;
        } else if (i == 63) {
            c2031a = this.f17311k;
            c = 376;
        } else if (i == 57) {
            c2031a = this.f17311k;
            c = 8482;
        } else if (i == 58) {
            c2031a = this.f17311k;
            c = 353;
        } else if (i == 60) {
            c2031a = this.f17311k;
            c = 339;
        } else if (i != 61) {
            switch (i) {
                case 48:
                    c2031a = this.f17311k;
                    c = 9608;
                    break;
                case 49:
                    c2031a = this.f17311k;
                    c = 8216;
                    break;
                case 50:
                    c2031a = this.f17311k;
                    c = 8217;
                    break;
                case 51:
                    c2031a = this.f17311k;
                    c = 8220;
                    break;
                case 52:
                    c2031a = this.f17311k;
                    c = 8221;
                    break;
                case 53:
                    c2031a = this.f17311k;
                    c = 8226;
                    break;
                default:
                    switch (i) {
                        case x21.f31779E0 /* 118 */:
                            c2031a = this.f17311k;
                            c = 8539;
                            break;
                        case x21.f31784F0 /* 119 */:
                            c2031a = this.f17311k;
                            c = 8540;
                            break;
                        case x21.f31789G0 /* 120 */:
                            c2031a = this.f17311k;
                            c = 8541;
                            break;
                        case x21.f31794H0 /* 121 */:
                            c2031a = this.f17311k;
                            c = 8542;
                            break;
                        case x21.f31799I0 /* 122 */:
                            c2031a = this.f17311k;
                            c = 9474;
                            break;
                        case x21.f31804J0 /* 123 */:
                            c2031a = this.f17311k;
                            c = 9488;
                            break;
                        case x21.f31809K0 /* 124 */:
                            c2031a = this.f17311k;
                            c = 9492;
                            break;
                        case x21.f31814L0 /* 125 */:
                            c2031a = this.f17311k;
                            c = 9472;
                            break;
                        case x21.f31819M0 /* 126 */:
                            c2031a = this.f17311k;
                            c = 9496;
                            break;
                        case 127:
                            c2031a = this.f17311k;
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
            c2031a = this.f17311k;
            c = 8480;
        }
        c2031a.m17015a(c);
    }

    /* renamed from: x */
    public final void m17018x(int i) {
        C2031a c2031a;
        char c;
        if (i == 160) {
            c2031a = this.f17311k;
            c = 13252;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid G3 character: ");
            sb.append(i);
            c2031a = this.f17311k;
            c = '_';
        }
        c2031a.m17015a(c);
    }

    /* renamed from: y */
    public final void m17017y() {
        this.f17311k.m17003m(this.f17308h.m12125h(4), this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12126g(), this.f17308h.m12126g(), this.f17308h.m12125h(3), this.f17308h.m12125h(3));
    }

    /* renamed from: z */
    public final void m17016z() {
        int m17008h = C2031a.m17008h(this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12125h(2));
        int m17008h2 = C2031a.m17008h(this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12125h(2));
        this.f17308h.m12118o(2);
        this.f17311k.m17002n(m17008h, m17008h2, C2031a.m17009g(this.f17308h.m12125h(2), this.f17308h.m12125h(2), this.f17308h.m12125h(2)));
    }
}
