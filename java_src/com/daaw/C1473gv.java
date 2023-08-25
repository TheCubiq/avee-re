package com.daaw;

import java.util.List;
/* renamed from: com.daaw.gv */
/* loaded from: classes.dex */
public final class C1473gv extends jd1 {

    /* renamed from: o */
    public final C1613hv f11744o;

    public C1473gv(List<byte[]> list) {
        super("DvbDecoder");
        rv0 rv0Var = new rv0(list.get(0));
        this.f11744o = new C1613hv(rv0Var.m10927D(), rv0Var.m10927D());
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public C1755iv mo5845z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f11744o.m20393r();
        }
        return new C1755iv(this.f11744o.m20409b(bArr, i));
    }
}
