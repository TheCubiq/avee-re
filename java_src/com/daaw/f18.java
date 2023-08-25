package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class f18 implements ad8 {

    /* renamed from: a */
    public final /* synthetic */ p28 f9011a;

    public f18(p28 p28Var) {
        this.f9011a = p28Var;
    }

    @Override // com.daaw.ad8
    /* renamed from: a */
    public final void mo17832a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f9011a.m13686q("auto", "_err", bundle);
        } else {
            this.f9011a.m13684t("auto", "_err", bundle, str);
        }
    }
}
