package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public abstract class rj1<TResult> {
    /* renamed from: a */
    public rj1<TResult> mo11249a(Executor executor, zt0 zt0Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public rj1<TResult> mo11248b(cu0<TResult> cu0Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public rj1<TResult> mo11247c(Executor executor, cu0<TResult> cu0Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract rj1<TResult> mo11246d(Executor executor, gu0 gu0Var);

    /* renamed from: e */
    public abstract rj1<TResult> mo11245e(Executor executor, ku0<? super TResult> ku0Var);

    /* renamed from: f */
    public <TContinuationResult> rj1<TContinuationResult> mo11244f(InterfaceC1587hl<TResult, TContinuationResult> interfaceC1587hl) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: g */
    public <TContinuationResult> rj1<TContinuationResult> mo11243g(Executor executor, InterfaceC1587hl<TResult, TContinuationResult> interfaceC1587hl) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: h */
    public <TContinuationResult> rj1<TContinuationResult> mo11242h(InterfaceC1587hl<TResult, rj1<TContinuationResult>> interfaceC1587hl) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: i */
    public <TContinuationResult> rj1<TContinuationResult> mo11241i(Executor executor, InterfaceC1587hl<TResult, rj1<TContinuationResult>> interfaceC1587hl) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: j */
    public abstract Exception mo11240j();

    /* renamed from: k */
    public abstract TResult mo11239k();

    /* renamed from: l */
    public abstract boolean mo11238l();

    /* renamed from: m */
    public abstract boolean mo11237m();

    /* renamed from: n */
    public abstract boolean mo11236n();

    /* renamed from: o */
    public <TContinuationResult> rj1<TContinuationResult> mo11235o(ai1<TResult, TContinuationResult> ai1Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    /* renamed from: p */
    public <TContinuationResult> rj1<TContinuationResult> mo11234p(Executor executor, ai1<TResult, TContinuationResult> ai1Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
