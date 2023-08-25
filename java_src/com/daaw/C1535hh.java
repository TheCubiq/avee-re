package com.daaw;
/* renamed from: com.daaw.hh */
/* loaded from: classes2.dex */
public class C1535hh extends C2828r6 {

    /* renamed from: p */
    public String f12537p;

    /* renamed from: q */
    public String f12538q;

    public C1535hh(String str, String str2, String str3) {
        super(str);
        this.f12537p = str2;
        this.f12538q = str3;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new C1401gh(20, this.f12537p, this.f12538q).m21641b(super.getMessage());
    }
}
