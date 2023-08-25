package com.daaw;

import com.daaw.da1;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.util.Arrays;
/* renamed from: com.daaw.n2 */
/* loaded from: classes.dex */
public final class C2234n2 implements InterfaceC3919zz {

    /* renamed from: j */
    public static final int[] f19350j;

    /* renamed from: m */
    public static final int f19353m;

    /* renamed from: a */
    public final byte[] f19354a = new byte[1];

    /* renamed from: b */
    public boolean f19355b;

    /* renamed from: c */
    public long f19356c;

    /* renamed from: d */
    public int f19357d;

    /* renamed from: e */
    public int f19358e;

    /* renamed from: f */
    public sm1 f19359f;

    /* renamed from: g */
    public boolean f19360g;

    /* renamed from: h */
    public static final e00 f19348h = new C2235a();

    /* renamed from: i */
    public static final int[] f19349i = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: k */
    public static final byte[] f19351k = sq1.m10041D("#!AMR\n");

    /* renamed from: l */
    public static final byte[] f19352l = sq1.m10041D("#!AMR-WB\n");

    /* renamed from: com.daaw.n2$a */
    /* loaded from: classes.dex */
    public static class C2235a implements e00 {
        @Override // com.daaw.e00
        /* renamed from: a */
        public InterfaceC3919zz[] mo4824a() {
            return new InterfaceC3919zz[]{new C2234n2()};
        }
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f19350j = iArr;
        f19353m = iArr[8];
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: a */
    public void mo1762a() {
    }

    /* renamed from: b */
    public final int m15584b(int i) {
        if (m15582g(i)) {
            return this.f19355b ? f19350j[i] : f19349i[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.f19355b ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw new tv0(sb.toString());
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: c */
    public boolean mo1761c(a00 a00Var) {
        return m15578l(a00Var);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: d */
    public int mo1760d(a00 a00Var, iy0 iy0Var) {
        if (a00Var.getPosition() != 0 || m15578l(a00Var)) {
            m15580j();
            return m15576n(a00Var);
        }
        throw new tv0("Could not find AMR header.");
    }

    /* renamed from: e */
    public final boolean m15583e(int i) {
        return !this.f19355b && (i < 12 || i > 14);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: f */
    public void mo1759f(long j, long j2) {
        this.f19356c = 0L;
        this.f19357d = 0;
        this.f19358e = 0;
    }

    /* renamed from: g */
    public final boolean m15582g(int i) {
        return i >= 0 && i <= 15 && (m15581h(i) || m15583e(i));
    }

    /* renamed from: h */
    public final boolean m15581h(int i) {
        return this.f19355b && (i < 10 || i > 13);
    }

    @Override // com.daaw.InterfaceC3919zz
    /* renamed from: i */
    public void mo1758i(d00 d00Var) {
        d00Var.mo11475d(new da1.C1069b(-9223372036854775807L));
        this.f19359f = d00Var.mo11478a(0, 1);
        d00Var.mo11470n();
    }

    /* renamed from: j */
    public final void m15580j() {
        if (this.f19360g) {
            return;
        }
        this.f19360g = true;
        boolean z = this.f19355b;
        this.f19359f.mo10156d(Format.m1723t(null, z ? "audio/amr-wb" : "audio/3gpp", null, -1, f19353m, 1, z ? 16000 : 8000, -1, null, null, 0, null));
    }

    /* renamed from: k */
    public final boolean m15579k(a00 a00Var, byte[] bArr) {
        a00Var.mo5858i();
        byte[] bArr2 = new byte[bArr.length];
        a00Var.mo5856k(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    /* renamed from: l */
    public final boolean m15578l(a00 a00Var) {
        int length;
        byte[] bArr = f19351k;
        if (m15579k(a00Var, bArr)) {
            this.f19355b = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f19352l;
            if (!m15579k(a00Var, bArr2)) {
                return false;
            }
            this.f19355b = true;
            length = bArr2.length;
        }
        a00Var.mo5857j(length);
        return true;
    }

    /* renamed from: m */
    public final int m15577m(a00 a00Var) {
        a00Var.mo5858i();
        a00Var.mo5856k(this.f19354a, 0, 1);
        byte b = this.f19354a[0];
        if ((b & 131) <= 0) {
            return m15584b((b >> 3) & 15);
        }
        throw new tv0("Invalid padding bits for frame header " + ((int) b));
    }

    /* renamed from: n */
    public final int m15576n(a00 a00Var) {
        if (this.f19358e == 0) {
            try {
                int m15577m = m15577m(a00Var);
                this.f19357d = m15577m;
                this.f19358e = m15577m;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int mo10158b = this.f19359f.mo10158b(a00Var, this.f19358e, true);
        if (mo10158b == -1) {
            return -1;
        }
        int i = this.f19358e - mo10158b;
        this.f19358e = i;
        if (i > 0) {
            return 0;
        }
        this.f19359f.mo10159a(this.f19356c, 1, this.f19357d, 0, null);
        this.f19356c += 20000;
        return 0;
    }
}
