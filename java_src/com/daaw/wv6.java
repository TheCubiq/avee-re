package com.daaw;
/* loaded from: classes.dex */
public final class wv6 extends sw6 {

    /* renamed from: a */
    public int f31587a;

    /* renamed from: b */
    public String f31588b;

    /* renamed from: c */
    public byte f31589c;

    @Override // com.daaw.sw6
    /* renamed from: a */
    public final sw6 mo5762a(String str) {
        this.f31588b = str;
        return this;
    }

    @Override // com.daaw.sw6
    /* renamed from: b */
    public final sw6 mo5761b(int i) {
        this.f31587a = i;
        this.f31589c = (byte) 1;
        return this;
    }

    @Override // com.daaw.sw6
    /* renamed from: c */
    public final tw6 mo5760c() {
        if (this.f31589c == 1) {
            return new yv6(this.f31587a, this.f31588b, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
