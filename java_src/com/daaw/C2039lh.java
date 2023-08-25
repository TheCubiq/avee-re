package com.daaw;
/* renamed from: com.daaw.lh */
/* loaded from: classes2.dex */
public final class C2039lh {

    /* renamed from: a */
    public final Object f17386a;

    /* renamed from: b */
    public final AbstractC2541pd f17387b;

    /* renamed from: c */
    public final z40<Throwable, lp1> f17388c;

    /* renamed from: d */
    public final Object f17389d;

    /* renamed from: e */
    public final Throwable f17390e;

    /* JADX WARN: Multi-variable type inference failed */
    public C2039lh(Object obj, AbstractC2541pd abstractC2541pd, z40<? super Throwable, lp1> z40Var, Object obj2, Throwable th) {
        this.f17386a = obj;
        this.f17387b = abstractC2541pd;
        this.f17388c = z40Var;
        this.f17389d = obj2;
        this.f17390e = th;
    }

    public /* synthetic */ C2039lh(Object obj, AbstractC2541pd abstractC2541pd, z40 z40Var, Object obj2, Throwable th, int i, C2575pq c2575pq) {
        this(obj, (i & 2) != 0 ? null : abstractC2541pd, (i & 4) != 0 ? null : z40Var, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* renamed from: b */
    public static /* synthetic */ C2039lh m16958b(C2039lh c2039lh, Object obj, AbstractC2541pd abstractC2541pd, z40 z40Var, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c2039lh.f17386a;
        }
        if ((i & 2) != 0) {
            abstractC2541pd = c2039lh.f17387b;
        }
        AbstractC2541pd abstractC2541pd2 = abstractC2541pd;
        z40<Throwable, lp1> z40Var2 = z40Var;
        if ((i & 4) != 0) {
            z40Var2 = c2039lh.f17388c;
        }
        z40 z40Var3 = z40Var2;
        if ((i & 8) != 0) {
            obj2 = c2039lh.f17389d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = c2039lh.f17390e;
        }
        return c2039lh.m16959a(obj, abstractC2541pd2, z40Var3, obj4, th);
    }

    /* renamed from: a */
    public final C2039lh m16959a(Object obj, AbstractC2541pd abstractC2541pd, z40<? super Throwable, lp1> z40Var, Object obj2, Throwable th) {
        return new C2039lh(obj, abstractC2541pd, z40Var, obj2, th);
    }

    /* renamed from: c */
    public final boolean m16957c() {
        return this.f17390e != null;
    }

    /* renamed from: d */
    public final void m16956d(C3324vd<?> c3324vd, Throwable th) {
        AbstractC2541pd abstractC2541pd = this.f17387b;
        if (abstractC2541pd != null) {
            c3324vd.m7260j(abstractC2541pd, th);
        }
        z40<Throwable, lp1> z40Var = this.f17388c;
        if (z40Var == null) {
            return;
        }
        c3324vd.m7259k(z40Var, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2039lh) {
            C2039lh c2039lh = (C2039lh) obj;
            return ug0.m8273a(this.f17386a, c2039lh.f17386a) && ug0.m8273a(this.f17387b, c2039lh.f17387b) && ug0.m8273a(this.f17388c, c2039lh.f17388c) && ug0.m8273a(this.f17389d, c2039lh.f17389d) && ug0.m8273a(this.f17390e, c2039lh.f17390e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f17386a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC2541pd abstractC2541pd = this.f17387b;
        int hashCode2 = (hashCode + (abstractC2541pd == null ? 0 : abstractC2541pd.hashCode())) * 31;
        z40<Throwable, lp1> z40Var = this.f17388c;
        int hashCode3 = (hashCode2 + (z40Var == null ? 0 : z40Var.hashCode())) * 31;
        Object obj2 = this.f17389d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f17390e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f17386a + ", cancelHandler=" + this.f17387b + ", onCancellation=" + this.f17388c + ", idempotentResume=" + this.f17389d + ", cancelCause=" + this.f17390e + ')';
    }
}
