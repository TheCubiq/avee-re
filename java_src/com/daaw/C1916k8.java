package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.k8 */
/* loaded from: classes2.dex */
public final class C1916k8 extends AbstractC2057lm.AbstractC2067e {

    /* renamed from: a */
    public final String f15752a;

    /* renamed from: b */
    public final String f15753b;

    /* renamed from: c */
    public final long f15754c;

    /* renamed from: d */
    public final Long f15755d;

    /* renamed from: e */
    public final boolean f15756e;

    /* renamed from: f */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2068a f15757f;

    /* renamed from: g */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2096f f15758g;

    /* renamed from: h */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2094e f15759h;

    /* renamed from: i */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2072c f15760i;

    /* renamed from: j */
    public final of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d> f15761j;

    /* renamed from: k */
    public final int f15762k;

    /* renamed from: com.daaw.k8$b */
    /* loaded from: classes2.dex */
    public static final class C1918b extends AbstractC2057lm.AbstractC2067e.AbstractC2071b {

        /* renamed from: a */
        public String f15763a;

        /* renamed from: b */
        public String f15764b;

        /* renamed from: c */
        public Long f15765c;

        /* renamed from: d */
        public Long f15766d;

        /* renamed from: e */
        public Boolean f15767e;

        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a f15768f;

        /* renamed from: g */
        public AbstractC2057lm.AbstractC2067e.AbstractC2096f f15769g;

        /* renamed from: h */
        public AbstractC2057lm.AbstractC2067e.AbstractC2094e f15770h;

        /* renamed from: i */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c f15771i;

        /* renamed from: j */
        public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d> f15772j;

        /* renamed from: k */
        public Integer f15773k;

        public C1918b() {
        }

        public C1918b(AbstractC2057lm.AbstractC2067e abstractC2067e) {
            this.f15763a = abstractC2067e.mo16784f();
            this.f15764b = abstractC2067e.mo16782h();
            this.f15765c = Long.valueOf(abstractC2067e.mo16779k());
            this.f15766d = abstractC2067e.mo16786d();
            this.f15767e = Boolean.valueOf(abstractC2067e.mo16777m());
            this.f15768f = abstractC2067e.mo16788b();
            this.f15769g = abstractC2067e.mo16778l();
            this.f15770h = abstractC2067e.mo16780j();
            this.f15771i = abstractC2067e.mo16787c();
            this.f15772j = abstractC2067e.mo16785e();
            this.f15773k = Integer.valueOf(abstractC2067e.mo16783g());
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e mo16758a() {
            String str = "";
            if (this.f15763a == null) {
                str = " generator";
            }
            if (this.f15764b == null) {
                str = str + " identifier";
            }
            if (this.f15765c == null) {
                str = str + " startedAt";
            }
            if (this.f15767e == null) {
                str = str + " crashed";
            }
            if (this.f15768f == null) {
                str = str + " app";
            }
            if (this.f15773k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C1916k8(this.f15763a, this.f15764b, this.f15765c.longValue(), this.f15766d, this.f15767e.booleanValue(), this.f15768f, this.f15769g, this.f15770h, this.f15771i, this.f15772j, this.f15773k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16757b(AbstractC2057lm.AbstractC2067e.AbstractC2068a abstractC2068a) {
            Objects.requireNonNull(abstractC2068a, "Null app");
            this.f15768f = abstractC2068a;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16756c(boolean z) {
            this.f15767e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16755d(AbstractC2057lm.AbstractC2067e.AbstractC2072c abstractC2072c) {
            this.f15771i = abstractC2072c;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16754e(Long l) {
            this.f15766d = l;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16753f(of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d> of0Var) {
            this.f15772j = of0Var;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: g */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16752g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f15763a = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: h */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16751h(int i) {
            this.f15773k = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: i */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16750i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f15764b = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: k */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16748k(AbstractC2057lm.AbstractC2067e.AbstractC2094e abstractC2094e) {
            this.f15770h = abstractC2094e;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: l */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16747l(long j) {
            this.f15765c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2071b
        /* renamed from: m */
        public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16746m(AbstractC2057lm.AbstractC2067e.AbstractC2096f abstractC2096f) {
            this.f15769g = abstractC2096f;
            return this;
        }
    }

    public C1916k8(String str, String str2, long j, Long l, boolean z, AbstractC2057lm.AbstractC2067e.AbstractC2068a abstractC2068a, AbstractC2057lm.AbstractC2067e.AbstractC2096f abstractC2096f, AbstractC2057lm.AbstractC2067e.AbstractC2094e abstractC2094e, AbstractC2057lm.AbstractC2067e.AbstractC2072c abstractC2072c, of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d> of0Var, int i) {
        this.f15752a = str;
        this.f15753b = str2;
        this.f15754c = j;
        this.f15755d = l;
        this.f15756e = z;
        this.f15757f = abstractC2068a;
        this.f15758g = abstractC2096f;
        this.f15759h = abstractC2094e;
        this.f15760i = abstractC2072c;
        this.f15761j = of0Var;
        this.f15762k = i;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: b */
    public AbstractC2057lm.AbstractC2067e.AbstractC2068a mo16788b() {
        return this.f15757f;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: c */
    public AbstractC2057lm.AbstractC2067e.AbstractC2072c mo16787c() {
        return this.f15760i;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: d */
    public Long mo16786d() {
        return this.f15755d;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: e */
    public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d> mo16785e() {
        return this.f15761j;
    }

    public boolean equals(Object obj) {
        Long l;
        AbstractC2057lm.AbstractC2067e.AbstractC2096f abstractC2096f;
        AbstractC2057lm.AbstractC2067e.AbstractC2094e abstractC2094e;
        AbstractC2057lm.AbstractC2067e.AbstractC2072c abstractC2072c;
        of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d> of0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e) {
            AbstractC2057lm.AbstractC2067e abstractC2067e = (AbstractC2057lm.AbstractC2067e) obj;
            return this.f15752a.equals(abstractC2067e.mo16784f()) && this.f15753b.equals(abstractC2067e.mo16782h()) && this.f15754c == abstractC2067e.mo16779k() && ((l = this.f15755d) != null ? l.equals(abstractC2067e.mo16786d()) : abstractC2067e.mo16786d() == null) && this.f15756e == abstractC2067e.mo16777m() && this.f15757f.equals(abstractC2067e.mo16788b()) && ((abstractC2096f = this.f15758g) != null ? abstractC2096f.equals(abstractC2067e.mo16778l()) : abstractC2067e.mo16778l() == null) && ((abstractC2094e = this.f15759h) != null ? abstractC2094e.equals(abstractC2067e.mo16780j()) : abstractC2067e.mo16780j() == null) && ((abstractC2072c = this.f15760i) != null ? abstractC2072c.equals(abstractC2067e.mo16787c()) : abstractC2067e.mo16787c() == null) && ((of0Var = this.f15761j) != null ? of0Var.equals(abstractC2067e.mo16785e()) : abstractC2067e.mo16785e() == null) && this.f15762k == abstractC2067e.mo16783g();
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: f */
    public String mo16784f() {
        return this.f15752a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: g */
    public int mo16783g() {
        return this.f15762k;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: h */
    public String mo16782h() {
        return this.f15753b;
    }

    public int hashCode() {
        long j = this.f15754c;
        int hashCode = (((((this.f15752a.hashCode() ^ 1000003) * 1000003) ^ this.f15753b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.f15755d;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.f15756e ? 1231 : 1237)) * 1000003) ^ this.f15757f.hashCode()) * 1000003;
        AbstractC2057lm.AbstractC2067e.AbstractC2096f abstractC2096f = this.f15758g;
        int hashCode3 = (hashCode2 ^ (abstractC2096f == null ? 0 : abstractC2096f.hashCode())) * 1000003;
        AbstractC2057lm.AbstractC2067e.AbstractC2094e abstractC2094e = this.f15759h;
        int hashCode4 = (hashCode3 ^ (abstractC2094e == null ? 0 : abstractC2094e.hashCode())) * 1000003;
        AbstractC2057lm.AbstractC2067e.AbstractC2072c abstractC2072c = this.f15760i;
        int hashCode5 = (hashCode4 ^ (abstractC2072c == null ? 0 : abstractC2072c.hashCode())) * 1000003;
        of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d> of0Var = this.f15761j;
        return ((hashCode5 ^ (of0Var != null ? of0Var.hashCode() : 0)) * 1000003) ^ this.f15762k;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: j */
    public AbstractC2057lm.AbstractC2067e.AbstractC2094e mo16780j() {
        return this.f15759h;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: k */
    public long mo16779k() {
        return this.f15754c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: l */
    public AbstractC2057lm.AbstractC2067e.AbstractC2096f mo16778l() {
        return this.f15758g;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: m */
    public boolean mo16777m() {
        return this.f15756e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e
    /* renamed from: n */
    public AbstractC2057lm.AbstractC2067e.AbstractC2071b mo16776n() {
        return new C1918b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f15752a + ", identifier=" + this.f15753b + ", startedAt=" + this.f15754c + ", endedAt=" + this.f15755d + ", crashed=" + this.f15756e + ", app=" + this.f15757f + ", user=" + this.f15758g + ", os=" + this.f15759h + ", device=" + this.f15760i + ", events=" + this.f15761j + ", generatorType=" + this.f15762k + "}";
    }
}
