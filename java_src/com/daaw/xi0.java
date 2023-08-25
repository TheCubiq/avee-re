package com.daaw;
/* loaded from: classes2.dex */
public class xi0<T> implements b01<T> {

    /* renamed from: c */
    public static final Object f32742c = new Object();

    /* renamed from: a */
    public volatile Object f32743a = f32742c;

    /* renamed from: b */
    public volatile b01<T> f32744b;

    public xi0(b01<T> b01Var) {
        this.f32744b = b01Var;
    }

    @Override // com.daaw.b01
    public T get() {
        T t = (T) this.f32743a;
        Object obj = f32742c;
        if (t == obj) {
            synchronized (this) {
                t = this.f32743a;
                if (t == obj) {
                    t = this.f32744b.get();
                    this.f32743a = t;
                    this.f32744b = null;
                }
            }
        }
        return t;
    }
}
