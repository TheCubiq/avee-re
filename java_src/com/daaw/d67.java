package com.daaw;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class d67 extends e67 {

    /* renamed from: t */
    public final Callable f6563t;

    /* renamed from: u */
    public final /* synthetic */ f67 f6564u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d67(f67 f67Var, Callable callable, Executor executor) {
        super(f67Var, executor);
        this.f6564u = f67Var;
        Objects.requireNonNull(callable);
        this.f6563t = callable;
    }

    @Override // com.daaw.e77
    /* renamed from: a */
    public final Object mo8452a() {
        return this.f6563t.call();
    }

    @Override // com.daaw.e77
    /* renamed from: b */
    public final String mo8451b() {
        return this.f6563t.toString();
    }

    @Override // com.daaw.e67
    /* renamed from: h */
    public final void mo23698h(Object obj) {
        this.f6564u.mo14486h(obj);
    }
}
