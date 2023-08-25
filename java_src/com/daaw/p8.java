package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class p8 extends lm.e.d.a {
    public final lm.e.d.a.b a;
    public final of0<lm.c> b;
    public final of0<lm.c> c;
    public final Boolean d;
    public final int e;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.a.AbstractC0063a {
        public lm.e.d.a.b a;
        public of0<lm.c> b;
        public of0<lm.c> c;
        public Boolean d;
        public Integer e;

        public b() {
        }

        public b(lm.e.d.a aVar) {
            this.a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.e();
            this.d = aVar.b();
            this.e = Integer.valueOf(aVar.f());
        }

        @Override // com.daaw.lm.e.d.a.AbstractC0063a
        public lm.e.d.a a() {
            String str = "";
            if (this.a == null) {
                str = " execution";
            }
            if (this.e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new p8(this.a, this.b, this.c, this.d, this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.a.AbstractC0063a
        public lm.e.d.a.AbstractC0063a b(Boolean bool) {
            this.d = bool;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.AbstractC0063a
        public lm.e.d.a.AbstractC0063a c(of0<lm.c> of0Var) {
            this.b = of0Var;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.AbstractC0063a
        public lm.e.d.a.AbstractC0063a d(lm.e.d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.a = bVar;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.AbstractC0063a
        public lm.e.d.a.AbstractC0063a e(of0<lm.c> of0Var) {
            this.c = of0Var;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.AbstractC0063a
        public lm.e.d.a.AbstractC0063a f(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }
    }

    public p8(lm.e.d.a.b bVar, of0<lm.c> of0Var, of0<lm.c> of0Var2, Boolean bool, int i) {
        this.a = bVar;
        this.b = of0Var;
        this.c = of0Var2;
        this.d = bool;
        this.e = i;
    }

    @Override // com.daaw.lm.e.d.a
    public Boolean b() {
        return this.d;
    }

    @Override // com.daaw.lm.e.d.a
    public of0<lm.c> c() {
        return this.b;
    }

    @Override // com.daaw.lm.e.d.a
    public lm.e.d.a.b d() {
        return this.a;
    }

    @Override // com.daaw.lm.e.d.a
    public of0<lm.c> e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        of0<lm.c> of0Var;
        of0<lm.c> of0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d.a) {
            lm.e.d.a aVar = (lm.e.d.a) obj;
            return this.a.equals(aVar.d()) && ((of0Var = this.b) != null ? of0Var.equals(aVar.c()) : aVar.c() == null) && ((of0Var2 = this.c) != null ? of0Var2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.e == aVar.f();
        }
        return false;
    }

    @Override // com.daaw.lm.e.d.a
    public int f() {
        return this.e;
    }

    @Override // com.daaw.lm.e.d.a
    public lm.e.d.a.AbstractC0063a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        of0<lm.c> of0Var = this.b;
        int hashCode2 = (hashCode ^ (of0Var == null ? 0 : of0Var.hashCode())) * 1000003;
        of0<lm.c> of0Var2 = this.c;
        int hashCode3 = (hashCode2 ^ (of0Var2 == null ? 0 : of0Var2.hashCode())) * 1000003;
        Boolean bool = this.d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", uiOrientation=" + this.e + "}";
    }
}
