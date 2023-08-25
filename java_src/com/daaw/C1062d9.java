package com.daaw;

import com.daaw.AbstractC2223my;
/* renamed from: com.daaw.d9 */
/* loaded from: classes.dex */
public final class C1062d9 extends AbstractC2223my {

    /* renamed from: b */
    public final long f6620b;

    /* renamed from: c */
    public final int f6621c;

    /* renamed from: d */
    public final int f6622d;

    /* renamed from: e */
    public final long f6623e;

    /* renamed from: f */
    public final int f6624f;

    /* renamed from: com.daaw.d9$b */
    /* loaded from: classes.dex */
    public static final class C1064b extends AbstractC2223my.AbstractC2224a {

        /* renamed from: a */
        public Long f6625a;

        /* renamed from: b */
        public Integer f6626b;

        /* renamed from: c */
        public Integer f6627c;

        /* renamed from: d */
        public Long f6628d;

        /* renamed from: e */
        public Integer f6629e;

        @Override // com.daaw.AbstractC2223my.AbstractC2224a
        /* renamed from: a */
        public AbstractC2223my mo15672a() {
            String str = "";
            if (this.f6625a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f6626b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f6627c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f6628d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f6629e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1062d9(this.f6625a.longValue(), this.f6626b.intValue(), this.f6627c.intValue(), this.f6628d.longValue(), this.f6629e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2223my.AbstractC2224a
        /* renamed from: b */
        public AbstractC2223my.AbstractC2224a mo15671b(int i) {
            this.f6627c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2223my.AbstractC2224a
        /* renamed from: c */
        public AbstractC2223my.AbstractC2224a mo15670c(long j) {
            this.f6628d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC2223my.AbstractC2224a
        /* renamed from: d */
        public AbstractC2223my.AbstractC2224a mo15669d(int i) {
            this.f6626b = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2223my.AbstractC2224a
        /* renamed from: e */
        public AbstractC2223my.AbstractC2224a mo15668e(int i) {
            this.f6629e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2223my.AbstractC2224a
        /* renamed from: f */
        public AbstractC2223my.AbstractC2224a mo15667f(long j) {
            this.f6625a = Long.valueOf(j);
            return this;
        }
    }

    public C1062d9(long j, int i, int i2, long j2, int i3) {
        this.f6620b = j;
        this.f6621c = i;
        this.f6622d = i2;
        this.f6623e = j2;
        this.f6624f = i3;
    }

    @Override // com.daaw.AbstractC2223my
    /* renamed from: b */
    public int mo15677b() {
        return this.f6622d;
    }

    @Override // com.daaw.AbstractC2223my
    /* renamed from: c */
    public long mo15676c() {
        return this.f6623e;
    }

    @Override // com.daaw.AbstractC2223my
    /* renamed from: d */
    public int mo15675d() {
        return this.f6621c;
    }

    @Override // com.daaw.AbstractC2223my
    /* renamed from: e */
    public int mo15674e() {
        return this.f6624f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2223my) {
            AbstractC2223my abstractC2223my = (AbstractC2223my) obj;
            return this.f6620b == abstractC2223my.mo15673f() && this.f6621c == abstractC2223my.mo15675d() && this.f6622d == abstractC2223my.mo15677b() && this.f6623e == abstractC2223my.mo15676c() && this.f6624f == abstractC2223my.mo15674e();
        }
        return false;
    }

    @Override // com.daaw.AbstractC2223my
    /* renamed from: f */
    public long mo15673f() {
        return this.f6620b;
    }

    public int hashCode() {
        long j = this.f6620b;
        long j2 = this.f6623e;
        return this.f6624f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f6621c) * 1000003) ^ this.f6622d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f6620b + ", loadBatchSize=" + this.f6621c + ", criticalSectionEnterTimeoutMs=" + this.f6622d + ", eventCleanUpAge=" + this.f6623e + ", maxBlobByteSizePerRow=" + this.f6624f + "}";
    }
}
