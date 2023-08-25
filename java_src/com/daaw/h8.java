package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class h8 extends lm.c {
    public final String a;
    public final String b;

    /* loaded from: classes2.dex */
    public static final class b extends lm.c.a {
        public String a;
        public String b;

        @Override // com.daaw.lm.c.a
        public lm.c a() {
            String str = "";
            if (this.a == null) {
                str = " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new h8(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.c.a
        public lm.c.a b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.a = str;
            return this;
        }

        @Override // com.daaw.lm.c.a
        public lm.c.a c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.b = str;
            return this;
        }
    }

    public h8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.daaw.lm.c
    public String b() {
        return this.a;
    }

    @Override // com.daaw.lm.c
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.c) {
            lm.c cVar = (lm.c) obj;
            return this.a.equals(cVar.b()) && this.b.equals(cVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }
}
