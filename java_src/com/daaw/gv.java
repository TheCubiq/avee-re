package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class gv extends jd1 {
    public final hv o;

    public gv(List<byte[]> list) {
        super("DvbDecoder");
        rv0 rv0Var = new rv0(list.get(0));
        this.o = new hv(rv0Var.D(), rv0Var.D());
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public iv z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.o.r();
        }
        return new iv(this.o.b(bArr, i));
    }
}
