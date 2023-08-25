package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class i16 implements h76 {

    /* renamed from: a */
    public final Bundle f13179a;

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f13179a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.f13179a);
    }
}
