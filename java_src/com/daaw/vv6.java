package com.daaw;

import android.os.IBinder;
/* loaded from: classes.dex */
public final class vv6 extends rw6 {

    /* renamed from: a */
    public final IBinder f30659a;

    /* renamed from: b */
    public final String f30660b;

    /* renamed from: c */
    public final int f30661c;

    /* renamed from: d */
    public final float f30662d;

    /* renamed from: e */
    public final int f30663e;

    /* renamed from: f */
    public final String f30664f;

    public /* synthetic */ vv6(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, uv6 uv6Var) {
        this.f30659a = iBinder;
        this.f30660b = str;
        this.f30661c = i;
        this.f30662d = f;
        this.f30663e = i3;
        this.f30664f = str3;
    }

    @Override // com.daaw.rw6
    /* renamed from: a */
    public final float mo6736a() {
        return this.f30662d;
    }

    @Override // com.daaw.rw6
    /* renamed from: b */
    public final int mo6735b() {
        return 0;
    }

    @Override // com.daaw.rw6
    /* renamed from: c */
    public final int mo6734c() {
        return this.f30661c;
    }

    @Override // com.daaw.rw6
    /* renamed from: d */
    public final int mo6733d() {
        return this.f30663e;
    }

    @Override // com.daaw.rw6
    /* renamed from: e */
    public final IBinder mo6732e() {
        return this.f30659a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rw6) {
            rw6 rw6Var = (rw6) obj;
            if (this.f30659a.equals(rw6Var.mo6732e())) {
                rw6Var.mo6728i();
                String str = this.f30660b;
                if (str != null ? str.equals(rw6Var.mo6730g()) : rw6Var.mo6730g() == null) {
                    if (this.f30661c == rw6Var.mo6734c() && Float.floatToIntBits(this.f30662d) == Float.floatToIntBits(rw6Var.mo6736a())) {
                        rw6Var.mo6735b();
                        rw6Var.mo6729h();
                        if (this.f30663e == rw6Var.mo6733d()) {
                            String str2 = this.f30664f;
                            String mo6731f = rw6Var.mo6731f();
                            if (str2 != null ? str2.equals(mo6731f) : mo6731f == null) {
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
    /* renamed from: f */
    public final String mo6731f() {
        return this.f30664f;
    }

    @Override // com.daaw.rw6
    /* renamed from: g */
    public final String mo6730g() {
        return this.f30660b;
    }

    @Override // com.daaw.rw6
    /* renamed from: h */
    public final String mo6729h() {
        return null;
    }

    public final int hashCode() {
        int hashCode = (((this.f30659a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003;
        String str = this.f30660b;
        int hashCode2 = (((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f30661c) * 1000003) ^ Float.floatToIntBits(this.f30662d)) * 583896283) ^ this.f30663e) * 1000003;
        String str2 = this.f30664f;
        return hashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.daaw.rw6
    /* renamed from: i */
    public final boolean mo6728i() {
        return false;
    }

    public final String toString() {
        String obj = this.f30659a.toString();
        String str = this.f30660b;
        int i = this.f30661c;
        float f = this.f30662d;
        int i2 = this.f30663e;
        String str2 = this.f30664f;
        return "OverlayDisplayShowRequest{windowToken=" + obj + ", stableSessionToken=false, appId=" + str + ", layoutGravity=" + i + ", layoutVerticalMargin=" + f + ", displayMode=0, sessionToken=null, windowWidthPx=" + i2 + ", adFieldEnifd=" + str2 + "}";
    }
}
