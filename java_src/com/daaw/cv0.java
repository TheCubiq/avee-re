package com.daaw;

import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public class cv0 implements pe1 {

    /* renamed from: a */
    public static final C3445wk[] f6206a = {new C3445wk(new String[]{".pla"}, new String[]{"application/octet-stream"}, new gx0[0], "iRiver iQuickList File")};

    @Override // com.daaw.pe1
    /* renamed from: a */
    public oe1 mo13427a(InputStream inputStream, String str, bl0 bl0Var) {
        bv0 bv0Var = new bv0();
        bv0Var.m25807d(this);
        byte[] bArr = new byte[512];
        if (inputStream.read(bArr) == 512) {
            if ("iriver UMS PLA".equals(new String(bArr, 4, 14, "US-ASCII"))) {
                int i = ((bArr[3] & 255) << 0) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24);
                for (int i2 = 0; i2 < i; i2++) {
                    if (inputStream.read(bArr) != 512) {
                        bl0Var.mo23392f("Malformed PLA playlist (file too small)");
                        return null;
                    }
                    bv0Var.m25808c().add(new String(bArr, 2, 510, "UTF-16BE"));
                }
                return bv0Var;
            }
            throw new IllegalArgumentException("Not a PLA playlist format (bad magic)");
        }
        throw new IllegalArgumentException("Not a PLA playlist format (file too small)");
    }

    @Override // com.daaw.pe1
    /* renamed from: b */
    public C3445wk[] mo13426b() {
        return (C3445wk[]) f6206a.clone();
    }

    @Override // com.daaw.pe1
    /* renamed from: c */
    public oe1 mo13425c(ix0 ix0Var) {
        bv0 bv0Var = new bv0();
        bv0Var.m25807d(this);
        m24970d(bv0Var.m25808c(), ix0Var.m19301a());
        return bv0Var;
    }

    /* renamed from: d */
    public final void m24970d(List<String> list, AbstractC2227n abstractC2227n) {
        if (!(abstractC2227n instanceof fb1)) {
            if (abstractC2227n instanceof yn0) {
                yn0 yn0Var = (yn0) abstractC2227n;
                if (yn0Var.m3487b() != null) {
                    throw new IllegalArgumentException("A PLA playlist cannot handle a timed media");
                }
                if (yn0Var.m15649a() < 0) {
                    throw new IllegalArgumentException("A PLA playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.m3486c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) abstractC2227n;
        if (fb1Var.m15649a() < 0) {
            throw new IllegalArgumentException("A PLA playlist cannot handle a sequence repeated indefinitely");
        }
        AbstractC2227n[] m13789b = fb1Var.m13789b();
        for (int i = 0; i < fb1Var.m15649a(); i++) {
            for (AbstractC2227n abstractC2227n2 : m13789b) {
                m24970d(list, abstractC2227n2);
            }
        }
    }

    @Override // com.daaw.pe1
    public String getId() {
        return "pla";
    }
}
