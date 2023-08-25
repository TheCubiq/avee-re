package com.daaw;
/* loaded from: classes.dex */
public final class ns6 extends js6 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ ns6(String str, boolean z, boolean z2, ms6 ms6Var) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // com.daaw.js6
    public final String b() {
        return this.a;
    }

    @Override // com.daaw.js6
    public final boolean c() {
        return this.c;
    }

    @Override // com.daaw.js6
    public final boolean d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof js6) {
            js6 js6Var = (js6) obj;
            if (this.a.equals(js6Var.b()) && this.b == js6Var.d() && this.c == js6Var.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }
}
