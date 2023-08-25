package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.e8 */
/* loaded from: classes2.dex */
public final class C1166e8 extends AbstractC2057lm {

    /* renamed from: b */
    public final String f8234b;

    /* renamed from: c */
    public final String f8235c;

    /* renamed from: d */
    public final int f8236d;

    /* renamed from: e */
    public final String f8237e;

    /* renamed from: f */
    public final String f8238f;

    /* renamed from: g */
    public final String f8239g;

    /* renamed from: h */
    public final AbstractC2057lm.AbstractC2067e f8240h;

    /* renamed from: i */
    public final AbstractC2057lm.AbstractC2063d f8241i;

    /* renamed from: com.daaw.e8$b */
    /* loaded from: classes2.dex */
    public static final class C1168b extends AbstractC2057lm.AbstractC2060b {

        /* renamed from: a */
        public String f8242a;

        /* renamed from: b */
        public String f8243b;

        /* renamed from: c */
        public Integer f8244c;

        /* renamed from: d */
        public String f8245d;

        /* renamed from: e */
        public String f8246e;

        /* renamed from: f */
        public String f8247f;

        /* renamed from: g */
        public AbstractC2057lm.AbstractC2067e f8248g;

        /* renamed from: h */
        public AbstractC2057lm.AbstractC2063d f8249h;

        public C1168b() {
        }

        public C1168b(AbstractC2057lm abstractC2057lm) {
            this.f8242a = abstractC2057lm.mo16840i();
            this.f8243b = abstractC2057lm.mo16844e();
            this.f8244c = Integer.valueOf(abstractC2057lm.mo16841h());
            this.f8245d = abstractC2057lm.mo16843f();
            this.f8246e = abstractC2057lm.mo16846c();
            this.f8247f = abstractC2057lm.mo16845d();
            this.f8248g = abstractC2057lm.mo16839j();
            this.f8249h = abstractC2057lm.mo16842g();
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: a */
        public AbstractC2057lm mo16816a() {
            String str = "";
            if (this.f8242a == null) {
                str = " sdkVersion";
            }
            if (this.f8243b == null) {
                str = str + " gmpAppId";
            }
            if (this.f8244c == null) {
                str = str + " platform";
            }
            if (this.f8245d == null) {
                str = str + " installationUuid";
            }
            if (this.f8246e == null) {
                str = str + " buildVersion";
            }
            if (this.f8247f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C1166e8(this.f8242a, this.f8243b, this.f8244c.intValue(), this.f8245d, this.f8246e, this.f8247f, this.f8248g, this.f8249h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2060b mo16815b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f8246e = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2060b mo16814c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f8247f = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2060b mo16813d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f8243b = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2060b mo16812e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f8245d = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: f */
        public AbstractC2057lm.AbstractC2060b mo16811f(AbstractC2057lm.AbstractC2063d abstractC2063d) {
            this.f8249h = abstractC2063d;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: g */
        public AbstractC2057lm.AbstractC2060b mo16810g(int i) {
            this.f8244c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: h */
        public AbstractC2057lm.AbstractC2060b mo16809h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f8242a = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2060b
        /* renamed from: i */
        public AbstractC2057lm.AbstractC2060b mo16808i(AbstractC2057lm.AbstractC2067e abstractC2067e) {
            this.f8248g = abstractC2067e;
            return this;
        }
    }

    public C1166e8(String str, String str2, int i, String str3, String str4, String str5, AbstractC2057lm.AbstractC2067e abstractC2067e, AbstractC2057lm.AbstractC2063d abstractC2063d) {
        this.f8234b = str;
        this.f8235c = str2;
        this.f8236d = i;
        this.f8237e = str3;
        this.f8238f = str4;
        this.f8239g = str5;
        this.f8240h = abstractC2067e;
        this.f8241i = abstractC2063d;
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: c */
    public String mo16846c() {
        return this.f8238f;
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: d */
    public String mo16845d() {
        return this.f8239g;
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: e */
    public String mo16844e() {
        return this.f8235c;
    }

    public boolean equals(Object obj) {
        AbstractC2057lm.AbstractC2067e abstractC2067e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm) {
            AbstractC2057lm abstractC2057lm = (AbstractC2057lm) obj;
            if (this.f8234b.equals(abstractC2057lm.mo16840i()) && this.f8235c.equals(abstractC2057lm.mo16844e()) && this.f8236d == abstractC2057lm.mo16841h() && this.f8237e.equals(abstractC2057lm.mo16843f()) && this.f8238f.equals(abstractC2057lm.mo16846c()) && this.f8239g.equals(abstractC2057lm.mo16845d()) && ((abstractC2067e = this.f8240h) != null ? abstractC2067e.equals(abstractC2057lm.mo16839j()) : abstractC2057lm.mo16839j() == null)) {
                AbstractC2057lm.AbstractC2063d abstractC2063d = this.f8241i;
                AbstractC2057lm.AbstractC2063d mo16842g = abstractC2057lm.mo16842g();
                if (abstractC2063d == null) {
                    if (mo16842g == null) {
                        return true;
                    }
                } else if (abstractC2063d.equals(mo16842g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: f */
    public String mo16843f() {
        return this.f8237e;
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: g */
    public AbstractC2057lm.AbstractC2063d mo16842g() {
        return this.f8241i;
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: h */
    public int mo16841h() {
        return this.f8236d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f8234b.hashCode() ^ 1000003) * 1000003) ^ this.f8235c.hashCode()) * 1000003) ^ this.f8236d) * 1000003) ^ this.f8237e.hashCode()) * 1000003) ^ this.f8238f.hashCode()) * 1000003) ^ this.f8239g.hashCode()) * 1000003;
        AbstractC2057lm.AbstractC2067e abstractC2067e = this.f8240h;
        int hashCode2 = (hashCode ^ (abstractC2067e == null ? 0 : abstractC2067e.hashCode())) * 1000003;
        AbstractC2057lm.AbstractC2063d abstractC2063d = this.f8241i;
        return hashCode2 ^ (abstractC2063d != null ? abstractC2063d.hashCode() : 0);
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: i */
    public String mo16840i() {
        return this.f8234b;
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: j */
    public AbstractC2057lm.AbstractC2067e mo16839j() {
        return this.f8240h;
    }

    @Override // com.daaw.AbstractC2057lm
    /* renamed from: k */
    public AbstractC2057lm.AbstractC2060b mo16838k() {
        return new C1168b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8234b + ", gmpAppId=" + this.f8235c + ", platform=" + this.f8236d + ", installationUuid=" + this.f8237e + ", buildVersion=" + this.f8238f + ", displayVersion=" + this.f8239g + ", session=" + this.f8240h + ", ndkPayload=" + this.f8241i + "}";
    }
}
