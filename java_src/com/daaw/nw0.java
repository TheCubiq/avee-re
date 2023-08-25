package com.daaw;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* loaded from: classes.dex */
public final class nw0 extends jd1 {
    public final rv0 o;
    public final a p;
    public Inflater q;
    public byte[] r;
    public int s;

    /* loaded from: classes.dex */
    public static final class a {
        public final rv0 a = new rv0();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public ln d() {
            int i;
            if (this.d == 0 || this.e == 0 || this.h == 0 || this.i == 0 || this.a.d() == 0 || this.a.c() != this.a.d() || !this.c) {
                return null;
            }
            this.a.J(0);
            int i2 = this.h * this.i;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int x = this.a.x();
                if (x != 0) {
                    i = i3 + 1;
                    iArr[i3] = this.b[x];
                } else {
                    int x2 = this.a.x();
                    if (x2 != 0) {
                        i = ((x2 & 64) == 0 ? x2 & 63 : ((x2 & 63) << 8) | this.a.x()) + i3;
                        Arrays.fill(iArr, i3, i, (x2 & 128) == 0 ? 0 : this.b[this.a.x()]);
                    }
                }
                i3 = i;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.h, this.i, Bitmap.Config.ARGB_8888);
            int i4 = this.d;
            float f = this.f / i4;
            int i5 = this.e;
            return new ln(createBitmap, f, 0, this.g / i5, 0, this.h / i4, this.i / i5);
        }

        public final void e(rv0 rv0Var, int i) {
            int A;
            if (i < 4) {
                return;
            }
            rv0Var.K(3);
            int i2 = i - 4;
            if ((rv0Var.x() & 128) != 0) {
                if (i2 < 7 || (A = rv0Var.A()) < 4) {
                    return;
                }
                this.h = rv0Var.D();
                this.i = rv0Var.D();
                this.a.G(A - 4);
                i2 -= 7;
            }
            int c = this.a.c();
            int d = this.a.d();
            if (c >= d || i2 <= 0) {
                return;
            }
            int min = Math.min(i2, d - c);
            rv0Var.g(this.a.a, c, min);
            this.a.J(c + min);
        }

        public final void f(rv0 rv0Var, int i) {
            if (i < 19) {
                return;
            }
            this.d = rv0Var.D();
            this.e = rv0Var.D();
            rv0Var.K(11);
            this.f = rv0Var.D();
            this.g = rv0Var.D();
        }

        public final void g(rv0 rv0Var, int i) {
            if (i % 5 != 2) {
                return;
            }
            rv0Var.K(2);
            Arrays.fill(this.b, 0);
            int i2 = i / 5;
            int i3 = 0;
            while (i3 < i2) {
                int x = rv0Var.x();
                int x2 = rv0Var.x();
                int x3 = rv0Var.x();
                int x4 = rv0Var.x();
                int x5 = rv0Var.x();
                double d = x2;
                double d2 = x3 - 128;
                Double.isNaN(d2);
                Double.isNaN(d);
                int i4 = i3;
                double d3 = x4 - 128;
                Double.isNaN(d3);
                Double.isNaN(d);
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d);
                this.b[x] = sq1.l((int) (d + (d3 * 1.772d)), 0, 255) | (sq1.l((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (x5 << 24) | (sq1.l((int) ((1.402d * d2) + d), 0, 255) << 16);
                i3 = i4 + 1;
            }
            this.c = true;
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.G(0);
            this.c = false;
        }
    }

    public nw0() {
        super("PgsDecoder");
        this.o = new rv0();
        this.p = new a();
    }

    public static ln D(rv0 rv0Var, a aVar) {
        int d = rv0Var.d();
        int x = rv0Var.x();
        int D = rv0Var.D();
        int c = rv0Var.c() + D;
        ln lnVar = null;
        if (c > d) {
            rv0Var.J(d);
            return null;
        }
        if (x != 128) {
            switch (x) {
                case 20:
                    aVar.g(rv0Var, D);
                    break;
                case 21:
                    aVar.e(rv0Var, D);
                    break;
                case 22:
                    aVar.f(rv0Var, D);
                    break;
            }
        } else {
            lnVar = aVar.d();
            aVar.h();
        }
        rv0Var.J(c);
        return lnVar;
    }

    public final boolean C(byte[] bArr, int i) {
        if (i != 0 && bArr[0] == 120) {
            if (this.q == null) {
                this.q = new Inflater();
                this.r = new byte[i];
            }
            this.s = 0;
            this.q.setInput(bArr, 0, i);
            while (!this.q.finished() && !this.q.needsDictionary() && !this.q.needsInput()) {
                try {
                    int i2 = this.s;
                    byte[] bArr2 = this.r;
                    if (i2 == bArr2.length) {
                        this.r = Arrays.copyOf(bArr2, bArr2.length * 2);
                    }
                    int i3 = this.s;
                    Inflater inflater = this.q;
                    byte[] bArr3 = this.r;
                    this.s = i3 + inflater.inflate(bArr3, i3, bArr3.length - i3);
                } catch (DataFormatException unused) {
                } finally {
                    this.q.reset();
                }
            }
            return this.q.finished();
        }
        return false;
    }

    @Override // com.daaw.jd1
    public th1 z(byte[] bArr, int i, boolean z) {
        if (C(bArr, i)) {
            this.o.H(this.r, this.s);
        } else {
            this.o.H(bArr, i);
        }
        this.p.h();
        ArrayList arrayList = new ArrayList();
        while (this.o.a() >= 3) {
            ln D = D(this.o, this.p);
            if (D != null) {
                arrayList.add(D);
            }
        }
        return new ow0(Collections.unmodifiableList(arrayList));
    }
}
