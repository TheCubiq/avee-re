package com.daaw;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class vl0<T, Y> {
    public int b;
    public final int c;
    public final LinkedHashMap<T, Y> a = new LinkedHashMap<>(100, 0.75f, true);
    public int d = 0;

    public vl0(int i) {
        this.c = i;
        this.b = i;
    }

    public void d() {
        m(0);
    }

    public final void f() {
        m(this.b);
    }

    public Y g(T t) {
        return this.a.get(t);
    }

    public int h() {
        return this.d;
    }

    public int i(Y y) {
        return 1;
    }

    public void j(T t, Y y) {
    }

    public Y k(T t, Y y) {
        if (i(y) >= this.b) {
            j(t, y);
            return null;
        }
        Y put = this.a.put(t, y);
        if (y != null) {
            this.d += i(y);
        }
        if (put != null) {
            this.d -= i(put);
        }
        f();
        return put;
    }

    public Y l(T t) {
        Y remove = this.a.remove(t);
        if (remove != null) {
            this.d -= i(remove);
        }
        return remove;
    }

    public void m(int i) {
        while (this.d > i) {
            Map.Entry<T, Y> next = this.a.entrySet().iterator().next();
            Y value = next.getValue();
            this.d -= i(value);
            T key = next.getKey();
            this.a.remove(key);
            j(key, value);
        }
    }
}
