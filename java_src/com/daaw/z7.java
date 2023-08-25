package com.daaw;

import com.daaw.z2;
/* loaded from: classes.dex */
public final class z7 extends z2 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    /* loaded from: classes.dex */
    public static final class b extends z2.a {
        public Integer a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;

        @Override // com.daaw.z2.a
        public z2 a() {
            return new z7(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // com.daaw.z2.a
        public z2.a b(String str) {
            this.l = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a c(String str) {
            this.j = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a d(String str) {
            this.d = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a e(String str) {
            this.h = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a f(String str) {
            this.c = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a g(String str) {
            this.i = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a h(String str) {
            this.g = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a i(String str) {
            this.k = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a j(String str) {
            this.b = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a k(String str) {
            this.f = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a l(String str) {
            this.e = str;
            return this;
        }

        @Override // com.daaw.z2.a
        public z2.a m(Integer num) {
            this.a = num;
            return this;
        }
    }

    public z7(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    @Override // com.daaw.z2
    public String b() {
        return this.l;
    }

    @Override // com.daaw.z2
    public String c() {
        return this.j;
    }

    @Override // com.daaw.z2
    public String d() {
        return this.d;
    }

    @Override // com.daaw.z2
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            Integer num = this.a;
            if (num != null ? num.equals(z2Var.m()) : z2Var.m() == null) {
                String str = this.b;
                if (str != null ? str.equals(z2Var.j()) : z2Var.j() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(z2Var.f()) : z2Var.f() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(z2Var.d()) : z2Var.d() == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(z2Var.l()) : z2Var.l() == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(z2Var.k()) : z2Var.k() == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(z2Var.h()) : z2Var.h() == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(z2Var.e()) : z2Var.e() == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(z2Var.g()) : z2Var.g() == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(z2Var.c()) : z2Var.c() == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(z2Var.i()) : z2Var.i() == null) {
                                                        String str11 = this.l;
                                                        String b2 = z2Var.b();
                                                        if (str11 == null) {
                                                            if (b2 == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(b2)) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.daaw.z2
    public String f() {
        return this.c;
    }

    @Override // com.daaw.z2
    public String g() {
        return this.i;
    }

    @Override // com.daaw.z2
    public String h() {
        return this.g;
    }

    public int hashCode() {
        Integer num = this.a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // com.daaw.z2
    public String i() {
        return this.k;
    }

    @Override // com.daaw.z2
    public String j() {
        return this.b;
    }

    @Override // com.daaw.z2
    public String k() {
        return this.f;
    }

    @Override // com.daaw.z2
    public String l() {
        return this.e;
    }

    @Override // com.daaw.z2
    public Integer m() {
        return this.a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.d + ", product=" + this.e + ", osBuild=" + this.f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + ", locale=" + this.i + ", country=" + this.j + ", mccMnc=" + this.k + ", applicationBuild=" + this.l + "}";
    }
}
