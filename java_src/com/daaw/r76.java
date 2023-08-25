package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class r76 implements h76 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public r76(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.a;
        cj6.f(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.b;
        cj6.e(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle a = cj6.a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = cj6.a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f);
        a2.putBoolean("active_network_metered", this.e);
    }
}
