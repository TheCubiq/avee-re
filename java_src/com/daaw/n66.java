package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class n66 implements h76 {
    public final String a;

    public n66(String str) {
        this.a = str;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        bundle.putString("query_info", this.a);
    }
}
