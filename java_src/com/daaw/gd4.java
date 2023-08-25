package com.daaw;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class gd4 implements mh6 {
    public final bb4 a;
    public Context b;
    public String c;

    public /* synthetic */ gd4(bb4 bb4Var, fd4 fd4Var) {
        this.a = bb4Var;
    }

    @Override // com.daaw.mh6
    public final /* synthetic */ mh6 a(Context context) {
        Objects.requireNonNull(context);
        this.b = context;
        return this;
    }

    @Override // com.daaw.mh6
    public final /* synthetic */ mh6 zza(String str) {
        this.c = str;
        return this;
    }

    @Override // com.daaw.mh6
    public final nh6 zzc() {
        e08.c(this.b, Context.class);
        return new id4(this.a, this.b, this.c, null);
    }
}
