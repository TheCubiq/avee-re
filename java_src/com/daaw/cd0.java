package com.daaw;
/* loaded from: classes2.dex */
public class cd0 implements bd0 {

    /* renamed from: a */
    public String f5726a = null;

    /* renamed from: b */
    public String f5727b = null;

    /* renamed from: c */
    public String f5728c = null;

    /* renamed from: d */
    public String f5729d = null;

    /* renamed from: e */
    public String f5730e = null;

    /* renamed from: f */
    public int f5731f = -1;

    /* renamed from: g */
    public String f5732g = null;

    public cd0() {
    }

    public cd0(byte[] bArr) {
        m25445c(bArr);
    }

    /* renamed from: b */
    public final void m25446b(byte[] bArr) {
        if (bArr.length != 128) {
            throw new xs0("Buffer length wrong");
        }
        if (!"TAG".equals(C3419wc.m6201c(bArr, 0, 3))) {
            throw new xs0();
        }
    }

    /* renamed from: c */
    public final void m25445c(byte[] bArr) {
        String num;
        m25446b(bArr);
        this.f5728c = C3419wc.m6193k(C3419wc.m6201c(bArr, 3, 30));
        this.f5727b = C3419wc.m6193k(C3419wc.m6201c(bArr, 33, 30));
        this.f5729d = C3419wc.m6193k(C3419wc.m6201c(bArr, 63, 30));
        this.f5730e = C3419wc.m6193k(C3419wc.m6201c(bArr, 93, 4));
        int i = bArr[127] & 255;
        this.f5731f = i;
        if (i == 255) {
            this.f5731f = -1;
        }
        if (bArr[125] != 0) {
            this.f5732g = C3419wc.m6193k(C3419wc.m6201c(bArr, 97, 30));
            num = null;
        } else {
            this.f5732g = C3419wc.m6193k(C3419wc.m6201c(bArr, 97, 28));
            byte b = bArr[126];
            num = b == 0 ? "" : Integer.toString(b);
        }
        this.f5726a = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cd0 cd0Var = (cd0) obj;
            String str = this.f5729d;
            if (str == null) {
                if (cd0Var.f5729d != null) {
                    return false;
                }
            } else if (!str.equals(cd0Var.f5729d)) {
                return false;
            }
            String str2 = this.f5727b;
            if (str2 == null) {
                if (cd0Var.f5727b != null) {
                    return false;
                }
            } else if (!str2.equals(cd0Var.f5727b)) {
                return false;
            }
            String str3 = this.f5732g;
            if (str3 == null) {
                if (cd0Var.f5732g != null) {
                    return false;
                }
            } else if (!str3.equals(cd0Var.f5732g)) {
                return false;
            }
            if (this.f5731f != cd0Var.f5731f) {
                return false;
            }
            String str4 = this.f5728c;
            if (str4 == null) {
                if (cd0Var.f5728c != null) {
                    return false;
                }
            } else if (!str4.equals(cd0Var.f5728c)) {
                return false;
            }
            String str5 = this.f5726a;
            if (str5 == null) {
                if (cd0Var.f5726a != null) {
                    return false;
                }
            } else if (!str5.equals(cd0Var.f5726a)) {
                return false;
            }
            String str6 = this.f5730e;
            String str7 = cd0Var.f5730e;
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
        String str = this.f5729d;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f5727b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5732g;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f5731f) * 31;
        String str4 = this.f5728c;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5726a;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5730e;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
