package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import java.io.IOException;
import java.io.OutputStream;
/* renamed from: com.daaw.c3 */
/* loaded from: classes.dex */
public class C0912c3 {

    /* renamed from: a */
    public int f5410a;

    /* renamed from: b */
    public int f5411b;

    /* renamed from: d */
    public int f5413d;

    /* renamed from: h */
    public OutputStream f5417h;

    /* renamed from: i */
    public Bitmap f5418i;

    /* renamed from: j */
    public byte[] f5419j;

    /* renamed from: k */
    public byte[] f5420k;

    /* renamed from: l */
    public int f5421l;

    /* renamed from: m */
    public byte[] f5422m;

    /* renamed from: u */
    public boolean f5430u;

    /* renamed from: c */
    public Integer f5412c = null;

    /* renamed from: e */
    public int f5414e = -1;

    /* renamed from: f */
    public int f5415f = 0;

    /* renamed from: g */
    public boolean f5416g = false;

    /* renamed from: n */
    public boolean[] f5423n = new boolean[256];

    /* renamed from: o */
    public int f5424o = 7;

    /* renamed from: p */
    public int f5425p = -1;

    /* renamed from: q */
    public boolean f5426q = false;

    /* renamed from: r */
    public boolean f5427r = true;

    /* renamed from: s */
    public boolean f5428s = false;

    /* renamed from: t */
    public int f5429t = 10;

    /* renamed from: a */
    public boolean m25669a(Bitmap bitmap) {
        if (bitmap == null || !this.f5416g) {
            return false;
        }
        try {
            if (!this.f5428s) {
                m25663g(bitmap.getWidth(), bitmap.getHeight());
            }
            this.f5418i = bitmap;
            m25665e();
            m25668b();
            if (this.f5427r) {
                m25659k();
                m25657m();
                if (this.f5414e >= 0) {
                    m25658l();
                }
            }
            m25661i();
            m25660j();
            if (!this.f5427r) {
                m25657m();
            }
            m25656n();
            this.f5427r = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final void m25668b() {
        byte[] bArr = this.f5419j;
        int length = bArr.length;
        int i = length / 3;
        this.f5420k = new byte[i];
        ss0 ss0Var = new ss0(bArr, length, this.f5429t);
        this.f5422m = ss0Var.m9924h();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr2 = this.f5422m;
            if (i3 >= bArr2.length) {
                break;
            }
            byte b = bArr2[i3];
            int i4 = i3 + 2;
            bArr2[i3] = bArr2[i4];
            bArr2[i4] = b;
            this.f5423n[i3 / 3] = false;
            i3 += 3;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            byte[] bArr3 = this.f5419j;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int m9925g = ss0Var.m9925g(bArr3[i6] & 255, bArr3[i7] & 255, bArr3[i8] & 255);
            this.f5423n[m9925g] = true;
            this.f5420k[i5] = (byte) m9925g;
            i5++;
            i6 = i8 + 1;
        }
        this.f5419j = null;
        this.f5421l = 8;
        this.f5424o = 7;
        Integer num = this.f5412c;
        if (num != null) {
            i2 = num.intValue();
        } else if (!this.f5430u) {
            return;
        }
        this.f5413d = m25667c(i2);
    }

    /* renamed from: c */
    public final int m25667c(int i) {
        if (this.f5422m == null) {
            return -1;
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int i2 = 16777216;
        int length = this.f5422m.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            byte[] bArr = this.f5422m;
            int i5 = i3 + 1;
            int i6 = red - (bArr[i3] & 255);
            int i7 = i5 + 1;
            int i8 = green - (bArr[i5] & 255);
            int i9 = blue - (bArr[i7] & 255);
            int i10 = (i6 * i6) + (i8 * i8) + (i9 * i9);
            int i11 = i7 / 3;
            if (this.f5423n[i11] && i10 < i2) {
                i2 = i10;
                i4 = i11;
            }
            i3 = i7 + 1;
        }
        return i4;
    }

    /* renamed from: d */
    public boolean m25666d() {
        boolean z;
        if (this.f5416g) {
            this.f5416g = false;
            try {
                this.f5417h.write(59);
                this.f5417h.flush();
                if (this.f5426q) {
                    this.f5417h.close();
                }
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            this.f5413d = 0;
            this.f5417h = null;
            this.f5418i = null;
            this.f5419j = null;
            this.f5420k = null;
            this.f5422m = null;
            this.f5426q = false;
            this.f5427r = true;
            return z;
        }
        return false;
    }

    /* renamed from: e */
    public final void m25665e() {
        int width = this.f5418i.getWidth();
        int height = this.f5418i.getHeight();
        int i = this.f5410a;
        if (width != i || height != this.f5411b) {
            Bitmap createBitmap = Bitmap.createBitmap(i, this.f5411b, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            this.f5418i = createBitmap;
        }
        int i2 = width * height;
        int[] iArr = new int[i2];
        this.f5418i.getPixels(iArr, 0, width, 0, 0, width, height);
        this.f5419j = new byte[i2 * 3];
        this.f5430u = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = iArr[i3];
            if (i6 == 0) {
                i4++;
            }
            byte[] bArr = this.f5419j;
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
        this.f5430u = d3 > 4.0d;
        if (Log.isLoggable("AnimatedGifEncoder", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("got pixels for frame with ");
            sb.append(d3);
            sb.append("% transparent pixels");
        }
    }

    /* renamed from: f */
    public void m25664f(int i) {
        this.f5415f = Math.round(i / 10.0f);
    }

    /* renamed from: g */
    public void m25663g(int i, int i2) {
        if (!this.f5416g || this.f5427r) {
            this.f5410a = i;
            this.f5411b = i2;
            if (i < 1) {
                this.f5410a = 320;
            }
            if (i2 < 1) {
                this.f5411b = 240;
            }
            this.f5428s = true;
        }
    }

    /* renamed from: h */
    public boolean m25662h(OutputStream outputStream) {
        boolean z = false;
        if (outputStream == null) {
            return false;
        }
        this.f5426q = false;
        this.f5417h = outputStream;
        try {
            m25654p("GIF89a");
            z = true;
        } catch (IOException unused) {
        }
        this.f5416g = z;
        return z;
    }

    /* renamed from: i */
    public final void m25661i() {
        int i;
        int i2;
        this.f5417h.write(33);
        this.f5417h.write(249);
        this.f5417h.write(4);
        if (this.f5412c != null || this.f5430u) {
            i = 1;
            i2 = 2;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = this.f5425p;
        if (i3 >= 0) {
            i2 = i3 & 7;
        }
        this.f5417h.write(i | (i2 << 2) | 0 | 0);
        m25655o(this.f5415f);
        this.f5417h.write(this.f5413d);
        this.f5417h.write(0);
    }

    /* renamed from: j */
    public final void m25660j() {
        this.f5417h.write(44);
        m25655o(0);
        m25655o(0);
        m25655o(this.f5410a);
        m25655o(this.f5411b);
        if (this.f5427r) {
            this.f5417h.write(0);
        } else {
            this.f5417h.write(this.f5424o | 128);
        }
    }

    /* renamed from: k */
    public final void m25659k() {
        m25655o(this.f5410a);
        m25655o(this.f5411b);
        this.f5417h.write(this.f5424o | 240);
        this.f5417h.write(0);
        this.f5417h.write(0);
    }

    /* renamed from: l */
    public final void m25658l() {
        this.f5417h.write(33);
        this.f5417h.write(255);
        this.f5417h.write(11);
        m25654p("NETSCAPE2.0");
        this.f5417h.write(3);
        this.f5417h.write(1);
        m25655o(this.f5414e);
        this.f5417h.write(0);
    }

    /* renamed from: m */
    public final void m25657m() {
        OutputStream outputStream = this.f5417h;
        byte[] bArr = this.f5422m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.f5422m.length;
        for (int i = 0; i < length; i++) {
            this.f5417h.write(0);
        }
    }

    /* renamed from: n */
    public final void m25656n() {
        new ri0(this.f5410a, this.f5411b, this.f5420k, this.f5421l).m11291f(this.f5417h);
    }

    /* renamed from: o */
    public final void m25655o(int i) {
        this.f5417h.write(i & 255);
        this.f5417h.write((i >> 8) & 255);
    }

    /* renamed from: p */
    public final void m25654p(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.f5417h.write((byte) str.charAt(i));
        }
    }
}
