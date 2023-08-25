package com.daaw;

import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* loaded from: classes.dex */
public interface sm1 {

    /* renamed from: com.daaw.sm1$a */
    /* loaded from: classes.dex */
    public static final class C2956a {

        /* renamed from: a */
        public final int f26412a;

        /* renamed from: b */
        public final byte[] f26413b;

        /* renamed from: c */
        public final int f26414c;

        /* renamed from: d */
        public final int f26415d;

        public C2956a(int i, byte[] bArr, int i2, int i3) {
            this.f26412a = i;
            this.f26413b = bArr;
            this.f26414c = i2;
            this.f26415d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C2956a.class != obj.getClass()) {
                return false;
            }
            C2956a c2956a = (C2956a) obj;
            return this.f26412a == c2956a.f26412a && this.f26414c == c2956a.f26414c && this.f26415d == c2956a.f26415d && Arrays.equals(this.f26413b, c2956a.f26413b);
        }

        public int hashCode() {
            return (((((this.f26412a * 31) + Arrays.hashCode(this.f26413b)) * 31) + this.f26414c) * 31) + this.f26415d;
        }
    }

    /* renamed from: a */
    void mo10159a(long j, int i, int i2, int i3, C2956a c2956a);

    /* renamed from: b */
    int mo10158b(a00 a00Var, int i, boolean z);

    /* renamed from: c */
    void mo10157c(rv0 rv0Var, int i);

    /* renamed from: d */
    void mo10156d(Format format);
}
