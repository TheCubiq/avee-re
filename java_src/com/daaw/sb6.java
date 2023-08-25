package com.daaw;

import android.content.Context;
/* loaded from: classes.dex */
public final class sb6 implements m36 {
    public final Context a;
    public final m36 b;

    public sb6(Context context) {
        yd6 yd6Var = new yd6();
        this.a = context.getApplicationContext();
        this.b = yd6Var;
    }

    @Override // com.daaw.m36
    public final /* bridge */ /* synthetic */ p46 zza() {
        return new vc6(this.a, ((yd6) this.b).zza());
    }
}
