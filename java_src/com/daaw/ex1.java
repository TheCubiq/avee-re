package com.daaw;

import android.text.TextUtils;
import com.daaw.da1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class ex1 implements zz {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(\\d+)");
    public final String a;
    public final ol1 b;
    public d00 d;
    public int f;
    public final rv0 c = new rv0();
    public byte[] e = new byte[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];

    public ex1(String str, ol1 ol1Var) {
        this.a = str;
        this.b = ol1Var;
    }

    @Override // com.daaw.zz
    public void a() {
    }

    public final sm1 b(long j) {
        sm1 a = this.d.a(0, 3);
        a.d(Format.F(null, "text/vtt", null, -1, 0, this.a, null, j));
        this.d.n();
        return a;
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        throw new IllegalStateException();
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        int h2 = (int) a00Var.h();
        int i = this.f;
        byte[] bArr = this.e;
        if (i == bArr.length) {
            this.e = Arrays.copyOf(bArr, ((h2 != -1 ? h2 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.e;
        int i2 = this.f;
        int b = a00Var.b(bArr2, i2, bArr2.length - i2);
        if (b != -1) {
            int i3 = this.f + b;
            this.f = i3;
            if (h2 == -1 || i3 != h2) {
                return 0;
            }
        }
        e();
        return -1;
    }

    public final void e() {
        rv0 rv0Var = new rv0(this.e);
        try {
            fx1.d(rv0Var);
            long j = 0;
            long j2 = 0;
            while (true) {
                String k = rv0Var.k();
                if (TextUtils.isEmpty(k)) {
                    Matcher a = fx1.a(rv0Var);
                    if (a == null) {
                        b(0L);
                        return;
                    }
                    long c = fx1.c(a.group(1));
                    long b = this.b.b(ol1.i((j + c) - j2));
                    sm1 b2 = b(b - c);
                    this.c.H(this.e, this.f);
                    b2.c(this.c, this.f);
                    b2.a(b, 1, this.f, 0, null);
                    return;
                } else if (k.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher = g.matcher(k);
                    if (!matcher.find()) {
                        throw new tv0("X-TIMESTAMP-MAP doesn't contain local timestamp: " + k);
                    }
                    Matcher matcher2 = h.matcher(k);
                    if (!matcher2.find()) {
                        throw new tv0("X-TIMESTAMP-MAP doesn't contain media timestamp: " + k);
                    }
                    j2 = fx1.c(matcher.group(1));
                    j = ol1.f(Long.parseLong(matcher2.group(1)));
                }
            }
        } catch (vh1 e) {
            throw new tv0(e);
        }
    }

    @Override // com.daaw.zz
    public void f(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        this.d = d00Var;
        d00Var.d(new da1.b(-9223372036854775807L));
    }
}
