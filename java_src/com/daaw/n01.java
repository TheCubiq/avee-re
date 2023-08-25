package com.daaw;

import com.daaw.m01;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
/* loaded from: classes2.dex */
public class n01 implements e10 {

    /* renamed from: d */
    public static final Charset f19317d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f19318a;

    /* renamed from: b */
    public final int f19319b;

    /* renamed from: c */
    public m01 f19320c;

    /* renamed from: com.daaw.n01$a */
    /* loaded from: classes2.dex */
    public class C2230a implements m01.InterfaceC2144d {

        /* renamed from: a */
        public final /* synthetic */ byte[] f19321a;

        /* renamed from: b */
        public final /* synthetic */ int[] f19322b;

        public C2230a(byte[] bArr, int[] iArr) {
            this.f19321a = bArr;
            this.f19322b = iArr;
        }

        @Override // com.daaw.m01.InterfaceC2144d
        /* renamed from: a */
        public void mo15613a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f19321a, this.f19322b[0], i);
                int[] iArr = this.f19322b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.daaw.n01$b */
    /* loaded from: classes2.dex */
    public static class C2231b {

        /* renamed from: a */
        public final byte[] f19324a;

        /* renamed from: b */
        public final int f19325b;

        public C2231b(byte[] bArr, int i) {
            this.f19324a = bArr;
            this.f19325b = i;
        }
    }

    public n01(File file, int i) {
        this.f19318a = file;
        this.f19319b = i;
    }

    @Override // com.daaw.e10
    /* renamed from: a */
    public void mo15621a() {
        C1279fh.m22662e(this.f19320c, "There was a problem closing the Crashlytics log file.");
        this.f19320c = null;
    }

    @Override // com.daaw.e10
    /* renamed from: b */
    public String mo15620b() {
        byte[] mo15619c = mo15619c();
        if (mo15619c != null) {
            return new String(mo15619c, f19317d);
        }
        return null;
    }

    @Override // com.daaw.e10
    /* renamed from: c */
    public byte[] mo15619c() {
        C2231b m15615g = m15615g();
        if (m15615g == null) {
            return null;
        }
        int i = m15615g.f19325b;
        byte[] bArr = new byte[i];
        System.arraycopy(m15615g.f19324a, 0, bArr, 0, i);
        return bArr;
    }

    @Override // com.daaw.e10
    /* renamed from: d */
    public void mo15618d() {
        mo15621a();
        this.f19318a.delete();
    }

    @Override // com.daaw.e10
    /* renamed from: e */
    public void mo15617e(long j, String str) {
        m15614h();
        m15616f(j, str);
    }

    /* renamed from: f */
    public final void m15616f(long j, String str) {
        int i;
        if (this.f19320c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f19319b / 4) {
                str = "..." + str.substring(str.length() - i);
            }
            this.f19320c.m16313w(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f19317d));
            while (!this.f19320c.m16333P() && this.f19320c.m16322c0() > this.f19319b) {
                this.f19320c.m16326Y();
            }
        } catch (IOException e) {
            ml0.m15976f().m15977e("There was a problem writing to the Crashlytics log.", e);
        }
    }

    /* renamed from: g */
    public final C2231b m15615g() {
        if (this.f19318a.exists()) {
            m15614h();
            m01 m01Var = this.f19320c;
            if (m01Var == null) {
                return null;
            }
            int[] iArr = {0};
            byte[] bArr = new byte[m01Var.m16322c0()];
            try {
                this.f19320c.m16335L(new C2230a(bArr, iArr));
            } catch (IOException e) {
                ml0.m15976f().m15977e("A problem occurred while reading the Crashlytics log file.", e);
            }
            return new C2231b(bArr, iArr[0]);
        }
        return null;
    }

    /* renamed from: h */
    public final void m15614h() {
        if (this.f19320c == null) {
            try {
                this.f19320c = new m01(this.f19318a);
            } catch (IOException e) {
                ml0 m15976f = ml0.m15976f();
                m15976f.m15977e("Could not open log file: " + this.f19318a, e);
            }
        }
    }
}
