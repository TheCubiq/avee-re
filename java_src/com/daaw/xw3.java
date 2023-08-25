package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class xw3 implements o67 {
    public final /* synthetic */ f77 a;

    public xw3(yw3 yw3Var, f77 f77Var) {
        this.a = f77Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List list;
        Void r2 = (Void) obj;
        list = yw3.m;
        list.remove(this.a);
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        List list;
        list = yw3.m;
        list.remove(this.a);
    }
}
