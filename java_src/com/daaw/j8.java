package com.daaw;

import com.daaw.lm;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class j8 extends lm.d.b {
    public final String a;
    public final byte[] b;

    /* loaded from: classes2.dex */
    public static final class b extends lm.d.b.a {
        public String a;
        public byte[] b;

        @Override // com.daaw.lm.d.b.a
        public lm.d.b a() {
            String str = "";
            if (this.a == null) {
                str = " filename";
            }
            if (this.b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new j8(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.lm.d.b.a
        public lm.d.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.b = bArr;
            return this;
        }

        @Override // com.daaw.lm.d.b.a
        public lm.d.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.a = str;
            return this;
        }
    }

    public j8(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // com.daaw.lm.d.b
    public byte[] b() {
        return this.b;
    }

    @Override // com.daaw.lm.d.b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lm.d.b) {
            lm.d.b bVar = (lm.d.b) obj;
            if (this.a.equals(bVar.c())) {
                if (Arrays.equals(this.b, bVar instanceof j8 ? ((j8) bVar).b : bVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
