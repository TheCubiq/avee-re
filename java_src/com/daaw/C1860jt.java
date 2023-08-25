package com.daaw;
/* renamed from: com.daaw.jt */
/* loaded from: classes.dex */
public final class C1860jt {

    /* renamed from: a */
    public final String f15376a;

    /* renamed from: b */
    public final String f15377b;

    /* renamed from: c */
    public final String f15378c;

    public C1860jt(String str, String str2, String str3) {
        this.f15376a = str;
        this.f15377b = str2;
        this.f15378c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1860jt.class != obj.getClass()) {
            return false;
        }
        C1860jt c1860jt = (C1860jt) obj;
        return sq1.m10016b(this.f15376a, c1860jt.f15376a) && sq1.m10016b(this.f15377b, c1860jt.f15377b) && sq1.m10016b(this.f15378c, c1860jt.f15378c);
    }

    public int hashCode() {
        String str = this.f15376a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f15377b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15378c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
