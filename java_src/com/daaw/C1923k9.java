package com.daaw;

import com.daaw.ls0;
/* renamed from: com.daaw.k9 */
/* loaded from: classes.dex */
public final class C1923k9 extends ls0 {

    /* renamed from: a */
    public final ls0.EnumC2114c f15791a;

    /* renamed from: b */
    public final ls0.EnumC2113b f15792b;

    /* renamed from: com.daaw.k9$b */
    /* loaded from: classes.dex */
    public static final class C1925b extends ls0.AbstractC2112a {

        /* renamed from: a */
        public ls0.EnumC2114c f15793a;

        /* renamed from: b */
        public ls0.EnumC2113b f15794b;

        @Override // com.daaw.ls0.AbstractC2112a
        /* renamed from: a */
        public ls0 mo16616a() {
            return new C1923k9(this.f15793a, this.f15794b);
        }

        @Override // com.daaw.ls0.AbstractC2112a
        /* renamed from: b */
        public ls0.AbstractC2112a mo16615b(ls0.EnumC2113b enumC2113b) {
            this.f15794b = enumC2113b;
            return this;
        }

        @Override // com.daaw.ls0.AbstractC2112a
        /* renamed from: c */
        public ls0.AbstractC2112a mo16614c(ls0.EnumC2114c enumC2114c) {
            this.f15793a = enumC2114c;
            return this;
        }
    }

    public C1923k9(ls0.EnumC2114c enumC2114c, ls0.EnumC2113b enumC2113b) {
        this.f15791a = enumC2114c;
        this.f15792b = enumC2113b;
    }

    @Override // com.daaw.ls0
    /* renamed from: b */
    public ls0.EnumC2113b mo16618b() {
        return this.f15792b;
    }

    @Override // com.daaw.ls0
    /* renamed from: c */
    public ls0.EnumC2114c mo16617c() {
        return this.f15791a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ls0) {
            ls0 ls0Var = (ls0) obj;
            ls0.EnumC2114c enumC2114c = this.f15791a;
            if (enumC2114c != null ? enumC2114c.equals(ls0Var.mo16617c()) : ls0Var.mo16617c() == null) {
                ls0.EnumC2113b enumC2113b = this.f15792b;
                ls0.EnumC2113b mo16618b = ls0Var.mo16618b();
                if (enumC2113b == null) {
                    if (mo16618b == null) {
                        return true;
                    }
                } else if (enumC2113b.equals(mo16618b)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        ls0.EnumC2114c enumC2114c = this.f15791a;
        int hashCode = ((enumC2114c == null ? 0 : enumC2114c.hashCode()) ^ 1000003) * 1000003;
        ls0.EnumC2113b enumC2113b = this.f15792b;
        return hashCode ^ (enumC2113b != null ? enumC2113b.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f15791a + ", mobileSubtype=" + this.f15792b + "}";
    }
}
