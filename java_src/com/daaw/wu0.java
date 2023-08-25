package com.daaw;

import com.daaw.es;
/* loaded from: classes2.dex */
public class wu0<T> implements b01<T>, es<T> {
    public static final es.a<Object> c = new es.a() { // from class: com.daaw.uu0
        @Override // com.daaw.es.a
        public final void a(b01 b01Var) {
            wu0.f(b01Var);
        }
    };
    public static final b01<Object> d = new b01() { // from class: com.daaw.vu0
        @Override // com.daaw.b01
        public final Object get() {
            Object g;
            g = wu0.g();
            return g;
        }
    };
    public es.a<T> a;
    public volatile b01<T> b;

    public wu0(es.a<T> aVar, b01<T> b01Var) {
        this.a = aVar;
        this.b = b01Var;
    }

    public static <T> wu0<T> e() {
        return new wu0<>(c, d);
    }

    public static /* synthetic */ void f(b01 b01Var) {
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    public static /* synthetic */ void h(es.a aVar, es.a aVar2, b01 b01Var) {
        aVar.a(b01Var);
        aVar2.a(b01Var);
    }

    public static <T> wu0<T> i(b01<T> b01Var) {
        return new wu0<>(null, b01Var);
    }

    @Override // com.daaw.es
    public void a(final es.a<T> aVar) {
        b01<T> b01Var;
        b01<T> b01Var2 = this.b;
        b01<Object> b01Var3 = d;
        if (b01Var2 != b01Var3) {
            aVar.a(b01Var2);
            return;
        }
        b01<T> b01Var4 = null;
        synchronized (this) {
            b01Var = this.b;
            if (b01Var != b01Var3) {
                b01Var4 = b01Var;
            } else {
                final es.a<T> aVar2 = this.a;
                this.a = new es.a() { // from class: com.daaw.tu0
                    @Override // com.daaw.es.a
                    public final void a(b01 b01Var5) {
                        wu0.h(es.a.this, aVar, b01Var5);
                    }
                };
            }
        }
        if (b01Var4 != null) {
            aVar.a(b01Var);
        }
    }

    @Override // com.daaw.b01
    public T get() {
        return this.b.get();
    }

    public void j(b01<T> b01Var) {
        es.a<T> aVar;
        if (this.b != d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.a;
            this.a = null;
            this.b = b01Var;
        }
        aVar.a(b01Var);
    }
}
