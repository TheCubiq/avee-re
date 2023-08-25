package com.daaw;

import com.daaw.ig0;
/* renamed from: com.daaw.f9 */
/* loaded from: classes2.dex */
public final class C1261f9 extends ig0 {

    /* renamed from: a */
    public final String f9236a;

    /* renamed from: b */
    public final String f9237b;

    /* renamed from: c */
    public final String f9238c;

    /* renamed from: d */
    public final bm1 f9239d;

    /* renamed from: e */
    public final ig0.EnumC1703b f9240e;

    /* renamed from: com.daaw.f9$b */
    /* loaded from: classes2.dex */
    public static final class C1263b extends ig0.AbstractC1702a {

        /* renamed from: a */
        public String f9241a;

        /* renamed from: b */
        public String f9242b;

        /* renamed from: c */
        public String f9243c;

        /* renamed from: d */
        public bm1 f9244d;

        /* renamed from: e */
        public ig0.EnumC1703b f9245e;

        @Override // com.daaw.ig0.AbstractC1702a
        /* renamed from: a */
        public ig0 mo19834a() {
            return new C1261f9(this.f9241a, this.f9242b, this.f9243c, this.f9244d, this.f9245e);
        }

        @Override // com.daaw.ig0.AbstractC1702a
        /* renamed from: b */
        public ig0.AbstractC1702a mo19833b(bm1 bm1Var) {
            this.f9244d = bm1Var;
            return this;
        }

        @Override // com.daaw.ig0.AbstractC1702a
        /* renamed from: c */
        public ig0.AbstractC1702a mo19832c(String str) {
            this.f9242b = str;
            return this;
        }

        @Override // com.daaw.ig0.AbstractC1702a
        /* renamed from: d */
        public ig0.AbstractC1702a mo19831d(String str) {
            this.f9243c = str;
            return this;
        }

        @Override // com.daaw.ig0.AbstractC1702a
        /* renamed from: e */
        public ig0.AbstractC1702a mo19830e(ig0.EnumC1703b enumC1703b) {
            this.f9245e = enumC1703b;
            return this;
        }

        @Override // com.daaw.ig0.AbstractC1702a
        /* renamed from: f */
        public ig0.AbstractC1702a mo19829f(String str) {
            this.f9241a = str;
            return this;
        }
    }

    public C1261f9(String str, String str2, String str3, bm1 bm1Var, ig0.EnumC1703b enumC1703b) {
        this.f9236a = str;
        this.f9237b = str2;
        this.f9238c = str3;
        this.f9239d = bm1Var;
        this.f9240e = enumC1703b;
    }

    @Override // com.daaw.ig0
    /* renamed from: b */
    public bm1 mo19839b() {
        return this.f9239d;
    }

    @Override // com.daaw.ig0
    /* renamed from: c */
    public String mo19838c() {
        return this.f9237b;
    }

    @Override // com.daaw.ig0
    /* renamed from: d */
    public String mo19837d() {
        return this.f9238c;
    }

    @Override // com.daaw.ig0
    /* renamed from: e */
    public ig0.EnumC1703b mo19836e() {
        return this.f9240e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ig0) {
            ig0 ig0Var = (ig0) obj;
            String str = this.f9236a;
            if (str != null ? str.equals(ig0Var.mo19835f()) : ig0Var.mo19835f() == null) {
                String str2 = this.f9237b;
                if (str2 != null ? str2.equals(ig0Var.mo19838c()) : ig0Var.mo19838c() == null) {
                    String str3 = this.f9238c;
                    if (str3 != null ? str3.equals(ig0Var.mo19837d()) : ig0Var.mo19837d() == null) {
                        bm1 bm1Var = this.f9239d;
                        if (bm1Var != null ? bm1Var.equals(ig0Var.mo19839b()) : ig0Var.mo19839b() == null) {
                            ig0.EnumC1703b enumC1703b = this.f9240e;
                            ig0.EnumC1703b mo19836e = ig0Var.mo19836e();
                            if (enumC1703b == null) {
                                if (mo19836e == null) {
                                    return true;
                                }
                            } else if (enumC1703b.equals(mo19836e)) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.ig0
    /* renamed from: f */
    public String mo19835f() {
        return this.f9236a;
    }

    public int hashCode() {
        String str = this.f9236a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f9237b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f9238c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        bm1 bm1Var = this.f9239d;
        int hashCode4 = (hashCode3 ^ (bm1Var == null ? 0 : bm1Var.hashCode())) * 1000003;
        ig0.EnumC1703b enumC1703b = this.f9240e;
        return hashCode4 ^ (enumC1703b != null ? enumC1703b.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f9236a + ", fid=" + this.f9237b + ", refreshToken=" + this.f9238c + ", authToken=" + this.f9239d + ", responseCode=" + this.f9240e + "}";
    }
}
