package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class o8 extends lm.e.d {
    public final long a;
    public final String b;
    public final lm.e.d.a c;
    public final lm.e.d.c d;
    public final lm.e.d.AbstractC0074d e;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.b {
        public Long a;
        public String b;
        public lm.e.d.a c;
        public lm.e.d.c d;
        public lm.e.d.AbstractC0074d e;

        public b() {
        }

        public b(lm.e.d dVar) {
            this.a = Long.valueOf(dVar.e());
            this.b = dVar.f();
            this.c = dVar.b();
            this.d = dVar.c();
            this.e = dVar.d();
        }

        @Override // com.daaw.lm.e.d.b
        public lm.e.d a() {
            String str = "";
            if (this.a == null) {
                str = " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new o8(this.a.longValue(), this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.b
        public lm.e.d.b b(lm.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.c = aVar;
            return this;
        }

        @Override // com.daaw.lm.e.d.b
        public lm.e.d.b c(lm.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.d = cVar;
            return this;
        }

        @Override // com.daaw.lm.e.d.b
        public lm.e.d.b d(lm.e.d.AbstractC0074d abstractC0074d) {
            this.e = abstractC0074d;
            return this;
        }

        @Override // com.daaw.lm.e.d.b
        public lm.e.d.b e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.lm.e.d.b
        public lm.e.d.b f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.b = str;
            return this;
        }
    }

    public o8(long j, String str, lm.e.d.a aVar, lm.e.d.c cVar, lm.e.d.AbstractC0074d abstractC0074d) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0074d;
    }

    @Override // com.daaw.lm.e.d
    public lm.e.d.a b() {
        return this.c;
    }

    @Override // com.daaw.lm.e.d
    public lm.e.d.c c() {
        return this.d;
    }

    @Override // com.daaw.lm.e.d
    public lm.e.d.AbstractC0074d d() {
        return this.e;
    }

    @Override // com.daaw.lm.e.d
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d) {
            lm.e.d dVar = (lm.e.d) obj;
            if (this.a == dVar.e() && this.b.equals(dVar.f()) && this.c.equals(dVar.b()) && this.d.equals(dVar.c())) {
                lm.e.d.AbstractC0074d abstractC0074d = this.e;
                lm.e.d.AbstractC0074d d = dVar.d();
                if (abstractC0074d == null) {
                    if (d == null) {
                        return true;
                    }
                } else if (abstractC0074d.equals(d)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.lm.e.d
    public String f() {
        return this.b;
    }

    @Override // com.daaw.lm.e.d
    public lm.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        lm.e.d.AbstractC0074d abstractC0074d = this.e;
        return (abstractC0074d == null ? 0 : abstractC0074d.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }
}
