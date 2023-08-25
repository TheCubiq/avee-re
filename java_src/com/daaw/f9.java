package com.daaw;

import com.daaw.ig0;
/* loaded from: classes2.dex */
public final class f9 extends ig0 {
    public final String a;
    public final String b;
    public final String c;
    public final bm1 d;
    public final ig0.b e;

    /* loaded from: classes2.dex */
    public static final class b extends ig0.a {
        public String a;
        public String b;
        public String c;
        public bm1 d;
        public ig0.b e;

        @Override // com.daaw.ig0.a
        public ig0 a() {
            return new f9(this.a, this.b, this.c, this.d, this.e);
        }

        @Override // com.daaw.ig0.a
        public ig0.a b(bm1 bm1Var) {
            this.d = bm1Var;
            return this;
        }

        @Override // com.daaw.ig0.a
        public ig0.a c(String str) {
            this.b = str;
            return this;
        }

        @Override // com.daaw.ig0.a
        public ig0.a d(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.ig0.a
        public ig0.a e(ig0.b bVar) {
            this.e = bVar;
            return this;
        }

        @Override // com.daaw.ig0.a
        public ig0.a f(String str) {
            this.a = str;
            return this;
        }
    }

    public f9(String str, String str2, String str3, bm1 bm1Var, ig0.b bVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bm1Var;
        this.e = bVar;
    }

    @Override // com.daaw.ig0
    public bm1 b() {
        return this.d;
    }

    @Override // com.daaw.ig0
    public String c() {
        return this.b;
    }

    @Override // com.daaw.ig0
    public String d() {
        return this.c;
    }

    @Override // com.daaw.ig0
    public ig0.b e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ig0) {
            ig0 ig0Var = (ig0) obj;
            String str = this.a;
            if (str != null ? str.equals(ig0Var.f()) : ig0Var.f() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(ig0Var.c()) : ig0Var.c() == null) {
                    String str3 = this.c;
                    if (str3 != null ? str3.equals(ig0Var.d()) : ig0Var.d() == null) {
                        bm1 bm1Var = this.d;
                        if (bm1Var != null ? bm1Var.equals(ig0Var.b()) : ig0Var.b() == null) {
                            ig0.b bVar = this.e;
                            ig0.b e = ig0Var.e();
                            if (bVar == null) {
                                if (e == null) {
                                    return true;
                                }
                            } else if (bVar.equals(e)) {
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
    public String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        bm1 bm1Var = this.d;
        int hashCode4 = (hashCode3 ^ (bm1Var == null ? 0 : bm1Var.hashCode())) * 1000003;
        ig0.b bVar = this.e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.a + ", fid=" + this.b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
