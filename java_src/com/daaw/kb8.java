package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
/* loaded from: classes2.dex */
public final class kb8 implements ad8 {
    public final /* synthetic */ yb8 a;

    public kb8(yb8 yb8Var) {
        this.a = yb8Var;
    }

    @Override // com.daaw.ad8
    public final void a(String str, String str2, Bundle bundle) {
        dr6 dr6Var;
        dr6 dr6Var2;
        if (!TextUtils.isEmpty(str)) {
            this.a.r().z(new hb8(this, str, "_err", bundle));
            return;
        }
        yb8 yb8Var = this.a;
        dr6Var = yb8Var.l;
        if (dr6Var != null) {
            dr6Var2 = yb8Var.l;
            dr6Var2.i().q().b("AppId not known when logging event", "_err");
        }
    }
}
