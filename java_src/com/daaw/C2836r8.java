package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.r8 */
/* loaded from: classes2.dex */
public final class C2836r8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a {

    /* renamed from: a */
    public final long f24947a;

    /* renamed from: b */
    public final long f24948b;

    /* renamed from: c */
    public final String f24949c;

    /* renamed from: d */
    public final String f24950d;

    /* renamed from: com.daaw.r8$b */
    /* loaded from: classes2.dex */
    public static final class C2838b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a {

        /* renamed from: a */
        public Long f24951a;

        /* renamed from: b */
        public Long f24952b;

        /* renamed from: c */
        public String f24953c;

        /* renamed from: d */
        public String f24954d;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a mo11599a() {
            String str = "";
            if (this.f24951a == null) {
                str = " baseAddress";
            }
            if (this.f24952b == null) {
                str = str + " size";
            }
            if (this.f24953c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C2836r8(this.f24951a.longValue(), this.f24952b.longValue(), this.f24953c, this.f24954d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a mo11598b(long j) {
            this.f24951a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a mo11597c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f24953c = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a mo11596d(long j) {
            this.f24952b = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a.AbstractC2079a mo11595e(String str) {
            this.f24954d = str;
            return this;
        }
    }

    public C2836r8(long j, long j2, String str, String str2) {
        this.f24947a = j;
        this.f24948b = j2;
        this.f24949c = str;
        this.f24950d = str2;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a
    /* renamed from: b */
    public long mo11603b() {
        return this.f24947a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a
    /* renamed from: c */
    public String mo11602c() {
        return this.f24949c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a
    /* renamed from: d */
    public long mo11601d() {
        return this.f24948b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a
    /* renamed from: e */
    public String mo11600e() {
        return this.f24950d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a abstractC2078a = (AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2075a.AbstractC2077b.AbstractC2078a) obj;
            if (this.f24947a == abstractC2078a.mo11603b() && this.f24948b == abstractC2078a.mo11601d() && this.f24949c.equals(abstractC2078a.mo11602c())) {
                String str = this.f24950d;
                String mo11600e = abstractC2078a.mo11600e();
                if (str == null) {
                    if (mo11600e == null) {
                        return true;
                    }
                } else if (str.equals(mo11600e)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f24947a;
        long j2 = this.f24948b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f24949c.hashCode()) * 1000003;
        String str = this.f24950d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f24947a + ", size=" + this.f24948b + ", name=" + this.f24949c + ", uuid=" + this.f24950d + "}";
    }
}
