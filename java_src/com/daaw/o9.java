package com.daaw;

import com.daaw.s81;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class o9 extends s81.b {
    public final long a;
    public final long b;
    public final Set<s81.c> c;

    /* loaded from: classes.dex */
    public static final class b extends s81.b.a {
        public Long a;
        public Long b;
        public Set<s81.c> c;

        @Override // com.daaw.s81.b.a
        public s81.b a() {
            String str = "";
            if (this.a == null) {
                str = " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new o9(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.s81.b.a
        public s81.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.s81.b.a
        public s81.b.a c(Set<s81.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.c = set;
            return this;
        }

        @Override // com.daaw.s81.b.a
        public s81.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public o9(long j, long j2, Set<s81.c> set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    @Override // com.daaw.s81.b
    public long b() {
        return this.a;
    }

    @Override // com.daaw.s81.b
    public Set<s81.c> c() {
        return this.c;
    }

    @Override // com.daaw.s81.b
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s81.b) {
            s81.b bVar = (s81.b) obj;
            return this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
