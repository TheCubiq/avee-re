package com.daaw;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class pc4 implements if5 {
    public final bb4 a;
    public Context b;
    public zh3 c;

    public /* synthetic */ pc4(bb4 bb4Var, oc4 oc4Var) {
        this.a = bb4Var;
    }

    @Override // com.daaw.if5
    public final /* synthetic */ if5 a(Context context) {
        Objects.requireNonNull(context);
        this.b = context;
        return this;
    }

    @Override // com.daaw.if5
    public final /* synthetic */ if5 b(zh3 zh3Var) {
        Objects.requireNonNull(zh3Var);
        this.c = zh3Var;
        return this;
    }

    @Override // com.daaw.if5
    public final jf5 zzc() {
        e08.c(this.b, Context.class);
        e08.c(this.c, zh3.class);
        return new rc4(this.a, this.b, this.c, null);
    }
}
