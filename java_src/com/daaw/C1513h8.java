package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Objects;
/* renamed from: com.daaw.h8 */
/* loaded from: classes2.dex */
public final class C1513h8 extends AbstractC2057lm.AbstractC2061c {

    /* renamed from: a */
    public final String f12164a;

    /* renamed from: b */
    public final String f12165b;

    /* renamed from: com.daaw.h8$b */
    /* loaded from: classes2.dex */
    public static final class C1515b extends AbstractC2057lm.AbstractC2061c.AbstractC2062a {

        /* renamed from: a */
        public String f12166a;

        /* renamed from: b */
        public String f12167b;

        @Override // com.daaw.AbstractC2057lm.AbstractC2061c.AbstractC2062a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2061c mo16804a() {
            String str = "";
            if (this.f12166a == null) {
                str = " key";
            }
            if (this.f12167b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new C1513h8(this.f12166a, this.f12167b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2061c.AbstractC2062a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2061c.AbstractC2062a mo16803b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f12166a = str;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2061c.AbstractC2062a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2061c.AbstractC2062a mo16802c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f12167b = str;
            return this;
        }
    }

    public C1513h8(String str, String str2) {
        this.f12164a = str;
        this.f12165b = str2;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2061c
    /* renamed from: b */
    public String mo16806b() {
        return this.f12164a;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2061c
    /* renamed from: c */
    public String mo16805c() {
        return this.f12165b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2061c) {
            AbstractC2057lm.AbstractC2061c abstractC2061c = (AbstractC2057lm.AbstractC2061c) obj;
            return this.f12164a.equals(abstractC2061c.mo16806b()) && this.f12165b.equals(abstractC2061c.mo16805c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f12164a.hashCode() ^ 1000003) * 1000003) ^ this.f12165b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f12164a + ", value=" + this.f12165b + "}";
    }
}
