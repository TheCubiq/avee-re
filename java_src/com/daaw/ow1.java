package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class ow1<T1, T2, TResult> {
    public WeakReference<a<T1, T2, TResult>> a = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface a<T1, T2, TResult> {
        TResult c(T1 t1, T2 t2);
    }

    public TResult a(T1 t1, T2 t2, TResult tresult) {
        a<T1, T2, TResult> aVar = this.a.get();
        return aVar != null ? aVar.c(t1, t2) : tresult;
    }

    public ow1<T1, T2, TResult> b(a<T1, T2, TResult> aVar, List<Object> list) {
        list.add(aVar);
        this.a = new WeakReference<>(aVar);
        return this;
    }
}
