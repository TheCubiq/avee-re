package com.daaw;

import com.daaw.my;
/* loaded from: classes.dex */
public final class d9 extends my {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    /* loaded from: classes.dex */
    public static final class b extends my.a {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;

        @Override // com.daaw.my.a
        public my a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new d9(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.my.a
        public my.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.my.a
        public my.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.my.a
        public my.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.my.a
        public my.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.my.a
        public my.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    public d9(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }

    @Override // com.daaw.my
    public int b() {
        return this.d;
    }

    @Override // com.daaw.my
    public long c() {
        return this.e;
    }

    @Override // com.daaw.my
    public int d() {
        return this.c;
    }

    @Override // com.daaw.my
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof my) {
            my myVar = (my) obj;
            return this.b == myVar.f() && this.c == myVar.d() && this.d == myVar.b() && this.e == myVar.c() && this.f == myVar.e();
        }
        return false;
    }

    @Override // com.daaw.my
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.e;
        return this.f ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }
}
