package com.daaw;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class pb4 implements cc6 {
    public final bb4 a;
    public Context b;
    public String c;

    public /* synthetic */ pb4(bb4 bb4Var, ob4 ob4Var) {
        this.a = bb4Var;
    }

    @Override // com.daaw.cc6
    public final /* synthetic */ cc6 a(Context context) {
        Objects.requireNonNull(context);
        this.b = context;
        return this;
    }

    @Override // com.daaw.cc6
    public final /* synthetic */ cc6 zza(String str) {
        Objects.requireNonNull(str);
        this.c = str;
        return this;
    }

    @Override // com.daaw.cc6
    public final dc6 zzc() {
        e08.c(this.b, Context.class);
        e08.c(this.c, String.class);
        return new rb4(this.a, this.b, this.c, null);
    }
}
