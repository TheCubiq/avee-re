package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class j36 implements h76 {

    /* renamed from: a */
    public final String f14216a;

    /* renamed from: b */
    public final String f14217b;

    /* renamed from: c */
    public final Bundle f14218c;

    public /* synthetic */ j36(String str, String str2, Bundle bundle, i36 i36Var) {
        this.f14216a = str;
        this.f14217b = str2;
        this.f14218c = bundle;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f14216a);
        bundle.putString("fc_consent", this.f14217b);
        bundle.putBundle("iab_consent_info", this.f14218c);
    }
}
