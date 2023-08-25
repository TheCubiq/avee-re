package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class o26 implements h76 {
    public final double a;
    public final boolean b;

    public o26(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = cj6.a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = cj6.a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.b);
        a2.putDouble("battery_level", this.a);
    }
}
