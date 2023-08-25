package com.daaw;

import java.io.File;
import java.util.Objects;
/* loaded from: classes.dex */
public class k20<A, T, Z, R> implements ik0<A, T, Z, R> {
    public final mq0<A, T> p;
    public final i51<Z, R> q;
    public final jp<T, Z> r;

    public k20(mq0<A, T> mq0Var, i51<Z, R> i51Var, jp<T, Z> jpVar) {
        Objects.requireNonNull(mq0Var, "ModelLoader must not be null");
        this.p = mq0Var;
        Objects.requireNonNull(i51Var, "Transcoder must not be null");
        this.q = i51Var;
        Objects.requireNonNull(jpVar, "DataLoadProvider must not be null");
        this.r = jpVar;
    }

    @Override // com.daaw.jp
    public zw<T> a() {
        return this.r.a();
    }

    @Override // com.daaw.ik0
    public i51<Z, R> b() {
        return this.q;
    }

    @Override // com.daaw.jp
    public e51<Z> c() {
        return this.r.c();
    }

    @Override // com.daaw.jp
    public d51<T, Z> d() {
        return this.r.d();
    }

    @Override // com.daaw.jp
    public d51<File, Z> e() {
        return this.r.e();
    }

    @Override // com.daaw.ik0
    public mq0<A, T> f() {
        return this.p;
    }
}
