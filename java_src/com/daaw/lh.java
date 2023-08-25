package com.daaw;
/* loaded from: classes2.dex */
public final class lh {
    public final Object a;
    public final pd b;
    public final z40<Throwable, lp1> c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Multi-variable type inference failed */
    public lh(Object obj, pd pdVar, z40<? super Throwable, lp1> z40Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = pdVar;
        this.c = z40Var;
        this.d = obj2;
        this.e = th;
    }

    public /* synthetic */ lh(Object obj, pd pdVar, z40 z40Var, Object obj2, Throwable th, int i, pq pqVar) {
        this(obj, (i & 2) != 0 ? null : pdVar, (i & 4) != 0 ? null : z40Var, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    public static /* synthetic */ lh b(lh lhVar, Object obj, pd pdVar, z40 z40Var, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = lhVar.a;
        }
        if ((i & 2) != 0) {
            pdVar = lhVar.b;
        }
        pd pdVar2 = pdVar;
        z40<Throwable, lp1> z40Var2 = z40Var;
        if ((i & 4) != 0) {
            z40Var2 = lhVar.c;
        }
        z40 z40Var3 = z40Var2;
        if ((i & 8) != 0) {
            obj2 = lhVar.d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = lhVar.e;
        }
        return lhVar.a(obj, pdVar2, z40Var3, obj4, th);
    }

    public final lh a(Object obj, pd pdVar, z40<? super Throwable, lp1> z40Var, Object obj2, Throwable th) {
        return new lh(obj, pdVar, z40Var, obj2, th);
    }

    public final boolean c() {
        return this.e != null;
    }

    public final void d(vd<?> vdVar, Throwable th) {
        pd pdVar = this.b;
        if (pdVar != null) {
            vdVar.j(pdVar, th);
        }
        z40<Throwable, lp1> z40Var = this.c;
        if (z40Var == null) {
            return;
        }
        vdVar.k(z40Var, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lh) {
            lh lhVar = (lh) obj;
            return ug0.a(this.a, lhVar.a) && ug0.a(this.b, lhVar.b) && ug0.a(this.c, lhVar.c) && ug0.a(this.d, lhVar.d) && ug0.a(this.e, lhVar.e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        pd pdVar = this.b;
        int hashCode2 = (hashCode + (pdVar == null ? 0 : pdVar.hashCode())) * 31;
        z40<Throwable, lp1> z40Var = this.c;
        int hashCode3 = (hashCode2 + (z40Var == null ? 0 : z40Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }
}
