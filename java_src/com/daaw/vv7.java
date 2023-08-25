package com.daaw;
/* loaded from: classes.dex */
public final class vv7 extends tv7 {
    @Override // com.daaw.tv7
    /* renamed from: a */
    public final /* synthetic */ int mo6727a(Object obj) {
        return ((uv7) obj).m7681a();
    }

    @Override // com.daaw.tv7
    /* renamed from: b */
    public final /* synthetic */ int mo6726b(Object obj) {
        return ((uv7) obj).m7680b();
    }

    @Override // com.daaw.tv7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo6725c(Object obj) {
        ls7 ls7Var = (ls7) obj;
        uv7 uv7Var = ls7Var.zzc;
        if (uv7Var == uv7.m7679c()) {
            uv7 m7676f = uv7.m7676f();
            ls7Var.zzc = m7676f;
            return m7676f;
        }
        return uv7Var;
    }

    @Override // com.daaw.tv7
    /* renamed from: d */
    public final /* synthetic */ Object mo6724d(Object obj) {
        return ((ls7) obj).zzc;
    }

    @Override // com.daaw.tv7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo6723e(Object obj, Object obj2) {
        if (uv7.m7679c().equals(obj2)) {
            return obj;
        }
        uv7 uv7Var = (uv7) obj2;
        if (uv7.m7679c().equals(obj)) {
            return uv7.m7677e((uv7) obj, uv7Var);
        }
        ((uv7) obj).m7678d(uv7Var);
        return obj;
    }

    @Override // com.daaw.tv7
    /* renamed from: f */
    public final /* synthetic */ Object mo6722f() {
        return uv7.m7676f();
    }

    @Override // com.daaw.tv7
    /* renamed from: g */
    public final /* synthetic */ Object mo6721g(Object obj) {
        ((uv7) obj).m7674h();
        return obj;
    }

    @Override // com.daaw.tv7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo6720h(Object obj, int i, int i2) {
        ((uv7) obj).m7672j((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.daaw.tv7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo6719i(Object obj, int i, long j) {
        ((uv7) obj).m7672j((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.daaw.tv7
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo6718j(Object obj, int i, Object obj2) {
        ((uv7) obj).m7672j((i << 3) | 3, obj2);
    }

    @Override // com.daaw.tv7
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ void mo6717k(Object obj, int i, yq7 yq7Var) {
        ((uv7) obj).m7672j((i << 3) | 2, yq7Var);
    }

    @Override // com.daaw.tv7
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ void mo6716l(Object obj, int i, long j) {
        ((uv7) obj).m7672j(i << 3, Long.valueOf(j));
    }

    @Override // com.daaw.tv7
    /* renamed from: m */
    public final void mo6715m(Object obj) {
        ((ls7) obj).zzc.m7674h();
    }

    @Override // com.daaw.tv7
    /* renamed from: n */
    public final /* synthetic */ void mo6714n(Object obj, Object obj2) {
        ((ls7) obj).zzc = (uv7) obj2;
    }

    @Override // com.daaw.tv7
    /* renamed from: o */
    public final /* synthetic */ void mo6713o(Object obj, Object obj2) {
        ((ls7) obj).zzc = (uv7) obj2;
    }

    @Override // com.daaw.tv7
    /* renamed from: q */
    public final boolean mo6712q(iu7 iu7Var) {
        return false;
    }

    @Override // com.daaw.tv7
    /* renamed from: r */
    public final /* synthetic */ void mo6711r(Object obj, rr7 rr7Var) {
        ((uv7) obj).m7671k(rr7Var);
    }
}
