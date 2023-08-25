package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class e8 extends lm {
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final lm.e h;
    public final lm.d i;

    /* loaded from: classes2.dex */
    public static final class b extends lm.b {
        public String a;
        public String b;
        public Integer c;
        public String d;
        public String e;
        public String f;
        public lm.e g;
        public lm.d h;

        public b() {
        }

        public b(lm lmVar) {
            this.a = lmVar.i();
            this.b = lmVar.e();
            this.c = Integer.valueOf(lmVar.h());
            this.d = lmVar.f();
            this.e = lmVar.c();
            this.f = lmVar.d();
            this.g = lmVar.j();
            this.h = lmVar.g();
        }

        @Override // com.daaw.lm.b
        public lm a() {
            String str = "";
            if (this.a == null) {
                str = " sdkVersion";
            }
            if (this.b == null) {
                str = str + " gmpAppId";
            }
            if (this.c == null) {
                str = str + " platform";
            }
            if (this.d == null) {
                str = str + " installationUuid";
            }
            if (this.e == null) {
                str = str + " buildVersion";
            }
            if (this.f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new e8(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.b
        public lm.b b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.e = str;
            return this;
        }

        @Override // com.daaw.lm.b
        public lm.b c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f = str;
            return this;
        }

        @Override // com.daaw.lm.b
        public lm.b d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.b = str;
            return this;
        }

        @Override // com.daaw.lm.b
        public lm.b e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.d = str;
            return this;
        }

        @Override // com.daaw.lm.b
        public lm.b f(lm.d dVar) {
            this.h = dVar;
            return this;
        }

        @Override // com.daaw.lm.b
        public lm.b g(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.b
        public lm.b h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.a = str;
            return this;
        }

        @Override // com.daaw.lm.b
        public lm.b i(lm.e eVar) {
            this.g = eVar;
            return this;
        }
    }

    public e8(String str, String str2, int i, String str3, String str4, String str5, lm.e eVar, lm.d dVar) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = eVar;
        this.i = dVar;
    }

    @Override // com.daaw.lm
    public String c() {
        return this.f;
    }

    @Override // com.daaw.lm
    public String d() {
        return this.g;
    }

    @Override // com.daaw.lm
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        lm.e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm) {
            lm lmVar = (lm) obj;
            if (this.b.equals(lmVar.i()) && this.c.equals(lmVar.e()) && this.d == lmVar.h() && this.e.equals(lmVar.f()) && this.f.equals(lmVar.c()) && this.g.equals(lmVar.d()) && ((eVar = this.h) != null ? eVar.equals(lmVar.j()) : lmVar.j() == null)) {
                lm.d dVar = this.i;
                lm.d g = lmVar.g();
                if (dVar == null) {
                    if (g == null) {
                        return true;
                    }
                } else if (dVar.equals(g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.lm
    public String f() {
        return this.e;
    }

    @Override // com.daaw.lm
    public lm.d g() {
        return this.i;
    }

    @Override // com.daaw.lm
    public int h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        lm.e eVar = this.h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        lm.d dVar = this.i;
        return hashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // com.daaw.lm
    public String i() {
        return this.b;
    }

    @Override // com.daaw.lm
    public lm.e j() {
        return this.h;
    }

    @Override // com.daaw.lm
    public lm.b k() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", buildVersion=" + this.f + ", displayVersion=" + this.g + ", session=" + this.h + ", ndkPayload=" + this.i + "}";
    }
}
