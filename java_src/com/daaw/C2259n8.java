package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.n8 */
/* loaded from: classes2.dex */
public final class C2259n8 extends AbstractC2057lm.AbstractC2067e.AbstractC2072c {

    /* renamed from: a */
    public final int f19573a;

    /* renamed from: b */
    public final String f19574b;

    /* renamed from: c */
    public final int f19575c;

    /* renamed from: d */
    public final long f19576d;

    /* renamed from: e */
    public final long f19577e;

    /* renamed from: f */
    public final boolean f19578f;

    /* renamed from: g */
    public final int f19579g;

    /* renamed from: h */
    public final String f19580h;

    /* renamed from: i */
    public final String f19581i;

    /* renamed from: com.daaw.n8$b */
    /* loaded from: classes2.dex */
    public static final class C2261b extends AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a {

        /* renamed from: a */
        public Integer f19582a;

        /* renamed from: b */
        public String f19583b;

        /* renamed from: c */
        public Integer f19584c;

        /* renamed from: d */
        public Long f19585d;

        /* renamed from: e */
        public Long f19586e;

        /* renamed from: f */
        public Boolean f19587f;

        /* renamed from: g */
        public Integer f19588g;

        /* renamed from: h */
        public String f19589h;

        /* renamed from: i */
        public String f19590i;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c mo15468a() {
            String str = "";
            if (this.f19582a == null) {
                str = " arch";
            }
            if (this.f19583b == null) {
                str = str + " model";
            }
            if (this.f19584c == null) {
                str = str + " cores";
            }
            if (this.f19585d == null) {
                str = str + " ram";
            }
            if (this.f19586e == null) {
                str = str + " diskSpace";
            }
            if (this.f19587f == null) {
                str = str + " simulator";
            }
            if (this.f19588g == null) {
                str = str + " state";
            }
            if (this.f19589h == null) {
                str = str + " manufacturer";
            }
            if (this.f19590i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new C2259n8(this.f19582a.intValue(), this.f19583b, this.f19584c.intValue(), this.f19585d.longValue(), this.f19586e.longValue(), this.f19587f.booleanValue(), this.f19588g.intValue(), this.f19589h, this.f19590i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15467b(int i) {
            this.f19582a = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15466c(int i) {
            this.f19584c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15465d(long j) {
            this.f19586e = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15464e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f19589h = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15463f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f19583b = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: g */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15462g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f19590i = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: h */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15461h(long j) {
            this.f19585d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: i */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15460i(boolean z) {
            this.f19587f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a
        /* renamed from: j */
        public AbstractC2057lm.AbstractC2067e.AbstractC2072c.AbstractC2073a mo15459j(int i) {
            this.f19588g = Integer.valueOf(i);
            return this;
        }
    }

    public C2259n8(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f19573a = i;
        this.f19574b = str;
        this.f19575c = i2;
        this.f19576d = j;
        this.f19577e = j2;
        this.f19578f = z;
        this.f19579g = i3;
        this.f19580h = str2;
        this.f19581i = str3;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: b */
    public int mo15477b() {
        return this.f19573a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: c */
    public int mo15476c() {
        return this.f19575c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: d */
    public long mo15475d() {
        return this.f19577e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: e */
    public String mo15474e() {
        return this.f19580h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2072c) {
            AbstractC2057lm.AbstractC2067e.AbstractC2072c abstractC2072c = (AbstractC2057lm.AbstractC2067e.AbstractC2072c) obj;
            return this.f19573a == abstractC2072c.mo15477b() && this.f19574b.equals(abstractC2072c.mo15473f()) && this.f19575c == abstractC2072c.mo15476c() && this.f19576d == abstractC2072c.mo15471h() && this.f19577e == abstractC2072c.mo15475d() && this.f19578f == abstractC2072c.mo15469j() && this.f19579g == abstractC2072c.mo15470i() && this.f19580h.equals(abstractC2072c.mo15474e()) && this.f19581i.equals(abstractC2072c.mo15472g());
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: f */
    public String mo15473f() {
        return this.f19574b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: g */
    public String mo15472g() {
        return this.f19581i;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: h */
    public long mo15471h() {
        return this.f19576d;
    }

    public int hashCode() {
        long j = this.f19576d;
        long j2 = this.f19577e;
        return ((((((((((((((((this.f19573a ^ 1000003) * 1000003) ^ this.f19574b.hashCode()) * 1000003) ^ this.f19575c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f19578f ? 1231 : 1237)) * 1000003) ^ this.f19579g) * 1000003) ^ this.f19580h.hashCode()) * 1000003) ^ this.f19581i.hashCode();
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: i */
    public int mo15470i() {
        return this.f19579g;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2072c
    /* renamed from: j */
    public boolean mo15469j() {
        return this.f19578f;
    }

    public String toString() {
        return "Device{arch=" + this.f19573a + ", model=" + this.f19574b + ", cores=" + this.f19575c + ", ram=" + this.f19576d + ", diskSpace=" + this.f19577e + ", simulator=" + this.f19578f + ", state=" + this.f19579g + ", manufacturer=" + this.f19580h + ", modelClass=" + this.f19581i + "}";
    }
}
