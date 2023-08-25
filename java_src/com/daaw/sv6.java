package com.daaw;
/* loaded from: classes.dex */
public final class sv6 extends dw6 {

    /* renamed from: a */
    public final String f26704a;

    /* renamed from: b */
    public final String f26705b;

    public /* synthetic */ sv6(String str, String str2, rv6 rv6Var) {
        this.f26704a = str;
        this.f26705b = str2;
    }

    @Override // com.daaw.dw6
    /* renamed from: a */
    public final String mo9800a() {
        return this.f26705b;
    }

    @Override // com.daaw.dw6
    /* renamed from: b */
    public final String mo9799b() {
        return this.f26704a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dw6) {
            dw6 dw6Var = (dw6) obj;
            String str = this.f26704a;
            if (str != null ? str.equals(dw6Var.mo9799b()) : dw6Var.mo9799b() == null) {
                String str2 = this.f26705b;
                String mo9800a = dw6Var.mo9800a();
                if (str2 != null ? str2.equals(mo9800a) : mo9800a == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f26704a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f26705b;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f26704a;
        String str2 = this.f26705b;
        return "OverlayDisplayDismissRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }
}
