package com.daaw;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes2.dex */
public final class w07 {

    /* renamed from: a */
    public final w07 f30766a;

    /* renamed from: b */
    public final mu2 f30767b;

    /* renamed from: c */
    public final Map f30768c = new HashMap();

    /* renamed from: d */
    public final Map f30769d = new HashMap();

    public w07(w07 w07Var, mu2 mu2Var) {
        this.f30766a = w07Var;
        this.f30767b = mu2Var;
    }

    /* renamed from: a */
    public final w07 m6609a() {
        return new w07(this, this.f30767b);
    }

    /* renamed from: b */
    public final gl2 m6608b(gl2 gl2Var) {
        return this.f30767b.m15761a(this, gl2Var);
    }

    /* renamed from: c */
    public final gl2 m6607c(z72 z72Var) {
        gl2 gl2Var = gl2.f11420g;
        Iterator m2701n = z72Var.m2701n();
        while (m2701n.hasNext()) {
            gl2Var = this.f30767b.m15761a(this, z72Var.m2703k(((Integer) m2701n.next()).intValue()));
            if (gl2Var instanceof oa2) {
                break;
            }
        }
        return gl2Var;
    }

    /* renamed from: d */
    public final gl2 m6606d(String str) {
        if (this.f30768c.containsKey(str)) {
            return (gl2) this.f30768c.get(str);
        }
        w07 w07Var = this.f30766a;
        if (w07Var != null) {
            return w07Var.m6606d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* renamed from: e */
    public final void m6605e(String str, gl2 gl2Var) {
        if (this.f30769d.containsKey(str)) {
            return;
        }
        if (gl2Var == null) {
            this.f30768c.remove(str);
        } else {
            this.f30768c.put(str, gl2Var);
        }
    }

    /* renamed from: f */
    public final void m6604f(String str, gl2 gl2Var) {
        m6605e(str, gl2Var);
        this.f30769d.put(str, Boolean.TRUE);
    }

    /* renamed from: g */
    public final void m6603g(String str, gl2 gl2Var) {
        w07 w07Var;
        if (!this.f30768c.containsKey(str) && (w07Var = this.f30766a) != null && w07Var.m6602h(str)) {
            this.f30766a.m6603g(str, gl2Var);
        } else if (this.f30769d.containsKey(str)) {
        } else {
            if (gl2Var == null) {
                this.f30768c.remove(str);
            } else {
                this.f30768c.put(str, gl2Var);
            }
        }
    }

    /* renamed from: h */
    public final boolean m6602h(String str) {
        if (this.f30768c.containsKey(str)) {
            return true;
        }
        w07 w07Var = this.f30766a;
        if (w07Var != null) {
            return w07Var.m6602h(str);
        }
        return false;
    }
}
