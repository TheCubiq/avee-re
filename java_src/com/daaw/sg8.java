package com.daaw;
/* loaded from: classes2.dex */
public final class sg8 extends og8 {
    @Override // com.daaw.og8
    /* renamed from: a */
    public final /* synthetic */ int mo10364a(Object obj) {
        return ((qg8) obj).m12546a();
    }

    @Override // com.daaw.og8
    /* renamed from: b */
    public final /* synthetic */ int mo10363b(Object obj) {
        return ((qg8) obj).m12545b();
    }

    @Override // com.daaw.og8
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo10362c(Object obj) {
        ja8 ja8Var = (ja8) obj;
        qg8 qg8Var = ja8Var.zzc;
        if (qg8Var == qg8.m12544c()) {
            qg8 m12541f = qg8.m12541f();
            ja8Var.zzc = m12541f;
            return m12541f;
        }
        return qg8Var;
    }

    @Override // com.daaw.og8
    /* renamed from: d */
    public final /* synthetic */ Object mo10361d(Object obj) {
        return ((ja8) obj).zzc;
    }

    @Override // com.daaw.og8
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo10360e(Object obj, Object obj2) {
        if (qg8.m12544c().equals(obj2)) {
            return obj;
        }
        qg8 qg8Var = (qg8) obj2;
        if (qg8.m12544c().equals(obj)) {
            return qg8.m12542e((qg8) obj, qg8Var);
        }
        ((qg8) obj).m12543d(qg8Var);
        return obj;
    }

    @Override // com.daaw.og8
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo10359f(Object obj, int i, long j) {
        ((qg8) obj).m12537j(i << 3, Long.valueOf(j));
    }

    @Override // com.daaw.og8
    /* renamed from: g */
    public final void mo10358g(Object obj) {
        ((ja8) obj).zzc.m12539h();
    }

    @Override // com.daaw.og8
    /* renamed from: h */
    public final /* synthetic */ void mo10357h(Object obj, Object obj2) {
        ((ja8) obj).zzc = (qg8) obj2;
    }

    @Override // com.daaw.og8
    /* renamed from: i */
    public final /* synthetic */ void mo10356i(Object obj, ki8 ki8Var) {
        ((qg8) obj).m12536k(ki8Var);
    }
}
