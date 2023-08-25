package com.daaw;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class vl0<T, Y> {

    /* renamed from: b */
    public int f30295b;

    /* renamed from: c */
    public final int f30296c;

    /* renamed from: a */
    public final LinkedHashMap<T, Y> f30294a = new LinkedHashMap<>(100, 0.75f, true);

    /* renamed from: d */
    public int f30297d = 0;

    public vl0(int i) {
        this.f30296c = i;
        this.f30295b = i;
    }

    /* renamed from: d */
    public void m7065d() {
        m7059m(0);
    }

    /* renamed from: f */
    public final void m7064f() {
        m7059m(this.f30295b);
    }

    /* renamed from: g */
    public Y m7063g(T t) {
        return this.f30294a.get(t);
    }

    /* renamed from: h */
    public int m7062h() {
        return this.f30297d;
    }

    /* renamed from: i */
    public int mo3587i(Y y) {
        return 1;
    }

    /* renamed from: j */
    public void mo3586j(T t, Y y) {
    }

    /* renamed from: k */
    public Y m7061k(T t, Y y) {
        if (mo3587i(y) >= this.f30295b) {
            mo3586j(t, y);
            return null;
        }
        Y put = this.f30294a.put(t, y);
        if (y != null) {
            this.f30297d += mo3587i(y);
        }
        if (put != null) {
            this.f30297d -= mo3587i(put);
        }
        m7064f();
        return put;
    }

    /* renamed from: l */
    public Y m7060l(T t) {
        Y remove = this.f30294a.remove(t);
        if (remove != null) {
            this.f30297d -= mo3587i(remove);
        }
        return remove;
    }

    /* renamed from: m */
    public void m7059m(int i) {
        while (this.f30297d > i) {
            Map.Entry<T, Y> next = this.f30294a.entrySet().iterator().next();
            Y value = next.getValue();
            this.f30297d -= mo3587i(value);
            T key = next.getKey();
            this.f30294a.remove(key);
            mo3586j(key, value);
        }
    }
}
