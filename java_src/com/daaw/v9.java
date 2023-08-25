package com.daaw;

import com.daaw.bm1;
/* loaded from: classes2.dex */
public final class v9 extends bm1 {
    public final String a;
    public final long b;
    public final bm1.b c;

    /* loaded from: classes2.dex */
    public static final class b extends bm1.a {
        public String a;
        public Long b;
        public bm1.b c;

        @Override // com.daaw.bm1.a
        public bm1 a() {
            String str = "";
            if (this.b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new v9(this.a, this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.bm1.a
        public bm1.a b(bm1.b bVar) {
            this.c = bVar;
            return this;
        }

        @Override // com.daaw.bm1.a
        public bm1.a c(String str) {
            this.a = str;
            return this;
        }

        @Override // com.daaw.bm1.a
        public bm1.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    public v9(String str, long j, bm1.b bVar) {
        this.a = str;
        this.b = j;
        this.c = bVar;
    }

    @Override // com.daaw.bm1
    public bm1.b b() {
        return this.c;
    }

    @Override // com.daaw.bm1
    public String c() {
        return this.a;
    }

    @Override // com.daaw.bm1
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bm1) {
            bm1 bm1Var = (bm1) obj;
            String str = this.a;
            if (str != null ? str.equals(bm1Var.c()) : bm1Var.c() == null) {
                if (this.b == bm1Var.d()) {
                    bm1.b bVar = this.c;
                    bm1.b b2 = bm1Var.b();
                    if (bVar == null) {
                        if (b2 == null) {
                            return true;
                        }
                    } else if (bVar.equals(b2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        bm1.b bVar = this.c;
        return i ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
