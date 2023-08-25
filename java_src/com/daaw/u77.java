package com.daaw;

import java.util.Objects;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class u77 extends e77 {

    /* renamed from: r */
    public final Callable f28769r;

    /* renamed from: s */
    public final /* synthetic */ v77 f28770s;

    public u77(v77 v77Var, Callable callable) {
        this.f28770s = v77Var;
        Objects.requireNonNull(callable);
        this.f28769r = callable;
    }

    @Override // com.daaw.e77
    /* renamed from: a */
    public final Object mo8452a() {
        return this.f28769r.call();
    }

    @Override // com.daaw.e77
    /* renamed from: b */
    public final String mo8451b() {
        return this.f28769r.toString();
    }

    @Override // com.daaw.e77
    /* renamed from: d */
    public final void mo8450d(Throwable th) {
        this.f28770s.mo14485i(th);
    }

    @Override // com.daaw.e77
    /* renamed from: e */
    public final void mo8449e(Object obj) {
        this.f28770s.mo14486h(obj);
    }

    @Override // com.daaw.e77
    /* renamed from: f */
    public final boolean mo8448f() {
        return this.f28770s.isDone();
    }
}
