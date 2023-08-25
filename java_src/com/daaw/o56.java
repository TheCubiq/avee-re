package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class o56 implements h76 {

    /* renamed from: a */
    public final Bundle f21067a;

    public o56(Bundle bundle) {
        this.f21067a = bundle;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.f21067a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
