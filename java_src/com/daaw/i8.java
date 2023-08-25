package com.daaw;

import com.daaw.lm;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class i8 extends lm.d {
    public final of0<lm.d.b> a;
    public final String b;

    /* loaded from: classes2.dex */
    public static final class b extends lm.d.a {
        public of0<lm.d.b> a;
        public String b;

        @Override // com.daaw.lm.d.a
        public lm.d a() {
            String str = "";
            if (this.a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new i8(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.d.a
        public lm.d.a b(of0<lm.d.b> of0Var) {
            Objects.requireNonNull(of0Var, "Null files");
            this.a = of0Var;
            return this;
        }

        @Override // com.daaw.lm.d.a
        public lm.d.a c(String str) {
            this.b = str;
            return this;
        }
    }

    public i8(of0<lm.d.b> of0Var, String str) {
        this.a = of0Var;
        this.b = str;
    }

    @Override // com.daaw.lm.d
    public of0<lm.d.b> b() {
        return this.a;
    }

    @Override // com.daaw.lm.d
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.d) {
            lm.d dVar = (lm.d) obj;
            if (this.a.equals(dVar.b())) {
                String str = this.b;
                String c = dVar.c();
                if (str == null) {
                    if (c == null) {
                        return true;
                    }
                } else if (str.equals(c)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }
}
