package com.daaw;

import com.daaw.cl0;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class h9 extends cl0 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final ls0 g;

    /* loaded from: classes.dex */
    public static final class b extends cl0.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public ls0 g;

        @Override // com.daaw.cl0.a
        public cl0 a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new h9(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.cl0.a
        public cl0.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.daaw.cl0.a
        public cl0.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.cl0.a
        public cl0.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.cl0.a
        public cl0.a e(ls0 ls0Var) {
            this.g = ls0Var;
            return this;
        }

        @Override // com.daaw.cl0.a
        public cl0.a f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // com.daaw.cl0.a
        public cl0.a g(String str) {
            this.e = str;
            return this;
        }

        @Override // com.daaw.cl0.a
        public cl0.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    public h9(long j, Integer num, long j2, byte[] bArr, String str, long j3, ls0 ls0Var) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = ls0Var;
    }

    @Override // com.daaw.cl0
    public Integer b() {
        return this.b;
    }

    @Override // com.daaw.cl0
    public long c() {
        return this.a;
    }

    @Override // com.daaw.cl0
    public long d() {
        return this.c;
    }

    @Override // com.daaw.cl0
    public ls0 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cl0) {
            cl0 cl0Var = (cl0) obj;
            if (this.a == cl0Var.c() && ((num = this.b) != null ? num.equals(cl0Var.b()) : cl0Var.b() == null) && this.c == cl0Var.d()) {
                if (Arrays.equals(this.d, cl0Var instanceof h9 ? ((h9) cl0Var).d : cl0Var.f()) && ((str = this.e) != null ? str.equals(cl0Var.g()) : cl0Var.g() == null) && this.f == cl0Var.h()) {
                    ls0 ls0Var = this.g;
                    ls0 e = cl0Var.e();
                    if (ls0Var == null) {
                        if (e == null) {
                            return true;
                        }
                    } else if (ls0Var.equals(e)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.cl0
    public byte[] f() {
        return this.d;
    }

    @Override // com.daaw.cl0
    public String g() {
        return this.e;
    }

    @Override // com.daaw.cl0
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i2 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        ls0 ls0Var = this.g;
        return i2 ^ (ls0Var != null ? ls0Var.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
