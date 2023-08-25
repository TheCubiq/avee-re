package com.daaw;
/* loaded from: classes.dex */
public final class vv7 extends tv7 {
    @Override // com.daaw.tv7
    public final /* synthetic */ int a(Object obj) {
        return ((uv7) obj).a();
    }

    @Override // com.daaw.tv7
    public final /* synthetic */ int b(Object obj) {
        return ((uv7) obj).b();
    }

    @Override // com.daaw.tv7
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        ls7 ls7Var = (ls7) obj;
        uv7 uv7Var = ls7Var.zzc;
        if (uv7Var == uv7.c()) {
            uv7 f = uv7.f();
            ls7Var.zzc = f;
            return f;
        }
        return uv7Var;
    }

    @Override // com.daaw.tv7
    public final /* synthetic */ Object d(Object obj) {
        return ((ls7) obj).zzc;
    }

    @Override // com.daaw.tv7
    public final /* bridge */ /* synthetic */ Object e(Object obj, Object obj2) {
        if (uv7.c().equals(obj2)) {
            return obj;
        }
        uv7 uv7Var = (uv7) obj2;
        if (uv7.c().equals(obj)) {
            return uv7.e((uv7) obj, uv7Var);
        }
        ((uv7) obj).d(uv7Var);
        return obj;
    }

    @Override // com.daaw.tv7
    public final /* synthetic */ Object f() {
        return uv7.f();
    }

    @Override // com.daaw.tv7
    public final /* synthetic */ Object g(Object obj) {
        ((uv7) obj).h();
        return obj;
    }

    @Override // com.daaw.tv7
    public final /* bridge */ /* synthetic */ void h(Object obj, int i, int i2) {
        ((uv7) obj).j((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.daaw.tv7
    public final /* bridge */ /* synthetic */ void i(Object obj, int i, long j) {
        ((uv7) obj).j((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.daaw.tv7
    public final /* bridge */ /* synthetic */ void j(Object obj, int i, Object obj2) {
        ((uv7) obj).j((i << 3) | 3, obj2);
    }

    @Override // com.daaw.tv7
    public final /* bridge */ /* synthetic */ void k(Object obj, int i, yq7 yq7Var) {
        ((uv7) obj).j((i << 3) | 2, yq7Var);
    }

    @Override // com.daaw.tv7
    public final /* bridge */ /* synthetic */ void l(Object obj, int i, long j) {
        ((uv7) obj).j(i << 3, Long.valueOf(j));
    }

    @Override // com.daaw.tv7
    public final void m(Object obj) {
        ((ls7) obj).zzc.h();
    }

    @Override // com.daaw.tv7
    public final /* synthetic */ void n(Object obj, Object obj2) {
        ((ls7) obj).zzc = (uv7) obj2;
    }

    @Override // com.daaw.tv7
    public final /* synthetic */ void o(Object obj, Object obj2) {
        ((ls7) obj).zzc = (uv7) obj2;
    }

    @Override // com.daaw.tv7
    public final boolean q(iu7 iu7Var) {
        return false;
    }

    @Override // com.daaw.tv7
    public final /* synthetic */ void r(Object obj, rr7 rr7Var) {
        ((uv7) obj).k(rr7Var);
    }
}
