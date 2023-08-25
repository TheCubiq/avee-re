package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class l46 implements h76 {

    /* renamed from: a */
    public final Bundle f17062a;

    public l46(Bundle bundle) {
        this.f17062a = bundle;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle m25318a = cj6.m25318a(bundle, "device");
        m25318a.putBundle("android_mem_info", this.f17062a);
        bundle.putBundle("device", m25318a);
    }
}
