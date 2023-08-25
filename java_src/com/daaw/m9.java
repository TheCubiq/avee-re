package com.daaw;

import com.daaw.jw0;
import com.daaw.kw0;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class m9 extends kw0 {
    public final String b;
    public final jw0.a c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final String h;

    /* loaded from: classes2.dex */
    public static final class b extends kw0.a {
        public String a;
        public jw0.a b;
        public String c;
        public String d;
        public Long e;
        public Long f;
        public String g;

        public b() {
        }

        public b(kw0 kw0Var) {
            this.a = kw0Var.d();
            this.b = kw0Var.g();
            this.c = kw0Var.b();
            this.d = kw0Var.f();
            this.e = Long.valueOf(kw0Var.c());
            this.f = Long.valueOf(kw0Var.h());
            this.g = kw0Var.e();
        }

        @Override // com.daaw.kw0.a
        public kw0 a() {
            String str = "";
            if (this.b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new m9(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.kw0.a
        public kw0.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.kw0.a
        public kw0.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.kw0.a
        public kw0.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // com.daaw.kw0.a
        public kw0.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // com.daaw.kw0.a
        public kw0.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // com.daaw.kw0.a
        public kw0.a g(jw0.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.b = aVar;
            return this;
        }

        @Override // com.daaw.kw0.a
        public kw0.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    public m9(String str, jw0.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // com.daaw.kw0
    public String b() {
        return this.d;
    }

    @Override // com.daaw.kw0
    public long c() {
        return this.f;
    }

    @Override // com.daaw.kw0
    public String d() {
        return this.b;
    }

    @Override // com.daaw.kw0
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kw0) {
            kw0 kw0Var = (kw0) obj;
            String str3 = this.b;
            if (str3 != null ? str3.equals(kw0Var.d()) : kw0Var.d() == null) {
                if (this.c.equals(kw0Var.g()) && ((str = this.d) != null ? str.equals(kw0Var.b()) : kw0Var.b() == null) && ((str2 = this.e) != null ? str2.equals(kw0Var.f()) : kw0Var.f() == null) && this.f == kw0Var.c() && this.g == kw0Var.h()) {
                    String str4 = this.h;
                    String e = kw0Var.e();
                    if (str4 == null) {
                        if (e == null) {
                            return true;
                        }
                    } else if (str4.equals(e)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.kw0
    public String f() {
        return this.e;
    }

    @Override // com.daaw.kw0
    public jw0.a g() {
        return this.c;
    }

    @Override // com.daaw.kw0
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f;
        long j2 = this.g;
        int i = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return i ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.daaw.kw0
    public kw0.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }
}
