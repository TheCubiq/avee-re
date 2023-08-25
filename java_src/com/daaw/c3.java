package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class c3 {
    public int a;
    public int b;
    public int d;
    public OutputStream h;
    public Bitmap i;
    public byte[] j;
    public byte[] k;
    public int l;
    public byte[] m;
    public boolean u;
    public Integer c = null;
    public int e = -1;
    public int f = 0;
    public boolean g = false;
    public boolean[] n = new boolean[256];
    public int o = 7;
    public int p = -1;
    public boolean q = false;
    public boolean r = true;
    public boolean s = false;
    public int t = 10;

    public boolean a(Bitmap bitmap) {
        if (bitmap == null || !this.g) {
            return false;
        }
        try {
            if (!this.s) {
                g(bitmap.getWidth(), bitmap.getHeight());
            }
            this.i = bitmap;
            e();
            b();
            if (this.r) {
                k();
                m();
                if (this.e >= 0) {
                    l();
                }
            }
            i();
            j();
            if (!this.r) {
                m();
            }
            n();
            this.r = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b() {
        byte[] bArr = this.j;
        int length = bArr.length;
        int i = length / 3;
        this.k = new byte[i];
        ss0 ss0Var = new ss0(bArr, length, this.t);
        this.m = ss0Var.h();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = this.m;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i3];
            int i4 = i3 + 2;
            bArr2[i3] = bArr2[i4];
            bArr2[i4] = b;
            this.n[i3 / 3] = false;
            i3 += 3;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            byte[] bArr3 = this.j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int g = ss0Var.g(bArr3[i6] & 255, bArr3[i7] & 255, bArr3[i8] & 255);
            this.n[g] = true;
            this.k[i5] = (byte) g;
            i5++;
            i6 = i8 + 1;
        }
        this.j = null;
        this.l = 8;
        this.o = 7;
        Integer num = this.c;
        if (num != null) {
            i2 = num.intValue();
        } else if (!this.u) {
            return;
        }
        this.d = c(i2);
    }

    public final int c(int i) {
        if (this.m == null) {
            return -1;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int i2 = 16777216;
        int length = this.m.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte[] bArr = this.m;
            int i5 = i3 + 1;
            int i6 = red - (bArr[i3] & 255);
            int i7 = i5 + 1;
            int i8 = green - (bArr[i5] & 255);
            int i9 = blue - (bArr[i7] & 255);
            int i10 = (i6 * i6) + (i8 * i8) + (i9 * i9);
            int i11 = i7 / 3;
            if (this.n[i11] && i10 < i2) {
                i2 = i10;
                i4 = i11;
            }
            i3 = i7 + 1;
        }
        return i4;
    }

    public boolean d() {
        boolean z;
        if (this.g) {
            this.g = false;
            try {
                this.h.write(59);
                this.h.flush();
                if (this.q) {
                    this.h.close();
                }
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            this.d = 0;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = null;
            this.m = null;
            this.q = false;
            this.r = true;
            return z;
        }
        return false;
    }

    public final void e() {
        int width = this.i.getWidth();
        int height = this.i.getHeight();
        int i = this.a;
        if (width != i || height != this.b) {
            Bitmap createBitmap = Bitmap.createBitmap(i, this.b, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            this.i = createBitmap;
        }
        int i2 = width * height;
        int[] iArr = new int[i2];
        this.i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.j = new byte[i2 * 3];
        this.u = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = iArr[i3];
            if (i6 == 0) {
                i4++;
            }
            byte[] bArr = this.j;
            int i7 = i5 + 1;
            bArr[i5] = (byte) (i6 & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((i6 >> 8) & 255);
            bArr[i8] = (byte) ((i6 >> 16) & 255);
            i3++;
            i5 = i8 + 1;
        }
        double d = i4 * 100;
        double d2 = i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        this.u = d3 > 4.0d;
        if (Log.isLoggable("AnimatedGifEncoder", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("got pixels for frame with ");
            sb.append(d3);
            sb.append("% transparent pixels");
        }
    }

    public void f(int i) {
        this.f = Math.round(i / 10.0f);
    }

    public void g(int i, int i2) {
        if (!this.g || this.r) {
            this.a = i;
            this.b = i2;
            if (i < 1) {
                this.a = 320;
            }
            if (i2 < 1) {
                this.b = 240;
            }
            this.s = true;
        }
    }

    public boolean h(OutputStream outputStream) {
        boolean z = false;
        if (outputStream == null) {
            return false;
        }
        this.q = false;
        this.h = outputStream;
        try {
            p("GIF89a");
            z = true;
        } catch (IOException unused) {
        }
        this.g = z;
        return z;
    }

    public final void i() {
        int i;
        int i2;
        this.h.write(33);
        this.h.write(249);
        this.h.write(4);
        if (this.c != null || this.u) {
            i = 1;
            i2 = 2;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = this.p;
        if (i3 >= 0) {
            i2 = i3 & 7;
        }
        this.h.write(i | (i2 << 2) | 0 | 0);
        o(this.f);
        this.h.write(this.d);
        this.h.write(0);
    }

    public final void j() {
        this.h.write(44);
        o(0);
        o(0);
        o(this.a);
        o(this.b);
        if (this.r) {
            this.h.write(0);
        } else {
            this.h.write(this.o | 128);
        }
    }

    public final void k() {
        o(this.a);
        o(this.b);
        this.h.write(this.o | 240);
        this.h.write(0);
        this.h.write(0);
    }

    public final void l() {
        this.h.write(33);
        this.h.write(255);
        this.h.write(11);
        p("NETSCAPE2.0");
        this.h.write(3);
        this.h.write(1);
        o(this.e);
        this.h.write(0);
    }

    public final void m() {
        OutputStream outputStream = this.h;
        byte[] bArr = this.m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.m.length;
        for (int i = 0; i < length; i++) {
            this.h.write(0);
        }
    }

    public final void n() {
        new ri0(this.a, this.b, this.k, this.l).f(this.h);
    }

    public final void o(int i) {
        this.h.write(i & 255);
        this.h.write((i >> 8) & 255);
    }

    public final void p(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.h.write((byte) str.charAt(i));
        }
    }
}
