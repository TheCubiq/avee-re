package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class y66 implements h76 {

    /* renamed from: a */
    public final boolean f33391a;

    /* renamed from: b */
    public final boolean f33392b;

    /* renamed from: c */
    public final String f33393c;

    /* renamed from: d */
    public final boolean f33394d;

    /* renamed from: e */
    public final int f33395e;

    /* renamed from: f */
    public final int f33396f;

    /* renamed from: g */
    public final int f33397g;

    public y66(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f33391a = z;
        this.f33392b = z2;
        this.f33393c = str;
        this.f33394d = z3;
        this.f33395e = i;
        this.f33396f = i2;
        this.f33397g = i3;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f33393c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzba.zzc().m23658b(g93.f10691g3));
        bundle.putInt("target_api", this.f33395e);
        bundle.putInt("dv", this.f33396f);
        bundle.putInt("lv", this.f33397g);
        Bundle m25318a = cj6.m25318a(bundle, "sdk_env");
        m25318a.putBoolean("mf", ((Boolean) ab3.f3047a.m16137e()).booleanValue());
        m25318a.putBoolean("instant_app", this.f33391a);
        m25318a.putBoolean("lite", this.f33392b);
        m25318a.putBoolean("is_privileged_process", this.f33394d);
        bundle.putBundle("sdk_env", m25318a);
        Bundle m25318a2 = cj6.m25318a(m25318a, "build_meta");
        m25318a2.putString("cl", "496518605");
        m25318a2.putString("rapid_rc", "dev");
        m25318a2.putString("rapid_rollup", "HEAD");
        m25318a.putBundle("build_meta", m25318a2);
    }
}
