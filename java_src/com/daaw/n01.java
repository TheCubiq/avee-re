package com.daaw;

import com.daaw.m01;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
/* loaded from: classes2.dex */
public class n01 implements e10 {
    public static final Charset d = Charset.forName("UTF-8");
    public final File a;
    public final int b;
    public m01 c;

    /* loaded from: classes2.dex */
    public class a implements m01.d {
        public final /* synthetic */ byte[] a;
        public final /* synthetic */ int[] b;

        public a(byte[] bArr, int[] iArr) {
            this.a = bArr;
            this.b = iArr;
        }

        @Override // com.daaw.m01.d
        public void a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.a, this.b[0], i);
                int[] iArr = this.b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {
        public final byte[] a;
        public final int b;

        public b(byte[] bArr, int i) {
            this.a = bArr;
            this.b = i;
        }
    }

    public n01(File file, int i) {
        this.a = file;
        this.b = i;
    }

    @Override // com.daaw.e10
    public void a() {
        fh.e(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override // com.daaw.e10
    public String b() {
        byte[] c = c();
        if (c != null) {
            return new String(c, d);
        }
        return null;
    }

    @Override // com.daaw.e10
    public byte[] c() {
        b g = g();
        if (g == null) {
            return null;
        }
        int i = g.b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.daaw.e10
    public void d() {
        a();
        this.a.delete();
    }

    @Override // com.daaw.e10
    public void e(long j, String str) {
        h();
        f(j, str);
    }

    public final void f(long j, String str) {
        int i;
        if (this.c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.b / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.c.w(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(d));
            while (!this.c.P() && this.c.c0() > this.b) {
                this.c.Y();
            }
        } catch (IOException e) {
            ml0.f().e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    public final b g() {
        if (this.a.exists()) {
            h();
            m01 m01Var = this.c;
            if (m01Var == null) {
                return null;
            }
            int[] iArr = {0};
            byte[] bArr = new byte[m01Var.c0()];
            try {
                this.c.L(new a(bArr, iArr));
            } catch (IOException e) {
                ml0.f().e("A problem occurred while reading the Crashlytics log file.", e);
            }
            return new b(bArr, iArr[0]);
        }
        return null;
    }

    public final void h() {
        if (this.c == null) {
            try {
                this.c = new m01(this.a);
            } catch (IOException e) {
                ml0 f = ml0.f();
                f.e("Could not open log file: " + this.a, e);
            }
        }
    }
}
