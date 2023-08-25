package com.daaw;
/* loaded from: classes.dex */
public final class ns6 extends js6 {

    /* renamed from: a */
    public final String f20620a;

    /* renamed from: b */
    public final boolean f20621b;

    /* renamed from: c */
    public final boolean f20622c;

    public /* synthetic */ ns6(String str, boolean z, boolean z2, ms6 ms6Var) {
        this.f20620a = str;
        this.f20621b = z;
        this.f20622c = z2;
    }

    @Override // com.daaw.js6
    /* renamed from: b */
    public final String mo14843b() {
        return this.f20620a;
    }

    @Override // com.daaw.js6
    /* renamed from: c */
    public final boolean mo14842c() {
        return this.f20622c;
    }

    @Override // com.daaw.js6
    /* renamed from: d */
    public final boolean mo14841d() {
        return this.f20621b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof js6) {
            js6 js6Var = (js6) obj;
            if (this.f20620a.equals(js6Var.mo14843b()) && this.f20621b == js6Var.mo14841d() && this.f20622c == js6Var.mo14842c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f20620a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f20621b ? 1237 : 1231)) * 1000003) ^ (true == this.f20622c ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.f20620a;
        boolean z = this.f20621b;
        boolean z2 = this.f20622c;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }
}
