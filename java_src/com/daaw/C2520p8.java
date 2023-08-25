package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.p8 */
/* loaded from: classes2.dex */
public final class C2520p8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a {

    /* renamed from: a */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b f22672a;

    /* renamed from: b */
    public final of0<AbstractC2057lm.AbstractC2061c> f22673b;

    /* renamed from: c */
    public final of0<AbstractC2057lm.AbstractC2061c> f22674c;

    /* renamed from: d */
    public final Boolean f22675d;

    /* renamed from: e */
    public final int f22676e;

    /* renamed from: com.daaw.p8$b */
    /* loaded from: classes2.dex */
    public static final class C2522b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a {

        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b f22677a;

        /* renamed from: b */
        public of0<AbstractC2057lm.AbstractC2061c> f22678b;

        /* renamed from: c */
        public of0<AbstractC2057lm.AbstractC2061c> f22679c;

        /* renamed from: d */
        public Boolean f22680d;

        /* renamed from: e */
        public Integer f22681e;

        public C2522b() {
        }

        public C2522b(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a abstractC2075a) {
            this.f22677a = abstractC2075a.mo13608d();
            this.f22678b = abstractC2075a.mo13609c();
            this.f22679c = abstractC2075a.mo13607e();
            this.f22680d = abstractC2075a.mo13610b();
            this.f22681e = Integer.valueOf(abstractC2075a.mo13606f());
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a mo13604a() {
            String str = "";
            if (this.f22677a == null) {
                str = " execution";
            }
            if (this.f22681e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C2520p8(this.f22677a, this.f22678b, this.f22679c, this.f22680d, this.f22681e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a mo13603b(Boolean bool) {
            this.f22680d = bool;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a mo13602c(of0<AbstractC2057lm.AbstractC2061c> of0Var) {
            this.f22678b = of0Var;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a mo13601d(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b abstractC2077b) {
            Objects.requireNonNull(abstractC2077b, "Null execution");
            this.f22677a = abstractC2077b;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a mo13600e(of0<AbstractC2057lm.AbstractC2061c> of0Var) {
            this.f22679c = of0Var;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a mo13599f(int i) {
            this.f22681e = Integer.valueOf(i);
            return this;
        }
    }

    public C2520p8(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b abstractC2077b, of0<AbstractC2057lm.AbstractC2061c> of0Var, of0<AbstractC2057lm.AbstractC2061c> of0Var2, Boolean bool, int i) {
        this.f22672a = abstractC2077b;
        this.f22673b = of0Var;
        this.f22674c = of0Var2;
        this.f22675d = bool;
        this.f22676e = i;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a
    /* renamed from: b */
    public Boolean mo13610b() {
        return this.f22675d;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a
    /* renamed from: c */
    public of0<AbstractC2057lm.AbstractC2061c> mo13609c() {
        return this.f22673b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a
    /* renamed from: d */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b mo13608d() {
        return this.f22672a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a
    /* renamed from: e */
    public of0<AbstractC2057lm.AbstractC2061c> mo13607e() {
        return this.f22674c;
    }

    public boolean equals(Object obj) {
        of0<AbstractC2057lm.AbstractC2061c> of0Var;
        of0<AbstractC2057lm.AbstractC2061c> of0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a abstractC2075a = (AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a) obj;
            return this.f22672a.equals(abstractC2075a.mo13608d()) && ((of0Var = this.f22673b) != null ? of0Var.equals(abstractC2075a.mo13609c()) : abstractC2075a.mo13609c() == null) && ((of0Var2 = this.f22674c) != null ? of0Var2.equals(abstractC2075a.mo13607e()) : abstractC2075a.mo13607e() == null) && ((bool = this.f22675d) != null ? bool.equals(abstractC2075a.mo13610b()) : abstractC2075a.mo13610b() == null) && this.f22676e == abstractC2075a.mo13606f();
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a
    /* renamed from: f */
    public int mo13606f() {
        return this.f22676e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a
    /* renamed from: g */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2076a mo13605g() {
        return new C2522b(this);
    }

    public int hashCode() {
        int hashCode = (this.f22672a.hashCode() ^ 1000003) * 1000003;
        of0<AbstractC2057lm.AbstractC2061c> of0Var = this.f22673b;
        int hashCode2 = (hashCode ^ (of0Var == null ? 0 : of0Var.hashCode())) * 1000003;
        of0<AbstractC2057lm.AbstractC2061c> of0Var2 = this.f22674c;
        int hashCode3 = (hashCode2 ^ (of0Var2 == null ? 0 : of0Var2.hashCode())) * 1000003;
        Boolean bool = this.f22675d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f22676e;
    }

    public String toString() {
        return "Application{execution=" + this.f22672a + ", customAttributes=" + this.f22673b + ", internalKeys=" + this.f22674c + ", background=" + this.f22675d + ", uiOrientation=" + this.f22676e + "}";
    }
}
