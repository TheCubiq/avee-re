package com.daaw;
/* loaded from: classes2.dex */
public class cd0 implements bd0 {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public int f = -1;
    public String g = null;

    public cd0() {
    }

    public cd0(byte[] bArr) {
        c(bArr);
    }

    public final void b(byte[] bArr) {
        if (bArr.length != 128) {
            throw new xs0("Buffer length wrong");
        }
        if (!"TAG".equals(wc.c(bArr, 0, 3))) {
            throw new xs0();
        }
    }

    public final void c(byte[] bArr) {
        String num;
        b(bArr);
        this.c = wc.k(wc.c(bArr, 3, 30));
        this.b = wc.k(wc.c(bArr, 33, 30));
        this.d = wc.k(wc.c(bArr, 63, 30));
        this.e = wc.k(wc.c(bArr, 93, 4));
        int i = bArr[127] & 255;
        this.f = i;
        if (i == 255) {
            this.f = -1;
        }
        if (bArr[125] != 0) {
            this.g = wc.k(wc.c(bArr, 97, 30));
            num = null;
        } else {
            this.g = wc.k(wc.c(bArr, 97, 28));
            byte b = bArr[126];
            num = b == 0 ? "" : Integer.toString(b);
        }
        this.a = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cd0 cd0Var = (cd0) obj;
            String str = this.d;
            if (str == null) {
                if (cd0Var.d != null) {
                    return false;
                }
            } else if (!str.equals(cd0Var.d)) {
                return false;
            }
            String str2 = this.b;
            if (str2 == null) {
                if (cd0Var.b != null) {
                    return false;
                }
            } else if (!str2.equals(cd0Var.b)) {
                return false;
            }
            String str3 = this.g;
            if (str3 == null) {
                if (cd0Var.g != null) {
                    return false;
                }
            } else if (!str3.equals(cd0Var.g)) {
                return false;
            }
            if (this.f != cd0Var.f) {
                return false;
            }
            String str4 = this.c;
            if (str4 == null) {
                if (cd0Var.c != null) {
                    return false;
                }
            } else if (!str4.equals(cd0Var.c)) {
                return false;
            }
            String str5 = this.a;
            if (str5 == null) {
                if (cd0Var.a != null) {
                    return false;
                }
            } else if (!str5.equals(cd0Var.a)) {
                return false;
            }
            String str6 = this.e;
            String str7 = cd0Var.e;
            if (str6 == null) {
                if (str7 != null) {
                    return false;
                }
            } else if (!str6.equals(str7)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.d;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f) * 31;
        String str4 = this.c;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.a;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.e;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
