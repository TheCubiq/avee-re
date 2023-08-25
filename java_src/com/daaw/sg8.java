package com.daaw;
/* loaded from: classes2.dex */
public final class sg8 extends og8 {
    @Override // com.daaw.og8
    public final /* synthetic */ int a(Object obj) {
        return ((qg8) obj).a();
    }

    @Override // com.daaw.og8
    public final /* synthetic */ int b(Object obj) {
        return ((qg8) obj).b();
    }

    @Override // com.daaw.og8
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        ja8 ja8Var = (ja8) obj;
        qg8 qg8Var = ja8Var.zzc;
        if (qg8Var == qg8.c()) {
            qg8 f = qg8.f();
            ja8Var.zzc = f;
            return f;
        }
        return qg8Var;
    }

    @Override // com.daaw.og8
    public final /* synthetic */ Object d(Object obj) {
        return ((ja8) obj).zzc;
    }

    @Override // com.daaw.og8
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (qg8.c().equals(obj2)) {
            return obj;
        }
        qg8 qg8Var = (qg8) obj2;
        if (qg8.c().equals(obj)) {
            return qg8.e((qg8) obj, qg8Var);
        }
        ((qg8) obj).d(qg8Var);
        return obj;
    }

    @Override // com.daaw.og8
    public final /* bridge */ /* synthetic */ void f(Object obj, int i, long j) {
        ((qg8) obj).j(i << 3, Long.valueOf(j));
    }

    @Override // com.daaw.og8
    public final void g(Object obj) {
        ((ja8) obj).zzc.h();
    }

    @Override // com.daaw.og8
    public final /* synthetic */ void h(Object obj, Object obj2) {
        ((ja8) obj).zzc = (qg8) obj2;
    }

    @Override // com.daaw.og8
    public final /* synthetic */ void i(Object obj, ki8 ki8Var) {
        ((qg8) obj).k(ki8Var);
    }
}
