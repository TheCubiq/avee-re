package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class o26 implements h76 {

    /* renamed from: a */
    public final double f20967a;

    /* renamed from: b */
    public final boolean f20968b;

    public o26(double d, boolean z) {
        this.f20967a = d;
        this.f20968b = z;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle m25318a = cj6.m25318a(bundle, "device");
        bundle.putBundle("device", m25318a);
        Bundle m25318a2 = cj6.m25318a(m25318a, "battery");
        m25318a.putBundle("battery", m25318a2);
        m25318a2.putBoolean("is_charging", this.f20968b);
        m25318a2.putDouble("battery_level", this.f20967a);
    }
}
