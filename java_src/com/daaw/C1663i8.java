package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.i8 */
/* loaded from: classes2.dex */
public final class C1663i8 extends AbstractC2057lm.AbstractC2063d {

    /* renamed from: a */
    public final of0<AbstractC2057lm.AbstractC2063d.AbstractC2065b> f13342a;

    /* renamed from: b */
    public final String f13343b;

    /* renamed from: com.daaw.i8$b */
    /* loaded from: classes2.dex */
    public static final class C1665b extends AbstractC2057lm.AbstractC2063d.AbstractC2064a {

        /* renamed from: a */
        public of0<AbstractC2057lm.AbstractC2063d.AbstractC2065b> f13344a;

        /* renamed from: b */
        public String f13345b;

        @Override // com.daaw.AbstractC2057lm.AbstractC2063d.AbstractC2064a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2063d mo16798a() {
            String str = "";
            if (this.f13344a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new C1663i8(this.f13344a, this.f13345b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2063d.AbstractC2064a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2063d.AbstractC2064a mo16797b(of0<AbstractC2057lm.AbstractC2063d.AbstractC2065b> of0Var) {
            Objects.requireNonNull(of0Var, "Null files");
            this.f13344a = of0Var;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2063d.AbstractC2064a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2063d.AbstractC2064a mo16796c(String str) {
            this.f13345b = str;
            return this;
        }
    }

    public C1663i8(of0<AbstractC2057lm.AbstractC2063d.AbstractC2065b> of0Var, String str) {
        this.f13342a = of0Var;
        this.f13343b = str;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2063d
    /* renamed from: b */
    public of0<AbstractC2057lm.AbstractC2063d.AbstractC2065b> mo16800b() {
        return this.f13342a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2063d
    /* renamed from: c */
    public String mo16799c() {
        return this.f13343b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2063d) {
            AbstractC2057lm.AbstractC2063d abstractC2063d = (AbstractC2057lm.AbstractC2063d) obj;
            if (this.f13342a.equals(abstractC2063d.mo16800b())) {
                String str = this.f13343b;
                String mo16799c = abstractC2063d.mo16799c();
                if (str == null) {
                    if (mo16799c == null) {
                        return true;
                    }
                } else if (str.equals(mo16799c)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f13342a.hashCode() ^ 1000003) * 1000003;
        String str = this.f13343b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f13342a + ", orgId=" + this.f13343b + "}";
    }
}
