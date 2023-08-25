package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class u8 extends lm.e.d.a.b.AbstractC0070e {
    public final String a;
    public final int b;
    public final of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> c;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.a.b.AbstractC0070e.AbstractC0071a {
        public String a;
        public Integer b;
        public of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> c;

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0071a
        public lm.e.d.a.b.AbstractC0070e a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " importance";
            }
            if (this.c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new u8(this.a, this.b.intValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0071a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0071a b(of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> of0Var) {
            Objects.requireNonNull(of0Var, "Null frames");
            this.c = of0Var;
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0071a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0071a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.lm.e.d.a.b.AbstractC0070e.AbstractC0071a
        public lm.e.d.a.b.AbstractC0070e.AbstractC0071a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.a = str;
            return this;
        }
    }

    public u8(String str, int i, of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> of0Var) {
        this.a = str;
        this.b = i;
        this.c = of0Var;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0070e
    public of0<lm.e.d.a.b.AbstractC0070e.AbstractC0072b> b() {
        return this.c;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0070e
    public int c() {
        return this.b;
    }

    @Override // com.daaw.lm.e.d.a.b.AbstractC0070e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d.a.b.AbstractC0070e) {
            lm.e.d.a.b.AbstractC0070e abstractC0070e = (lm.e.d.a.b.AbstractC0070e) obj;
            return this.a.equals(abstractC0070e.d()) && this.b == abstractC0070e.c() && this.c.equals(abstractC0070e.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.a + ", importance=" + this.b + ", frames=" + this.c + "}";
    }
}
