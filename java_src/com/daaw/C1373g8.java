package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.g8 */
/* loaded from: classes2.dex */
public final class C1373g8 extends AbstractC2057lm.AbstractC2058a {

    /* renamed from: a */
    public final int f10323a;

    /* renamed from: b */
    public final String f10324b;

    /* renamed from: c */
    public final int f10325c;

    /* renamed from: d */
    public final int f10326d;

    /* renamed from: e */
    public final long f10327e;

    /* renamed from: f */
    public final long f10328f;

    /* renamed from: g */
    public final long f10329g;

    /* renamed from: h */
    public final String f10330h;

    /* renamed from: com.daaw.g8$b */
    /* loaded from: classes2.dex */
    public static final class C1375b extends AbstractC2057lm.AbstractC2058a.AbstractC2059a {

        /* renamed from: a */
        public Integer f10331a;

        /* renamed from: b */
        public String f10332b;

        /* renamed from: c */
        public Integer f10333c;

        /* renamed from: d */
        public Integer f10334d;

        /* renamed from: e */
        public Long f10335e;

        /* renamed from: f */
        public Long f10336f;

        /* renamed from: g */
        public Long f10337g;

        /* renamed from: h */
        public String f10338h;

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2058a mo16825a() {
            String str = "";
            if (this.f10331a == null) {
                str = " pid";
            }
            if (this.f10332b == null) {
                str = str + " processName";
            }
            if (this.f10333c == null) {
                str = str + " reasonCode";
            }
            if (this.f10334d == null) {
                str = str + " importance";
            }
            if (this.f10335e == null) {
                str = str + " pss";
            }
            if (this.f10336f == null) {
                str = str + " rss";
            }
            if (this.f10337g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C1373g8(this.f10331a.intValue(), this.f10332b, this.f10333c.intValue(), this.f10334d.intValue(), this.f10335e.longValue(), this.f10336f.longValue(), this.f10337g.longValue(), this.f10338h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2058a.AbstractC2059a mo16824b(int i) {
            this.f10334d = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2058a.AbstractC2059a mo16823c(int i) {
            this.f10331a = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2058a.AbstractC2059a mo16822d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f10332b = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2058a.AbstractC2059a mo16821e(long j) {
            this.f10335e = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2058a.AbstractC2059a mo16820f(int i) {
            this.f10333c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: g */
        public AbstractC2057lm.AbstractC2058a.AbstractC2059a mo16819g(long j) {
            this.f10336f = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: h */
        public AbstractC2057lm.AbstractC2058a.AbstractC2059a mo16818h(long j) {
            this.f10337g = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2058a.AbstractC2059a
        /* renamed from: i */
        public AbstractC2057lm.AbstractC2058a.AbstractC2059a mo16817i(String str) {
            this.f10338h = str;
            return this;
        }
    }

    public C1373g8(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.f10323a = i;
        this.f10324b = str;
        this.f10325c = i2;
        this.f10326d = i3;
        this.f10327e = j;
        this.f10328f = j2;
        this.f10329g = j3;
        this.f10330h = str2;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2058a
    /* renamed from: b */
    public int mo16833b() {
        return this.f10326d;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2058a
    /* renamed from: c */
    public int mo16832c() {
        return this.f10323a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2058a
    /* renamed from: d */
    public String mo16831d() {
        return this.f10324b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2058a
    /* renamed from: e */
    public long mo16830e() {
        return this.f10327e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2058a) {
            AbstractC2057lm.AbstractC2058a abstractC2058a = (AbstractC2057lm.AbstractC2058a) obj;
            if (this.f10323a == abstractC2058a.mo16832c() && this.f10324b.equals(abstractC2058a.mo16831d()) && this.f10325c == abstractC2058a.mo16829f() && this.f10326d == abstractC2058a.mo16833b() && this.f10327e == abstractC2058a.mo16830e() && this.f10328f == abstractC2058a.mo16828g() && this.f10329g == abstractC2058a.mo16827h()) {
                String str = this.f10330h;
                String mo16826i = abstractC2058a.mo16826i();
                if (str == null) {
                    if (mo16826i == null) {
                        return true;
                    }
                } else if (str.equals(mo16826i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2058a
    /* renamed from: f */
    public int mo16829f() {
        return this.f10325c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2058a
    /* renamed from: g */
    public long mo16828g() {
        return this.f10328f;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2058a
    /* renamed from: h */
    public long mo16827h() {
        return this.f10329g;
    }

    public int hashCode() {
        long j = this.f10327e;
        long j2 = this.f10328f;
        long j3 = this.f10329g;
        int hashCode = (((((((((((((this.f10323a ^ 1000003) * 1000003) ^ this.f10324b.hashCode()) * 1000003) ^ this.f10325c) * 1000003) ^ this.f10326d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.f10330h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2058a
    /* renamed from: i */
    public String mo16826i() {
        return this.f10330h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f10323a + ", processName=" + this.f10324b + ", reasonCode=" + this.f10325c + ", importance=" + this.f10326d + ", pss=" + this.f10327e + ", rss=" + this.f10328f + ", timestamp=" + this.f10329g + ", traceFile=" + this.f10330h + "}";
    }
}
