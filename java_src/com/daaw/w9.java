package com.daaw;

import com.daaw.sn1;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class w9 extends sn1 {
    public final String a;
    public final byte[] b;
    public final cz0 c;

    /* loaded from: classes.dex */
    public static final class b extends sn1.a {
        public String a;
        public byte[] b;
        public cz0 c;

        @Override // com.daaw.sn1.a
        public sn1 a() {
            String str = "";
            if (this.a == null) {
                str = " backendName";
            }
            if (this.c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new w9(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.sn1.a
        public sn1.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.a = str;
            return this;
        }

        @Override // com.daaw.sn1.a
        public sn1.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }

        @Override // com.daaw.sn1.a
        public sn1.a d(cz0 cz0Var) {
            Objects.requireNonNull(cz0Var, "Null priority");
            this.c = cz0Var;
            return this;
        }
    }

    public w9(String str, byte[] bArr, cz0 cz0Var) {
        this.a = str;
        this.b = bArr;
        this.c = cz0Var;
    }

    @Override // com.daaw.sn1
    public String b() {
        return this.a;
    }

    @Override // com.daaw.sn1
    public byte[] c() {
        return this.b;
    }

    @Override // com.daaw.sn1
    public cz0 d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sn1) {
            sn1 sn1Var = (sn1) obj;
            if (this.a.equals(sn1Var.b())) {
                if (Arrays.equals(this.b, sn1Var instanceof w9 ? ((w9) sn1Var).b : sn1Var.c()) && this.c.equals(sn1Var.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
