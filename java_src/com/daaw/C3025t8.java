package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.t8 */
/* loaded from: classes2.dex */
public final class C3025t8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d {

    /* renamed from: a */
    public final String f27107a;

    /* renamed from: b */
    public final String f27108b;

    /* renamed from: c */
    public final long f27109c;

    /* renamed from: com.daaw.t8$b */
    /* loaded from: classes2.dex */
    public static final class C3027b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a {

        /* renamed from: a */
        public String f27110a;

        /* renamed from: b */
        public String f27111b;

        /* renamed from: c */
        public Long f27112c;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d mo9461a() {
            String str = "";
            if (this.f27110a == null) {
                str = " name";
            }
            if (this.f27111b == null) {
                str = str + " code";
            }
            if (this.f27112c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C3025t8(this.f27110a, this.f27111b, this.f27112c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a mo9460b(long j) {
            this.f27112c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a mo9459c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f27111b = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d.AbstractC2084a mo9458d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f27110a = str;
            return this;
        }
    }

    public C3025t8(String str, String str2, long j) {
        this.f27107a = str;
        this.f27108b = str2;
        this.f27109c = j;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d
    /* renamed from: b */
    public long mo9464b() {
        return this.f27109c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d
    /* renamed from: c */
    public String mo9463c() {
        return this.f27108b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d
    /* renamed from: d */
    public String mo9462d() {
        return this.f27107a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d abstractC2083d = (AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2083d) obj;
            return this.f27107a.equals(abstractC2083d.mo9462d()) && this.f27108b.equals(abstractC2083d.mo9463c()) && this.f27109c == abstractC2083d.mo9464b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.f27109c;
        return ((((this.f27107a.hashCode() ^ 1000003) * 1000003) ^ this.f27108b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f27107a + ", code=" + this.f27108b + ", address=" + this.f27109c + "}";
    }
}
