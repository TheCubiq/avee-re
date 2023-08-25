package com.daaw;

import com.daaw.C1897k3;
import com.daaw.C1897k3.InterfaceC1901d;
/* renamed from: com.daaw.o3 */
/* loaded from: classes.dex */
public final class C2396o3<O extends C1897k3.InterfaceC1901d> {

    /* renamed from: a */
    public final int f20971a;

    /* renamed from: b */
    public final C1897k3<O> f20972b;

    /* renamed from: c */
    public final O f20973c;

    /* renamed from: d */
    public final String f20974d;

    public C2396o3(C1897k3<O> c1897k3, O o, String str) {
        this.f20972b = c1897k3;
        this.f20973c = o;
        this.f20974d = str;
        this.f20971a = ot0.m13980b(c1897k3, o, str);
    }

    /* renamed from: a */
    public static <O extends C1897k3.InterfaceC1901d> C2396o3<O> m14600a(C1897k3<O> c1897k3, O o, String str) {
        return new C2396o3<>(c1897k3, o, str);
    }

    /* renamed from: b */
    public final String m14599b() {
        return this.f20972b.m18069b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2396o3) {
            C2396o3 c2396o3 = (C2396o3) obj;
            return ot0.m13981a(this.f20972b, c2396o3.f20972b) && ot0.m13981a(this.f20973c, c2396o3.f20973c) && ot0.m13981a(this.f20974d, c2396o3.f20974d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20971a;
    }
}
