package com.daaw;
/* loaded from: classes.dex */
public final class zv6 extends vw6 {
    public String a;
    public String b;

    @Override // com.daaw.vw6
    public final vw6 a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.daaw.vw6
    public final vw6 b(String str) {
        this.a = str;
        return this;
    }

    @Override // com.daaw.vw6
    public final ww6 c() {
        return new bw6(this.a, this.b, null);
    }
}
