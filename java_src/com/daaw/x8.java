package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class x8 extends lm.e.d.AbstractC0074d {
    public final String a;

    /* loaded from: classes2.dex */
    public static final class b extends lm.e.d.AbstractC0074d.a {
        public String a;

        @Override // com.daaw.lm.e.d.AbstractC0074d.a
        public lm.e.d.AbstractC0074d a() {
            String str = "";
            if (this.a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new x8(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.e.d.AbstractC0074d.a
        public lm.e.d.AbstractC0074d.a b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.a = str;
            return this;
        }
    }

    public x8(String str) {
        this.a = str;
    }

    @Override // com.daaw.lm.e.d.AbstractC0074d
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.e.d.AbstractC0074d) {
            return this.a.equals(((lm.e.d.AbstractC0074d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }
}
