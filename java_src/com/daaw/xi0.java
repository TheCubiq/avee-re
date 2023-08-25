package com.daaw;
/* loaded from: classes2.dex */
public class xi0<T> implements b01<T> {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile b01<T> b;

    public xi0(b01<T> b01Var) {
        this.b = b01Var;
    }

    @Override // com.daaw.b01
    public T get() {
        T t = (T) this.a;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.a;
                if (t == obj) {
                    t = this.b.get();
                    this.a = t;
                    this.b = null;
                }
            }
        }
        return t;
    }
}
