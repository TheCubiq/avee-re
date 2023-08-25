package com.daaw;

import com.daaw.bm1;
/* renamed from: com.daaw.v9 */
/* loaded from: classes2.dex */
public final class C3317v9 extends bm1 {

    /* renamed from: a */
    public final String f30042a;

    /* renamed from: b */
    public final long f30043b;

    /* renamed from: c */
    public final bm1.EnumC0873b f30044c;

    /* renamed from: com.daaw.v9$b */
    /* loaded from: classes2.dex */
    public static final class C3319b extends bm1.AbstractC0872a {

        /* renamed from: a */
        public String f30045a;

        /* renamed from: b */
        public Long f30046b;

        /* renamed from: c */
        public bm1.EnumC0873b f30047c;

        @Override // com.daaw.bm1.AbstractC0872a
        /* renamed from: a */
        public bm1 mo7323a() {
            String str = "";
            if (this.f30046b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C3317v9(this.f30045a, this.f30046b.longValue(), this.f30047c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.bm1.AbstractC0872a
        /* renamed from: b */
        public bm1.AbstractC0872a mo7322b(bm1.EnumC0873b enumC0873b) {
            this.f30047c = enumC0873b;
            return this;
        }

        @Override // com.daaw.bm1.AbstractC0872a
        /* renamed from: c */
        public bm1.AbstractC0872a mo7321c(String str) {
            this.f30045a = str;
            return this;
        }

        @Override // com.daaw.bm1.AbstractC0872a
        /* renamed from: d */
        public bm1.AbstractC0872a mo7320d(long j) {
            this.f30046b = Long.valueOf(j);
            return this;
        }
    }

    public C3317v9(String str, long j, bm1.EnumC0873b enumC0873b) {
        this.f30042a = str;
        this.f30043b = j;
        this.f30044c = enumC0873b;
    }

    @Override // com.daaw.bm1
    /* renamed from: b */
    public bm1.EnumC0873b mo7326b() {
        return this.f30044c;
    }

    @Override // com.daaw.bm1
    /* renamed from: c */
    public String mo7325c() {
        return this.f30042a;
    }

    @Override // com.daaw.bm1
    /* renamed from: d */
    public long mo7324d() {
        return this.f30043b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bm1) {
            bm1 bm1Var = (bm1) obj;
            String str = this.f30042a;
            if (str != null ? str.equals(bm1Var.mo7325c()) : bm1Var.mo7325c() == null) {
                if (this.f30043b == bm1Var.mo7324d()) {
                    bm1.EnumC0873b enumC0873b = this.f30044c;
                    bm1.EnumC0873b mo7326b = bm1Var.mo7326b();
                    if (enumC0873b == null) {
                        if (mo7326b == null) {
                            return true;
                        }
                    } else if (enumC0873b.equals(mo7326b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f30042a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f30043b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        bm1.EnumC0873b enumC0873b = this.f30044c;
        return i ^ (enumC0873b != null ? enumC0873b.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f30042a + ", tokenExpirationTimestamp=" + this.f30043b + ", responseCode=" + this.f30044c + "}";
    }
}
