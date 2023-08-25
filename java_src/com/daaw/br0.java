package com.daaw;
/* loaded from: classes.dex */
public class br0 {
    public Class<?> a;
    public Class<?> b;

    public br0() {
    }

    public br0(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public void a(Class<?> cls, Class<?> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        br0 br0Var = (br0) obj;
        return this.a.equals(br0Var.a) && this.b.equals(br0Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }
}
