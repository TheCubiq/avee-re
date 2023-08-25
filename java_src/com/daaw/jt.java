package com.daaw;
/* loaded from: classes.dex */
public final class jt {
    public final String a;
    public final String b;
    public final String c;

    public jt(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jt.class != obj.getClass()) {
            return false;
        }
        jt jtVar = (jt) obj;
        return sq1.b(this.a, jtVar.a) && sq1.b(this.b, jtVar.b) && sq1.b(this.c, jtVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
