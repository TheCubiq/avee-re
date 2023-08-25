package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class g8 extends lm.a {
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;

    /* loaded from: classes2.dex */
    public static final class b extends lm.a.AbstractC0061a {
        public Integer a;
        public String b;
        public Integer c;
        public Integer d;
        public Long e;
        public Long f;
        public Long g;
        public String h;

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a a() {
            String str = "";
            if (this.a == null) {
                str = " pid";
            }
            if (this.b == null) {
                str = str + " processName";
            }
            if (this.c == null) {
                str = str + " reasonCode";
            }
            if (this.d == null) {
                str = str + " importance";
            }
            if (this.e == null) {
                str = str + " pss";
            }
            if (this.f == null) {
                str = str + " rss";
            }
            if (this.g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new g8(this.a.intValue(), this.b, this.c.intValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a.AbstractC0061a b(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a.AbstractC0061a c(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a.AbstractC0061a d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.b = str;
            return this;
        }

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a.AbstractC0061a e(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a.AbstractC0061a f(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a.AbstractC0061a g(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a.AbstractC0061a h(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.a.AbstractC0061a
        public lm.a.AbstractC0061a i(String str) {
            this.h = str;
            return this;
        }
    }

    public g8(int i, String str, int i2, int i3, long j, long j2, long j3, String str2) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
    }

    @Override // com.daaw.lm.a
    public int b() {
        return this.d;
    }

    @Override // com.daaw.lm.a
    public int c() {
        return this.a;
    }

    @Override // com.daaw.lm.a
    public String d() {
        return this.b;
    }

    @Override // com.daaw.lm.a
    public long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.a) {
            lm.a aVar = (lm.a) obj;
            if (this.a == aVar.c() && this.b.equals(aVar.d()) && this.c == aVar.f() && this.d == aVar.b() && this.e == aVar.e() && this.f == aVar.g() && this.g == aVar.h()) {
                String str = this.h;
                String i = aVar.i();
                if (str == null) {
                    if (i == null) {
                        return true;
                    }
                } else if (str.equals(i)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.lm.a
    public int f() {
        return this.c;
    }

    @Override // com.daaw.lm.a
    public long g() {
        return this.f;
    }

    @Override // com.daaw.lm.a
    public long h() {
        return this.g;
    }

    public int hashCode() {
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        int hashCode = (((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        String str = this.h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // com.daaw.lm.a
    public String i() {
        return this.h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.a + ", processName=" + this.b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + "}";
    }
}
