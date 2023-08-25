package com.daaw;
/* loaded from: classes.dex */
public final class nv6 extends c57 {
    public Object w;

    public nv6(Object obj) {
        this.w = obj;
    }

    @Override // com.daaw.c57
    public final String e() {
        Object obj = this.w;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.daaw.c57
    public final void g() {
        this.w = null;
    }

    @Override // com.daaw.c57
    public final boolean h(Object obj) {
        return super.h(obj);
    }

    @Override // com.daaw.c57
    public final boolean i(Throwable th) {
        return super.i(th);
    }
}
