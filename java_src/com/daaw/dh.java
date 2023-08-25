package com.daaw;

import com.daaw.nl;
import java.io.Serializable;
/* loaded from: classes2.dex */
public final class dh implements nl, Serializable {
    public final nl p;
    public final nl.b q;

    /* loaded from: classes2.dex */
    public static final class a extends si0 implements n50<String, nl.b, String> {
        public static final a q = new a();

        public a() {
            super(2);
        }

        @Override // com.daaw.n50
        /* renamed from: d */
        public final String c(String str, nl.b bVar) {
            ug0.f(str, "acc");
            ug0.f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public dh(nl nlVar, nl.b bVar) {
        ug0.f(nlVar, "left");
        ug0.f(bVar, "element");
        this.p = nlVar;
        this.q = bVar;
    }

    public final boolean a(nl.b bVar) {
        return ug0.a(get(bVar.getKey()), bVar);
    }

    public final boolean b(dh dhVar) {
        while (a(dhVar.q)) {
            nl nlVar = dhVar.p;
            if (!(nlVar instanceof dh)) {
                ug0.d(nlVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((nl.b) nlVar);
            }
            dhVar = (dh) nlVar;
        }
        return false;
    }

    public final int c() {
        int i = 2;
        dh dhVar = this;
        while (true) {
            nl nlVar = dhVar.p;
            dhVar = nlVar instanceof dh ? (dh) nlVar : null;
            if (dhVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dh) {
                dh dhVar = (dh) obj;
                if (dhVar.c() != c() || !dhVar.b(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.daaw.nl
    public <R> R fold(R r, n50<? super R, ? super nl.b, ? extends R> n50Var) {
        ug0.f(n50Var, "operation");
        return n50Var.c((Object) this.p.fold(r, n50Var), this.q);
    }

    @Override // com.daaw.nl
    public <E extends nl.b> E get(nl.c<E> cVar) {
        ug0.f(cVar, "key");
        dh dhVar = this;
        while (true) {
            E e = (E) dhVar.q.get(cVar);
            if (e != null) {
                return e;
            }
            nl nlVar = dhVar.p;
            if (!(nlVar instanceof dh)) {
                return (E) nlVar.get(cVar);
            }
            dhVar = (dh) nlVar;
        }
    }

    public int hashCode() {
        return this.p.hashCode() + this.q.hashCode();
    }

    @Override // com.daaw.nl
    public nl minusKey(nl.c<?> cVar) {
        ug0.f(cVar, "key");
        if (this.q.get(cVar) != null) {
            return this.p;
        }
        nl minusKey = this.p.minusKey(cVar);
        return minusKey == this.p ? this : minusKey == mw.p ? this.q : new dh(minusKey, this.q);
    }

    public String toString() {
        return '[' + ((String) fold("", a.q)) + ']';
    }
}
