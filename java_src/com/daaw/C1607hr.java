package com.daaw;

import com.daaw.tb0;
/* renamed from: com.daaw.hr */
/* loaded from: classes.dex */
public final class C1607hr extends tb0.AbstractC3036a {

    /* renamed from: b */
    public final String f12865b;

    /* renamed from: c */
    public final bn1<? super InterfaceC2200mp> f12866c;

    /* renamed from: d */
    public final int f12867d;

    /* renamed from: e */
    public final int f12868e;

    /* renamed from: f */
    public final boolean f12869f;

    public C1607hr(String str, bn1<? super InterfaceC2200mp> bn1Var) {
        this(str, bn1Var, 8000, 8000, false);
    }

    public C1607hr(String str, bn1<? super InterfaceC2200mp> bn1Var, int i, int i2, boolean z) {
        this.f12865b = str;
        this.f12866c = bn1Var;
        this.f12867d = i;
        this.f12868e = i2;
        this.f12869f = z;
    }

    @Override // com.daaw.tb0.AbstractC3036a
    /* renamed from: d */
    public C1455gr mo9374c(tb0.C3041f c3041f) {
        return new C1455gr(this.f12865b, null, this.f12866c, this.f12867d, this.f12868e, this.f12869f, c3041f);
    }
}
