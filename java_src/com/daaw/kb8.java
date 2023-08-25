package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class kb8 implements ad8 {

    /* renamed from: a */
    public final /* synthetic */ yb8 f16131a;

    public kb8(yb8 yb8Var) {
        this.f16131a = yb8Var;
    }

    @Override // com.daaw.ad8
    /* renamed from: a */
    public final void mo17832a(String str, String str2, Bundle bundle) {
        dr6 dr6Var;
        dr6 dr6Var2;
        if (!TextUtils.isEmpty(str)) {
            this.f16131a.mo3882r().m6978z(new hb8(this, str, "_err", bundle));
            return;
        }
        yb8 yb8Var = this.f16131a;
        dr6Var = yb8Var.f33501l;
        if (dr6Var != null) {
            dr6Var2 = yb8Var.f33501l;
            dr6Var2.mo3895i().m14160q().m20652b("AppId not known when logging event", "_err");
        }
    }
}
