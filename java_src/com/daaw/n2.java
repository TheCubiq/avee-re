package com.daaw;

import com.daaw.da1;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class n2 implements zz {
    public static final int[] j;
    public static final int m;
    public final byte[] a = new byte[1];
    public boolean b;
    public long c;
    public int d;
    public int e;
    public sm1 f;
    public boolean g;
    public static final e00 h = new a();
    public static final int[] i = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] k = sq1.D("#!AMR\n");
    public static final byte[] l = sq1.D("#!AMR-WB\n");

    /* loaded from: classes.dex */
    public static class a implements e00 {
        @Override // com.daaw.e00
        public zz[] a() {
            return new zz[]{new n2()};
        }
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        j = iArr;
        m = iArr[8];
    }

    @Override // com.daaw.zz
    public void a() {
    }

    public final int b(int i2) {
        if (g(i2)) {
            return this.b ? j[i2] : i[i2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw new tv0(sb.toString());
    }

    @Override // com.daaw.zz
    public boolean c(a00 a00Var) {
        return l(a00Var);
    }

    @Override // com.daaw.zz
    public int d(a00 a00Var, iy0 iy0Var) {
        if (a00Var.getPosition() != 0 || l(a00Var)) {
            j();
            return n(a00Var);
        }
        throw new tv0("Could not find AMR header.");
    }

    public final boolean e(int i2) {
        return !this.b && (i2 < 12 || i2 > 14);
    }

    @Override // com.daaw.zz
    public void f(long j2, long j3) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
    }

    public final boolean g(int i2) {
        return i2 >= 0 && i2 <= 15 && (h(i2) || e(i2));
    }

    public final boolean h(int i2) {
        return this.b && (i2 < 10 || i2 > 13);
    }

    @Override // com.daaw.zz
    public void i(d00 d00Var) {
        d00Var.d(new da1.b(-9223372036854775807L));
        this.f = d00Var.a(0, 1);
        d00Var.n();
    }

    public final void j() {
        if (this.g) {
            return;
        }
        this.g = true;
        boolean z = this.b;
        this.f.d(Format.t(null, z ? "audio/amr-wb" : "audio/3gpp", null, -1, m, 1, z ? 16000 : 8000, -1, null, null, 0, null));
    }

    public final boolean k(a00 a00Var, byte[] bArr) {
        a00Var.i();
        byte[] bArr2 = new byte[bArr.length];
        a00Var.k(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    public final boolean l(a00 a00Var) {
        int length;
        byte[] bArr = k;
        if (k(a00Var, bArr)) {
            this.b = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = l;
            if (!k(a00Var, bArr2)) {
                return false;
            }
            this.b = true;
            length = bArr2.length;
        }
        a00Var.j(length);
        return true;
    }

    public final int m(a00 a00Var) {
        a00Var.i();
        a00Var.k(this.a, 0, 1);
        byte b = this.a[0];
        if ((b & 131) <= 0) {
            return b((b >> 3) & 15);
        }
        throw new tv0("Invalid padding bits for frame header " + ((int) b));
    }

    public final int n(a00 a00Var) {
        if (this.e == 0) {
            try {
                int m2 = m(a00Var);
                this.d = m2;
                this.e = m2;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int b = this.f.b(a00Var, this.e, true);
        if (b == -1) {
            return -1;
        }
        int i2 = this.e - b;
        this.e = i2;
        if (i2 > 0) {
            return 0;
        }
        this.f.a(this.c, 1, this.d, 0, null);
        this.c += 20000;
        return 0;
    }
}
