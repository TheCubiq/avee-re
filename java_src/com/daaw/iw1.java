package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class iw1<T1> {
    public WeakReference<a<T1>> a = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface a<T1> {
        void b(T1 t1);
    }

    public void a(T1 t1) {
        a<T1> aVar = this.a.get();
        if (aVar != null) {
            aVar.b(t1);
        }
    }

    public iw1<T1> b(a<T1> aVar, List<Object> list) {
        list.add(aVar);
        this.a = new WeakReference<>(aVar);
        return this;
    }
}
