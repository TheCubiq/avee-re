package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class l8 extends lm.e.a {
    public final String a;
    public final String b;
    public final String c;
    public final lm.e.a.b d;
    public final String e;
    public final String f;
    public final String g;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.a.AbstractC0062a {
        public String a;
        public String b;
        public String c;
        public lm.e.a.b d;
        public String e;
        public String f;
        public String g;

        @Override // com.daaw.lm.e.a.AbstractC0062a
        public lm.e.a a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new l8(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.a.AbstractC0062a
        public lm.e.a.AbstractC0062a b(String str) {
            this.f = str;
            return this;
        }

        @Override // com.daaw.lm.e.a.AbstractC0062a
        public lm.e.a.AbstractC0062a c(String str) {
            this.g = str;
            return this;
        }

        @Override // com.daaw.lm.e.a.AbstractC0062a
        public lm.e.a.AbstractC0062a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.lm.e.a.AbstractC0062a
        public lm.e.a.AbstractC0062a e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.a = str;
            return this;
        }

        @Override // com.daaw.lm.e.a.AbstractC0062a
        public lm.e.a.AbstractC0062a f(String str) {
            this.e = str;
            return this;
        }

        @Override // com.daaw.lm.e.a.AbstractC0062a
        public lm.e.a.AbstractC0062a g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.b = str;
            return this;
        }
    }

    public l8(String str, String str2, String str3, lm.e.a.b bVar, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // com.daaw.lm.e.a
    public String b() {
        return this.f;
    }

    @Override // com.daaw.lm.e.a
    public String c() {
        return this.g;
    }

    @Override // com.daaw.lm.e.a
    public String d() {
        return this.c;
    }

    @Override // com.daaw.lm.e.a
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        lm.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.a) {
            lm.e.a aVar = (lm.e.a) obj;
            if (this.a.equals(aVar.e()) && this.b.equals(aVar.h()) && ((str = this.c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
                String str4 = this.g;
                String c = aVar.c();
                if (str4 == null) {
                    if (c == null) {
                        return true;
                    }
                } else if (str4.equals(c)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.lm.e.a
    public String f() {
        return this.e;
    }

    @Override // com.daaw.lm.e.a
    public lm.e.a.b g() {
        return this.d;
    }

    @Override // com.daaw.lm.e.a
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        lm.e.a.b bVar = this.d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.a + ", version=" + this.b + ", displayVersion=" + this.c + ", organization=" + this.d + ", installationUuid=" + this.e + ", developmentPlatform=" + this.f + ", developmentPlatformVersion=" + this.g + "}";
    }
}
