package com.daaw;
/* loaded from: classes.dex */
public final class qv6 extends cw6 {
    public String a;
    public String b;

    @Override // com.daaw.cw6
    public final cw6 a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.daaw.cw6
    public final cw6 b(String str) {
        this.a = str;
        return this;
    }

    @Override // com.daaw.cw6
    public final dw6 c() {
        return new sv6(this.a, this.b, null);
    }
}
