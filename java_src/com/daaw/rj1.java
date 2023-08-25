package com.daaw;

import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public abstract class rj1<TResult> {
    public rj1<TResult> a(Executor executor, zt0 zt0Var) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public rj1<TResult> b(cu0<TResult> cu0Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public rj1<TResult> c(Executor executor, cu0<TResult> cu0Var) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract rj1<TResult> d(Executor executor, gu0 gu0Var);

    public abstract rj1<TResult> e(Executor executor, ku0<? super TResult> ku0Var);

    public <TContinuationResult> rj1<TContinuationResult> f(hl<TResult, TContinuationResult> hlVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> rj1<TContinuationResult> g(Executor executor, hl<TResult, TContinuationResult> hlVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> rj1<TContinuationResult> h(hl<TResult, rj1<TContinuationResult>> hlVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> rj1<TContinuationResult> i(Executor executor, hl<TResult, rj1<TContinuationResult>> hlVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception j();

    public abstract TResult k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public <TContinuationResult> rj1<TContinuationResult> o(ai1<TResult, TContinuationResult> ai1Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> rj1<TContinuationResult> p(Executor executor, ai1<TResult, TContinuationResult> ai1Var) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
