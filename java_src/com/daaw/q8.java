package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class q8 extends lm.e.d.a.b {
    public final of0<lm.e.d.a.b.AbstractC0070e> a;
    public final lm.e.d.a.b.c b;
    public final lm.a c;
    public final lm.e.d.a.b.AbstractC0068d d;
    public final of0<lm.e.d.a.b.AbstractC0064a> e;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.a.b.AbstractC0066b {
        public of0<lm.e.d.a.b.AbstractC0070e> a;
        public lm.e.d.a.b.c b;
        public lm.a c;
        public lm.e.d.a.b.AbstractC0068d d;
        public of0<lm.e.d.a.b.AbstractC0064a> e;

        @Override // com.daaw.lm.e.d.a.b.AbstractC0066b
        public lm.e.d.a.b a() {
            String str = "";
            if (this.d == null) {
                str = " signal";
            }
            if (this.e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new q8(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0066b
        public lm.e.d.a.b.AbstractC0066b b(lm.a aVar) {
            this.c = aVar;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0066b
        public lm.e.d.a.b.AbstractC0066b c(of0<lm.e.d.a.b.AbstractC0064a> of0Var) {
            Objects.requireNonNull(of0Var, "Null binaries");
            this.e = of0Var;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0066b
        public lm.e.d.a.b.AbstractC0066b d(lm.e.d.a.b.c cVar) {
            this.b = cVar;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0066b
        public lm.e.d.a.b.AbstractC0066b e(lm.e.d.a.b.AbstractC0068d abstractC0068d) {
            Objects.requireNonNull(abstractC0068d, "Null signal");
            this.d = abstractC0068d;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0066b
        public lm.e.d.a.b.AbstractC0066b f(of0<lm.e.d.a.b.AbstractC0070e> of0Var) {
            this.a = of0Var;
            return this;
        }
    }

    public q8(of0<lm.e.d.a.b.AbstractC0070e> of0Var, lm.e.d.a.b.c cVar, lm.a aVar, lm.e.d.a.b.AbstractC0068d abstractC0068d, of0<lm.e.d.a.b.AbstractC0064a> of0Var2) {
        this.a = of0Var;
        this.b = cVar;
        this.c = aVar;
        this.d = abstractC0068d;
        this.e = of0Var2;
    }

    @Override // com.daaw.lm.e.d.a.b
    public lm.a b() {
        return this.c;
    }

    @Override // com.daaw.lm.e.d.a.b
    public of0<lm.e.d.a.b.AbstractC0064a> c() {
        return this.e;
    }

    @Override // com.daaw.lm.e.d.a.b
    public lm.e.d.a.b.c d() {
        return this.b;
    }

    @Override // com.daaw.lm.e.d.a.b
    public lm.e.d.a.b.AbstractC0068d e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d.a.b) {
            lm.e.d.a.b bVar = (lm.e.d.a.b) obj;
            of0<lm.e.d.a.b.AbstractC0070e> of0Var = this.a;
            if (of0Var != null ? of0Var.equals(bVar.f()) : bVar.f() == null) {
                lm.e.d.a.b.c cVar = this.b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    lm.a aVar = this.c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.d.equals(bVar.e()) && this.e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.lm.e.d.a.b
    public of0<lm.e.d.a.b.AbstractC0070e> f() {
        return this.a;
    }

    public int hashCode() {
        of0<lm.e.d.a.b.AbstractC0070e> of0Var = this.a;
        int hashCode = ((of0Var == null ? 0 : of0Var.hashCode()) ^ 1000003) * 1000003;
        lm.e.d.a.b.c cVar = this.b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        lm.a aVar = this.c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
