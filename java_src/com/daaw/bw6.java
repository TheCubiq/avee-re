package com.daaw;
/* loaded from: classes.dex */
public final class bw6 extends ww6 {
    public final String a;
    public final String b;

    public /* synthetic */ bw6(String str, String str2, aw6 aw6Var) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.ww6
    public final String a() {
        return this.b;
    }

    @Override // com.daaw.ww6
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ww6) {
            ww6 ww6Var = (ww6) obj;
            String str = this.a;
            if (str != null ? str.equals(ww6Var.b()) : ww6Var.b() == null) {
                String str2 = this.b;
                String a = ww6Var.a();
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
        return "OverlayDisplayUpdateRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}
