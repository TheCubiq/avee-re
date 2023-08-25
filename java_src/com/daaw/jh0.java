package com.daaw;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class jh0<T> {
    public Object a;
    public List<T> b = new ArrayList();

    /* loaded from: classes.dex */
    public static class a<T> {
        public sd0 a;
        public T b;

        public a(sd0 sd0Var, T t) {
            q6.f(sd0Var);
            q6.f(t);
            this.a = sd0Var;
            this.b = t;
        }

        public sd0 c() {
            return this.a;
        }

        public T d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode() + this.b.hashCode();
        }
    }

    public jh0(Object obj) {
        q6.f(obj);
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(a<T> aVar) {
        if (this.a.equals(aVar.a) && !this.b.contains(aVar.b)) {
            this.b.add(aVar.b);
        }
    }

    public boolean b(T t) {
        return this.b.contains(t);
    }

    public void c(a<T> aVar) {
        if (this.a.equals(aVar.a)) {
            this.b.remove(aVar.b);
        }
    }
}
