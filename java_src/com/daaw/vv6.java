package com.daaw;

import android.os.IBinder;
/* loaded from: classes.dex */
public final class vv6 extends rw6 {
    public final IBinder a;
    public final String b;
    public final int c;
    public final float d;
    public final int e;
    public final String f;

    public /* synthetic */ vv6(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, uv6 uv6Var) {
        this.a = iBinder;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = i3;
        this.f = str3;
    }

    @Override // com.daaw.rw6
    public final float a() {
        return this.d;
    }

    @Override // com.daaw.rw6
    public final int b() {
        return 0;
    }

    @Override // com.daaw.rw6
    public final int c() {
        return this.c;
    }

    @Override // com.daaw.rw6
    public final int d() {
        return this.e;
    }

    @Override // com.daaw.rw6
    public final IBinder e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rw6) {
            rw6 rw6Var = (rw6) obj;
            if (this.a.equals(rw6Var.e())) {
                rw6Var.i();
                String str = this.b;
                if (str != null ? str.equals(rw6Var.g()) : rw6Var.g() == null) {
                    if (this.c == rw6Var.c() && Float.floatToIntBits(this.d) == Float.floatToIntBits(rw6Var.a())) {
                        rw6Var.b();
                        rw6Var.h();
                        if (this.e == rw6Var.d()) {
                            String str2 = this.f;
                            String f = rw6Var.f();
                            if (str2 != null ? str2.equals(f) : f == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.daaw.rw6
    public final String f() {
        return this.f;
    }

    @Override // com.daaw.rw6
    public final String g() {
        return this.b;
    }

    @Override // com.daaw.rw6
    public final String h() {
        return null;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003;
        String str = this.b;
        int hashCode2 = (((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c) * 1000003) ^ Float.floatToIntBits(this.d)) * 583896283) ^ this.e) * 1000003;
        String str2 = this.f;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.daaw.rw6
    public final boolean i() {
        return false;
    }

    public final String toString() {
        String obj = this.a.toString();
        String str = this.b;
        int i = this.c;
        float f = this.d;
        int i2 = this.e;
        String str2 = this.f;
        return "OverlayDisplayShowRequest{windowToken=" + obj + ", stableSessionToken=false, appId=" + str + ", layoutGravity=" + i + ", layoutVerticalMargin=" + f + ", displayMode=0, sessionToken=null, windowWidthPx=" + i2 + ", adFieldEnifd=" + str2 + "}";
    }
}
