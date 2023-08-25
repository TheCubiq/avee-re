package com.daaw;

import com.daaw.sn1;
import java.util.Arrays;
import java.util.Objects;
/* renamed from: com.daaw.w9 */
/* loaded from: classes.dex */
public final class C3408w9 extends sn1 {

    /* renamed from: a */
    public final String f31050a;

    /* renamed from: b */
    public final byte[] f31051b;

    /* renamed from: c */
    public final cz0 f31052c;

    /* renamed from: com.daaw.w9$b */
    /* loaded from: classes.dex */
    public static final class C3410b extends sn1.AbstractC2958a {

        /* renamed from: a */
        public String f31053a;

        /* renamed from: b */
        public byte[] f31054b;

        /* renamed from: c */
        public cz0 f31055c;

        @Override // com.daaw.sn1.AbstractC2958a
        /* renamed from: a */
        public sn1 mo6333a() {
            String str = "";
            if (this.f31053a == null) {
                str = " backendName";
            }
            if (this.f31055c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C3408w9(this.f31053a, this.f31054b, this.f31055c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.sn1.AbstractC2958a
        /* renamed from: b */
        public sn1.AbstractC2958a mo6332b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f31053a = str;
            return this;
        }

        @Override // com.daaw.sn1.AbstractC2958a
        /* renamed from: c */
        public sn1.AbstractC2958a mo6331c(byte[] bArr) {
            this.f31054b = bArr;
            return this;
        }

        @Override // com.daaw.sn1.AbstractC2958a
        /* renamed from: d */
        public sn1.AbstractC2958a mo6330d(cz0 cz0Var) {
            Objects.requireNonNull(cz0Var, "Null priority");
            this.f31055c = cz0Var;
            return this;
        }
    }

    public C3408w9(String str, byte[] bArr, cz0 cz0Var) {
        this.f31050a = str;
        this.f31051b = bArr;
        this.f31052c = cz0Var;
    }

    @Override // com.daaw.sn1
    /* renamed from: b */
    public String mo6336b() {
        return this.f31050a;
    }

    @Override // com.daaw.sn1
    /* renamed from: c */
    public byte[] mo6335c() {
        return this.f31051b;
    }

    @Override // com.daaw.sn1
    /* renamed from: d */
    public cz0 mo6334d() {
        return this.f31052c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sn1) {
            sn1 sn1Var = (sn1) obj;
            if (this.f31050a.equals(sn1Var.mo6336b())) {
                if (Arrays.equals(this.f31051b, sn1Var instanceof C3408w9 ? ((C3408w9) sn1Var).f31051b : sn1Var.mo6335c()) && this.f31052c.equals(sn1Var.mo6334d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f31050a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f31051b)) * 1000003) ^ this.f31052c.hashCode();
    }
}
