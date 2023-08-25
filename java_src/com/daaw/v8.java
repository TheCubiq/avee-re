package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class v8 extends lm.e.d.a.b.AbstractC0070e.AbstractC0072b {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final int e;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a {
        public Long a;
        public String b;
        public String c;
        public Long d;
        public Integer e;

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0072b a() {
            String str = "";
            if (this.a == null) {
                str = " pc";
            }
            if (this.b == null) {
                str = str + " symbol";
            }
            if (this.d == null) {
                str = str + " offset";
            }
            if (this.e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new v8(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a c(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a d(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0072b.AbstractC0073a f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.b = str;
            return this;
        }
    }

    public v8(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b
    public String b() {
        return this.c;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b
    public int c() {
        return this.e;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b
    public long d() {
        return this.d;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d.a.b.AbstractC0070e.AbstractC0072b) {
            lm.e.d.a.b.AbstractC0070e.AbstractC0072b abstractC0072b = (lm.e.d.a.b.AbstractC0070e.AbstractC0072b) obj;
            return this.a == abstractC0072b.e() && this.b.equals(abstractC0072b.f()) && ((str = this.c) != null ? str.equals(abstractC0072b.b()) : abstractC0072b.b() == null) && this.d == abstractC0072b.d() && this.e == abstractC0072b.c();
        }
        return false;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0072b
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.d;
        return this.e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }
}
