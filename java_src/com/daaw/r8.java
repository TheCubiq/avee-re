package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class r8 extends lm.e.d.a.b.AbstractC0064a {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.a.b.AbstractC0064a.AbstractC0065a {
        public Long a;
        public Long b;
        public String c;
        public String d;

        @Override // com.daaw.lm.e.d.a.b.AbstractC0064a.AbstractC0065a
        public lm.e.d.a.b.AbstractC0064a a() {
            String str = "";
            if (this.a == null) {
                str = " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new r8(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0064a.AbstractC0065a
        public lm.e.d.a.b.AbstractC0064a.AbstractC0065a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0064a.AbstractC0065a
        public lm.e.d.a.b.AbstractC0064a.AbstractC0065a c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.c = str;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0064a.AbstractC0065a
        public lm.e.d.a.b.AbstractC0064a.AbstractC0065a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0064a.AbstractC0065a
        public lm.e.d.a.b.AbstractC0064a.AbstractC0065a e(String str) {
            this.d = str;
            return this;
        }
    }

    public r8(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0064a
    public long b() {
        return this.a;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0064a
    public String c() {
        return this.c;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0064a
    public long d() {
        return this.b;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0064a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d.a.b.AbstractC0064a) {
            lm.e.d.a.b.AbstractC0064a abstractC0064a = (lm.e.d.a.b.AbstractC0064a) obj;
            if (this.a == abstractC0064a.b() && this.b == abstractC0064a.d() && this.c.equals(abstractC0064a.c())) {
                String str = this.d;
                String e = abstractC0064a.e();
                if (str == null) {
                    if (e == null) {
                        return true;
                    }
                } else if (str.equals(e)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }
}
