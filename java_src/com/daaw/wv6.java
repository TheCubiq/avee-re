package com.daaw;
/* loaded from: classes.dex */
public final class wv6 extends sw6 {
    public int a;
    public String b;
    public byte c;

    @Override // com.daaw.sw6
    public final sw6 a(String str) {
        this.b = str;
        return this;
    }

    @Override // com.daaw.sw6
    public final sw6 b(int i) {
        this.a = i;
        this.c = (byte) 1;
        return this;
    }

    @Override // com.daaw.sw6
    public final tw6 c() {
        if (this.c == 1) {
            return new yv6(this.a, this.b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
