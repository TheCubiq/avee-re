package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class z16 implements h76 {
    public final String a;
    public final int b;

    public z16(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.a) || this.b == -1) {
            return;
        }
        Bundle a = cj6.a(bundle, "pii");
        bundle.putBundle("pii", a);
        a.putString("pvid", this.a);
        a.putInt("pvid_s", this.b);
    }
}
