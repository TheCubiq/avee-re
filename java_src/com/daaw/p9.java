package com.daaw;

import com.daaw.db1;
import java.util.Objects;
/* loaded from: classes.dex */
public final class p9 extends db1 {
    public final sn1 a;
    public final String b;
    public final xx<?> c;
    public final hn1<?, byte[]> d;
    public final bx e;

    /* loaded from: classes.dex */
    public static final class b extends db1.a {
        public sn1 a;
        public String b;
        public xx<?> c;
        public hn1<?, byte[]> d;
        public bx e;

        @Override // com.daaw.db1.a
        public db1 a() {
            String str = "";
            if (this.a == null) {
                str = " transportContext";
            }
            if (this.b == null) {
                str = str + " transportName";
            }
            if (this.c == null) {
                str = str + " event";
            }
            if (this.d == null) {
                str = str + " transformer";
            }
            if (this.e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new p9(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.db1.a
        public db1.a b(bx bxVar) {
            Objects.requireNonNull(bxVar, "Null encoding");
            this.e = bxVar;
            return this;
        }

        @Override // com.daaw.db1.a
        public db1.a c(xx<?> xxVar) {
            Objects.requireNonNull(xxVar, "Null event");
            this.c = xxVar;
            return this;
        }

        @Override // com.daaw.db1.a
        public db1.a d(hn1<?, byte[]> hn1Var) {
            Objects.requireNonNull(hn1Var, "Null transformer");
            this.d = hn1Var;
            return this;
        }

        @Override // com.daaw.db1.a
        public db1.a e(sn1 sn1Var) {
            Objects.requireNonNull(sn1Var, "Null transportContext");
            this.a = sn1Var;
            return this;
        }

        @Override // com.daaw.db1.a
        public db1.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.b = str;
            return this;
        }
    }

    public p9(sn1 sn1Var, String str, xx<?> xxVar, hn1<?, byte[]> hn1Var, bx bxVar) {
        this.a = sn1Var;
        this.b = str;
        this.c = xxVar;
        this.d = hn1Var;
        this.e = bxVar;
    }

    @Override // com.daaw.db1
    public bx b() {
        return this.e;
    }

    @Override // com.daaw.db1
    public xx<?> c() {
        return this.c;
    }

    @Override // com.daaw.db1
    public hn1<?, byte[]> e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof db1) {
            db1 db1Var = (db1) obj;
            return this.a.equals(db1Var.f()) && this.b.equals(db1Var.g()) && this.c.equals(db1Var.c()) && this.d.equals(db1Var.e()) && this.e.equals(db1Var.b());
        }
        return false;
    }

    @Override // com.daaw.db1
    public sn1 f() {
        return this.a;
    }

    @Override // com.daaw.db1
    public String g() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}
