package com.daaw;

import com.daaw.jw0;
import com.daaw.kw0;
import java.util.Objects;
/* renamed from: com.daaw.m9 */
/* loaded from: classes2.dex */
public final class C2158m9 extends kw0 {

    /* renamed from: b */
    public final String f18664b;

    /* renamed from: c */
    public final jw0.EnumC1884a f18665c;

    /* renamed from: d */
    public final String f18666d;

    /* renamed from: e */
    public final String f18667e;

    /* renamed from: f */
    public final long f18668f;

    /* renamed from: g */
    public final long f18669g;

    /* renamed from: h */
    public final String f18670h;

    /* renamed from: com.daaw.m9$b */
    /* loaded from: classes2.dex */
    public static final class C2160b extends kw0.AbstractC1990a {

        /* renamed from: a */
        public String f18671a;

        /* renamed from: b */
        public jw0.EnumC1884a f18672b;

        /* renamed from: c */
        public String f18673c;

        /* renamed from: d */
        public String f18674d;

        /* renamed from: e */
        public Long f18675e;

        /* renamed from: f */
        public Long f18676f;

        /* renamed from: g */
        public String f18677g;

        public C2160b() {
        }

        public C2160b(kw0 kw0Var) {
            this.f18671a = kw0Var.mo16161d();
            this.f18672b = kw0Var.mo16158g();
            this.f18673c = kw0Var.mo16163b();
            this.f18674d = kw0Var.mo16159f();
            this.f18675e = Long.valueOf(kw0Var.mo16162c());
            this.f18676f = Long.valueOf(kw0Var.mo16157h());
            this.f18677g = kw0Var.mo16160e();
        }

        @Override // com.daaw.kw0.AbstractC1990a
        /* renamed from: a */
        public kw0 mo16155a() {
            String str = "";
            if (this.f18672b == null) {
                str = " registrationStatus";
            }
            if (this.f18675e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f18676f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C2158m9(this.f18671a, this.f18672b, this.f18673c, this.f18674d, this.f18675e.longValue(), this.f18676f.longValue(), this.f18677g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.kw0.AbstractC1990a
        /* renamed from: b */
        public kw0.AbstractC1990a mo16154b(String str) {
            this.f18673c = str;
            return this;
        }

        @Override // com.daaw.kw0.AbstractC1990a
        /* renamed from: c */
        public kw0.AbstractC1990a mo16153c(long j) {
            this.f18675e = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.kw0.AbstractC1990a
        /* renamed from: d */
        public kw0.AbstractC1990a mo16152d(String str) {
            this.f18671a = str;
            return this;
        }

        @Override // com.daaw.kw0.AbstractC1990a
        /* renamed from: e */
        public kw0.AbstractC1990a mo16151e(String str) {
            this.f18677g = str;
            return this;
        }

        @Override // com.daaw.kw0.AbstractC1990a
        /* renamed from: f */
        public kw0.AbstractC1990a mo16150f(String str) {
            this.f18674d = str;
            return this;
        }

        @Override // com.daaw.kw0.AbstractC1990a
        /* renamed from: g */
        public kw0.AbstractC1990a mo16149g(jw0.EnumC1884a enumC1884a) {
            Objects.requireNonNull(enumC1884a, "Null registrationStatus");
            this.f18672b = enumC1884a;
            return this;
        }

        @Override // com.daaw.kw0.AbstractC1990a
        /* renamed from: h */
        public kw0.AbstractC1990a mo16148h(long j) {
            this.f18676f = Long.valueOf(j);
            return this;
        }
    }

    public C2158m9(String str, jw0.EnumC1884a enumC1884a, String str2, String str3, long j, long j2, String str4) {
        this.f18664b = str;
        this.f18665c = enumC1884a;
        this.f18666d = str2;
        this.f18667e = str3;
        this.f18668f = j;
        this.f18669g = j2;
        this.f18670h = str4;
    }

    @Override // com.daaw.kw0
    /* renamed from: b */
    public String mo16163b() {
        return this.f18666d;
    }

    @Override // com.daaw.kw0
    /* renamed from: c */
    public long mo16162c() {
        return this.f18668f;
    }

    @Override // com.daaw.kw0
    /* renamed from: d */
    public String mo16161d() {
        return this.f18664b;
    }

    @Override // com.daaw.kw0
    /* renamed from: e */
    public String mo16160e() {
        return this.f18670h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kw0) {
            kw0 kw0Var = (kw0) obj;
            String str3 = this.f18664b;
            if (str3 != null ? str3.equals(kw0Var.mo16161d()) : kw0Var.mo16161d() == null) {
                if (this.f18665c.equals(kw0Var.mo16158g()) && ((str = this.f18666d) != null ? str.equals(kw0Var.mo16163b()) : kw0Var.mo16163b() == null) && ((str2 = this.f18667e) != null ? str2.equals(kw0Var.mo16159f()) : kw0Var.mo16159f() == null) && this.f18668f == kw0Var.mo16162c() && this.f18669g == kw0Var.mo16157h()) {
                    String str4 = this.f18670h;
                    String mo16160e = kw0Var.mo16160e();
                    if (str4 == null) {
                        if (mo16160e == null) {
                            return true;
                        }
                    } else if (str4.equals(mo16160e)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.kw0
    /* renamed from: f */
    public String mo16159f() {
        return this.f18667e;
    }

    @Override // com.daaw.kw0
    /* renamed from: g */
    public jw0.EnumC1884a mo16158g() {
        return this.f18665c;
    }

    @Override // com.daaw.kw0
    /* renamed from: h */
    public long mo16157h() {
        return this.f18669g;
    }

    public int hashCode() {
        String str = this.f18664b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f18665c.hashCode()) * 1000003;
        String str2 = this.f18666d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18667e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f18668f;
        long j2 = this.f18669g;
        int i = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f18670h;
        return i ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.daaw.kw0
    /* renamed from: n */
    public kw0.AbstractC1990a mo16156n() {
        return new C2160b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f18664b + ", registrationStatus=" + this.f18665c + ", authToken=" + this.f18666d + ", refreshToken=" + this.f18667e + ", expiresInSecs=" + this.f18668f + ", tokenCreationEpochInSecs=" + this.f18669g + ", fisError=" + this.f18670h + "}";
    }
}
