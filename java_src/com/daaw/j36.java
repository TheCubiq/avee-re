package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class j36 implements h76 {
    public final String a;
    public final String b;
    public final Bundle c;

    public /* synthetic */ j36(String str, String str2, Bundle bundle, i36 i36Var) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.a);
        bundle.putString("fc_consent", this.b);
        bundle.putBundle("iab_consent_info", this.c);
    }
}
