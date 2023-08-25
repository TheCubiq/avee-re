package com.daaw;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class gd4 implements mh6 {

    /* renamed from: a */
    public final bb4 f11082a;

    /* renamed from: b */
    public Context f11083b;

    /* renamed from: c */
    public String f11084c;

    public /* synthetic */ gd4(bb4 bb4Var, fd4 fd4Var) {
        this.f11082a = bb4Var;
    }

    @Override // com.daaw.mh6
    /* renamed from: a */
    public final /* synthetic */ mh6 mo16026a(Context context) {
        Objects.requireNonNull(context);
        this.f11083b = context;
        return this;
    }

    @Override // com.daaw.mh6
    public final /* synthetic */ mh6 zza(String str) {
        this.f11084c = str;
        return this;
    }

    @Override // com.daaw.mh6
    public final nh6 zzc() {
        e08.m23800c(this.f11083b, Context.class);
        return new id4(this.f11082a, this.f11083b, this.f11084c, null);
    }
}
