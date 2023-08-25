package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* loaded from: classes.dex */
public interface sm1 {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.a = i;
            this.b = bArr;
            this.c = i2;
            this.d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.c == aVar.c && this.d == aVar.d && Arrays.equals(this.b, aVar.b);
        }

        public int hashCode() {
            return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
        }
    }

    void a(long j, int i, int i2, int i3, a aVar);

    int b(a00 a00Var, int i, boolean z);

    void c(rv0 rv0Var, int i);

    void d(Format format);
}
