package com.daaw;
/* loaded from: classes.dex */
public final class ir8 extends xq8 {

    /* renamed from: f */
    public static final Object f13958f = new Object();

    /* renamed from: d */
    public final Object f13959d;

    /* renamed from: e */
    public final Object f13960e;

    public ir8(l64 l64Var, Object obj, Object obj2) {
        super(l64Var);
        this.f13959d = obj;
        this.f13960e = obj2;
    }

    /* renamed from: q */
    public static ir8 m19474q(f53 f53Var) {
        return new ir8(new jr8(f53Var), i54.f13263o, f13958f);
    }

    /* renamed from: r */
    public static ir8 m19473r(l64 l64Var, Object obj, Object obj2) {
        return new ir8(l64Var, obj, obj2);
    }

    @Override // com.daaw.xq8, com.daaw.l64
    /* renamed from: a */
    public final int mo4511a(Object obj) {
        Object obj2;
        l64 l64Var = this.f32892c;
        if (f13958f.equals(obj) && (obj2 = this.f13960e) != null) {
            obj = obj2;
        }
        return l64Var.mo4511a(obj);
    }

    @Override // com.daaw.l64
    /* renamed from: d */
    public final d34 mo1924d(int i, d34 d34Var, boolean z) {
        this.f32892c.mo1924d(i, d34Var, z);
        if (it5.m19376t(d34Var.f6449b, this.f13960e) && z) {
            d34Var.f6449b = f13958f;
        }
        return d34Var;
    }

    @Override // com.daaw.l64
    /* renamed from: e */
    public final i54 mo1923e(int i, i54 i54Var, long j) {
        this.f32892c.mo1923e(i, i54Var, j);
        if (it5.m19376t(i54Var.f13267a, this.f13959d)) {
            i54Var.f13267a = i54.f13263o;
        }
        return i54Var;
    }

    @Override // com.daaw.xq8, com.daaw.l64
    /* renamed from: f */
    public final Object mo4508f(int i) {
        Object mo4508f = this.f32892c.mo4508f(i);
        return it5.m19376t(mo4508f, this.f13960e) ? f13958f : mo4508f;
    }

    /* renamed from: p */
    public final ir8 m19475p(l64 l64Var) {
        return new ir8(l64Var, this.f13959d, this.f13960e);
    }
}
