package com.daaw;

import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes.dex */
public class hw1 {
    public WeakReference<a> a = new WeakReference<>(null);

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public void a() {
        a aVar = this.a.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    public hw1 b(a aVar, List<Object> list) {
        list.add(aVar);
        this.a = new WeakReference<>(aVar);
        return this;
    }
}
