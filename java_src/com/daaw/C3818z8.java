package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.z8 */
/* loaded from: classes2.dex */
public final class C3818z8 extends AbstractC2057lm.AbstractC2067e.AbstractC2096f {

    /* renamed from: a */
    public final String f34572a;

    /* renamed from: com.daaw.z8$b */
    /* loaded from: classes2.dex */
    public static final class C3820b extends AbstractC2057lm.AbstractC2067e.AbstractC2096f.AbstractC2097a {

        /* renamed from: a */
        public String f34573a;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2096f.AbstractC2097a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2096f mo2641a() {
            String str = "";
            if (this.f34573a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new C3818z8(this.f34573a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2096f.AbstractC2097a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2096f.AbstractC2097a mo2640b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f34573a = str;
            return this;
        }
    }

    public C3818z8(String str) {
        this.f34572a = str;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2096f
    /* renamed from: b */
    public String mo2642b() {
        return this.f34572a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2096f) {
            return this.f34572a.equals(((AbstractC2057lm.AbstractC2067e.AbstractC2096f) obj).mo2642b());
        }
        return false;
    }

    public int hashCode() {
        return this.f34572a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f34572a + "}";
    }
}
