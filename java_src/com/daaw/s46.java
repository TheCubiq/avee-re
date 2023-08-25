package com.daaw;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class s46 implements h76 {

    /* renamed from: a */
    public final sh6 f25857a;

    public s46(sh6 sh6Var) {
        this.f25857a = sh6Var;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        sh6 sh6Var = this.f25857a;
        if (sh6Var != null) {
            bundle.putBoolean("render_in_browser", sh6Var.m10339d());
            bundle.putBoolean("disable_ml", this.f25857a.m10340c());
        }
    }
}
