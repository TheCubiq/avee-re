package com.daaw;

import com.daaw.gl0;
import java.util.List;
/* loaded from: classes.dex */
public final class i9 extends gl0 {
    public final long a;
    public final long b;
    public final uf c;
    public final Integer d;
    public final String e;
    public final List<cl0> f;
    public final h01 g;

    /* loaded from: classes.dex */
    public static final class b extends gl0.a {
        public Long a;
        public Long b;
        public uf c;
        public Integer d;
        public String e;
        public List<cl0> f;
        public h01 g;

        @Override // com.daaw.gl0.a
        public gl0 a() {
            String str = "";
            if (this.a == null) {
                str = " requestTimeMs";
            }
            if (this.b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new i9(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.gl0.a
        public gl0.a b(uf ufVar) {
            this.c = ufVar;
            return this;
        }

        @Override // com.daaw.gl0.a
        public gl0.a c(List<cl0> list) {
            this.f = list;
            return this;
        }

        @Override // com.daaw.gl0.a
        public gl0.a d(Integer num) {
            this.d = num;
            return this;
        }

        @Override // com.daaw.gl0.a
        public gl0.a e(String str) {
            this.e = str;
            return this;
        }

        @Override // com.daaw.gl0.a
        public gl0.a f(h01 h01Var) {
            this.g = h01Var;
            return this;
        }

        @Override // com.daaw.gl0.a
        public gl0.a g(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.gl0.a
        public gl0.a h(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public i9(long j, long j2, uf ufVar, Integer num, String str, List<cl0> list, h01 h01Var) {
        this.a = j;
        this.b = j2;
        this.c = ufVar;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = h01Var;
    }

    @Override // com.daaw.gl0
    public uf b() {
        return this.c;
    }

    @Override // com.daaw.gl0
    public List<cl0> c() {
        return this.f;
    }

    @Override // com.daaw.gl0
    public Integer d() {
        return this.d;
    }

    @Override // com.daaw.gl0
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        uf ufVar;
        Integer num;
        String str;
        List<cl0> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof gl0) {
            gl0 gl0Var = (gl0) obj;
            if (this.a == gl0Var.g() && this.b == gl0Var.h() && ((ufVar = this.c) != null ? ufVar.equals(gl0Var.b()) : gl0Var.b() == null) && ((num = this.d) != null ? num.equals(gl0Var.d()) : gl0Var.d() == null) && ((str = this.e) != null ? str.equals(gl0Var.e()) : gl0Var.e() == null) && ((list = this.f) != null ? list.equals(gl0Var.c()) : gl0Var.c() == null)) {
                h01 h01Var = this.g;
                h01 f = gl0Var.f();
                if (h01Var == null) {
                    if (f == null) {
                        return true;
                    }
                } else if (h01Var.equals(f)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.gl0
    public h01 f() {
        return this.g;
    }

    @Override // com.daaw.gl0
    public long g() {
        return this.a;
    }

    @Override // com.daaw.gl0
    public long h() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        uf ufVar = this.c;
        int hashCode = (i ^ (ufVar == null ? 0 : ufVar.hashCode())) * 1000003;
        Integer num = this.d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<cl0> list = this.f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        h01 h01Var = this.g;
        return hashCode4 ^ (h01Var != null ? h01Var.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
