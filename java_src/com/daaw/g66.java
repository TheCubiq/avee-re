package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class g66 implements h76 {

    /* renamed from: a */
    public final String f10308a;

    /* renamed from: b */
    public final Bundle f10309b;

    public g66(String str, Bundle bundle) {
        this.f10308a = str;
        this.f10309b = bundle;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.f10308a);
        if (this.f10309b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.f10309b);
    }
}
