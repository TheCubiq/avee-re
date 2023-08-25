package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.l8 */
/* loaded from: classes2.dex */
public final class C2017l8 extends AbstractC2057lm.AbstractC2067e.AbstractC2068a {

    /* renamed from: a */
    public final String f17115a;

    /* renamed from: b */
    public final String f17116b;

    /* renamed from: c */
    public final String f17117c;

    /* renamed from: d */
    public final AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b f17118d;

    /* renamed from: e */
    public final String f17119e;

    /* renamed from: f */
    public final String f17120f;

    /* renamed from: g */
    public final String f17121g;

    /* renamed from: com.daaw.l8$b */
    /* loaded from: classes2.dex */
    public static final class C2019b extends AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a {

        /* renamed from: a */
        public String f17122a;

        /* renamed from: b */
        public String f17123b;

        /* renamed from: c */
        public String f17124c;

        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b f17125d;

        /* renamed from: e */
        public String f17126e;

        /* renamed from: f */
        public String f17127f;

        /* renamed from: g */
        public String f17128g;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a mo16765a() {
            String str = "";
            if (this.f17122a == null) {
                str = " identifier";
            }
            if (this.f17123b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C2017l8(this.f17122a, this.f17123b, this.f17124c, this.f17125d, this.f17126e, this.f17127f, this.f17128g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a mo16764b(String str) {
            this.f17127f = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a mo16763c(String str) {
            this.f17128g = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a mo16762d(String str) {
            this.f17124c = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a mo16761e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f17122a = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a mo16760f(String str) {
            this.f17126e = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a
        /* renamed from: g */
        public AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2069a mo16759g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f17123b = str;
            return this;
        }
    }

    public C2017l8(String str, String str2, String str3, AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b abstractC2070b, String str4, String str5, String str6) {
        this.f17115a = str;
        this.f17116b = str2;
        this.f17117c = str3;
        this.f17118d = abstractC2070b;
        this.f17119e = str4;
        this.f17120f = str5;
        this.f17121g = str6;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a
    /* renamed from: b */
    public String mo16772b() {
        return this.f17120f;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a
    /* renamed from: c */
    public String mo16771c() {
        return this.f17121g;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a
    /* renamed from: d */
    public String mo16770d() {
        return this.f17117c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a
    /* renamed from: e */
    public String mo16769e() {
        return this.f17115a;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b abstractC2070b;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2068a) {
            AbstractC2057lm.AbstractC2067e.AbstractC2068a abstractC2068a = (AbstractC2057lm.AbstractC2067e.AbstractC2068a) obj;
            if (this.f17115a.equals(abstractC2068a.mo16769e()) && this.f17116b.equals(abstractC2068a.mo16766h()) && ((str = this.f17117c) != null ? str.equals(abstractC2068a.mo16770d()) : abstractC2068a.mo16770d() == null) && ((abstractC2070b = this.f17118d) != null ? abstractC2070b.equals(abstractC2068a.mo16767g()) : abstractC2068a.mo16767g() == null) && ((str2 = this.f17119e) != null ? str2.equals(abstractC2068a.mo16768f()) : abstractC2068a.mo16768f() == null) && ((str3 = this.f17120f) != null ? str3.equals(abstractC2068a.mo16772b()) : abstractC2068a.mo16772b() == null)) {
                String str4 = this.f17121g;
                String mo16771c = abstractC2068a.mo16771c();
                if (str4 == null) {
                    if (mo16771c == null) {
                        return true;
                    }
                } else if (str4.equals(mo16771c)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a
    /* renamed from: f */
    public String mo16768f() {
        return this.f17119e;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a
    /* renamed from: g */
    public AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b mo16767g() {
        return this.f17118d;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2068a
    /* renamed from: h */
    public String mo16766h() {
        return this.f17116b;
    }

    public int hashCode() {
        int hashCode = (((this.f17115a.hashCode() ^ 1000003) * 1000003) ^ this.f17116b.hashCode()) * 1000003;
        String str = this.f17117c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AbstractC2057lm.AbstractC2067e.AbstractC2068a.AbstractC2070b abstractC2070b = this.f17118d;
        int hashCode3 = (hashCode2 ^ (abstractC2070b == null ? 0 : abstractC2070b.hashCode())) * 1000003;
        String str2 = this.f17119e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f17120f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f17121g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f17115a + ", version=" + this.f17116b + ", displayVersion=" + this.f17117c + ", organization=" + this.f17118d + ", installationUuid=" + this.f17119e + ", developmentPlatform=" + this.f17120f + ", developmentPlatformVersion=" + this.f17121g + "}";
    }
}
