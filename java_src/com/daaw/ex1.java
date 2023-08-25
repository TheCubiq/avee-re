package com.daaw;

import android.text.TextUtils;
import com.daaw.da1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.NativeConstants;
/* loaded from: classes.dex */
public final class ex1 implements InterfaceC3919zz {

    /* renamed from: g */
    public static final Pattern f8909g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f8910h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a */
    public final String f8911a;

    /* renamed from: b */
    public final ol1 f8912b;

    /* renamed from: d */
    public d00 f8914d;

    /* renamed from: f */
    public int f8916f;

    /* renamed from: c */
    public final rv0 f8913c = new rv0();

    /* renamed from: e */
    public byte[] f8915e = new byte[NativeConstants.SSL_MODE_SEND_FALLBACK_SCSV];

    public ex1(String str, ol1 ol1Var) {
        this.f8911a = str;
        this.f8912b = ol1Var;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* renamed from: b */
    public final sm1 m23055b(long j) {
        sm1 mo11478a = this.f8914d.mo11478a(0, 3);
        mo11478a.mo10156d(Format.m1740F(null, "text/vtt", null, -1, 0, this.f8911a, null, j));
        this.f8914d.mo11470n();
        return mo11478a;
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        throw new IllegalStateException();
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        int mo5859h = (int) a00Var.mo5859h();
        int i = this.f8916f;
        byte[] bArr = this.f8915e;
        if (i == bArr.length) {
            this.f8915e = Arrays.copyOf(bArr, ((mo5859h != -1 ? mo5859h : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f8915e;
        int i2 = this.f8916f;
        int mo5865b = a00Var.mo5865b(bArr2, i2, bArr2.length - i2);
        if (mo5865b != -1) {
            int i3 = this.f8916f + mo5865b;
            this.f8916f = i3;
            if (mo5859h == -1 || i3 != mo5859h) {
                return 0;
            }
        }
        m23054e();
        return -1;
    }

    /* renamed from: e */
    public final void m23054e() {
        rv0 rv0Var = new rv0(this.f8915e);
        try {
            fx1.m22151d(rv0Var);
            long j = 0;
            long j2 = 0;
            while (true) {
                String m10909k = rv0Var.m10909k();
                if (TextUtils.isEmpty(m10909k)) {
                    Matcher m22154a = fx1.m22154a(rv0Var);
                    if (m22154a == null) {
                        m23055b(0L);
                        return;
                    }
                    long m22152c = fx1.m22152c(m22154a.group(1));
                    long m14187b = this.f8912b.m14187b(ol1.m14180i((j + m22152c) - j2));
                    sm1 m23055b = m23055b(m14187b - m22152c);
                    this.f8913c.m10923H(this.f8915e, this.f8916f);
                    m23055b.mo10157c(this.f8913c, this.f8916f);
                    m23055b.mo10159a(m14187b, 1, this.f8916f, 0, null);
                    return;
                } else if (m10909k.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher = f8909g.matcher(m10909k);
                    if (!matcher.find()) {
                        throw new tv0("X-TIMESTAMP-MAP doesn't contain local timestamp: " + m10909k);
                    }
                    Matcher matcher2 = f8910h.matcher(m10909k);
                    if (!matcher2.find()) {
                        throw new tv0("X-TIMESTAMP-MAP doesn't contain media timestamp: " + m10909k);
                    }
                    j2 = fx1.m22152c(matcher.group(1));
                    j = ol1.m14183f(Long.parseLong(matcher2.group(1)));
                }
            }
        } catch (vh1 e) {
            throw new tv0(e);
        }
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        this.f8914d = d00Var;
        d00Var.mo11475d(new da1.C1069b(-9223372036854775807L));
    }
}
