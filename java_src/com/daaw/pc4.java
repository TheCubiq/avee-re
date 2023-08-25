package com.daaw;

import android.content.Context;
import java.util.Objects;
/* loaded from: classes.dex */
public final class pc4 implements if5 {

    /* renamed from: a */
    public final bb4 f22832a;

    /* renamed from: b */
    public Context f22833b;

    /* renamed from: c */
    public zh3 f22834c;

    public /* synthetic */ pc4(bb4 bb4Var, oc4 oc4Var) {
        this.f22832a = bb4Var;
    }

    @Override // com.daaw.if5
    /* renamed from: a */
    public final /* synthetic */ if5 mo13451a(Context context) {
        Objects.requireNonNull(context);
        this.f22833b = context;
        return this;
    }

    @Override // com.daaw.if5
    /* renamed from: b */
    public final /* synthetic */ if5 mo13450b(zh3 zh3Var) {
        Objects.requireNonNull(zh3Var);
        this.f22834c = zh3Var;
        return this;
    }

    @Override // com.daaw.if5
    public final jf5 zzc() {
        e08.m23800c(this.f22833b, Context.class);
        e08.m23800c(this.f22834c, zh3.class);
        return new rc4(this.f22832a, this.f22833b, this.f22834c, null);
    }
}
