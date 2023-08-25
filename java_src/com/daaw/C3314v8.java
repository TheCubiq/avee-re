package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.v8 */
/* loaded from: classes2.dex */
public final class C3314v8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b {

    /* renamed from: a */
    public final long f29996a;

    /* renamed from: b */
    public final String f29997b;

    /* renamed from: c */
    public final String f29998c;

    /* renamed from: d */
    public final long f29999d;

    /* renamed from: e */
    public final int f30000e;

    /* renamed from: com.daaw.v8$b */
    /* loaded from: classes2.dex */
    public static final class C3316b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a {

        /* renamed from: a */
        public Long f30001a;

        /* renamed from: b */
        public String f30002b;

        /* renamed from: c */
        public String f30003c;

        /* renamed from: d */
        public Long f30004d;

        /* renamed from: e */
        public Integer f30005e;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b mo7354a() {
            String str = "";
            if (this.f30001a == null) {
                str = " pc";
            }
            if (this.f30002b == null) {
                str = str + " symbol";
            }
            if (this.f30004d == null) {
                str = str + " offset";
            }
            if (this.f30005e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C3314v8(this.f30001a.longValue(), this.f30002b, this.f30003c, this.f30004d.longValue(), this.f30005e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a mo7353b(String str) {
            this.f30003c = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a mo7352c(int i) {
            this.f30005e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a mo7351d(long j) {
            this.f30004d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a mo7350e(long j) {
            this.f30001a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b.AbstractC2088a mo7349f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f30002b = str;
            return this;
        }
    }

    public C3314v8(long j, String str, String str2, long j2, int i) {
        this.f29996a = j;
        this.f29997b = str;
        this.f29998c = str2;
        this.f29999d = j2;
        this.f30000e = i;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b
    /* renamed from: b */
    public String mo7359b() {
        return this.f29998c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b
    /* renamed from: c */
    public int mo7358c() {
        return this.f30000e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b
    /* renamed from: d */
    public long mo7357d() {
        return this.f29999d;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b
    /* renamed from: e */
    public long mo7356e() {
        return this.f29996a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b abstractC2087b = (AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b) obj;
            return this.f29996a == abstractC2087b.mo7356e() && this.f29997b.equals(abstractC2087b.mo7355f()) && ((str = this.f29998c) != null ? str.equals(abstractC2087b.mo7359b()) : abstractC2087b.mo7359b() == null) && this.f29999d == abstractC2087b.mo7357d() && this.f30000e == abstractC2087b.mo7358c();
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2085e.AbstractC2087b
    /* renamed from: f */
    public String mo7355f() {
        return this.f29997b;
    }

    public int hashCode() {
        long j = this.f29996a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f29997b.hashCode()) * 1000003;
        String str = this.f29998c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.f29999d;
        return this.f30000e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f29996a + ", symbol=" + this.f29997b + ", file=" + this.f29998c + ", offset=" + this.f29999d + ", importance=" + this.f30000e + "}";
    }
}
