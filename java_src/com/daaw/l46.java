package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class l46 implements h76 {
    public final Bundle a;

    public l46(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = cj6.a(bundle, "device");
        a.putBundle("android_mem_info", this.a);
        bundle.putBundle("device", a);
    }
}
