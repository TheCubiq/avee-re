package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.q8 */
/* loaded from: classes2.dex */
public final class C2695q8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b {

    /* renamed from: a */
    public final of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e> f23738a;

    /* renamed from: b */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c f23739b;

    /* renamed from: c */
    public final AbstractC2057lm.AbstractC2058a f23740c;

    /* renamed from: d */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d f23741d;

    /* renamed from: e */
    public final of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a> f23742e;

    /* renamed from: com.daaw.q8$b */
    /* loaded from: classes2.dex */
    public static final class C2697b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b {

        /* renamed from: a */
        public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e> f23743a;

        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c f23744b;

        /* renamed from: c */
        public AbstractC2057lm.AbstractC2058a f23745c;

        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d f23746d;

        /* renamed from: e */
        public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a> f23747e;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b mo12716a() {
            String str = "";
            if (this.f23746d == null) {
                str = " signal";
            }
            if (this.f23747e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C2695q8(this.f23743a, this.f23744b, this.f23745c, this.f23746d, this.f23747e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b mo12715b(AbstractC2057lm.AbstractC2058a abstractC2058a) {
            this.f23745c = abstractC2058a;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b mo12714c(of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a> of0Var) {
            Objects.requireNonNull(of0Var, "Null binaries");
            this.f23747e = of0Var;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b mo12713d(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c) {
            this.f23744b = abstractC2081c;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b mo12712e(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d abstractC2083d) {
            Objects.requireNonNull(abstractC2083d, "Null signal");
            this.f23746d = abstractC2083d;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2080b mo12711f(of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e> of0Var) {
            this.f23743a = of0Var;
            return this;
        }
    }

    public C2695q8(of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e> of0Var, AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c, AbstractC2057lm.AbstractC2058a abstractC2058a, AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d abstractC2083d, of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a> of0Var2) {
        this.f23738a = of0Var;
        this.f23739b = abstractC2081c;
        this.f23740c = abstractC2058a;
        this.f23741d = abstractC2083d;
        this.f23742e = of0Var2;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b
    /* renamed from: b */
    public AbstractC2057lm.AbstractC2058a mo12721b() {
        return this.f23740c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b
    /* renamed from: c */
    public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a> mo12720c() {
        return this.f23742e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b
    /* renamed from: d */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c mo12719d() {
        return this.f23739b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b
    /* renamed from: e */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d mo12718e() {
        return this.f23741d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b abstractC2077b = (AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b) obj;
            of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e> of0Var = this.f23738a;
            if (of0Var != null ? of0Var.equals(abstractC2077b.mo12717f()) : abstractC2077b.mo12717f() == null) {
                AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c = this.f23739b;
                if (abstractC2081c != null ? abstractC2081c.equals(abstractC2077b.mo12719d()) : abstractC2077b.mo12719d() == null) {
                    AbstractC2057lm.AbstractC2058a abstractC2058a = this.f23740c;
                    if (abstractC2058a != null ? abstractC2058a.equals(abstractC2077b.mo12721b()) : abstractC2077b.mo12721b() == null) {
                        if (this.f23741d.equals(abstractC2077b.mo12718e()) && this.f23742e.equals(abstractC2077b.mo12720c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b
    /* renamed from: f */
    public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e> mo12717f() {
        return this.f23738a;
    }

    public int hashCode() {
        of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e> of0Var = this.f23738a;
        int hashCode = ((of0Var == null ? 0 : of0Var.hashCode()) ^ 1000003) * 1000003;
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c = this.f23739b;
        int hashCode2 = (hashCode ^ (abstractC2081c == null ? 0 : abstractC2081c.hashCode())) * 1000003;
        AbstractC2057lm.AbstractC2058a abstractC2058a = this.f23740c;
        return ((((hashCode2 ^ (abstractC2058a != null ? abstractC2058a.hashCode() : 0)) * 1000003) ^ this.f23741d.hashCode()) * 1000003) ^ this.f23742e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f23738a + ", exception=" + this.f23739b + ", appExitInfo=" + this.f23740c + ", signal=" + this.f23741d + ", binaries=" + this.f23742e + "}";
    }
}
