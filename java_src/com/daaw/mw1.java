package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class mw1<TResult> {
    public WeakReference<a<TResult>> a = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface a<TResult> {
        TResult a();
    }

    public TResult a(TResult tresult) {
        a<TResult> aVar = this.a.get();
        return aVar != null ? aVar.a() : tresult;
    }

    public mw1<TResult> b(a<TResult> aVar, List<Object> list) {
        list.add(aVar);
        this.a = new WeakReference<>(aVar);
        return this;
    }
}
