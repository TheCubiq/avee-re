package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class jw1<T1, T2> {
    public WeakReference<a<T1, T2>> a = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface a<T1, T2> {
        void c(T1 t1, T2 t2);
    }

    public void a(T1 t1, T2 t2) {
        a<T1, T2> aVar = this.a.get();
        if (aVar != null) {
            aVar.c(t1, t2);
        }
    }

    public jw1<T1, T2> b(a<T1, T2> aVar, List<Object> list) {
        list.add(aVar);
        this.a = new WeakReference<>(aVar);
        return this;
    }
}
