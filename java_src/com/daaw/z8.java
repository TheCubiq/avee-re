package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class z8 extends lm.e.f {
    public final String a;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.f.a {
        public String a;

        @Override // com.daaw.lm.e.f.a
        public lm.e.f a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new z8(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.f.a
        public lm.e.f.a b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.a = str;
            return this;
        }
    }

    public z8(String str) {
        this.a = str;
    }

    @Override // com.daaw.lm.e.f
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.f) {
            return this.a.equals(((lm.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }
}
