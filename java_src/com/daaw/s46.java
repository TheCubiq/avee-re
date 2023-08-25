package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class s46 implements h76 {
    public final sh6 a;

    public s46(sh6 sh6Var) {
        this.a = sh6Var;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        sh6 sh6Var = this.a;
        if (sh6Var != null) {
            bundle.putBoolean("render_in_browser", sh6Var.d());
            bundle.putBoolean("disable_ml", this.a.c());
        }
    }
}
