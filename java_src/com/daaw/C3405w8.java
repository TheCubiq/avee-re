package com.daaw;

import com.daaw.AbstractC2057lm;
/* renamed from: com.daaw.w8 */
/* loaded from: classes2.dex */
public final class C3405w8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c {

    /* renamed from: a */
    public final Double f31027a;

    /* renamed from: b */
    public final int f31028b;

    /* renamed from: c */
    public final boolean f31029c;

    /* renamed from: d */
    public final int f31030d;

    /* renamed from: e */
    public final long f31031e;

    /* renamed from: f */
    public final long f31032f;

    /* renamed from: com.daaw.w8$b */
    /* loaded from: classes2.dex */
    public static final class C3407b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a {

        /* renamed from: a */
        public Double f31033a;

        /* renamed from: b */
        public Integer f31034b;

        /* renamed from: c */
        public Boolean f31035c;

        /* renamed from: d */
        public Integer f31036d;

        /* renamed from: e */
        public Long f31037e;

        /* renamed from: f */
        public Long f31038f;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c mo6352a() {
            String str = "";
            if (this.f31034b == null) {
                str = " batteryVelocity";
            }
            if (this.f31035c == null) {
                str = str + " proximityOn";
            }
            if (this.f31036d == null) {
                str = str + " orientation";
            }
            if (this.f31037e == null) {
                str = str + " ramUsed";
            }
            if (this.f31038f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C3405w8(this.f31033a, this.f31034b.intValue(), this.f31035c.booleanValue(), this.f31036d.intValue(), this.f31037e.longValue(), this.f31038f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a mo6351b(Double d) {
            this.f31033a = d;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a mo6350c(int i) {
            this.f31034b = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a mo6349d(long j) {
            this.f31038f = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a mo6348e(int i) {
            this.f31036d = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a mo6347f(boolean z) {
            this.f31035c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a
        /* renamed from: g */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c.AbstractC2091a mo6346g(long j) {
            this.f31037e = Long.valueOf(j);
            return this;
        }
    }

    public C3405w8(Double d, int i, boolean z, int i2, long j, long j2) {
        this.f31027a = d;
        this.f31028b = i;
        this.f31029c = z;
        this.f31030d = i2;
        this.f31031e = j;
        this.f31032f = j2;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c
    /* renamed from: b */
    public Double mo6358b() {
        return this.f31027a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c
    /* renamed from: c */
    public int mo6357c() {
        return this.f31028b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c
    /* renamed from: d */
    public long mo6356d() {
        return this.f31032f;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c
    /* renamed from: e */
    public int mo6355e() {
        return this.f31030d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c) {
            AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c abstractC2090c = (AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c) obj;
            Double d = this.f31027a;
            if (d != null ? d.equals(abstractC2090c.mo6358b()) : abstractC2090c.mo6358b() == null) {
                if (this.f31028b == abstractC2090c.mo6357c() && this.f31029c == abstractC2090c.mo6353g() && this.f31030d == abstractC2090c.mo6355e() && this.f31031e == abstractC2090c.mo6354f() && this.f31032f == abstractC2090c.mo6356d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c
    /* renamed from: f */
    public long mo6354f() {
        return this.f31031e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2090c
    /* renamed from: g */
    public boolean mo6353g() {
        return this.f31029c;
    }

    public int hashCode() {
        Double d = this.f31027a;
        int hashCode = ((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.f31028b) * 1000003;
        int i = this.f31029c ? 1231 : 1237;
        long j = this.f31031e;
        long j2 = this.f31032f;
        return ((((((hashCode ^ i) * 1000003) ^ this.f31030d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f31027a + ", batteryVelocity=" + this.f31028b + ", proximityOn=" + this.f31029c + ", orientation=" + this.f31030d + ", ramUsed=" + this.f31031e + ", diskUsed=" + this.f31032f + "}";
    }
}
