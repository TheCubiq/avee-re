package com.daaw;

import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public class cv0 implements pe1 {
    public static final wk[] a = {new wk(new String[]{".pla"}, new String[]{"application/octet-stream"}, new gx0[0], "iRiver iQuickList File")};

    @Override // com.daaw.pe1
    public oe1 a(InputStream inputStream, String str, bl0 bl0Var) {
        bv0 bv0Var = new bv0();
        bv0Var.d(this);
        byte[] bArr = new byte[512];
        if (inputStream.read(bArr) == 512) {
            if ("iriver UMS PLA".equals(new String(bArr, 4, 14, "US-ASCII"))) {
                int i = ((bArr[3] & 255) << 0) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24);
                for (int i2 = 0; i2 < i; i2++) {
                    if (inputStream.read(bArr) != 512) {
                        bl0Var.f("Malformed PLA playlist (file too small)");
                        return null;
                    }
                    bv0Var.c().add(new String(bArr, 2, 510, "UTF-16BE"));
                }
                return bv0Var;
            }
            throw new IllegalArgumentException("Not a PLA playlist format (bad magic)");
        }
        throw new IllegalArgumentException("Not a PLA playlist format (file too small)");
    }

    @Override // com.daaw.pe1
    public wk[] b() {
        return (wk[]) a.clone();
    }

    @Override // com.daaw.pe1
    public oe1 c(ix0 ix0Var) {
        bv0 bv0Var = new bv0();
        bv0Var.d(this);
        d(bv0Var.c(), ix0Var.a());
        return bv0Var;
    }

    public final void d(List<String> list, n nVar) {
        if (!(nVar instanceof fb1)) {
            if (nVar instanceof yn0) {
                yn0 yn0Var = (yn0) nVar;
                if (yn0Var.b() != null) {
                    throw new IllegalArgumentException("A PLA playlist cannot handle a timed media");
                }
                if (yn0Var.a() < 0) {
                    throw new IllegalArgumentException("A PLA playlist cannot handle a media repeated indefinitely");
                }
                yn0Var.c();
                return;
            }
            return;
        }
        fb1 fb1Var = (fb1) nVar;
        if (fb1Var.a() < 0) {
            throw new IllegalArgumentException("A PLA playlist cannot handle a sequence repeated indefinitely");
        }
        n[] b = fb1Var.b();
        for (int i = 0; i < fb1Var.a(); i++) {
            for (n nVar2 : b) {
                d(list, nVar2);
            }
        }
    }

    @Override // com.daaw.pe1
    public String getId() {
        return "pla";
    }
}
