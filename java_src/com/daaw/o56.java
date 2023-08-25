package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class o56 implements h76 {
    public final Bundle a;

    public o56(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
