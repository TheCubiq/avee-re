package com.daaw;

import com.daaw.by;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class c9 extends by {
    public final String a;
    public final Integer b;
    public final ww c;
    public final long d;
    public final long e;
    public final Map<String, String> f;

    /* loaded from: classes.dex */
    public static final class b extends by.a {
        public String a;
        public Integer b;
        public ww c;
        public Long d;
        public Long e;
        public Map<String, String> f;

        @Override // com.daaw.by.a
        public by d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new c9(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.by.a
        public Map<String, String> e() {
            Map<String, String> map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.daaw.by.a
        public by.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f = map;
            return this;
        }

        @Override // com.daaw.by.a
        public by.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.daaw.by.a
        public by.a h(ww wwVar) {
            Objects.requireNonNull(wwVar, "Null encodedPayload");
            this.c = wwVar;
            return this;
        }

        @Override // com.daaw.by.a
        public by.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.by.a
        public by.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.a = str;
            return this;
        }

        @Override // com.daaw.by.a
        public by.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    public c9(String str, Integer num, ww wwVar, long j, long j2, Map<String, String> map) {
        this.a = str;
        this.b = num;
        this.c = wwVar;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    @Override // com.daaw.by
    public Map<String, String> c() {
        return this.f;
    }

    @Override // com.daaw.by
    public Integer d() {
        return this.b;
    }

    @Override // com.daaw.by
    public ww e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof by) {
            by byVar = (by) obj;
            return this.a.equals(byVar.j()) && ((num = this.b) != null ? num.equals(byVar.d()) : byVar.d() == null) && this.c.equals(byVar.e()) && this.d == byVar.f() && this.e == byVar.k() && this.f.equals(byVar.c());
        }
        return false;
    }

    @Override // com.daaw.by
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j = this.d;
        long j2 = this.e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // com.daaw.by
    public String j() {
        return this.a;
    }

    @Override // com.daaw.by
    public long k() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
