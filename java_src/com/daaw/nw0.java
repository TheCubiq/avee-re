package com.daaw;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class nw0 extends jd1 {

    /* renamed from: o */
    public final rv0 f20766o;

    /* renamed from: p */
    public final C2372a f20767p;

    /* renamed from: q */
    public Inflater f20768q;

    /* renamed from: r */
    public byte[] f20769r;

    /* renamed from: s */
    public int f20770s;

    /* renamed from: com.daaw.nw0$a */
    /* loaded from: classes.dex */
    public static final class C2372a {

        /* renamed from: a */
        public final rv0 f20771a = new rv0();

        /* renamed from: b */
        public final int[] f20772b = new int[256];

        /* renamed from: c */
        public boolean f20773c;

        /* renamed from: d */
        public int f20774d;

        /* renamed from: e */
        public int f20775e;

        /* renamed from: f */
        public int f20776f;

        /* renamed from: g */
        public int f20777g;

        /* renamed from: h */
        public int f20778h;

        /* renamed from: i */
        public int f20779i;

        /* renamed from: d */
        public C2099ln m14766d() {
            int i;
            if (this.f20774d == 0 || this.f20775e == 0 || this.f20778h == 0 || this.f20779i == 0 || this.f20771a.m10916d() == 0 || this.f20771a.m10917c() != this.f20771a.m10916d() || !this.f20773c) {
                return null;
            }
            this.f20771a.m10921J(0);
            int i2 = this.f20778h * this.f20779i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int m10896x = this.f20771a.m10896x();
                if (m10896x != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.f20772b[m10896x];
                } else {
                    int m10896x2 = this.f20771a.m10896x();
                    if (m10896x2 != 0) {
                        i = ((m10896x2 & 64) == 0 ? m10896x2 & 63 : ((m10896x2 & 63) << 8) | this.f20771a.m10896x()) + i3;
                        Arrays.fill(iArr, i3, i, (m10896x2 & 128) == 0 ? 0 : this.f20772b[this.f20771a.m10896x()]);
                    }
                }
                i3 = i;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f20778h, this.f20779i, Bitmap.Config.ARGB_8888);
            int i4 = this.f20774d;
            float f = this.f20776f / i4;
            int i5 = this.f20775e;
            return new C2099ln(createBitmap, f, 0, this.f20777g / i5, 0, this.f20778h / i4, this.f20779i / i5);
        }

        /* renamed from: e */
        public final void m14765e(rv0 rv0Var, int i) {
            int m10930A;
            if (i < 4) {
                return;
            }
            rv0Var.m10920K(3);
            int i2 = i - 4;
            if ((rv0Var.m10896x() & 128) != 0) {
                if (i2 < 7 || (m10930A = rv0Var.m10930A()) < 4) {
                    return;
                }
                this.f20778h = rv0Var.m10927D();
                this.f20779i = rv0Var.m10927D();
                this.f20771a.m10924G(m10930A - 4);
                i2 -= 7;
            }
            int m10917c = this.f20771a.m10917c();
            int m10916d = this.f20771a.m10916d();
            if (m10917c >= m10916d || i2 <= 0) {
                return;
            }
            int min = Math.min(i2, m10916d - m10917c);
            rv0Var.m10913g(this.f20771a.f25637a, m10917c, min);
            this.f20771a.m10921J(m10917c + min);
        }

        /* renamed from: f */
        public final void m14764f(rv0 rv0Var, int i) {
            if (i < 19) {
                return;
            }
            this.f20774d = rv0Var.m10927D();
            this.f20775e = rv0Var.m10927D();
            rv0Var.m10920K(11);
            this.f20776f = rv0Var.m10927D();
            this.f20777g = rv0Var.m10927D();
        }

        /* renamed from: g */
        public final void m14763g(rv0 rv0Var, int i) {
            if (i % 5 != 2) {
                return;
            }
            rv0Var.m10920K(2);
            Arrays.fill(this.f20772b, 0);
            int i2 = i / 5;
            int i3 = 0;
            while (i3 < i2) {
                int m10896x = rv0Var.m10896x();
                int m10896x2 = rv0Var.m10896x();
                int m10896x3 = rv0Var.m10896x();
                int m10896x4 = rv0Var.m10896x();
                int m10896x5 = rv0Var.m10896x();
                double d = m10896x2;
                double d2 = m10896x3 - 128;
                Double.isNaN(d2);
                Double.isNaN(d);
                int i4 = i3;
                double d3 = m10896x4 - 128;
                Double.isNaN(d3);
                Double.isNaN(d);
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d);
                this.f20772b[m10896x] = sq1.m10004l((int) (d + (d3 * 1.772d)), 0, 255) | (sq1.m10004l((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (m10896x5 << 24) | (sq1.m10004l((int) ((1.402d * d2) + d), 0, 255) << 16);
                i3 = i4 + 1;
            }
            this.f20773c = true;
        }

        /* renamed from: h */
        public void m14762h() {
            this.f20774d = 0;
            this.f20775e = 0;
            this.f20776f = 0;
            this.f20777g = 0;
            this.f20778h = 0;
            this.f20779i = 0;
            this.f20771a.m10924G(0);
            this.f20773c = false;
        }
    }

    public nw0() {
        super("PgsDecoder");
        this.f20766o = new rv0();
        this.f20767p = new C2372a();
    }

    /* renamed from: D */
    public static C2099ln m14770D(rv0 rv0Var, C2372a c2372a) {
        int m10916d = rv0Var.m10916d();
        int m10896x = rv0Var.m10896x();
        int m10927D = rv0Var.m10927D();
        int m10917c = rv0Var.m10917c() + m10927D;
        C2099ln c2099ln = null;
        if (m10917c > m10916d) {
            rv0Var.m10921J(m10916d);
            return null;
        }
        if (m10896x != 128) {
            switch (m10896x) {
                case 20:
                    c2372a.m14763g(rv0Var, m10927D);
                    break;
                case 21:
                    c2372a.m14765e(rv0Var, m10927D);
                    break;
                case 22:
                    c2372a.m14764f(rv0Var, m10927D);
                    break;
            }
        } else {
            c2099ln = c2372a.m14766d();
            c2372a.m14762h();
        }
        rv0Var.m10921J(m10917c);
        return c2099ln;
    }

    /* renamed from: C */
    public final boolean m14771C(byte[] bArr, int i) {
        if (i != 0 && bArr[0] == 120) {
            if (this.f20768q == null) {
                this.f20768q = new Inflater();
                this.f20769r = new byte[i];
            }
            this.f20770s = 0;
            this.f20768q.setInput(bArr, 0, i);
            while (!this.f20768q.finished() && !this.f20768q.needsDictionary() && !this.f20768q.needsInput()) {
                try {
                    int i2 = this.f20770s;
                    byte[] bArr2 = this.f20769r;
                    if (i2 == bArr2.length) {
                        this.f20769r = Arrays.copyOf(bArr2, bArr2.length * 2);
                    }
                    int i3 = this.f20770s;
                    Inflater inflater = this.f20768q;
                    byte[] bArr3 = this.f20769r;
                    this.f20770s = i3 + inflater.inflate(bArr3, i3, bArr3.length - i3);
                } catch (DataFormatException unused) {
                } finally {
                    this.f20768q.reset();
                }
            }
            return this.f20768q.finished();
        }
        return false;
    }

    @Override // com.daaw.jd1
    /* renamed from: z */
    public th1 mo5845z(byte[] bArr, int i, boolean z) {
        if (m14771C(bArr, i)) {
            this.f20766o.m10923H(this.f20769r, this.f20770s);
        } else {
            this.f20766o.m10923H(bArr, i);
        }
        this.f20767p.m14762h();
        ArrayList arrayList = new ArrayList();
        while (this.f20766o.m10919a() >= 3) {
            C2099ln m14770D = m14770D(this.f20766o, this.f20767p);
            if (m14770D != null) {
                arrayList.add(m14770D);
            }
        }
        return new ow0(Collections.unmodifiableList(arrayList));
    }
}
