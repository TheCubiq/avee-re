package com.daaw;
/* loaded from: classes.dex */
public class br0 {

    /* renamed from: a */
    public Class<?> f5066a;

    /* renamed from: b */
    public Class<?> f5067b;

    public br0() {
    }

    public br0(Class<?> cls, Class<?> cls2) {
        m25917a(cls, cls2);
    }

    /* renamed from: a */
    public void m25917a(Class<?> cls, Class<?> cls2) {
        this.f5066a = cls;
        this.f5067b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        br0 br0Var = (br0) obj;
        return this.f5066a.equals(br0Var.f5066a) && this.f5067b.equals(br0Var.f5067b);
    }

    public int hashCode() {
        return (this.f5066a.hashCode() * 31) + this.f5067b.hashCode();
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f5066a + ", second=" + this.f5067b + '}';
    }
}
