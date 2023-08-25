package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.s8 */
/* loaded from: classes2.dex */
public final class C2917s8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c {

    /* renamed from: a */
    public final String f25983a;

    /* renamed from: b */
    public final String f25984b;

    /* renamed from: c */
    public final of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> f25985c;

    /* renamed from: d */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c f25986d;

    /* renamed from: e */
    public final int f25987e;

    /* renamed from: com.daaw.s8$b */
    /* loaded from: classes2.dex */
    public static final class C2919b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a {

        /* renamed from: a */
        public String f25988a;

        /* renamed from: b */
        public String f25989b;

        /* renamed from: c */
        public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> f25990c;

        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c f25991d;

        /* renamed from: e */
        public Integer f25992e;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c mo10555a() {
            String str = "";
            if (this.f25988a == null) {
                str = " type";
            }
            if (this.f25990c == null) {
                str = str + " frames";
            }
            if (this.f25992e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new C2917s8(this.f25988a, this.f25989b, this.f25990c, this.f25991d, this.f25992e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a mo10554b(AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c) {
            this.f25991d = abstractC2081c;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a mo10553c(of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> of0Var) {
            Objects.requireNonNull(of0Var, "Null frames");
            this.f25990c = of0Var;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a mo10552d(int i) {
            this.f25992e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a mo10551e(String str) {
            this.f25989b = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c.AbstractC2082a mo10550f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f25988a = str;
            return this;
        }
    }

    public C2917s8(String str, String str2, of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> of0Var, AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c, int i) {
        this.f25983a = str;
        this.f25984b = str2;
        this.f25985c = of0Var;
        this.f25986d = abstractC2081c;
        this.f25987e = i;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c
    /* renamed from: b */
    public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c mo10560b() {
        return this.f25986d;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c
    /* renamed from: c */
    public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> mo10559c() {
        return this.f25985c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c
    /* renamed from: d */
    public int mo10558d() {
        return this.f25987e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c
    /* renamed from: e */
    public String mo10557e() {
        return this.f25984b;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c2 = (AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c) obj;
            return this.f25983a.equals(abstractC2081c2.mo10556f()) && ((str = this.f25984b) != null ? str.equals(abstractC2081c2.mo10557e()) : abstractC2081c2.mo10557e() == null) && this.f25985c.equals(abstractC2081c2.mo10559c()) && ((abstractC2081c = this.f25986d) != null ? abstractC2081c.equals(abstractC2081c2.mo10560b()) : abstractC2081c2.mo10560b() == null) && this.f25987e == abstractC2081c2.mo10558d();
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c
    /* renamed from: f */
    public String mo10556f() {
        return this.f25983a;
    }

    public int hashCode() {
        int hashCode = (this.f25983a.hashCode() ^ 1000003) * 1000003;
        String str = this.f25984b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f25985c.hashCode()) * 1000003;
        AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2081c abstractC2081c = this.f25986d;
        return ((hashCode2 ^ (abstractC2081c != null ? abstractC2081c.hashCode() : 0)) * 1000003) ^ this.f25987e;
    }

    public String toString() {
        return "Exception{type=" + this.f25983a + ", reason=" + this.f25984b + ", frames=" + this.f25985c + ", causedBy=" + this.f25986d + ", overflowCount=" + this.f25987e + "}";
    }
}
