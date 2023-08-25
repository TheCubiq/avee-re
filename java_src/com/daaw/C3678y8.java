package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.y8 */
/* loaded from: classes2.dex */
public final class C3678y8 extends AbstractC2057lm.AbstractC2067e.AbstractC2094e {

    /* renamed from: a */
    public final int f33411a;

    /* renamed from: b */
    public final String f33412b;

    /* renamed from: c */
    public final String f33413c;

    /* renamed from: d */
    public final boolean f33414d;

    /* renamed from: com.daaw.y8$b */
    /* loaded from: classes2.dex */
    public static final class C3680b extends AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a {

        /* renamed from: a */
        public Integer f33415a;

        /* renamed from: b */
        public String f33416b;

        /* renamed from: c */
        public String f33417c;

        /* renamed from: d */
        public Boolean f33418d;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2094e mo4023a() {
            String str = "";
            if (this.f33415a == null) {
                str = " platform";
            }
            if (this.f33416b == null) {
                str = str + " version";
            }
            if (this.f33417c == null) {
                str = str + " buildVersion";
            }
            if (this.f33418d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new C3678y8(this.f33415a.intValue(), this.f33416b, this.f33417c, this.f33418d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a mo4022b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f33417c = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a mo4021c(boolean z) {
            this.f33418d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a
        /* renamed from: d */
        public AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a mo4020d(int i) {
            this.f33415a = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a
        /* renamed from: e */
        public AbstractC2057lm.AbstractC2067e.AbstractC2094e.AbstractC2095a mo4019e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f33416b = str;
            return this;
        }
    }

    public C3678y8(int i, String str, String str2, boolean z) {
        this.f33411a = i;
        this.f33412b = str;
        this.f33413c = str2;
        this.f33414d = z;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e
    /* renamed from: b */
    public String mo4027b() {
        return this.f33413c;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e
    /* renamed from: c */
    public int mo4026c() {
        return this.f33411a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e
    /* renamed from: d */
    public String mo4025d() {
        return this.f33412b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2094e
    /* renamed from: e */
    public boolean mo4024e() {
        return this.f33414d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2094e) {
            AbstractC2057lm.AbstractC2067e.AbstractC2094e abstractC2094e = (AbstractC2057lm.AbstractC2067e.AbstractC2094e) obj;
            return this.f33411a == abstractC2094e.mo4026c() && this.f33412b.equals(abstractC2094e.mo4025d()) && this.f33413c.equals(abstractC2094e.mo4027b()) && this.f33414d == abstractC2094e.mo4024e();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f33411a ^ 1000003) * 1000003) ^ this.f33412b.hashCode()) * 1000003) ^ this.f33413c.hashCode()) * 1000003) ^ (this.f33414d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f33411a + ", version=" + this.f33412b + ", buildVersion=" + this.f33413c + ", jailbroken=" + this.f33414d + "}";
    }
}
