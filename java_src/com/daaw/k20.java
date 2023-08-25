package com.daaw;

import java.io.File;
import java.util.Objects;
/* loaded from: classes.dex */
public class k20<A, T, Z, R> implements ik0<A, T, Z, R> {

    /* renamed from: p */
    public final mq0<A, T> f15608p;

    /* renamed from: q */
    public final i51<Z, R> f15609q;

    /* renamed from: r */
    public final InterfaceC1849jp<T, Z> f15610r;

    public k20(mq0<A, T> mq0Var, i51<Z, R> i51Var, InterfaceC1849jp<T, Z> interfaceC1849jp) {
        Objects.requireNonNull(mq0Var, "ModelLoader must not be null");
        this.f15608p = mq0Var;
        Objects.requireNonNull(i51Var, "Transcoder must not be null");
        this.f15609q = i51Var;
        Objects.requireNonNull(interfaceC1849jp, "DataLoadProvider must not be null");
        this.f15610r = interfaceC1849jp;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: a */
    public InterfaceC3911zw<T> mo6618a() {
        return this.f15610r.mo6618a();
    }

    @Override // com.daaw.ik0
    /* renamed from: b */
    public i51<Z, R> mo18073b() {
        return this.f15609q;
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: c */
    public e51<Z> mo6617c() {
        return this.f15610r.mo6617c();
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: d */
    public d51<T, Z> mo6616d() {
        return this.f15610r.mo6616d();
    }

    @Override // com.daaw.InterfaceC1849jp
    /* renamed from: e */
    public d51<File, Z> mo6615e() {
        return this.f15610r.mo6615e();
    }

    @Override // com.daaw.ik0
    /* renamed from: f */
    public mq0<A, T> mo18072f() {
        return this.f15608p;
    }
}
