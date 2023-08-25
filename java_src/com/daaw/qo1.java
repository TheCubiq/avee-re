package com.daaw;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import java.nio.charset.Charset;
import java.util.List;
/* loaded from: classes.dex */
public final class qo1 extends jd1 {
    public static final int v = sq1.v("styl");
    public static final int w = sq1.v("tbox");
    public final rv0 o;
    public boolean p;
    public int q;
    public int r;
    public String s;
    public float t;
    public int u;

    public qo1(List<byte[]> list) {
        super("Tx3gDecoder");
        this.o = new rv0();
        H(list);
    }

    public static void D(boolean z) {
        if (!z) {
            throw new vh1("Unexpected subtitle format.");
        }
    }

    public static void E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void F(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = 1
            goto Ld
        Lc:
            r10 = 0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r1)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            if (r1 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r1 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qo1.F(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    public static void G(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    public static String I(rv0 rv0Var) {
        char e;
        D(rv0Var.a() >= 2);
        int D = rv0Var.D();
        if (D == 0) {
            return "";
        }
        return rv0Var.v(D, Charset.forName((rv0Var.a() < 2 || !((e = rv0Var.e()) == 65279 || e == 65534)) ? "UTF-8" : "UTF-16"));
    }

    public final void C(rv0 rv0Var, SpannableStringBuilder spannableStringBuilder) {
        D(rv0Var.a() >= 12);
        int D = rv0Var.D();
        int D2 = rv0Var.D();
        rv0Var.K(2);
        int x = rv0Var.x();
        rv0Var.K(1);
        int i = rv0Var.i();
        F(spannableStringBuilder, x, this.q, D, D2, 0);
        E(spannableStringBuilder, i, this.r, D, D2, 0);
    }

    public final void H(List<byte[]> list) {
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.q = bArr[24];
            this.r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.s = "Serif".equals(sq1.q(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.u = i;
            boolean z = (bArr[0] & 32) != 0;
            this.p = z;
            if (z) {
                float f = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i;
                this.t = f;
                this.t = sq1.k(f, 0.0f, 0.95f);
                return;
            }
        } else {
            this.q = 0;
            this.r = -1;
            this.s = "sans-serif";
            this.p = false;
        }
        this.t = 0.85f;
    }

    @Override // com.daaw.jd1
    public th1 z(byte[] bArr, int i, boolean z) {
        this.o.H(bArr, i);
        String I = I(this.o);
        if (I.isEmpty()) {
            return ro1.q;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(I);
        F(spannableStringBuilder, this.q, 0, 0, spannableStringBuilder.length(), 16711680);
        E(spannableStringBuilder, this.r, -1, 0, spannableStringBuilder.length(), 16711680);
        G(spannableStringBuilder, this.s, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f = this.t;
        while (this.o.a() >= 8) {
            int c = this.o.c();
            int i2 = this.o.i();
            int i3 = this.o.i();
            if (i3 == v) {
                D(this.o.a() >= 2);
                int D = this.o.D();
                for (int i4 = 0; i4 < D; i4++) {
                    C(this.o, spannableStringBuilder);
                }
            } else if (i3 == w && this.p) {
                D(this.o.a() >= 2);
                f = sq1.k(this.o.D() / this.u, 0.0f, 0.95f);
            }
            this.o.J(c + i2);
        }
        return new ro1(new ln(spannableStringBuilder, null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
