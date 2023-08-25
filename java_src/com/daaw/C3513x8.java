package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.x8 */
/* loaded from: classes2.dex */
public final class C3513x8 extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d {

    /* renamed from: a */
    public final String f32179a;

    /* renamed from: com.daaw.x8$b */
    /* loaded from: classes2.dex */
    public static final class C3515b extends AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d.AbstractC2093a {

        /* renamed from: a */
        public String f32180a;

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d.AbstractC2093a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d mo5447a() {
            String str = "";
            if (this.f32180a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new C3513x8(this.f32180a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d.AbstractC2093a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d.AbstractC2093a mo5446b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f32180a = str;
            return this;
        }
    }

    public C3513x8(String str) {
        this.f32179a = str;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d
    /* renamed from: b */
    public String mo5448b() {
        return this.f32179a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d) {
            return this.f32179a.equals(((AbstractC2057lm.AbstractC2067e.AbstractC2074d.AbstractC2092d) obj).mo5448b());
        }
        return false;
    }

    public int hashCode() {
        return this.f32179a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f32179a + "}";
    }
}
