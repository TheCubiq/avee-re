package com.daaw;
/* loaded from: classes.dex */
public class fy0<T> extends dy0<T> {
    public final Object c;

    public fy0(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // com.daaw.dy0, com.daaw.by0
    public boolean a(T t) {
        boolean a;
        synchronized (this.c) {
            a = super.a(t);
        }
        return a;
    }

    @Override // com.daaw.dy0, com.daaw.by0
    public T b() {
        T t;
        synchronized (this.c) {
            t = (T) super.b();
        }
        return t;
    }
}
