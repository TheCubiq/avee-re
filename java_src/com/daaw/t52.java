package com.daaw;

import java.util.Collections;
/* loaded from: classes.dex */
public final class t52 extends y52 {

    /* renamed from: e */
    public static final int[] f27009e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f27010b;

    /* renamed from: c */
    public boolean f27011c;

    /* renamed from: d */
    public int f27012d;

    public t52(m42 m42Var) {
        super(m42Var);
    }

    @Override // com.daaw.y52
    /* renamed from: a */
    public final boolean mo2810a(ik5 ik5Var) {
        b72 b72Var;
        int i;
        if (this.f27010b) {
            ik5Var.m19715g(1);
        } else {
            int m19703s = ik5Var.m19703s();
            int i2 = m19703s >> 4;
            this.f27012d = i2;
            if (i2 == 2) {
                i = f27009e[(m19703s >> 2) & 3];
                b72Var = new b72();
                b72Var.m26372s("audio/mpeg");
                b72Var.m26389e0(1);
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                b72Var = new b72();
                b72Var.m26372s(str);
                b72Var.m26389e0(1);
                i = 8000;
            } else {
                if (i2 != 10) {
                    throw new x52("Audio format not supported: " + i2);
                }
                this.f27010b = true;
            }
            b72Var.m26371t(i);
            this.f33371a.mo16218f(b72Var.m26366y());
            this.f27011c = true;
            this.f27010b = true;
        }
        return true;
    }

    @Override // com.daaw.y52
    /* renamed from: b */
    public final boolean mo2809b(ik5 ik5Var, long j) {
        if (this.f27012d == 2) {
            int m19713i = ik5Var.m19713i();
            this.f33371a.mo16221c(ik5Var, m19713i);
            this.f33371a.mo16222b(j, 1, m19713i, 0, null);
            return true;
        }
        int m19703s = ik5Var.m19703s();
        if (m19703s != 0 || this.f27011c) {
            if (this.f27012d != 10 || m19703s == 1) {
                int m19713i2 = ik5Var.m19713i();
                this.f33371a.mo16221c(ik5Var, m19713i2);
                this.f33371a.mo16222b(j, 1, m19713i2, 0, null);
                return true;
            }
            return false;
        }
        int m19713i3 = ik5Var.m19713i();
        byte[] bArr = new byte[m19713i3];
        ik5Var.m19720b(bArr, 0, m19713i3);
        yy8 m1766a = zy8.m1766a(bArr);
        b72 b72Var = new b72();
        b72Var.m26372s("audio/mp4a-latm");
        b72Var.m26387f0(m1766a.f34268c);
        b72Var.m26389e0(m1766a.f34267b);
        b72Var.m26371t(m1766a.f34266a);
        b72Var.m26382i(Collections.singletonList(bArr));
        this.f33371a.mo16218f(b72Var.m26366y());
        this.f27011c = true;
        return false;
    }
}
