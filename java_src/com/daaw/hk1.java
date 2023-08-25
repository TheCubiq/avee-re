package com.daaw;

import android.os.Bundle;
import com.daaw.C1897k3;
/* loaded from: classes.dex */
public class hk1 implements C1897k3.InterfaceC1901d {

    /* renamed from: c */
    public static final hk1 f12624c = m20657c().m20655a();

    /* renamed from: b */
    public final String f12625b;

    /* renamed from: com.daaw.hk1$a */
    /* loaded from: classes.dex */
    public static class C1586a {

        /* renamed from: a */
        public String f12626a;

        public /* synthetic */ C1586a(qz1 qz1Var) {
        }

        /* renamed from: a */
        public hk1 m20655a() {
            return new hk1(this.f12626a, null);
        }
    }

    public /* synthetic */ hk1(String str, sz1 sz1Var) {
        this.f12625b = str;
    }

    /* renamed from: c */
    public static C1586a m20657c() {
        return new C1586a(null);
    }

    /* renamed from: d */
    public final Bundle m20656d() {
        Bundle bundle = new Bundle();
        String str = this.f12625b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hk1) {
            return ot0.m13981a(this.f12625b, ((hk1) obj).f12625b);
        }
        return false;
    }

    public final int hashCode() {
        return ot0.m13980b(this.f12625b);
    }
}
