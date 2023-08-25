package com.daaw;
/* loaded from: classes.dex */
public final class yv6 extends tw6 {

    /* renamed from: a */
    public final int f34177a;

    /* renamed from: b */
    public final String f34178b;

    public /* synthetic */ yv6(int i, String str, xv6 xv6Var) {
        this.f34177a = i;
        this.f34178b = str;
    }

    @Override // com.daaw.tw6
    /* renamed from: a */
    public final int mo3164a() {
        return this.f34177a;
    }

    @Override // com.daaw.tw6
    /* renamed from: b */
    public final String mo3163b() {
        return this.f34178b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tw6) {
            tw6 tw6Var = (tw6) obj;
            if (this.f34177a == tw6Var.mo3164a()) {
                String str = this.f34178b;
                String mo3163b = tw6Var.mo3163b();
                if (str != null ? str.equals(mo3163b) : mo3163b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f34177a ^ 1000003) * 1000003;
        String str = this.f34178b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.f34177a;
        String str = this.f34178b;
        return "OverlayDisplayState{statusCode=" + i + ", sessionToken=" + str + "}";
    }
}
