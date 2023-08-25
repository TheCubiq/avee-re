package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.u8 */
/* loaded from: classes2.dex */
public final class C3186u8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e {

    /* renamed from: a */
    public final String f28774a;

    /* renamed from: b */
    public final int f28775b;

    /* renamed from: c */
    public final of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> f28776c;

    /* renamed from: com.daaw.u8$b */
    /* loaded from: classes2.dex */
    public static final class C3188b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a {

        /* renamed from: a */
        public String f28777a;

        /* renamed from: b */
        public Integer f28778b;

        /* renamed from: c */
        public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> f28779c;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e mo8440a() {
            String str = "";
            if (this.f28777a == null) {
                str = " name";
            }
            if (this.f28778b == null) {
                str = str + " importance";
            }
            if (this.f28779c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new C3186u8(this.f28777a, this.f28778b.intValue(), this.f28779c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a mo8439b(of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> of0Var) {
            Objects.requireNonNull(of0Var, "Null frames");
            this.f28779c = of0Var;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a mo8438c(int i) {
            this.f28778b = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2086a mo8437d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f28777a = str;
            return this;
        }
    }

    public C3186u8(String str, int i, of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> of0Var) {
        this.f28774a = str;
        this.f28775b = i;
        this.f28776c = of0Var;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e
    /* renamed from: b */
    public of0<AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b> mo8443b() {
        return this.f28776c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e
    /* renamed from: c */
    public int mo8442c() {
        return this.f28775b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e
    /* renamed from: d */
    public String mo8441d() {
        return this.f28774a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e abstractC2085e = (AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e) obj;
            return this.f28774a.equals(abstractC2085e.mo8441d()) && this.f28775b == abstractC2085e.mo8442c() && this.f28776c.equals(abstractC2085e.mo8443b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f28774a.hashCode() ^ 1000003) * 1000003) ^ this.f28775b) * 1000003) ^ this.f28776c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f28774a + ", importance=" + this.f28775b + ", frames=" + this.f28776c + "}";
    }
}
