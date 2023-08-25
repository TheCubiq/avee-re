package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class y66 implements h76 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;

    public y66(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzba.zzc().b(g93.g3));
        bundle.putInt("target_api", this.e);
        bundle.putInt("dv", this.f);
        bundle.putInt("lv", this.g);
        Bundle a = cj6.a(bundle, "sdk_env");
        a.putBoolean("mf", ((Boolean) ab3.a.e()).booleanValue());
        a.putBoolean("instant_app", this.a);
        a.putBoolean("lite", this.b);
        a.putBoolean("is_privileged_process", this.d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = cj6.a(a, "build_meta");
        a2.putString("cl", "496518605");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
