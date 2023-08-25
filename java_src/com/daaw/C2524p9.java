package com.daaw;

import com.daaw.db1;
import java.util.Objects;
/* renamed from: com.daaw.p9 */
/* loaded from: classes.dex */
public final class C2524p9 extends db1 {

    /* renamed from: a */
    public final sn1 f22706a;

    /* renamed from: b */
    public final String f22707b;

    /* renamed from: c */
    public final AbstractC3649xx<?> f22708c;

    /* renamed from: d */
    public final hn1<?, byte[]> f22709d;

    /* renamed from: e */
    public final C0892bx f22710e;

    /* renamed from: com.daaw.p9$b */
    /* loaded from: classes.dex */
    public static final class C2526b extends db1.AbstractC1072a {

        /* renamed from: a */
        public sn1 f22711a;

        /* renamed from: b */
        public String f22712b;

        /* renamed from: c */
        public AbstractC3649xx<?> f22713c;

        /* renamed from: d */
        public hn1<?, byte[]> f22714d;

        /* renamed from: e */
        public C0892bx f22715e;

        @Override // com.daaw.db1.AbstractC1072a
        /* renamed from: a */
        public db1 mo13576a() {
            String str = "";
            if (this.f22711a == null) {
                str = " transportContext";
            }
            if (this.f22712b == null) {
                str = str + " transportName";
            }
            if (this.f22713c == null) {
                str = str + " event";
            }
            if (this.f22714d == null) {
                str = str + " transformer";
            }
            if (this.f22715e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C2524p9(this.f22711a, this.f22712b, this.f22713c, this.f22714d, this.f22715e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.db1.AbstractC1072a
        /* renamed from: b */
        public db1.AbstractC1072a mo13575b(C0892bx c0892bx) {
            Objects.requireNonNull(c0892bx, "Null encoding");
            this.f22715e = c0892bx;
            return this;
        }

        @Override // com.daaw.db1.AbstractC1072a
        /* renamed from: c */
        public db1.AbstractC1072a mo13574c(AbstractC3649xx<?> abstractC3649xx) {
            Objects.requireNonNull(abstractC3649xx, "Null event");
            this.f22713c = abstractC3649xx;
            return this;
        }

        @Override // com.daaw.db1.AbstractC1072a
        /* renamed from: d */
        public db1.AbstractC1072a mo13573d(hn1<?, byte[]> hn1Var) {
            Objects.requireNonNull(hn1Var, "Null transformer");
            this.f22714d = hn1Var;
            return this;
        }

        @Override // com.daaw.db1.AbstractC1072a
        /* renamed from: e */
        public db1.AbstractC1072a mo13572e(sn1 sn1Var) {
            Objects.requireNonNull(sn1Var, "Null transportContext");
            this.f22711a = sn1Var;
            return this;
        }

        @Override // com.daaw.db1.AbstractC1072a
        /* renamed from: f */
        public db1.AbstractC1072a mo13571f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f22712b = str;
            return this;
        }
    }

    public C2524p9(sn1 sn1Var, String str, AbstractC3649xx<?> abstractC3649xx, hn1<?, byte[]> hn1Var, C0892bx c0892bx) {
        this.f22706a = sn1Var;
        this.f22707b = str;
        this.f22708c = abstractC3649xx;
        this.f22709d = hn1Var;
        this.f22710e = c0892bx;
    }

    @Override // com.daaw.db1
    /* renamed from: b */
    public C0892bx mo13581b() {
        return this.f22710e;
    }

    @Override // com.daaw.db1
    /* renamed from: c */
    public AbstractC3649xx<?> mo13580c() {
        return this.f22708c;
    }

    @Override // com.daaw.db1
    /* renamed from: e */
    public hn1<?, byte[]> mo13579e() {
        return this.f22709d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof db1) {
            db1 db1Var = (db1) obj;
            return this.f22706a.equals(db1Var.mo13578f()) && this.f22707b.equals(db1Var.mo13577g()) && this.f22708c.equals(db1Var.mo13580c()) && this.f22709d.equals(db1Var.mo13579e()) && this.f22710e.equals(db1Var.mo13581b());
        }
        return false;
    }

    @Override // com.daaw.db1
    /* renamed from: f */
    public sn1 mo13578f() {
        return this.f22706a;
    }

    @Override // com.daaw.db1
    /* renamed from: g */
    public String mo13577g() {
        return this.f22707b;
    }

    public int hashCode() {
        return ((((((((this.f22706a.hashCode() ^ 1000003) * 1000003) ^ this.f22707b.hashCode()) * 1000003) ^ this.f22708c.hashCode()) * 1000003) ^ this.f22709d.hashCode()) * 1000003) ^ this.f22710e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f22706a + ", transportName=" + this.f22707b + ", event=" + this.f22708c + ", transformer=" + this.f22709d + ", encoding=" + this.f22710e + "}";
    }
}
