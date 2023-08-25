package com.daaw;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* loaded from: classes.dex */
public final class in4 implements o67 {
    public final /* synthetic */ jn4 a;

    public in4(jn4 jn4Var) {
        this.a = jn4Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(@NullableDecl Object obj) {
        fw4 fw4Var;
        Void r2 = (Void) obj;
        fw4Var = this.a.f;
        fw4Var.zzh(true);
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        fw4 fw4Var;
        fw4Var = this.a.f;
        fw4Var.zzh(false);
    }
}
