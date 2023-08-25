package com.daaw;

import java.util.List;
/* loaded from: classes.dex */
public final class xw3 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ f77 f33087a;

    public xw3(yw3 yw3Var, f77 f77Var) {
        this.f33087a = f77Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(Object obj) {
        List list;
        Void r2 = (Void) obj;
        list = yw3.f34191m;
        list.remove(this.f33087a);
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        List list;
        list = yw3.f34191m;
        list.remove(this.f33087a);
    }
}
