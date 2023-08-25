package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class nw1<T1, TResult> {
    public WeakReference<a<T1, TResult>> a = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface a<T1, TResult> {
        TResult b(T1 t1);
    }

    public TResult a(T1 t1, TResult tresult) {
        a<T1, TResult> aVar = this.a.get();
        return aVar != null ? aVar.b(t1) : tresult;
    }

    public nw1<T1, TResult> b(a<T1, TResult> aVar, List<Object> list) {
        list.add(aVar);
        this.a = new WeakReference<>(aVar);
        return this;
    }
}
