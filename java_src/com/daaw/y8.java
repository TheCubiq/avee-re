package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class y8 extends lm.e.AbstractC0075e {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.AbstractC0075e.a {
        public Integer a;
        public String b;
        public String c;
        public Boolean d;

        @Override // com.daaw.lm.e.AbstractC0075e.a
        public lm.e.AbstractC0075e a() {
            String str = "";
            if (this.a == null) {
                str = " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new y8(this.a.intValue(), this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.AbstractC0075e.a
        public lm.e.AbstractC0075e.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.c = str;
            return this;
        }

        @Override // com.daaw.lm.e.AbstractC0075e.a
        public lm.e.AbstractC0075e.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.lm.e.AbstractC0075e.a
        public lm.e.AbstractC0075e.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.e.AbstractC0075e.a
        public lm.e.AbstractC0075e.a e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.b = str;
            return this;
        }
    }

    public y8(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // com.daaw.lm.e.AbstractC0075e
    public String b() {
        return this.c;
    }

    @Override // com.daaw.lm.e.AbstractC0075e
    public int c() {
        return this.a;
    }

    @Override // com.daaw.lm.e.AbstractC0075e
    public String d() {
        return this.b;
    }

    @Override // com.daaw.lm.e.AbstractC0075e
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.AbstractC0075e) {
            lm.e.AbstractC0075e abstractC0075e = (lm.e.AbstractC0075e) obj;
            return this.a == abstractC0075e.c() && this.b.equals(abstractC0075e.d()) && this.c.equals(abstractC0075e.b()) && this.d == abstractC0075e.e();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
