package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class t8 extends lm.e.d.a.b.AbstractC0068d {
    public final String a;
    public final String b;
    public final long c;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.a.b.AbstractC0068d.AbstractC0069a {
        public String a;
        public String b;
        public Long c;

        @Override // com.daaw.lm.e.d.a.b.AbstractC0068d.AbstractC0069a
        public lm.e.d.a.b.AbstractC0068d a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " code";
            }
            if (this.c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new t8(this.a, this.b, this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0068d.AbstractC0069a
        public lm.e.d.a.b.AbstractC0068d.AbstractC0069a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0068d.AbstractC0069a
        public lm.e.d.a.b.AbstractC0068d.AbstractC0069a c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.b = str;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0068d.AbstractC0069a
        public lm.e.d.a.b.AbstractC0068d.AbstractC0069a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.a = str;
            return this;
        }
    }

    public t8(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0068d
    public long b() {
        return this.c;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0068d
    public String c() {
        return this.b;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0068d
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d.a.b.AbstractC0068d) {
            lm.e.d.a.b.AbstractC0068d abstractC0068d = (lm.e.d.a.b.AbstractC0068d) obj;
            return this.a.equals(abstractC0068d.d()) && this.b.equals(abstractC0068d.c()) && this.c == abstractC0068d.b();
        }
        return false;
    }

    public int hashCode() {
        long j = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }
}
