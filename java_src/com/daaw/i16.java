package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class i16 implements h76 {
    public final Bundle a;

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.a);
    }
}
