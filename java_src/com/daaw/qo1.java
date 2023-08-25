package com.daaw;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
/* loaded from: classes.dex */
public final class qo1 extends jd1 {

    /* renamed from: v */
    public static final int f24210v = sq1.m9994v("styl");

    /* renamed from: w */
    public static final int f24211w = sq1.m9994v("tbox");

    /* renamed from: o */
    public final rv0 f24212o;

    /* renamed from: p */
    public boolean f24213p;

    /* renamed from: q */
    public int f24214q;

    /* renamed from: r */
    public int f24215r;

    /* renamed from: s */
    public String f24216s;

    /* renamed from: t */
    public float f24217t;

    /* renamed from: u */
    public int f24218u;

    public qo1(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f24212o = new rv0();
        m12310H(list);
    }

    /* renamed from: D */
    public static void m12314D(boolean z) {
        if (!z) {
            throw new vh1("Unexpected subtitle format.");
        }
    }

    /* renamed from: E */
    public static void m12313E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m12312F(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        StyleSpan styleSpan;
        boolean z;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z2 = (i & 1) != 0;
            boolean z3 = (i & 2) != 0;
            if (!z2) {
                if (z3) {
                    styleSpan = new StyleSpan(2);
                }
                z = (i & 4) != 0;
                if (z) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
                }
                if (!z || z2 || z3) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
                return;
            }
            styleSpan = z3 ? new StyleSpan(3) : new StyleSpan(1);
            spannableStringBuilder.setSpan(styleSpan, i3, i4, i6);
            if ((i & 4) != 0) {
            }
            if (z) {
            }
            if (z) {
            }
        }
    }

    /* renamed from: G */
    public static void m12311G(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i, int i2, int i3) {
        if (str != str2) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, i3 | 33);
        }
    }

    /* renamed from: I */
    public static String m12309I(rv0 rv0Var) {
        char m10915e;
        m12314D(rv0Var.m10919a() >= 2);
        int m10927D = rv0Var.m10927D();
        if (m10927D == 0) {
            return "";
        }
        return rv0Var.m10898v(m10927D, Charset.forName((rv0Var.m10919a() < 2 || !((m10915e = rv0Var.m10915e()) == 65279 || m10915e == 65534)) ? "UTF-8" : "UTF-16"));
    }

    /* renamed from: C */
    public final void m12315C(rv0 rv0Var, SpannableStringBuilder spannableStringBuilder) {
        m12314D(rv0Var.m10919a() >= 12);
        int m10927D = rv0Var.m10927D();
        int m10927D2 = rv0Var.m10927D();
        rv0Var.m10920K(2);
        int m10896x = rv0Var.m10896x();
        rv0Var.m10920K(1);
        int m10911i = rv0Var.m10911i();
        m12312F(spannableStringBuilder, m10896x, this.f24214q, m10927D, m10927D2, 0);
        m12313E(spannableStringBuilder, m10911i, this.f24215r, m10927D, m10927D2, 0);
    }

    /* renamed from: H */
    public final void m12310H(List<byte[]> list) {
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f24214q = bArr[24];
            this.f24215r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f24216s = "Serif".equals(sq1.m9999q(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.f24218u = i;
            boolean z = (bArr[0] & 32) != 0;
            this.f24213p = z;
            if (z) {
                float f = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i;
                this.f24217t = f;
                this.f24217t = sq1.m10005k(f, 0.0f, 0.95f);
                return;
            }
        } else {
            this.f24214q = 0;
            this.f24215r = -1;
            this.f24216s = "sans-serif";
            this.f24213p = false;
        }
        this.f24217t = 0.85f;
    }

    @Override // com.daaw.jd1
    /* renamed from: z */
    public th1 mo5845z(byte[] bArr, int i, boolean z) {
        this.f24212o.m10923H(bArr, i);
        String m12309I = m12309I(this.f24212o);
        if (m12309I.isEmpty()) {
            return ro1.f25449q;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m12309I);
        m12312F(spannableStringBuilder, this.f24214q, 0, 0, spannableStringBuilder.length(), 16711680);
        m12313E(spannableStringBuilder, this.f24215r, -1, 0, spannableStringBuilder.length(), 16711680);
        m12311G(spannableStringBuilder, this.f24216s, "sans-serif", 0, spannableStringBuilder.length(), 16711680);
        float f = this.f24217t;
        while (this.f24212o.m10919a() >= 8) {
            int m10917c = this.f24212o.m10917c();
            int m10911i = this.f24212o.m10911i();
            int m10911i2 = this.f24212o.m10911i();
            if (m10911i2 == f24210v) {
                m12314D(this.f24212o.m10919a() >= 2);
                int m10927D = this.f24212o.m10927D();
                for (int i2 = 0; i2 < m10927D; i2++) {
                    m12315C(this.f24212o, spannableStringBuilder);
                }
            } else if (m10911i2 == f24211w && this.f24213p) {
                m12314D(this.f24212o.m10919a() >= 2);
                f = sq1.m10005k(this.f24212o.m10927D() / this.f24218u, 0.0f, 0.95f);
            }
            this.f24212o.m10921J(m10917c + m10911i);
        }
        return new ro1(new C2099ln(spannableStringBuilder, null, f, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
