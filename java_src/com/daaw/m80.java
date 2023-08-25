package com.daaw;

import android.util.Pair;
import com.daaw.eo1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;
/* loaded from: classes.dex */
public final class m80 implements InterfaceC3467wv {

    /* renamed from: n */
    public static final double[] f18583n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f18584a;

    /* renamed from: b */
    public sm1 f18585b;

    /* renamed from: c */
    public boolean f18586c;

    /* renamed from: d */
    public long f18587d;

    /* renamed from: e */
    public final boolean[] f18588e = new boolean[4];

    /* renamed from: f */
    public final C2157a f18589f = new C2157a(128);

    /* renamed from: g */
    public long f18590g;

    /* renamed from: h */
    public boolean f18591h;

    /* renamed from: i */
    public long f18592i;

    /* renamed from: j */
    public long f18593j;

    /* renamed from: k */
    public long f18594k;

    /* renamed from: l */
    public boolean f18595l;

    /* renamed from: m */
    public boolean f18596m;

    /* renamed from: com.daaw.m80$a */
    /* loaded from: classes.dex */
    public static final class C2157a {

        /* renamed from: e */
        public static final byte[] f18597e = {0, 0, 1};

        /* renamed from: a */
        public boolean f18598a;

        /* renamed from: b */
        public int f18599b;

        /* renamed from: c */
        public int f18600c;

        /* renamed from: d */
        public byte[] f18601d;

        public C2157a(int i) {
            this.f18601d = new byte[i];
        }

        /* renamed from: a */
        public void m16181a(byte[] bArr, int i, int i2) {
            if (this.f18598a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f18601d;
                int length = bArr2.length;
                int i4 = this.f18599b;
                if (length < i4 + i3) {
                    this.f18601d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f18601d, this.f18599b, i3);
                this.f18599b += i3;
            }
        }

        /* renamed from: b */
        public boolean m16180b(int i, int i2) {
            if (this.f18598a) {
                int i3 = this.f18599b - i2;
                this.f18599b = i3;
                if (this.f18600c != 0 || i != 181) {
                    this.f18598a = false;
                    return true;
                }
                this.f18600c = i3;
            } else if (i == 179) {
                this.f18598a = true;
            }
            byte[] bArr = f18597e;
            m16181a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m16179c() {
            this.f18598a = false;
            this.f18599b = 0;
            this.f18600c = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Format, Long> m16182f(C2157a c2157a, String str) {
        float f;
        int i;
        float f2;
        int i2;
        byte[] copyOf = Arrays.copyOf(c2157a.f18601d, c2157a.f18599b);
        int i3 = copyOf[5] & 255;
        int i4 = ((copyOf[4] & 255) << 4) | (i3 >> 4);
        int i5 = ((i3 & 15) << 8) | (copyOf[6] & 255);
        int i6 = (copyOf[7] & 240) >> 4;
        if (i6 == 2) {
            f = i5 * 4;
            i = i4 * 3;
        } else if (i6 == 3) {
            f = i5 * 16;
            i = i4 * 9;
        } else if (i6 != 4) {
            f2 = 1.0f;
            Format m1738H = Format.m1738H(str, "video/mpeg2", null, -1, -1, i4, i5, -1.0f, Collections.singletonList(copyOf), -1, f2, null);
            long j = 0;
            i2 = (copyOf[7] & 15) - 1;
            if (i2 >= 0) {
                double[] dArr = f18583n;
                if (i2 < dArr.length) {
                    double d = dArr[i2];
                    int i7 = c2157a.f18600c + 9;
                    int i8 = (copyOf[i7] & 96) >> 5;
                    int i9 = copyOf[i7] & 31;
                    if (i8 != i9) {
                        double d2 = i8;
                        Double.isNaN(d2);
                        double d3 = i9 + 1;
                        Double.isNaN(d3);
                        d *= (d2 + 1.0d) / d3;
                    }
                    j = (long) (1000000.0d / d);
                }
            }
            return Pair.create(m1738H, Long.valueOf(j));
        } else {
            f = i5 * x21.f31794H0;
            i = i4 * 100;
        }
        f2 = f / i;
        Format m1738H2 = Format.m1738H(str, "video/mpeg2", null, -1, -1, i4, i5, -1.0f, Collections.singletonList(copyOf), -1, f2, null);
        long j2 = 0;
        i2 = (copyOf[7] & 15) - 1;
        if (i2 >= 0) {
        }
        return Pair.create(m1738H2, Long.valueOf(j2));
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: a */
    public void mo1995a(rv0 rv0Var) {
        int m10917c = rv0Var.m10917c();
        int m10916d = rv0Var.m10916d();
        byte[] bArr = rv0Var.f25637a;
        this.f18590g += rv0Var.m10919a();
        this.f18585b.mo10157c(rv0Var, rv0Var.m10919a());
        while (true) {
            int m9976c = sr0.m9976c(bArr, m10917c, m10916d, this.f18588e);
            if (m9976c == m10916d) {
                break;
            }
            int i = m9976c + 3;
            int i2 = rv0Var.f25637a[i] & 255;
            if (!this.f18586c) {
                int i3 = m9976c - m10917c;
                if (i3 > 0) {
                    this.f18589f.m16181a(bArr, m10917c, m9976c);
                }
                if (this.f18589f.m16180b(i2, i3 < 0 ? -i3 : 0)) {
                    Pair<Format, Long> m16182f = m16182f(this.f18589f, this.f18584a);
                    this.f18585b.mo10156d((Format) m16182f.first);
                    this.f18587d = ((Long) m16182f.second).longValue();
                    this.f18586c = true;
                }
            }
            if (i2 == 0 || i2 == 179) {
                int i4 = m10916d - m9976c;
                if (this.f18591h && this.f18596m && this.f18586c) {
                    this.f18585b.mo10159a(this.f18594k, this.f18595l ? 1 : 0, ((int) (this.f18590g - this.f18593j)) - i4, i4, null);
                }
                boolean z = this.f18591h;
                if (!z || this.f18596m) {
                    this.f18593j = this.f18590g - i4;
                    long j = this.f18592i;
                    if (j == -9223372036854775807L) {
                        j = z ? this.f18594k + this.f18587d : 0L;
                    }
                    this.f18594k = j;
                    this.f18595l = false;
                    this.f18592i = -9223372036854775807L;
                    this.f18591h = true;
                }
                this.f18596m = i2 == 0;
            } else if (i2 == 184) {
                this.f18595l = true;
            }
            m10917c = i;
        }
        if (this.f18586c) {
            return;
        }
        this.f18589f.m16181a(bArr, m10917c, m10916d);
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: b */
    public void mo1994b() {
        sr0.m9978a(this.f18588e);
        this.f18589f.m16179c();
        this.f18590g = 0L;
        this.f18591h = false;
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: c */
    public void mo1993c() {
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: d */
    public void mo1992d(d00 d00Var, eo1.C1208d c1208d) {
        c1208d.m23336a();
        this.f18584a = c1208d.m23335b();
        this.f18585b = d00Var.mo11478a(c1208d.m23334c(), 2);
    }

    @Override // com.daaw.InterfaceC3467wv
    /* renamed from: e */
    public void mo1991e(long j, boolean z) {
        this.f18592i = j;
    }
}
