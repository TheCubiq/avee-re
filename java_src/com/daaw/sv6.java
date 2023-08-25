package com.daaw;
/* loaded from: classes.dex */
public final class sv6 extends dw6 {
    public final String a;
    public final String b;

    public /* synthetic */ sv6(String str, String str2, rv6 rv6Var) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.dw6
    public final String a() {
        return this.b;
    }

    @Override // com.daaw.dw6
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dw6) {
            dw6 dw6Var = (dw6) obj;
            String str = this.a;
            if (str != null ? str.equals(dw6Var.b()) : dw6Var.b() == null) {
                String str2 = this.b;
                String a = dw6Var.a();
                if (str2 != null ? str2.equals(a) : a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        return "OverlayDisplayDismissRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}
