package com.daaw;

import java.util.Collections;
/* loaded from: classes.dex */
public final class t52 extends y52 {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public t52(m42 m42Var) {
        super(m42Var);
    }

    @Override // com.daaw.y52
    public final boolean a(ik5 ik5Var) {
        b72 b72Var;
        int i;
        if (this.b) {
            ik5Var.g(1);
        } else {
            int s = ik5Var.s();
            int i2 = s >> 4;
            this.d = i2;
            if (i2 == 2) {
                i = e[(s >> 2) & 3];
                b72Var = new b72();
                b72Var.s("audio/mpeg");
                b72Var.e0(1);
            } else if (i2 == 7 || i2 == 8) {
                String str = i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                b72Var = new b72();
                b72Var.s(str);
                b72Var.e0(1);
                i = 8000;
            } else {
                if (i2 != 10) {
                    throw new x52("Audio format not supported: " + i2);
                }
                this.b = true;
            }
            b72Var.t(i);
            this.a.f(b72Var.y());
            this.c = true;
            this.b = true;
        }
        return true;
    }

    @Override // com.daaw.y52
    public final boolean b(ik5 ik5Var, long j) {
        if (this.d == 2) {
            int i = ik5Var.i();
            this.a.c(ik5Var, i);
            this.a.b(j, 1, i, 0, null);
            return true;
        }
        int s = ik5Var.s();
        if (s != 0 || this.c) {
            if (this.d != 10 || s == 1) {
                int i2 = ik5Var.i();
                this.a.c(ik5Var, i2);
                this.a.b(j, 1, i2, 0, null);
                return true;
            }
            return false;
        }
        int i3 = ik5Var.i();
        byte[] bArr = new byte[i3];
        ik5Var.b(bArr, 0, i3);
        yy8 a = zy8.a(bArr);
        b72 b72Var = new b72();
        b72Var.s("audio/mp4a-latm");
        b72Var.f0(a.c);
        b72Var.e0(a.b);
        b72Var.t(a.a);
        b72Var.i(Collections.singletonList(bArr));
        this.a.f(b72Var.y());
        this.c = true;
        return false;
    }
}
