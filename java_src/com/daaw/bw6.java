package com.daaw;
/* loaded from: classes.dex */
public final class bw6 extends ww6 {

    /* renamed from: a */
    public final String f5234a;

    /* renamed from: b */
    public final String f5235b;

    public /* synthetic */ bw6(String str, String str2, aw6 aw6Var) {
        this.f5234a = str;
        this.f5235b = str2;
    }

    @Override // com.daaw.ww6
    /* renamed from: a */
    public final String mo5749a() {
        return this.f5235b;
    }

    @Override // com.daaw.ww6
    /* renamed from: b */
    public final String mo5748b() {
        return this.f5234a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ww6) {
            ww6 ww6Var = (ww6) obj;
            String str = this.f5234a;
            if (str != null ? str.equals(ww6Var.mo5748b()) : ww6Var.mo5748b() == null) {
                String str2 = this.f5235b;
                String mo5749a = ww6Var.mo5749a();
                if (str2 != null ? str2.equals(mo5749a) : mo5749a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f5234a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f5235b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f5234a;
        String str2 = this.f5235b;
        return "OverlayDisplayUpdateRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}
