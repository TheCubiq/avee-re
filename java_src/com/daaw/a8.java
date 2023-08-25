package com.daaw;

import com.daaw.ca;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class a8 extends ca {
    public final Iterable<by> a;
    public final byte[] b;

    /* loaded from: classes.dex */
    public static final class b extends ca.a {
        public Iterable<by> a;
        public byte[] b;

        @Override // com.daaw.ca.a
        public ca a() {
            String str = "";
            if (this.a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a8(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.ca.a
        public ca.a b(Iterable<by> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.a = iterable;
            return this;
        }

        @Override // com.daaw.ca.a
        public ca.a c(byte[] bArr) {
            this.b = bArr;
            return this;
        }
    }

    public a8(Iterable<by> iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // com.daaw.ca
    public Iterable<by> b() {
        return this.a;
    }

    @Override // com.daaw.ca
    public byte[] c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ca) {
            ca caVar = (ca) obj;
            if (this.a.equals(caVar.b())) {
                if (Arrays.equals(this.b, caVar instanceof a8 ? ((a8) caVar).b : caVar.c())) {
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
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
