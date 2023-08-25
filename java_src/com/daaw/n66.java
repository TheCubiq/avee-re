package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class n66 implements h76 {

    /* renamed from: a */
    public final String f19531a;

    public n66(String str) {
        this.f19531a = str;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.f19531a)) {
            return;
        }
        bundle.putString("query_info", this.f19531a);
    }
}
