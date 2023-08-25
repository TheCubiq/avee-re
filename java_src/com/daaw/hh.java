package com.daaw;
/* loaded from: classes2.dex */
public class hh extends r6 {
    public String p;
    public String q;

    public hh(String str, String str2, String str3) {
        super(str);
        this.p = str2;
        this.q = str3;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new gh(20, this.p, this.q).b(super.getMessage());
    }
}
