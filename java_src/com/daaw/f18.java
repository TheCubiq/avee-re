package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class f18 implements ad8 {
    public final /* synthetic */ p28 a;

    public f18(p28 p28Var) {
        this.a = p28Var;
    }

    @Override // com.daaw.ad8
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.a.q("auto", "_err", bundle);
        } else {
            this.a.t("auto", "_err", bundle, str);
        }
    }
}
