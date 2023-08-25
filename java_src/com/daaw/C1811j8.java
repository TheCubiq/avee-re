package com.daaw;

import com.daaw.AbstractC2057lm;
import java.util.Arrays;
import java.util.Objects;
/* renamed from: com.daaw.j8 */
/* loaded from: classes2.dex */
public final class C1811j8 extends AbstractC2057lm.AbstractC2063d.AbstractC2065b {

    /* renamed from: a */
    public final String f14517a;

    /* renamed from: b */
    public final byte[] f14518b;

    /* renamed from: com.daaw.j8$b */
    /* loaded from: classes2.dex */
    public static final class C1813b extends AbstractC2057lm.AbstractC2063d.AbstractC2065b.AbstractC2066a {

        /* renamed from: a */
        public String f14519a;

        /* renamed from: b */
        public byte[] f14520b;

        @Override // com.daaw.AbstractC2057lm.AbstractC2063d.AbstractC2065b.AbstractC2066a
        /* renamed from: a */
        public AbstractC2057lm.AbstractC2063d.AbstractC2065b mo16792a() {
            String str = "";
            if (this.f14519a == null) {
                str = " filename";
            }
            if (this.f14520b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C1811j8(this.f14519a, this.f14520b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2063d.AbstractC2065b.AbstractC2066a
        /* renamed from: b */
        public AbstractC2057lm.AbstractC2063d.AbstractC2065b.AbstractC2066a mo16791b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f14520b = bArr;
            return this;
        }

        @Override // com.daaw.AbstractC2057lm.AbstractC2063d.AbstractC2065b.AbstractC2066a
        /* renamed from: c */
        public AbstractC2057lm.AbstractC2063d.AbstractC2065b.AbstractC2066a mo16790c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f14519a = str;
            return this;
        }
    }

    public C1811j8(String str, byte[] bArr) {
        this.f14517a = str;
        this.f14518b = bArr;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2063d.AbstractC2065b
    /* renamed from: b */
    public byte[] mo16794b() {
        return this.f14518b;
    }

    @Override // com.daaw.AbstractC2057lm.AbstractC2063d.AbstractC2065b
    /* renamed from: c */
    public String mo16793c() {
        return this.f14517a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2057lm.AbstractC2063d.AbstractC2065b) {
            AbstractC2057lm.AbstractC2063d.AbstractC2065b abstractC2065b = (AbstractC2057lm.AbstractC2063d.AbstractC2065b) obj;
            if (this.f14517a.equals(abstractC2065b.mo16793c())) {
                if (Arrays.equals(this.f14518b, abstractC2065b instanceof C1811j8 ? ((C1811j8) abstractC2065b).f14518b : abstractC2065b.mo16794b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f14517a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14518b);
    }

    public String toString() {
        return "File{filename=" + this.f14517a + ", contents=" + Arrays.toString(this.f14518b) + "}";
    }
}
