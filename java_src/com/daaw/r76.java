package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class r76 implements h76 {

    /* renamed from: a */
    public final String f24940a;

    /* renamed from: b */
    public final int f24941b;

    /* renamed from: c */
    public final int f24942c;

    /* renamed from: d */
    public final int f24943d;

    /* renamed from: e */
    public final boolean f24944e;

    /* renamed from: f */
    public final int f24945f;

    public r76(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f24940a = str;
        this.f24941b = i;
        this.f24942c = i2;
        this.f24943d = i3;
        this.f24944e = z;
        this.f24945f = i4;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f24940a;
        cj6.m25313f(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.f24941b;
        cj6.m25314e(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f24942c);
        bundle.putInt("pt", this.f24943d);
        Bundle m25318a = cj6.m25318a(bundle, "device");
        bundle.putBundle("device", m25318a);
        Bundle m25318a2 = cj6.m25318a(m25318a, "network");
        m25318a.putBundle("network", m25318a2);
        m25318a2.putInt("active_network_state", this.f24945f);
        m25318a2.putBoolean("active_network_metered", this.f24944e);
    }
}
