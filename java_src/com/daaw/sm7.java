package com.daaw;

import android.util.Log;
/* loaded from: classes2.dex */
public final class sm7 implements uf5 {
    public final /* synthetic */ dr6 a;

    public sm7(vn7 vn7Var, dr6 dr6Var) {
        this.a = dr6Var;
    }

    @Override // com.daaw.uf5
    public final boolean zza() {
        return this.a.p() && Log.isLoggable(this.a.i().C(), 3);
    }
}
