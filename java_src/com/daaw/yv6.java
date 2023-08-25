package com.daaw;
/* loaded from: classes.dex */
public final class yv6 extends tw6 {
    public final int a;
    public final String b;

    public /* synthetic */ yv6(int i, String str, xv6 xv6Var) {
        this.a = i;
        this.b = str;
    }

    @Override // com.daaw.tw6
    public final int a() {
        return this.a;
    }

    @Override // com.daaw.tw6
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tw6) {
            tw6 tw6Var = (tw6) obj;
            if (this.a == tw6Var.a()) {
                String str = this.b;
                String b = tw6Var.b();
                if (str != null ? str.equals(b) : b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        return "OverlayDisplayState{statusCode=" + i + ", sessionToken=" + str + "}";
    }
}
