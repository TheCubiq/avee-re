package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class g66 implements h76 {
    public final String a;
    public final Bundle b;

    public g66(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.a);
        if (this.b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.b);
    }
}
